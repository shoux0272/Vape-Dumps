/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.Visitor;

public class AssignExpr
extends Expr {
    private static final long serialVersionUID = 1L;

    private AssignExpr(int n6, ASTree aSTree, ASTList aSTList) {
        super(n6, aSTree, aSTList);
    }

    public static AssignExpr makeAssign(int n6, ASTree aSTree, ASTree aSTree2) {
        return new AssignExpr(n6, aSTree, new ASTList(aSTree2));
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atAssignExpr(this);
    }
}

