/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

import java.util.Map;
import javassist.ClassPool;
import javassist.CtClass;
import javassist.CtPrimitiveType;
import javassist.NotFoundException;
import javassist.bytecode.Descriptor$PrettyPrinter;

public class Descriptor {
    public static String toJvmName(String string) {
        return string.replace('.', '/');
    }

    public static String toJavaName(String string) {
        return string.replace('/', '.');
    }

    public static String toJvmName(CtClass ctClass) {
        if (ctClass.isArray()) {
            return Descriptor.of(ctClass);
        }
        return Descriptor.toJvmName(ctClass.getName());
    }

    public static String toClassName(String string) {
        String string2;
        int n6 = 0;
        int n10 = 0;
        char c3 = string.charAt(0);
        while (c3 == '[') {
            ++n6;
            c3 = string.charAt(++n10);
        }
        if (c3 == 'L') {
            int n11 = string.indexOf(59, n10++);
            string2 = string.substring(n10, n11).replace('/', '.');
            n10 = n11;
        } else if (c3 == 'V') {
            string2 = "void";
        } else if (c3 == 'I') {
            string2 = "int";
        } else if (c3 == 'B') {
            string2 = "byte";
        } else if (c3 == 'J') {
            string2 = "long";
        } else if (c3 == 'D') {
            string2 = "double";
        } else if (c3 == 'F') {
            string2 = "float";
        } else if (c3 == 'C') {
            string2 = "char";
        } else if (c3 == 'S') {
            string2 = "short";
        } else if (c3 == 'Z') {
            string2 = "boolean";
        } else {
            throw new RuntimeException("bad descriptor: " + string);
        }
        if (n10 + 1 != string.length()) {
            throw new RuntimeException("multiple descriptors?: " + string);
        }
        if (n6 == 0) {
            return string2;
        }
        StringBuffer stringBuffer = new StringBuffer(string2);
        do {
            stringBuffer.append("[]");
        } while (--n6 > 0);
        return stringBuffer.toString();
    }

    public static String of(String string) {
        if (string.equals("void")) {
            return "V";
        }
        if (string.equals("int")) {
            return "I";
        }
        if (string.equals("byte")) {
            return "B";
        }
        if (string.equals("long")) {
            return "J";
        }
        if (string.equals("double")) {
            return "D";
        }
        if (string.equals("float")) {
            return "F";
        }
        if (string.equals("char")) {
            return "C";
        }
        if (string.equals("short")) {
            return "S";
        }
        if (string.equals("boolean")) {
            return "Z";
        }
        return "L" + Descriptor.toJvmName(string) + ";";
    }

    public static String rename(String string, String string2, String string3) {
        int n6;
        if (string.indexOf(string2) < 0) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n10 = 0;
        int n11 = 0;
        while ((n6 = string.indexOf(76, n11)) >= 0) {
            if (string.startsWith(string2, n6 + 1) && string.charAt(n6 + string2.length() + 1) == ';') {
                stringBuffer.append(string.substring(n10, n6));
                stringBuffer.append('L');
                stringBuffer.append(string3);
                stringBuffer.append(';');
                n10 = n11 = n6 + string2.length() + 2;
                continue;
            }
            n11 = string.indexOf(59, n6) + 1;
            if (n11 >= 1) continue;
            break;
        }
        if (n10 == 0) {
            return string;
        }
        n6 = string.length();
        if (n10 < n6) {
            stringBuffer.append(string.substring(n10, n6));
        }
        return stringBuffer.toString();
    }

    public static String rename(String string, Map<String, String> map) {
        int n6;
        int n10;
        if (map == null) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        int n11 = 0;
        int n12 = 0;
        while ((n10 = string.indexOf(76, n12)) >= 0 && (n6 = string.indexOf(59, n10)) >= 0) {
            n12 = n6 + 1;
            String string2 = string.substring(n10 + 1, n6);
            String string3 = map.get(string2);
            if (string3 == null) continue;
            stringBuffer.append(string.substring(n11, n10));
            stringBuffer.append('L');
            stringBuffer.append(string3);
            stringBuffer.append(';');
            n11 = n12;
        }
        if (n11 == 0) {
            return string;
        }
        n10 = string.length();
        if (n11 < n10) {
            stringBuffer.append(string.substring(n11, n10));
        }
        return stringBuffer.toString();
    }

    public static String of(CtClass ctClass) {
        StringBuffer stringBuffer = new StringBuffer();
        Descriptor.toDescriptor(stringBuffer, ctClass);
        return stringBuffer.toString();
    }

    private static void toDescriptor(StringBuffer stringBuffer, CtClass ctClass) {
        if (ctClass.isArray()) {
            stringBuffer.append('[');
            try {
                Descriptor.toDescriptor(stringBuffer, ctClass.getComponentType());
            }
            catch (NotFoundException notFoundException) {
                stringBuffer.append('L');
                String string = ctClass.getName();
                stringBuffer.append(Descriptor.toJvmName(string.substring(0, string.length() - 2)));
                stringBuffer.append(';');
            }
        } else if (ctClass.isPrimitive()) {
            CtPrimitiveType ctPrimitiveType = (CtPrimitiveType)ctClass;
            stringBuffer.append(ctPrimitiveType.getDescriptor());
        } else {
            stringBuffer.append('L');
            stringBuffer.append(ctClass.getName().replace('.', '/'));
            stringBuffer.append(';');
        }
    }

    public static String ofConstructor(CtClass[] arrctClass) {
        return Descriptor.ofMethod(CtClass.voidType, arrctClass);
    }

    public static String ofMethod(CtClass ctClass, CtClass[] arrctClass) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append('(');
        if (arrctClass != null) {
            int n6 = arrctClass.length;
            for (int k = 0; k < n6; ++k) {
                Descriptor.toDescriptor(stringBuffer, arrctClass[k]);
            }
        }
        stringBuffer.append(')');
        if (ctClass != null) {
            Descriptor.toDescriptor(stringBuffer, ctClass);
        }
        return stringBuffer.toString();
    }

    public static String ofParameters(CtClass[] arrctClass) {
        return Descriptor.ofMethod(null, arrctClass);
    }

    public static String appendParameter(String string, String string2) {
        int n6 = string2.indexOf(41);
        if (n6 < 0) {
            return string2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string2.substring(0, n6));
        stringBuffer.append('L');
        stringBuffer.append(string.replace('.', '/'));
        stringBuffer.append(';');
        stringBuffer.append(string2.substring(n6));
        return stringBuffer.toString();
    }

    public static String insertParameter(String string, String string2) {
        if (string2.charAt(0) != '(') {
            return string2;
        }
        return "(L" + string.replace('.', '/') + ';' + string2.substring(1);
    }

    public static String appendParameter(CtClass ctClass, String string) {
        int n6 = string.indexOf(41);
        if (n6 < 0) {
            return string;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string.substring(0, n6));
        Descriptor.toDescriptor(stringBuffer, ctClass);
        stringBuffer.append(string.substring(n6));
        return stringBuffer.toString();
    }

    public static String insertParameter(CtClass ctClass, String string) {
        if (string.charAt(0) != '(') {
            return string;
        }
        return "(" + Descriptor.of(ctClass) + string.substring(1);
    }

    public static String changeReturnType(String string, String string2) {
        int n6 = string2.indexOf(41);
        if (n6 < 0) {
            return string2;
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(string2.substring(0, n6 + 1));
        stringBuffer.append('L');
        stringBuffer.append(string.replace('.', '/'));
        stringBuffer.append(';');
        return stringBuffer.toString();
    }

    public static CtClass[] getParameterTypes(String string, ClassPool classPool) throws NotFoundException {
        if (string.charAt(0) != '(') {
            return null;
        }
        int n6 = Descriptor.numOfParameters(string);
        CtClass[] arrctClass = new CtClass[n6];
        int n10 = 0;
        int n11 = 1;
        while ((n11 = Descriptor.toCtClass(classPool, string, n11, arrctClass, n10++)) > 0) {
        }
        return arrctClass;
    }

    public static boolean eqParamTypes(String string, String string2) {
        if (string.charAt(0) != '(') {
            return false;
        }
        int n6 = 0;
        char c3;
        while ((c3 = string.charAt(n6)) == string2.charAt(n6)) {
            if (c3 == ')') {
                return true;
            }
            ++n6;
        }
        return false;
    }

    public static String getParamDescriptor(String string) {
        return string.substring(0, string.indexOf(41) + 1);
    }

    public static CtClass getReturnType(String string, ClassPool classPool) throws NotFoundException {
        int n6 = string.indexOf(41);
        if (n6 < 0) {
            return null;
        }
        CtClass[] arrctClass = new CtClass[1];
        Descriptor.toCtClass(classPool, string, n6 + 1, arrctClass, 0);
        return arrctClass[0];
    }

    public static int numOfParameters(String string) {
        char c3;
        int n6 = 0;
        int n10 = 1;
        while ((c3 = string.charAt(n10)) != ')') {
            while (c3 == '[') {
                c3 = string.charAt(++n10);
            }
            if (c3 == 'L') {
                if ((n10 = string.indexOf(59, n10) + 1) <= 0) {
                    throw new IndexOutOfBoundsException("bad descriptor");
                }
            } else {
                ++n10;
            }
            ++n6;
        }
        return n6;
    }

    public static CtClass toCtClass(String string, ClassPool classPool) throws NotFoundException {
        CtClass[] arrctClass = new CtClass[1];
        int n6 = Descriptor.toCtClass(classPool, string, 0, arrctClass, 0);
        if (n6 >= 0) {
            return arrctClass[0];
        }
        return classPool.get(string.replace('/', '.'));
    }

    private static int toCtClass(ClassPool classPool, String string, int n6, CtClass[] arrctClass, int n10) throws NotFoundException {
        Object object;
        String string2;
        int n11;
        int n12 = 0;
        char c3 = string.charAt(n6);
        while (c3 == '[') {
            ++n12;
            c3 = string.charAt(++n6);
        }
        if (c3 == 'L') {
            n11 = string.indexOf(59, ++n6);
            string2 = string.substring(n6, n11++).replace('/', '.');
        } else {
            object = Descriptor.toPrimitiveClass(c3);
            if (object == null) {
                return -1;
            }
            n11 = n6 + 1;
            if (n12 == 0) {
                arrctClass[n10] = object;
                return n11;
            }
            string2 = ((CtClass)object).getName();
        }
        if (n12 > 0) {
            object = new StringBuffer(string2);
            while (n12-- > 0) {
                ((StringBuffer)object).append("[]");
            }
            string2 = ((StringBuffer)object).toString();
        }
        arrctClass[n10] = classPool.get(string2);
        return n11;
    }

    static CtClass toPrimitiveClass(char c3) {
        CtClass ctClass = null;
        switch (c3) {
            case 'Z': {
                ctClass = CtClass.booleanType;
                break;
            }
            case 'C': {
                ctClass = CtClass.charType;
                break;
            }
            case 'B': {
                ctClass = CtClass.byteType;
                break;
            }
            case 'S': {
                ctClass = CtClass.shortType;
                break;
            }
            case 'I': {
                ctClass = CtClass.intType;
                break;
            }
            case 'J': {
                ctClass = CtClass.longType;
                break;
            }
            case 'F': {
                ctClass = CtClass.floatType;
                break;
            }
            case 'D': {
                ctClass = CtClass.doubleType;
                break;
            }
            case 'V': {
                ctClass = CtClass.voidType;
            }
        }
        return ctClass;
    }

    public static int arrayDimension(String string) {
        int n6 = 0;
        while (string.charAt(n6) == '[') {
            ++n6;
        }
        return n6;
    }

    public static String toArrayComponent(String string, int n6) {
        return string.substring(n6);
    }

    public static int dataSize(String string) {
        return Descriptor.dataSize(string, true);
    }

    public static int paramSize(String string) {
        return -Descriptor.dataSize(string, false);
    }

    private static int dataSize(String string, boolean bl) {
        int n6 = 0;
        char c3 = string.charAt(0);
        if (c3 == '(') {
            int n10 = 1;
            while (true) {
                if ((c3 = string.charAt(n10)) == ')') {
                    c3 = string.charAt(n10 + 1);
                    break;
                }
                boolean bl2 = false;
                while (c3 == '[') {
                    bl2 = true;
                    c3 = string.charAt(++n10);
                }
                if (c3 == 'L') {
                    if ((n10 = string.indexOf(59, n10) + 1) <= 0) {
                        throw new IndexOutOfBoundsException("bad descriptor");
                    }
                } else {
                    ++n10;
                }
                if (!(bl2 || c3 != 'J' && c3 != 'D')) {
                    n6 -= 2;
                    continue;
                }
                --n6;
            }
        }
        if (bl) {
            if (c3 == 'J' || c3 == 'D') {
                n6 += 2;
            } else if (c3 != 'V') {
                ++n6;
            }
        }
        return n6;
    }

    public static String toString(String string) {
        return Descriptor$PrettyPrinter.toString(string);
    }
}

