/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$Initializer;
import javassist.bytecode.Bytecode;
import javassist.bytecode.Descriptor;
import javassist.compiler.Javac;

class CtField$MultiArrayInitializer
extends CtField$Initializer {
    CtClass type;
    int[] dim;

    CtField$MultiArrayInitializer(CtClass ctClass, int[] arrn) {
        this.type = ctClass;
        this.dim = arrn;
    }

    @Override
    void check(String string) throws CannotCompileException {
        if (string.charAt(0) != '[') {
            throw new CannotCompileException("type mismatch");
        }
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        bytecode.addAload(0);
        int n6 = bytecode.addMultiNewarray(ctClass, this.dim);
        bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
        return n6 + 1;
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        int n6 = bytecode.addMultiNewarray(ctClass, this.dim);
        bytecode.addPutstatic(Bytecode.THIS, string, Descriptor.of(ctClass));
        return n6;
    }
}

