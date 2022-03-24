/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.StackMapTable$Walker;

class StackMapTable$Shifter
extends StackMapTable$Walker {
    private StackMapTable stackMap;
    int where;
    int gap;
    int position;
    byte[] updatedInfo;
    boolean exclusive;

    public StackMapTable$Shifter(StackMapTable stackMapTable, int n6, int n10, boolean bl) {
        super(stackMapTable);
        this.stackMap = stackMapTable;
        this.where = n6;
        this.gap = n10;
        this.position = 0;
        this.updatedInfo = null;
        this.exclusive = bl;
    }

    public void doit() throws BadBytecode {
        this.parse();
        if (this.updatedInfo != null) {
            this.stackMap.set(this.updatedInfo);
        }
    }

    @Override
    public void sameFrame(int n6, int n10) {
        this.update(n6, n10, 0, 251);
    }

    @Override
    public void sameLocals(int n6, int n10, int n11, int n12) {
        this.update(n6, n10, 64, 247);
    }

    void update(int n6, int n10, int n11, int n12) {
        boolean bl;
        int n13;
        this.position = n13 + n10 + ((n13 = this.position) == 0 ? 0 : 1);
        if (this.exclusive) {
            bl = n13 < this.where && this.where <= this.position;
        } else {
            boolean bl2 = bl = n13 <= this.where && this.where < this.position;
        }
        if (bl) {
            int n14 = n10 + this.gap;
            this.position += this.gap;
            if (n14 < 64) {
                this.info[n6] = (byte)(n14 + n11);
            } else if (n10 < 64) {
                byte[] arrby = StackMapTable$Shifter.insertGap(this.info, n6, 2);
                arrby[n6] = (byte)n12;
                ByteArray.write16bit(n14, arrby, n6 + 1);
                this.updatedInfo = arrby;
            } else {
                ByteArray.write16bit(n14, this.info, n6 + 1);
            }
        }
    }

    static byte[] insertGap(byte[] arrby, int n6, int n10) {
        int n11 = arrby.length;
        byte[] arrby2 = new byte[n11 + n10];
        for (int k = 0; k < n11; ++k) {
            arrby2[k + (k < n6 ? 0 : n10)] = arrby[k];
        }
        return arrby2;
    }

    @Override
    public void chopFrame(int n6, int n10, int n11) {
        this.update(n6, n10);
    }

    @Override
    public void appendFrame(int n6, int n10, int[] arrn, int[] arrn2) {
        this.update(n6, n10);
    }

    @Override
    public void fullFrame(int n6, int n10, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        this.update(n6, n10);
    }

    void update(int n6, int n10) {
        boolean bl;
        int n11;
        this.position = n11 + n10 + ((n11 = this.position) == 0 ? 0 : 1);
        if (this.exclusive) {
            bl = n11 < this.where && this.where <= this.position;
        } else {
            boolean bl2 = bl = n11 <= this.where && this.where < this.position;
        }
        if (bl) {
            int n12 = n10 + this.gap;
            ByteArray.write16bit(n12, this.info, n6 + 1);
            this.position += this.gap;
        }
    }
}

