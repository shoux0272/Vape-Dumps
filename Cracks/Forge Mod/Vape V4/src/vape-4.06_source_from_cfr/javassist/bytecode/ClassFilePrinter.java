/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;
import javassist.Modifier;
import javassist.bytecode.AccessFlag;
import javassist.bytecode.AnnotationsAttribute;
import javassist.bytecode.AttributeInfo;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.ClassFile;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.FieldInfo;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.ParameterAnnotationsAttribute;
import javassist.bytecode.SignatureAttribute;
import javassist.bytecode.StackMap;
import javassist.bytecode.StackMapTable;
import javassist.bytecode.StackMapTable$Printer;

public class ClassFilePrinter {
    public static void print(ClassFile classFile) {
        ClassFilePrinter.print(classFile, new PrintWriter(System.out, true));
    }

    public static void print(ClassFile classFile, PrintWriter printWriter) {
        int n6 = AccessFlag.toModifier(classFile.getAccessFlags() & 0xFFFFFFDF);
        printWriter.println("major: " + classFile.major + ", minor: " + classFile.minor + " modifiers: " + Integer.toHexString(classFile.getAccessFlags()));
        printWriter.println(Modifier.toString(n6) + " class " + classFile.getName() + " extends " + classFile.getSuperclass());
        String[] arrstring = classFile.getInterfaces();
        if (arrstring != null && arrstring.length > 0) {
            printWriter.print("    implements ");
            printWriter.print(arrstring[0]);
            for (int k = 1; k < arrstring.length; ++k) {
                printWriter.print(", " + arrstring[k]);
            }
            printWriter.println();
        }
        printWriter.println();
        List<FieldInfo> list = classFile.getFields();
        for (FieldInfo object2 : list) {
            int methodInfo = object2.getAccessFlags();
            printWriter.println(Modifier.toString(AccessFlag.toModifier(methodInfo)) + " " + object2.getName() + "\t" + object2.getDescriptor());
            ClassFilePrinter.printAttributes(object2.getAttributes(), printWriter, 'f');
        }
        printWriter.println();
        List<MethodInfo> list2 = classFile.getMethods();
        Iterator iterator = list2.iterator();
        while (iterator.hasNext()) {
            MethodInfo methodInfo = (MethodInfo)iterator.next();
            int n10 = methodInfo.getAccessFlags();
            printWriter.println(Modifier.toString(AccessFlag.toModifier(n10)) + " " + methodInfo.getName() + "\t" + methodInfo.getDescriptor());
            ClassFilePrinter.printAttributes(methodInfo.getAttributes(), printWriter, 'm');
            printWriter.println();
        }
        printWriter.println();
        ClassFilePrinter.printAttributes(classFile.getAttributes(), printWriter, 'c');
    }

    static void printAttributes(List<AttributeInfo> list, PrintWriter printWriter, char c3) {
        if (list == null) {
            return;
        }
        for (AttributeInfo attributeInfo : list) {
            AttributeInfo attributeInfo2;
            if (attributeInfo instanceof CodeAttribute) {
                attributeInfo2 = (CodeAttribute)attributeInfo;
                printWriter.println("attribute: " + attributeInfo.getName() + ": " + attributeInfo.getClass().getName());
                printWriter.println("max stack " + ((CodeAttribute)attributeInfo2).getMaxStack() + ", max locals " + ((CodeAttribute)attributeInfo2).getMaxLocals() + ", " + ((CodeAttribute)attributeInfo2).getExceptionTable().size() + " catch blocks");
                printWriter.println("<code attribute begin>");
                ClassFilePrinter.printAttributes(((CodeAttribute)attributeInfo2).getAttributes(), printWriter, c3);
                printWriter.println("<code attribute end>");
                continue;
            }
            if (attributeInfo instanceof AnnotationsAttribute) {
                printWriter.println("annnotation: " + attributeInfo.toString());
                continue;
            }
            if (attributeInfo instanceof ParameterAnnotationsAttribute) {
                printWriter.println("parameter annnotations: " + attributeInfo.toString());
                continue;
            }
            if (attributeInfo instanceof StackMapTable) {
                printWriter.println("<stack map table begin>");
                StackMapTable$Printer.print((StackMapTable)attributeInfo, printWriter);
                printWriter.println("<stack map table end>");
                continue;
            }
            if (attributeInfo instanceof StackMap) {
                printWriter.println("<stack map begin>");
                ((StackMap)attributeInfo).print(printWriter);
                printWriter.println("<stack map end>");
                continue;
            }
            if (attributeInfo instanceof SignatureAttribute) {
                attributeInfo2 = (SignatureAttribute)attributeInfo;
                String string = ((SignatureAttribute)attributeInfo2).getSignature();
                printWriter.println("signature: " + string);
                try {
                    String string2 = c3 == 'c' ? SignatureAttribute.toClassSignature(string).toString() : (c3 == 'm' ? SignatureAttribute.toMethodSignature(string).toString() : SignatureAttribute.toFieldSignature(string).toString());
                    printWriter.println("           " + string2);
                }
                catch (BadBytecode badBytecode) {
                    printWriter.println("           syntax error");
                }
                continue;
            }
            printWriter.println("attribute: " + attributeInfo.getName() + " (" + attributeInfo.get().length + " byte): " + attributeInfo.getClass().getName());
        }
    }
}

