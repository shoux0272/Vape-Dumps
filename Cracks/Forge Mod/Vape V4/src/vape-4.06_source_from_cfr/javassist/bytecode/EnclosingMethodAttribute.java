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

public class EnclosingMethodAttribute
extends AttributeInfo {
    public static final String tag = "EnclosingMethod";

    EnclosingMethodAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public EnclosingMethodAttribute(ConstPool constPool, String string, String string2, String string3) {
        super(constPool, tag);
        int n6 = constPool.addClassInfo(string);
        int n10 = constPool.addNameAndTypeInfo(string2, string3);
        byte[] arrby = new byte[]{(byte)(n6 >>> 8), (byte)n6, (byte)(n10 >>> 8), (byte)n10};
        this.set(arrby);
    }

    public EnclosingMethodAttribute(ConstPool constPool, String string) {
        super(constPool, tag);
        int n6 = constPool.addClassInfo(string);
        int n10 = 0;
        byte[] arrby = new byte[]{(byte)(n6 >>> 8), (byte)n6, (byte)(n10 >>> 8), (byte)n10};
        this.set(arrby);
    }

    public int classIndex() {
        return ByteArray.readU16bit(this.get(), 0);
    }

    public int methodIndex() {
        return ByteArray.readU16bit(this.get(), 2);
    }

    public String className() {
        return this.getConstPool().getClassInfo(this.classIndex());
    }

    public String methodName() {
        ConstPool constPool = this.getConstPool();
        int n6 = this.methodIndex();
        if (n6 == 0) {
            return "<clinit>";
        }
        int n10 = constPool.getNameAndTypeName(n6);
        return constPool.getUtf8Info(n10);
    }

    public String methodDescriptor() {
        ConstPool constPool = this.getConstPool();
        int n6 = this.methodIndex();
        int n10 = constPool.getNameAndTypeDescriptor(n6);
        return constPool.getUtf8Info(n10);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        if (this.methodIndex() == 0) {
            return new EnclosingMethodAttribute(constPool, this.className());
        }
        return new EnclosingMethodAttribute(constPool, this.className(), this.methodName(), this.methodDescriptor());
    }
}

