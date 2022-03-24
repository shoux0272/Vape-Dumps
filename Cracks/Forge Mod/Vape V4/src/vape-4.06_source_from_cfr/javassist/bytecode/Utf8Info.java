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

class Utf8Info
extends ConstInfo {
    static final int tag = 1;
    String string;

    public Utf8Info(String string, int n6) {
        super(n6);
        this.string = string;
    }

    public Utf8Info(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.string = dataInputStream.readUTF();
    }

    public int hashCode() {
        return this.string.hashCode();
    }

    public boolean equals(Object object) {
        return object instanceof Utf8Info && ((Utf8Info)object).string.equals(this.string);
    }

    @Override
    public int getTag() {
        return 1;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addUtf8Info(this.string);
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(1);
        dataOutputStream.writeUTF(this.string);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("UTF8 \"");
        printWriter.print(this.string);
        printWriter.println("\"");
    }
}

