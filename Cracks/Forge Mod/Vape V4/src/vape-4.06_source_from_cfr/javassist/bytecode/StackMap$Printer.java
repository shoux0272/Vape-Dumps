/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.PrintWriter;
import javassist.bytecode.ByteArray;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMap$Walker;

class StackMap$Printer
extends StackMap$Walker {
    private PrintWriter writer;

    public StackMap$Printer(StackMap stackMap, PrintWriter printWriter) {
        super(stackMap);
        this.writer = printWriter;
    }

    public void print() {
        int n6 = ByteArray.readU16bit(this.info, 0);
        this.writer.println(n6 + " entries");
        this.visit();
    }

    @Override
    public int locals(int n6, int n10, int n11) {
        this.writer.println("  * offset " + n10);
        return super.locals(n6, n10, n11);
    }
}

