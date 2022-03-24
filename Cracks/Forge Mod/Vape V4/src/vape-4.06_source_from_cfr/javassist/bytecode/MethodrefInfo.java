/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MemberrefInfo;

class MethodrefInfo
extends MemberrefInfo {
    static final int tag = 10;

    public MethodrefInfo(int n6, int n10, int n11) {
        super(n6, n10, n11);
    }

    public MethodrefInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(dataInputStream, n6);
    }

    @Override
    public int getTag() {
        return 10;
    }

    @Override
    public String getTagName() {
        return "Method";
    }

    @Override
    protected int copy2(ConstPool constPool, int n6, int n10) {
        return constPool.addMethodrefInfo(n6, n10);
    }
}

