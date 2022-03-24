/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.rmi;

import java.lang.reflect.Method;
import java.util.Hashtable;
import java.util.Map;
import javassist.CannotCompileException;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtField;
import javassist.CtField$Initializer;
import javassist.CtMethod;
import javassist.CtMethod$ConstParameter;
import javassist.CtNewConstructor;
import javassist.CtNewMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.Translator;

public class StubGenerator
implements Translator {
    private static final String fieldImporter = "importer";
    private static final String fieldObjectId = "objectId";
    private static final String accessorObjectId = "_getObjectId";
    private static final String a = "a.bh";
    private ClassPool classPool;
    private Map<String, CtClass> proxyClasses = new Hashtable<String, CtClass>();
    private CtMethod c;
    private CtMethod h;
    private CtClass[] proxyConstructorParamTypes;
    private CtClass[] interfacesForProxy;
    private CtClass[] exceptionForProxy;

    @Override
    public void start(ClassPool classPool) throws NotFoundException {
        this.classPool = classPool;
        CtClass ctClass = classPool.get(a);
        this.c = ctClass.getDeclaredMethod("forward");
        this.h = ctClass.getDeclaredMethod("forwardStatic");
        this.proxyConstructorParamTypes = classPool.get(new String[]{"a.uB", "int"});
        this.interfacesForProxy = classPool.get(new String[]{"java.io.Serializable", "a.lE"});
        this.exceptionForProxy = new CtClass[]{classPool.get("a.v0")};
    }

    @Override
    public void onLoad(ClassPool classPool, String string) {
    }

    public boolean isProxyClass(String string) {
        return this.proxyClasses.get(string) != null;
    }

    public synchronized boolean makeProxyClass(Class<?> class_) throws CannotCompileException, NotFoundException {
        String string = class_.getName();
        if (this.proxyClasses.get(string) != null) {
            return false;
        }
        CtClass ctClass = this.produceProxyClass(this.classPool.get(string), class_);
        this.proxyClasses.put(string, ctClass);
        this.modifySuperclass(ctClass);
        return true;
    }

    private CtClass produceProxyClass(CtClass ctClass, Class<?> class_) throws CannotCompileException, NotFoundException {
        int n6 = ctClass.getModifiers();
        if (Modifier.isAbstract(n6) || Modifier.isNative(n6) || !Modifier.isPublic(n6)) {
            throw new CannotCompileException(ctClass.getName() + " must be public, non-native, and non-abstract.");
        }
        CtClass ctClass2 = this.classPool.makeClass(ctClass.getName(), ctClass.getSuperclass());
        ctClass2.setInterfaces(this.interfacesForProxy);
        CtField ctField = new CtField(this.classPool.get("a.uB"), fieldImporter, ctClass2);
        ctField.setModifiers(2);
        ctClass2.addField(ctField, CtField$Initializer.byParameter(0));
        ctField = new CtField(CtClass.intType, fieldObjectId, ctClass2);
        ctField.setModifiers(2);
        ctClass2.addField(ctField, CtField$Initializer.byParameter(1));
        ctClass2.addMethod(CtNewMethod.getter(accessorObjectId, ctField));
        ctClass2.addConstructor(CtNewConstructor.defaultConstructor(ctClass2));
        CtConstructor ctConstructor = CtNewConstructor.skeleton(this.proxyConstructorParamTypes, null, ctClass2);
        ctClass2.addConstructor(ctConstructor);
        try {
            this.addMethods(ctClass2, class_.getMethods());
            return ctClass2;
        }
        catch (SecurityException securityException) {
            throw new CannotCompileException(securityException);
        }
    }

    private CtClass toCtClass(Class<?> class_) throws NotFoundException {
        String string;
        if (!class_.isArray()) {
            string = class_.getName();
        } else {
            StringBuffer stringBuffer = new StringBuffer();
            do {
                stringBuffer.append("[]");
            } while ((class_ = class_.getComponentType()).isArray());
            stringBuffer.insert(0, class_.getName());
            string = stringBuffer.toString();
        }
        return this.classPool.get(string);
    }

    private CtClass[] toCtClass(Class<?>[] arrclass) throws NotFoundException {
        int n6 = arrclass.length;
        CtClass[] arrctClass = new CtClass[n6];
        for (int k = 0; k < n6; ++k) {
            arrctClass[k] = this.toCtClass(arrclass[k]);
        }
        return arrctClass;
    }

    private void addMethods(CtClass ctClass, Method[] arrmethod) throws CannotCompileException, NotFoundException {
        for (int k = 0; k < arrmethod.length; ++k) {
            Method method = arrmethod[k];
            int n6 = method.getModifiers();
            if (method.getDeclaringClass() == Object.class || Modifier.isFinal(n6)) continue;
            if (Modifier.isPublic(n6)) {
                CtMethod ctMethod = Modifier.isStatic(n6) ? this.h : this.c;
                CtMethod ctMethod2 = CtNewMethod.wrapped(this.toCtClass(method.getReturnType()), method.getName(), this.toCtClass(method.getParameterTypes()), this.exceptionForProxy, ctMethod, CtMethod$ConstParameter.integer(k), ctClass);
                ctMethod2.setModifiers(n6);
                ctClass.addMethod(ctMethod2);
                continue;
            }
            if (Modifier.isProtected(n6) || Modifier.isPrivate(n6)) continue;
            throw new CannotCompileException("the methods must be public, protected, or private.");
        }
    }

    private void modifySuperclass(CtClass ctClass) throws CannotCompileException, NotFoundException {
        CtClass ctClass2;
        while ((ctClass2 = ctClass.getSuperclass()) != null) {
            try {
                ctClass2.getDeclaredConstructor(null);
                break;
            }
            catch (NotFoundException notFoundException) {
                ctClass2.addConstructor(CtNewConstructor.defaultConstructor(ctClass2));
                ctClass = ctClass2;
            }
        }
    }
}

