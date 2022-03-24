/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

public class NoSuchClassError
extends Error {
    private static final long serialVersionUID = 1L;
    private String className;

    public NoSuchClassError(String string, Error error) {
        super(error.toString(), error);
        this.className = string;
    }

    public String getClassName() {
        return this.className;
    }
}

