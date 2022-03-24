/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.StackMapTable;

public class StackMapTable$Writer {
    ByteArrayOutputStream output;
    int numOfEntries;

    public StackMapTable$Writer(int n6) {
        this.output = new ByteArrayOutputStream(n6);
        this.numOfEntries = 0;
        this.output.write(0);
        this.output.write(0);
    }

    public byte[] toByteArray() {
        byte[] arrby = this.output.toByteArray();
        ByteArray.write16bit(this.numOfEntries, arrby, 0);
        return arrby;
    }

    public StackMapTable toStackMapTable(ConstPool constPool) {
        return new StackMapTable(constPool, this.toByteArray());
    }

    public void sameFrame(int n6) {
        ++this.numOfEntries;
        if (n6 < 64) {
            this.output.write(n6);
        } else {
            this.output.write(251);
            this.write16(n6);
        }
    }

    public void sameLocals(int n6, int n10, int n11) {
        ++this.numOfEntries;
        if (n6 < 64) {
            this.output.write(n6 + 64);
        } else {
            this.output.write(247);
            this.write16(n6);
        }
        this.writeTypeInfo(n10, n11);
    }

    public void chopFrame(int n6, int n10) {
        ++this.numOfEntries;
        this.output.write(251 - n10);
        this.write16(n6);
    }

    public void appendFrame(int n6, int[] arrn, int[] arrn2) {
        ++this.numOfEntries;
        int n10 = arrn.length;
        this.output.write(n10 + 251);
        this.write16(n6);
        for (int k = 0; k < n10; ++k) {
            this.writeTypeInfo(arrn[k], arrn2[k]);
        }
    }

    public void fullFrame(int n6, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n10;
        ++this.numOfEntries;
        this.output.write(255);
        this.write16(n6);
        int n11 = arrn.length;
        this.write16(n11);
        for (n10 = 0; n10 < n11; ++n10) {
            this.writeTypeInfo(arrn[n10], arrn2[n10]);
        }
        n11 = arrn3.length;
        this.write16(n11);
        for (n10 = 0; n10 < n11; ++n10) {
            this.writeTypeInfo(arrn3[n10], arrn4[n10]);
        }
    }

    private void writeTypeInfo(int n6, int n10) {
        this.output.write(n6);
        if (n6 == 7 || n6 == 8) {
            this.write16(n10);
        }
    }

    private void write16(int n6) {
        this.output.write(n6 >>> 8 & 0xFF);
        this.output.write(n6 & 0xFF);
    }
}

