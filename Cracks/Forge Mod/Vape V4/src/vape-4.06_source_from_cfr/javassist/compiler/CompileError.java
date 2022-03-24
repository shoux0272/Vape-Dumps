/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.CannotCompileException;
import javassist.NotFoundException;
import javassist.compiler.Lex;
import manthe.cy;

public class CompileError
extends Exception {
    private static final long serialVersionUID = 1L;
    private Lex lex;
    private String reason;
    private static cy[] c;

    public CompileError(String string, Lex lex) {
        this.reason = string;
        this.lex = lex;
    }

    public CompileError(String string) {
        this.reason = string;
        this.lex = null;
    }

    public CompileError(CannotCompileException cannotCompileException) {
        this(cannotCompileException.getReason());
    }

    public CompileError(NotFoundException notFoundException) {
        this("cannot find " + notFoundException.getMessage());
    }

    public Lex getLex() {
        return this.lex;
    }

    @Override
    public String getMessage() {
        return this.reason;
    }

    @Override
    public String toString() {
        return "compile error: " + this.reason;
    }

    public static void b(cy[] arrcy) {
        c = arrcy;
    }

    public static cy[] b() {
        return c;
    }

    static {
        if (CompileError.b() == null) {
            CompileError.b(new cy[1]);
        }
    }
}

