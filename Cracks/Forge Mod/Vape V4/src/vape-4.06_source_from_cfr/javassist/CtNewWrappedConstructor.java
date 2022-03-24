/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtConstructor;
import javassist.CtMethod;
import javassist.CtMethod$ConstParameter;
import javassist.CtNewWrappedMethod;
import javassist.NotFoundException;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.Descriptor;

class CtNewWrappedConstructor
extends CtNewWrappedMethod {
    private static final int PASS_NONE = 0;
    private static final int PASS_PARAMS = 2;

    CtNewWrappedConstructor() {
    }

    public static CtConstructor wrapped(CtClass[] arrctClass, CtClass[] arrctClass2, int n6, CtMethod ctMethod, CtMethod$ConstParameter ctMethod$ConstParameter, CtClass ctClass) throws CannotCompileException {
        try {
            CtConstructor ctConstructor = new CtConstructor(arrctClass, ctClass);
            ctConstructor.setExceptionTypes(arrctClass2);
            Bytecode bytecode = CtNewWrappedConstructor.makeBody(ctClass, ctClass.getClassFile2(), n6, ctMethod, arrctClass, ctMethod$ConstParameter);
            ctConstructor.getMethodInfo2().setCodeAttribute(bytecode.toCodeAttribute());
            return ctConstructor;
        }
        catch (NotFoundException notFoundException) {
            throw new CannotCompileException(notFoundException);
        }
    }

    protected static Bytecode makeBody(CtClass ctClass, ClassFile classFile, int n6, CtMethod ctMethod, CtClass[] arrctClass, CtMethod$ConstParameter ctMethod$ConstParameter) throws CannotCompileException {
        int n10;
        int n11;
        int n12 = classFile.getSuperclassId();
        Bytecode bytecode = new Bytecode(classFile.getConstPool(), 0, 0);
        bytecode.setMaxLocals(false, arrctClass, 0);
        bytecode.addAload(0);
        if (n6 == 0) {
            n11 = 1;
            bytecode.addInvokespecial(n12, "<init>", "()V");
        } else if (n6 == 2) {
            n11 = bytecode.addLoadParameters(arrctClass, 1) + 1;
            bytecode.addInvokespecial(n12, "<init>", Descriptor.ofConstructor(arrctClass));
        } else {
            String string;
            n11 = CtNewWrappedConstructor.compileParameterList(bytecode, arrctClass, 1);
            if (ctMethod$ConstParameter == null) {
                n10 = 2;
                string = CtMethod$ConstParameter.defaultConstDescriptor();
            } else {
                n10 = ctMethod$ConstParameter.compile(bytecode) + 2;
                string = ctMethod$ConstParameter.constDescriptor();
            }
            if (n11 < n10) {
                n11 = n10;
            }
            bytecode.addInvokespecial(n12, "<init>", string);
        }
        if (ctMethod == null) {
            bytecode.add(177);
        } else {
            n10 = CtNewWrappedConstructor.makeBody0(ctClass, classFile, ctMethod, false, arrctClass, CtClass.voidType, ctMethod$ConstParameter, bytecode);
            if (n11 < n10) {
                n11 = n10;
            }
        }
        bytecode.setMaxStack(n11);
        return bytecode;
    }
}

