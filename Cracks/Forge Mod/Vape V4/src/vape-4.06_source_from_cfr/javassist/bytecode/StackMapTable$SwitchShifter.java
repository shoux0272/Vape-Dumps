/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.StackMapTable$Shifter;

class StackMapTable$SwitchShifter
extends StackMapTable$Shifter {
    StackMapTable$SwitchShifter(StackMapTable stackMapTable, int n6, int n10) {
        super(stackMapTable, n6, n10, false);
    }

    @Override
    void update(int n6, int n10, int n11, int n12) {
        int n13;
        this.position = n13 + n10 + ((n13 = this.position) == 0 ? 0 : 1);
        int n14 = n10;
        if (this.where == this.position) {
            n14 = n10 - this.gap;
        } else if (this.where == n13) {
            n14 = n10 + this.gap;
        } else {
            return;
        }
        if (n10 < 64) {
            if (n14 < 64) {
                this.info[n6] = (byte)(n14 + n11);
            } else {
                byte[] arrby = StackMapTable$SwitchShifter.insertGap(this.info, n6, 2);
                arrby[n6] = (byte)n12;
                ByteArray.write16bit(n14, arrby, n6 + 1);
                this.updatedInfo = arrby;
            }
        } else if (n14 < 64) {
            byte[] arrby = StackMapTable$SwitchShifter.deleteGap(this.info, n6, 2);
            arrby[n6] = (byte)(n14 + n11);
            this.updatedInfo = arrby;
        } else {
            ByteArray.write16bit(n14, this.info, n6 + 1);
        }
    }

    static byte[] deleteGap(byte[] arrby, int n6, int n10) {
        n6 += n10;
        int n11 = arrby.length;
        byte[] arrby2 = new byte[n11 - n10];
        for (int k = 0; k < n11; ++k) {
            arrby2[k - (k < n6 ? 0 : n10)] = arrby[k];
        }
        return arrby2;
    }

    @Override
    void update(int n6, int n10) {
        int n11;
        this.position = n11 + n10 + ((n11 = this.position) == 0 ? 0 : 1);
        int n12 = n10;
        if (this.where == this.position) {
            n12 = n10 - this.gap;
        } else if (this.where == n11) {
            n12 = n10 + this.gap;
        } else {
            return;
        }
        ByteArray.write16bit(n12, this.info, n6 + 1);
    }
}

