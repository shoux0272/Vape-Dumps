/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.bytecode.Bytecode;
import javassist.compiler.CodeGen;

public abstract class CodeGen$ReturnHook {
    CodeGen$ReturnHook next;

    protected abstract boolean doit(Bytecode var1, int var2);

    protected CodeGen$ReturnHook(CodeGen codeGen) {
        this.next = codeGen.returnHooks;
        codeGen.returnHooks = this;
    }

    protected void remove(CodeGen codeGen) {
        codeGen.returnHooks = this.next;
    }
}

