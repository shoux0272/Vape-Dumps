/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.reflect;

import java.lang.reflect.InvocationTargetException;

public class CannotInvokeException
extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private Throwable err = null;

    public Throwable getReason() {
        return this.err;
    }

    public CannotInvokeException(String string) {
        super(string);
    }

    public CannotInvokeException(InvocationTargetException invocationTargetException) {
        super("by " + invocationTargetException.getTargetException().toString());
        this.err = invocationTargetException.getTargetException();
    }

    public CannotInvokeException(IllegalAccessException illegalAccessException) {
        super("by " + illegalAccessException.toString());
        this.err = illegalAccessException;
    }

    public CannotInvokeException(ClassNotFoundException classNotFoundException) {
        super("by " + classNotFoundException.toString());
        this.err = classNotFoundException;
    }
}

