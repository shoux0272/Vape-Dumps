/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.io.PrintStream;
import javassist.CtMethod;
import javassist.bytecode.BadBytecode;
import javassist.bytecode.CodeAttribute;
import javassist.bytecode.CodeIterator;
import javassist.bytecode.ConstPool;
import javassist.bytecode.MethodInfo;
import javassist.bytecode.Mnemonic;
import javassist.bytecode.Opcode;

public class InstructionPrinter
implements Opcode {
    private static final String[] opcodes = Mnemonic.OPCODE;
    private final PrintStream stream;

    public InstructionPrinter(PrintStream printStream) {
        this.stream = printStream;
    }

    public static void print(CtMethod ctMethod, PrintStream printStream) {
        new InstructionPrinter(printStream).print(ctMethod);
    }

    public void print(CtMethod ctMethod) {
        MethodInfo methodInfo = ctMethod.getMethodInfo2();
        ConstPool constPool = methodInfo.getConstPool();
        CodeAttribute codeAttribute = methodInfo.getCodeAttribute();
        if (codeAttribute == null) {
            return;
        }
        CodeIterator codeIterator = codeAttribute.iterator();
        while (codeIterator.hasNext()) {
            int n6;
            try {
                n6 = codeIterator.next();
            }
            catch (BadBytecode badBytecode) {
                throw new RuntimeException(badBytecode);
            }
            this.stream.println(n6 + ": " + InstructionPrinter.instructionString(codeIterator, n6, constPool));
        }
    }

    public static String instructionString(CodeIterator codeIterator, int n6, ConstPool constPool) {
        int n10 = codeIterator.byteAt(n6);
        if (n10 > opcodes.length || n10 < 0) {
            throw new IllegalArgumentException("Invalid opcode, opcode: " + n10 + " pos: " + n6);
        }
        String string = opcodes[n10];
        switch (n10) {
            case 16: {
                return string + " " + codeIterator.byteAt(n6 + 1);
            }
            case 17: {
                return string + " " + codeIterator.s16bitAt(n6 + 1);
            }
            case 18: {
                return string + " " + InstructionPrinter.ldc(constPool, codeIterator.byteAt(n6 + 1));
            }
            case 19: 
            case 20: {
                return string + " " + InstructionPrinter.ldc(constPool, codeIterator.u16bitAt(n6 + 1));
            }
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: {
                return string + " " + codeIterator.byteAt(n6 + 1);
            }
            case 153: 
            case 154: 
            case 155: 
            case 156: 
            case 157: 
            case 158: 
            case 159: 
            case 160: 
            case 161: 
            case 162: 
            case 163: 
            case 164: 
            case 165: 
            case 166: 
            case 198: 
            case 199: {
                return string + " " + (codeIterator.s16bitAt(n6 + 1) + n6);
            }
            case 132: {
                return string + " " + codeIterator.byteAt(n6 + 1) + ", " + codeIterator.signedByteAt(n6 + 2);
            }
            case 167: 
            case 168: {
                return string + " " + (codeIterator.s16bitAt(n6 + 1) + n6);
            }
            case 169: {
                return string + " " + codeIterator.byteAt(n6 + 1);
            }
            case 170: {
                return InstructionPrinter.tableSwitch(codeIterator, n6);
            }
            case 171: {
                return InstructionPrinter.lookupSwitch(codeIterator, n6);
            }
            case 178: 
            case 179: 
            case 180: 
            case 181: {
                return string + " " + InstructionPrinter.fieldInfo(constPool, codeIterator.u16bitAt(n6 + 1));
            }
            case 182: 
            case 183: 
            case 184: {
                return string + " " + InstructionPrinter.methodInfo(constPool, codeIterator.u16bitAt(n6 + 1));
            }
            case 185: {
                return string + " " + InstructionPrinter.interfaceMethodInfo(constPool, codeIterator.u16bitAt(n6 + 1));
            }
            case 186: {
                return string + " " + codeIterator.u16bitAt(n6 + 1);
            }
            case 187: {
                return string + " " + InstructionPrinter.classInfo(constPool, codeIterator.u16bitAt(n6 + 1));
            }
            case 188: {
                return string + " " + InstructionPrinter.arrayInfo(codeIterator.byteAt(n6 + 1));
            }
            case 189: 
            case 192: {
                return string + " " + InstructionPrinter.classInfo(constPool, codeIterator.u16bitAt(n6 + 1));
            }
            case 196: {
                return InstructionPrinter.wide(codeIterator, n6);
            }
            case 197: {
                return string + " " + InstructionPrinter.classInfo(constPool, codeIterator.u16bitAt(n6 + 1));
            }
            case 200: 
            case 201: {
                return string + " " + (codeIterator.s32bitAt(n6 + 1) + n6);
            }
        }
        return string;
    }

    private static String wide(CodeIterator codeIterator, int n6) {
        int n10 = codeIterator.byteAt(n6 + 1);
        int n11 = codeIterator.u16bitAt(n6 + 2);
        switch (n10) {
            case 21: 
            case 22: 
            case 23: 
            case 24: 
            case 25: 
            case 54: 
            case 55: 
            case 56: 
            case 57: 
            case 58: 
            case 132: 
            case 169: {
                return opcodes[n10] + " " + n11;
            }
        }
        throw new RuntimeException("Invalid WIDE operand");
    }

    private static String arrayInfo(int n6) {
        switch (n6) {
            case 4: {
                return "boolean";
            }
            case 5: {
                return "char";
            }
            case 8: {
                return "byte";
            }
            case 9: {
                return "short";
            }
            case 10: {
                return "int";
            }
            case 11: {
                return "long";
            }
            case 6: {
                return "float";
            }
            case 7: {
                return "double";
            }
        }
        throw new RuntimeException("Invalid array type");
    }

    private static String classInfo(ConstPool constPool, int n6) {
        return "#" + n6 + " = Class " + constPool.getClassInfo(n6);
    }

    private static String interfaceMethodInfo(ConstPool constPool, int n6) {
        return "#" + n6 + " = Method " + constPool.getInterfaceMethodrefClassName(n6) + "." + constPool.getInterfaceMethodrefName(n6) + "(" + constPool.getInterfaceMethodrefType(n6) + ")";
    }

    private static String methodInfo(ConstPool constPool, int n6) {
        return "#" + n6 + " = Method " + constPool.getMethodrefClassName(n6) + "." + constPool.getMethodrefName(n6) + "(" + constPool.getMethodrefType(n6) + ")";
    }

    private static String fieldInfo(ConstPool constPool, int n6) {
        return "#" + n6 + " = Field " + constPool.getFieldrefClassName(n6) + "." + constPool.getFieldrefName(n6) + "(" + constPool.getFieldrefType(n6) + ")";
    }

    private static String lookupSwitch(CodeIterator codeIterator, int n6) {
        StringBuffer stringBuffer = new StringBuffer("lookupswitch {\n");
        int n10 = (n6 & 0xFFFFFFFC) + 4;
        stringBuffer.append("\t\tdefault: ").append(n6 + codeIterator.s32bitAt(n10)).append("\n");
        int n11 = codeIterator.s32bitAt(n10 += 4);
        int n12 = n11 * 8 + (n10 += 4);
        while (n10 < n12) {
            int n13 = codeIterator.s32bitAt(n10);
            int n14 = codeIterator.s32bitAt(n10 + 4) + n6;
            stringBuffer.append("\t\t").append(n13).append(": ").append(n14).append("\n");
            n10 += 8;
        }
        stringBuffer.setCharAt(stringBuffer.length() - 1, '}');
        return stringBuffer.toString();
    }

    private static String tableSwitch(CodeIterator codeIterator, int n6) {
        StringBuffer stringBuffer = new StringBuffer("tableswitch {\n");
        int n10 = (n6 & 0xFFFFFFFC) + 4;
        stringBuffer.append("\t\tdefault: ").append(n6 + codeIterator.s32bitAt(n10)).append("\n");
        int n11 = codeIterator.s32bitAt(n10 += 4);
        int n12 = codeIterator.s32bitAt(n10 += 4);
        int n13 = (n12 - n11 + 1) * 4 + (n10 += 4);
        int n14 = n11;
        while (n10 < n13) {
            int n15 = codeIterator.s32bitAt(n10) + n6;
            stringBuffer.append("\t\t").append(n14).append(": ").append(n15).append("\n");
            n10 += 4;
            ++n14;
        }
        stringBuffer.setCharAt(stringBuffer.length() - 1, '}');
        return stringBuffer.toString();
    }

    private static String ldc(ConstPool constPool, int n6) {
        int n10 = constPool.getTag(n6);
        switch (n10) {
            case 8: {
                return "#" + n6 + " = \"" + constPool.getStringInfo(n6) + "\"";
            }
            case 3: {
                return "#" + n6 + " = int " + constPool.getIntegerInfo(n6);
            }
            case 4: {
                return "#" + n6 + " = float " + constPool.getFloatInfo(n6);
            }
            case 5: {
                return "#" + n6 + " = long " + constPool.getLongInfo(n6);
            }
            case 6: {
                return "#" + n6 + " = double " + constPool.getDoubleInfo(n6);
            }
            case 7: {
                return InstructionPrinter.classInfo(constPool, n6);
            }
        }
        throw new RuntimeException("bad LDC: " + n10);
    }
}

