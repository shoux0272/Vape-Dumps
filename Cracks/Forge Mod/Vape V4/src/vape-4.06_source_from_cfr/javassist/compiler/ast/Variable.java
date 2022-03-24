/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.Declarator;
import javassist.compiler.ast.Symbol;
import javassist.compiler.ast.Visitor;

public class Variable
extends Symbol {
    private static final long serialVersionUID = 1L;
    protected Declarator declarator;

    public Variable(String string, Declarator declarator) {
        super(string);
        this.declarator = declarator;
    }

    public Declarator getDeclarator() {
        return this.declarator;
    }

    @Override
    public String toString() {
        return this.identifier + ":" + this.declarator.getType();
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atVariable(this);
    }
}

