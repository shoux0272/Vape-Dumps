/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CodeConverter;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtField$Initializer;
import javassist.CtMethod;
import javassist.CtMethod$ConstParameter;
import javassist.CtNewMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.Translator;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.MethodInfo;
import javassist.tools.reflect.CannotReflectException;

public class Reflection
implements Translator {
    static final String classobjectField = "_classobject";
    static final String classobjectAccessor = "_getClass";
    static final String metaobjectField = "_metaobject";
    static final String metaobjectGetter = "_getMetaobject";
    static final String metaobjectSetter = "_setMetaobject";
    static final String readPrefix = "_r_";
    static final String writePrefix = "_w_";
    static final String e = "a.uf";
    static final String n = "a.AT";
    protected CtMethod g;
    protected CtMethod k;
    protected CtMethod j;
    protected CtMethod h;
    protected CtClass[] readParam;
    protected ClassPool classPool = null;
    protected CodeConverter converter = new CodeConverter();

    private boolean isExcluded(String string) {
        return string.startsWith("_m_") || string.equals(classobjectAccessor) || string.equals(metaobjectSetter) || string.equals(metaobjectGetter) || string.startsWith(readPrefix) || string.startsWith(writePrefix);
    }

    @Override
    public void start(ClassPool classPool) throws NotFoundException {
        this.classPool = classPool;
        String string = "javassist.tools.reflect.Sample is not found or broken.";
        try {
            CtClass ctClass = this.classPool.get("a.mC");
            this.rebuildClassFile(ctClass.getClassFile());
            this.g = ctClass.getDeclaredMethod("trap");
            this.k = ctClass.getDeclaredMethod("trapStatic");
            this.j = ctClass.getDeclaredMethod("trapRead");
            this.h = ctClass.getDeclaredMethod("trapWrite");
            this.readParam = new CtClass[]{this.classPool.get("java.lang.Object")};
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException("javassist.tools.reflect.Sample is not found or broken.");
        }
        catch (BadBytecode badBytecode) {
            throw new RuntimeException("javassist.tools.reflect.Sample is not found or broken.");
        }
    }

    @Override
    public void onLoad(ClassPool classPool, String string) throws CannotCompileException, NotFoundException {
        CtClass ctClass = classPool.get(string);
        ctClass.instrument(this.converter);
    }

    public boolean makeReflective(String string, String string2, String string3) throws CannotCompileException, NotFoundException {
        return this.makeReflective(this.classPool.get(string), this.classPool.get(string2), this.classPool.get(string3));
    }

    public boolean makeReflective(Class<?> class_, Class<?> class_2, Class<?> class_3) throws CannotCompileException, NotFoundException {
        return this.makeReflective(class_.getName(), class_2.getName(), class_3.getName());
    }

    public boolean makeReflective(CtClass ctClass, CtClass ctClass2, CtClass ctClass3) throws CannotCompileException, CannotReflectException, NotFoundException {
        if (ctClass.isInterface()) {
            throw new CannotReflectException("Cannot reflect an interface: " + ctClass.getName());
        }
        if (ctClass.subclassOf(this.classPool.get(n))) {
            throw new CannotReflectException("Cannot reflect a subclass of ClassMetaobject: " + ctClass.getName());
        }
        if (ctClass.subclassOf(this.classPool.get(e))) {
            throw new CannotReflectException("Cannot reflect a subclass of Metaobject: " + ctClass.getName());
        }
        this.registerReflectiveClass(ctClass);
        return this.modifyClassfile(ctClass, ctClass2, ctClass3);
    }

    private void registerReflectiveClass(CtClass ctClass) {
        CtField[] arrctField = ctClass.getDeclaredFields();
        for (int k = 0; k < arrctField.length; ++k) {
            CtField ctField = arrctField[k];
            int n6 = ctField.getModifiers();
            if ((n6 & 1) == 0 || (n6 & 0x10) != 0) continue;
            String string = ctField.getName();
            this.converter.replaceFieldRead(ctField, ctClass, readPrefix + string);
            this.converter.replaceFieldWrite(ctField, ctClass, writePrefix + string);
        }
    }

    private boolean modifyClassfile(CtClass ctClass, CtClass ctClass2, CtClass ctClass3) throws CannotCompileException, NotFoundException {
        CtField ctField;
        boolean bl;
        if (ctClass.getAttribute("Reflective") != null) {
            return false;
        }
        ctClass.setAttribute("Reflective", new byte[0]);
        CtClass ctClass4 = this.classPool.get("a.lF");
        boolean bl2 = bl = !ctClass.subtypeOf(ctClass4);
        if (bl) {
            ctClass.addInterface(ctClass4);
        }
        this.processMethods(ctClass, bl);
        this.processFields(ctClass);
        if (bl) {
            ctField = new CtField(this.classPool.get(e), metaobjectField, ctClass);
            ctField.setModifiers(4);
            ctClass.addField(ctField, CtField$Initializer.byNewWithParams(ctClass2));
            ctClass.addMethod(CtNewMethod.getter(metaobjectGetter, ctField));
            ctClass.addMethod(CtNewMethod.setter(metaobjectSetter, ctField));
        }
        ctField = new CtField(this.classPool.get(n), classobjectField, ctClass);
        ctField.setModifiers(10);
        ctClass.addField(ctField, CtField$Initializer.byNew(ctClass3, new String[]{ctClass.getName()}));
        ctClass.addMethod(CtNewMethod.getter(classobjectAccessor, ctField));
        return true;
    }

    private void processMethods(CtClass ctClass, boolean bl) throws CannotCompileException, NotFoundException {
        CtMethod[] arrctMethod = ctClass.getMethods();
        for (int k = 0; k < arrctMethod.length; ++k) {
            CtMethod ctMethod = arrctMethod[k];
            int n6 = ctMethod.getModifiers();
            if (!Modifier.isPublic(n6) || Modifier.isAbstract(n6)) continue;
            this.processMethods0(n6, ctClass, ctMethod, k, bl);
        }
    }

    private void processMethods0(int n6, CtClass ctClass, CtMethod ctMethod, int n10, boolean bl) throws CannotCompileException, NotFoundException {
        CtMethod ctMethod2;
        String string = ctMethod.getName();
        if (this.isExcluded(string)) {
            return;
        }
        if (ctMethod.getDeclaringClass() == ctClass) {
            if (Modifier.isNative(n6)) {
                return;
            }
            ctMethod2 = ctMethod;
            if (Modifier.isFinal(n6)) {
                ctMethod2.setModifiers(n6 &= 0xFFFFFFEF);
            }
        } else {
            if (Modifier.isFinal(n6)) {
                return;
            }
            ctMethod2 = CtNewMethod.delegator(this.findOriginal(ctMethod, bl), ctClass);
            ctMethod2.setModifiers(n6 &= 0xFFFFFEFF);
            ctClass.addMethod(ctMethod2);
        }
        ctMethod2.setName("_m_" + n10 + "_" + string);
        CtMethod ctMethod3 = Modifier.isStatic(n6) ? this.k : this.g;
        CtMethod ctMethod4 = CtNewMethod.wrapped(ctMethod.getReturnType(), string, ctMethod.getParameterTypes(), ctMethod.getExceptionTypes(), ctMethod3, CtMethod$ConstParameter.integer(n10), ctClass);
        ctMethod4.setModifiers(n6);
        ctClass.addMethod(ctMethod4);
    }

    private CtMethod findOriginal(CtMethod ctMethod, boolean bl) throws NotFoundException {
        if (bl) {
            return ctMethod;
        }
        String string = ctMethod.getName();
        CtMethod[] arrctMethod = ctMethod.getDeclaringClass().getDeclaredMethods();
        for (int k = 0; k < arrctMethod.length; ++k) {
            String string2 = arrctMethod[k].getName();
            if (!string2.endsWith(string) || !string2.startsWith("_m_") || !arrctMethod[k].getSignature().equals(ctMethod.getSignature())) continue;
            return arrctMethod[k];
        }
        return ctMethod;
    }

    private void processFields(CtClass ctClass) throws CannotCompileException, NotFoundException {
        CtField[] arrctField = ctClass.getDeclaredFields();
        for (int k = 0; k < arrctField.length; ++k) {
            CtField ctField = arrctField[k];
            int n6 = ctField.getModifiers();
            if ((n6 & 1) == 0 || (n6 & 0x10) != 0) continue;
            String string = ctField.getName();
            CtClass ctClass2 = ctField.getType();
            CtMethod ctMethod = CtNewMethod.wrapped(ctClass2, readPrefix + string, this.readParam, null, this.j, CtMethod$ConstParameter.string(string), ctClass);
            ctMethod.setModifiers(n6 |= 8);
            ctClass.addMethod(ctMethod);
            CtClass[] arrctClass = new CtClass[]{this.classPool.get("java.lang.Object"), ctClass2};
            ctMethod = CtNewMethod.wrapped(CtClass.voidType, writePrefix + string, arrctClass, null, this.h, CtMethod$ConstParameter.string(string), ctClass);
            ctMethod.setModifiers(n6);
            ctClass.addMethod(ctMethod);
        }
    }

    public void rebuildClassFile(ClassFile classFile) throws BadBytecode {
        if (ClassFile.MAJOR_VERSION < 50) {
            return;
        }
        for (MethodInfo methodInfo : classFile.getMethods()) {
            methodInfo.rebuildStackMap(this.classPool);
        }
    }
}

