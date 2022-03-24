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
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeTag;

public class TypeData$BasicType
extends TypeData {
    private String name;
    private int typeTag;
    private char decodedName;

    public TypeData$BasicType(String string, int n6, char c3) {
        this.name = string;
        this.typeTag = n6;
        this.decodedName = c3;
    }

    @Override
    public int getTypeTag() {
        return this.typeTag;
    }

    @Override
    public int getTypeData(ConstPool constPool) {
        return 0;
    }

    @Override
    public TypeData join() {
        if (this == TypeTag.TOP) {
            return this;
        }
        return super.join();
    }

    @Override
    public TypeData$BasicType isBasicType() {
        return this;
    }

    @Override
    public boolean is2WordType() {
        return this.typeTag == 4 || this.typeTag == 3;
    }

    @Override
    public boolean eq(TypeData typeData) {
        return this == typeData;
    }

    @Override
    public String getName() {
        return this.name;
    }

    public char getDecodedName() {
        return this.decodedName;
    }

    @Override
    public void setType(String string, ClassPool classPool) throws BadBytecode {
        throw new BadBytecode("conflict: " + this.name + " and " + string);
    }

    @Override
    public TypeData getArrayType(int n6) throws NotFoundException {
        if (this == TypeTag.TOP) {
            return this;
        }
        if (n6 < 0) {
            throw new NotFoundException("no element type: " + this.name);
        }
        if (n6 == 0) {
            return this;
        }
        char[] arrc = new char[n6 + 1];
        for (int k = 0; k < n6; ++k) {
            arrc[k] = 91;
        }
        arrc[n6] = this.decodedName;
        return new TypeData$ClassName(new String(arrc));
    }

    @Override
    String toString2(Set<TypeData> set) {
        return this.name;
    }

    static char access$100(TypeData$BasicType typeData$BasicType) {
        return typeData$BasicType.decodedName;
    }
}

