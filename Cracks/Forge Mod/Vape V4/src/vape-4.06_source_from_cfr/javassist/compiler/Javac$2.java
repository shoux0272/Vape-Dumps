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
import javassist.compiler.ast.Symbol;

class Javac$2
implements ProceedHandler {
    final Javac this$0;
    private final String val$c;
    private final String val$m;

    Javac$2(Javac javac, String string, String string2) {
        this.this$0 = javac;
        this.val$c = string;
        this.val$m = string2;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        Expr expr = Expr.make(35, (ASTree)new Symbol(this.val$c), (ASTree)new Member(this.val$m));
        expr = CallExpr.makeCall(expr, aSTList);
        jvstCodeGen.compileExpr(expr);
        jvstCodeGen.addNullIfVoid();
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        Expr expr = Expr.make(35, (ASTree)new Symbol(this.val$c), (ASTree)new Member(this.val$m));
        expr = CallExpr.makeCall(expr, aSTList);
        expr.accept(jvstTypeChecker);
        jvstTypeChecker.addNullIfVoid();
    }
}

