/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMap;

public class StackMap$Walker {
    byte[] info;

    public StackMap$Walker(StackMap stackMap) {
        this.info = stackMap.get();
    }

    public void visit() {
        int n6 = ByteArray.readU16bit(this.info, 0);
        int n10 = 2;
        for (int k = 0; k < n6; ++k) {
            int n11 = ByteArray.readU16bit(this.info, n10);
            int n12 = ByteArray.readU16bit(this.info, n10 + 2);
            n10 = this.locals(n10 + 4, n11, n12);
            int n13 = ByteArray.readU16bit(this.info, n10);
            n10 = this.stack(n10 + 2, n11, n13);
        }
    }

    public int locals(int n6, int n10, int n11) {
        return this.typeInfoArray(n6, n10, n11, true);
    }

    public int stack(int n6, int n10, int n11) {
        return this.typeInfoArray(n6, n10, n11, false);
    }

    public int typeInfoArray(int n6, int n10, int n11, boolean bl) {
        for (int k = 0; k < n11; ++k) {
            n6 = this.typeInfoArray2(k, n6);
        }
        return n6;
    }

    int typeInfoArray2(int n6, int n10) {
        byte by = this.info[n10];
        if (by == 7) {
            int n11 = ByteArray.readU16bit(this.info, n10 + 1);
            this.objectVariable(n10, n11);
            n10 += 3;
        } else if (by == 8) {
            int n12 = ByteArray.readU16bit(this.info, n10 + 1);
            this.uninitialized(n10, n12);
            n10 += 3;
        } else {
            this.typeInfo(n10, by);
            ++n10;
        }
        return n10;
    }

    public void typeInfo(int n6, byte by) {
    }

    public void objectVariable(int n6, int n10) {
    }

    public void uninitialized(int n6, int n10) {
    }
}

