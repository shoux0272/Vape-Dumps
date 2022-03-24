/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.StackMapTable$SimpleCopy;

class StackMapTable$NewRemover
extends StackMapTable$SimpleCopy {
    int posOfNew;

    public StackMapTable$NewRemover(byte[] arrby, int n6) {
        super(arrby);
        this.posOfNew = n6;
    }

    @Override
    public void sameLocals(int n6, int n10, int n11, int n12) {
        if (n11 == 8 && n12 == this.posOfNew) {
            super.sameFrame(n6, n10);
        } else {
            super.sameLocals(n6, n10, n11, n12);
        }
    }

    @Override
    public void fullFrame(int n6, int n10, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n11 = arrn3.length - 1;
        for (int k = 0; k < n11; ++k) {
            if (arrn3[k] != 8 || arrn4[k] != this.posOfNew || arrn3[k + 1] != 8 || arrn4[k + 1] != this.posOfNew) continue;
            int[] arrn5 = new int[++n11 - 2];
            int[] arrn6 = new int[n11 - 2];
            int n12 = 0;
            for (int i10 = 0; i10 < n11; ++i10) {
                if (i10 == k) {
                    ++i10;
                    continue;
                }
                arrn5[n12] = arrn3[i10];
                arrn6[n12++] = arrn4[i10];
            }
            arrn3 = arrn5;
            arrn4 = arrn6;
            break;
        }
        super.fullFrame(n6, n10, arrn, arrn2, arrn3, arrn4);
    }
}

