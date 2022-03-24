/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CtClass;
import javassist.CtField$CodeInitializer0;
import javassist.bytecode.ConstPool;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.compiler.SymbolTable;
import javassist.compiler.ast.ASTree;

class CtField$CodeInitializer
extends CtField$CodeInitializer0 {
    private String expression;

    CtField$CodeInitializer(String string) {
        this.expression = string;
    }

    @Override
    void compileExpr(Javac javac) throws CompileError {
        javac.compileExpr(this.expression);
    }

    @Override
    int getConstantValue(ConstPool constPool, CtClass ctClass) {
        try {
            ASTree aSTree = Javac.parseExpr(this.expression, new SymbolTable());
            return this.getConstantValue2(constPool, ctClass, aSTree);
        }
        catch (CompileError compileError) {
            return 0;
        }
    }
}

