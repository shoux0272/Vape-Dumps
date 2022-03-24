/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.compiler.CompileError;
import javassist.compiler.Lex;

public class SyntaxError
extends CompileError {
    private static final long serialVersionUID = 1L;

    public SyntaxError(Lex lex) {
        super("syntax error near \"" + lex.getTextAround() + "\"", lex);
    }
}

