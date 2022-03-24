/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.Opcode;

class CodeAnalyzer
implements Opcode {
    private ConstPool constPool;
    private CodeAttribute codeAttr;

    public CodeAnalyzer(CodeAttribute codeAttribute) {
        this.codeAttr = codeAttribute;
        this.constPool = codeAttribute.getConstPool();
    }

    public int computeMaxStack() throws BadBytecode {
        int n6;
        boolean bl;
        CodeIterator codeIterator = this.codeAttr.iterator();
        int n10 = codeIterator.getCodeLength();
        int[] arrn = new int[n10];
        this.constPool = this.codeAttr.getConstPool();
        this.initStack(arrn, this.codeAttr);
        do {
            bl = false;
            for (n6 = 0; n6 < n10; ++n6) {
                if (arrn[n6] >= 0) continue;
                bl = true;
                this.visitBytecode(codeIterator, arrn, n6);
            }
        } while (bl);
        n6 = 1;
        for (int k = 0; k < n10; ++k) {
            if (arrn[k] <= n6) continue;
            n6 = arrn[k];
        }
        return n6 - 1;
    }

    private void initStack(int[] arrn, CodeAttribute codeAttribute) {
        arrn[0] = -1;
        ExceptionTable exceptionTable = codeAttribute.getExceptionTable();
        if (exceptionTable != null) {
            int n6 = exceptionTable.size();
            for (int k = 0; k < n6; ++k) {
                arrn[exceptionTable.handlerPc((int)k)] = -2;
            }
        }
    }

    private void visitBytecode(CodeIterator codeIterator, int[] arrn, int n6) throws BadBytecode {
        int n10 = arrn.length;
        codeIterator.move(n6);
        int n11 = -arrn[n6];
        int[] arrn2 = new int[]{-1};
        while (codeIterator.hasNext()) {
            n6 = codeIterator.next();
            arrn[n6] = n11;
            int n12 = codeIterator.byteAt(n6);
            n11 = this.visitInst(n12, codeIterator, n6, n11);
            if (n11 < 1) {
                throw new BadBytecode("stack underflow at " + n6);
            }
            if (this.processBranch(n12, codeIterator, n6, n10, arrn, n11, arrn2) || CodeAnalyzer.isEnd(n12)) break;
            if (n12 != 168 && n12 != 201) continue;
            --n11;
        }
    }

    private boolean processBranch(int n6, CodeIterator codeIterator, int n10, int n11, int[] arrn, int n12, int[] arrn2) throws BadBytecode {
        if (153 <= n6 && n6 <= 166 || n6 == 198 || n6 == 199) {
            int n13 = n10 + codeIterator.s16bitAt(n10 + 1);
            this.checkTarget(n10, n13, n11, arrn, n12);
        } else {
            switch (n6) {
                case 167: {
                    int n14 = n10 + codeIterator.s16bitAt(n10 + 1);
                    this.checkTarget(n10, n14, n11, arrn, n12);
                    return true;
                }
                case 200: {
                    int n15 = n10 + codeIterator.s32bitAt(n10 + 1);
                    this.checkTarget(n10, n15, n11, arrn, n12);
                    return true;
                }
                case 168: 
                case 201: {
                    int n16 = n6 == 168 ? n10 + codeIterator.s16bitAt(n10 + 1) : n10 + codeIterator.s32bitAt(n10 + 1);
                    this.checkTarget(n10, n16, n11, arrn, n12);
                    if (arrn2[0] < 0) {
                        arrn2[0] = n12;
                        return false;
                    }
                    if (n12 == arrn2[0]) {
                        return false;
                    }
                    throw new BadBytecode("sorry, cannot compute this data flow due to JSR: " + n12 + "," + arrn2[0]);
                }
                case 169: {
                    if (arrn2[0] < 0) {
                        arrn2[0] = n12 + 1;
                        return false;
                    }
                    if (n12 + 1 == arrn2[0]) {
                        return true;
                    }
                    throw new BadBytecode("sorry, cannot compute this data flow due to RET: " + n12 + "," + arrn2[0]);
                }
                case 170: 
                case 171: {
                    int n17 = (n10 & 0xFFFFFFFC) + 4;
                    int n18 = n10 + codeIterator.s32bitAt(n17);
                    this.checkTarget(n10, n18, n11, arrn, n12);
                    if (n6 == 171) {
                        int n19 = codeIterator.s32bitAt(n17 + 4);
                        n17 += 12;
                        for (int k = 0; k < n19; ++k) {
                            n18 = n10 + codeIterator.s32bitAt(n17);
                            this.checkTarget(n10, n18, n11, arrn, n12);
                            n17 += 8;
                        }
                    } else {
                        int n20 = codeIterator.s32bitAt(n17 + 4);
                        int n21 = codeIterator.s32bitAt(n17 + 8);
                        int n22 = n21 - n20 + 1;
                        n17 += 12;
                        for (int k = 0; k < n22; ++k) {
                            n18 = n10 + codeIterator.s32bitAt(n17);
                            this.checkTarget(n10, n18, n11, arrn, n12);
                            n17 += 4;
                        }
                    }
                    return true;
                }
            }
        }
        return false;
    }

    private void checkTarget(int n6, int n10, int n11, int[] arrn, int n12) throws BadBytecode {
        if (n10 < 0 || n11 <= n10) {
            throw new BadBytecode("bad branch offset at " + n6);
        }
        int n13 = arrn[n10];
        if (n13 == 0) {
            arrn[n10] = -n12;
        } else if (n13 != n12 && n13 != -n12) {
            throw new BadBytecode("verification error (" + n12 + "," + n13 + ") at " + n6);
        }
    }

    private static boolean isEnd(int n6) {
        return 172 <= n6 && n6 <= 177 || n6 == 191;
    }

    private int visitInst(int n6, CodeIterator codeIterator, int n10, int n11) throws BadBytecode {
        switch (n6) {
            case 180: {
                n11 += this.getFieldSize(codeIterator, n10) - 1;
                break;
            }
            case 181: {
                n11 -= this.getFieldSize(codeIterator, n10) + 1;
                break;
            }
            case 178: {
                n11 += this.getFieldSize(codeIterator, n10);
                break;
            }
            case 179: {
                n11 -= this.getFieldSize(codeIterator, n10);
                break;
            }
            case 182: 
            case 183: {
                String string = this.constPool.getMethodrefType(codeIterator.u16bitAt(n10 + 1));
                n11 += Descriptor.dataSize(string) - 1;
                break;
            }
            case 184: {
                String string = this.constPool.getMethodrefType(codeIterator.u16bitAt(n10 + 1));
                n11 += Descriptor.dataSize(string);
                break;
            }
            case 185: {
                String string = this.constPool.getInterfaceMethodrefType(codeIterator.u16bitAt(n10 + 1));
                n11 += Descriptor.dataSize(string) - 1;
                break;
            }
            case 186: {
                String string = this.constPool.getInvokeDynamicType(codeIterator.u16bitAt(n10 + 1));
                n11 += Descriptor.dataSize(string);
                break;
            }
            case 191: {
                n11 = 1;
                break;
            }
            case 197: {
                n11 += 1 - codeIterator.byteAt(n10 + 3);
                break;
            }
            case 196: {
                n6 = codeIterator.byteAt(n10 + 1);
            }
            default: {
                n11 += STACK_GROW[n6];
            }
        }
        return n11;
    }

    private int getFieldSize(CodeIterator codeIterator, int n6) {
        String string = this.constPool.getFieldrefType(codeIterator.u16bitAt(n6 + 1));
        return Descriptor.dataSize(string);
    }
}

