/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.IOException;
import java.io.OutputStream;
import javassist.bytecode.ByteStream;
import javassist.bytecode.ClassFileWriter;
import javassist.bytecode.ClassFileWriter$AttributeWriter;
import javassist.bytecode.ClassFileWriter$ConstPoolWriter;
import javassist.bytecode.StackMapTable$Writer;

public final class ClassFileWriter$MethodWriter {
    protected ByteStream output = new ByteStream(256);
    protected ClassFileWriter$ConstPoolWriter constPool;
    private int methodCount;
    protected int codeIndex;
    protected int throwsIndex;
    protected int stackIndex;
    private int startPos;
    private boolean isAbstract;
    private int catchPos;
    private int catchCount;

    ClassFileWriter$MethodWriter(ClassFileWriter$ConstPoolWriter classFileWriter$ConstPoolWriter) {
        this.constPool = classFileWriter$ConstPoolWriter;
        this.methodCount = 0;
        this.codeIndex = 0;
        this.throwsIndex = 0;
        this.stackIndex = 0;
    }

    public void begin(int n6, String string, String string2, String[] arrstring, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter) {
        int n10 = this.constPool.addUtf8Info(string);
        int n11 = this.constPool.addUtf8Info(string2);
        int[] arrn = arrstring == null ? null : this.constPool.addClassInfo(arrstring);
        this.begin(n6, n10, n11, arrn, classFileWriter$AttributeWriter);
    }

    public void begin(int n6, int n10, int n11, int[] arrn, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter) {
        int n12;
        ++this.methodCount;
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        this.output.writeShort(n11);
        this.isAbstract = (n6 & 0x400) != 0;
        int n13 = n12 = this.isAbstract ? 0 : 1;
        if (arrn != null) {
            ++n12;
        }
        ClassFileWriter.writeAttribute(this.output, classFileWriter$AttributeWriter, n12);
        if (arrn != null) {
            this.writeThrows(arrn);
        }
        if (!this.isAbstract) {
            if (this.codeIndex == 0) {
                this.codeIndex = this.constPool.addUtf8Info("Code");
            }
            this.startPos = this.output.getPos();
            this.output.writeShort(this.codeIndex);
            this.output.writeBlank(12);
        }
        this.catchPos = -1;
        this.catchCount = 0;
    }

    private void writeThrows(int[] arrn) {
        if (this.throwsIndex == 0) {
            this.throwsIndex = this.constPool.addUtf8Info("Exceptions");
        }
        this.output.writeShort(this.throwsIndex);
        this.output.writeInt(arrn.length * 2 + 2);
        this.output.writeShort(arrn.length);
        for (int k = 0; k < arrn.length; ++k) {
            this.output.writeShort(arrn[k]);
        }
    }

    public void add(int n6) {
        this.output.write(n6);
    }

    public void add16(int n6) {
        this.output.writeShort(n6);
    }

    public void add32(int n6) {
        this.output.writeInt(n6);
    }

    public void addInvoke(int n6, String string, String string2, String string3) {
        int n10 = this.constPool.addClassInfo(string);
        int n11 = this.constPool.addNameAndTypeInfo(string2, string3);
        int n12 = this.constPool.addMethodrefInfo(n10, n11);
        this.add(n6);
        this.add16(n12);
    }

    public void codeEnd(int n6, int n10) {
        if (!this.isAbstract) {
            this.output.writeShort(this.startPos + 6, n6);
            this.output.writeShort(this.startPos + 8, n10);
            this.output.writeInt(this.startPos + 10, this.output.getPos() - this.startPos - 14);
            this.catchPos = this.output.getPos();
            this.catchCount = 0;
            this.output.writeShort(0);
        }
    }

    public void addCatch(int n6, int n10, int n11, int n12) {
        ++this.catchCount;
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        this.output.writeShort(n11);
        this.output.writeShort(n12);
    }

    public void end(StackMapTable$Writer stackMapTable$Writer, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter) {
        if (this.isAbstract) {
            return;
        }
        this.output.writeShort(this.catchPos, this.catchCount);
        int n6 = stackMapTable$Writer == null ? 0 : 1;
        ClassFileWriter.writeAttribute(this.output, classFileWriter$AttributeWriter, n6);
        if (stackMapTable$Writer != null) {
            if (this.stackIndex == 0) {
                this.stackIndex = this.constPool.addUtf8Info("StackMapTable");
            }
            this.output.writeShort(this.stackIndex);
            byte[] arrby = stackMapTable$Writer.toByteArray();
            this.output.writeInt(arrby.length);
            this.output.write(arrby);
        }
        this.output.writeInt(this.startPos + 2, this.output.getPos() - this.startPos - 6);
    }

    public int size() {
        return this.output.getPos() - this.startPos - 14;
    }

    int numOfMethods() {
        return this.methodCount;
    }

    int dataSize() {
        return this.output.size();
    }

    void write(OutputStream outputStream) throws IOException {
        this.output.writeTo(outputStream);
    }
}

