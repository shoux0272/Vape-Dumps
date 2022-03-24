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

class IntegerInfo
extends ConstInfo {
    static final int tag = 3;
    int value;

    public IntegerInfo(int n6, int n10) {
        super(n10);
        this.value = n6;
    }

    public IntegerInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.value = dataInputStream.readInt();
    }

    public int hashCode() {
        return this.value;
    }

    public boolean equals(Object object) {
        return object instanceof IntegerInfo && ((IntegerInfo)object).value == this.value;
    }

    @Override
    public int getTag() {
        return 3;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addIntegerInfo(this.value);
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(3);
        dataOutputStream.writeInt(this.value);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("Integer ");
        printWriter.println(this.value);
    }
}

