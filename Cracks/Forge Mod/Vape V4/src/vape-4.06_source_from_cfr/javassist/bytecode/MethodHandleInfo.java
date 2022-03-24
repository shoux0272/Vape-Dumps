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

class MethodHandleInfo
extends ConstInfo {
    static final int tag = 15;
    int refKind;
    int refIndex;

    public MethodHandleInfo(int n6, int n10, int n11) {
        super(n11);
        this.refKind = n6;
        this.refIndex = n10;
    }

    public MethodHandleInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.refKind = dataInputStream.readUnsignedByte();
        this.refIndex = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.refKind << 16 ^ this.refIndex;
    }

    public boolean equals(Object object) {
        if (object instanceof MethodHandleInfo) {
            MethodHandleInfo methodHandleInfo = (MethodHandleInfo)object;
            return methodHandleInfo.refKind == this.refKind && methodHandleInfo.refIndex == this.refIndex;
        }
        return false;
    }

    @Override
    public int getTag() {
        return 15;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addMethodHandleInfo(this.refKind, constPool.getItem(this.refIndex).copy(constPool, constPool2, map));
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(15);
        dataOutputStream.writeByte(this.refKind);
        dataOutputStream.writeShort(this.refIndex);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("MethodHandle #");
        printWriter.print(this.refKind);
        printWriter.print(", index #");
        printWriter.println(this.refIndex);
    }
}

