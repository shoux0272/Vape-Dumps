/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField$Initializer;
import javassist.CtPrimitiveType;
import javassist.bytecode.Bytecode;
import javassist.bytecode.Descriptor;
import javassist.compiler.Javac;

class CtField$ArrayInitializer
extends CtField$Initializer {
    CtClass type;
    int size;

    CtField$ArrayInitializer(CtClass ctClass, int n6) {
        this.type = ctClass;
        this.size = n6;
    }

    private void addNewarray(Bytecode bytecode) {
        if (this.type.isPrimitive()) {
            bytecode.addNewarray(((CtPrimitiveType)this.type).getArrayType(), this.size);
        } else {
            bytecode.addAnewarray(this.type, this.size);
        }
    }

    @Override
    int compile(CtClass ctClass, String string, Bytecode bytecode, CtClass[] arrctClass, Javac javac) throws CannotCompileException {
        bytecode.addAload(0);
        this.addNewarray(bytecode);
        bytecode.addPutfield(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 2;
    }

    @Override
    int compileIfStatic(CtClass ctClass, String string, Bytecode bytecode, Javac javac) throws CannotCompileException {
        this.addNewarray(bytecode);
        bytecode.addPutstatic(Bytecode.THIS, string, Descriptor.of(ctClass));
        return 1;
    }
}

