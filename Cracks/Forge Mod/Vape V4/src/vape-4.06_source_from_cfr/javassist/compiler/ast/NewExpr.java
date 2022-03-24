/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.TokenId;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.ArrayInit;
import javassist.compiler.ast.Visitor;

public class NewExpr
extends ASTList
implements TokenId {
    private static final long serialVersionUID = 1L;
    protected boolean newArray;
    protected int arrayType;

    public NewExpr(ASTList aSTList, ASTList aSTList2) {
        super(aSTList, new ASTList(aSTList2));
        this.newArray = false;
        this.arrayType = 307;
    }

    public NewExpr(int n6, ASTList aSTList, ArrayInit arrayInit) {
        super(null, new ASTList(aSTList));
        this.newArray = true;
        this.arrayType = n6;
        if (arrayInit != null) {
            NewExpr.append(this, arrayInit);
        }
    }

    public static NewExpr makeObjectArray(ASTList aSTList, ASTList aSTList2, ArrayInit arrayInit) {
        NewExpr newExpr = new NewExpr(aSTList, aSTList2);
        newExpr.newArray = true;
        if (arrayInit != null) {
            NewExpr.append(newExpr, arrayInit);
        }
        return newExpr;
    }

    public boolean isArray() {
        return this.newArray;
    }

    public int getArrayType() {
        return this.arrayType;
    }

    public ASTList getClassName() {
        return (ASTList)this.getLeft();
    }

    public ASTList getArguments() {
        return (ASTList)this.getRight().getLeft();
    }

    public ASTList getArraySize() {
        return this.getArguments();
    }

    public ArrayInit getInitializer() {
        ASTree aSTree = this.getRight().getRight();
        if (aSTree == null) {
            return null;
        }
        return (ArrayInit)aSTree.getLeft();
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atNewExpr(this);
    }

    @Override
    protected String getTag() {
        return this.newArray ? "new[]" : "new";
    }
}

