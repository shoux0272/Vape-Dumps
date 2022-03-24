/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;

public class LocalVariableAttribute
extends AttributeInfo {
    public static final String tag = "LocalVariableTable";
    public static final String typeTag = "LocalVariableTypeTable";

    public LocalVariableAttribute(ConstPool constPool) {
        super(constPool, tag, new byte[2]);
        ByteArray.write16bit(0, this.info, 0);
    }

    public LocalVariableAttribute(ConstPool constPool, String string) {
        super(constPool, string, new byte[2]);
        ByteArray.write16bit(0, this.info, 0);
    }

    LocalVariableAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    LocalVariableAttribute(ConstPool constPool, String string, byte[] arrby) {
        super(constPool, string, arrby);
    }

    public void addEntry(int n6, int n10, int n11, int n12, int n13) {
        int n14 = this.info.length;
        byte[] arrby = new byte[n14 + 10];
        ByteArray.write16bit(this.tableLength() + 1, arrby, 0);
        for (int k = 2; k < n14; ++k) {
            arrby[k] = this.info[k];
        }
        ByteArray.write16bit(n6, arrby, n14);
        ByteArray.write16bit(n10, arrby, n14 + 2);
        ByteArray.write16bit(n11, arrby, n14 + 4);
        ByteArray.write16bit(n12, arrby, n14 + 6);
        ByteArray.write16bit(n13, arrby, n14 + 8);
        this.info = arrby;
    }

    @Override
    void renameClass(String string, String string2) {
        ConstPool constPool = this.getConstPool();
        int n6 = this.tableLength();
        for (int k = 0; k < n6; ++k) {
            int n10 = k * 10 + 2;
            int n11 = ByteArray.readU16bit(this.info, n10 + 6);
            if (n11 == 0) continue;
            String string3 = constPool.getUtf8Info(n11);
            string3 = this.renameEntry(string3, string, string2);
            ByteArray.write16bit(constPool.addUtf8Info(string3), this.info, n10 + 6);
        }
    }

    String renameEntry(String string, String string2, String string3) {
        return Descriptor.rename(string, string2, string3);
    }

    @Override
    void renameClass(Map<String, String> map) {
        ConstPool constPool = this.getConstPool();
        int n6 = this.tableLength();
        for (int k = 0; k < n6; ++k) {
            int n10 = k * 10 + 2;
            int n11 = ByteArray.readU16bit(this.info, n10 + 6);
            if (n11 == 0) continue;
            String string = constPool.getUtf8Info(n11);
            string = this.renameEntry(string, map);
            ByteArray.write16bit(constPool.addUtf8Info(string), this.info, n10 + 6);
        }
    }

    String renameEntry(String string, Map<String, String> map) {
        return Descriptor.rename(string, map);
    }

    public void shiftIndex(int n6, int n10) {
        int n11 = this.info.length;
        for (int k = 2; k < n11; k += 10) {
            int n12 = ByteArray.readU16bit(this.info, k + 8);
            if (n12 < n6) continue;
            ByteArray.write16bit(n12 + n10, this.info, k + 8);
        }
    }

    public int tableLength() {
        return ByteArray.readU16bit(this.info, 0);
    }

    public int startPc(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 10 + 2);
    }

    public int codeLength(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 10 + 4);
    }

    void shiftPc(int n6, int n10, boolean bl) {
        int n11 = this.tableLength();
        for (int k = 0; k < n11; ++k) {
            int n12 = k * 10 + 2;
            int n13 = ByteArray.readU16bit(this.info, n12);
            int n14 = ByteArray.readU16bit(this.info, n12 + 2);
            if (n13 > n6 || bl && n13 == n6 && n13 != 0) {
                ByteArray.write16bit(n13 + n10, this.info, n12);
                continue;
            }
            if (n13 + n14 <= n6 && (!bl || n13 + n14 != n6)) continue;
            ByteArray.write16bit(n14 + n10, this.info, n12 + 2);
        }
    }

    public int nameIndex(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 10 + 6);
    }

    public String variableName(int n6) {
        return this.getConstPool().getUtf8Info(this.nameIndex(n6));
    }

    public int descriptorIndex(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 10 + 8);
    }

    public int signatureIndex(int n6) {
        return this.descriptorIndex(n6);
    }

    public String descriptor(int n6) {
        return this.getConstPool().getUtf8Info(this.descriptorIndex(n6));
    }

    public String signature(int n6) {
        return this.descriptor(n6);
    }

    public int index(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 10 + 10);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        byte[] arrby = this.get();
        byte[] arrby2 = new byte[arrby.length];
        ConstPool constPool2 = this.getConstPool();
        LocalVariableAttribute localVariableAttribute = this.makeThisAttr(constPool, arrby2);
        int n6 = ByteArray.readU16bit(arrby, 0);
        ByteArray.write16bit(n6, arrby2, 0);
        int n10 = 2;
        for (int k = 0; k < n6; ++k) {
            int n11 = ByteArray.readU16bit(arrby, n10);
            int n12 = ByteArray.readU16bit(arrby, n10 + 2);
            int n13 = ByteArray.readU16bit(arrby, n10 + 4);
            int n14 = ByteArray.readU16bit(arrby, n10 + 6);
            int n15 = ByteArray.readU16bit(arrby, n10 + 8);
            ByteArray.write16bit(n11, arrby2, n10);
            ByteArray.write16bit(n12, arrby2, n10 + 2);
            if (n13 != 0) {
                n13 = constPool2.copy(n13, constPool, null);
            }
            ByteArray.write16bit(n13, arrby2, n10 + 4);
            if (n14 != 0) {
                String string = constPool2.getUtf8Info(n14);
                string = Descriptor.rename(string, map);
                n14 = constPool.addUtf8Info(string);
            }
            ByteArray.write16bit(n14, arrby2, n10 + 6);
            ByteArray.write16bit(n15, arrby2, n10 + 8);
            n10 += 10;
        }
        return localVariableAttribute;
    }

    LocalVariableAttribute makeThisAttr(ConstPool constPool, byte[] arrby) {
        return new LocalVariableAttribute(constPool, tag, arrby);
    }
}

