/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.bytecode.Bytecode;
import javassist.compiler.CodeGen;
import javassist.compiler.CodeGen$ReturnHook;

class CodeGen$1
extends CodeGen$ReturnHook {
    final CodeGen this$0;
    private final int val$var;

    CodeGen$1(CodeGen codeGen, CodeGen codeGen2, int n6) {
        this.this$0 = codeGen;
        this.val$var = n6;
        super(codeGen2);
    }

    @Override
    protected boolean doit(Bytecode bytecode, int n6) {
        bytecode.addAload(this.val$var);
        bytecode.addOpcode(195);
        return false;
    }
}

