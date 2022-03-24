/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Pointers;
import javassist.bytecode.CodeIterator$Switcher;

class CodeIterator$Lookup
extends CodeIterator$Switcher {
    int[] matches;

    CodeIterator$Lookup(int n6, int n10, int[] arrn, int[] arrn2, CodeIterator.Pointers pointers) {
        super(n6, n10, arrn2, pointers);
        this.matches = arrn;
    }

    @Override
    int write2(int n6, byte[] arrby) {
        int n10 = this.matches.length;
        ByteArray.write32bit(n10, arrby, n6);
        n6 += 4;
        for (int k = 0; k < n10; ++k) {
            ByteArray.write32bit(this.matches[k], arrby, n6);
            ByteArray.write32bit(this.offsets[k], arrby, n6 + 4);
            n6 += 8;
        }
        return 4 + 8 * n10;
    }

    @Override
    int tableSize() {
        return 4 + 8 * this.matches.length;
    }
}

