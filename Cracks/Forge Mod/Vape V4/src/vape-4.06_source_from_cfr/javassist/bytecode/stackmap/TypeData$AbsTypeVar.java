/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.bytecode.ConstPool;
import javassist.bytecode.stackmap.TypeData;

public abstract class TypeData$AbsTypeVar
extends TypeData {
    public abstract void merge(TypeData var1);

    @Override
    public int getTypeTag() {
        return 7;
    }

    @Override
    public int getTypeData(ConstPool constPool) {
        return constPool.addClassInfo(this.getName());
    }

    @Override
    public boolean eq(TypeData typeData) {
        return this.getName().equals(typeData.getName());
    }
}

