/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class Cj {
    private final String a;
    private final String c;
    private final boolean b;
    private static int[] d;

    public Cj(String string, String string2) {
        this.a = string;
        this.c = string2;
        this.b = false;
    }

    public Cj(String string) {
        this.a = string;
        this.c = "password";
        this.b = true;
    }

    public String c() {
        return this.a;
    }

    public String b() {
        return this.c;
    }

    public boolean a() {
        return this.b;
    }

    public static void b(int[] arrn) {
        d = arrn;
    }

    public static int[] d() {
        return d;
    }

    static {
        if (Cj.d() == null) {
            Cj.b(new int[1]);
        }
    }
}

