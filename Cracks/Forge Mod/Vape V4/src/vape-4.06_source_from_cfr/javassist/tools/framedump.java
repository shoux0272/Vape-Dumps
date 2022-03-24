/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools;

import javassist.ClassPool;
import javassist.CtClass;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import javassist.bytecode.analysis.FramePrinter;

public class framedump {
    private static int b;

    private framedump() {
    }

    public static void main(String[] arrstring) throws Exception {
        if (arrstring.length != 1) {
            System.err.println("Usage: java javassist.tools.framedump <fully-qualified class name>");
            return;
        }
        ClassPool classPool = ClassPool.getDefault();
        CtClass ctClass = classPool.get(arrstring[0]);
        System.out.println("Frame Dump of " + ctClass.getName() + ":");
        FramePrinter.print(ctClass, System.out);
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int b() {
        return b;
    }

    public static int c() {
        int n6 = framedump.b();
        if (n6 == 0) {
            return 12;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (framedump.c() != 0) {
            framedump.b(100);
        }
    }
}

