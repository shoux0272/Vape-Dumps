/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeIterator$Branch;

class CodeIterator$LdcW
extends CodeIterator$Branch {
    int index;
    boolean state;

    CodeIterator$LdcW(int n6, int n10) {
        super(n6);
        this.index = n10;
        this.state = true;
    }

    @Override
    boolean expanded() {
        if (this.state) {
            this.state = false;
            return true;
        }
        return false;
    }

    @Override
    int deltaSize() {
        return 1;
    }

    @Override
    int write(int n6, byte[] arrby, int n10, byte[] arrby2) {
        arrby2[n10] = 19;
        ByteArray.write16bit(this.index, arrby2, n10 + 1);
        return 2;
    }
}

