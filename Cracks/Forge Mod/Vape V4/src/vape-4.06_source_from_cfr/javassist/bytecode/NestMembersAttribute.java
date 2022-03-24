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

public class NestMembersAttribute
extends AttributeInfo {
    public static final String tag = "NestMembers";

    NestMembersAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    private NestMembersAttribute(ConstPool constPool, byte[] arrby) {
        super(constPool, tag, arrby);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        byte[] arrby = this.get();
        byte[] arrby2 = new byte[arrby.length];
        ConstPool constPool2 = this.getConstPool();
        int n6 = ByteArray.readU16bit(arrby, 0);
        ByteArray.write16bit(n6, arrby2, 0);
        int n10 = 0;
        int n11 = 2;
        while (n10 < n6) {
            int n12 = ByteArray.readU16bit(arrby, n11);
            int n13 = constPool2.copy(n12, constPool, map);
            ByteArray.write16bit(n13, arrby2, n11);
            ++n10;
            n11 += 2;
        }
        return new NestMembersAttribute(constPool, arrby2);
    }

    public int numberOfClasses() {
        return ByteArray.readU16bit(this.info, 0);
    }

    public int memberClass(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 2 + 2);
    }
}

