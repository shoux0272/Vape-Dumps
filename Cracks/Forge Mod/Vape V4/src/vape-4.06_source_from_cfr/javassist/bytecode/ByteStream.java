/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.IOException;
import java.io.OutputStream;

final class ByteStream
extends OutputStream {
    private byte[] buf;
    private int count;

    public ByteStream() {
        this(32);
    }

    public ByteStream(int n6) {
        this.buf = new byte[n6];
        this.count = 0;
    }

    public int getPos() {
        return this.count;
    }

    public int size() {
        return this.count;
    }

    public void writeBlank(int n6) {
        this.enlarge(n6);
        this.count += n6;
    }

    @Override
    public void write(byte[] arrby) {
        this.write(arrby, 0, arrby.length);
    }

    @Override
    public void write(byte[] arrby, int n6, int n10) {
        this.enlarge(n10);
        System.arraycopy(arrby, n6, this.buf, this.count, n10);
        this.count += n10;
    }

    @Override
    public void write(int n6) {
        this.enlarge(1);
        int n10 = this.count;
        this.buf[n10] = (byte)n6;
        this.count = n10 + 1;
    }

    public void writeShort(int n6) {
        this.enlarge(2);
        int n10 = this.count;
        this.buf[n10] = (byte)(n6 >>> 8);
        this.buf[n10 + 1] = (byte)n6;
        this.count = n10 + 2;
    }

    public void writeInt(int n6) {
        this.enlarge(4);
        int n10 = this.count;
        this.buf[n10] = (byte)(n6 >>> 24);
        this.buf[n10 + 1] = (byte)(n6 >>> 16);
        this.buf[n10 + 2] = (byte)(n6 >>> 8);
        this.buf[n10 + 3] = (byte)n6;
        this.count = n10 + 4;
    }

    public void writeLong(long l) {
        this.enlarge(8);
        int n6 = this.count;
        this.buf[n6] = (byte)(l >>> 56);
        this.buf[n6 + 1] = (byte)(l >>> 48);
        this.buf[n6 + 2] = (byte)(l >>> 40);
        this.buf[n6 + 3] = (byte)(l >>> 32);
        this.buf[n6 + 4] = (byte)(l >>> 24);
        this.buf[n6 + 5] = (byte)(l >>> 16);
        this.buf[n6 + 6] = (byte)(l >>> 8);
        this.buf[n6 + 7] = (byte)l;
        this.count = n6 + 8;
    }

    public void writeFloat(float f10) {
        this.writeInt(Float.floatToIntBits(f10));
    }

    public void writeDouble(double d10) {
        this.writeLong(Double.doubleToLongBits(d10));
    }

    public void writeUTF(String string) {
        int n6 = string.length();
        int n10 = this.count;
        this.enlarge(n6 + 2);
        byte[] arrby = this.buf;
        arrby[n10++] = (byte)(n6 >>> 8);
        arrby[n10++] = (byte)n6;
        for (int k = 0; k < n6; ++k) {
            char c3 = string.charAt(k);
            if ('\u0001' > c3 || c3 > '\u007f') {
                this.writeUTF2(string, n6, k);
                return;
            }
            arrby[n10++] = (byte)c3;
        }
        this.count = n10;
    }

    private void writeUTF2(String string, int n6, int n10) {
        int n11;
        int n12 = n6;
        for (n11 = n10; n11 < n6; ++n11) {
            char c3 = string.charAt(n11);
            if (c3 > '\u07ff') {
                n12 += 2;
                continue;
            }
            if (c3 != '\u0000' && c3 <= '\u007f') continue;
            ++n12;
        }
        if (n12 > 65535) {
            throw new RuntimeException("encoded string too long: " + n6 + n12 + " bytes");
        }
        this.enlarge(n12 + 2);
        n11 = this.count;
        byte[] arrby = this.buf;
        arrby[n11] = (byte)(n12 >>> 8);
        arrby[n11 + 1] = (byte)n12;
        n11 += 2 + n10;
        for (int k = n10; k < n6; ++k) {
            char c4 = string.charAt(k);
            if ('\u0001' <= c4 && c4 <= '\u007f') {
                arrby[n11++] = (byte)c4;
                continue;
            }
            if (c4 > '\u07ff') {
                arrby[n11] = (byte)(0xE0 | c4 >> 12 & 0xF);
                arrby[n11 + 1] = (byte)(0x80 | c4 >> 6 & 0x3F);
                arrby[n11 + 2] = (byte)(0x80 | c4 & 0x3F);
                n11 += 3;
                continue;
            }
            arrby[n11] = (byte)(0xC0 | c4 >> 6 & 0x1F);
            arrby[n11 + 1] = (byte)(0x80 | c4 & 0x3F);
            n11 += 2;
        }
        this.count = n11;
    }

    public void write(int n6, int n10) {
        this.buf[n6] = (byte)n10;
    }

    public void writeShort(int n6, int n10) {
        this.buf[n6] = (byte)(n10 >>> 8);
        this.buf[n6 + 1] = (byte)n10;
    }

    public void writeInt(int n6, int n10) {
        this.buf[n6] = (byte)(n10 >>> 24);
        this.buf[n6 + 1] = (byte)(n10 >>> 16);
        this.buf[n6 + 2] = (byte)(n10 >>> 8);
        this.buf[n6 + 3] = (byte)n10;
    }

    public byte[] toByteArray() {
        byte[] arrby = new byte[this.count];
        System.arraycopy(this.buf, 0, arrby, 0, this.count);
        return arrby;
    }

    public void writeTo(OutputStream outputStream) throws IOException {
        outputStream.write(this.buf, 0, this.count);
    }

    public void enlarge(int n6) {
        int n10 = this.count + n6;
        if (n10 > this.buf.length) {
            int n11 = this.buf.length << 1;
            byte[] arrby = new byte[n11 > n10 ? n11 : n10];
            System.arraycopy(this.buf, 0, arrby, 0, this.count);
            this.buf = arrby;
        }
    }
}

