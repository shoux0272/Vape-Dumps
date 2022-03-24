/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class pd {
    public int d;
    public int c;
    public int a;
    public int e;
    private static String[] b;

    public pd(int n6, int n10, int n11, int n12) {
        this.d = n6;
        this.c = n10;
        this.a = n11;
        this.e = n12;
    }

    public void a(int n6, int n10, int n11, int n12) {
        this.d = n6;
        this.c = n10;
        this.a = n11;
        this.e = n12;
    }

    public boolean equals(Object object) {
        if (object instanceof pd) {
            pd pd2 = (pd)object;
            return this.d == pd2.d && this.c == pd2.c && this.a == pd2.a && this.e == pd2.e;
        }
        return false;
    }

    public int hashCode() {
        int n6 = this.c + this.a;
        int n10 = this.e + this.d;
        int n11 = n6 * (n6 + 1) / 2 + this.c;
        int n12 = n10 * (n10 + 1) / 2 + this.d;
        int n13 = n11 + n12;
        return n13 * (n13 + 1) / 2 + n12;
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static String[] b() {
        return b;
    }

    static {
        if (pd.b() == null) {
            pd.b(new String[2]);
        }
    }
}

