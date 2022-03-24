/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Visitor;

public class StringL
extends ASTree {
    private static final long serialVersionUID = 1L;
    protected String text;

    public StringL(String string) {
        this.text = string;
    }

    public String get() {
        return this.text;
    }

    @Override
    public String toString() {
        return "\"" + this.text + "\"";
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atStringL(this);
    }
}

