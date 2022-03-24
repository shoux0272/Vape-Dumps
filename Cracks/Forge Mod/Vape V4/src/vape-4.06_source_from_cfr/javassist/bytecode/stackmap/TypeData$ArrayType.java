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
import javassist.bytecode.stackmap.TypeData$ArrayElement;
import javassist.bytecode.stackmap.TypeData$BasicType;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeData$TypeVar;

public class TypeData$ArrayType
extends TypeData$AbsTypeVar {
    private TypeData$AbsTypeVar element;

    private TypeData$ArrayType(TypeData$AbsTypeVar typeData$AbsTypeVar) {
        this.element = typeData$AbsTypeVar;
    }

    static TypeData make(TypeData typeData) throws BadBytecode {
        if (typeData instanceof TypeData$ArrayElement) {
            return ((TypeData$ArrayElement)typeData).arrayType();
        }
        if (typeData instanceof TypeData$AbsTypeVar) {
            return new TypeData$ArrayType((TypeData$AbsTypeVar)typeData);
        }
        if (typeData instanceof TypeData$ClassName && !typeData.isNullType()) {
            return new TypeData$ClassName(TypeData$ArrayType.typeName(typeData.getName()));
        }
        throw new BadBytecode("bad AASTORE: " + typeData);
    }

    @Override
    public void merge(TypeData typeData) {
        try {
            if (!typeData.isNullType()) {
                this.element.merge(TypeData$ArrayElement.make(typeData));
            }
        }
        catch (BadBytecode badBytecode) {
            throw new RuntimeException("fatal: " + badBytecode);
        }
    }

    @Override
    public String getName() {
        return TypeData$ArrayType.typeName(this.element.getName());
    }

    public TypeData$AbsTypeVar elementType() {
        return this.element;
    }

    @Override
    public TypeData$BasicType isBasicType() {
        return null;
    }

    @Override
    public boolean is2WordType() {
        return false;
    }

    public static String typeName(String string) {
        if (string.charAt(0) == '[') {
            return "[" + string;
        }
        return "[L" + string.replace('.', '/') + ";";
    }

    @Override
    public void setType(String string, ClassPool classPool) throws BadBytecode {
        this.element.setType(TypeData$ArrayElement.access$000(string), classPool);
    }

    @Override
    protected TypeData$TypeVar toTypeVar(int n6) {
        return this.element.toTypeVar(n6 + 1);
    }

    @Override
    public TypeData getArrayType(int n6) throws NotFoundException {
        return this.element.getArrayType(n6 + 1);
    }

    @Override
    public int dfs(List<TypeData> list, int n6, ClassPool classPool) throws NotFoundException {
        return this.element.dfs(list, n6, classPool);
    }

    @Override
    String toString2(Set<TypeData> set) {
        return "[" + this.element.toString2(set);
    }
}

