/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Branch16;

class CodeIterator$If16
extends CodeIterator$Branch16 {
    CodeIterator$If16(int n6, int n10) {
        super(n6, n10);
    }

    @Override
    int deltaSize() {
        return this.state == 2 ? 5 : 0;
    }

    @Override
    void write32(int n6, byte[] arrby, int n10, byte[] arrby2) {
        arrby2[n10] = (byte)this.opcode(arrby[n6] & 0xFF);
        arrby2[n10 + 1] = 0;
        arrby2[n10 + 2] = 8;
        arrby2[n10 + 3] = -56;
        ByteArray.write32bit(this.offset - 3, arrby2, n10 + 4);
    }

    int opcode(int n6) {
        if (n6 == 198) {
            return 199;
        }
        if (n6 == 199) {
            return 198;
        }
        if ((n6 - 153 & 1) == 0) {
            return n6 + 1;
        }
        return n6 - 1;
    }
}

