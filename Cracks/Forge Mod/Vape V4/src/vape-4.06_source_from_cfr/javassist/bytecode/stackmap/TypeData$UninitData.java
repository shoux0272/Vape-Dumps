/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.Set;
import javassist.bytecode.ConstPool;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeData$TypeVar;
import javassist.bytecode.stackmap.TypeData$UninitTypeVar;

public class TypeData$UninitData
extends TypeData$ClassName {
    int offset;
    boolean initialized;

    TypeData$UninitData(int n6, String string) {
        super(string);
        this.offset = n6;
        this.initialized = false;
    }

    public TypeData$UninitData copy() {
        return new TypeData$UninitData(this.offset, this.getName());
    }

    @Override
    public int getTypeTag() {
        return 8;
    }

    @Override
    public int getTypeData(ConstPool constPool) {
        return this.offset;
    }

    @Override
    public TypeData join() {
        if (this.initialized) {
            return new TypeData$TypeVar(new TypeData$ClassName(this.getName()));
        }
        return new TypeData$UninitTypeVar(this.copy());
    }

    @Override
    public boolean isUninit() {
        return true;
    }

    @Override
    public boolean eq(TypeData typeData) {
        if (typeData instanceof TypeData$UninitData) {
            TypeData$UninitData typeData$UninitData = (TypeData$UninitData)typeData;
            return this.offset == typeData$UninitData.offset && this.getName().equals(typeData$UninitData.getName());
        }
        return false;
    }

    public int offset() {
        return this.offset;
    }

    @Override
    public void constructorCalled(int n6) {
        if (n6 == this.offset) {
            this.initialized = true;
        }
    }

    @Override
    String toString2(Set<TypeData> set) {
        return this.getName() + "," + this.offset;
    }
}

