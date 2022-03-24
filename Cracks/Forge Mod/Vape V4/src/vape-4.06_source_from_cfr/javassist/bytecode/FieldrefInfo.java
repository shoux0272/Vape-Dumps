/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MemberrefInfo;

class FieldrefInfo
extends MemberrefInfo {
    static final int tag = 9;

    public FieldrefInfo(int n6, int n10, int n11) {
        super(n6, n10, n11);
    }

    public FieldrefInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(dataInputStream, n6);
    }

    @Override
    public int getTag() {
        return 9;
    }

    @Override
    public String getTagName() {
        return "Field";
    }

    @Override
    protected int copy2(ConstPool constPool, int n6, int n10) {
        return constPool.addFieldrefInfo(n6, n10);
    }
}

