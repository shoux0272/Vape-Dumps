/*
 * Decompiled with CFR 0.150.
 */
import a.a;
import java.util.HashMap;
import java.util.Map;

public class iReSqtkUVgxfhiReSqtkUVg {
    private static Map<Class, String> a = new HashMap<Class, String>();

    public static String a(Class class_, Class ... arrclass) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (Class class_2 : arrclass) {
            stringBuilder.append(iReSqtkUVgxfhiReSqtkUVg.a(class_2));
        }
        stringBuilder.append(")");
        stringBuilder.append(iReSqtkUVgxfhiReSqtkUVg.a(class_));
        return stringBuilder.toString();
    }

    public static void a() {
        for (StackTraceElement stackTraceElement : Thread.currentThread().getStackTrace()) {
            iReSqtkUVgFuiiReSqtkUVg.a(stackTraceElement.toString());
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
        Class class_2 = a.a.gcj(string);
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
        a.put(short[].class, "[S");
        a.put(int[].class, "[I");
        a.put(long[].class, "[J");
        a.put(float[].class, "[F");
        a.put(double[].class, "[D");
    }
}

