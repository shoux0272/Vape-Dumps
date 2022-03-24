/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;

abstract class CodeIterator$Branch {
    int pos;
    int orgPos;

    CodeIterator$Branch(int n6) {
        this.pos = this.orgPos = n6;
    }

    void shift(int n6, int n10, boolean bl) {
        if (n6 < this.pos || n6 == this.pos && bl) {
            this.pos += n10;
        }
    }

    static int shiftOffset(int n6, int n10, int n11, int n12, boolean bl) {
        int n13 = n6 + n10;
        if (n6 < n11) {
            if (n11 < n13 || bl && n11 == n13) {
                n10 += n12;
            }
        } else if (n6 == n11) {
            if (n13 < n11 && bl) {
                n10 -= n12;
            } else if (n11 < n13 && !bl) {
                n10 += n12;
            }
        } else if (n13 < n11 || !bl && n11 == n13) {
            n10 -= n12;
        }
        return n10;
    }

    boolean expanded() {
        return false;
    }

    int gapChanged() {
        return 0;
    }

    int deltaSize() {
        return 0;
    }

    abstract int write(int var1, byte[] var2, int var3, byte[] var4) throws BadBytecode;
}

