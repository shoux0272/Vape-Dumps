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

class Cast$ProceedForCast
implements ProceedHandler {
    int index;
    CtClass retType;

    Cast$ProceedForCast(int n6, CtClass ctClass) {
        this.index = n6;
        this.retType = ctClass;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        if (jvstCodeGen.getMethodArgsLength(aSTList) != 1) {
            throw new CompileError("$proceed() cannot take more than one parameter for cast");
        }
        jvstCodeGen.atMethodArgs(aSTList, new int[1], new int[1], new String[1]);
        bytecode.addOpcode(192);
        bytecode.addIndex(this.index);
        jvstCodeGen.setType(this.retType);
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        jvstTypeChecker.atMethodArgs(aSTList, new int[1], new int[1], new String[1]);
        jvstTypeChecker.setType(this.retType);
    }
}

