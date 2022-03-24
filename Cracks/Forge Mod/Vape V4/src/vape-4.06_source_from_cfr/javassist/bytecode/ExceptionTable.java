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
import javassist.bytecode.ConstPool;
import javassist.bytecode.ExceptionTableEntry;

public class ExceptionTable
implements Cloneable {
    private ConstPool constPool;
    private List<ExceptionTableEntry> entries;

    public ExceptionTable(ConstPool constPool) {
        this.constPool = constPool;
        this.entries = new ArrayList<ExceptionTableEntry>();
    }

    ExceptionTable(ConstPool constPool, DataInputStream dataInputStream) throws IOException {
        this.constPool = constPool;
        int n6 = dataInputStream.readUnsignedShort();
        ArrayList<ExceptionTableEntry> arrayList = new ArrayList<ExceptionTableEntry>(n6);
        for (int k = 0; k < n6; ++k) {
            int n10 = dataInputStream.readUnsignedShort();
            int n11 = dataInputStream.readUnsignedShort();
            int n12 = dataInputStream.readUnsignedShort();
            int n13 = dataInputStream.readUnsignedShort();
            arrayList.add(new ExceptionTableEntry(n10, n11, n12, n13));
        }
        this.entries = arrayList;
    }

    public Object clone() throws CloneNotSupportedException {
        ExceptionTable exceptionTable = (ExceptionTable)super.clone();
        exceptionTable.entries = new ArrayList<ExceptionTableEntry>(this.entries);
        return exceptionTable;
    }

    public int size() {
        return this.entries.size();
    }

    public int startPc(int n6) {
        return this.entries.get((int)n6).startPc;
    }

    public void setStartPc(int n6, int n10) {
        this.entries.get((int)n6).startPc = n10;
    }

    public int endPc(int n6) {
        return this.entries.get((int)n6).endPc;
    }

    public void setEndPc(int n6, int n10) {
        this.entries.get((int)n6).endPc = n10;
    }

    public int handlerPc(int n6) {
        return this.entries.get((int)n6).handlerPc;
    }

    public void setHandlerPc(int n6, int n10) {
        this.entries.get((int)n6).handlerPc = n10;
    }

    public int catchType(int n6) {
        return this.entries.get((int)n6).catchType;
    }

    public void setCatchType(int n6, int n10) {
        this.entries.get((int)n6).catchType = n10;
    }

    public void add(int n6, ExceptionTable exceptionTable, int n10) {
        int n11 = exceptionTable.size();
        while (--n11 >= 0) {
            ExceptionTableEntry exceptionTableEntry = exceptionTable.entries.get(n11);
            this.add(n6, exceptionTableEntry.startPc + n10, exceptionTableEntry.endPc + n10, exceptionTableEntry.handlerPc + n10, exceptionTableEntry.catchType);
        }
    }

    public void add(int n6, int n10, int n11, int n12, int n13) {
        if (n10 < n11) {
            this.entries.add(n6, new ExceptionTableEntry(n10, n11, n12, n13));
        }
    }

    public void add(int n6, int n10, int n11, int n12) {
        if (n6 < n10) {
            this.entries.add(new ExceptionTableEntry(n6, n10, n11, n12));
        }
    }

    public void remove(int n6) {
        this.entries.remove(n6);
    }

    public ExceptionTable copy(ConstPool constPool, Map<String, String> map) {
        ExceptionTable exceptionTable = new ExceptionTable(constPool);
        ConstPool constPool2 = this.constPool;
        for (ExceptionTableEntry exceptionTableEntry : this.entries) {
            int n6 = constPool2.copy(exceptionTableEntry.catchType, constPool, map);
            exceptionTable.add(exceptionTableEntry.startPc, exceptionTableEntry.endPc, exceptionTableEntry.handlerPc, n6);
        }
        return exceptionTable;
    }

    void shiftPc(int n6, int n10, boolean bl) {
        for (ExceptionTableEntry exceptionTableEntry : this.entries) {
            exceptionTableEntry.startPc = ExceptionTable.shiftPc(exceptionTableEntry.startPc, n6, n10, bl);
            exceptionTableEntry.endPc = ExceptionTable.shiftPc(exceptionTableEntry.endPc, n6, n10, bl);
            exceptionTableEntry.handlerPc = ExceptionTable.shiftPc(exceptionTableEntry.handlerPc, n6, n10, bl);
        }
    }

    private static int shiftPc(int n6, int n10, int n11, boolean bl) {
        if (n6 > n10 || bl && n6 == n10) {
            n6 += n11;
        }
        return n6;
    }

    void write(DataOutputStream dataOutputStream) throws IOException {
        dataOutputStream.writeShort(this.size());
        for (ExceptionTableEntry exceptionTableEntry : this.entries) {
            dataOutputStream.writeShort(exceptionTableEntry.startPc);
            dataOutputStream.writeShort(exceptionTableEntry.endPc);
            dataOutputStream.writeShort(exceptionTableEntry.handlerPc);
            dataOutputStream.writeShort(exceptionTableEntry.catchType);
        }
    }
}

