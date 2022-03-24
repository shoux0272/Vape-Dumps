/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Map;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.SignatureAttribute;

public class LocalVariableTypeAttribute
extends LocalVariableAttribute {
    public static final String tag = "LocalVariableTypeTable";

    public LocalVariableTypeAttribute(ConstPool constPool) {
        super(constPool, tag, new byte[2]);
        ByteArray.write16bit(0, this.info, 0);
    }

    LocalVariableTypeAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    private LocalVariableTypeAttribute(ConstPool constPool, byte[] arrby) {
        super(constPool, tag, arrby);
    }

    @Override
    String renameEntry(String string, String string2, String string3) {
        return SignatureAttribute.renameClass(string, string2, string3);
    }

    @Override
    String renameEntry(String string, Map<String, String> map) {
        return SignatureAttribute.renameClass(string, map);
    }

    @Override
    LocalVariableAttribute makeThisAttr(ConstPool constPool, byte[] arrby) {
        return new LocalVariableTypeAttribute(constPool, arrby);
    }
}

