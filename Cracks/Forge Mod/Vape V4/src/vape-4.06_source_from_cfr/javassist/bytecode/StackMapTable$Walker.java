/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMapTable;

public class StackMapTable$Walker {
    byte[] info;
    int numOfEntries;

    public StackMapTable$Walker(StackMapTable stackMapTable) {
        this(stackMapTable.get());
    }

    public StackMapTable$Walker(byte[] arrby) {
        this.info = arrby;
        this.numOfEntries = ByteArray.readU16bit(arrby, 0);
    }

    public final int size() {
        return this.numOfEntries;
    }

    public void parse() throws BadBytecode {
        int n6 = this.numOfEntries;
        int n10 = 2;
        for (int k = 0; k < n6; ++k) {
            n10 = this.stackMapFrames(n10, k);
        }
    }

    int stackMapFrames(int n6, int n10) throws BadBytecode {
        int n11 = this.info[n6] & 0xFF;
        if (n11 < 64) {
            this.sameFrame(n6, n11);
            ++n6;
        } else if (n11 < 128) {
            n6 = this.sameLocals(n6, n11);
        } else {
            if (n11 < 247) {
                throw new BadBytecode("bad frame_type in StackMapTable");
            }
            if (n11 == 247) {
                n6 = this.sameLocals(n6, n11);
            } else if (n11 < 251) {
                int n12 = ByteArray.readU16bit(this.info, n6 + 1);
                this.chopFrame(n6, n12, 251 - n11);
                n6 += 3;
            } else if (n11 == 251) {
                int n13 = ByteArray.readU16bit(this.info, n6 + 1);
                this.sameFrame(n6, n13);
                n6 += 3;
            } else {
                n6 = n11 < 255 ? this.appendFrame(n6, n11) : this.fullFrame(n6);
            }
        }
        return n6;
    }

    public void sameFrame(int n6, int n10) throws BadBytecode {
    }

    private int sameLocals(int n6, int n10) throws BadBytecode {
        int n11;
        int n12 = n6;
        if (n10 < 128) {
            n11 = n10 - 64;
        } else {
            n11 = ByteArray.readU16bit(this.info, n6 + 1);
            n6 += 2;
        }
        int n13 = this.info[n6 + 1] & 0xFF;
        int n14 = 0;
        if (n13 == 7 || n13 == 8) {
            n14 = ByteArray.readU16bit(this.info, n6 + 2);
            this.objectOrUninitialized(n13, n14, n6 + 2);
            n6 += 2;
        }
        this.sameLocals(n12, n11, n13, n14);
        return n6 + 2;
    }

    public void sameLocals(int n6, int n10, int n11, int n12) throws BadBytecode {
    }

    public void chopFrame(int n6, int n10, int n11) throws BadBytecode {
    }

    private int appendFrame(int n6, int n10) throws BadBytecode {
        int n11 = n10 - 251;
        int n12 = ByteArray.readU16bit(this.info, n6 + 1);
        int[] arrn = new int[n11];
        int[] arrn2 = new int[n11];
        int n13 = n6 + 3;
        for (int k = 0; k < n11; ++k) {
            int n14;
            arrn[k] = n14 = this.info[n13] & 0xFF;
            if (n14 == 7 || n14 == 8) {
                arrn2[k] = ByteArray.readU16bit(this.info, n13 + 1);
                this.objectOrUninitialized(n14, arrn2[k], n13 + 1);
                n13 += 3;
                continue;
            }
            arrn2[k] = 0;
            ++n13;
        }
        this.appendFrame(n6, n12, arrn, arrn2);
        return n13;
    }

    public void appendFrame(int n6, int n10, int[] arrn, int[] arrn2) throws BadBytecode {
    }

    private int fullFrame(int n6) throws BadBytecode {
        int n10 = ByteArray.readU16bit(this.info, n6 + 1);
        int n11 = ByteArray.readU16bit(this.info, n6 + 3);
        int[] arrn = new int[n11];
        int[] arrn2 = new int[n11];
        int n12 = this.verifyTypeInfo(n6 + 5, n11, arrn, arrn2);
        int n13 = ByteArray.readU16bit(this.info, n12);
        int[] arrn3 = new int[n13];
        int[] arrn4 = new int[n13];
        n12 = this.verifyTypeInfo(n12 + 2, n13, arrn3, arrn4);
        this.fullFrame(n6, n10, arrn, arrn2, arrn3, arrn4);
        return n12;
    }

    public void fullFrame(int n6, int n10, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) throws BadBytecode {
    }

    private int verifyTypeInfo(int n6, int n10, int[] arrn, int[] arrn2) {
        for (int k = 0; k < n10; ++k) {
            int n11;
            arrn[k] = n11 = this.info[n6++] & 0xFF;
            if (n11 != 7 && n11 != 8) continue;
            arrn2[k] = ByteArray.readU16bit(this.info, n6);
            this.objectOrUninitialized(n11, arrn2[k], n6);
            n6 += 2;
        }
        return n6;
    }

    public void objectOrUninitialized(int n6, int n10, int n11) {
    }
}

