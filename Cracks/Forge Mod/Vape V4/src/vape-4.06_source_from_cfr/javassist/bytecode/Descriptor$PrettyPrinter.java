/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import javassist.CtClass;
import javassist.bytecode.Descriptor;

class Descriptor$PrettyPrinter {
    Descriptor$PrettyPrinter() {
    }

    static String toString(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        if (string.charAt(0) == '(') {
            int n6 = 1;
            stringBuffer.append('(');
            while (string.charAt(n6) != ')') {
                if (n6 > 1) {
                    stringBuffer.append(',');
                }
                n6 = Descriptor$PrettyPrinter.readType(stringBuffer, n6, string);
            }
            stringBuffer.append(')');
        } else {
            Descriptor$PrettyPrinter.readType(stringBuffer, 0, string);
        }
        return stringBuffer.toString();
    }

    static int readType(StringBuffer stringBuffer, int n6, String string) {
        char c3 = string.charAt(n6);
        int n10 = 0;
        while (c3 == '[') {
            ++n10;
            c3 = string.charAt(++n6);
        }
        if (c3 == 'L') {
            while ((c3 = string.charAt(++n6)) != ';') {
                if (c3 == '/') {
                    c3 = '.';
                }
                stringBuffer.append(c3);
            }
        } else {
            CtClass ctClass = Descriptor.toPrimitiveClass(c3);
            stringBuffer.append(ctClass.getName());
        }
        while (n10-- > 0) {
            stringBuffer.append("[]");
        }
        return n6 + 1;
    }
}

