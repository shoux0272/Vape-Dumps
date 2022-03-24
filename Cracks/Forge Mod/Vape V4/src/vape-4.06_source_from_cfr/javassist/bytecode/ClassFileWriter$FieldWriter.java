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

public final class ClassFileWriter$FieldWriter {
    protected ByteStream output = new ByteStream(128);
    protected ClassFileWriter$ConstPoolWriter constPool;
    private int fieldCount;

    ClassFileWriter$FieldWriter(ClassFileWriter$ConstPoolWriter classFileWriter$ConstPoolWriter) {
        this.constPool = classFileWriter$ConstPoolWriter;
        this.fieldCount = 0;
    }

    public void add(int n6, String string, String string2, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter) {
        int n10 = this.constPool.addUtf8Info(string);
        int n11 = this.constPool.addUtf8Info(string2);
        this.add(n6, n10, n11, classFileWriter$AttributeWriter);
    }

    public void add(int n6, int n10, int n11, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter) {
        ++this.fieldCount;
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        this.output.writeShort(n11);
        ClassFileWriter.writeAttribute(this.output, classFileWriter$AttributeWriter, 0);
    }

    int size() {
        return this.fieldCount;
    }

    int dataSize() {
        return this.output.size();
    }

    void write(OutputStream outputStream) throws IOException {
        this.output.writeTo(outputStream);
    }
}

