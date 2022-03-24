/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.ArrayList;
import javassist.ClassPool;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$Writer;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.StackMapTable$Writer;
import javassist.bytecode.stackmap.BasicBlock$Catch;
import javassist.bytecode.stackmap.BasicBlock$JsrBytecode;
import javassist.bytecode.stackmap.Tracer;
import javassist.bytecode.stackmap.TypeData;
import javassist.bytecode.stackmap.TypeData$AbsTypeVar;
import javassist.bytecode.stackmap.TypeData$BasicType;
import javassist.bytecode.stackmap.TypeData$ClassName;
import javassist.bytecode.stackmap.TypedBlock;

public class MapMaker
extends Tracer {
    public static StackMapTable make(ClassPool classPool, MethodInfo methodInfo) throws BadBytecode {
        TypedBlock[] arrtypedBlock;
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            return null;
        }
        try {
            arrtypedBlock = TypedBlock.makeBlocks(methodInfo, codeAttribute, true);
        }
        catch (BasicBlock$JsrBytecode basicBlock$JsrBytecode) {
            return null;
        }
        if (arrtypedBlock == null) {
            return null;
        }
        MapMaker mapMaker = new MapMaker(classPool, methodInfo, codeAttribute);
        try {
            mapMaker.make(arrtypedBlock, codeAttribute.getCode());
        }
        catch (BadBytecode badBytecode) {
            throw new BadBytecode(methodInfo, (Throwable)badBytecode);
        }
        return mapMaker.toStackMap(arrtypedBlock);
    }

    public static StackMap make2(ClassPool classPool, MethodInfo methodInfo) throws BadBytecode {
        TypedBlock[] arrtypedBlock;
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            return null;
        }
        try {
            arrtypedBlock = TypedBlock.makeBlocks(methodInfo, codeAttribute, true);
        }
        catch (BasicBlock$JsrBytecode basicBlock$JsrBytecode) {
            return null;
        }
        if (arrtypedBlock == null) {
            return null;
        }
        MapMaker mapMaker = new MapMaker(classPool, methodInfo, codeAttribute);
        try {
            mapMaker.make(arrtypedBlock, codeAttribute.getCode());
        }
        catch (BadBytecode badBytecode) {
            throw new BadBytecode(methodInfo, (Throwable)badBytecode);
        }
        return mapMaker.toStackMap2(methodInfo.getConstPool(), arrtypedBlock);
    }

    public MapMaker(ClassPool classPool, MethodInfo methodInfo, CodeAttribute codeAttribute) {
        super(classPool, methodInfo.getConstPool(), codeAttribute.getMaxStack(), codeAttribute.getMaxLocals(), TypedBlock.getRetType(methodInfo.getDescriptor()));
    }

    protected MapMaker(MapMaker mapMaker) {
        super(mapMaker);
    }

    void make(TypedBlock[] arrtypedBlock, byte[] arrby) throws BadBytecode {
        this.make(arrby, arrtypedBlock[0]);
        this.findDeadCatchers(arrby, arrtypedBlock);
        try {
            this.fixTypes(arrby, arrtypedBlock);
        }
        catch (NotFoundException notFoundException) {
            throw new BadBytecode("failed to resolve types", (Throwable)notFoundException);
        }
    }

    private void make(byte[] arrby, TypedBlock typedBlock) throws BadBytecode {
        int n6;
        MapMaker.copyTypeData(typedBlock.stackTop, typedBlock.stackTypes, this.stackTypes);
        this.stackTop = typedBlock.stackTop;
        MapMaker.copyTypeData(typedBlock.localsTypes.length, typedBlock.localsTypes, this.localsTypes);
        this.traceException(arrby, typedBlock.toCatch);
        int n10 = n6 + typedBlock.length;
        for (n6 = typedBlock.position; n6 < n10; n6 += this.doOpcode(n6, arrby)) {
            this.traceException(arrby, typedBlock.toCatch);
        }
        if (typedBlock.exit != null) {
            for (int k = 0; k < typedBlock.exit.length; ++k) {
                TypedBlock typedBlock2 = (TypedBlock)typedBlock.exit[k];
                if (typedBlock2.alreadySet()) {
                    this.mergeMap(typedBlock2, true);
                    continue;
                }
                this.recordStackMap(typedBlock2);
                MapMaker mapMaker = new MapMaker(this);
                mapMaker.make(arrby, typedBlock2);
            }
        }
    }

    private void traceException(byte[] arrby, BasicBlock$Catch basicBlock$Catch) throws BadBytecode {
        while (basicBlock$Catch != null) {
            TypedBlock typedBlock = (TypedBlock)basicBlock$Catch.body;
            if (typedBlock.alreadySet()) {
                this.mergeMap(typedBlock, false);
                if (typedBlock.stackTop < 1) {
                    throw new BadBytecode("bad catch clause: " + basicBlock$Catch.typeIndex);
                }
                typedBlock.stackTypes[0] = this.merge(this.toExceptionType(basicBlock$Catch.typeIndex), typedBlock.stackTypes[0]);
            } else {
                this.recordStackMap(typedBlock, basicBlock$Catch.typeIndex);
                MapMaker mapMaker = new MapMaker(this);
                mapMaker.make(arrby, typedBlock);
            }
            basicBlock$Catch = basicBlock$Catch.next;
        }
    }

    private void mergeMap(TypedBlock typedBlock, boolean bl) throws BadBytecode {
        int n6;
        int n10 = this.localsTypes.length;
        for (n6 = 0; n6 < n10; ++n6) {
            typedBlock.localsTypes[n6] = this.merge(MapMaker.validateTypeData(this.localsTypes, n10, n6), typedBlock.localsTypes[n6]);
        }
        if (bl) {
            n10 = this.stackTop;
            for (n6 = 0; n6 < n10; ++n6) {
                typedBlock.stackTypes[n6] = this.merge(this.stackTypes[n6], typedBlock.stackTypes[n6]);
            }
        }
    }

    private TypeData merge(TypeData typeData, TypeData typeData2) throws BadBytecode {
        if (typeData == typeData2) {
            return typeData2;
        }
        if (typeData2 instanceof TypeData$ClassName || typeData2 instanceof TypeData.BasicType) {
            return typeData2;
        }
        if (typeData2 instanceof TypeData$AbsTypeVar) {
            ((TypeData$AbsTypeVar)typeData2).merge(typeData);
            return typeData2;
        }
        throw new RuntimeException("fatal: this should never happen");
    }

    private void recordStackMap(TypedBlock typedBlock) throws BadBytecode {
        TypeData[] arrtypeData = TypeData.d(this.stackTypes.length);
        int n6 = this.stackTop;
        MapMaker.recordTypeData(n6, this.stackTypes, arrtypeData);
        this.recordStackMap0(typedBlock, n6, arrtypeData);
    }

    private void recordStackMap(TypedBlock typedBlock, int n6) throws BadBytecode {
        TypeData[] arrtypeData = TypeData.d(this.stackTypes.length);
        arrtypeData[0] = this.toExceptionType(n6).join();
        this.recordStackMap0(typedBlock, 1, arrtypeData);
    }

    private TypeData$ClassName toExceptionType(int n6) {
        String string = n6 == 0 ? "java.lang.Throwable" : this.cpool.getClassInfo(n6);
        return new TypeData$ClassName(string);
    }

    private void recordStackMap0(TypedBlock typedBlock, int n6, TypeData[] arrtypeData) throws BadBytecode {
        int n10 = this.localsTypes.length;
        TypeData[] arrtypeData2 = TypeData.d(n10);
        int n11 = MapMaker.recordTypeData(n10, this.localsTypes, arrtypeData2);
        typedBlock.setStackMap(n6, arrtypeData, n11, arrtypeData2);
    }

    protected static int recordTypeData(int n6, TypeData[] arrtypeData, TypeData[] arrtypeData2) {
        int n10 = -1;
        for (int k = 0; k < n6; ++k) {
            TypeData typeData = MapMaker.validateTypeData(arrtypeData, n6, k);
            arrtypeData2[k] = typeData.join();
            if (typeData == TOP) continue;
            n10 = k + 1;
        }
        return n10 + 1;
    }

    protected static void copyTypeData(int n6, TypeData[] arrtypeData, TypeData[] arrtypeData2) {
        for (int k = 0; k < n6; ++k) {
            arrtypeData2[k] = arrtypeData[k];
        }
    }

    private static TypeData validateTypeData(TypeData[] arrtypeData, int n6, int n10) {
        TypeData typeData = arrtypeData[n10];
        if (typeData.is2WordType() && n10 + 1 < n6 && arrtypeData[n10 + 1] != TOP) {
            return TOP;
        }
        return typeData;
    }

    private void findDeadCatchers(byte[] arrby, TypedBlock[] arrtypedBlock) throws BadBytecode {
        for (TypedBlock typedBlock : arrtypedBlock) {
            TypedBlock typedBlock2;
            if (typedBlock.alreadySet()) continue;
            this.fixDeadcode(arrby, typedBlock);
            BasicBlock$Catch basicBlock$Catch = typedBlock.toCatch;
            if (basicBlock$Catch == null || (typedBlock2 = (TypedBlock)basicBlock$Catch.body).alreadySet()) continue;
            this.recordStackMap(typedBlock2, basicBlock$Catch.typeIndex);
            this.fixDeadcode(arrby, typedBlock2);
            typedBlock2.incoming = 1;
        }
    }

    private void fixDeadcode(byte[] arrby, TypedBlock typedBlock) throws BadBytecode {
        int n6 = typedBlock.position;
        int n10 = typedBlock.length - 3;
        if (n10 < 0) {
            if (n10 == -1) {
                arrby[n6] = 0;
            }
            arrby[n6 + typedBlock.length - 1] = -65;
            typedBlock.incoming = 1;
            this.recordStackMap(typedBlock, 0);
            return;
        }
        typedBlock.incoming = 0;
        for (int k = 0; k < n10; ++k) {
            arrby[n6 + k] = 0;
        }
        arrby[n6 + n10] = -89;
        ByteArray.write16bit(-n10, arrby, n6 + n10 + 1);
    }

    private void fixTypes(byte[] arrby, TypedBlock[] arrtypedBlock) throws NotFoundException, BadBytecode {
        ArrayList<TypeData> arrayList = new ArrayList<TypeData>();
        int n6 = arrtypedBlock.length;
        int n10 = 0;
        for (int k = 0; k < n6; ++k) {
            int n11;
            TypedBlock typedBlock = arrtypedBlock[k];
            if (!typedBlock.alreadySet()) continue;
            int n12 = typedBlock.localsTypes.length;
            for (n11 = 0; n11 < n12; ++n11) {
                n10 = typedBlock.localsTypes[n11].dfs(arrayList, n10, this.classPool);
            }
            n12 = typedBlock.stackTop;
            for (n11 = 0; n11 < n12; ++n11) {
                n10 = typedBlock.stackTypes[n11].dfs(arrayList, n10, this.classPool);
            }
        }
    }

    public StackMapTable toStackMap(TypedBlock[] arrtypedBlock) {
        StackMapTable$Writer stackMapTable$Writer = new StackMapTable$Writer(32);
        int n6 = arrtypedBlock.length;
        TypedBlock typedBlock = arrtypedBlock[0];
        int n10 = typedBlock.length;
        if (typedBlock.incoming > 0) {
            stackMapTable$Writer.sameFrame(0);
            --n10;
        }
        for (int k = 1; k < n6; ++k) {
            TypedBlock typedBlock2 = arrtypedBlock[k];
            if (this.isTarget(typedBlock2, arrtypedBlock[k - 1])) {
                typedBlock2.resetNumLocals();
                int n11 = MapMaker.stackMapDiff(typedBlock.numLocals, typedBlock.localsTypes, typedBlock2.numLocals, typedBlock2.localsTypes);
                this.toStackMapBody(stackMapTable$Writer, typedBlock2, n11, n10, typedBlock);
                n10 = typedBlock2.length - 1;
                typedBlock = typedBlock2;
                continue;
            }
            if (typedBlock2.incoming == 0) {
                stackMapTable$Writer.sameFrame(n10);
                n10 = typedBlock2.length - 1;
                continue;
            }
            n10 += typedBlock2.length;
        }
        return stackMapTable$Writer.toStackMapTable(this.cpool);
    }

    private boolean isTarget(TypedBlock typedBlock, TypedBlock typedBlock2) {
        int n6 = typedBlock.incoming;
        if (n6 > 1) {
            return true;
        }
        if (n6 < 1) {
            return false;
        }
        return typedBlock2.stop;
    }

    private void toStackMapBody(StackMapTable$Writer stackMapTable$Writer, TypedBlock typedBlock, int n6, int n10, TypedBlock typedBlock2) {
        Object object;
        int n11 = typedBlock.stackTop;
        if (n11 == 0) {
            if (n6 == 0) {
                stackMapTable$Writer.sameFrame(n10);
                return;
            }
            if (0 > n6 && n6 >= -3) {
                stackMapTable$Writer.chopFrame(n10, -n6);
                return;
            }
            if (0 < n6 && n6 <= 3) {
                int[] arrn = new int[n6];
                int[] arrn2 = this.fillStackMap(typedBlock.numLocals - typedBlock2.numLocals, typedBlock2.numLocals, arrn, typedBlock.localsTypes);
                stackMapTable$Writer.appendFrame(n10, arrn2, arrn);
                return;
            }
        } else {
            if (n11 == 1 && n6 == 0) {
                TypeData typeData = typedBlock.stackTypes[0];
                stackMapTable$Writer.sameLocals(n10, typeData.getTypeTag(), typeData.getTypeData(this.cpool));
                return;
            }
            if (n11 == 2 && n6 == 0 && ((TypeData)(object = (Object)typedBlock.stackTypes[0])).is2WordType()) {
                stackMapTable$Writer.sameLocals(n10, ((TypeData)object).getTypeTag(), ((TypeData)object).getTypeData(this.cpool));
                return;
            }
        }
        object = new int[n11];
        int[] arrn = this.fillStackMap(n11, 0, (int[])object, typedBlock.stackTypes);
        int[] arrn3 = new int[typedBlock.numLocals];
        int[] arrn4 = this.fillStackMap(typedBlock.numLocals, 0, arrn3, typedBlock.localsTypes);
        stackMapTable$Writer.fullFrame(n10, arrn4, arrn3, arrn, (int[])object);
    }

    private int[] fillStackMap(int n6, int n10, int[] arrn, TypeData[] arrtypeData) {
        int n11 = MapMaker.diffSize(arrtypeData, n10, n10 + n6);
        ConstPool constPool = this.cpool;
        int[] arrn2 = new int[n11];
        int n12 = 0;
        for (int k = 0; k < n6; ++k) {
            TypeData typeData = arrtypeData[n10 + k];
            arrn2[n12] = typeData.getTypeTag();
            arrn[n12] = typeData.getTypeData(constPool);
            if (typeData.is2WordType()) {
                ++k;
            }
            ++n12;
        }
        return arrn2;
    }

    private static int stackMapDiff(int n6, TypeData[] arrtypeData, int n10, TypeData[] arrtypeData2) {
        int n11 = n10 - n6;
        int n12 = n11 > 0 ? n6 : n10;
        if (MapMaker.stackMapEq(arrtypeData, arrtypeData2, n12)) {
            if (n11 > 0) {
                return MapMaker.diffSize(arrtypeData2, n12, n10);
            }
            return -MapMaker.diffSize(arrtypeData, n12, n6);
        }
        return -100;
    }

    private static boolean stackMapEq(TypeData[] arrtypeData, TypeData[] arrtypeData2, int n6) {
        for (int k = 0; k < n6; ++k) {
            if (arrtypeData[k].eq(arrtypeData2[k])) continue;
            return false;
        }
        return true;
    }

    private static int diffSize(TypeData[] arrtypeData, int n6, int n10) {
        int n11 = 0;
        while (n6 < n10) {
            TypeData typeData = arrtypeData[n6++];
            ++n11;
            if (!typeData.is2WordType()) continue;
            ++n6;
        }
        return n11;
    }

    public StackMap toStackMap2(ConstPool constPool, TypedBlock[] arrtypedBlock) {
        int n6;
        StackMap$Writer stackMap$Writer = new StackMap$Writer();
        int n10 = arrtypedBlock.length;
        boolean[] arrbl = new boolean[n10];
        TypedBlock typedBlock = arrtypedBlock[0];
        arrbl[0] = typedBlock.incoming > 0;
        int n11 = arrbl[0] ? 1 : 0;
        for (n6 = 1; n6 < n10; ++n6) {
            TypedBlock typedBlock2 = arrtypedBlock[n6];
            arrbl[n6] = this.isTarget(typedBlock2, arrtypedBlock[n6 - 1]);
            if (!arrbl[n6]) continue;
            typedBlock2.resetNumLocals();
            typedBlock = typedBlock2;
            ++n11;
        }
        if (n11 == 0) {
            return null;
        }
        stackMap$Writer.write16bit(n11);
        for (n6 = 0; n6 < n10; ++n6) {
            if (!arrbl[n6]) continue;
            this.writeStackFrame(stackMap$Writer, constPool, arrtypedBlock[n6].position, arrtypedBlock[n6]);
        }
        return stackMap$Writer.toStackMap(constPool);
    }

    private void writeStackFrame(StackMap$Writer stackMap$Writer, ConstPool constPool, int n6, TypedBlock typedBlock) {
        stackMap$Writer.write16bit(n6);
        this.writeVerifyTypeInfo(stackMap$Writer, constPool, typedBlock.localsTypes, typedBlock.numLocals);
        this.writeVerifyTypeInfo(stackMap$Writer, constPool, typedBlock.stackTypes, typedBlock.stackTop);
    }

    private void writeVerifyTypeInfo(StackMap$Writer stackMap$Writer, ConstPool constPool, TypeData[] arrtypeData, int n6) {
        TypeData typeData;
        int n10;
        int n11 = 0;
        for (n10 = 0; n10 < n6; ++n10) {
            typeData = arrtypeData[n10];
            if (typeData == null || !typeData.is2WordType()) continue;
            ++n11;
            ++n10;
        }
        stackMap$Writer.write16bit(n6 - n11);
        for (n10 = 0; n10 < n6; ++n10) {
            typeData = arrtypeData[n10];
            stackMap$Writer.writeVerifyTypeInfo(typeData.getTypeTag(), typeData.getTypeData(constPool));
            if (!typeData.is2WordType()) continue;
            ++n10;
        }
    }
}

