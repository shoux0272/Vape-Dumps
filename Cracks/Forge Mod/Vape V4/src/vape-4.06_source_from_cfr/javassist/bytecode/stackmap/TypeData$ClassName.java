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
import javassist.bytecode.stackmap.TypeData$BasicType;
import javassist.bytecode.stackmap.TypeTag;

public class TypeData$ClassName
extends TypeData {
    private String name;

    public TypeData$ClassName(String string) {
        this.name = string;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public TypeData$BasicType isBasicType() {
        return null;
    }

    @Override
    public boolean is2WordType() {
        return false;
    }

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
        return this.name.equals(typeData.getName());
    }

    @Override
    public void setType(String string, ClassPool classPool) throws BadBytecode {
    }

    @Override
    public TypeData getArrayType(int n6) throws NotFoundException {
        int n10;
        if (n6 == 0) {
            return this;
        }
        if (n6 > 0) {
            char[] arrc = new char[n6];
            for (int k = 0; k < n6; ++k) {
                arrc[k] = 91;
            }
            String string = this.getName();
            if (string.charAt(0) != '[') {
                string = "L" + string.replace('.', '/') + ";";
            }
            return new TypeData$ClassName(new String(arrc) + string);
        }
        for (n10 = 0; n10 < -n6; ++n10) {
            if (this.name.charAt(n10) == '[') continue;
            throw new NotFoundException("no " + n6 + " dimensional array type: " + this.getName());
        }
        n10 = this.name.charAt(-n6);
        if (n10 == 91) {
            return new TypeData$ClassName(this.name.substring(-n6));
        }
        if (n10 == 76) {
            return new TypeData$ClassName(this.name.substring(-n6 + 1, this.name.length() - 1).replace('/', '.'));
        }
        if (n10 == TypeData$BasicType.access$100(TypeTag.DOUBLE)) {
            return TypeTag.DOUBLE;
        }
        if (n10 == TypeData$BasicType.access$100(TypeTag.FLOAT)) {
            return TypeTag.FLOAT;
        }
        if (n10 == TypeData$BasicType.access$100(TypeTag.LONG)) {
            return TypeTag.LONG;
        }
        return TypeTag.INTEGER;
    }

    @Override
    String toString2(Set<TypeData> set) {
        return this.name;
    }
}

