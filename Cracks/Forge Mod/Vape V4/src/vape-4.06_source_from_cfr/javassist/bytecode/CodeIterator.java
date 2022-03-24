/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.ArrayList;
import java.util.List;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeAttribute$LdcEntry;
import javassist.bytecode.CodeIterator$AlignmentException;
import javassist.bytecode.CodeIterator$Branch;
import javassist.bytecode.CodeIterator$Branch16;
import javassist.bytecode.CodeIterator$Gap;
import javassist.bytecode.CodeIterator$If16;
import javassist.bytecode.CodeIterator$Jump16;
import javassist.bytecode.CodeIterator$Jump32;
import javassist.bytecode.CodeIterator$LdcW;
import javassist.bytecode.CodeIterator$Lookup;
import javassist.bytecode.CodeIterator$Pointers;
import javassist.bytecode.CodeIterator$Table;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.LineNumberAttribute;
import javassist.bytecode.LocalVariableAttribute;
import javassist.bytecode.Opcode;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;

public class CodeIterator
implements Opcode {
    protected CodeAttribute codeAttr;
    protected byte[] bytecode;
    protected int endPos;
    protected int currentPos;
    protected int mark;
    protected int mark2;
    private static final int[] opcodeLength = new int[]{1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 3, 2, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 2, 0, 0, 1, 1, 1, 1, 1, 1, 3, 3, 3, 3, 3, 3, 3, 5, 5, 3, 2, 3, 1, 1, 3, 3, 1, 1, 0, 4, 3, 3, 5, 5};

    protected CodeIterator(CodeAttribute codeAttribute) {
        this.codeAttr = codeAttribute;
        this.bytecode = codeAttribute.getCode();
        this.begin();
    }

    public void begin() {
        this.mark2 = 0;
        this.mark = 0;
        this.currentPos = 0;
        this.endPos = this.getCodeLength();
    }

    public void move(int n6) {
        this.currentPos = n6;
    }

    public void setMark(int n6) {
        this.mark = n6;
    }

    public void setMark2(int n6) {
        this.mark2 = n6;
    }

    public int getMark() {
        return this.mark;
    }

    public int getMark2() {
        return this.mark2;
    }

    public CodeAttribute get() {
        return this.codeAttr;
    }

    public int getCodeLength() {
        return this.bytecode.length;
    }

    public int byteAt(int n6) {
        return this.bytecode[n6] & 0xFF;
    }

    public int signedByteAt(int n6) {
        return this.bytecode[n6];
    }

    public void writeByte(int n6, int n10) {
        this.bytecode[n10] = (byte)n6;
    }

    public int u16bitAt(int n6) {
        return ByteArray.readU16bit(this.bytecode, n6);
    }

    public int s16bitAt(int n6) {
        return ByteArray.readS16bit(this.bytecode, n6);
    }

    public void write16bit(int n6, int n10) {
        ByteArray.write16bit(n6, this.bytecode, n10);
    }

    public int s32bitAt(int n6) {
        return ByteArray.read32bit(this.bytecode, n6);
    }

    public void write32bit(int n6, int n10) {
        ByteArray.write32bit(n6, this.bytecode, n10);
    }

    public void write(byte[] arrby, int n6) {
        for (byte this.bytecode[n6++] : arrby) {
        }
    }

    public boolean hasNext() {
        return this.currentPos < this.endPos;
    }

    public int next() throws BadBytecode {
        int n6 = this.currentPos;
        this.currentPos = CodeIterator.nextOpcode(this.bytecode, n6);
        return n6;
    }

    public int lookAhead() {
        return this.currentPos;
    }

    public int skipConstructor() throws BadBytecode {
        return this.skipSuperConstructor0(-1);
    }

    public int skipSuperConstructor() throws BadBytecode {
        return this.skipSuperConstructor0(0);
    }

    public int skipThisConstructor() throws BadBytecode {
        return this.skipSuperConstructor0(1);
    }

    private int skipSuperConstructor0(int n6) throws BadBytecode {
        this.begin();
        ConstPool constPool = this.codeAttr.getConstPool();
        String string = this.codeAttr.getDeclaringClass();
        int n10 = 0;
        while (this.hasNext()) {
            int n11;
            int n12 = this.next();
            int n13 = this.byteAt(n12);
            if (n13 == 187) {
                ++n10;
                continue;
            }
            if (n13 != 183 || !constPool.getMethodrefName(n11 = ByteArray.readU16bit(this.bytecode, n12 + 1)).equals("<init>") || --n10 >= 0) continue;
            if (n6 < 0) {
                return n12;
            }
            String string2 = constPool.getMethodrefClassName(n11);
            if (string2.equals(string) != n6 > 0) break;
            return n12;
        }
        this.begin();
        return -1;
    }

    public int insert(byte[] arrby) throws BadBytecode {
        return this.insert0(this.currentPos, arrby, false);
    }

    public void b(int n6, byte[] arrby) throws BadBytecode {
        this.insert0(n6, arrby, false);
    }

    public int insertAt(int n6, byte[] arrby) throws BadBytecode {
        return this.insert0(n6, arrby, false);
    }

    public int insertEx(byte[] arrby) throws BadBytecode {
        return this.insert0(this.currentPos, arrby, true);
    }

    public void c(int n6, byte[] arrby) throws BadBytecode {
        this.insert0(n6, arrby, true);
    }

    public int insertExAt(int n6, byte[] arrby) throws BadBytecode {
        return this.insert0(n6, arrby, true);
    }

    private int insert0(int n6, byte[] arrby, boolean bl) throws BadBytecode {
        int n10 = arrby.length;
        if (n10 <= 0) {
            return n6;
        }
        int n11 = n6 = this.insertGapAt((int)n6, (int)n10, (boolean)bl).position;
        for (int k = 0; k < n10; ++k) {
            this.bytecode[n11++] = arrby[k];
        }
        return n6;
    }

    public int insertGap(int n6) throws BadBytecode {
        return this.insertGapAt((int)this.currentPos, (int)n6, (boolean)false).position;
    }

    public int f(int n6, int n10) throws BadBytecode {
        return this.insertGapAt((int)n6, (int)n10, (boolean)false).length;
    }

    public int insertExGap(int n6) throws BadBytecode {
        return this.insertGapAt((int)this.currentPos, (int)n6, (boolean)true).position;
    }

    public int b(int n6, int n10) throws BadBytecode {
        return this.insertGapAt((int)n6, (int)n10, (boolean)true).length;
    }

    public CodeIterator$Gap insertGapAt(int n6, int n10, boolean bl) throws BadBytecode {
        int n11;
        byte[] arrby;
        CodeIterator$Gap codeIterator$Gap = new CodeIterator$Gap();
        if (n10 <= 0) {
            codeIterator$Gap.position = n6;
            codeIterator$Gap.length = 0;
            return codeIterator$Gap;
        }
        if (this.bytecode.length + n10 > 32767) {
            arrby = this.insertGapCore0w(this.bytecode, n6, n10, bl, this.get().getExceptionTable(), this.codeAttr, codeIterator$Gap);
            n6 = codeIterator$Gap.position;
            n11 = n10;
        } else {
            int n12 = this.currentPos;
            arrby = CodeIterator.insertGapCore0(this.bytecode, n6, n10, bl, this.get().getExceptionTable(), this.codeAttr);
            n11 = arrby.length - this.bytecode.length;
            codeIterator$Gap.position = n6;
            codeIterator$Gap.length = n11;
            if (n12 >= n6) {
                this.currentPos = n12 + n11;
            }
            if (this.mark > n6 || this.mark == n6 && bl) {
                this.mark += n11;
            }
            if (this.mark2 > n6 || this.mark2 == n6 && bl) {
                this.mark2 += n11;
            }
        }
        this.codeAttr.setCode(arrby);
        this.bytecode = arrby;
        this.endPos = this.getCodeLength();
        this.updateCursors(n6, n11);
        return codeIterator$Gap;
    }

    protected void updateCursors(int n6, int n10) {
    }

    public void insert(ExceptionTable exceptionTable, int n6) {
        this.codeAttr.getExceptionTable().add(0, exceptionTable, n6);
    }

    public int append(byte[] arrby) {
        int n6 = this.getCodeLength();
        int n10 = arrby.length;
        if (n10 <= 0) {
            return n6;
        }
        this.appendGap(n10);
        byte[] arrby2 = this.bytecode;
        for (int k = 0; k < n10; ++k) {
            arrby2[k + n6] = arrby[k];
        }
        return n6;
    }

    public void appendGap(int n6) {
        int n10;
        byte[] arrby = this.bytecode;
        int n11 = arrby.length;
        byte[] arrby2 = new byte[n11 + n6];
        for (n10 = 0; n10 < n11; ++n10) {
            arrby2[n10] = arrby[n10];
        }
        for (n10 = n11; n10 < n11 + n6; ++n10) {
            arrby2[n10] = 0;
        }
        this.codeAttr.setCode(arrby2);
        this.bytecode = arrby2;
        this.endPos = this.getCodeLength();
    }

    public void append(ExceptionTable exceptionTable, int n6) {
        ExceptionTable exceptionTable2 = this.codeAttr.getExceptionTable();
        exceptionTable2.add(exceptionTable2.size(), exceptionTable, n6);
    }

    static int nextOpcode(byte[] arrby, int n6) throws BadBytecode {
        int n10;
        try {
            n10 = arrby[n6] & 0xFF;
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            throw new BadBytecode("invalid opcode address");
        }
        try {
            int n11 = opcodeLength[n10];
            if (n11 > 0) {
                return n6 + n11;
            }
            if (n10 == 196) {
                if (arrby[n6 + 1] == -124) {
                    return n6 + 6;
                }
                return n6 + 4;
            }
            int n12 = (n6 & 0xFFFFFFFC) + 8;
            if (n10 == 171) {
                int n13 = ByteArray.read32bit(arrby, n12);
                return n12 + n13 * 8 + 4;
            }
            if (n10 == 170) {
                int n14 = ByteArray.read32bit(arrby, n12);
                int n15 = ByteArray.read32bit(arrby, n12 + 4);
                return n12 + (n15 - n14 + 1) * 4 + 8;
            }
        }
        catch (IndexOutOfBoundsException indexOutOfBoundsException) {
            // empty catch block
        }
        throw new BadBytecode(n10);
    }

    static byte[] insertGapCore0(byte[] arrby, int n6, int n10, boolean bl, ExceptionTable exceptionTable, CodeAttribute codeAttribute) throws BadBytecode {
        if (n10 <= 0) {
            return arrby;
        }
        try {
            return CodeIterator.insertGapCore1(arrby, n6, n10, bl, exceptionTable, codeAttribute);
        }
        catch (CodeIterator$AlignmentException codeIterator$AlignmentException) {
            try {
                return CodeIterator.insertGapCore1(arrby, n6, n10 + 3 & 0xFFFFFFFC, bl, exceptionTable, codeAttribute);
            }
            catch (CodeIterator$AlignmentException codeIterator$AlignmentException2) {
                throw new RuntimeException("fatal error?");
            }
        }
    }

    private static byte[] insertGapCore1(byte[] arrby, int n6, int n10, boolean bl, ExceptionTable exceptionTable, CodeAttribute codeAttribute) throws BadBytecode, CodeIterator$AlignmentException {
        StackMap stackMap;
        StackMapTable stackMapTable;
        LocalVariableAttribute localVariableAttribute;
        LocalVariableAttribute localVariableAttribute2;
        int n11 = arrby.length;
        byte[] arrby2 = new byte[n11 + n10];
        CodeIterator.insertGap2(arrby, n6, n10, n11, arrby2, bl);
        exceptionTable.shiftPc(n6, n10, bl);
        LineNumberAttribute lineNumberAttribute = (LineNumberAttribute)codeAttribute.getAttribute("LineNumberTable");
        if (lineNumberAttribute != null) {
            lineNumberAttribute.shiftPc(n6, n10, bl);
        }
        if ((localVariableAttribute2 = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTable")) != null) {
            localVariableAttribute2.shiftPc(n6, n10, bl);
        }
        if ((localVariableAttribute = (LocalVariableAttribute)codeAttribute.getAttribute("LocalVariableTypeTable")) != null) {
            localVariableAttribute.shiftPc(n6, n10, bl);
        }
        if ((stackMapTable = (StackMapTable)codeAttribute.getAttribute("StackMapTable")) != null) {
            stackMapTable.shiftPc(n6, n10, bl);
        }
        if ((stackMap = (StackMap)codeAttribute.getAttribute("StackMap")) != null) {
            stackMap.shiftPc(n6, n10, bl);
        }
        return arrby2;
    }

    private static void insertGap2(byte[] arrby, int n6, int n10, int n11, byte[] arrby2, boolean bl) throws BadBytecode, CodeIterator$AlignmentException {
        int n12 = 0;
        int n13 = 0;
        while (n12 < n11) {
            int n14;
            int n15;
            int n16;
            int n17;
            int n18;
            int n19;
            if (n12 == n6) {
                n19 = n13 + n10;
                while (n13 < n19) {
                    arrby2[n13++] = 0;
                }
            }
            int n20 = CodeIterator.nextOpcode(arrby, n12);
            n19 = arrby[n12] & 0xFF;
            if (153 <= n19 && n19 <= 168 || n19 == 198 || n19 == 199) {
                n18 = arrby[n12 + 1] << 8 | arrby[n12 + 2] & 0xFF;
                n18 = CodeIterator.newOffset(n12, n18, n6, n10, bl);
                arrby2[n13] = arrby[n12];
                ByteArray.write16bit(n18, arrby2, n13 + 1);
                n13 += 3;
            } else if (n19 == 200 || n19 == 201) {
                n18 = ByteArray.read32bit(arrby, n12 + 1);
                n18 = CodeIterator.newOffset(n12, n18, n6, n10, bl);
                arrby2[n13++] = arrby[n12];
                ByteArray.write32bit(n18, arrby2, n13);
                n13 += 4;
            } else if (n19 == 170) {
                if (n12 != n13 && (n10 & 3) != 0) {
                    throw new CodeIterator$AlignmentException();
                }
                n18 = (n12 & 0xFFFFFFFC) + 4;
                n13 = CodeIterator.copyGapBytes(arrby2, n13, arrby, n12, n18);
                n17 = CodeIterator.newOffset(n12, ByteArray.read32bit(arrby, n18), n6, n10, bl);
                ByteArray.write32bit(n17, arrby2, n13);
                n16 = ByteArray.read32bit(arrby, n18 + 4);
                ByteArray.write32bit(n16, arrby2, n13 + 4);
                n15 = ByteArray.read32bit(arrby, n18 + 8);
                ByteArray.write32bit(n15, arrby2, n13 + 8);
                n13 += 12;
                n14 = n18 + 12;
                n18 = n14 + (n15 - n16 + 1) * 4;
                while (n14 < n18) {
                    int n21 = CodeIterator.newOffset(n12, ByteArray.read32bit(arrby, n14), n6, n10, bl);
                    ByteArray.write32bit(n21, arrby2, n13);
                    n13 += 4;
                    n14 += 4;
                }
            } else if (n19 == 171) {
                if (n12 != n13 && (n10 & 3) != 0) {
                    throw new CodeIterator$AlignmentException();
                }
                n18 = (n12 & 0xFFFFFFFC) + 4;
                n13 = CodeIterator.copyGapBytes(arrby2, n13, arrby, n12, n18);
                n17 = CodeIterator.newOffset(n12, ByteArray.read32bit(arrby, n18), n6, n10, bl);
                ByteArray.write32bit(n17, arrby2, n13);
                n16 = ByteArray.read32bit(arrby, n18 + 4);
                ByteArray.write32bit(n16, arrby2, n13 + 4);
                n13 += 8;
                n15 = n18 + 8;
                n18 = n15 + n16 * 8;
                while (n15 < n18) {
                    ByteArray.copy32bit(arrby, n15, arrby2, n13);
                    n14 = CodeIterator.newOffset(n12, ByteArray.read32bit(arrby, n15 + 4), n6, n10, bl);
                    ByteArray.write32bit(n14, arrby2, n13 + 4);
                    n13 += 8;
                    n15 += 8;
                }
            } else {
                while (n12 < n20) {
                    arrby2[n13++] = arrby[n12++];
                }
            }
            n12 = n20;
        }
    }

    private static int copyGapBytes(byte[] arrby, int n6, byte[] arrby2, int n10, int n11) {
        switch (n11 - n10) {
            case 4: {
                arrby[n6++] = arrby2[n10++];
            }
            case 3: {
                arrby[n6++] = arrby2[n10++];
            }
            case 2: {
                arrby[n6++] = arrby2[n10++];
            }
            case 1: {
                arrby[n6++] = arrby2[n10++];
            }
        }
        return n6;
    }

    private static int newOffset(int n6, int n10, int n11, int n12, boolean bl) {
        int n13 = n6 + n10;
        if (n6 < n11) {
            if (n11 < n13 || bl && n11 == n13) {
                n10 += n12;
            }
        } else if (n6 == n11) {
            if (n13 < n11) {
                n10 -= n12;
            }
        } else if (n13 < n11 || !bl && n11 == n13) {
            n10 -= n12;
        }
        return n10;
    }

    static byte[] changeLdcToLdcW(byte[] arrby, ExceptionTable exceptionTable, CodeAttribute codeAttribute, CodeAttribute$LdcEntry codeAttribute$LdcEntry) throws BadBytecode {
        CodeIterator$Pointers codeIterator$Pointers = new CodeIterator$Pointers(0, 0, 0, 0, exceptionTable, codeAttribute);
        List<CodeIterator$Branch> list = CodeIterator.makeJumpList(arrby, arrby.length, codeIterator$Pointers);
        while (codeAttribute$LdcEntry != null) {
            CodeIterator.addLdcW(codeAttribute$LdcEntry, list);
            codeAttribute$LdcEntry = codeAttribute$LdcEntry.next;
        }
        byte[] arrby2 = CodeIterator.insertGap2w(arrby, 0, 0, false, list, codeIterator$Pointers);
        return arrby2;
    }

    private static void addLdcW(CodeAttribute$LdcEntry codeAttribute$LdcEntry, List<CodeIterator$Branch> list) {
        int n6 = codeAttribute$LdcEntry.where;
        CodeIterator$LdcW codeIterator$LdcW = new CodeIterator$LdcW(n6, codeAttribute$LdcEntry.index);
        int n10 = list.size();
        for (int k = 0; k < n10; ++k) {
            if (n6 >= list.get((int)k).orgPos) continue;
            list.add(k, codeIterator$LdcW);
            return;
        }
        list.add(codeIterator$LdcW);
    }

    private byte[] insertGapCore0w(byte[] arrby, int n6, int n10, boolean bl, ExceptionTable exceptionTable, CodeAttribute codeAttribute, CodeIterator$Gap codeIterator$Gap) throws BadBytecode {
        if (n10 <= 0) {
            return arrby;
        }
        CodeIterator$Pointers codeIterator$Pointers = new CodeIterator$Pointers(this.currentPos, this.mark, this.mark2, n6, exceptionTable, codeAttribute);
        List<CodeIterator$Branch> list = CodeIterator.makeJumpList(arrby, arrby.length, codeIterator$Pointers);
        byte[] arrby2 = CodeIterator.insertGap2w(arrby, n6, n10, bl, list, codeIterator$Pointers);
        this.currentPos = codeIterator$Pointers.cursor;
        this.mark = codeIterator$Pointers.mark;
        this.mark2 = codeIterator$Pointers.mark2;
        int n11 = codeIterator$Pointers.mark0;
        if (n11 == this.currentPos && !bl) {
            this.currentPos += n10;
        }
        if (bl) {
            n11 -= n10;
        }
        codeIterator$Gap.position = n11;
        codeIterator$Gap.length = n10;
        return arrby2;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Lifted jumps to return sites
     */
    private static byte[] insertGap2w(byte[] var0, int var1_1, int var2_2, boolean var3_3, List<CodeIterator$Branch> var4_4, CodeIterator$Pointers var5_5) throws BadBytecode {
        if (var2_2 > 0) {
            var5_5.shiftPc(var1_1, var2_2, var3_3);
            for (CodeIterator$Branch var7_8 : var4_4) {
                var7_8.shift(var1_1, var2_2, var3_3);
            }
        }
        var6_7 = true;
        do lbl-1000:
        // 3 sources

        {
            block7: {
                if (!var6_7) break block7;
                var6_7 = false;
                var7_10 = var4_4.iterator();
                block2: while (true) lbl-1000:
                // 3 sources

                {
                    if (!var7_10.hasNext()) ** GOTO lbl-1000
                    var8_12 = var7_10.next();
                    if (!var8_12.expanded()) ** GOTO lbl-1000
                    var6_7 = true;
                    var9_13 = var8_12.pos;
                    var10_14 = var8_12.deltaSize();
                    var5_5.shiftPc(var9_13, var10_14, false);
                    var11_15 = var4_4.iterator();
                    while (true) {
                        if (!var11_15.hasNext()) continue block2;
                        var12_16 = var11_15.next();
                        var12_16.shift(var9_13, var10_14, false);
                    }
                    break;
                }
            }
            for (CodeIterator$Branch var8_12 : var4_4) {
                var9_13 = var8_12.gapChanged();
                if (var9_13 <= 0) continue;
                var6_7 = true;
                var10_14 = var8_12.pos;
                var5_5.shiftPc(var10_14, var9_13, false);
                for (CodeIterator$Branch var12_16 : var4_4) {
                    var12_16.shift(var10_14, var9_13, false);
                }
            }
        } while (var6_7);
        return CodeIterator.makeExapndedCode(var0, var4_4, var1_1, var2_2);
    }

    private static List<CodeIterator$Branch> makeJumpList(byte[] arrby, int n6, CodeIterator$Pointers codeIterator$Pointers) throws BadBytecode {
        ArrayList<CodeIterator$Branch> arrayList = new ArrayList<CodeIterator$Branch>();
        int n10 = 0;
        while (n10 < n6) {
            int n11;
            int n12;
            int n13;
            int n14 = CodeIterator.nextOpcode(arrby, n10);
            int n15 = arrby[n10] & 0xFF;
            if (153 <= n15 && n15 <= 168 || n15 == 198 || n15 == 199) {
                n13 = arrby[n10 + 1] << 8 | arrby[n10 + 2] & 0xFF;
                CodeIterator$Branch16 codeIterator$Branch16 = n15 == 167 || n15 == 168 ? new CodeIterator$Jump16(n10, n13) : new CodeIterator$If16(n10, n13);
                arrayList.add(codeIterator$Branch16);
            } else if (n15 == 200 || n15 == 201) {
                n13 = ByteArray.read32bit(arrby, n10 + 1);
                arrayList.add(new CodeIterator$Jump32(n10, n13));
            } else if (n15 == 170) {
                n13 = (n10 & 0xFFFFFFFC) + 4;
                int n16 = ByteArray.read32bit(arrby, n13);
                n12 = ByteArray.read32bit(arrby, n13 + 4);
                n11 = ByteArray.read32bit(arrby, n13 + 8);
                int n17 = n13 + 12;
                int n18 = n11 - n12 + 1;
                int[] arrn = new int[n18];
                for (int k = 0; k < n18; ++k) {
                    arrn[k] = ByteArray.read32bit(arrby, n17);
                    n17 += 4;
                }
                arrayList.add(new CodeIterator$Table(n10, n16, n12, n11, arrn, codeIterator$Pointers));
            } else if (n15 == 171) {
                n13 = (n10 & 0xFFFFFFFC) + 4;
                int n19 = ByteArray.read32bit(arrby, n13);
                n12 = ByteArray.read32bit(arrby, n13 + 4);
                n11 = n13 + 8;
                int[] arrn = new int[n12];
                int[] arrn2 = new int[n12];
                for (int k = 0; k < n12; ++k) {
                    arrn[k] = ByteArray.read32bit(arrby, n11);
                    arrn2[k] = ByteArray.read32bit(arrby, n11 + 4);
                    n11 += 8;
                }
                arrayList.add(new CodeIterator$Lookup(n10, n19, arrn, arrn2, codeIterator$Pointers));
            }
            n10 = n14;
        }
        return arrayList;
    }

    private static byte[] makeExapndedCode(byte[] arrby, List<CodeIterator$Branch> list, int n6, int n10) throws BadBytecode {
        int n11;
        CodeIterator$Branch codeIterator$Branch;
        int n12 = list.size();
        int n13 = arrby.length + n10;
        for (CodeIterator$Branch codeIterator$Branch2 : list) {
            n13 += codeIterator$Branch2.deltaSize();
        }
        Object object = new byte[n13];
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = arrby.length;
        if (0 < n12) {
            codeIterator$Branch = list.get(0);
            n11 = codeIterator$Branch.orgPos;
        } else {
            codeIterator$Branch = null;
            n11 = n17;
        }
        while (n14 < n17) {
            int n18;
            if (n14 == n6) {
                n18 = n15 + n10;
                while (n15 < n18) {
                    object[n15++] = false;
                }
            }
            if (n14 != n11) {
                object[n15++] = arrby[n14++];
                continue;
            }
            n18 = codeIterator$Branch.write(n14, arrby, n15, (byte[])object);
            n14 += n18;
            n15 += n18 + codeIterator$Branch.deltaSize();
            if (++n16 < n12) {
                codeIterator$Branch = list.get(n16);
                n11 = codeIterator$Branch.orgPos;
                continue;
            }
            codeIterator$Branch = null;
            n11 = n17;
        }
        return object;
    }
}

