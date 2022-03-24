/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler.ast;

import javassist.compiler.CompileError;
import javassist.compiler.MemberResolver$Method;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.Visitor;

public class CallExpr
extends Expr {
    private static final long serialVersionUID = 1L;
    private MemberResolver$Method method = null;

    private CallExpr(ASTree aSTree, ASTList aSTList) {
        super(67, aSTree, aSTList);
    }

    public void setMethod(MemberResolver$Method memberResolver$Method) {
        this.method = memberResolver$Method;
    }

    public MemberResolver$Method getMethod() {
        return this.method;
    }

    public static CallExpr makeCall(ASTree aSTree, ASTree aSTree2) {
        return new CallExpr(aSTree, new ASTList(aSTree2));
    }

    @Override
    public void accept(Visitor visitor) throws CompileError {
        visitor.atCallExpr(this);
    }
}

