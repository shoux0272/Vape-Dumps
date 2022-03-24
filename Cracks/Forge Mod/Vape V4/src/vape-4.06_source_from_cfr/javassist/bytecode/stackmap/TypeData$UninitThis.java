/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.Set;
import javassist.bytecode.ConstPool;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$UninitData;

public class TypeData$UninitThis
extends TypeData$UninitData {
    TypeData$UninitThis(String string) {
        super(-1, string);
    }

    @Override
    public TypeData$UninitData copy() {
        return new TypeData$UninitThis(this.getName());
    }

    @Override
    public int getTypeTag() {
        return 6;
    }

    @Override
    public int getTypeData(ConstPool constPool) {
        return 0;
    }

    @Override
    String toString2(Set<TypeData> set) {
        return "uninit:this";
    }
}

