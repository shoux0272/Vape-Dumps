/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.util.ArrayList;
import java.util.List;
import javassist.bytecode.Bytecode;
import javassist.compiler.CodeGen;
import javassist.compiler.CodeGen$ReturnHook;

class MemberCodeGen$JsrHook
extends CodeGen$ReturnHook {
    List<int[]> jsrList = new ArrayList<int[]>();
    CodeGen cgen;
    int var;

    MemberCodeGen$JsrHook(CodeGen codeGen) {
        super(codeGen);
        this.cgen = codeGen;
        this.var = -1;
    }

    private int getVar(int n6) {
        if (this.var < 0) {
            this.var = this.cgen.getMaxLocals();
            this.cgen.incMaxLocals(n6);
        }
        return this.var;
    }

    private void jsrJmp(Bytecode bytecode) {
        bytecode.addOpcode(167);
        this.jsrList.add(new int[]{bytecode.currentPc(), this.var});
        bytecode.addIndex(0);
    }

    @Override
    protected boolean doit(Bytecode bytecode, int n6) {
        switch (n6) {
            case 177: {
                this.jsrJmp(bytecode);
                break;
            }
            case 176: {
                bytecode.addAstore(this.getVar(1));
                this.jsrJmp(bytecode);
                bytecode.addAload(this.var);
                break;
            }
            case 172: {
                bytecode.addIstore(this.getVar(1));
                this.jsrJmp(bytecode);
                bytecode.addIload(this.var);
                break;
            }
            case 173: {
                bytecode.addLstore(this.getVar(2));
                this.jsrJmp(bytecode);
                bytecode.addLload(this.var);
                break;
            }
            case 175: {
                bytecode.addDstore(this.getVar(2));
                this.jsrJmp(bytecode);
                bytecode.addDload(this.var);
                break;
            }
            case 174: {
                bytecode.addFstore(this.getVar(1));
                this.jsrJmp(bytecode);
                bytecode.addFload(this.var);
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return false;
    }
}

