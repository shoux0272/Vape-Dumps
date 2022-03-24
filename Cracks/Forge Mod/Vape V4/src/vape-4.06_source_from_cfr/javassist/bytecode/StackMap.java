/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javassist.CannotCompileException;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ByteArray;
import javassist.bytecode.ConstPool;
import javassist.bytecode.StackMap$Copier;
import javassist.bytecode.StackMap$InsertLocal;
import javassist.bytecode.StackMap$NewRemover;
import javassist.bytecode.StackMap$Printer;
import javassist.bytecode.StackMap$Shifter;
import javassist.bytecode.StackMap$SwitchShifter;

public class StackMap
extends AttributeInfo {
    public static final String tag = "StackMap";
    public static final int TOP = 0;
    public static final int INTEGER = 1;
    public static final int FLOAT = 2;
    public static final int DOUBLE = 3;
    public static final int LONG = 4;
    public static final int NULL = 5;
    public static final int THIS = 6;
    public static final int OBJECT = 7;
    public static final int UNINIT = 8;

    StackMap(ConstPool constPool, byte[] arrby) {
        super(constPool, tag, arrby);
    }

    StackMap(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    public int numOfEntries() {
        return ByteArray.readU16bit(this.info, 0);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) {
        StackMap$Copier stackMap$Copier = new StackMap$Copier(this, constPool, map);
        stackMap$Copier.visit();
        return stackMap$Copier.getStackMap();
    }

    public void insertLocal(int n6, int n10, int n11) throws BadBytecode {
        byte[] arrby = new StackMap$InsertLocal(this, n6, n10, n11).doit();
        this.set(arrby);
    }

    void shiftPc(int n6, int n10, boolean bl) throws BadBytecode {
        new StackMap$Shifter(this, n6, n10, bl).visit();
    }

    void shiftForSwitch(int n6, int n10) throws BadBytecode {
        new StackMap$SwitchShifter(this, n6, n10).visit();
    }

    public void removeNew(int n6) throws CannotCompileException {
        byte[] arrby = new StackMap$NewRemover(this, n6).doit();
        this.set(arrby);
    }

    public void print(PrintWriter printWriter) {
        new StackMap$Printer(this, printWriter).print();
    }
}

