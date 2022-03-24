/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$Initializer;
import javassist.bytecode.Bytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.compiler.Javac;

class CtField$IntInitializer
extends CtField$Initializer {
    int value;

    CtField$IntInitializer(int n6) {
        this.value = n6;
    }

    @Override
    void check(String string) throws CannotCompileException {
        char c3 = string.charAt(0);
        if (c3 != 'I' && c3 != 'S' && c3 != 'B' && c3 != 'C' && c3 != 'Z') {
            throw new CannotCompileException("type mismatch");
        }
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        bytecode.addAload(0);
        bytecode.addIconst(this.value);
        bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 2;
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        bytecode.addIconst(this.value);
        bytecode.addPutstatic(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 1;
    }

    @Override
    int getConstantValue(ConstPool constPool, CtClass ctClass) {
        return constPool.addIntegerInfo(this.value);
    }
}

