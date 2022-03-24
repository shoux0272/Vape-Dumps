/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtMethod$ConstParameter;
import javassist.bytecode.Bytecode;

class CtMethod$LongConstParameter
extends CtMethod$ConstParameter {
    long param;

    CtMethod$LongConstParameter(long l) {
        this.param = l;
    }

    @Override
    int compile(Bytecode bytecode) throws CannotCompileException {
        bytecode.addLconst(this.param);
        return 2;
    }

    @Override
    String descriptor() {
        return "([Ljava/lang/Object;J)Ljava/lang/Object;";
    }

    @Override
    String constDescriptor() {
        return "([Ljava/lang/Object;J)V";
    }
}

