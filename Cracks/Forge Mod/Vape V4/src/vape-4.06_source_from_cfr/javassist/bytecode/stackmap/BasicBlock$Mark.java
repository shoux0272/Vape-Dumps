/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.bytecode.stackmap.BasicBlock;
import javassist.bytecode.stackmap.BasicBlock$Catch;

class BasicBlock$Mark
implements Comparable<BasicBlock$Mark> {
    int position;
    BasicBlock block;
    BasicBlock[] jump;
    boolean alwaysJmp;
    int size;
    BasicBlock$Catch catcher;

    BasicBlock$Mark(int n6) {
        this.position = n6;
        this.block = null;
        this.jump = null;
        this.alwaysJmp = false;
        this.size = 0;
        this.catcher = null;
    }

    @Override
    public int compareTo(BasicBlock$Mark basicBlock$Mark) {
        if (null == basicBlock$Mark) {
            return -1;
        }
        return this.position - basicBlock$Mark.position;
    }

    void setJump(BasicBlock[] arrbasicBlock, int n6, boolean bl) {
        this.jump = arrbasicBlock;
        this.size = n6;
        this.alwaysJmp = bl;
    }
}

