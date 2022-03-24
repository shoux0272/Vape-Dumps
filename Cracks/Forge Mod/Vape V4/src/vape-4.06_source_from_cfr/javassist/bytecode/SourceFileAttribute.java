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

public class SourceFileAttribute
extends AttributeInfo {
    public static final String tag = "SourceFile";

    SourceFileAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public SourceFileAttribute(ConstPool constPool, String string) {
        super(constPool, tag);
        int n6 = constPool.addUtf8Info(string);
        byte[] arrby = new byte[]{(byte)(n6 >>> 8), (byte)n6};
        this.set(arrby);
    }

    public String getFileName() {
        return this.getConstPool().getUtf8Info(ByteArray.readU16bit(this.get(), 0));
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        return new SourceFileAttribute(constPool, this.getFileName());
    }
}

