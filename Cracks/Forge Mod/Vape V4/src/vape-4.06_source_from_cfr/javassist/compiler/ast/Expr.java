/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.TokenId;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Visitor;

public class Expr
extends ASTList
implements TokenId {
    private static final long serialVersionUID = 1L;
    protected int operatorId;

    Expr(int n6, ASTree aSTree, ASTList aSTList) {
        super(aSTree, aSTList);
        this.operatorId = n6;
    }

    Expr(int n6, ASTree aSTree) {
        super(aSTree);
        this.operatorId = n6;
    }

    public static Expr make(int n6, ASTree aSTree, ASTree aSTree2) {
        return new Expr(n6, aSTree, new ASTList(aSTree2));
    }

    public static Expr make(int n6, ASTree aSTree) {
        return new Expr(n6, aSTree);
    }

    public int getOperator() {
        return this.operatorId;
    }

    public void setOperator(int n6) {
        this.operatorId = n6;
    }

    public ASTree oprand1() {
        return this.getLeft();
    }

    public void setOprand1(ASTree aSTree) {
        this.setLeft(aSTree);
    }

    public ASTree oprand2() {
        return this.getRight().getLeft();
    }

    public void setOprand2(ASTree aSTree) {
        this.getRight().setLeft(aSTree);
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atExpr(this);
    }

    public String getName() {
        int n6 = this.operatorId;
        if (n6 < 128) {
            return String.valueOf((char)n6);
        }
        if (350 <= n6 && n6 <= 371) {
            return opNames[n6 - 350];
        }
        if (n6 == 323) {
            return "instanceof";
        }
        return String.valueOf(n6);
    }

    @Override
    protected String getTag() {
        return "op:" + this.getName();
    }
}

