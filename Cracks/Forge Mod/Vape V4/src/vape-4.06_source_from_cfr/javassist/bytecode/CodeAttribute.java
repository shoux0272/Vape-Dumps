/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAnalyzer;
import javassist.bytecode.CodeAttribute$LdcEntry;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.ExceptionTable;
import javassist.bytecode.Opcode;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;

public class CodeAttribute
extends AttributeInfo
implements Opcode {
    public static final String tag = "Code";
    private int maxStack;
    private int maxLocals;
    private ExceptionTable exceptions;
    private List<AttributeInfo> attributes;

    public CodeAttribute(ConstPool constPool, int n6, int n10, byte[] arrby, ExceptionTable exceptionTable) {
        super(constPool, tag);
        this.maxStack = n6;
        this.maxLocals = n10;
        this.info = arrby;
        this.exceptions = exceptionTable;
        this.attributes = new ArrayList<AttributeInfo>();
    }

    private CodeAttribute(ConstPool constPool, CodeAttribute codeAttribute, Map<String, String> map) throws BadBytecode {
        super(constPool, tag);
        this.maxStack = codeAttribute.getMaxStack();
        this.maxLocals = codeAttribute.getMaxLocals();
        this.exceptions = codeAttribute.getExceptionTable().copy(constPool, map);
        this.attributes = new ArrayList<AttributeInfo>();
        List<AttributeInfo> list = codeAttribute.getAttributes();
        int n6 = list.size();
        for (int k = 0; k < n6; ++k) {
            AttributeInfo attributeInfo = list.get(k);
            this.attributes.add(attributeInfo.copy(constPool, map));
        }
        this.info = codeAttribute.copyCode(constPool, map, this.exceptions, this);
    }

    CodeAttribute(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, (byte[])null);
        int n10 = dataInputStream.readInt();
        this.maxStack = dataInputStream.readUnsignedShort();
        this.maxLocals = dataInputStream.readUnsignedShort();
        int n11 = dataInputStream.readInt();
        this.info = new byte[n11];
        dataInputStream.readFully(this.info);
        this.exceptions = new ExceptionTable(constPool, dataInputStream);
        this.attributes = new ArrayList<AttributeInfo>();
        int n12 = dataInputStream.readUnsignedShort();
        for (int k = 0; k < n12; ++k) {
            this.attributes.add(AttributeInfo.read(constPool, dataInputStream));
        }
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) throws CodeAttribute$RuntimeCopyException {
        try {
            return new CodeAttribute(constPool, this, map);
        }
        catch (BadBytecode badBytecode) {
            throw new CodeAttribute$RuntimeCopyException("bad bytecode. fatal?");
        }
    }

    @Override
    public int length() {
        return 18 + this.info.length + this.exceptions.size() * 8 + AttributeInfo.getLength(this.attributes);
    }

    @Override
    void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.name);
        dataOutputStream.writeInt(this.length() - 6);
        dataOutputStream.writeShort(this.maxStack);
        dataOutputStream.writeShort(this.maxLocals);
        dataOutputStream.writeInt(this.info.length);
        dataOutputStream.write(this.info);
        this.exceptions.write(dataOutputStream);
        dataOutputStream.writeShort(this.attributes.size());
        AttributeInfo.writeAll(this.attributes, dataOutputStream);
    }

    @Override
    public byte[] get() {
        throw new UnsupportedOperationException("CodeAttribute.get()");
    }

    @Override
    public void set(byte[] arrby) {
        throw new UnsupportedOperationException("CodeAttribute.set()");
    }

    @Override
    void renameClass(String string, String string2) {
        AttributeInfo.renameClass(this.attributes, string, string2);
    }

    @Override
    void renameClass(Map<String, String> map) {
        AttributeInfo.renameClass(this.attributes, map);
    }

    @Override
    void getRefClasses(Map<String, String> map) {
        AttributeInfo.getRefClasses(this.attributes, map);
    }

    public String getDeclaringClass() {
        ConstPool constPool = this.getConstPool();
        return constPool.getClassName();
    }

    public int getMaxStack() {
        return this.maxStack;
    }

    public void setMaxStack(int n6) {
        this.maxStack = n6;
    }

    public int computeMaxStack() throws BadBytecode {
        this.maxStack = new CodeAnalyzer(this).computeMaxStack();
        return this.maxStack;
    }

    public int getMaxLocals() {
        return this.maxLocals;
    }

    public void setMaxLocals(int n6) {
        this.maxLocals = n6;
    }

    public int getCodeLength() {
        return this.info.length;
    }

    public byte[] getCode() {
        return this.info;
    }

    void setCode(byte[] arrby) {
        super.set(arrby);
    }

    public CodeIterator iterator() {
        return new CodeIterator(this);
    }

    public ExceptionTable getExceptionTable() {
        return this.exceptions;
    }

    public List<AttributeInfo> getAttributes() {
        return this.attributes;
    }

    public AttributeInfo getAttribute(String string) {
        return AttributeInfo.lookup(this.attributes, string);
    }

    public void setAttribute(StackMapTable stackMapTable) {
        AttributeInfo.remove(this.attributes, "StackMapTable");
        if (stackMapTable != null) {
            this.attributes.add(stackMapTable);
        }
    }

    public void setAttribute(StackMap stackMap) {
        AttributeInfo.remove(this.attributes, "StackMap");
        if (stackMap != null) {
            this.attributes.add(stackMap);
        }
    }

    private byte[] copyCode(ConstPool constPool, Map<String, String> map, ExceptionTable exceptionTable, CodeAttribute codeAttribute) throws BadBytecode {
        int n6 = this.getCodeLength();
        byte[] arrby = new byte[n6];
        codeAttribute.info = arrby;
        CodeAttribute$LdcEntry codeAttribute$LdcEntry = CodeAttribute.copyCode(this.info, 0, n6, this.getConstPool(), arrby, constPool, map);
        return CodeAttribute$LdcEntry.doit(arrby, codeAttribute$LdcEntry, exceptionTable, codeAttribute);
    }

    private static CodeAttribute$LdcEntry copyCode(byte[] arrby, int n6, int n10, ConstPool constPool, byte[] arrby2, ConstPool constPool2, Map<String, String> map) throws BadBytecode {
        CodeAttribute$LdcEntry codeAttribute$LdcEntry = null;
        int n11 = n6;
        while (n11 < n10) {
            byte by;
            int n12 = CodeIterator.nextOpcode(arrby, n11);
            arrby2[n11] = by = arrby[n11];
            switch (by & 0xFF) {
                case 19: 
                case 20: 
                case 178: 
                case 179: 
                case 180: 
                case 181: 
                case 182: 
                case 183: 
                case 184: 
                case 187: 
                case 189: 
                case 192: 
                case 193: {
                    CodeAttribute.copyConstPoolInfo(n11 + 1, arrby, constPool, arrby2, constPool2, map);
                    break;
                }
                case 18: {
                    int n13 = arrby[n11 + 1] & 0xFF;
                    n13 = constPool.copy(n13, constPool2, map);
                    if (n13 < 256) {
                        arrby2[n11 + 1] = (byte)n13;
                        break;
                    }
                    arrby2[n11] = 0;
                    arrby2[n11 + 1] = 0;
                    CodeAttribute$LdcEntry codeAttribute$LdcEntry2 = new CodeAttribute$LdcEntry();
                    codeAttribute$LdcEntry2.where = n11;
                    codeAttribute$LdcEntry2.index = n13;
                    codeAttribute$LdcEntry2.next = codeAttribute$LdcEntry;
                    codeAttribute$LdcEntry = codeAttribute$LdcEntry2;
                    break;
                }
                case 185: {
                    CodeAttribute.copyConstPoolInfo(n11 + 1, arrby, constPool, arrby2, constPool2, map);
                    arrby2[n11 + 3] = arrby[n11 + 3];
                    arrby2[n11 + 4] = arrby[n11 + 4];
                    break;
                }
                case 186: {
                    CodeAttribute.copyConstPoolInfo(n11 + 1, arrby, constPool, arrby2, constPool2, map);
                    arrby2[n11 + 3] = 0;
                    arrby2[n11 + 4] = 0;
                    break;
                }
                case 197: {
                    CodeAttribute.copyConstPoolInfo(n11 + 1, arrby, constPool, arrby2, constPool2, map);
                    arrby2[n11 + 3] = arrby[n11 + 3];
                    break;
                }
                default: {
                    while (++n11 < n12) {
                        arrby2[n11] = arrby[n11];
                    }
                    break block0;
                }
            }
            n11 = n12;
        }
        return codeAttribute$LdcEntry;
    }

    private static void copyConstPoolInfo(int n6, byte[] arrby, ConstPool constPool, byte[] arrby2, ConstPool constPool2, Map<String, String> map) {
        int n10 = (arrby[n6] & 0xFF) << 8 | arrby[n6 + 1] & 0xFF;
        n10 = constPool.copy(n10, constPool2, map);
        arrby2[n6] = (byte)(n10 >> 8);
        arrby2[n6 + 1] = (byte)n10;
    }

    public void insertLocalVar(int n6, int n10) throws BadBytecode {
        CodeIterator codeIterator = this.iterator();
        while (codeIterator.hasNext()) {
            CodeAttribute.shiftIndex(codeIterator, n6, n10);
        }
        this.setMaxLocals(this.getMaxLocals() + n10);
    }

    private static void shiftIndex(CodeIterator codeIterator, int n6, int n10) throws BadBytecode {
        int n11 = codeIterator.next();
        int n12 = codeIterator.byteAt(n11);
        if (n12 < 21) {
            return;
        }
        if (n12 < 79) {
            if (n12 < 26) {
                CodeAttribute.shiftIndex8(codeIterator, n11, n12, n6, n10);
            } else if (n12 < 46) {
                CodeAttribute.shiftIndex0(codeIterator, n11, n12, n6, n10, 26, 21);
            } else {
                if (n12 < 54) {
                    return;
                }
                if (n12 < 59) {
                    CodeAttribute.shiftIndex8(codeIterator, n11, n12, n6, n10);
                } else {
                    CodeAttribute.shiftIndex0(codeIterator, n11, n12, n6, n10, 59, 54);
                }
            }
        } else if (n12 == 132) {
            int n13 = codeIterator.byteAt(n11 + 1);
            if (n13 < n6) {
                return;
            }
            if ((n13 += n10) < 256) {
                codeIterator.writeByte(n13, n11 + 1);
            } else {
                byte by = (byte)codeIterator.byteAt(n11 + 2);
                int n14 = codeIterator.insertExGap(3);
                codeIterator.writeByte(196, n14 - 3);
                codeIterator.writeByte(132, n14 - 2);
                codeIterator.write16bit(n13, n14 - 1);
                codeIterator.write16bit(by, n14 + 1);
            }
        } else if (n12 == 169) {
            CodeAttribute.shiftIndex8(codeIterator, n11, n12, n6, n10);
        } else if (n12 == 196) {
            int n15 = codeIterator.u16bitAt(n11 + 2);
            if (n15 < n6) {
                return;
            }
            codeIterator.write16bit(n15 += n10, n11 + 2);
        }
    }

    private static void shiftIndex8(CodeIterator codeIterator, int n6, int n10, int n11, int n12) throws BadBytecode {
        int n13 = codeIterator.byteAt(n6 + 1);
        if (n13 < n11) {
            return;
        }
        if ((n13 += n12) < 256) {
            codeIterator.writeByte(n13, n6 + 1);
        } else {
            int n14 = codeIterator.insertExGap(2);
            codeIterator.writeByte(196, n14 - 2);
            codeIterator.writeByte(n10, n14 - 1);
            codeIterator.write16bit(n13, n14);
        }
    }

    private static void shiftIndex0(CodeIterator codeIterator, int n6, int n10, int n11, int n12, int n13, int n14) throws BadBytecode {
        int n15 = (n10 - n13) % 4;
        if (n15 < n11) {
            return;
        }
        if ((n15 += n12) < 4) {
            codeIterator.writeByte(n10 + n12, n6);
        } else {
            n10 = (n10 - n13) / 4 + n14;
            if (n15 < 256) {
                int n16 = codeIterator.insertExGap(1);
                codeIterator.writeByte(n10, n16 - 1);
                codeIterator.writeByte(n15, n16);
            } else {
                int n17 = codeIterator.insertExGap(3);
                codeIterator.writeByte(196, n17 - 1);
                codeIterator.writeByte(n10, n17);
                codeIterator.write16bit(n15, n17 + 1);
            }
        }
    }
}

