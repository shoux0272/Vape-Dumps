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

class LongInfo
extends ConstInfo {
    static final int tag = 5;
    long value;

    public LongInfo(long l, int n6) {
        super(n6);
        this.value = l;
    }

    public LongInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.value = dataInputStream.readLong();
    }

    public int hashCode() {
        return (int)(this.value ^ this.value >>> 32);
    }

    public boolean equals(Object object) {
        return object instanceof LongInfo && ((LongInfo)object).value == this.value;
    }

    @Override
    public int getTag() {
        return 5;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addLongInfo(this.value);
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(5);
        dataOutputStream.writeLong(this.value);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("Long ");
        printWriter.println(this.value);
    }
}

