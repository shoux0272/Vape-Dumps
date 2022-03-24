/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.PrintWriter;
import javassist.bytecode.ClassFile;
import javassist.bytecode.ClassFilePrinter;

public class Dump {
    private Dump() {
    }

    public static void main(String[] arrstring) throws Exception {
        if (arrstring.length != 1) {
            System.err.println("Usage: java Dump <class file name>");
            return;
        }
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(arrstring[0]));
        ClassFile classFile = new ClassFile(dataInputStream);
        PrintWriter printWriter = new PrintWriter(System.out, true);
        printWriter.println("*** constant pool ***");
        classFile.getConstPool().print(printWriter);
        printWriter.println();
        printWriter.println("*** members ***");
        ClassFilePrinter.print(classFile, printWriter);
    }
}

