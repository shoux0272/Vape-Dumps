/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CannotCompileException;
import javassist.CtMethod$IntConstParameter;
import javassist.CtMethod$LongConstParameter;
import javassist.CtMethod$StringConstParameter;
import javassist.bytecode.Bytecode;

public class CtMethod$ConstParameter {
    public static CtMethod$ConstParameter integer(int n6) {
        return new CtMethod$IntConstParameter(n6);
    }

    public static CtMethod$ConstParameter integer(long l) {
        return new CtMethod$LongConstParameter(l);
    }

    public static CtMethod$ConstParameter string(String string) {
        return new CtMethod$StringConstParameter(string);
    }

    CtMethod$ConstParameter() {
    }

    int compile(Bytecode bytecode) throws CannotCompileException {
        return 0;
    }

    String descriptor() {
        return CtMethod$ConstParameter.defaultDescriptor();
    }

    static String defaultDescriptor() {
        return "([Ljava/lang/Object;)Ljava/lang/Object;";
    }

    String constDescriptor() {
        return CtMethod$ConstParameter.defaultConstDescriptor();
    }

    static String defaultConstDescriptor() {
        return "([Ljava/lang/Object;)V";
    }
}

