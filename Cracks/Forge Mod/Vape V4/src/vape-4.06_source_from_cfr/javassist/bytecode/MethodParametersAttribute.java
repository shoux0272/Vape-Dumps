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

public class MethodParametersAttribute
extends AttributeInfo {
    public static final String tag = "MethodParameters";

    MethodParametersAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public MethodParametersAttribute(ConstPool constPool, String[] arrstring, int[] arrn) {
        super(constPool, tag);
        byte[] arrby = new byte[arrstring.length * 4 + 1];
        arrby[0] = (byte)arrstring.length;
        for (int k = 0; k < arrstring.length; ++k) {
            ByteArray.write16bit(constPool.addUtf8Info(arrstring[k]), arrby, k * 4 + 1);
            ByteArray.write16bit(arrn[k], arrby, k * 4 + 3);
        }
        this.set(arrby);
    }

    public int size() {
        return this.info[0] & 0xFF;
    }

    public int name(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 4 + 1);
    }

    public int accessFlags(int n6) {
        return ByteArray.readU16bit(this.info, n6 * 4 + 3);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        int n6 = this.size();
        ConstPool constPool2 = this.getConstPool();
        String[] arrstring = new String[n6];
        int[] arrn = new int[n6];
        for (int k = 0; k < n6; ++k) {
            arrstring[k] = constPool2.getUtf8Info(this.name(k));
            arrn[k] = this.accessFlags(k);
        }
        return new MethodParametersAttribute(constPool, arrstring, arrn);
    }
}

