/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.StackMapTable$Walker;

class StackMapTable$OffsetShifter
extends StackMapTable$Walker {
    int where;
    int gap;

    public StackMapTable$OffsetShifter(StackMapTable stackMapTable, int n6, int n10) {
        super(stackMapTable);
        this.where = n6;
        this.gap = n10;
    }

    @Override
    public void objectOrUninitialized(int n6, int n10, int n11) {
        if (n6 == 8 && this.where <= n10) {
            ByteArray.write16bit(n10 + this.gap, this.info, n11);
        }
    }
}

