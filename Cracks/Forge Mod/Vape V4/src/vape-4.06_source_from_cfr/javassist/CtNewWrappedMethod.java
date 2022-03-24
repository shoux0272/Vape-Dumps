/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.util.Map;
import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.CtClass;
import javassist.CtClassType;
import javassist.CtMember$Cache;
import javassist.CtMethod;
import javassist.CtMethod$ConstParameter;
import javassist.CtPrimitiveType;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.SyntheticAttribute;
import javassist.compiler.JvstCodeGen;

class CtNewWrappedMethod {
    private static final String addedWrappedMethod = "_added_m$";

    CtNewWrappedMethod() {
    }

    public static CtMethod wrapped(CtClass ctClass, String string, CtClass[] arrctClass, CtClass[] arrctClass2, CtMethod ctMethod, CtMethod$ConstParameter ctMethod$ConstParameter, CtClass ctClass2) throws CannotCompileException {
        CtMethod ctMethod2 = new CtMethod(ctClass, string, arrctClass, ctClass2);
        ctMethod2.setModifiers(ctMethod.getModifiers());
        try {
            ctMethod2.setExceptionTypes(arrctClass2);
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        Bytecode bytecode = CtNewWrappedMethod.makeBody(ctClass2, ctClass2.getClassFile2(), ctMethod, arrctClass, ctClass, ctMethod$ConstParameter);
        MethodInfo methodInfo = ctMethod2.getMethodInfo2();
        methodInfo.setCodeAttribute(bytecode.toCodeAttribute());
        return ctMethod2;
    }

    static Bytecode makeBody(CtClass ctClass, ClassFile classFile, CtMethod ctMethod, CtClass[] arrctClass, CtClass ctClass2, CtMethod$ConstParameter ctMethod$ConstParameter) throws CannotCompileException {
        boolean bl = Modifier.isStatic(ctMethod.getModifiers());
        Bytecode bytecode = new Bytecode(classFile.getConstPool(), 0, 0);
        int n6 = CtNewWrappedMethod.makeBody0(ctClass, classFile, ctMethod, bl, arrctClass, ctClass2, ctMethod$ConstParameter, bytecode);
        bytecode.setMaxStack(n6);
        bytecode.setMaxLocals(bl, arrctClass, 0);
        return bytecode;
    }

    protected static int makeBody0(CtClass ctClass, ClassFile classFile, CtMethod ctMethod, boolean bl, CtClass[] arrctClass, CtClass ctClass2, CtMethod$ConstParameter ctMethod$ConstParameter, Bytecode bytecode) throws CannotCompileException {
        String string;
        String string2;
        int n6;
        if (!(ctClass instanceof CtClassType)) {
            throw new CannotCompileException("bad declaring class" + ctClass.getName());
        }
        if (!bl) {
            bytecode.addAload(0);
        }
        int n10 = CtNewWrappedMethod.compileParameterList(bytecode, arrctClass, bl ? 0 : 1);
        if (ctMethod$ConstParameter == null) {
            n6 = 0;
            string2 = CtMethod$ConstParameter.defaultDescriptor();
        } else {
            n6 = ctMethod$ConstParameter.compile(bytecode);
            string2 = ctMethod$ConstParameter.descriptor();
        }
        CtNewWrappedMethod.checkSignature(ctMethod, string2);
        try {
            string = CtNewWrappedMethod.addBodyMethod((CtClassType)ctClass, classFile, ctMethod);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException(badBytecode);
        }
        if (bl) {
            bytecode.addInvokestatic(Bytecode.THIS, string, string2);
        } else {
            bytecode.addInvokespecial(Bytecode.THIS, string, string2);
        }
        CtNewWrappedMethod.compileReturn(bytecode, ctClass2);
        if (n10 < n6 + 2) {
            n10 = n6 + 2;
        }
        return n10;
    }

    private static void checkSignature(CtMethod ctMethod, String string) throws CannotCompileException {
        if (!string.equals(ctMethod.getMethodInfo2().getDescriptor())) {
            throw new CannotCompileException("wrapped method with a bad signature: " + ctMethod.getDeclaringClass().getName() + '.' + ctMethod.getName());
        }
    }

    private static String addBodyMethod(CtClassType ctClassType, ClassFile classFile, CtMethod ctMethod) throws BadBytecode, CannotCompileException {
        Map<CtMethod, String> map = ctClassType.getHiddenMethods();
        String string = map.get(ctMethod);
        if (string == null) {
            while (classFile.getMethod(string = addedWrappedMethod + ctClassType.getUniqueNumber()) != null) {
            }
            ClassMap classMap = new ClassMap();
            classMap.put(ctMethod.getDeclaringClass().getName(), ctClassType.getName());
            MethodInfo methodInfo = new MethodInfo(classFile.getConstPool(), string, ctMethod.getMethodInfo2(), classMap);
            int n6 = methodInfo.getAccessFlags();
            methodInfo.setAccessFlags(AccessFlag.setPrivate(n6));
            methodInfo.addAttribute(new SyntheticAttribute(classFile.getConstPool()));
            classFile.addMethod(methodInfo);
            map.put(ctMethod, string);
            CtMember$Cache ctMember$Cache = ctClassType.hasMemberCache();
            if (ctMember$Cache != null) {
                ctMember$Cache.addMethod(new CtMethod(methodInfo, ctClassType));
            }
        }
        return string;
    }

    static int compileParameterList(Bytecode bytecode, CtClass[] arrctClass, int n6) {
        return JvstCodeGen.compileParameterList(bytecode, arrctClass, n6);
    }

    private static void compileReturn(Bytecode bytecode, CtClass ctClass) {
        if (ctClass.isPrimitive()) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            if (ctPrimitiveType != CtClass.voidType) {
                String string = ctPrimitiveType.getWrapperName();
                bytecode.addCheckcast(string);
                bytecode.addInvokevirtual(string, ctPrimitiveType.getGetMethodName(), ctPrimitiveType.getGetMethodDescriptor());
            }
            bytecode.addOpcode(ctPrimitiveType.getReturnOp());
        } else {
            bytecode.addCheckcast(ctClass);
            bytecode.addOpcode(176);
        }
    }
}

