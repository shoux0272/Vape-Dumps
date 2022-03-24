/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javassist.bytecode.ConstInfo;
import javassist.bytecode.ConstPool;

class DoubleInfo
extends ConstInfo {
    static final int tag = 6;
    double value;

    public DoubleInfo(double d10, int n6) {
        super(n6);
        this.value = d10;
    }

    public DoubleInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.value = dataInputStream.readDouble();
    }

    public int hashCode() {
        long l = Double.doubleToLongBits(this.value);
        return (int)(l ^ l >>> 32);
    }

    public boolean equals(Object object) {
        return object instanceof DoubleInfo && ((DoubleInfo)object).value == this.value;
    }

    @Override
    public int getTag() {
        return 6;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addDoubleInfo(this.value);
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(6);
        dataOutputStream.writeDouble(this.value);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("Double ");
        printWriter.println(this.value);
    }
}

