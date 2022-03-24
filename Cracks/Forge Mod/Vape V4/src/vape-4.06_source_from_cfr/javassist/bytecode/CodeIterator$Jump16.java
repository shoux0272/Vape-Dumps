/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Branch16;

class CodeIterator$Jump16
extends CodeIterator$Branch16 {
    CodeIterator$Jump16(int n6, int n10) {
        super(n6, n10);
    }

    @Override
    int deltaSize() {
        return this.state == 2 ? 2 : 0;
    }

    @Override
    void write32(int n6, byte[] arrby, int n10, byte[] arrby2) {
        arrby2[n10] = (byte)((arrby[n6] & 0xFF) == 167 ? 200 : 201);
        ByteArray.write32bit(this.offset, arrby2, n10 + 1);
    }
}

