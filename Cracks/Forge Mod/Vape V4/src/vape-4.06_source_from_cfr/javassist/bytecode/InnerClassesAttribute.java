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

public class InnerClassesAttribute
extends AttributeInfo {
    public static final String tag = "InnerClasses";

    InnerClassesAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    private InnerClassesAttribute(ConstPool constPool, byte[] arrby) {
        super(constPool, tag, arrby);
    }

    public InnerClassesAttribute(ConstPool constPool) {
        super(constPool, tag, new byte[2]);
        ByteArray.write16bit(0, this.get(), 0);
    }

    public int tableLength() {
        return ByteArray.readU16bit(this.get(), 0);
    }

    public int innerClassIndex(int n6) {
        return ByteArray.readU16bit(this.get(), n6 * 8 + 2);
    }

    public String innerClass(int n6) {
        int n10 = this.innerClassIndex(n6);
        if (n10 == 0) {
            return null;
        }
        return this.constPool.getClassInfo(n10);
    }

    public void c(int n6, int n10) {
        ByteArray.write16bit(n10, this.get(), n6 * 8 + 2);
    }

    public int outerClassIndex(int n6) {
        return ByteArray.readU16bit(this.get(), n6 * 8 + 4);
    }

    public String outerClass(int n6) {
        int n10 = this.outerClassIndex(n6);
        if (n10 == 0) {
            return null;
        }
        return this.constPool.getClassInfo(n10);
    }

    public void a(int n6, int n10) {
        ByteArray.write16bit(n10, this.get(), n6 * 8 + 4);
    }

    public int innerNameIndex(int n6) {
        return ByteArray.readU16bit(this.get(), n6 * 8 + 6);
    }

    public String innerName(int n6) {
        int n10 = this.innerNameIndex(n6);
        if (n10 == 0) {
            return null;
        }
        return this.constPool.getUtf8Info(n10);
    }

    public void d(int n6, int n10) {
        ByteArray.write16bit(n10, this.get(), n6 * 8 + 6);
    }

    public int accessFlags(int n6) {
        return ByteArray.readU16bit(this.get(), n6 * 8 + 8);
    }

    public void setAccessFlags(int n6, int n10) {
        ByteArray.write16bit(n10, this.get(), n6 * 8 + 8);
    }

    public int find(String string) {
        int n6 = this.tableLength();
        for (int k = 0; k < n6; ++k) {
            if (!string.equals(this.innerClass(k))) continue;
            return k;
        }
        return -1;
    }

    public void append(String string, String string2, String string3, int n6) {
        int n10 = this.constPool.addClassInfo(string);
        int n11 = this.constPool.addClassInfo(string2);
        int n12 = this.constPool.addUtf8Info(string3);
        this.append(n10, n11, n12, n6);
    }

    public void append(int n6, int n10, int n11, int n12) {
        int n13;
        byte[] arrby = this.get();
        int n14 = arrby.length;
        byte[] arrby2 = new byte[n14 + 8];
        for (n13 = 2; n13 < n14; ++n13) {
            arrby2[n13] = arrby[n13];
        }
        n13 = ByteArray.readU16bit(arrby, 0);
        ByteArray.write16bit(n13 + 1, arrby2, 0);
        ByteArray.write16bit(n6, arrby2, n14);
        ByteArray.write16bit(n10, arrby2, n14 + 2);
        ByteArray.write16bit(n11, arrby2, n14 + 4);
        ByteArray.write16bit(n12, arrby2, n14 + 6);
        this.set(arrby2);
    }

    public int remove(int n6) {
        byte[] arrby = this.get();
        int n10 = arrby.length;
        if (n10 < 10) {
            return 0;
        }
        int n11 = ByteArray.readU16bit(arrby, 0);
        int n12 = 2 + n6 * 8;
        if (n11 <= n6) {
            return n11;
        }
        byte[] arrby2 = new byte[n10 - 8];
        ByteArray.write16bit(n11 - 1, arrby2, 0);
        int n13 = 2;
        int n14 = 2;
        while (n13 < n10) {
            if (n13 == n12) {
                n13 += 8;
                continue;
            }
            arrby2[n14++] = arrby[n13++];
        }
        this.set(arrby2);
        return n11 - 1;
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        byte[] arrby = this.get();
        byte[] arrby2 = new byte[arrby.length];
        ConstPool constPool2 = this.getConstPool();
        InnerClassesAttribute innerClassesAttribute = new InnerClassesAttribute(constPool, arrby2);
        int n6 = ByteArray.readU16bit(arrby, 0);
        ByteArray.write16bit(n6, arrby2, 0);
        int n10 = 2;
        for (int k = 0; k < n6; ++k) {
            int n11 = ByteArray.readU16bit(arrby, n10);
            int n12 = ByteArray.readU16bit(arrby, n10 + 2);
            int n13 = ByteArray.readU16bit(arrby, n10 + 4);
            int n14 = ByteArray.readU16bit(arrby, n10 + 6);
            if (n11 != 0) {
                n11 = constPool2.copy(n11, constPool, map);
            }
            ByteArray.write16bit(n11, arrby2, n10);
            if (n12 != 0) {
                n12 = constPool2.copy(n12, constPool, map);
            }
            ByteArray.write16bit(n12, arrby2, n10 + 2);
            if (n13 != 0) {
                n13 = constPool2.copy(n13, constPool, map);
            }
            ByteArray.write16bit(n13, arrby2, n10 + 4);
            ByteArray.write16bit(n14, arrby2, n10 + 6);
            n10 += 8;
        }
        return innerClassesAttribute;
    }
}

