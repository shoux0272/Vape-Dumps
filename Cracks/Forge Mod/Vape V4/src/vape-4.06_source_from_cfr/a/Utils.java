/*
 * Decompiled with CFR 0.150.
 */
package a;

import a.Gui;
import java.util.HashMap;
import java.util.Map;

class Utils {
    private static final Map<Class<?>, String> TYPE_NAMES = new HashMap();
    private static final Gui GUI = new Gui();

    Utils() {
    }

    static boolean checkParameterTypes(Class<?>[] params, Class<?> returnType, String desc) {
        StringBuilder builder = new StringBuilder();
        builder.append('(');
        for (Class<?> cls : params) {
            String name = TYPE_NAMES.get(cls);
            if (name == null) {
                builder.append(cls.getName().replace('.', '/'));
                continue;
            }
            builder.append(name);
        }
        builder.append(')');
        String returnTypeName = TYPE_NAMES.get(returnType);
        if (returnTypeName == null) {
            builder.append(returnType.getName().replace('.', '/'));
        } else {
            builder.append(returnTypeName);
        }
        return builder.toString().equals(desc);
    }

    static Object getGuiObject() {
        return GUI;
    }

    static {
        TYPE_NAMES.put(Boolean.TYPE, "Z");
        TYPE_NAMES.put(Byte.TYPE, "B");
        TYPE_NAMES.put(Character.TYPE, "C");
        TYPE_NAMES.put(Short.TYPE, "S");
        TYPE_NAMES.put(Integer.TYPE, "I");
        TYPE_NAMES.put(Long.TYPE, "J");
        TYPE_NAMES.put(Float.TYPE, "F");
        TYPE_NAMES.put(Double.TYPE, "D");
        TYPE_NAMES.put(Void.TYPE, "V");
        TYPE_NAMES.put(boolean[].class, "[Z");
        TYPE_NAMES.put(byte[].class, "[B");
        TYPE_NAMES.put(char[].class, "[C");
        TYPE_NAMES.put(short[].class, "[S");
        TYPE_NAMES.put(int[].class, "[I");
        TYPE_NAMES.put(long[].class, "[J");
        TYPE_NAMES.put(float[].class, "[F");
        TYPE_NAMES.put(double[].class, "[D");
    }
}

