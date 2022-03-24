/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.stackmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.stackmap.BasicBlock;
import javassist.bytecode.stackmap.BasicBlock$Catch;
import javassist.bytecode.stackmap.BasicBlock$JsrBytecode;
import javassist.bytecode.stackmap.BasicBlock$Mark;

public class BasicBlock$Maker {
    protected BasicBlock makeBlock(int n6) {
        return new BasicBlock(n6);
    }

    protected BasicBlock[] makeArray(int n6) {
        return new BasicBlock[n6];
    }

    private BasicBlock[] makeArray(BasicBlock basicBlock) {
        BasicBlock[] arrbasicBlock = this.makeArray(1);
        arrbasicBlock[0] = basicBlock;
        return arrbasicBlock;
    }

    private BasicBlock[] makeArray(BasicBlock basicBlock, BasicBlock basicBlock2) {
        BasicBlock[] arrbasicBlock = this.makeArray(2);
        arrbasicBlock[0] = basicBlock;
        arrbasicBlock[1] = basicBlock2;
        return arrbasicBlock;
    }

    public BasicBlock[] make(MethodInfo methodInfo) throws BadBytecode {
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            return null;
        }
        CodeIterator codeIterator = codeAttribute.iterator();
        return this.make(codeIterator, 0, codeIterator.getCodeLength(), codeAttribute.getExceptionTable());
    }

    public BasicBlock[] make(CodeIterator codeIterator, int n6, int n10, ExceptionTable exceptionTable) throws BadBytecode {
        Map<Integer, BasicBlock$Mark> map = this.makeMarks(codeIterator, n6, n10, exceptionTable);
        BasicBlock[] arrbasicBlock = this.makeBlocks(map);
        this.addCatchers(arrbasicBlock, exceptionTable);
        return arrbasicBlock;
    }

    private BasicBlock$Mark makeMark(Map<Integer, BasicBlock$Mark> map, int n6) {
        return this.makeMark0(map, n6, true, true);
    }

    private BasicBlock$Mark makeMark(Map<Integer, BasicBlock$Mark> map, int n6, BasicBlock[] arrbasicBlock, int n10, boolean bl) {
        BasicBlock$Mark basicBlock$Mark = this.makeMark0(map, n6, false, false);
        basicBlock$Mark.setJump(arrbasicBlock, n10, bl);
        return basicBlock$Mark;
    }

    private BasicBlock$Mark makeMark0(Map<Integer, BasicBlock$Mark> map, int n6, boolean bl, boolean bl2) {
        Integer n10 = n6;
        BasicBlock$Mark basicBlock$Mark = map.get(n10);
        if (basicBlock$Mark == null) {
            basicBlock$Mark = new BasicBlock$Mark(n6);
            map.put(n10, basicBlock$Mark);
        }
        if (bl) {
            if (basicBlock$Mark.block == null) {
                basicBlock$Mark.block = this.makeBlock(n6);
            }
            if (bl2) {
                ++basicBlock$Mark.block.incoming;
            }
        }
        return basicBlock$Mark;
    }

    private Map<Integer, BasicBlock$Mark> makeMarks(CodeIterator codeIterator, int n6, int n10, ExceptionTable exceptionTable) throws BadBytecode {
        int n11;
        codeIterator.begin();
        codeIterator.move(n6);
        HashMap<Integer, BasicBlock$Mark> hashMap = new HashMap<Integer, BasicBlock$Mark>();
        while (codeIterator.hasNext() && (n11 = codeIterator.next()) < n10) {
            int n12 = codeIterator.byteAt(n11);
            if (153 <= n12 && n12 <= 166 || n12 == 198 || n12 == 199) {
                BasicBlock$Mark basicBlock$Mark = this.makeMark(hashMap, n11 + codeIterator.s16bitAt(n11 + 1));
                BasicBlock$Mark basicBlock$Mark2 = this.makeMark(hashMap, n11 + 3);
                this.makeMark(hashMap, n11, this.makeArray(basicBlock$Mark.block, basicBlock$Mark2.block), 3, false);
                continue;
            }
            if (167 <= n12 && n12 <= 171) {
                switch (n12) {
                    case 167: {
                        this.makeGoto(hashMap, n11, n11 + codeIterator.s16bitAt(n11 + 1), 3);
                        break;
                    }
                    case 168: {
                        this.makeJsr(hashMap, n11, n11 + codeIterator.s16bitAt(n11 + 1), 3);
                        break;
                    }
                    case 169: {
                        this.makeMark(hashMap, n11, null, 2, true);
                        break;
                    }
                    case 170: {
                        int n13;
                        int n14 = (n11 & 0xFFFFFFFC) + 4;
                        int n15 = codeIterator.s32bitAt(n14 + 4);
                        int n16 = codeIterator.s32bitAt(n14 + 8);
                        int n17 = n16 - n15 + 1;
                        BasicBlock[] arrbasicBlock = this.makeArray(n17 + 1);
                        arrbasicBlock[0] = this.makeMark(hashMap, (int)(n11 + codeIterator.s32bitAt((int)n14))).block;
                        int n18 = n13 + n17 * 4;
                        int n19 = 1;
                        for (n13 = n14 + 12; n13 < n18; n13 += 4) {
                            arrbasicBlock[n19++] = this.makeMark(hashMap, (int)(n11 + codeIterator.s32bitAt((int)n13))).block;
                        }
                        this.makeMark(hashMap, n11, arrbasicBlock, n18 - n11, true);
                        break;
                    }
                    case 171: {
                        int n17;
                        int n20 = (n11 & 0xFFFFFFFC) + 4;
                        int n21 = codeIterator.s32bitAt(n20 + 4);
                        BasicBlock[] arrbasicBlock = this.makeArray(n21 + 1);
                        arrbasicBlock[0] = this.makeMark(hashMap, (int)(n11 + codeIterator.s32bitAt((int)n20))).block;
                        int n22 = n17 + n21 * 8 - 4;
                        int n13 = 1;
                        for (n17 = n20 + 8 + 4; n17 < n22; n17 += 8) {
                            arrbasicBlock[n13++] = this.makeMark(hashMap, (int)(n11 + codeIterator.s32bitAt((int)n17))).block;
                        }
                        this.makeMark(hashMap, n11, arrbasicBlock, n22 - n11, true);
                        break;
                    }
                }
                continue;
            }
            if (172 <= n12 && n12 <= 177 || n12 == 191) {
                this.makeMark(hashMap, n11, null, 1, true);
                continue;
            }
            if (n12 == 200) {
                this.makeGoto(hashMap, n11, n11 + codeIterator.s32bitAt(n11 + 1), 5);
                continue;
            }
            if (n12 == 201) {
                this.makeJsr(hashMap, n11, n11 + codeIterator.s32bitAt(n11 + 1), 5);
                continue;
            }
            if (n12 != 196 || codeIterator.byteAt(n11 + 1) != 169) continue;
            this.makeMark(hashMap, n11, null, 4, true);
        }
        if (exceptionTable != null) {
            n11 = exceptionTable.size();
            while (--n11 >= 0) {
                this.makeMark0(hashMap, exceptionTable.startPc(n11), true, false);
                this.makeMark(hashMap, exceptionTable.handlerPc(n11));
            }
        }
        return hashMap;
    }

    private void makeGoto(Map<Integer, BasicBlock$Mark> map, int n6, int n10, int n11) {
        BasicBlock$Mark basicBlock$Mark = this.makeMark(map, n10);
        BasicBlock[] arrbasicBlock = this.makeArray(basicBlock$Mark.block);
        this.makeMark(map, n6, arrbasicBlock, n11, true);
    }

    protected void makeJsr(Map<Integer, BasicBlock$Mark> map, int n6, int n10, int n11) throws BadBytecode {
        throw new BasicBlock$JsrBytecode();
    }

    private BasicBlock[] makeBlocks(Map<Integer, BasicBlock$Mark> map) {
        Object[] arrobject = map.values().toArray(new BasicBlock$Mark[map.size()]);
        Arrays.sort(arrobject);
        ArrayList<BasicBlock> arrayList = new ArrayList<BasicBlock>();
        int n6 = 0;
        BasicBlock basicBlock = arrobject.length > 0 && ((BasicBlock$Mark)arrobject[0]).position == 0 && ((BasicBlock$Mark)arrobject[0]).block != null ? BasicBlock$Maker.getBBlock((BasicBlock$Mark)arrobject[n6++]) : this.makeBlock(0);
        arrayList.add(basicBlock);
        while (n6 < arrobject.length) {
            Object object;
            BasicBlock basicBlock2;
            if ((basicBlock2 = BasicBlock$Maker.getBBlock((BasicBlock$Mark)(object = arrobject[n6++]))) == null) {
                if (basicBlock.length > 0) {
                    basicBlock = this.makeBlock(basicBlock.position + basicBlock.length);
                    arrayList.add(basicBlock);
                }
                basicBlock.length = ((BasicBlock$Mark)object).position + ((BasicBlock$Mark)object).size - basicBlock.position;
                basicBlock.exit = ((BasicBlock$Mark)object).jump;
                basicBlock.stop = ((BasicBlock$Mark)object).alwaysJmp;
                continue;
            }
            if (basicBlock.length == 0) {
                basicBlock.length = ((BasicBlock$Mark)object).position - basicBlock.position;
                ++basicBlock2.incoming;
                basicBlock.exit = this.makeArray(basicBlock2);
            } else if (basicBlock.position + basicBlock.length < ((BasicBlock$Mark)object).position) {
                basicBlock = this.makeBlock(basicBlock.position + basicBlock.length);
                arrayList.add(basicBlock);
                basicBlock.length = ((BasicBlock$Mark)object).position - basicBlock.position;
                basicBlock.stop = true;
                basicBlock.exit = this.makeArray(basicBlock2);
            }
            arrayList.add(basicBlock2);
            basicBlock = basicBlock2;
        }
        return arrayList.toArray(this.makeArray(arrayList.size()));
    }

    private static BasicBlock getBBlock(BasicBlock$Mark basicBlock$Mark) {
        BasicBlock basicBlock = basicBlock$Mark.block;
        if (basicBlock != null && basicBlock$Mark.size > 0) {
            basicBlock.exit = basicBlock$Mark.jump;
            basicBlock.length = basicBlock$Mark.size;
            basicBlock.stop = basicBlock$Mark.alwaysJmp;
        }
        return basicBlock;
    }

    private void addCatchers(BasicBlock[] arrbasicBlock, ExceptionTable exceptionTable) throws BadBytecode {
        if (exceptionTable == null) {
            return;
        }
        int n6 = exceptionTable.size();
        while (--n6 >= 0) {
            BasicBlock basicBlock = BasicBlock.find(arrbasicBlock, exceptionTable.handlerPc(n6));
            int n10 = exceptionTable.startPc(n6);
            int n11 = exceptionTable.endPc(n6);
            int n12 = exceptionTable.catchType(n6);
            --basicBlock.incoming;
            for (int k = 0; k < arrbasicBlock.length; ++k) {
                BasicBlock basicBlock2 = arrbasicBlock[k];
                int n13 = basicBlock2.position;
                if (n10 > n13 || n13 >= n11) continue;
                basicBlock2.toCatch = new BasicBlock$Catch(basicBlock, n12, basicBlock2.toCatch);
                ++basicBlock.incoming;
            }
        }
    }
}

