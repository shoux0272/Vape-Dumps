/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.NotFoundException;
import javassist.compiler.CompileError;

public class CannotCompileException
extends Exception {
    private static final long serialVersionUID = 1L;
    private Throwable myCause;
    private String message;

    @Override
    public synchronized Throwable getCause() {
        return this.myCause == this ? null : this.myCause;
    }

    @Override
    public synchronized Throwable initCause(Throwable throwable) {
        this.myCause = throwable;
        return this;
    }

    public String getReason() {
        if (this.message != null) {
            return this.message;
        }
        return this.toString();
    }

    public CannotCompileException(String string) {
        super(string);
        this.message = string;
        this.initCause(null);
    }

    public CannotCompileException(Throwable throwable) {
        super("by " + throwable.toString());
        this.message = null;
        this.initCause(throwable);
    }

    public CannotCompileException(String string, Throwable throwable) {
        this(string);
        this.initCause(throwable);
    }

    public CannotCompileException(NotFoundException notFoundException) {
        this("cannot find " + notFoundException.getMessage(), notFoundException);
    }

    public CannotCompileException(CompileError compileError) {
        this("[source error] " + compileError.getMessage(), compileError);
    }

    public CannotCompileException(ClassNotFoundException classNotFoundException, String string) {
        this("cannot find " + string, classNotFoundException);
    }

    public CannotCompileException(ClassFormatError classFormatError, String string) {
        this("invalid class format: " + string, classFormatError);
    }
}

