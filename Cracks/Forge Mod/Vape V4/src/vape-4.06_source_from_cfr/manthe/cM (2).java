/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import java.util.HashMap;
import java.util.Map;
import manthe.on;

public class cM {
    private static final Map<Class, String> a = new HashMap<Class, String>();
    private static String b;

    public static String a(Class class_, Class ... arrclass) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Class class_2 : arrclass) {
            stringBuilder.append(cM.a(class_2));
        }
        stringBuilder.append(")");
        stringBuilder.append(cM.a(class_));
        return stringBuilder.toString();
    }

    public static void c() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            on.a(stackTraceElement.toString());
        }
    }

    public static String a(Class class_) {
        if (a.containsKey(class_)) {
            return a.get(class_);
        }
        return a.a.gcs(class_);
    }

    public static Class b(Class class_) {
        String string = "[" + a.a.gcs(class_);
        Class<?> class_2 = a.a.gcj(string);
        return class_2;
    }

    static {
        a.put(Boolean.TYPE, "Z");
        a.put(Byte.TYPE, "B");
        a.put(Character.TYPE, "C");
        a.put(Short.TYPE, "S");
        a.put(Integer.TYPE, "I");
        a.put(Long.TYPE, "J");
        a.put(Float.TYPE, "F");
        a.put(Double.TYPE, "D");
        a.put(Void.TYPE, "V");
        a.put(boolean[].class, "[Z");
        a.put(byte[].class, "[B");
        a.put(char[].class, "[C");
        cM.b(null);
        a.put(short[].class, "[S");
        a.put(int[].class, "[I");
        a.put(long[].class, "[J");
        a.put(float[].class, "[F");
        a.put(double[].class, "[D");
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }
}

