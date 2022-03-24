/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.web;

public class BadHttpRequest
extends Exception {
    private static final long serialVersionUID = 1L;
    private Exception e;

    public BadHttpRequest() {
        this.e = null;
    }

    public BadHttpRequest(Exception exception) {
        this.e = exception;
    }

    @Override
    public String toString() {
        if (this.e == null) {
            return super.toString();
        }
        return this.e.toString();
    }
}

