/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import javassist.bytecode.analysis.ControlFlow$Block;
import javassist.bytecode.stackmap.BasicBlock$Catch;

public class ControlFlow$Catcher {
    private ControlFlow$Block node;
    private int typeIndex;

    ControlFlow$Catcher(BasicBlock$Catch basicBlock$Catch) {
        this.node = (ControlFlow$Block)basicBlock$Catch.body;
        this.typeIndex = basicBlock$Catch.typeIndex;
    }

    public ControlFlow$Block block() {
        return this.node;
    }

    public String type() {
        if (this.typeIndex == 0) {
            return "java.lang.Throwable";
        }
        return this.node.i.getConstPool().getClassInfo(this.typeIndex);
    }

    static ControlFlow$Block access$100(ControlFlow$Catcher controlFlow$Catcher) {
        return controlFlow$Catcher.node;
    }
}

