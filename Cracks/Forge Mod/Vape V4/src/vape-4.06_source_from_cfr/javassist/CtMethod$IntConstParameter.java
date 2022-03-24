/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtMethod$ConstParameter;
import javassist.bytecode.Bytecode;

class CtMethod$IntConstParameter
extends CtMethod$ConstParameter {
    int param;

    CtMethod$IntConstParameter(int n6) {
        this.param = n6;
    }

    @Override
    int compile(Bytecode bytecode) throws CannotCompileException {
        bytecode.addIconst(this.param);
        return 1;
    }

    @Override
    String descriptor() {
        return "([Ljava/lang/Object;I)Ljava/lang/Object;";
    }

    @Override
    String constDescriptor() {
        return "([Ljava/lang/Object;I)V";
    }
}

