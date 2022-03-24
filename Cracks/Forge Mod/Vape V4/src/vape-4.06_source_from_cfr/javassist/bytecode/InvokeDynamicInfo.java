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

class InvokeDynamicInfo
extends ConstInfo {
    static final int tag = 18;
    int bootstrap;
    int nameAndType;

    public InvokeDynamicInfo(int n6, int n10, int n11) {
        super(n11);
        this.bootstrap = n6;
        this.nameAndType = n10;
    }

    public InvokeDynamicInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.bootstrap = dataInputStream.readUnsignedShort();
        this.nameAndType = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.bootstrap << 16 ^ this.nameAndType;
    }

    public boolean equals(Object object) {
        if (object instanceof InvokeDynamicInfo) {
            InvokeDynamicInfo invokeDynamicInfo = (InvokeDynamicInfo)object;
            return invokeDynamicInfo.bootstrap == this.bootstrap && invokeDynamicInfo.nameAndType == this.nameAndType;
        }
        return false;
    }

    @Override
    public int getTag() {
        return 18;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addInvokeDynamicInfo(this.bootstrap, constPool.getItem(this.nameAndType).copy(constPool, constPool2, map));
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(18);
        dataOutputStream.writeShort(this.bootstrap);
        dataOutputStream.writeShort(this.nameAndType);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("InvokeDynamic #");
        printWriter.print(this.bootstrap);
        printWriter.print(", name&type #");
        printWriter.println(this.nameAndType);
    }
}

