/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTree;

public class NoFieldException
extends CompileError {
    private static final long serialVersionUID = 1L;
    private String fieldName;
    private ASTree expr;

    public NoFieldException(String string, ASTree aSTree) {
        super("no such field: " + string);
        this.fieldName = string;
        this.expr = aSTree;
    }

    public String getField() {
        return this.fieldName;
    }

    public ASTree getExpr() {
        return this.expr;
    }
}

