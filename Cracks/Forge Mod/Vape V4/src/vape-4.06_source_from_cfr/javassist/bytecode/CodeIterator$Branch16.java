/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Branch;

abstract class CodeIterator$Branch16
extends CodeIterator$Branch {
    int offset;
    int state;
    static final int BIT16 = 0;
    static final int EXPAND = 1;
    static final int BIT32 = 2;

    CodeIterator$Branch16(int n6, int n10) {
        super(n6);
        this.offset = n10;
        this.state = 0;
    }

    @Override
    void shift(int n6, int n10, boolean bl) {
        this.offset = CodeIterator$Branch16.shiftOffset(this.pos, this.offset, n6, n10, bl);
        super.shift(n6, n10, bl);
        if (this.state == 0 && (this.offset < -32768 || 32767 < this.offset)) {
            this.state = 1;
        }
    }

    @Override
    boolean expanded() {
        if (this.state == 1) {
            this.state = 2;
            return true;
        }
        return false;
    }

    @Override
    abstract int deltaSize();

    abstract void write32(int var1, byte[] var2, int var3, byte[] var4);

    @Override
    int write(int n6, byte[] arrby, int n10, byte[] arrby2) {
        if (this.state == 2) {
            this.write32(n6, arrby, n10, arrby2);
        } else {
            arrby2[n10] = arrby[n6];
            ByteArray.write16bit(this.offset, arrby2, n10 + 1);
        }
        return 3;
    }
}

