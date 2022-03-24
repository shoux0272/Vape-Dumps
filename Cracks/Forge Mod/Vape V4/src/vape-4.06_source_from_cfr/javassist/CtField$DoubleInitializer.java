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

class CtField$DoubleInitializer
extends CtField$Initializer {
    double value;

    CtField$DoubleInitializer(double d10) {
        this.value = d10;
    }

    @Override
    void check(String string) throws CannotCompileException {
        if (!string.equals("D")) {
            throw new CannotCompileException("type mismatch");
        }
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        bytecode.addAload(0);
        bytecode.addLdc2w(this.value);
        bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 3;
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        bytecode.addLdc2w(this.value);
        bytecode.addPutstatic(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 2;
    }

    @Override
    int getConstantValue(ConstPool constPool, CtClass ctClass) {
        if (ctClass == CtClass.doubleType) {
            return constPool.addDoubleInfo(this.value);
        }
        return 0;
    }
}

