/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import javassist.bytecode.ByteStream;
import javassist.bytecode.ClassFileWriter$AttributeWriter;
import javassist.bytecode.ClassFileWriter$ConstPoolWriter;
import javassist.bytecode.ClassFileWriter$FieldWriter;
import javassist.bytecode.ClassFileWriter$MethodWriter;

public class ClassFileWriter {
    private ByteStream output = new ByteStream(512);
    private ClassFileWriter$ConstPoolWriter constPool;
    private ClassFileWriter$FieldWriter fields;
    private ClassFileWriter$MethodWriter methods;
    int thisClass;
    int superClass;

    public ClassFileWriter(int n6, int n10) {
        this.output.writeInt(-889275714);
        this.output.writeShort(n10);
        this.output.writeShort(n6);
        this.constPool = new ClassFileWriter$ConstPoolWriter(this.output);
        this.fields = new ClassFileWriter$FieldWriter(this.constPool);
        this.methods = new ClassFileWriter$MethodWriter(this.constPool);
    }

    public ClassFileWriter$ConstPoolWriter getConstPool() {
        return this.constPool;
    }

    public ClassFileWriter$FieldWriter getFieldWriter() {
        return this.fields;
    }

    public ClassFileWriter$MethodWriter getMethodWriter() {
        return this.methods;
    }

    public byte[] end(int n6, int n10, int n11, int[] arrn, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter) {
        this.constPool.end();
        this.output.writeShort(n6);
        this.output.writeShort(n10);
        this.output.writeShort(n11);
        if (arrn == null) {
            this.output.writeShort(0);
        } else {
            int n12 = arrn.length;
            this.output.writeShort(n12);
            for (int k = 0; k < n12; ++k) {
                this.output.writeShort(arrn[k]);
            }
        }
        this.output.enlarge(this.fields.dataSize() + this.methods.dataSize() + 6);
        try {
            this.output.writeShort(this.fields.size());
            this.fields.write(this.output);
            this.output.writeShort(this.methods.numOfMethods());
            this.methods.write(this.output);
        }
        catch (IOException iOException) {
            // empty catch block
        }
        ClassFileWriter.writeAttribute(this.output, classFileWriter$AttributeWriter, 0);
        return this.output.toByteArray();
    }

    public void end(DataOutputStream dataOutputStream, int n6, int n10, int n11, int[] arrn, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter) throws IOException {
        this.constPool.end();
        this.output.writeTo(dataOutputStream);
        dataOutputStream.writeShort(n6);
        dataOutputStream.writeShort(n10);
        dataOutputStream.writeShort(n11);
        if (arrn == null) {
            dataOutputStream.writeShort(0);
        } else {
            int n12 = arrn.length;
            dataOutputStream.writeShort(n12);
            for (int k = 0; k < n12; ++k) {
                dataOutputStream.writeShort(arrn[k]);
            }
        }
        dataOutputStream.writeShort(this.fields.size());
        this.fields.write(dataOutputStream);
        dataOutputStream.writeShort(this.methods.numOfMethods());
        this.methods.write(dataOutputStream);
        if (classFileWriter$AttributeWriter == null) {
            dataOutputStream.writeShort(0);
        } else {
            dataOutputStream.writeShort(classFileWriter$AttributeWriter.size());
            classFileWriter$AttributeWriter.write(dataOutputStream);
        }
    }

    static void writeAttribute(ByteStream byteStream, ClassFileWriter$AttributeWriter classFileWriter$AttributeWriter, int n6) {
        if (classFileWriter$AttributeWriter == null) {
            byteStream.writeShort(n6);
            return;
        }
        byteStream.writeShort(classFileWriter$AttributeWriter.size() + n6);
        DataOutputStream dataOutputStream = new DataOutputStream(byteStream);
        try {
            classFileWriter$AttributeWriter.write(dataOutputStream);
            dataOutputStream.flush();
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

