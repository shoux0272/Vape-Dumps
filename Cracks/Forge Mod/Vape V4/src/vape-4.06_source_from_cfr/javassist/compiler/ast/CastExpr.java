/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.TokenId;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Visitor;

public class CastExpr
extends ASTList
implements TokenId {
    private static final long serialVersionUID = 1L;
    protected int castType;
    protected int arrayDim;

    public CastExpr(ASTList aSTList, int n6, ASTree aSTree) {
        super(aSTList, new ASTList(aSTree));
        this.castType = 307;
        this.arrayDim = n6;
    }

    public CastExpr(int n6, int n10, ASTree aSTree) {
        super(null, new ASTList(aSTree));
        this.castType = n6;
        this.arrayDim = n10;
    }

    public int getType() {
        return this.castType;
    }

    public int getArrayDim() {
        return this.arrayDim;
    }

    public ASTList getClassName() {
        return (ASTList)this.getLeft();
    }

    public ASTree getOprand() {
        return this.getRight().getLeft();
    }

    public void setOprand(ASTree aSTree) {
        this.getRight().setLeft(aSTree);
    }

    @Override
    public String getTag() {
        return "cast:" + this.castType + ":" + this.arrayDim;
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atCastExpr(this);
    }
}

