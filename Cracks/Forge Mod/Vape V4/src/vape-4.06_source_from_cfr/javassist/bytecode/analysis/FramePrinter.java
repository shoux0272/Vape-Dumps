/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode.analysis;

import java.io.PrintStream;
import javassist.CtClass;
import javassist.CtMethod;
import javassist.Modifier;
import javassist.NotFoundException;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.Descriptor;
import javassist.bytecode.InstructionPrinter;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.analysis.Analyzer;
import javassist.bytecode.analysis.Frame;
import javassist.bytecode.analysis.Type;

public final class FramePrinter {
    private final PrintStream stream;

    public FramePrinter(PrintStream printStream) {
        this.stream = printStream;
    }

    public static void print(CtClass ctClass, PrintStream printStream) {
        new FramePrinter(printStream).print(ctClass);
    }

    public void print(CtClass ctClass) {
        CtMethod[] arrctMethod = ctClass.getDeclaredMethods();
        for (int k = 0; k < arrctMethod.length; ++k) {
            this.print(arrctMethod[k]);
        }
    }

    private String getMethodString(CtMethod ctMethod) {
        try {
            return Modifier.toString(ctMethod.getModifiers()) + " " + ctMethod.getReturnType().getName() + " " + ctMethod.getName() + Descriptor.toString(ctMethod.getSignature()) + ";";
        }
        catch (NotFoundException notFoundException) {
            throw new RuntimeException(notFoundException);
        }
    }

    public void print(CtMethod ctMethod) {
        Frame[] arrframe;
        this.stream.println("\n" + this.getMethodString(ctMethod));
        MethodInfo methodInfo = ctMethod.getMethodInfo2();
        ConstPool constPool = methodInfo.getConstPool();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            return;
        }
        try {
            arrframe = new Analyzer().analyze(ctMethod.getDeclaringClass(), methodInfo);
        }
        catch (BadBytecode badBytecode) {
            throw new RuntimeException(badBytecode);
        }
        int n6 = String.valueOf(codeAttribute.getCodeLength()).length();
        CodeIterator codeIterator = codeAttribute.iterator();
        while (codeIterator.hasNext()) {
            int n10;
            try {
                n10 = codeIterator.next();
            }
            catch (BadBytecode badBytecode) {
                throw new RuntimeException(badBytecode);
            }
            this.stream.println(n10 + ": " + InstructionPrinter.instructionString(codeIterator, n10, constPool));
            this.addSpacing(n6 + 3);
            Frame frame = arrframe[n10];
            if (frame == null) {
                this.stream.println("--DEAD CODE--");
                continue;
            }
            this.printStack(frame);
            this.addSpacing(n6 + 3);
            this.printLocals(frame);
        }
    }

    private void printStack(Frame frame) {
        this.stream.print("stack [");
        int n6 = frame.getTopIndex();
        for (int k = 0; k <= n6; ++k) {
            if (k > 0) {
                this.stream.print(", ");
            }
            Type type = frame.getStack(k);
            this.stream.print(type);
        }
        this.stream.println("]");
    }

    private void printLocals(Frame frame) {
        this.stream.print("locals [");
        int n6 = frame.localsLength();
        for (int k = 0; k < n6; ++k) {
            Type type;
            if (k > 0) {
                this.stream.print(", ");
            }
            this.stream.print((type = frame.getLocal(k)) == null ? "empty" : type.toString());
        }
        this.stream.println("]");
    }

    private void addSpacing(int n6) {
        while (n6-- > 0) {
            this.stream.print(' ');
        }
    }
}

