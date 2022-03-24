/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javassist.bytecode.ConstInfo;
import javassist.bytecode.ConstPool;

class ConstInfoPadding
extends ConstInfo {
    public ConstInfoPadding(int n6) {
        super(n6);
    }

    @Override
    public int getTag() {
        return 0;
    }

    @Override
    public int copy(ConstPool constPool, ConstPool constPool2, Map<String, String> map) {
        return constPool2.addConstInfoPadding();
    }

    @Override
    public void write(DataOutputStream dataOutputStream) throws IOException {
    }

    @Override
    public void print(PrintWriter printWriter) {
        printWriter.println("padding");
    }
}

