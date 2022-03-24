/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.CtClass;
import javassist.CtField;
import javassist.CtMember;
import javassist.CtMethod;
import javassist.CtMethod$ConstParameter;
import javassist.CtNewWrappedMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ExceptionsAttribute;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.MethodInfo;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;

public class CtNewMethod {
    public static CtMethod make(String string, CtClass ctClass) throws CannotCompileException {
        return CtNewMethod.make(string, ctClass, null, null);
    }

    public static CtMethod make(String string, CtClass ctClass, String string2, String string3) throws CannotCompileException {
        Javac javac = new Javac(ctClass);
        try {
            CtMember ctMember;
            if (string3 != null) {
                javac.recordProceed(string2, string3);
            }
            if ((ctMember = javac.compile(string)) instanceof CtMethod) {
                return (CtMethod)ctMember;
            }
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        throw new CannotCompileException("not a method");
    }

    public static CtMethod make(CtClass ctClass, String string, CtClass[] arrctClass, CtClass[] arrctClass2, String string2, CtClass ctClass2) throws CannotCompileException {
        return CtNewMethod.make(1, ctClass, string, arrctClass, arrctClass2, string2, ctClass2);
    }

    public static CtMethod make(int n6, CtClass ctClass, String string, CtClass[] arrctClass, CtClass[] arrctClass2, String string2, CtClass ctClass2) throws CannotCompileException {
        try {
            CtMethod ctMethod = new CtMethod(ctClass, string, arrctClass, ctClass2);
            ctMethod.setModifiers(n6);
            ctMethod.setExceptionTypes(arrctClass2);
            ctMethod.setBody(string2);
            return ctMethod;
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
    }

    public static CtMethod copy(CtMethod ctMethod, CtClass ctClass, ClassMap classMap) throws CannotCompileException {
        return new CtMethod(ctMethod, ctClass, classMap);
    }

    public static CtMethod copy(CtMethod ctMethod, String string, CtClass ctClass, ClassMap classMap) throws CannotCompileException {
        CtMethod ctMethod2 = new CtMethod(ctMethod, ctClass, classMap);
        ctMethod2.setName(string);
        return ctMethod2;
    }

    public static CtMethod abstractMethod(CtClass ctClass, String string, CtClass[] arrctClass, CtClass[] arrctClass2, CtClass ctClass2) throws NotFoundException {
        CtMethod ctMethod = new CtMethod(ctClass, string, arrctClass, ctClass2);
        ctMethod.setExceptionTypes(arrctClass2);
        return ctMethod;
    }

    public static CtMethod getter(String string, CtField ctField) throws CannotCompileException {
        Object object;
        FieldInfo fieldInfo = ctField.getFieldInfo2();
        String string2 = fieldInfo.getDescriptor();
        String string3 = "()" + string2;
        ConstPool constPool = fieldInfo.getConstPool();
        MethodInfo methodInfo = new MethodInfo(constPool, string, string3);
        methodInfo.setAccessFlags(1);
        Bytecode bytecode = new Bytecode(constPool, 2, 1);
        try {
            object = fieldInfo.getName();
            if ((fieldInfo.getAccessFlags() & 8) == 0) {
                bytecode.addAload(0);
                bytecode.addGetfield(Bytecode.THIS, (String)object, string2);
            } else {
                bytecode.addGetstatic(Bytecode.THIS, (String)object, string2);
            }
            bytecode.addReturn(ctField.getType());
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        object = ctField.getDeclaringClass();
        return new CtMethod(methodInfo, (CtClass)object);
    }

    public static CtMethod setter(String string, CtField ctField) throws CannotCompileException {
        Object object;
        FieldInfo fieldInfo = ctField.getFieldInfo2();
        String string2 = fieldInfo.getDescriptor();
        String string3 = "(" + string2 + ")V";
        ConstPool constPool = fieldInfo.getConstPool();
        MethodInfo methodInfo = new MethodInfo(constPool, string, string3);
        methodInfo.setAccessFlags(1);
        Bytecode bytecode = new Bytecode(constPool, 3, 3);
        try {
            object = fieldInfo.getName();
            if ((fieldInfo.getAccessFlags() & 8) == 0) {
                bytecode.addAload(0);
                bytecode.addLoad(1, ctField.getType());
                bytecode.addPutfield(Bytecode.THIS, (String)object, string2);
            } else {
                bytecode.addLoad(1, ctField.getType());
                bytecode.addPutstatic(Bytecode.THIS, (String)object, string2);
            }
            bytecode.addReturn(null);
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        object = ctField.getDeclaringClass();
        return new CtMethod(methodInfo, (CtClass)object);
    }

    public static CtMethod delegator(CtMethod ctMethod, CtClass ctClass) throws CannotCompileException {
        try {
            return CtNewMethod.delegator0(ctMethod, ctClass);
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
    }

    private static CtMethod delegator0(CtMethod ctMethod, CtClass ctClass) throws CannotCompileException, NotFoundException {
        int n6;
        MethodInfo methodInfo = ctMethod.getMethodInfo2();
        String string = methodInfo.getName();
        String string2 = methodInfo.getDescriptor();
        ConstPool constPool = ctClass.getClassFile2().getConstPool();
        MethodInfo methodInfo2 = new MethodInfo(constPool, string, string2);
        methodInfo2.setAccessFlags(methodInfo.getAccessFlags());
        ExceptionsAttribute exceptionsAttribute = methodInfo.getExceptionsAttribute();
        if (exceptionsAttribute != null) {
            methodInfo2.setExceptionsAttribute((ExceptionsAttribute)exceptionsAttribute.copy(constPool, null));
        }
        Bytecode bytecode = new Bytecode(constPool, 0, 0);
        boolean bl = Modifier.isStatic(ctMethod.getModifiers());
        CtClass ctClass2 = ctMethod.getDeclaringClass();
        CtClass[] arrctClass = ctMethod.getParameterTypes();
        if (bl) {
            n6 = bytecode.addLoadParameters(arrctClass, 0);
            bytecode.addInvokestatic(ctClass2, string, string2);
        } else {
            bytecode.addLoad(0, ctClass2);
            n6 = bytecode.addLoadParameters(arrctClass, 1);
            bytecode.addInvokespecial(ctClass2, string, string2);
        }
        bytecode.addReturn(ctMethod.getReturnType());
        bytecode.setMaxLocals(++n6);
        bytecode.setMaxStack(n6 < 2 ? 2 : n6);
        methodInfo2.setCodeAttribute(bytecode.toCodeAttribute());
        return new CtMethod(methodInfo2, ctClass);
    }

    public static CtMethod wrapped(CtClass ctClass, String string, CtClass[] arrctClass, CtClass[] arrctClass2, CtMethod ctMethod, CtMethod$ConstParameter ctMethod$ConstParameter, CtClass ctClass2) throws CannotCompileException {
        return CtNewWrappedMethod.wrapped(ctClass, string, arrctClass, arrctClass2, ctMethod, ctMethod$ConstParameter, ctClass2);
    }
}

