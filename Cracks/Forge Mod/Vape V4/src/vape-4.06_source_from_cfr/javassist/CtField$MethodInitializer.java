/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$NewInitializer;
import javassist.CtNewWrappedMethod;
import javassist.bytecode.Bytecode;
import javassist.bytecode.Descriptor;
import javassist.compiler.Javac;

class CtField$MethodInitializer
extends CtField$NewInitializer {
    String methodName;

    CtField$MethodInitializer() {
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        bytecode.addAload(0);
        bytecode.addAload(0);
        int n6 = this.stringParams == null ? 2 : this.compileStringParameter(bytecode) + 2;
        if (this.withConstructorParams) {
            n6 += CtNewWrappedMethod.compileParameterList(bytecode, arrctClass, 1);
        }
        String string2 = Descriptor.of(ctClass);
        String string3 = this.getDescriptor() + string2;
        bytecode.addInvokestatic(this.objectType, this.methodName, string3);
        bytecode.addPutfield(Bytecode.THIS, string, string2);
        return n6;
    }

    private String getDescriptor() {
        String string = "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)";
        if (this.stringParams == null) {
            if (this.withConstructorParams) {
                return "(Ljava/lang/Object;[Ljava/lang/Object;)";
            }
            return "(Ljava/lang/Object;)";
        }
        if (this.withConstructorParams) {
            return "(Ljava/lang/Object;[Ljava/lang/String;[Ljava/lang/Object;)";
        }
        return "(Ljava/lang/Object;[Ljava/lang/String;)";
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        String string2;
        int n6 = 1;
        if (this.stringParams == null) {
            string2 = "()";
        } else {
            string2 = "([Ljava/lang/String;)";
            n6 += this.compileStringParameter(bytecode);
        }
        String string3 = Descriptor.of(ctClass);
        bytecode.addInvokestatic(this.objectType, this.methodName, string2 + string3);
        bytecode.addPutstatic(Bytecode.THIS, string, string3);
        return n6;
    }
}

