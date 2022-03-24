/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$Walker;

class StackMap$SwitchShifter
extends StackMap$Walker {
    private int where;
    private int gap;

    public StackMap$SwitchShifter(StackMap stackMap, int n6, int n10) {
        super(stackMap);
        this.where = n6;
        this.gap = n10;
    }

    @Override
    public int locals(int n6, int n10, int n11) {
        if (this.where == n6 + n10) {
            ByteArray.write16bit(n10 - this.gap, this.info, n6 - 4);
        } else if (this.where == n6) {
            ByteArray.write16bit(n10 + this.gap, this.info, n6 - 4);
        }
        return super.locals(n6, n10, n11);
    }
}

