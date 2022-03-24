/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

class ByteVector
implements Cloneable {
    private byte[] buffer = new byte[64];
    private int size = 0;

    public Object clone() throws CloneNotSupportedException {
        ByteVector byteVector = (ByteVector)super.clone();
        byteVector.buffer = (byte[])this.buffer.clone();
        return byteVector;
    }

    public final int getSize() {
        return this.size;
    }

    public final byte[] copy() {
        byte[] arrby = new byte[this.size];
        System.arraycopy(this.buffer, 0, arrby, 0, this.size);
        return arrby;
    }

    public int read(int n6) {
        if (n6 < 0 || this.size <= n6) {
            throw new ArrayIndexOutOfBoundsException(n6);
        }
        return this.buffer[n6];
    }

    public void write(int n6, int n10) {
        if (n6 < 0 || this.size <= n6) {
            throw new ArrayIndexOutOfBoundsException(n6);
        }
        this.buffer[n6] = (byte)n10;
    }

    public void add(int n6) {
        this.addGap(1);
        this.buffer[this.size - 1] = (byte)n6;
    }

    public void add(int n6, int n10) {
        this.addGap(2);
        this.buffer[this.size - 2] = (byte)n6;
        this.buffer[this.size - 1] = (byte)n10;
    }

    public void add(int n6, int n10, int n11, int n12) {
        this.addGap(4);
        this.buffer[this.size - 4] = (byte)n6;
        this.buffer[this.size - 3] = (byte)n10;
        this.buffer[this.size - 2] = (byte)n11;
        this.buffer[this.size - 1] = (byte)n12;
    }

    public void addGap(int n6) {
        if (this.size + n6 > this.buffer.length) {
            int n10 = this.size << 1;
            if (n10 < this.size + n6) {
                n10 = this.size + n6;
            }
            byte[] arrby = new byte[n10];
            System.arraycopy(this.buffer, 0, arrby, 0, this.size);
            this.buffer = arrby;
        }
        this.size += n6;
    }
}

