/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtMethod$ConstParameter;
import javassist.bytecode.Bytecode;

class CtMethod$StringConstParameter
extends CtMethod$ConstParameter {
    String param;

    CtMethod$StringConstParameter(String string) {
        this.param = string;
    }

    @Override
    int compile(Bytecode bytecode) throws CannotCompileException {
        bytecode.addLdc(this.param);
        return 1;
    }

    @Override
    String descriptor() {
        return "([Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;";
    }

    @Override
    String constDescriptor() {
        return "([Ljava/lang/Object;Ljava/lang/String;)V";
    }
}

