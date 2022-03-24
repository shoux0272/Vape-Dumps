/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.bytecode.stackmap.BasicBlock;
import javassist.bytecode.stackmap.BasicBlock$Maker;
import javassist.bytecode.stackmap.TypedBlock;

public class TypedBlock$Maker
extends BasicBlock$Maker {
    @Override
    protected BasicBlock makeBlock(int n6) {
        return new TypedBlock(n6);
    }

    @Override
    protected BasicBlock[] makeArray(int n6) {
        return new TypedBlock[n6];
    }
}

