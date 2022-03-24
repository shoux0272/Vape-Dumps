/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import javassist.CtClass;
import javassist.CtField$CodeInitializer0;
import javassist.bytecode.ConstPool;
import javassist.compiler.CompileError;
import javassist.compiler.Javac;
import javassist.compiler.ast.ASTree;

class CtField$PtreeInitializer
extends CtField$CodeInitializer0 {
    private ASTree expression;

    CtField$PtreeInitializer(ASTree aSTree) {
        this.expression = aSTree;
    }

    @Override
    void compileExpr(Javac javac) throws CompileError {
        javac.compileExpr(this.expression);
    }

    @Override
    int getConstantValue(ConstPool constPool, CtClass ctClass) {
        return this.getConstantValue2(constPool, ctClass, this.expression);
    }
}

