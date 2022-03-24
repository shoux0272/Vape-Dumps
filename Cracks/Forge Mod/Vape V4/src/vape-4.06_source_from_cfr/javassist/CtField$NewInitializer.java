/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$Initializer;
import javassist.CtNewWrappedMethod;
import javassist.bytecode.Bytecode;
import javassist.bytecode.Descriptor;
import javassist.compiler.Javac;

class CtField$NewInitializer
extends CtField$Initializer {
    CtClass objectType;
    String[] stringParams;
    boolean withConstructorParams;

    CtField$NewInitializer() {
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        bytecode.addAload(0);
        bytecode.addNew(this.objectType);
        bytecode.add(89);
        bytecode.addAload(0);
        int n6 = this.stringParams == null ? 4 : this.compileStringParameter(bytecode) + 4;
        if (this.withConstructorParams) {
            n6 += CtNewWrappedMethod.compileParameterList(bytecode, arrctClass, 1);
        }
        bytecode.addInvokespecial(this.objectType, "<init>", this.getDescriptor());
        bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
        return n6;
    }

    private String getDescriptor() {
        String string = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)V";
        if (this.stringParams == null) {
            if (this.withConstructorParams) {
                return "(Ljava/lang/Object;[Ljava/lang/Object;)V";
            }
            return "(Ljava/lang/Object;)V";
        }
        if (this.withConstructorParams) {
            return "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)V";
        }
        return "(Ljava/lang/Object;[Ljava/lang/String;)V";
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        String string2;
        bytecode.addNew(this.objectType);
        bytecode.add(89);
        int n6 = 2;
        if (this.stringParams == null) {
            string2 = "()V";
        } else {
            string2 = "([Ljava/lang/String;)V";
            n6 += this.compileStringParameter(bytecode);
        }
        bytecode.addInvokespecial(this.objectType, "<init>", string2);
        bytecode.addPutstatic(Bytecode.THIS, string, Descriptor.of(ctClass));
        return n6;
    }

    protected final int compileStringParameter(Bytecode bytecode) throws CannotCompileException {
        int n6 = this.stringParams.length;
        bytecode.addIconst(n6);
        bytecode.addAnewarray("java.lang.String");
        for (int k = 0; k < n6; ++k) {
            bytecode.add(89);
            bytecode.addIconst(k);
            bytecode.addLdc(this.stringParams[k]);
            bytecode.add(83);
        }
        return 4;
    }
}

