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

public class ConstantAttribute
extends AttributeInfo {
    public static final String tag = "ConstantValue";

    ConstantAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public ConstantAttribute(ConstPool constPool, int n6) {
        super(constPool, tag);
        byte[] arrby = new byte[]{(byte)(n6 >>> 8), (byte)n6};
        this.set(arrby);
    }

    public int getConstantValue() {
        return ByteArray.readU16bit(this.get(), 0);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        int n6 = this.getConstPool().copy(this.getConstantValue(), constPool, map);
        return new ConstantAttribute(constPool, n6);
    }
}

