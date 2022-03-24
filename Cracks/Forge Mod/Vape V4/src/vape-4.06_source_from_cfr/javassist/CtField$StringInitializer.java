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

class CtField$StringInitializer
extends CtField$Initializer {
    String value;

    CtField$StringInitializer(String string) {
        this.value = string;
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        bytecode.addAload(0);
        bytecode.addLdc(this.value);
        bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 2;
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        bytecode.addLdc(this.value);
        bytecode.addPutstatic(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 1;
    }

    @Override
    int getConstantValue(ConstPool constPool, CtClass ctClass) {
        if (ctClass.getName().equals("java.lang.String")) {
            return constPool.addStringInfo(this.value);
        }
        return 0;
    }
}

