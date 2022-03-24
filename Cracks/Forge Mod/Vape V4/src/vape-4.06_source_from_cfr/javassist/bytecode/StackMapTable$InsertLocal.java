/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.StackMapTable$SimpleCopy;

class StackMapTable$InsertLocal
extends StackMapTable$SimpleCopy {
    private int varIndex;
    private int varTag;
    private int varData;

    public StackMapTable$InsertLocal(byte[] arrby, int n6, int n10, int n11) {
        super(arrby);
        this.varIndex = n6;
        this.varTag = n10;
        this.varData = n11;
    }

    @Override
    public void fullFrame(int n6, int n10, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n11 = arrn.length;
        if (n11 < this.varIndex) {
            super.fullFrame(n6, n10, arrn, arrn2, arrn3, arrn4);
            return;
        }
        int n12 = this.varTag == 4 || this.varTag == 3 ? 2 : 1;
        int[] arrn5 = new int[n11 + n12];
        int[] arrn6 = new int[n11 + n12];
        int n13 = this.varIndex;
        int n14 = 0;
        for (int k = 0; k < n11; ++k) {
            if (n14 == n13) {
                n14 += n12;
            }
            arrn5[n14] = arrn[k];
            arrn6[n14++] = arrn2[k];
        }
        arrn5[n13] = this.varTag;
        arrn6[n13] = this.varData;
        if (n12 > 1) {
            arrn5[n13 + 1] = 0;
            arrn6[n13 + 1] = 0;
        }
        super.fullFrame(n6, n10, arrn5, arrn6, arrn3, arrn4);
    }
}

