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

public class NestHostAttribute
extends AttributeInfo {
    public static final String tag = "NestHost";

    NestHostAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    private NestHostAttribute(ConstPool constPool, int n6) {
        super(constPool, tag, new byte[2]);
        ByteArray.write16bit(n6, this.get(), 0);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        int n6 = ByteArray.readU16bit(this.get(), 0);
        int n10 = this.getConstPool().copy(n6, constPool, map);
        return new NestHostAttribute(constPool, n10);
    }

    public int hostClassIndex() {
        return ByteArray.readU16bit(this.info, 0);
    }
}

