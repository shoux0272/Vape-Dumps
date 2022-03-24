/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import javassist.ClassPool;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.Opcode;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$ArrayElement;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypeData$NullType;
import javassist.bytecode.stackmap.TypeData$UninitData;
import javassist.bytecode.stackmap.TypeData$UninitTypeVar;
import javassist.bytecode.stackmap.TypeTag;

public abstract class Tracer
implements TypeTag {
    protected ClassPool classPool;
    protected ConstPool cpool;
    protected String returnType;
    protected int stackTop;
    protected TypeData[] stackTypes;
    protected TypeData[] localsTypes;

    public Tracer(ClassPool classPool, ConstPool constPool, int n6, int n10, String string) {
        this.classPool = classPool;
        this.cpool = constPool;
        this.returnType = string;
        this.stackTop = 0;
        this.stackTypes = TypeData.d(n6);
        this.localsTypes = TypeData.d(n10);
    }

    public Tracer(Tracer tracer) {
        this.classPool = tracer.classPool;
        this.cpool = tracer.cpool;
        this.returnType = tracer.returnType;
        this.stackTop = tracer.stackTop;
        this.stackTypes = TypeData.d(tracer.stackTypes.length);
        this.localsTypes = TypeData.d(tracer.localsTypes.length);
    }

    protected int doOpcode(int n6, byte[] arrby) throws BadBytecode {
        try {
            int n10 = arrby[n6] & 0xFF;
            if (n10 < 54) {
                return this.doOpcode0_53(n6, arrby, n10);
            }
            if (n10 < 96) {
                return this.doOpcode54_95(n6, arrby, n10);
            }
            if (n10 < 148) {
                return this.doOpcode96_147(n6, arrby, n10);
            }
            return this.doOpcode148_201(n6, arrby, n10);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new BadBytecode("inconsistent stack height " + arrayIndexOutOfBoundsException.getMessage(), (Throwable)arrayIndexOutOfBoundsException);
        }
    }

    protected void visitBranch(int n6, byte[] arrby, int n10) throws BadBytecode {
    }

    protected void visitGoto(int n6, byte[] arrby, int n10) throws BadBytecode {
    }

    protected void visitReturn(int n6, byte[] arrby) throws BadBytecode {
    }

    protected void visitThrow(int n6, byte[] arrby) throws BadBytecode {
    }

    protected void visitTableSwitch(int n6, byte[] arrby, int n10, int n11, int n12) throws BadBytecode {
    }

    protected void visitLookupSwitch(int n6, byte[] arrby, int n10, int n11, int n12) throws BadBytecode {
    }

    protected void visitJSR(int n6, byte[] arrby) throws BadBytecode {
    }

    protected void visitRET(int n6, byte[] arrby) throws BadBytecode {
    }

    private int doOpcode0_53(int n6, byte[] arrby, int n10) throws BadBytecode {
        TypeData[] arrtypeData = this.stackTypes;
        switch (n10) {
            case 0: {
                break;
            }
            case 1: {
                arrtypeData[this.stackTop++] = new TypeData$NullType();
                break;
            }
            case 2: 
            case 3: 
            case 4: 
            case 5: 
            case 6: 
            case 7: 
            case 8: {
                arrtypeData[this.stackTop++] = INTEGER;
                break;
            }
            case 9: 
            case 10: {
                arrtypeData[this.stackTop++] = LONG;
                arrtypeData[this.stackTop++] = TOP;
                break;
            }
            case 11: 
            case 12: 
            case 13: {
                arrtypeData[this.stackTop++] = FLOAT;
                break;
            }
            case 14: 
            case 15: {
                arrtypeData[this.stackTop++] = DOUBLE;
                arrtypeData[this.stackTop++] = TOP;
                break;
            }
            case 16: 
            case 17: {
                arrtypeData[this.stackTop++] = INTEGER;
                return n10 == 17 ? 3 : 2;
            }
            case 18: {
                this.doLDC(arrby[n6 + 1] & 0xFF);
                return 2;
            }
            case 19: 
            case 20: {
                this.doLDC(ByteArray.readU16bit(arrby, n6 + 1));
                return 3;
            }
            case 21: {
                return this.doXLOAD(INTEGER, arrby, n6);
            }
            case 22: {
                return this.doXLOAD(LONG, arrby, n6);
            }
            case 23: {
                return this.doXLOAD(FLOAT, arrby, n6);
            }
            case 24: {
                return this.doXLOAD(DOUBLE, arrby, n6);
            }
            case 25: {
                return this.doALOAD(arrby[n6 + 1] & 0xFF);
            }
            case 26: 
            case 27: 
            case 28: 
            case 29: {
                arrtypeData[this.stackTop++] = INTEGER;
                break;
            }
            case 30: 
            case 31: 
            case 32: 
            case 33: {
                arrtypeData[this.stackTop++] = LONG;
                arrtypeData[this.stackTop++] = TOP;
                break;
            }
            case 34: 
            case 35: 
            case 36: 
            case 37: {
                arrtypeData[this.stackTop++] = FLOAT;
                break;
            }
            case 38: 
            case 39: 
            case 40: 
            case 41: {
                arrtypeData[this.stackTop++] = DOUBLE;
                arrtypeData[this.stackTop++] = TOP;
                break;
            }
            case 42: 
            case 43: 
            case 44: 
            case 45: {
                int n11 = n10 - 42;
                arrtypeData[this.stackTop++] = this.localsTypes[n11];
                break;
            }
            case 46: {
                arrtypeData[--this.stackTop - 1] = INTEGER;
                break;
            }
            case 47: {
                arrtypeData[this.stackTop - 2] = LONG;
                arrtypeData[this.stackTop - 1] = TOP;
                break;
            }
            case 48: {
                arrtypeData[--this.stackTop - 1] = FLOAT;
                break;
            }
            case 49: {
                arrtypeData[this.stackTop - 2] = DOUBLE;
                arrtypeData[this.stackTop - 1] = TOP;
                break;
            }
            case 50: {
                int n12 = --this.stackTop - 1;
                TypeData typeData = arrtypeData[n12];
                arrtypeData[n12] = TypeData$ArrayElement.make(typeData);
                break;
            }
            case 51: 
            case 52: 
            case 53: {
                arrtypeData[--this.stackTop - 1] = INTEGER;
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private void doLDC(int n6) {
        TypeData[] arrtypeData = this.stackTypes;
        int n10 = this.cpool.getTag(n6);
        if (n10 == 8) {
            arrtypeData[this.stackTop++] = new TypeData$ClassName("java.lang.String");
        } else if (n10 == 3) {
            arrtypeData[this.stackTop++] = INTEGER;
        } else if (n10 == 4) {
            arrtypeData[this.stackTop++] = FLOAT;
        } else if (n10 == 5) {
            arrtypeData[this.stackTop++] = LONG;
            arrtypeData[this.stackTop++] = TOP;
        } else if (n10 == 6) {
            arrtypeData[this.stackTop++] = DOUBLE;
            arrtypeData[this.stackTop++] = TOP;
        } else if (n10 == 7) {
            arrtypeData[this.stackTop++] = new TypeData$ClassName("java.lang.Class");
        } else if (n10 == 17) {
            String string = this.cpool.getDynamicType(n6);
            this.pushMemberType(string);
        } else {
            throw new RuntimeException("bad LDC: " + n10);
        }
    }

    private int doXLOAD(TypeData typeData, byte[] arrby, int n6) {
        int n10 = arrby[n6 + 1] & 0xFF;
        return this.doXLOAD(n10, typeData);
    }

    private int doXLOAD(int n6, TypeData typeData) {
        this.stackTypes[this.stackTop++] = typeData;
        if (typeData.is2WordType()) {
            this.stackTypes[this.stackTop++] = TOP;
        }
        return 2;
    }

    private int doALOAD(int n6) {
        this.stackTypes[this.stackTop++] = this.localsTypes[n6];
        return 2;
    }

    private int doOpcode54_95(int n6, byte[] arrby, int n10) throws BadBytecode {
        switch (n10) {
            case 54: {
                return this.doXSTORE(n6, arrby, INTEGER);
            }
            case 55: {
                return this.doXSTORE(n6, arrby, LONG);
            }
            case 56: {
                return this.doXSTORE(n6, arrby, FLOAT);
            }
            case 57: {
                return this.doXSTORE(n6, arrby, DOUBLE);
            }
            case 58: {
                return this.doASTORE(arrby[n6 + 1] & 0xFF);
            }
            case 59: 
            case 60: 
            case 61: 
            case 62: {
                int n11 = n10 - 59;
                this.localsTypes[n11] = INTEGER;
                --this.stackTop;
                break;
            }
            case 63: 
            case 64: 
            case 65: 
            case 66: {
                int n12 = n10 - 63;
                this.localsTypes[n12] = LONG;
                this.localsTypes[n12 + 1] = TOP;
                this.stackTop -= 2;
                break;
            }
            case 67: 
            case 68: 
            case 69: 
            case 70: {
                int n13 = n10 - 67;
                this.localsTypes[n13] = FLOAT;
                --this.stackTop;
                break;
            }
            case 71: 
            case 72: 
            case 73: 
            case 74: {
                int n14 = n10 - 71;
                this.localsTypes[n14] = DOUBLE;
                this.localsTypes[n14 + 1] = TOP;
                this.stackTop -= 2;
                break;
            }
            case 75: 
            case 76: 
            case 77: 
            case 78: {
                int n15 = n10 - 75;
                this.doASTORE(n15);
                break;
            }
            case 79: 
            case 80: 
            case 81: 
            case 82: {
                this.stackTop -= n10 == 80 || n10 == 82 ? 4 : 3;
                break;
            }
            case 83: {
                TypeData$ArrayElement.a(this.stackTypes[this.stackTop - 3], this.stackTypes[this.stackTop - 1], this.classPool);
                this.stackTop -= 3;
                break;
            }
            case 84: 
            case 85: 
            case 86: {
                this.stackTop -= 3;
                break;
            }
            case 87: {
                --this.stackTop;
                break;
            }
            case 88: {
                this.stackTop -= 2;
                break;
            }
            case 89: {
                int n16 = this.stackTop;
                this.stackTypes[n16] = this.stackTypes[n16 - 1];
                this.stackTop = n16 + 1;
                break;
            }
            case 90: 
            case 91: {
                int n17 = n10 - 90 + 2;
                this.doDUP_XX(1, n17);
                int n18 = this.stackTop;
                this.stackTypes[n18 - n17] = this.stackTypes[n18];
                this.stackTop = n18 + 1;
                break;
            }
            case 92: {
                this.doDUP_XX(2, 2);
                this.stackTop += 2;
                break;
            }
            case 93: 
            case 94: {
                int n19 = n10 - 93 + 3;
                this.doDUP_XX(2, n19);
                int n20 = this.stackTop;
                this.stackTypes[n20 - n19] = this.stackTypes[n20];
                this.stackTypes[n20 - n19 + 1] = this.stackTypes[n20 + 1];
                this.stackTop = n20 + 2;
                break;
            }
            case 95: {
                int n21 = this.stackTop - 1;
                TypeData typeData = this.stackTypes[n21];
                this.stackTypes[n21] = this.stackTypes[n21 - 1];
                this.stackTypes[n21 - 1] = typeData;
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private int doXSTORE(int n6, byte[] arrby, TypeData typeData) {
        int n10 = arrby[n6 + 1] & 0xFF;
        return this.doXSTORE(n10, typeData);
    }

    private int doXSTORE(int n6, TypeData typeData) {
        --this.stackTop;
        this.localsTypes[n6] = typeData;
        if (typeData.is2WordType()) {
            --this.stackTop;
            this.localsTypes[n6 + 1] = TOP;
        }
        return 2;
    }

    private int doASTORE(int n6) {
        --this.stackTop;
        this.localsTypes[n6] = this.stackTypes[this.stackTop];
        return 2;
    }

    private void doDUP_XX(int n6, int n10) {
        int n11;
        TypeData[] arrtypeData = this.stackTypes;
        int n12 = n11 - n10;
        for (n11 = this.stackTop - 1; n11 > n12; --n11) {
            arrtypeData[n11 + n6] = arrtypeData[n11];
        }
    }

    private int doOpcode96_147(int n6, byte[] arrby, int n10) {
        if (n10 <= 131) {
            this.stackTop += Opcode.STACK_GROW[n10];
            return 1;
        }
        switch (n10) {
            case 132: {
                return 3;
            }
            case 133: {
                this.stackTypes[this.stackTop - 1] = LONG;
                this.stackTypes[this.stackTop] = TOP;
                ++this.stackTop;
                break;
            }
            case 134: {
                this.stackTypes[this.stackTop - 1] = FLOAT;
                break;
            }
            case 135: {
                this.stackTypes[this.stackTop - 1] = DOUBLE;
                this.stackTypes[this.stackTop] = TOP;
                ++this.stackTop;
                break;
            }
            case 136: {
                this.stackTypes[--this.stackTop - 1] = INTEGER;
                break;
            }
            case 137: {
                this.stackTypes[--this.stackTop - 1] = FLOAT;
                break;
            }
            case 138: {
                this.stackTypes[this.stackTop - 2] = DOUBLE;
                break;
            }
            case 139: {
                this.stackTypes[this.stackTop - 1] = INTEGER;
                break;
            }
            case 140: {
                this.stackTypes[this.stackTop - 1] = LONG;
                this.stackTypes[this.stackTop] = TOP;
                ++this.stackTop;
                break;
            }
            case 141: {
                this.stackTypes[this.stackTop - 1] = DOUBLE;
                this.stackTypes[this.stackTop] = TOP;
                ++this.stackTop;
                break;
            }
            case 142: {
                this.stackTypes[--this.stackTop - 1] = INTEGER;
                break;
            }
            case 143: {
                this.stackTypes[this.stackTop - 2] = LONG;
                break;
            }
            case 144: {
                this.stackTypes[--this.stackTop - 1] = FLOAT;
                break;
            }
            case 145: 
            case 146: 
            case 147: {
                break;
            }
            default: {
                throw new RuntimeException("fatal");
            }
        }
        return 1;
    }

    private int doOpcode148_201(int n6, byte[] arrby, int n10) throws BadBytecode {
        switch (n10) {
            case 148: {
                this.stackTypes[this.stackTop - 4] = INTEGER;
                this.stackTop -= 3;
                break;
            }
            case 149: 
            case 150: {
                this.stackTypes[--this.stackTop - 1] = INTEGER;
                break;
            }
            case 151: 
            case 152: {
                this.stackTypes[this.stackTop - 4] = INTEGER;
                this.stackTop -= 3;
                break;
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: {
                --this.stackTop;
                this.visitBranch(n6, arrby, ByteArray.readS16bit(arrby, n6 + 1));
                return 3;
            }
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: {
                this.stackTop -= 2;
                this.visitBranch(n6, arrby, ByteArray.readS16bit(arrby, n6 + 1));
                return 3;
            }
            case 167: {
                this.visitGoto(n6, arrby, ByteArray.readS16bit(arrby, n6 + 1));
                return 3;
            }
            case 168: {
                this.visitJSR(n6, arrby);
                return 3;
            }
            case 169: {
                this.visitRET(n6, arrby);
                return 2;
            }
            case 170: {
                --this.stackTop;
                int n11 = (n6 & 0xFFFFFFFC) + 8;
                int n12 = ByteArray.read32bit(arrby, n11);
                int n13 = ByteArray.read32bit(arrby, n11 + 4);
                int n14 = n13 - n12 + 1;
                this.visitTableSwitch(n6, arrby, n14, n11 + 8, ByteArray.read32bit(arrby, n11 - 4));
                return n14 * 4 + 16 - (n6 & 3);
            }
            case 171: {
                --this.stackTop;
                int n15 = (n6 & 0xFFFFFFFC) + 8;
                int n16 = ByteArray.read32bit(arrby, n15);
                this.visitLookupSwitch(n6, arrby, n16, n15 + 4, ByteArray.read32bit(arrby, n15 - 4));
                return n16 * 8 + 12 - (n6 & 3);
            }
            case 172: {
                --this.stackTop;
                this.visitReturn(n6, arrby);
                break;
            }
            case 173: {
                this.stackTop -= 2;
                this.visitReturn(n6, arrby);
                break;
            }
            case 174: {
                --this.stackTop;
                this.visitReturn(n6, arrby);
                break;
            }
            case 175: {
                this.stackTop -= 2;
                this.visitReturn(n6, arrby);
                break;
            }
            case 176: {
                this.stackTypes[--this.stackTop].setType(this.returnType, this.classPool);
                this.visitReturn(n6, arrby);
                break;
            }
            case 177: {
                this.visitReturn(n6, arrby);
                break;
            }
            case 178: {
                return this.doGetField(n6, arrby, false);
            }
            case 179: {
                return this.doPutField(n6, arrby, false);
            }
            case 180: {
                return this.doGetField(n6, arrby, true);
            }
            case 181: {
                return this.doPutField(n6, arrby, true);
            }
            case 182: 
            case 183: {
                return this.doInvokeMethod(n6, arrby, true);
            }
            case 184: {
                return this.doInvokeMethod(n6, arrby, false);
            }
            case 185: {
                return this.doInvokeIntfMethod(n6, arrby);
            }
            case 186: {
                return this.doInvokeDynamic(n6, arrby);
            }
            case 187: {
                int n17 = ByteArray.readU16bit(arrby, n6 + 1);
                this.stackTypes[this.stackTop++] = new TypeData$UninitData(n6, this.cpool.getClassInfo(n17));
                return 3;
            }
            case 188: {
                return this.doNEWARRAY(n6, arrby);
            }
            case 189: {
                int n18 = ByteArray.readU16bit(arrby, n6 + 1);
                String string = this.cpool.getClassInfo(n18).replace('.', '/');
                string = string.charAt(0) == '[' ? "[" + string : "[L" + string + ";";
                this.stackTypes[this.stackTop - 1] = new TypeData$ClassName(string);
                return 3;
            }
            case 190: {
                this.stackTypes[this.stackTop - 1].setType("[Ljava.lang.Object;", this.classPool);
                this.stackTypes[this.stackTop - 1] = INTEGER;
                break;
            }
            case 191: {
                this.stackTypes[--this.stackTop].setType("java.lang.Throwable", this.classPool);
                this.visitThrow(n6, arrby);
                break;
            }
            case 192: {
                int n19 = ByteArray.readU16bit(arrby, n6 + 1);
                String string = this.cpool.getClassInfo(n19);
                if (string.charAt(0) == '[') {
                    string = string.replace('.', '/');
                }
                this.stackTypes[this.stackTop - 1] = new TypeData$ClassName(string);
                return 3;
            }
            case 193: {
                this.stackTypes[this.stackTop - 1] = INTEGER;
                return 3;
            }
            case 194: 
            case 195: {
                --this.stackTop;
                break;
            }
            case 196: {
                return this.doWIDE(n6, arrby);
            }
            case 197: {
                return this.doMultiANewArray(n6, arrby);
            }
            case 198: 
            case 199: {
                --this.stackTop;
                this.visitBranch(n6, arrby, ByteArray.readS16bit(arrby, n6 + 1));
                return 3;
            }
            case 200: {
                this.visitGoto(n6, arrby, ByteArray.read32bit(arrby, n6 + 1));
                return 5;
            }
            case 201: {
                this.visitJSR(n6, arrby);
                return 5;
            }
        }
        return 1;
    }

    private int doWIDE(int n6, byte[] arrby) throws BadBytecode {
        int n10 = arrby[n6 + 1] & 0xFF;
        switch (n10) {
            case 21: {
                this.doWIDE_XLOAD(n6, arrby, INTEGER);
                break;
            }
            case 22: {
                this.doWIDE_XLOAD(n6, arrby, LONG);
                break;
            }
            case 23: {
                this.doWIDE_XLOAD(n6, arrby, FLOAT);
                break;
            }
            case 24: {
                this.doWIDE_XLOAD(n6, arrby, DOUBLE);
                break;
            }
            case 25: {
                int n11 = ByteArray.readU16bit(arrby, n6 + 2);
                this.doALOAD(n11);
                break;
            }
            case 54: {
                this.doWIDE_STORE(n6, arrby, INTEGER);
                break;
            }
            case 55: {
                this.doWIDE_STORE(n6, arrby, LONG);
                break;
            }
            case 56: {
                this.doWIDE_STORE(n6, arrby, FLOAT);
                break;
            }
            case 57: {
                this.doWIDE_STORE(n6, arrby, DOUBLE);
                break;
            }
            case 58: {
                int n12 = ByteArray.readU16bit(arrby, n6 + 2);
                this.doASTORE(n12);
                break;
            }
            case 132: {
                return 6;
            }
            case 169: {
                this.visitRET(n6, arrby);
                break;
            }
            default: {
                throw new RuntimeException("bad WIDE instruction: " + n10);
            }
        }
        return 4;
    }

    private void doWIDE_XLOAD(int n6, byte[] arrby, TypeData typeData) {
        int n10 = ByteArray.readU16bit(arrby, n6 + 2);
        this.doXLOAD(n10, typeData);
    }

    private void doWIDE_STORE(int n6, byte[] arrby, TypeData typeData) {
        int n10 = ByteArray.readU16bit(arrby, n6 + 2);
        this.doXSTORE(n10, typeData);
    }

    private int doPutField(int n6, byte[] arrby, boolean bl) throws BadBytecode {
        int n10 = ByteArray.readU16bit(arrby, n6 + 1);
        String string = this.cpool.getFieldrefType(n10);
        this.stackTop -= Descriptor.dataSize(string);
        char c3 = string.charAt(0);
        if (c3 == 'L') {
            this.stackTypes[this.stackTop].setType(Tracer.getFieldClassName(string, 0), this.classPool);
        } else if (c3 == '[') {
            this.stackTypes[this.stackTop].setType(string, this.classPool);
        }
        this.setFieldTarget(bl, n10);
        return 3;
    }

    private int doGetField(int n6, byte[] arrby, boolean bl) throws BadBytecode {
        int n10 = ByteArray.readU16bit(arrby, n6 + 1);
        this.setFieldTarget(bl, n10);
        String string = this.cpool.getFieldrefType(n10);
        this.pushMemberType(string);
        return 3;
    }

    private void setFieldTarget(boolean bl, int n6) throws BadBytecode {
        if (bl) {
            String string = this.cpool.getFieldrefClassName(n6);
            this.stackTypes[--this.stackTop].setType(string, this.classPool);
        }
    }

    private int doNEWARRAY(int n6, byte[] arrby) {
        String string;
        int n10 = this.stackTop - 1;
        switch (arrby[n6 + 1] & 0xFF) {
            case 4: {
                string = "[Z";
                break;
            }
            case 5: {
                string = "[C";
                break;
            }
            case 6: {
                string = "[F";
                break;
            }
            case 7: {
                string = "[D";
                break;
            }
            case 8: {
                string = "[B";
                break;
            }
            case 9: {
                string = "[S";
                break;
            }
            case 10: {
                string = "[I";
                break;
            }
            case 11: {
                string = "[J";
                break;
            }
            default: {
                throw new RuntimeException("bad newarray");
            }
        }
        this.stackTypes[n10] = new TypeData$ClassName(string);
        return 2;
    }

    private int doMultiANewArray(int n6, byte[] arrby) {
        int n10 = ByteArray.readU16bit(arrby, n6 + 1);
        int n11 = arrby[n6 + 3] & 0xFF;
        this.stackTop -= n11 - 1;
        String string = this.cpool.getClassInfo(n10).replace('.', '/');
        this.stackTypes[this.stackTop - 1] = new TypeData$ClassName(string);
        return 4;
    }

    private int doInvokeMethod(int n6, byte[] arrby, boolean bl) throws BadBytecode {
        int n10 = ByteArray.readU16bit(arrby, n6 + 1);
        String string = this.cpool.getMethodrefType(n10);
        this.checkParamTypes(string, 1);
        if (bl) {
            TypeData typeData;
            String string2 = this.cpool.getMethodrefClassName(n10);
            if ((typeData = this.stackTypes[--this.stackTop]) instanceof TypeData$UninitTypeVar && typeData.isUninit()) {
                this.constructorCalled(typeData, ((TypeData$UninitTypeVar)typeData).offset());
            } else if (typeData instanceof TypeData$UninitData) {
                this.constructorCalled(typeData, ((TypeData$UninitData)typeData).offset());
            }
            typeData.setType(string2, this.classPool);
        }
        this.pushMemberType(string);
        return 3;
    }

    private void constructorCalled(TypeData typeData, int n6) {
        int n10;
        typeData.constructorCalled(n6);
        for (n10 = 0; n10 < this.stackTop; ++n10) {
            this.stackTypes[n10].constructorCalled(n6);
        }
        for (n10 = 0; n10 < this.localsTypes.length; ++n10) {
            this.localsTypes[n10].constructorCalled(n6);
        }
    }

    private int doInvokeIntfMethod(int n6, byte[] arrby) throws BadBytecode {
        int n10 = ByteArray.readU16bit(arrby, n6 + 1);
        String string = this.cpool.getInterfaceMethodrefType(n10);
        this.checkParamTypes(string, 1);
        String string2 = this.cpool.getInterfaceMethodrefClassName(n10);
        this.stackTypes[--this.stackTop].setType(string2, this.classPool);
        this.pushMemberType(string);
        return 5;
    }

    private int doInvokeDynamic(int n6, byte[] arrby) throws BadBytecode {
        int n10 = ByteArray.readU16bit(arrby, n6 + 1);
        String string = this.cpool.getInvokeDynamicType(n10);
        this.checkParamTypes(string, 1);
        this.pushMemberType(string);
        return 5;
    }

    private void pushMemberType(String string) {
        int n6 = 0;
        if (string.charAt(0) == '(' && (n6 = string.indexOf(41) + 1) < 1) {
            throw new IndexOutOfBoundsException("bad descriptor: " + string);
        }
        TypeData[] arrtypeData = this.stackTypes;
        int n10 = this.stackTop;
        switch (string.charAt(n6)) {
            case '[': {
                arrtypeData[n10] = new TypeData$ClassName(string.substring(n6));
                break;
            }
            case 'L': {
                arrtypeData[n10] = new TypeData$ClassName(Tracer.getFieldClassName(string, n6));
                break;
            }
            case 'J': {
                arrtypeData[n10] = LONG;
                arrtypeData[n10 + 1] = TOP;
                this.stackTop += 2;
                return;
            }
            case 'F': {
                arrtypeData[n10] = FLOAT;
                break;
            }
            case 'D': {
                arrtypeData[n10] = DOUBLE;
                arrtypeData[n10 + 1] = TOP;
                this.stackTop += 2;
                return;
            }
            case 'V': {
                return;
            }
            default: {
                arrtypeData[n10] = INTEGER;
            }
        }
        ++this.stackTop;
    }

    private static String getFieldClassName(String string, int n6) {
        return string.substring(n6 + 1, string.length() - 1).replace('/', '.');
    }

    private void checkParamTypes(String string, int n6) throws BadBytecode {
        char c3 = string.charAt(n6);
        if (c3 == ')') {
            return;
        }
        int n10 = n6;
        boolean bl = false;
        while (c3 == '[') {
            bl = true;
            c3 = string.charAt(++n10);
        }
        if (c3 == 'L') {
            if ((n10 = string.indexOf(59, n10) + 1) <= 0) {
                throw new IndexOutOfBoundsException("bad descriptor");
            }
        } else {
            ++n10;
        }
        this.checkParamTypes(string, n10);
        this.stackTop = !(bl || c3 != 'J' && c3 != 'D') ? (this.stackTop -= 2) : --this.stackTop;
        if (bl) {
            this.stackTypes[this.stackTop].setType(string.substring(n6, n10), this.classPool);
        } else if (c3 == 'L') {
            this.stackTypes[this.stackTop].setType(string.substring(n6 + 1, n10 - 1).replace('/', '.'), this.classPool);
        }
    }
}

