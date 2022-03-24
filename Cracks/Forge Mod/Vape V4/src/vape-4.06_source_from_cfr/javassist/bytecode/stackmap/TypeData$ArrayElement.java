/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.List;
import java.util.Set;
import javassist.ClassPool;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$AbsTypeVar;
import javassist.bytecode.stackmap.TypeData$ArrayType;
import javassist.bytecode.stackmap.TypeData$BasicType;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeData$TypeVar;

public class TypeData$ArrayElement
extends TypeData$AbsTypeVar {
    private TypeData$AbsTypeVar array;

    private TypeData$ArrayElement(TypeData$AbsTypeVar typeData$AbsTypeVar) {
        this.array = typeData$AbsTypeVar;
    }

    public static TypeData make(TypeData typeData) throws BadBytecode {
        if (typeData instanceof TypeData$ArrayType) {
            return ((TypeData$ArrayType)typeData).elementType();
        }
        if (typeData instanceof TypeData$AbsTypeVar) {
            return new TypeData$ArrayElement((TypeData$AbsTypeVar)typeData);
        }
        if (typeData instanceof TypeData$ClassName && !typeData.isNullType()) {
            return new TypeData$ClassName(TypeData$ArrayElement.typeName(typeData.getName()));
        }
        throw new BadBytecode("bad AASTORE: " + typeData);
    }

    @Override
    public void merge(TypeData typeData) {
        try {
            if (!typeData.isNullType()) {
                this.array.merge(TypeData$ArrayType.make(typeData));
            }
        }
        catch (BadBytecode badBytecode) {
            throw new RuntimeException("fatal: " + badBytecode);
        }
    }

    @Override
    public String getName() {
        return TypeData$ArrayElement.typeName(this.array.getName());
    }

    public TypeData$AbsTypeVar arrayType() {
        return this.array;
    }

    @Override
    public TypeData$BasicType isBasicType() {
        return null;
    }

    @Override
    public boolean is2WordType() {
        return false;
    }

    private static String typeName(String string) {
        if (string.length() > 1 && string.charAt(0) == '[') {
            char c3 = string.charAt(1);
            if (c3 == 'L') {
                return string.substring(2, string.length() - 1).replace('/', '.');
            }
            if (c3 == '[') {
                return string.substring(1);
            }
        }
        return "java.lang.Object";
    }

    @Override
    public void setType(String string, ClassPool classPool) throws BadBytecode {
        this.array.setType(TypeData$ArrayType.typeName(string), classPool);
    }

    @Override
    protected TypeData.TypeVar toTypeVar(int n6) {
        return this.array.toTypeVar(n6 - 1);
    }

    @Override
    public TypeData getArrayType(int n6) throws NotFoundException {
        return this.array.getArrayType(n6 - 1);
    }

    @Override
    public int dfs(List<TypeData> list, int n6, ClassPool classPool) throws NotFoundException {
        return this.array.dfs(list, n6, classPool);
    }

    @Override
    String toString2(Set<TypeData> set) {
        return "*" + this.array.toString2(set);
    }

    static String access$000(String string) {
        return TypeData$ArrayElement.typeName(string);
    }
}

