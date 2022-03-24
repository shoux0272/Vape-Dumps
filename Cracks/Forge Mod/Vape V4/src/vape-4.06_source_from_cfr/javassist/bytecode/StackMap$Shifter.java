/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$Walker;

class StackMap$Shifter
extends StackMap$Walker {
    private int where;
    private int gap;
    private boolean exclusive;

    public StackMap$Shifter(StackMap stackMap, int n6, int n10, boolean bl) {
        super(stackMap);
        this.where = n6;
        this.gap = n10;
        this.exclusive = bl;
    }

    @Override
    public int locals(int n6, int n10, int n11) {
        if (this.exclusive ? this.where <= n10 : this.where < n10) {
            ByteArray.write16bit(n10 + this.gap, this.info, n6 - 4);
        }
        return super.locals(n6, n10, n11);
    }

    @Override
    public void uninitialized(int n6, int n10) {
        if (this.where <= n10) {
            ByteArray.write16bit(n10 + this.gap, this.info, n6 + 1);
        }
    }
}

