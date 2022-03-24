/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

public class CannotCreateException
extends Exception {
    private static final long serialVersionUID = 1L;

    public CannotCreateException(String string) {
        super(string);
    }

    public CannotCreateException(Exception exception) {
        super("by " + exception.toString());
    }
}

