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

class StringInfo
extends ConstInfo {
    static final int tag = 8;
    int string;

    public StringInfo(int n6, int n10) {
        super(n10);
        this.string = n6;
    }

    public StringInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.string = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.string;
    }

    public boolean equals(Object object) {
        return object instanceof StringInfo && ((StringInfo)object).string == this.string;
    }

    @Override
    public int getTag() {
        return 8;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addStringInfo(constPool.getUtf8Info(this.string));
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(8);
        dataOutputStream.writeShort(this.string);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("String #");
        printWriter.println(this.string);
    }
}

