/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.ControlFlow$Block;
import javassist.bytecode.analysis.ControlFlow$Node;
import javassist.bytecode.stackmap.BasicBlock;

abstract class ControlFlow$Access {
    ControlFlow$Node[] all;

    ControlFlow$Access(ControlFlow$Node[] arrcontrolFlow$Node) {
        this.all = arrcontrolFlow$Node;
    }

    ControlFlow$Node node(BasicBlock basicBlock) {
        return this.all[((ControlFlow$Block)basicBlock).j];
    }

    abstract BasicBlock[] exits(ControlFlow$Node var1);

    abstract BasicBlock[] entrances(ControlFlow$Node var1);
}

