/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Pointers;
import javassist.bytecode.CodeIterator$Switcher;

class CodeIterator$Table
extends CodeIterator$Switcher {
    int low;
    int high;

    CodeIterator$Table(int n6, int n10, int n11, int n12, int[] arrn, CodeIterator$Pointers codeIterator$Pointers) {
        super(n6, n10, arrn, codeIterator$Pointers);
        this.low = n11;
        this.high = n12;
    }

    @Override
    int write2(int n6, byte[] arrby) {
        ByteArray.write32bit(this.low, arrby, n6);
        ByteArray.write32bit(this.high, arrby, n6 + 4);
        int n10 = this.offsets.length;
        n6 += 8;
        for (int k = 0; k < n10; ++k) {
            ByteArray.write32bit(this.offsets[k], arrby, n6);
            n6 += 4;
        }
        return 8 + 4 * n10;
    }

    @Override
    int tableSize() {
        return 8 + 4 * this.offsets.length;
    }
}

