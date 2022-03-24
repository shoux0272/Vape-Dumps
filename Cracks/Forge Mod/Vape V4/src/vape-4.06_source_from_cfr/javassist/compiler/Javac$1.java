/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.bytecode.Bytecode;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.compiler.JvstCodeGen;
import javassist.compiler.JvstTypeChecker;
import javassist.compiler.ProceedHandler;
import javassist.compiler.ast.ASTList;
import javassist.compiler.ast.ASTree;
import javassist.compiler.ast.CallExpr;
import javassist.compiler.ast.Expr;
import javassist.compiler.ast.Member;

class Javac$1
implements ProceedHandler {
    final Javac this$0;
    private final String val$m;
    private final ASTree val$texpr;

    Javac$1(Javac javac, String string, ASTree aSTree) {
        this.this$0 = javac;
        this.val$m = string;
        this.val$texpr = aSTree;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        ASTree aSTree = new Member(this.val$m);
        if (this.val$texpr != null) {
            aSTree = Expr.make(46, this.val$texpr, aSTree);
        }
        aSTree = CallExpr.makeCall(aSTree, aSTList);
        jvstCodeGen.compileExpr(aSTree);
        jvstCodeGen.addNullIfVoid();
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        ASTree aSTree = new Member(this.val$m);
        if (this.val$texpr != null) {
            aSTree = Expr.make(46, this.val$texpr, aSTree);
        }
        aSTree = CallExpr.makeCall(aSTree, aSTList);
        ((ASTree)aSTree).accept(jvstTypeChecker);
        jvstTypeChecker.addNullIfVoid();
    }
}

