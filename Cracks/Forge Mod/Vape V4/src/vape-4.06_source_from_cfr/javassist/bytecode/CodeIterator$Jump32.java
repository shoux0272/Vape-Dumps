/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Branch;

class CodeIterator$Jump32
extends CodeIterator$Branch {
    int offset;

    CodeIterator$Jump32(int n6, int n10) {
        super(n6);
        this.offset = n10;
    }

    @Override
    void shift(int n6, int n10, boolean bl) {
        this.offset = CodeIterator$Jump32.shiftOffset(this.pos, this.offset, n6, n10, bl);
        super.shift(n6, n10, bl);
    }

    @Override
    int write(int n6, byte[] arrby, int n10, byte[] arrby2) {
        arrby2[n10] = arrby[n6];
        ByteArray.write32bit(this.offset, arrby2, n10 + 1);
        return 5;
    }
}

