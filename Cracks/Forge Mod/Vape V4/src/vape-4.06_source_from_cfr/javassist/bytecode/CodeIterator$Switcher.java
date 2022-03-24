/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Branch;
import javassist.bytecode.CodeIterator$Pointers;

abstract class CodeIterator$Switcher
extends CodeIterator$Branch {
    int gap;
    int defaultByte;
    int[] offsets;
    CodeIterator$Pointers pointers;

    CodeIterator$Switcher(int n6, int n10, int[] arrn, CodeIterator$Pointers codeIterator$Pointers) {
        super(n6);
        this.gap = 3 - (n6 & 3);
        this.defaultByte = n10;
        this.offsets = arrn;
        this.pointers = codeIterator$Pointers;
    }

    @Override
    void shift(int n6, int n10, boolean bl) {
        int n11 = this.pos;
        this.defaultByte = CodeIterator$Switcher.shiftOffset(n11, this.defaultByte, n6, n10, bl);
        int n12 = this.offsets.length;
        for (int k = 0; k < n12; ++k) {
            this.offsets[k] = CodeIterator$Switcher.shiftOffset(n11, this.offsets[k], n6, n10, bl);
        }
        super.shift(n6, n10, bl);
    }

    @Override
    int gapChanged() {
        int n6 = 3 - (this.pos & 3);
        if (n6 > this.gap) {
            int n10 = n6 - this.gap;
            this.gap = n6;
            return n10;
        }
        return 0;
    }

    @Override
    int deltaSize() {
        return this.gap - (3 - (this.orgPos & 3));
    }

    @Override
    int write(int n6, byte[] arrby, int n10, byte[] arrby2) throws BadBytecode {
        int n11 = 3 - (this.pos & 3);
        int n12 = this.gap - n11;
        int n13 = 5 + (3 - (this.orgPos & 3)) + this.tableSize();
        if (n12 > 0) {
            this.adjustOffsets(n13, n12);
        }
        arrby2[n10++] = arrby[n6];
        while (n11-- > 0) {
            arrby2[n10++] = 0;
        }
        ByteArray.write32bit(this.defaultByte, arrby2, n10);
        int n14 = this.write2(n10 + 4, arrby2);
        n10 += n14 + 4;
        while (n12-- > 0) {
            arrby2[n10++] = 0;
        }
        return 5 + (3 - (this.orgPos & 3)) + n14;
    }

    abstract int write2(int var1, byte[] var2);

    abstract int tableSize();

    void adjustOffsets(int n6, int n10) throws BadBytecode {
        this.pointers.shiftForSwitch(this.pos + n6, n10);
        if (this.defaultByte == n6) {
            this.defaultByte -= n10;
        }
        for (int k = 0; k < this.offsets.length; ++k) {
            if (this.offsets[k] != n6) continue;
            int n11 = k;
            this.offsets[n11] = this.offsets[n11] - n10;
        }
    }
}

