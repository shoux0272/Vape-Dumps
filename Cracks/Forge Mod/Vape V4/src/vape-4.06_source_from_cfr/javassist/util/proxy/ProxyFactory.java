/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandles;
import java.lang.ref.Reference;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.security.ProtectionDomain;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import javassist.CannotCompileException;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.DuplicateMemberException;
import javassist.bytecode.ExceptionsAttribute;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.SignatureAttribute;
import javassist.bytecode.StackMapTable$Writer;
import javassist.util.proxy.FactoryHelper;
import javassist.util.proxy.MethodFilter;
import javassist.util.proxy.MethodHandler;
import javassist.util.proxy.Proxy;
import javassist.util.proxy.ProxyFactory$1;
import javassist.util.proxy.ProxyFactory$2;
import javassist.util.proxy.ProxyFactory$3;
import javassist.util.proxy.ProxyFactory$ClassLoaderProvider;
import javassist.util.proxy.ProxyFactory$Find2MethodsArgs;
import javassist.util.proxy.ProxyFactory$ProxyDetails;
import javassist.util.proxy.ProxyFactory$UniqueName;
import javassist.util.proxy.ProxyObject;
import javassist.util.proxy.RuntimeSupport;
import javassist.util.proxy.SecurityActions;
import manthe.cy;

public class ProxyFactory {
    private Class<?> superClass = null;
    private Class<?>[] interfaces = null;
    private MethodFilter methodFilter = null;
    private MethodHandler handler = null;
    private List<Map.Entry<String, Method>> signatureMethods = null;
    private boolean hasGetHandler = false;
    private byte[] signature = null;
    private String classname;
    private String basename;
    private String superName;
    private Class<?> thisClass = null;
    private String genericSignature = null;
    private boolean factoryUseCache = useCache;
    private boolean factoryWriteReplace = useWriteReplace;
    public static boolean onlyPublicMethods = false;
    public String writeDirectory = null;
    private static final Class<?> OBJECT_TYPE = Object.class;
    private static final String HOLDER = "_methods_";
    private static final String HOLDER_TYPE = "[Ljava/lang/reflect/Method;";
    private static final String FILTER_SIGNATURE_FIELD = "_filter_signature";
    private static final String FILTER_SIGNATURE_TYPE = "[B";
    private static final String HANDLER = "handler";
    private static final String c = "a.DH";
    private static final String DEFAULT_INTERCEPTOR = "default_interceptor";
    private static final String HANDLER_TYPE = 'L' + MethodHandler.class.getName().replace('.', '/') + ';';
    private static final String HANDLER_SETTER = "setHandler";
    private static final String HANDLER_SETTER_TYPE = "(" + HANDLER_TYPE + ")V";
    private static final String HANDLER_GETTER = "getHandler";
    private static final String HANDLER_GETTER_TYPE = "()" + HANDLER_TYPE;
    private static final String SERIAL_VERSION_UID_FIELD = "serialVersionUID";
    private static final String SERIAL_VERSION_UID_TYPE = "J";
    private static final long SERIAL_VERSION_UID_VALUE = -1L;
    public static volatile boolean useCache = true;
    public static volatile boolean useWriteReplace = true;
    private static Map<ClassLoader, Map<String, ProxyFactory$ProxyDetails>> proxyCache = new WeakHashMap<ClassLoader, Map<String, ProxyFactory$ProxyDetails>>();
    private static char[] hexDigits = new char[]{'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
    public static ProxyFactory$ClassLoaderProvider classLoaderProvider = new ProxyFactory$1();
    public static ProxyFactory$UniqueName nameGenerator;
    private static final String packageForJavaBase = "javassist.util.proxy.";
    private static Comparator<Map.Entry<String, Method>> sorter;
    private static final String HANDLER_GETTER_KEY = "getHandler:()";
    private static cy[] m;

    public boolean isUseCache() {
        return this.factoryUseCache;
    }

    public void setUseCache(boolean bl) {
        if (this.handler != null && bl) {
            throw new RuntimeException("caching cannot be enabled if the factory default interceptor has been set");
        }
        this.factoryUseCache = bl;
    }

    public boolean isUseWriteReplace() {
        return this.factoryWriteReplace;
    }

    public void setUseWriteReplace(boolean bl) {
        this.factoryWriteReplace = bl;
    }

    public static boolean isProxyClass(Class<?> class_) {
        return Proxy.class.isAssignableFrom(class_);
    }

    public void setSuperclass(Class<?> class_) {
        this.superClass = class_;
        this.signature = null;
    }

    public Class<?> getSuperclass() {
        return this.superClass;
    }

    public void setInterfaces(Class<?>[] arrclass) {
        this.interfaces = arrclass;
        this.signature = null;
    }

    public Class<?>[] getInterfaces() {
        return this.interfaces;
    }

    public void setFilter(MethodFilter methodFilter) {
        this.methodFilter = methodFilter;
        this.signature = null;
    }

    public void setGenericSignature(String string) {
        this.genericSignature = string;
    }

    public Class<?> createClass() {
        if (this.signature == null) {
            this.computeSignature(this.methodFilter);
        }
        return this.createClass1(null);
    }

    public Class<?> createClass(MethodFilter methodFilter) {
        this.computeSignature(methodFilter);
        return this.createClass1(null);
    }

    Class<?> createClass(byte[] arrby) {
        this.installSignature(arrby);
        return this.createClass1(null);
    }

    public Class<?> createClass(MethodHandles.Lookup lookup) {
        if (this.signature == null) {
            this.computeSignature(this.methodFilter);
        }
        return this.createClass1(lookup);
    }

    public Class<?> createClass(MethodHandles.Lookup lookup, MethodFilter methodFilter) {
        this.computeSignature(methodFilter);
        return this.createClass1(lookup);
    }

    Class<?> createClass(MethodHandles.Lookup lookup, byte[] arrby) {
        this.installSignature(arrby);
        return this.createClass1(lookup);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private Class<?> createClass1(MethodHandles.Lookup lookup) {
        Class<?> class_ = this.thisClass;
        if (class_ == null) {
            ClassLoader classLoader = this.getClassLoader();
            Map<ClassLoader, Map<String, ProxyFactory$ProxyDetails>> map = proxyCache;
            synchronized (map) {
                if (this.factoryUseCache) {
                    this.createClass2(classLoader, lookup);
                } else {
                    this.createClass3(classLoader, lookup);
                }
                class_ = this.thisClass;
                this.thisClass = null;
            }
        }
        return class_;
    }

    public String getKey(Class<?> class_, Class<?>[] arrclass, byte[] arrby, boolean bl) {
        int n6;
        StringBuffer stringBuffer = new StringBuffer();
        if (class_ != null) {
            stringBuffer.append(class_.getName());
        }
        stringBuffer.append(":");
        for (n6 = 0; n6 < arrclass.length; ++n6) {
            stringBuffer.append(arrclass[n6].getName());
            stringBuffer.append(":");
        }
        for (n6 = 0; n6 < arrby.length; ++n6) {
            byte by = arrby[n6];
            int n10 = by & 0xF;
            int n11 = by >> 4 & 0xF;
            stringBuffer.append(hexDigits[n10]);
            stringBuffer.append(hexDigits[n11]);
        }
        if (bl) {
            stringBuffer.append(":w");
        }
        return stringBuffer.toString();
    }

    private void createClass2(ClassLoader classLoader, MethodHandles.Lookup lookup) {
        ProxyFactory$ProxyDetails proxyFactory$ProxyDetails;
        String string = this.getKey(this.superClass, this.interfaces, this.signature, this.factoryWriteReplace);
        Map<String, ProxyFactory$ProxyDetails> map = proxyCache.get(classLoader);
        if (map == null) {
            map = new HashMap<String, ProxyFactory$ProxyDetails>();
            proxyCache.put(classLoader, map);
        }
        if ((proxyFactory$ProxyDetails = map.get(string)) != null) {
            Reference<Class<?>> reference = proxyFactory$ProxyDetails.proxyClass;
            this.thisClass = reference.get();
            if (this.thisClass != null) {
                return;
            }
        }
        this.createClass3(classLoader, lookup);
        proxyFactory$ProxyDetails = new ProxyFactory$ProxyDetails(this.signature, this.thisClass, this.factoryWriteReplace);
        map.put(string, proxyFactory$ProxyDetails);
    }

    private void createClass3(ClassLoader classLoader, MethodHandles.Lookup lookup) {
        this.allocateClassName();
        try {
            ClassFile classFile = this.make();
            if (this.writeDirectory != null) {
                FactoryHelper.writeFile(classFile, this.writeDirectory);
            }
            this.thisClass = lookup == null ? FactoryHelper.toClass(classFile, this.getClassInTheSamePackage(), classLoader, this.getDomain()) : FactoryHelper.toClass(classFile, lookup);
            this.setField(FILTER_SIGNATURE_FIELD, this.signature);
            if (!this.factoryUseCache) {
                this.setField(DEFAULT_INTERCEPTOR, this.handler);
            }
        }
        catch (CannotCompileException cannotCompileException) {
            throw new RuntimeException(cannotCompileException.getMessage(), cannotCompileException);
        }
    }

    private Class<?> getClassInTheSamePackage() {
        if (this.basename.startsWith(packageForJavaBase)) {
            return this.getClass();
        }
        if (this.superClass != null && this.superClass != OBJECT_TYPE) {
            return this.superClass;
        }
        if (this.interfaces != null && this.interfaces.length > 0) {
            return this.interfaces[0];
        }
        return this.getClass();
    }

    private void setField(String string, Object object) {
        if (this.thisClass != null && object != null) {
            try {
                Field field = this.thisClass.getField(string);
                SecurityActions.setAccessible(field, true);
                field.set(null, object);
                SecurityActions.setAccessible(field, false);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        }
    }

    static byte[] getFilterSignature(Class<?> class_) {
        return (byte[])ProxyFactory.getField(class_, FILTER_SIGNATURE_FIELD);
    }

    private static Object getField(Class<?> class_, String string) {
        try {
            Field field = class_.getField(string);
            field.setAccessible(true);
            Object object = field.get(null);
            field.setAccessible(false);
            return object;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    public static MethodHandler getHandler(Proxy proxy) {
        try {
            Field field = proxy.getClass().getDeclaredField(HANDLER);
            field.setAccessible(true);
            Object object = field.get(proxy);
            field.setAccessible(false);
            return (MethodHandler)object;
        }
        catch (Exception exception) {
            throw new RuntimeException(exception);
        }
    }

    protected ClassLoader getClassLoader() {
        return classLoaderProvider.get(this);
    }

    protected ClassLoader getClassLoader0() {
        ClassLoader classLoader = null;
        if (this.superClass != null && !this.superClass.getName().equals("java.lang.Object")) {
            classLoader = this.superClass.getClassLoader();
        } else if (this.interfaces != null && this.interfaces.length > 0) {
            classLoader = this.interfaces[0].getClassLoader();
        }
        if (classLoader == null && (classLoader = this.getClass().getClassLoader()) == null && (classLoader = Thread.currentThread().getContextClassLoader()) == null) {
            classLoader = ClassLoader.getSystemClassLoader();
        }
        return classLoader;
    }

    protected ProtectionDomain getDomain() {
        Class<?> class_ = this.superClass != null && !this.superClass.getName().equals("java.lang.Object") ? this.superClass : (this.interfaces != null && this.interfaces.length > 0 ? this.interfaces[0] : this.getClass());
        return class_.getProtectionDomain();
    }

    public Object create(Class<?>[] arrclass, Object[] arrobject, MethodHandler methodHandler) throws NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Object object = this.create(arrclass, arrobject);
        ((Proxy)object).setHandler(methodHandler);
        return object;
    }

    public Object create(Class<?>[] arrclass, Object[] arrobject) throws NoSuchMethodException, IllegalArgumentException, InstantiationException, IllegalAccessException, InvocationTargetException {
        Class<?> class_ = this.createClass();
        Constructor<?> constructor = class_.getConstructor(arrclass);
        return constructor.newInstance(arrobject);
    }

    public void setHandler(MethodHandler methodHandler) {
        if (this.factoryUseCache && methodHandler != null) {
            this.factoryUseCache = false;
            this.thisClass = null;
        }
        this.handler = methodHandler;
        this.setField(DEFAULT_INTERCEPTOR, this.handler);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static String makeProxyName(String string) {
        ProxyFactory$UniqueName proxyFactory$UniqueName = nameGenerator;
        synchronized (proxyFactory$UniqueName) {
            return nameGenerator.get(string);
        }
    }

    private ClassFile make() throws CannotCompileException {
        Object object;
        FieldInfo fieldInfo;
        ClassFile classFile = new ClassFile(false, this.classname, this.superName);
        classFile.setAccessFlags(1);
        ProxyFactory.setInterfaces(classFile, this.interfaces, this.hasGetHandler ? Proxy.class : ProxyObject.class);
        ConstPool constPool = classFile.getConstPool();
        if (!this.factoryUseCache) {
            fieldInfo = new FieldInfo(constPool, DEFAULT_INTERCEPTOR, HANDLER_TYPE);
            fieldInfo.setAccessFlags(9);
            classFile.addField(fieldInfo);
        }
        fieldInfo = new FieldInfo(constPool, HANDLER, HANDLER_TYPE);
        fieldInfo.setAccessFlags(2);
        classFile.addField(fieldInfo);
        FieldInfo fieldInfo2 = new FieldInfo(constPool, FILTER_SIGNATURE_FIELD, FILTER_SIGNATURE_TYPE);
        fieldInfo2.setAccessFlags(9);
        classFile.addField(fieldInfo2);
        FieldInfo fieldInfo3 = new FieldInfo(constPool, SERIAL_VERSION_UID_FIELD, SERIAL_VERSION_UID_TYPE);
        fieldInfo3.setAccessFlags(25);
        classFile.addField(fieldInfo3);
        if (this.genericSignature != null) {
            object = new SignatureAttribute(constPool, this.genericSignature);
            classFile.addAttribute((AttributeInfo)object);
        }
        this.makeConstructors(this.classname, classFile, constPool, this.classname);
        object = new ArrayList();
        int n6 = this.overrideMethods(classFile, constPool, this.classname, (List<ProxyFactory$Find2MethodsArgs>)object);
        ProxyFactory.addClassInitializer(classFile, constPool, this.classname, n6, (List<ProxyFactory$Find2MethodsArgs>)object);
        ProxyFactory.addSetter(this.classname, classFile, constPool);
        if (!this.hasGetHandler) {
            ProxyFactory.addGetter(this.classname, classFile, constPool);
        }
        if (this.factoryWriteReplace) {
            try {
                classFile.addMethod(ProxyFactory.makeWriteReplace(constPool));
            }
            catch (DuplicateMemberException duplicateMemberException) {
                // empty catch block
            }
        }
        this.thisClass = null;
        return classFile;
    }

    private void checkClassAndSuperName() {
        if (this.interfaces == null) {
            this.interfaces = new Class[0];
        }
        if (this.superClass == null) {
            this.superClass = OBJECT_TYPE;
            this.superName = this.superClass.getName();
            this.basename = this.interfaces.length == 0 ? this.superName : this.interfaces[0].getName();
        } else {
            this.basename = this.superName = this.superClass.getName();
        }
        if (Modifier.isFinal(this.superClass.getModifiers())) {
            throw new RuntimeException(this.superName + " is final");
        }
        if (this.basename.startsWith("java.") || this.basename.startsWith("jdk.") || onlyPublicMethods) {
            this.basename = packageForJavaBase + this.basename.replace('.', '_');
        }
    }

    private void allocateClassName() {
        this.classname = ProxyFactory.makeProxyName(this.basename);
    }

    private void makeSortedMethodList() {
        this.checkClassAndSuperName();
        this.hasGetHandler = false;
        Map<String, Method> map = this.getMethods(this.superClass, this.interfaces);
        this.signatureMethods = new ArrayList<Map.Entry<String, Method>>(map.entrySet());
        Collections.sort(this.signatureMethods, sorter);
    }

    private void computeSignature(MethodFilter methodFilter) {
        this.makeSortedMethodList();
        int n6 = this.signatureMethods.size();
        int n10 = n6 + 7 >> 3;
        this.signature = new byte[n10];
        for (int k = 0; k < n6; ++k) {
            Method method = this.signatureMethods.get(k).getValue();
            int n11 = method.getModifiers();
            if (Modifier.isFinal(n11) || Modifier.isStatic(n11) || !ProxyFactory.isVisible(n11, this.basename, method) || methodFilter != null && !methodFilter.isHandled(method)) continue;
            this.setBit(this.signature, k);
        }
    }

    private void installSignature(byte[] arrby) {
        this.makeSortedMethodList();
        int n6 = this.signatureMethods.size();
        int n10 = n6 + 7 >> 3;
        if (arrby.length != n10) {
            throw new RuntimeException("invalid filter signature length for deserialized proxy class");
        }
        this.signature = arrby;
    }

    private boolean testBit(byte[] arrby, int n6) {
        int n10 = n6 >> 3;
        if (n10 > arrby.length) {
            return false;
        }
        byte by = arrby[n10];
        int n11 = n6 & 7;
        int n12 = 1 << n11;
        return (by & n12) != 0;
    }

    private void setBit(byte[] arrby, int n6) {
        int n10 = n6 >> 3;
        if (n10 < arrby.length) {
            int n11 = n6 & 7;
            int n12 = 1 << n11;
            byte by = arrby[n10];
            arrby[n10] = (byte)(by | n12);
        }
    }

    private static void setInterfaces(ClassFile classFile, Class<?>[] arrclass, Class<?> class_) {
        String[] arrstring;
        String string = class_.getName();
        if (arrclass == null || arrclass.length == 0) {
            arrstring = new String[]{string};
        } else {
            arrstring = new String[arrclass.length + 1];
            for (int k = 0; k < arrclass.length; ++k) {
                arrstring[k] = arrclass[k].getName();
            }
            arrstring[arrclass.length] = string;
        }
        classFile.setInterfaces(arrstring);
    }

    private static void addClassInitializer(ClassFile classFile, ConstPool constPool, String string, int n6, List<ProxyFactory$Find2MethodsArgs> list) throws CannotCompileException {
        FieldInfo fieldInfo = new FieldInfo(constPool, HOLDER, HOLDER_TYPE);
        fieldInfo.setAccessFlags(10);
        classFile.addField(fieldInfo);
        MethodInfo methodInfo = new MethodInfo(constPool, "<clinit>", "()V");
        methodInfo.setAccessFlags(8);
        ProxyFactory.setThrows(methodInfo, constPool, new Class[]{ClassNotFoundException.class});
        Bytecode bytecode = new Bytecode(constPool, 0, 2);
        bytecode.addIconst(n6 * 2);
        bytecode.addAnewarray("java.lang.reflect.Method");
        boolean bl = false;
        bytecode.addAstore(0);
        bytecode.addLdc(string);
        bytecode.addInvokestatic("java.lang.Class", "forName", "(Ljava/lang/String;)Ljava/lang/Class;");
        boolean bl2 = true;
        bytecode.addAstore(1);
        for (ProxyFactory$Find2MethodsArgs proxyFactory$Find2MethodsArgs : list) {
            ProxyFactory.callFind2Methods(bytecode, proxyFactory$Find2MethodsArgs.methodName, proxyFactory$Find2MethodsArgs.delegatorName, proxyFactory$Find2MethodsArgs.origIndex, proxyFactory$Find2MethodsArgs.descriptor, 1, 0);
        }
        bytecode.addAload(0);
        bytecode.addPutstatic(string, HOLDER, HOLDER_TYPE);
        bytecode.addLconst(-1L);
        bytecode.addPutstatic(string, SERIAL_VERSION_UID_FIELD, SERIAL_VERSION_UID_TYPE);
        bytecode.addOpcode(177);
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        classFile.addMethod(methodInfo);
    }

    private static void callFind2Methods(Bytecode bytecode, String string, String string2, int n6, String string3, int n10, int n11) {
        String string4 = RuntimeSupport.class.getName();
        String string5 = "(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;[Ljava/lang/reflect/Method;)V";
        bytecode.addAload(n10);
        bytecode.addLdc(string);
        if (string2 == null) {
            bytecode.addOpcode(1);
        } else {
            bytecode.addLdc(string2);
        }
        bytecode.addIconst(n6);
        bytecode.addLdc(string3);
        bytecode.addAload(n11);
        bytecode.addInvokestatic(string4, "find2Methods", string5);
    }

    private static void addSetter(String string, ClassFile classFile, ConstPool constPool) throws CannotCompileException {
        MethodInfo methodInfo = new MethodInfo(constPool, HANDLER_SETTER, HANDLER_SETTER_TYPE);
        methodInfo.setAccessFlags(1);
        Bytecode bytecode = new Bytecode(constPool, 2, 2);
        bytecode.addAload(0);
        bytecode.addAload(1);
        bytecode.addPutfield(string, HANDLER, HANDLER_TYPE);
        bytecode.addOpcode(177);
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        classFile.addMethod(methodInfo);
    }

    private static void addGetter(String string, ClassFile classFile, ConstPool constPool) throws CannotCompileException {
        MethodInfo methodInfo = new MethodInfo(constPool, HANDLER_GETTER, HANDLER_GETTER_TYPE);
        methodInfo.setAccessFlags(1);
        Bytecode bytecode = new Bytecode(constPool, 1, 1);
        bytecode.addAload(0);
        bytecode.addGetfield(string, HANDLER, HANDLER_TYPE);
        bytecode.addOpcode(176);
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        classFile.addMethod(methodInfo);
    }

    private int overrideMethods(ClassFile classFile, ConstPool constPool, String string, List<ProxyFactory$Find2MethodsArgs> list) throws CannotCompileException {
        String string2 = ProxyFactory.makeUniqueName("_d", this.signatureMethods);
        Iterator<Map.Entry<String, Method>> iterator = this.signatureMethods.iterator();
        int n6 = 0;
        while (iterator.hasNext()) {
            Map.Entry<String, Method> entry = iterator.next();
            if ((ClassFile.MAJOR_VERSION < 49 || !ProxyFactory.isBridge(entry.getValue())) && this.testBit(this.signature, n6)) {
                this.override(string, entry.getValue(), string2, n6, ProxyFactory.keyToDesc(entry.getKey(), entry.getValue()), classFile, constPool, list);
            }
            ++n6;
        }
        return n6;
    }

    private static boolean isBridge(Method method) {
        return method.isBridge();
    }

    private void override(String string, Method method, String string2, int n6, String string3, ClassFile classFile, ConstPool constPool, List<ProxyFactory$Find2MethodsArgs> list) throws CannotCompileException {
        MethodInfo methodInfo;
        Class<?> class_ = method.getDeclaringClass();
        String string4 = string2 + n6 + method.getName();
        if (Modifier.isAbstract(method.getModifiers())) {
            string4 = null;
        } else {
            methodInfo = this.makeDelegator(method, string3, constPool, class_, string4);
            methodInfo.setAccessFlags(methodInfo.getAccessFlags() & 0xFFFFFFBF);
            classFile.addMethod(methodInfo);
        }
        methodInfo = ProxyFactory.makeForwarder(string, method, string3, constPool, class_, string4, n6, list);
        classFile.addMethod(methodInfo);
    }

    private void makeConstructors(String string, ClassFile classFile, ConstPool constPool, String string2) throws CannotCompileException {
        Constructor<?>[] arrconstructor = SecurityActions.getDeclaredConstructors(this.superClass);
        boolean bl = !this.factoryUseCache;
        for (int k = 0; k < arrconstructor.length; ++k) {
            Constructor<?> constructor = arrconstructor[k];
            int n6 = constructor.getModifiers();
            if (Modifier.isFinal(n6) || Modifier.isPrivate(n6) || !ProxyFactory.isVisible(n6, this.basename, constructor)) continue;
            MethodInfo methodInfo = ProxyFactory.makeConstructor(string, constructor, constPool, this.superClass, bl);
            classFile.addMethod(methodInfo);
        }
    }

    private static String makeUniqueName(String string, List<Map.Entry<String, Method>> list) {
        if (ProxyFactory.makeUniqueName0(string, list.iterator())) {
            return string;
        }
        for (int k = 100; k < 999; ++k) {
            String string2 = string + k;
            if (!ProxyFactory.makeUniqueName0(string2, list.iterator())) continue;
            return string2;
        }
        throw new RuntimeException("cannot make a unique method name");
    }

    private static boolean makeUniqueName0(String string, Iterator<Map.Entry<String, Method>> iterator) {
        while (iterator.hasNext()) {
            if (!iterator.next().getKey().startsWith(string)) continue;
            return false;
        }
        return true;
    }

    private static boolean isVisible(int n6, String string, Member member) {
        if ((n6 & 2) != 0) {
            return false;
        }
        if ((n6 & 5) != 0) {
            return true;
        }
        String string2 = ProxyFactory.getPackageName(string);
        String string3 = ProxyFactory.getPackageName(member.getDeclaringClass().getName());
        if (string2 == null) {
            return string3 == null;
        }
        return string2.equals(string3);
    }

    private static String getPackageName(String string) {
        int n6 = string.lastIndexOf(46);
        if (n6 < 0) {
            return null;
        }
        return string.substring(0, n6);
    }

    private Map<String, Method> getMethods(Class<?> class_, Class<?>[] arrclass) {
        HashMap<String, Method> hashMap = new HashMap<String, Method>();
        HashSet hashSet = new HashSet();
        for (int k = 0; k < arrclass.length; ++k) {
            this.getMethods(hashMap, arrclass[k], hashSet);
        }
        this.getMethods(hashMap, class_, hashSet);
        return hashMap;
    }

    private void getMethods(Map<String, Method> map, Class<?> class_, Set<Class<?>> set) {
        if (!set.add(class_)) {
            return;
        }
        Class<?>[] arrclass = class_.getInterfaces();
        for (int k = 0; k < arrclass.length; ++k) {
            this.getMethods(map, arrclass[k], set);
        }
        Class<?> class_2 = class_.getSuperclass();
        if (class_2 != null) {
            this.getMethods(map, class_2, set);
        }
        Method[] arrmethod = SecurityActions.getDeclaredMethods(class_);
        for (int k = 0; k < arrmethod.length; ++k) {
            Method method;
            if (Modifier.isPrivate(arrmethod[k].getModifiers())) continue;
            Method method2 = arrmethod[k];
            String string = method2.getName() + ':' + RuntimeSupport.makeDescriptor(method2);
            if (string.startsWith(HANDLER_GETTER_KEY)) {
                this.hasGetHandler = true;
            }
            if (null != (method = map.put(string, method2)) && ProxyFactory.isBridge(method2) && !Modifier.isPublic(method.getDeclaringClass().getModifiers()) && !Modifier.isAbstract(method.getModifiers()) && !ProxyFactory.isDuplicated(k, arrmethod)) {
                map.put(string, method);
            }
            if (null == method || !Modifier.isPublic(method.getModifiers()) || Modifier.isPublic(method2.getModifiers())) continue;
            map.put(string, method);
        }
    }

    private static boolean isDuplicated(int n6, Method[] arrmethod) {
        String string = arrmethod[n6].getName();
        for (int k = 0; k < arrmethod.length; ++k) {
            if (k == n6 || !string.equals(arrmethod[k].getName()) || !ProxyFactory.areParametersSame(arrmethod[n6], arrmethod[k])) continue;
            return true;
        }
        return false;
    }

    private static boolean areParametersSame(Method method, Method method2) {
        Class<?>[] arrclass;
        Class<?>[] arrclass2 = method.getParameterTypes();
        if (arrclass2.length == (arrclass = method2.getParameterTypes()).length) {
            for (int k = 0; k < arrclass2.length; ++k) {
                if (arrclass2[k].getName().equals(arrclass[k].getName())) continue;
                return false;
            }
            return true;
        }
        return false;
    }

    private static String keyToDesc(String string, Method method) {
        return string.substring(string.indexOf(58) + 1);
    }

    private static MethodInfo makeConstructor(String string, Constructor<?> constructor, ConstPool constPool, Class<?> class_, boolean bl) {
        String string2 = RuntimeSupport.makeDescriptor(constructor.getParameterTypes(), Void.TYPE);
        MethodInfo methodInfo = new MethodInfo(constPool, "<init>", string2);
        methodInfo.setAccessFlags(1);
        ProxyFactory.setThrows(methodInfo, constPool, constructor.getExceptionTypes());
        Bytecode bytecode = new Bytecode(constPool, 0, 0);
        if (bl) {
            bytecode.addAload(0);
            bytecode.addGetstatic(string, DEFAULT_INTERCEPTOR, HANDLER_TYPE);
            bytecode.addPutfield(string, HANDLER, HANDLER_TYPE);
            bytecode.addGetstatic(string, DEFAULT_INTERCEPTOR, HANDLER_TYPE);
            bytecode.addOpcode(199);
            bytecode.addIndex(10);
        }
        bytecode.addAload(0);
        bytecode.addGetstatic(c, DEFAULT_INTERCEPTOR, HANDLER_TYPE);
        bytecode.addPutfield(string, HANDLER, HANDLER_TYPE);
        int n6 = bytecode.currentPc();
        bytecode.addAload(0);
        int n10 = ProxyFactory.addLoadParameters(bytecode, constructor.getParameterTypes(), 1);
        bytecode.addInvokespecial(class_.getName(), "<init>", string2);
        bytecode.addOpcode(177);
        bytecode.setMaxLocals(n10 + 1);
        CodeAttribute codeAttribute = bytecode.toCodeAttribute();
        methodInfo.setCodeAttribute(codeAttribute);
        StackMapTable$Writer stackMapTable$Writer = new StackMapTable$Writer(32);
        stackMapTable$Writer.sameFrame(n6);
        codeAttribute.setAttribute(stackMapTable$Writer.toStackMapTable(constPool));
        return methodInfo;
    }

    private MethodInfo makeDelegator(Method method, String string, ConstPool constPool, Class<?> class_, String string2) {
        MethodInfo methodInfo = new MethodInfo(constPool, string2, string);
        methodInfo.setAccessFlags(0x11 | method.getModifiers() & 0xFFFFFAD9);
        ProxyFactory.setThrows(methodInfo, constPool, method);
        Bytecode bytecode = new Bytecode(constPool, 0, 0);
        bytecode.addAload(0);
        int n6 = ProxyFactory.addLoadParameters(bytecode, method.getParameterTypes(), 1);
        Class<?> class_2 = this.invokespecialTarget(class_);
        bytecode.addInvokespecial(class_2.isInterface(), constPool.addClassInfo(class_2.getName()), method.getName(), string);
        ProxyFactory.addReturn(bytecode, method.getReturnType());
        bytecode.setMaxLocals(++n6);
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        return methodInfo;
    }

    private Class<?> invokespecialTarget(Class<?> class_) {
        if (class_.isInterface()) {
            for (Class<?> class_2 : this.interfaces) {
                if (!class_.isAssignableFrom(class_2)) continue;
                return class_2;
            }
        }
        return this.superClass;
    }

    private static MethodInfo makeForwarder(String string, Method method, String string2, ConstPool constPool, Class<?> class_, String string3, int n6, List<ProxyFactory$Find2MethodsArgs> list) {
        MethodInfo methodInfo = new MethodInfo(constPool, method.getName(), string2);
        methodInfo.setAccessFlags(0x10 | method.getModifiers() & 0xFFFFFADF);
        ProxyFactory.setThrows(methodInfo, constPool, method);
        int n10 = Descriptor.paramSize(string2);
        Bytecode bytecode = new Bytecode(constPool, 0, n10 + 2);
        int n11 = n6 * 2;
        int n12 = n6 * 2 + 1;
        int n13 = n10 + 1;
        bytecode.addGetstatic(string, HOLDER, HOLDER_TYPE);
        bytecode.addAstore(n13);
        list.add(new ProxyFactory$Find2MethodsArgs(method.getName(), string3, string2, n11));
        bytecode.addAload(0);
        bytecode.addGetfield(string, HANDLER, HANDLER_TYPE);
        bytecode.addAload(0);
        bytecode.addAload(n13);
        bytecode.addIconst(n11);
        bytecode.addOpcode(50);
        bytecode.addAload(n13);
        bytecode.addIconst(n12);
        bytecode.addOpcode(50);
        ProxyFactory.makeParameterList(bytecode, method.getParameterTypes());
        bytecode.addInvokeinterface(MethodHandler.class.getName(), "invoke", "(Ljava/lang/Object;Ljava/lang/reflect/Method;Ljava/lang/reflect/Method;[Ljava/lang/Object;)Ljava/lang/Object;", 5);
        Class<?> class_2 = method.getReturnType();
        ProxyFactory.addUnwrapper(bytecode, class_2);
        ProxyFactory.addReturn(bytecode, class_2);
        CodeAttribute codeAttribute = bytecode.toCodeAttribute();
        methodInfo.setCodeAttribute(codeAttribute);
        return methodInfo;
    }

    private static void setThrows(MethodInfo methodInfo, ConstPool constPool, Method method) {
        Class<?>[] arrclass = method.getExceptionTypes();
        ProxyFactory.setThrows(methodInfo, constPool, arrclass);
    }

    private static void setThrows(MethodInfo methodInfo, ConstPool constPool, Class<?>[] arrclass) {
        if (arrclass.length == 0) {
            return;
        }
        String[] arrstring = new String[arrclass.length];
        for (int k = 0; k < arrclass.length; ++k) {
            arrstring[k] = arrclass[k].getName();
        }
        ExceptionsAttribute exceptionsAttribute = new ExceptionsAttribute(constPool);
        exceptionsAttribute.setExceptions(arrstring);
        methodInfo.setExceptionsAttribute(exceptionsAttribute);
    }

    private static int addLoadParameters(Bytecode bytecode, Class<?>[] arrclass, int n6) {
        int n10 = 0;
        int n11 = arrclass.length;
        for (int k = 0; k < n11; ++k) {
            n10 += ProxyFactory.addLoad(bytecode, n10 + n6, arrclass[k]);
        }
        return n10;
    }

    private static int addLoad(Bytecode bytecode, int n6, Class<?> class_) {
        if (class_.isPrimitive()) {
            if (class_ == Long.TYPE) {
                bytecode.addLload(n6);
                return 2;
            }
            if (class_ == Float.TYPE) {
                bytecode.addFload(n6);
            } else {
                if (class_ == Double.TYPE) {
                    bytecode.addDload(n6);
                    return 2;
                }
                bytecode.addIload(n6);
            }
        } else {
            bytecode.addAload(n6);
        }
        return 1;
    }

    private static int addReturn(Bytecode bytecode, Class<?> class_) {
        if (class_.isPrimitive()) {
            if (class_ == Long.TYPE) {
                bytecode.addOpcode(173);
                return 2;
            }
            if (class_ == Float.TYPE) {
                bytecode.addOpcode(174);
            } else {
                if (class_ == Double.TYPE) {
                    bytecode.addOpcode(175);
                    return 2;
                }
                if (class_ == Void.TYPE) {
                    bytecode.addOpcode(177);
                    return 0;
                }
                bytecode.addOpcode(172);
            }
        } else {
            bytecode.addOpcode(176);
        }
        return 1;
    }

    private static void makeParameterList(Bytecode bytecode, Class<?>[] arrclass) {
        int n6 = 1;
        int n10 = arrclass.length;
        bytecode.addIconst(n10);
        bytecode.addAnewarray("java/lang/Object");
        for (int k = 0; k < n10; ++k) {
            bytecode.addOpcode(89);
            bytecode.addIconst(k);
            Class<?> class_ = arrclass[k];
            if (class_.isPrimitive()) {
                n6 = ProxyFactory.makeWrapper(bytecode, class_, n6);
            } else {
                bytecode.addAload(n6);
                ++n6;
            }
            bytecode.addOpcode(83);
        }
    }

    private static int makeWrapper(Bytecode bytecode, Class<?> class_, int n6) {
        int n10 = FactoryHelper.typeIndex(class_);
        String string = FactoryHelper.wrapperTypes[n10];
        bytecode.addNew(string);
        bytecode.addOpcode(89);
        ProxyFactory.addLoad(bytecode, n6, class_);
        bytecode.addInvokespecial(string, "<init>", FactoryHelper.wrapperDesc[n10]);
        return n6 + FactoryHelper.dataSize[n10];
    }

    private static void addUnwrapper(Bytecode bytecode, Class<?> class_) {
        if (class_.isPrimitive()) {
            if (class_ == Void.TYPE) {
                bytecode.addOpcode(87);
            } else {
                int n6 = FactoryHelper.typeIndex(class_);
                String string = FactoryHelper.wrapperTypes[n6];
                bytecode.addCheckcast(string);
                bytecode.addInvokevirtual(string, FactoryHelper.unwarpMethods[n6], FactoryHelper.unwrapDesc[n6]);
            }
        } else {
            bytecode.addCheckcast(class_.getName());
        }
    }

    private static MethodInfo makeWriteReplace(ConstPool constPool) {
        MethodInfo methodInfo = new MethodInfo(constPool, "writeReplace", "()Ljava/lang/Object;");
        String[] arrstring = new String[]{"java.io.ObjectStreamException"};
        ExceptionsAttribute exceptionsAttribute = new ExceptionsAttribute(constPool);
        exceptionsAttribute.setExceptions(arrstring);
        methodInfo.setExceptionsAttribute(exceptionsAttribute);
        Bytecode bytecode = new Bytecode(constPool, 0, 1);
        bytecode.addAload(0);
        bytecode.addInvokestatic(c, "makeSerializedProxy", "(Ljava/lang/Object;)La/od;");
        bytecode.addOpcode(176);
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        return methodInfo;
    }

    static {
        ProxyFactory.b(null);
        nameGenerator = new ProxyFactory$2();
        sorter = new ProxyFactory$3();
    }

    public static void b(cy[] arrcy) {
        m = arrcy;
    }

    public static cy[] g() {
        return m;
    }
}

