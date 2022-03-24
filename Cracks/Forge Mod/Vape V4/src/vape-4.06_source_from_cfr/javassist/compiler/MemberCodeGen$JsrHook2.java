/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import javassist.bytecode.Bytecode;
import javassist.compiler.CodeGen;
import javassist.compiler.CodeGen$ReturnHook;

class MemberCodeGen$JsrHook2
extends CodeGen$ReturnHook {
    int var;
    int target;

    MemberCodeGen$JsrHook2(CodeGen codeGen, int[] arrn) {
        super(codeGen);
        this.target = arrn[0];
        this.var = arrn[1];
    }

    @Override
    protected boolean doit(Bytecode bytecode, int n6) {
        switch (n6) {
            case 177: {
                break;
            }
            case 176: {
                bytecode.addAstore(this.var);
                break;
            }
            case 172: {
                bytecode.addIstore(this.var);
                break;
            }
            case 173: {
                bytecode.addLstore(this.var);
                break;
            }
            case 175: {
                bytecode.addDstore(this.var);
                break;
            }
            case 174: {
                bytecode.addFstore(this.var);
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        bytecode.addOpcode(167);
        bytecode.addIndex(this.target - bytecode.currentPc() + 3);
        return true;
    }
}

