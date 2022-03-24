/*
 * Decompiled with CFR 0.150.
 */
package javassist;

public class NotFoundException
extends Exception {
    private static final long serialVersionUID = 1L;

    public NotFoundException(String string) {
        super(string);
    }

    public NotFoundException(String string, Exception exception) {
        super(string + " because of " + exception.toString());
    }
}

