/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.ByteArrayOutputStream;
import javassist.bytecode.ConstPool;
import javassist.bytecode.StackMap;

public class StackMap$Writer {
    private ByteArrayOutputStream output = new ByteArrayOutputStream();

    public byte[] toByteArray() {
        return this.output.toByteArray();
    }

    public StackMap toStackMap(ConstPool constPool) {
        return new StackMap(constPool, this.output.toByteArray());
    }

    public void writeVerifyTypeInfo(int n6, int n10) {
        this.output.write(n6);
        if (n6 == 7 || n6 == 8) {
            this.write16bit(n10);
        }
    }

    public void write16bit(int n6) {
        this.output.write(n6 >>> 8 & 0xFF);
        this.output.write(n6 & 0xFF);
    }
}

