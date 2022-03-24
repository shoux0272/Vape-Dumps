/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.MethodInfo;

public class BadBytecode
extends Exception {
    private static final long serialVersionUID = 1L;

    public BadBytecode(int n6) {
        super("bytecode " + n6);
    }

    public BadBytecode(String string) {
        super(string);
    }

    public BadBytecode(String string, Throwable throwable) {
        super(string, throwable);
    }

    public BadBytecode(MethodInfo methodInfo, Throwable throwable) {
        super(methodInfo.toString() + " in " + methodInfo.getConstPool().getClassName() + ": " + throwable.getMessage(), throwable);
    }
}

