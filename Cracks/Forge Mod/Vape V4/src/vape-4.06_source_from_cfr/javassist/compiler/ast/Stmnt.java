/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.TokenId;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Visitor;

public class Stmnt
extends ASTList
implements TokenId {
    private static final long serialVersionUID = 1L;
    protected int operatorId;

    public Stmnt(int n6, ASTree aSTree, ASTList aSTList) {
        super(aSTree, aSTList);
        this.operatorId = n6;
    }

    public Stmnt(int n6, ASTree aSTree) {
        super(aSTree);
        this.operatorId = n6;
    }

    public Stmnt(int n6) {
        this(n6, null);
    }

    public static Stmnt make(int n6, ASTree aSTree, ASTree aSTree2) {
        return new Stmnt(n6, aSTree, new ASTList(aSTree2));
    }

    public static Stmnt make(int n6, ASTree aSTree, ASTree aSTree2, ASTree aSTree3) {
        return new Stmnt(n6, aSTree, new ASTList(aSTree2, new ASTList(aSTree3)));
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atStmnt(this);
    }

    public int getOperator() {
        return this.operatorId;
    }

    @Override
    protected String getTag() {
        if (this.operatorId < 128) {
            return "stmnt:" + (char)this.operatorId;
        }
        return "stmnt:" + this.operatorId;
    }
}

