/*
 * Decompiled with CFR 0.150.
 */
package javassist.expr;

import javassist.CtClass;
import javassist.CtPrimitiveType;
import javassist.bytecode.Bytecode;
import javassist.compiler.CompileError;
import javassist.compiler.JvstCodeGen;
import javassist.compiler.JvstTypeChecker;
import javassist.compiler.ProceedHandler;
import javassist.compiler.ast.ASTList;
import javassist.expr.FieldAccess;

class FieldAccess$ProceedForWrite
implements ProceedHandler {
    CtClass fieldType;
    int opcode;
    int targetVar;
    int index;

    FieldAccess$ProceedForWrite(CtClass ctClass, int n6, int n10, int n11) {
        this.fieldType = ctClass;
        this.targetVar = n11;
        this.opcode = n6;
        this.index = n10;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        int n6;
        if (jvstCodeGen.getMethodArgsLength(aSTList) != 1) {
            throw new CompileError("$proceed() cannot take more than one parameter for field writing");
        }
        if (FieldAccess.isStatic(this.opcode)) {
            n6 = 0;
        } else {
            n6 = -1;
            bytecode.addAload(this.targetVar);
        }
        jvstCodeGen.atMethodArgs(aSTList, new int[1], new int[1], new String[1]);
        jvstCodeGen.doNumCast(this.fieldType);
        n6 = this.fieldType instanceof CtPrimitiveType ? (n6 -= ((CtPrimitiveType)this.fieldType).getDataSize()) : --n6;
        bytecode.add(this.opcode);
        bytecode.addIndex(this.index);
        bytecode.growStack(n6);
        jvstCodeGen.setType(CtClass.voidType);
        jvstCodeGen.addNullIfVoid();
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        jvstTypeChecker.atMethodArgs(aSTList, new int[1], new int[1], new String[1]);
        jvstTypeChecker.setType(CtClass.voidType);
        jvstTypeChecker.addNullIfVoid();
    }
}

