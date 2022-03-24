/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteStream;

public final class ClassFileWriter$ConstPoolWriter {
    ByteStream output;
    protected int startPos;
    protected int num;

    ClassFileWriter$ConstPoolWriter(ByteStream byteStream) {
        this.output = byteStream;
        this.startPos = byteStream.getPos();
        this.num = 1;
        this.output.writeShort(1);
    }

    public int[] addClassInfo(String[] arrstring) {
        int n6 = arrstring.length;
        int[] arrn = new int[n6];
        for (int k = 0; k < n6; ++k) {
            arrn[k] = this.addClassInfo(arrstring[k]);
        }
        return arrn;
    }

    public int addClassInfo(String string) {
        int n6 = this.addUtf8Info(string);
        this.output.write(7);
        this.output.writeShort(n6);
        return this.num++;
    }

    public int c(int n6) {
        this.output.write(7);
        this.output.writeShort(n6);
        return this.num++;
    }

    public int addNameAndTypeInfo(String string, String string2) {
        return this.addNameAndTypeInfo(this.addUtf8Info(string), this.addUtf8Info(string2));
    }

    public int addNameAndTypeInfo(int n6, int n10) {
        this.output.write(12);
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        return this.num++;
    }

    public int b(int n6, int n10) {
        this.output.write(9);
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        return this.num++;
    }

    public int addMethodrefInfo(int n6, int n10) {
        this.output.write(10);
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        return this.num++;
    }

    public int e(int n6, int n10) {
        this.output.write(11);
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        return this.num++;
    }

    public int c(int n6, int n10) {
        this.output.write(15);
        this.output.write(n6);
        this.output.writeShort(n10);
        return this.num++;
    }

    public int a(int n6) {
        this.output.write(16);
        this.output.writeShort(n6);
        return this.num++;
    }

    public int a(int n6, int n10) {
        this.output.write(18);
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        return this.num++;
    }

    public int d(int n6, int n10) {
        this.output.write(17);
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        return this.num++;
    }

    public int addStringInfo(String string) {
        int n6 = this.addUtf8Info(string);
        this.output.write(8);
        this.output.writeShort(n6);
        return this.num++;
    }

    public int addIntegerInfo(int n6) {
        this.output.write(3);
        this.output.writeInt(n6);
        return this.num++;
    }

    public int addFloatInfo(float f10) {
        this.output.write(4);
        this.output.writeFloat(f10);
        return this.num++;
    }

    public int addLongInfo(long l) {
        this.output.write(5);
        this.output.writeLong(l);
        int n6 = this.num;
        this.num += 2;
        return n6;
    }

    public int addDoubleInfo(double d10) {
        this.output.write(6);
        this.output.writeDouble(d10);
        int n6 = this.num;
        this.num += 2;
        return n6;
    }

    public int addUtf8Info(String string) {
        this.output.write(1);
        this.output.writeUTF(string);
        return this.num++;
    }

    void end() {
        this.output.writeShort(this.startPos, this.num);
    }
}

