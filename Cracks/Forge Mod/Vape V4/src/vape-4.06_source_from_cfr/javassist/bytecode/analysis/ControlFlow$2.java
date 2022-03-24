/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.ControlFlow;
import javassist.bytecode.analysis.ControlFlow$Access;
import javassist.bytecode.analysis.ControlFlow$Node;
import javassist.bytecode.stackmap.BasicBlock;

class ControlFlow$2
extends ControlFlow$Access {
    final ControlFlow this$0;

    ControlFlow$2(ControlFlow controlFlow, ControlFlow$Node[] arrcontrolFlow$Node) {
        this.this$0 = controlFlow;
        super(arrcontrolFlow$Node);
    }

    @Override
    BasicBlock[] exits(ControlFlow$Node controlFlow$Node) {
        return ControlFlow$Node.access$200(controlFlow$Node).b();
    }

    @Override
    BasicBlock[] entrances(ControlFlow$Node controlFlow$Node) {
        return ControlFlow$Node.access$200((ControlFlow$Node)controlFlow$Node).g;
    }
}

