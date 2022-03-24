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
import javassist.bytecode.Descriptor;

class ClassInfo
extends ConstInfo {
    static final int tag = 7;
    int name;

    public ClassInfo(int n6, int n10) {
        super(n10);
        this.name = n6;
    }

    public ClassInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.name = dataInputStream.readUnsignedShort();
    }

    public int hashCode() {
        return this.name;
    }

    public boolean equals(Object object) {
        return object instanceof ClassInfo && ((ClassInfo)object).name == this.name;
    }

    @Override
    public int getTag() {
        return 7;
    }

    @Override
    public String getClassName(ConstPool constPool) {
        return constPool.getUtf8Info(this.name);
    }

    @Override
    public void renameClass(ConstPool constPool, String string, String string2, Map<ConstInfo, ConstInfo> map) {
        String string3;
        String string4 = constPool.getUtf8Info(this.name);
        String string5 = null;
        if (string4.equals(string)) {
            string5 = string2;
        } else if (string4.charAt(0) == '[' && string4 != (string3 = Descriptor.rename(string4, string, string2))) {
            string5 = string3;
        }
        if (string5 != null) {
            if (map == null) {
                this.name = constPool.addUtf8Info(string5);
            } else {
                map.remove(this);
                this.name = constPool.addUtf8Info(string5);
                map.put(this, this);
            }
        }
    }

    @Override
    public void renameClass(ConstPool constPool, Map<String, String> map, Map<ConstInfo, ConstInfo> map2) {
        String string = constPool.getUtf8Info(this.name);
        String string2 = null;
        if (string.charAt(0) == '[') {
            String string3 = Descriptor.rename(string, map);
            if (string != string3) {
                string2 = string3;
            }
        } else {
            String string4 = map.get(string);
            if (string4 != null && !string4.equals(string)) {
                string2 = string4;
            }
        }
        if (string2 != null) {
            if (map2 == null) {
                this.name = constPool.addUtf8Info(string2);
            } else {
                map2.remove(this);
                this.name = constPool.addUtf8Info(string2);
                map2.put(this, this);
            }
        }
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        String string;
        String string2 = constPool.getUtf8Info(this.name);
        if (map != null && (string = map.get(string2)) != null) {
            string2 = string;
        }
        return constPool2.addClassInfo(string2);
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(7);
        dataOutputStream.writeShort(this.name);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("Class #");
        printWriter.println(this.name);
    }
}

