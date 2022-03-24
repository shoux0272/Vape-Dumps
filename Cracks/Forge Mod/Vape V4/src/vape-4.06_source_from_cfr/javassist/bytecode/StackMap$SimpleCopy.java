/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$Walker;
import javassist.bytecode.StackMap$Writer;

class StackMap$SimpleCopy
extends StackMap$Walker {
    StackMap$Writer writer = new StackMap$Writer();

    StackMap$SimpleCopy(StackMap stackMap) {
        super(stackMap);
    }

    byte[] doit() {
        this.visit();
        return this.writer.toByteArray();
    }

    @Override
    public void visit() {
        int n6 = ByteArray.readU16bit(this.info, 0);
        this.writer.write16bit(n6);
        super.visit();
    }

    @Override
    public int locals(int n6, int n10, int n11) {
        this.writer.write16bit(n10);
        return super.locals(n6, n10, n11);
    }

    @Override
    public int typeInfoArray(int n6, int n10, int n11, boolean bl) {
        this.writer.write16bit(n11);
        return super.typeInfoArray(n6, n10, n11, bl);
    }

    @Override
    public void typeInfo(int n6, byte by) {
        this.writer.writeVerifyTypeInfo(by, 0);
    }

    @Override
    public void objectVariable(int n6, int n10) {
        this.writer.writeVerifyTypeInfo(7, n10);
    }

    @Override
    public void uninitialized(int n6, int n10) {
        this.writer.writeVerifyTypeInfo(8, n10);
    }
}

