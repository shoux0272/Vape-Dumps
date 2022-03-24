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

class Instanceof$ProceedForInstanceof
implements ProceedHandler {
    int index;

    Instanceof$ProceedForInstanceof(int n6) {
        this.index = n6;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        if (jvstCodeGen.getMethodArgsLength(aSTList) != 1) {
            throw new CompileError("$proceed() cannot take more than one parameter for instanceof");
        }
        jvstCodeGen.atMethodArgs(aSTList, new int[1], new int[1], new String[1]);
        bytecode.addOpcode(193);
        bytecode.addIndex(this.index);
        jvstCodeGen.setType(CtClass.booleanType);
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        jvstTypeChecker.atMethodArgs(aSTList, new int[1], new int[1], new String[1]);
        jvstTypeChecker.setType(CtClass.booleanType);
    }
}

