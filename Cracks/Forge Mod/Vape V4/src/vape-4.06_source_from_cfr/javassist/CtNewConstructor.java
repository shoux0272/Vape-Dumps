/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.ClassMap;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMember;
import javassist.CtMethod;
import javassist.CtMethod$ConstParameter;
import javassist.CtNewWrappedConstructor;
import javassist.NotFoundException;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ConstPool;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;

public class CtNewConstructor {
    public static final int PASS_NONE = 0;
    public static final int PASS_ARRAY = 1;
    public static final int PASS_PARAMS = 2;

    public static CtConstructor make(String string, CtClass ctClass) throws CannotCompileException {
        Javac javac = new Javac(ctClass);
        try {
            CtMember ctMember = javac.compile(string);
            if (ctMember instanceof CtConstructor) {
                return (CtConstructor)ctMember;
            }
        }
        catch (CompileError compileError) {
            throw new CannotCompileException(compileError);
        }
        throw new CannotCompileException("not a constructor");
    }

    public static CtConstructor make(CtClass[] arrctClass, CtClass[] arrctClass2, String string, CtClass ctClass) throws CannotCompileException {
        try {
            CtConstructor ctConstructor = new CtConstructor(arrctClass, ctClass);
            ctConstructor.setExceptionTypes(arrctClass2);
            ctConstructor.setBody(string);
            return ctConstructor;
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
    }

    public static CtConstructor copy(CtConstructor ctConstructor, CtClass ctClass, ClassMap classMap) throws CannotCompileException {
        return new CtConstructor(ctConstructor, ctClass, classMap);
    }

    public static CtConstructor defaultConstructor(CtClass ctClass) throws CannotCompileException {
        CtConstructor ctConstructor = new CtConstructor((CtClass[])null, ctClass);
        ConstPool constPool = ctClass.getClassFile2().getConstPool();
        Bytecode bytecode = new Bytecode(constPool, 1, 1);
        bytecode.addAload(0);
        try {
            bytecode.addInvokespecial(ctClass.getSuperclass(), "<init>", "()V");
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
        bytecode.add(177);
        ctConstructor.getMethodInfo2().setCodeAttribute(bytecode.toCodeAttribute());
        return ctConstructor;
    }

    public static CtConstructor skeleton(CtClass[] arrctClass, CtClass[] arrctClass2, CtClass ctClass) throws CannotCompileException {
        return CtNewConstructor.make(arrctClass, arrctClass2, 0, null, null, ctClass);
    }

    public static CtConstructor make(CtClass[] arrctClass, CtClass[] arrctClass2, CtClass ctClass) throws CannotCompileException {
        return CtNewConstructor.make(arrctClass, arrctClass2, 2, null, null, ctClass);
    }

    public static CtConstructor make(CtClass[] arrctClass, CtClass[] arrctClass2, int n6, CtMethod ctMethod, CtMethod$ConstParameter ctMethod$ConstParameter, CtClass ctClass) throws CannotCompileException {
        return CtNewWrappedConstructor.wrapped(arrctClass, arrctClass2, n6, ctMethod, ctMethod$ConstParameter, ctClass);
    }
}

