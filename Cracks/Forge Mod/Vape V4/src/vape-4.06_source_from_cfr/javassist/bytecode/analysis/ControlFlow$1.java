/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.ControlFlow;
import javassist.bytecode.analysis.ControlFlow$Block;
import javassist.bytecode.stackmap.BasicBlock;
import javassist.bytecode.stackmap.BasicBlock$Maker;

class ControlFlow$1
extends BasicBlock$Maker {
    final ControlFlow this$0;

    ControlFlow$1(ControlFlow controlFlow) {
        this.this$0 = controlFlow;
    }

    @Override
    protected BasicBlock makeBlock(int n6) {
        return new ControlFlow$Block(n6, ControlFlow.access$000(this.this$0));
    }

    @Override
    protected BasicBlock[] makeArray(int n6) {
        return new ControlFlow$Block[n6];
    }
}

