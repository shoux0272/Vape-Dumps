/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.CastExpr;
import javassist.compiler.ast.Visitor;

public class InstanceOfExpr
extends CastExpr {
    private static final long serialVersionUID = 1L;

    public InstanceOfExpr(ASTList aSTList, int n6, ASTree aSTree) {
        super(aSTList, n6, aSTree);
    }

    public InstanceOfExpr(int n6, int n10, ASTree aSTree) {
        super(n6, n10, aSTree);
    }

    @Override
    public String getTag() {
        return "instanceof:" + this.castType + ":" + this.arrayDim;
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atInstanceOfExpr(this);
    }
}

