/*
 * Decompiled with CFR 0.150.
 */
package javassist.runtime;

import javassist.runtime.Desc$1;

public class Desc {
    public static boolean useContextClassLoader = false;
    private static final ThreadLocal<Boolean> USE_CONTEXT_CLASS_LOADER_LOCALLY;
    private static String b;

    public static void setUseContextClassLoaderLocally() {
        USE_CONTEXT_CLASS_LOADER_LOCALLY.set(true);
    }

    public static void resetUseContextClassLoaderLocally() {
        USE_CONTEXT_CLASS_LOADER_LOCALLY.remove();
    }

    private static Class<?> getClassObject(String string) throws ClassNotFoundException {
        if (useContextClassLoader || USE_CONTEXT_CLASS_LOADER_LOCALLY.get().booleanValue()) {
            return Class.forName(string, true, Thread.currentThread().getContextClassLoader());
        }
        return Class.forName(string);
    }

    public static Class<?> getClazz(String string) {
        try {
            return Desc.getClassObject(string);
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException("$class: internal error, could not find class '" + string + "' (Desc.useContextClassLoader: " + Boolean.toString(useContextClassLoader) + ")", classNotFoundException);
        }
    }

    public static Class<?>[] getParams(String string) {
        if (string.charAt(0) != '(') {
            throw new RuntimeException("$sig: internal error");
        }
        return Desc.getType(string, string.length(), 1, 0);
    }

    public static Class<?> getType(String string) {
        Class<?>[] arrclass = Desc.getType(string, string.length(), 0, 0);
        if (arrclass == null || arrclass.length != 1) {
            throw new RuntimeException("$type: internal error");
        }
        return arrclass[0];
    }

    private static Class<?>[] getType(String string, int n6, int n10, int n11) {
        Class<Object> class_;
        if (n10 >= n6) {
            return new Class[n11];
        }
        char c3 = string.charAt(n10);
        switch (c3) {
            case 'Z': {
                class_ = Boolean.TYPE;
                break;
            }
            case 'C': {
                class_ = Character.TYPE;
                break;
            }
            case 'B': {
                class_ = Byte.TYPE;
                break;
            }
            case 'S': {
                class_ = Short.TYPE;
                break;
            }
            case 'I': {
                class_ = Integer.TYPE;
                break;
            }
            case 'J': {
                class_ = Long.TYPE;
                break;
            }
            case 'F': {
                class_ = Float.TYPE;
                break;
            }
            case 'D': {
                class_ = Double.TYPE;
                break;
            }
            case 'V': {
                class_ = Void.TYPE;
                break;
            }
            case 'L': 
            case '[': {
                return Desc.getClassType(string, n6, n10, n11);
            }
            default: {
                return new Class[n11];
            }
        }
        Class<?>[] arrclass = Desc.getType(string, n6, n10 + 1, n11 + 1);
        arrclass[n11] = class_;
        return arrclass;
    }

    private static Class<?>[] getClassType(String string, int n6, int n10, int n11) {
        int n12 = n10;
        while (string.charAt(n12) == '[') {
            ++n12;
        }
        if (string.charAt(n12) == 'L' && (n12 = string.indexOf(59, n12)) < 0) {
            throw new IndexOutOfBoundsException("bad descriptor");
        }
        String string2 = string.charAt(n10) == 'L' ? string.substring(n10 + 1, n12) : string.substring(n10, n12 + 1);
        Class<?>[] arrclass = Desc.getType(string, n6, n12 + 1, n11 + 1);
        try {
            arrclass[n11] = Desc.getClassObject(string2.replace('/', '.'));
        }
        catch (ClassNotFoundException classNotFoundException) {
            throw new RuntimeException(classNotFoundException.getMessage());
        }
        return arrclass;
    }

    static {
        Desc.b(null);
        USE_CONTEXT_CLASS_LOADER_LOCALLY = new Desc$1();
    }

    public static void b(String string) {
        b = string;
    }

    public static String b() {
        return b;
    }
}

