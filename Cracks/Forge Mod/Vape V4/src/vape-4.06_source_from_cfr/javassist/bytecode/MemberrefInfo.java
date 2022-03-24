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

abstract class MemberrefInfo
extends ConstInfo {
    int classIndex;
    int nameAndTypeIndex;

    public MemberrefInfo(int n6, int n10, int n11) {
        super(n11);
        this.classIndex = n6;
        this.nameAndTypeIndex = n10;
    }

    public MemberrefInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.classIndex = dataInputStream.readUnsignedShort();
        this.nameAndTypeIndex = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.classIndex << 16 ^ this.nameAndTypeIndex;
    }

    public boolean equals(Object object) {
        if (object instanceof MemberrefInfo) {
            MemberrefInfo memberrefInfo = (MemberrefInfo)object;
            return memberrefInfo.classIndex == this.classIndex && memberrefInfo.nameAndTypeIndex == this.nameAndTypeIndex && memberrefInfo.getClass() == this.getClass();
        }
        return false;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        int n6 = constPool.getItem(this.classIndex).copy(constPool, constPool2, map);
        int n10 = constPool.getItem(this.nameAndTypeIndex).copy(constPool, constPool2, map);
        return this.copy2(constPool2, n6, n10);
    }

    protected abstract int copy2(ConstPool var1, int var2, int var3);

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(this.getTag());
        dataOutputStream.writeShort(this.classIndex);
        dataOutputStream.writeShort(this.nameAndTypeIndex);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print(this.getTagName() + " #");
        printWriter.print(this.classIndex);
        printWriter.print(", name&type #");
        printWriter.println(this.nameAndTypeIndex);
    }

    public abstract String getTagName();
}

