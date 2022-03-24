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

class PackageInfo
extends ConstInfo {
    static final int tag = 20;
    int name;

    public PackageInfo(int n6, int n10) {
        super(n10);
        this.name = n6;
    }

    public PackageInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.name = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.name;
    }

    public boolean equals(Object object) {
        return object instanceof PackageInfo && ((PackageInfo)object).name == this.name;
    }

    @Override
    public int getTag() {
        return 20;
    }

    public String getPackageName(ConstPool constPool) {
        return constPool.getUtf8Info(this.name);
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        String string = constPool.getUtf8Info(this.name);
        int n6 = constPool2.addUtf8Info(string);
        return constPool2.addModuleInfo(n6);
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(20);
        dataOutputStream.writeShort(this.name);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("Package #");
        printWriter.println(this.name);
    }
}

