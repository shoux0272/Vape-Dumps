/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.bytecode.ConstPool;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$ClassName;

public class TypeData$NullType
extends TypeData$ClassName {
    public TypeData$NullType() {
        super("null-type");
    }

    @Override
    public int getTypeTag() {
        return 5;
    }

    @Override
    public boolean isNullType() {
        return true;
    }

    @Override
    public int getTypeData(ConstPool constPool) {
        return 0;
    }

    @Override
    public TypeData getArrayType(int n6) {
        return this;
    }
}

