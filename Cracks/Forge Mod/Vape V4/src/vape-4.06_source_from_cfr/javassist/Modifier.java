/*
 * Decompiled with CFR 0.150.
 */
package javassist;

public class Modifier {
    public static final int PUBLIC = 1;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;
    public static final int STATIC = 8;
    public static final int FINAL = 16;
    public static final int SYNCHRONIZED = 32;
    public static final int VOLATILE = 64;
    public static final int VARARGS = 128;
    public static final int TRANSIENT = 128;
    public static final int NATIVE = 256;
    public static final int INTERFACE = 512;
    public static final int ABSTRACT = 1024;
    public static final int STRICT = 2048;
    public static final int ANNOTATION = 8192;
    public static final int ENUM = 16384;

    public static boolean isPublic(int n6) {
        return (n6 & 1) != 0;
    }

    public static boolean isPrivate(int n6) {
        return (n6 & 2) != 0;
    }

    public static boolean isProtected(int n6) {
        return (n6 & 4) != 0;
    }

    public static boolean isPackage(int n6) {
        return (n6 & 7) == 0;
    }

    public static boolean isStatic(int n6) {
        return (n6 & 8) != 0;
    }

    public static boolean isFinal(int n6) {
        return (n6 & 0x10) != 0;
    }

    public static boolean b(int n6) {
        return (n6 & 0x20) != 0;
    }

    public static boolean j(int n6) {
        return (n6 & 0x40) != 0;
    }

    public static boolean s(int n6) {
        return (n6 & 0x80) != 0;
    }

    public static boolean isNative(int n6) {
        return (n6 & 0x100) != 0;
    }

    public static boolean isInterface(int n6) {
        return (n6 & 0x200) != 0;
    }

    public static boolean isAnnotation(int n6) {
        return (n6 & 0x2000) != 0;
    }

    public static boolean isEnum(int n6) {
        return (n6 & 0x4000) != 0;
    }

    public static boolean isAbstract(int n6) {
        return (n6 & 0x400) != 0;
    }

    public static boolean k(int n6) {
        return (n6 & 0x800) != 0;
    }

    public static boolean q(int n6) {
        return (n6 & 0x80) != 0;
    }

    public static int setPublic(int n6) {
        return n6 & 0xFFFFFFF9 | 1;
    }

    public static int setProtected(int n6) {
        return n6 & 0xFFFFFFFC | 4;
    }

    public static int setPrivate(int n6) {
        return n6 & 0xFFFFFFFA | 2;
    }

    public static int setPackage(int n6) {
        return n6 & 0xFFFFFFF8;
    }

    public static int clear(int n6, int n10) {
        return n6 & ~n10;
    }

    public static String toString(int n6) {
        return java.lang.reflect.Modifier.toString(n6);
    }
}

