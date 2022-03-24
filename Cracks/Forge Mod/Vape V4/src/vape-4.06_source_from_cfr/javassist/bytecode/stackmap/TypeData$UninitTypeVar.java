/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.Set;
import javassist.ClassPool;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$AbsTypeVar;
import javassist.bytecode.stackmap.TypeData$BasicType;
import javassist.bytecode.stackmap.TypeData$TypeVar;
import javassist.bytecode.stackmap.TypeData$UninitData;
import javassist.bytecode.stackmap.TypeTag;

public class TypeData$UninitTypeVar
extends TypeData$AbsTypeVar {
    protected TypeData type;

    public TypeData$UninitTypeVar(TypeData$UninitData typeData$UninitData) {
        this.type = typeData$UninitData;
    }

    @Override
    public int getTypeTag() {
        return this.type.getTypeTag();
    }

    @Override
    public int getTypeData(ConstPool constPool) {
        return this.type.getTypeData(constPool);
    }

    @Override
    public TypeData$BasicType isBasicType() {
        return this.type.isBasicType();
    }

    @Override
    public boolean is2WordType() {
        return this.type.is2WordType();
    }

    @Override
    public boolean isUninit() {
        return this.type.isUninit();
    }

    @Override
    public boolean eq(TypeData typeData) {
        return this.type.eq(typeData);
    }

    @Override
    public String getName() {
        return this.type.getName();
    }

    @Override
    protected TypeData$TypeVar toTypeVar(int n6) {
        return null;
    }

    @Override
    public TypeData join() {
        return this.type.join();
    }

    @Override
    public void setType(String string, ClassPool classPool) throws BadBytecode {
        this.type.setType(string, classPool);
    }

    @Override
    public void merge(TypeData typeData) {
        if (!typeData.eq(this.type)) {
            this.type = TypeTag.TOP;
        }
    }

    @Override
    public void constructorCalled(int n6) {
        this.type.constructorCalled(n6);
    }

    public int offset() {
        if (this.type instanceof TypeData$UninitData) {
            return ((TypeData$UninitData)this.type).offset;
        }
        throw new RuntimeException("not available");
    }

    @Override
    public TypeData getArrayType(int n6) throws NotFoundException {
        return this.type.getArrayType(n6);
    }

    @Override
    String toString2(Set<TypeData> set) {
        return "";
    }
}

