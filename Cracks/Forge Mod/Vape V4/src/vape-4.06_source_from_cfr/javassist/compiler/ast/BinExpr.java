/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.Visitor;

public class BinExpr
extends Expr {
    private static final long serialVersionUID = 1L;

    private BinExpr(int n6, ASTree aSTree, ASTList aSTList) {
        super(n6, aSTree, aSTList);
    }

    public static BinExpr makeBin(int n6, ASTree aSTree, ASTree aSTree2) {
        return new BinExpr(n6, aSTree, new ASTList(aSTree2));
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atBinExpr(this);
    }
}

