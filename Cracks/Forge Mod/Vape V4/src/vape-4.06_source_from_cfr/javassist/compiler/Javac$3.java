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

class Javac$3
implements ProceedHandler {
    final Javac this$0;
    private final ASTree val$texpr;
    private final int val$methodIndex;
    private final String val$descriptor;
    private final String val$classname;
    private final String val$methodname;

    Javac$3(Javac javac, ASTree aSTree, int n6, String string, String string2, String string3) {
        this.this$0 = javac;
        this.val$texpr = aSTree;
        this.val$methodIndex = n6;
        this.val$descriptor = string;
        this.val$classname = string2;
        this.val$methodname = string3;
    }

    @Override
    public void doit(JvstCodeGen jvstCodeGen, Bytecode bytecode, ASTList aSTList) throws CompileError {
        jvstCodeGen.compileInvokeSpecial(this.val$texpr, this.val$methodIndex, this.val$descriptor, aSTList);
    }

    @Override
    public void setReturnType(JvstTypeChecker jvstTypeChecker, ASTList aSTList) throws CompileError {
        jvstTypeChecker.compileInvokeSpecial(this.val$texpr, this.val$classname, this.val$methodname, this.val$descriptor, aSTList);
    }
}

