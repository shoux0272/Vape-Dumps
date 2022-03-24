/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.Map;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$Walker;

class StackMap$Copier
extends StackMap$Walker {
    byte[] dest;
    ConstPool srcCp;
    ConstPool destCp;
    Map<String, String> classnames;

    StackMap$Copier(StackMap stackMap, ConstPool constPool, Map<String, String> map) {
        super(stackMap);
        this.srcCp = stackMap.getConstPool();
        this.dest = new byte[this.info.length];
        this.destCp = constPool;
        this.classnames = map;
    }

    @Override
    public void visit() {
        int n6 = ByteArray.readU16bit(this.info, 0);
        ByteArray.write16bit(n6, this.dest, 0);
        super.visit();
    }

    @Override
    public int locals(int n6, int n10, int n11) {
        ByteArray.write16bit(n10, this.dest, n6 - 4);
        return super.locals(n6, n10, n11);
    }

    @Override
    public int typeInfoArray(int n6, int n10, int n11, boolean bl) {
        ByteArray.write16bit(n11, this.dest, n6 - 2);
        return super.typeInfoArray(n6, n10, n11, bl);
    }

    @Override
    public void typeInfo(int n6, byte by) {
        this.dest[n6] = by;
    }

    @Override
    public void objectVariable(int n6, int n10) {
        this.dest[n6] = 7;
        int n11 = this.srcCp.copy(n10, this.destCp, this.classnames);
        ByteArray.write16bit(n11, this.dest, n6 + 1);
    }

    @Override
    public void uninitialized(int n6, int n10) {
        this.dest[n6] = 8;
        ByteArray.write16bit(n10, this.dest, n6 + 1);
    }

    public StackMap getStackMap() {
        return new StackMap(this.destCp, this.dest);
    }
}

