/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.annotation;

import java.io.IOException;
import java.io.OutputStream;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;

public class AnnotationsWriter {
    protected OutputStream output;
    private ConstPool pool;

    public AnnotationsWriter(OutputStream outputStream, ConstPool constPool) {
        this.output = outputStream;
        this.pool = constPool;
    }

    public ConstPool getConstPool() {
        return this.pool;
    }

    public void close() throws IOException {
        this.output.close();
    }

    public void numParameters(int n6) throws IOException {
        this.output.write(n6);
    }

    public void numAnnotations(int n6) throws IOException {
        this.write16bit(n6);
    }

    public void annotation(String string, int n6) throws IOException {
        this.annotation(this.pool.addUtf8Info(string), n6);
    }

    public void annotation(int n6, int n10) throws IOException {
        this.write16bit(n6);
        this.write16bit(n10);
    }

    public void memberValuePair(String string) throws IOException {
        this.memberValuePair(this.pool.addUtf8Info(string));
    }

    public void memberValuePair(int n6) throws IOException {
        this.write16bit(n6);
    }

    public void constValueIndex(boolean bl) throws IOException {
        this.constValueIndex(90, this.pool.addIntegerInfo(bl ? 1 : 0));
    }

    public void constValueIndex(byte by) throws IOException {
        this.constValueIndex(66, this.pool.addIntegerInfo(by));
    }

    public void constValueIndex(char c3) throws IOException {
        this.constValueIndex(67, this.pool.addIntegerInfo(c3));
    }

    public void constValueIndex(short s) throws IOException {
        this.constValueIndex(83, this.pool.addIntegerInfo(s));
    }

    public void constValueIndex(int n6) throws IOException {
        this.constValueIndex(73, this.pool.addIntegerInfo(n6));
    }

    public void constValueIndex(long l) throws IOException {
        this.constValueIndex(74, this.pool.addLongInfo(l));
    }

    public void constValueIndex(float f10) throws IOException {
        this.constValueIndex(70, this.pool.addFloatInfo(f10));
    }

    public void constValueIndex(double d10) throws IOException {
        this.constValueIndex(68, this.pool.addDoubleInfo(d10));
    }

    public void constValueIndex(String string) throws IOException {
        this.constValueIndex(115, this.pool.addUtf8Info(string));
    }

    public void constValueIndex(int n6, int n10) throws IOException {
        this.output.write(n6);
        this.write16bit(n10);
    }

    public void enumConstValue(String string, String string2) throws IOException {
        this.enumConstValue(this.pool.addUtf8Info(string), this.pool.addUtf8Info(string2));
    }

    public void enumConstValue(int n6, int n10) throws IOException {
        this.output.write(101);
        this.write16bit(n6);
        this.write16bit(n10);
    }

    public void classInfoIndex(String string) throws IOException {
        this.classInfoIndex(this.pool.addUtf8Info(string));
    }

    public void classInfoIndex(int n6) throws IOException {
        this.output.write(99);
        this.write16bit(n6);
    }

    public void annotationValue() throws IOException {
        this.output.write(64);
    }

    public void arrayValue(int n6) throws IOException {
        this.output.write(91);
        this.write16bit(n6);
    }

    protected void write16bit(int n6) throws IOException {
        byte[] arrby = new byte[2];
        ByteArray.write16bit(n6, arrby, 0);
        this.output.write(arrby);
    }
}

