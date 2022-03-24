/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.stackmap.BasicBlock;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeData$UninitThis;
import javassist.bytecode.stackmap.TypeTag;
import javassist.bytecode.stackmap.TypedBlock$Maker;

public class TypedBlock
extends BasicBlock {
    public int stackTop;
    public int numLocals;
    public TypeData[] localsTypes = null;
    public TypeData[] stackTypes;

    public static TypedBlock[] makeBlocks(MethodInfo methodInfo, CodeAttribute codeAttribute, boolean bl) throws BadBytecode {
        TypedBlock[] arrtypedBlock = (TypedBlock[])new TypedBlock$Maker().make(methodInfo);
        if (bl && arrtypedBlock.length < 2 && (arrtypedBlock.length == 0 || arrtypedBlock[0].incoming == 0)) {
            return null;
        }
        ConstPool constPool = methodInfo.getConstPool();
        boolean bl2 = (methodInfo.getAccessFlags() & 8) != 0;
        arrtypedBlock[0].initFirstBlock(codeAttribute.getMaxStack(), codeAttribute.getMaxLocals(), constPool.getClassName(), methodInfo.getDescriptor(), bl2, methodInfo.isConstructor());
        return arrtypedBlock;
    }

    protected TypedBlock(int n6) {
        super(n6);
    }

    @Override
    protected void toString2(StringBuffer stringBuffer) {
        super.toString2(stringBuffer);
        stringBuffer.append(",\n stack={");
        this.printTypes(stringBuffer, this.stackTop, this.stackTypes);
        stringBuffer.append("}, locals={");
        this.printTypes(stringBuffer, this.numLocals, this.localsTypes);
        stringBuffer.append('}');
    }

    private void printTypes(StringBuffer stringBuffer, int n6, TypeData[] arrtypeData) {
        if (arrtypeData == null) {
            return;
        }
        for (int k = 0; k < n6; ++k) {
            TypeData typeData;
            if (k > 0) {
                stringBuffer.append(", ");
            }
            stringBuffer.append((typeData = arrtypeData[k]) == null ? "<>" : typeData.toString());
        }
    }

    public boolean alreadySet() {
        return this.localsTypes != null;
    }

    public void setStackMap(int n6, TypeData[] arrtypeData, int n10, TypeData[] arrtypeData2) throws BadBytecode {
        this.stackTop = n6;
        this.stackTypes = arrtypeData;
        this.numLocals = n10;
        this.localsTypes = arrtypeData2;
    }

    public void resetNumLocals() {
        if (this.localsTypes != null) {
            int n6;
            for (n6 = this.localsTypes.length; !(n6 <= 0 || this.localsTypes[n6 - 1].isBasicType() != TypeTag.TOP || n6 > 1 && this.localsTypes[n6 - 2].is2WordType()); --n6) {
            }
            this.numLocals = n6;
        }
    }

    void initFirstBlock(int n6, int n10, String string, String string2, boolean bl, boolean bl2) throws BadBytecode {
        if (string2.charAt(0) != '(') {
            throw new BadBytecode("no method descriptor: " + string2);
        }
        this.stackTop = 0;
        this.stackTypes = TypeData.d(n6);
        TypeData[] arrtypeData = TypeData.d(n10);
        if (bl2) {
            arrtypeData[0] = new TypeData$UninitThis(string);
        } else if (!bl) {
            arrtypeData[0] = new TypeData$ClassName(string);
        }
        int n11 = bl ? -1 : 0;
        int n12 = 1;
        try {
            while ((n12 = TypedBlock.descToTag(string2, n12, ++n11, arrtypeData)) > 0) {
                if (!arrtypeData[n11].is2WordType()) continue;
                arrtypeData[++n11] = TypeTag.TOP;
            }
        }
        catch (StringIndexOutOfBoundsException stringIndexOutOfBoundsException) {
            throw new BadBytecode("bad method descriptor: " + string2);
        }
        this.numLocals = n11;
        this.localsTypes = arrtypeData;
    }

    private static int descToTag(String string, int n6, int n10, TypeData[] arrtypeData) throws BadBytecode {
        int n11 = n6;
        int n12 = 0;
        char c3 = string.charAt(n6);
        if (c3 == ')') {
            return 0;
        }
        while (c3 == '[') {
            ++n12;
            c3 = string.charAt(++n6);
        }
        if (c3 == 'L') {
            int n13 = string.indexOf(59, ++n6);
            arrtypeData[n10] = n12 > 0 ? new TypeData$ClassName(string.substring(n11, ++n13)) : new TypeData$ClassName(string.substring(n11 + 1, ++n13 - 1).replace('/', '.'));
            return n13;
        }
        if (n12 > 0) {
            arrtypeData[n10] = new TypeData$ClassName(string.substring(n11, ++n6));
            return n6;
        }
        TypeData typeData = TypedBlock.toPrimitiveTag(c3);
        if (typeData == null) {
            throw new BadBytecode("bad method descriptor: " + string);
        }
        arrtypeData[n10] = typeData;
        return n6 + 1;
    }

    private static TypeData toPrimitiveTag(char c3) {
        switch (c3) {
            case 'B': 
            case 'C': 
            case 'I': 
            case 'S': 
            case 'Z': {
                return TypeTag.INTEGER;
            }
            case 'J': {
                return TypeTag.LONG;
            }
            case 'F': {
                return TypeTag.FLOAT;
            }
            case 'D': {
                return TypeTag.DOUBLE;
            }
        }
        return null;
    }

    public static String getRetType(String string) {
        int n6 = string.indexOf(41);
        if (n6 < 0) {
            return "java.lang.Object";
        }
        char c3 = string.charAt(n6 + 1);
        if (c3 == '[') {
            return string.substring(n6 + 1);
        }
        if (c3 == 'L') {
            return string.substring(n6 + 2, string.length() - 1).replace('/', '.');
        }
        return "java.lang.Object";
    }
}

