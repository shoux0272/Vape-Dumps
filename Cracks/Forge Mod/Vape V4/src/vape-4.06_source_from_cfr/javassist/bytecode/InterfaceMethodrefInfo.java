/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MemberrefInfo;

class InterfaceMethodrefInfo
extends MemberrefInfo {
    static final int tag = 11;

    public InterfaceMethodrefInfo(int n6, int n10, int n11) {
        super(n6, n10, n11);
    }

    public InterfaceMethodrefInfo(DataInputStream dataInputStream, int n6) throws IOException {
        super(dataInputStream, n6);
    }

    @Override
    public int getTag() {
        return 11;
    }

    @Override
    public String getTagName() {
        return "Interface";
    }

    @Override
    protected int copy2(ConstPool constPool, int n6, int n10) {
        return constPool.addInterfaceMethodrefInfo(n6, n10);
    }
}

