/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CtClass;
import javassist.bytecode.Bytecode;
import javassist.compiler.CompileError;
import javassist.compiler.JvstCodeGen;
import javassist.compiler.JvstTypeChecker;
import javassist.compiler.ProceedHandler;
import javassist.compiler.ast.ASTList;

class NewExpr$ProceedForNew
implements ProceedHandler {
    CtClass newType;
    int newIndex;
    int methodIndex;

    NewExpr$ProceedForNew(CtClass ctClass, int n6, int n10) {
        this.newType = ctClass;
        this.newIndex = n6;
        this.methodIndex = n10;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        bytecode.addOpcode(187);
        bytecode.addIndex(this.newIndex);
        bytecode.addOpcode(89);
        jvstCodeGen.atMethodCallCore(this.newType, "<init>", aSTList, false, true, -1, null);
        jvstCodeGen.setType(this.newType);
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        jvstTypeChecker.atMethodCallCore(this.newType, "<init>", aSTList);
        jvstTypeChecker.setType(this.newType);
    }
}

