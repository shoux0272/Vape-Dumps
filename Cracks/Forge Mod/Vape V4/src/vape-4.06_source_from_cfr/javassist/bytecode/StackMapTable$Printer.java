/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.PrintWriter;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.StackMapTable$Walker;

class StackMapTable$Printer
extends StackMapTable$Walker {
    private PrintWriter writer;
    private int offset;

    public static void print(StackMapTable stackMapTable, PrintWriter printWriter) {
        try {
            new StackMapTable$Printer(stackMapTable.get(), printWriter).parse();
        }
        catch (BadBytecode badBytecode) {
            printWriter.println(badBytecode.getMessage());
        }
    }

    StackMapTable$Printer(byte[] arrby, PrintWriter printWriter) {
        super(arrby);
        this.writer = printWriter;
        this.offset = -1;
    }

    @Override
    public void sameFrame(int n6, int n10) {
        this.offset += n10 + 1;
        this.writer.println(this.offset + " same frame: " + n10);
    }

    @Override
    public void sameLocals(int n6, int n10, int n11, int n12) {
        this.offset += n10 + 1;
        this.writer.println(this.offset + " same locals: " + n10);
        this.printTypeInfo(n11, n12);
    }

    @Override
    public void chopFrame(int n6, int n10, int n11) {
        this.offset += n10 + 1;
        this.writer.println(this.offset + " chop frame: " + n10 + ",    " + n11 + " last locals");
    }

    @Override
    public void appendFrame(int n6, int n10, int[] arrn, int[] arrn2) {
        this.offset += n10 + 1;
        this.writer.println(this.offset + " append frame: " + n10);
        for (int k = 0; k < arrn.length; ++k) {
            this.printTypeInfo(arrn[k], arrn2[k]);
        }
    }

    @Override
    public void fullFrame(int n6, int n10, int[] arrn, int[] arrn2, int[] arrn3, int[] arrn4) {
        int n11;
        this.offset += n10 + 1;
        this.writer.println(this.offset + " full frame: " + n10);
        this.writer.println("[locals]");
        for (n11 = 0; n11 < arrn.length; ++n11) {
            this.printTypeInfo(arrn[n11], arrn2[n11]);
        }
        this.writer.println("[stack]");
        for (n11 = 0; n11 < arrn3.length; ++n11) {
            this.printTypeInfo(arrn3[n11], arrn4[n11]);
        }
    }

    private void printTypeInfo(int n6, int n10) {
        String string = null;
        switch (n6) {
            case 0: {
                string = "top";
                break;
            }
            case 1: {
                string = "integer";
                break;
            }
            case 2: {
                string = "float";
                break;
            }
            case 3: {
                string = "double";
                break;
            }
            case 4: {
                string = "long";
                break;
            }
            case 5: {
                string = "null";
                break;
            }
            case 6: {
                string = "this";
                break;
            }
            case 7: {
                string = "object (cpool_index " + n10 + ")";
                break;
            }
            case 8: {
                string = "uninitialized (offset " + n10 + ")";
            }
        }
        this.writer.print("    ");
        this.writer.println(string);
    }
}

