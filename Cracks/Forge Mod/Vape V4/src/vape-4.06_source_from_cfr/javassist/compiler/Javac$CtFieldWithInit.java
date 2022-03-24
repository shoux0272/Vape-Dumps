/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.CannotCompileException;
import javassist.CtClass;
import javassist.CtField;
import javassist.compiler.ast.ASTree;

public class Javac$CtFieldWithInit
extends CtField {
    private ASTree init = null;

    Javac$CtFieldWithInit(CtClass ctClass, String string, CtClass ctClass2) throws CannotCompileException {
        super(ctClass, string, ctClass2);
    }

    protected void setInit(ASTree aSTree) {
        this.init = aSTree;
    }

    @Override
    protected ASTree getInitAST() {
        return this.init;
    }
}

