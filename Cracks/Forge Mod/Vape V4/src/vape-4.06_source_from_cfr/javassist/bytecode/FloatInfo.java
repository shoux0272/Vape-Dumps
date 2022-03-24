/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javassist.bytecode.ConstInfo;
import javassist.bytecode.ConstPool;

class FloatInfo
extends ConstInfo {
    static final int tag = 4;
    float value;

    public FloatInfo(float f10, int n6) {
        super(n6);
        this.value = f10;
    }

    public FloatInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(n6);
        this.value = dataInputStream.readFloat();
    }

    public int hashCode() {
        return Float.floatToIntBits(this.value);
    }

    public boolean equals(Object object) {
        return object instanceof FloatInfo && ((FloatInfo)object).value == this.value;
    }

    @Override
    public int getTag() {
        return 4;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addFloatInfo(this.value);
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeByte(4);
        dataOutputStream.writeFloat(this.value);
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.print("Float ");
        printWriter.println(this.value);
    }
}

