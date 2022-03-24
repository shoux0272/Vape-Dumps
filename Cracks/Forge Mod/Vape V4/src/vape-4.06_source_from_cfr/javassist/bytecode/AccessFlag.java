/*
 * Decompiled with CFR 0.150.
 */
package javassist.bytecode;

public class AccessFlag {
    public static final int PUBLIC = 1;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;
    public static final int STATIC = 8;
    public static final int FINAL = 16;
    public static final int k = 32;
    public static final int d = 64;
    public static final int h = 64;
    public static final int j = 128;
    public static final int s = 128;
    public static final int NATIVE = 256;
    public static final int INTERFACE = 512;
    public static final int ABSTRACT = 1024;
    public static final int STRICT = 2048;
    public static final int SYNTHETIC = 4096;
    public static final int ANNOTATION = 8192;
    public static final int ENUM = 16384;
    public static final int MANDATED = 32768;
    public static final int b = 32;
    public static final int MODULE = 32768;

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

    public static boolean h(int n6) {
        return (n6 & 1) != 0;
    }

    public static boolean f(int n6) {
        return (n6 & 4) != 0;
    }

    public static boolean isPrivate(int n6) {
        return (n6 & 2) != 0;
    }

    public static boolean g(int n6) {
        return (n6 & 7) == 0;
    }

    public static int clear(int n6, int n10) {
        return n6 & ~n10;
    }

    public static int of(int n6) {
        return n6;
    }

    public static int toModifier(int n6) {
        return n6;
    }
}

