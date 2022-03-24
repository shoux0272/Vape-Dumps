/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Map;
import javassist.CannotCompileException;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ConstPool;
import javassist.bytecode.StackMapTable$Copier;
import javassist.bytecode.StackMapTable$InsertLocal;
import javassist.bytecode.StackMapTable$NewRemover;
import javassist.bytecode.StackMapTable$OffsetShifter;
import javassist.bytecode.StackMapTable$Printer;
import javassist.bytecode.StackMapTable$RuntimeCopyException;
import javassist.bytecode.StackMapTable$Shifter;
import javassist.bytecode.StackMapTable$SwitchShifter;

public class StackMapTable
extends AttributeInfo {
    public static final String tag = "StackMapTable";
    public static final int TOP = 0;
    public static final int INTEGER = 1;
    public static final int FLOAT = 2;
    public static final int DOUBLE = 3;
    public static final int LONG = 4;
    public static final int NULL = 5;
    public static final int THIS = 6;
    public static final int OBJECT = 7;
    public static final int UNINIT = 8;

    StackMapTable(ConstPool constPool, byte[] arrby) {
        super(constPool, tag, arrby);
    }

    StackMapTable(ConstPool constPool, int n6, DataInputStream dataInputStream) throws IOException {
        super(constPool, n6, dataInputStream);
    }

    @Override
    public AttributeInfo copy(ConstPool constPool, Map<String, String> map) throws StackMapTable$RuntimeCopyException {
        try {
            return new StackMapTable(constPool, new StackMapTable$Copier(this.constPool, this.info, constPool, map).doit());
        }
        catch (BadBytecode badBytecode) {
            throw new StackMapTable$RuntimeCopyException("bad bytecode. fatal?");
        }
    }

    @Override
    void write(DataOutputStream dataOutputStream) throws IOException {
        super.write(dataOutputStream);
    }

    public void insertLocal(int n6, int n10, int n11) throws BadBytecode {
        byte[] arrby = new StackMapTable$InsertLocal(this.get(), n6, n10, n11).doit();
        this.set(arrby);
    }

    public static int typeTagOf(char c3) {
        switch (c3) {
            case 'D': {
                return 3;
            }
            case 'F': {
                return 2;
            }
            case 'J': {
                return 4;
            }
            case 'L': 
            case '[': {
                return 7;
            }
        }
        return 1;
    }

    public void println(PrintWriter printWriter) {
        StackMapTable$Printer.print(this, printWriter);
    }

    public void println(PrintStream printStream) {
        StackMapTable$Printer.print(this, new PrintWriter(printStream, true));
    }

    void shiftPc(int n6, int n10, boolean bl) throws BadBytecode {
        new StackMapTable$OffsetShifter(this, n6, n10).parse();
        new StackMapTable$Shifter(this, n6, n10, bl).doit();
    }

    void shiftForSwitch(int n6, int n10) throws BadBytecode {
        new StackMapTable$SwitchShifter(this, n6, n10).doit();
    }

    public void removeNew(int n6) throws CannotCompileException {
        try {
            byte[] arrby = new StackMapTable$NewRemover(this.get(), n6).doit();
            this.set(arrby);
        }
        catch (BadBytecode badBytecode) {
            throw new CannotCompileException("bad stack map table", badBytecode);
        }
    }
}

