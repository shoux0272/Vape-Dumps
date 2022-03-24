/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.ConstPool;

public class SyntheticAttribute
extends AttributeInfo {
    public static final String tag = "Synthetic";

    SyntheticAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public SyntheticAttribute(ConstPool constPool) {
        super(constPool, tag, new byte[0]);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        return new SyntheticAttribute(constPool);
    }
}

