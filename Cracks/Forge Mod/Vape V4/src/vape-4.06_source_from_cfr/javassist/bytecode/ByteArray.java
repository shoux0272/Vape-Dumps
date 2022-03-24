/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

public class ByteArray {
    public static int readU16bit(byte[] arrby, int n6) {
        return (arrby[n6] & 0xFF) << 8 | arrby[n6 + 1] & 0xFF;
    }

    public static int readS16bit(byte[] arrby, int n6) {
        return arrby[n6] << 8 | arrby[n6 + 1] & 0xFF;
    }

    public static void write16bit(int n6, byte[] arrby, int n10) {
        arrby[n10] = (byte)(n6 >>> 8);
        arrby[n10 + 1] = (byte)n6;
    }

    public static int read32bit(byte[] arrby, int n6) {
        return arrby[n6] << 24 | (arrby[n6 + 1] & 0xFF) << 16 | (arrby[n6 + 2] & 0xFF) << 8 | arrby[n6 + 3] & 0xFF;
    }

    public static void write32bit(int n6, byte[] arrby, int n10) {
        arrby[n10] = (byte)(n6 >>> 24);
        arrby[n10 + 1] = (byte)(n6 >>> 16);
        arrby[n10 + 2] = (byte)(n6 >>> 8);
        arrby[n10 + 3] = (byte)n6;
    }

    static void copy32bit(byte[] arrby, int n6, byte[] arrby2, int n10) {
        arrby2[n10] = arrby[n6];
        arrby2[n10 + 1] = arrby[n6 + 1];
        arrby2[n10 + 2] = arrby[n6 + 2];
        arrby2[n10 + 3] = arrby[n6 + 3];
    }
}

