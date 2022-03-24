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

class NewArray$ProceedForArray
implements ProceedHandler {
    CtClass arrayType;
    int opcode;
    int index;
    int dimension;

    NewArray$ProceedForArray(CtClass ctClass, int n6, int n10, int n11) {
        this.arrayType = ctClass;
        this.opcode = n6;
        this.index = n10;
        this.dimension = n11;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        int n6 = jvstCodeGen.getMethodArgsLength(aSTList);
        if (n6 != this.dimension) {
            throw new CompileError("$proceed() with a wrong number of parameters");
        }
        jvstCodeGen.atMethodArgs(aSTList, new int[n6], new int[n6], new String[n6]);
        bytecode.addOpcode(this.opcode);
        if (this.opcode == 189) {
            bytecode.addIndex(this.index);
        } else if (this.opcode == 188) {
            bytecode.add(this.index);
        } else {
            bytecode.addIndex(this.index);
            bytecode.add(this.dimension);
            bytecode.growStack(1 - this.dimension);
        }
        jvstCodeGen.setType(this.arrayType);
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        jvstTypeChecker.setType(this.arrayType);
    }
}

