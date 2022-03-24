/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgcGbiReSqtkUVg {
    private int a;
    private int b;
    private int c;

    public static iReSqtkUVgcGbiReSqtkUVg a(iReSqtkUVgSafiReSqtkUVg iReSqtkUVgSafiReSqtkUVg2) {
        return new iReSqtkUVgcGbiReSqtkUVg(iReSqtkUVgSafiReSqtkUVg2.e(), iReSqtkUVgSafiReSqtkUVg2.f(), iReSqtkUVgSafiReSqtkUVg2.g());
    }

    public iReSqtkUVgcGbiReSqtkUVg(int n, int n2, int n3) {
        this.a = n;
        this.b = n2;
        this.c = n3;
    }

    public iReSqtkUVgcGbiReSqtkUVg(double d2, double d3, double d4) {
        this(iReSqtkUVgKexiReSqtkUVg.c(d2), iReSqtkUVgKexiReSqtkUVg.c(d3), iReSqtkUVgKexiReSqtkUVg.c(d4));
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.b;
    }

    public int c() {
        return this.c;
    }

    public iReSqtkUVgcGbiReSqtkUVg a(iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg2) {
        return new iReSqtkUVgcGbiReSqtkUVg(this.a() + iReSqtkUVgVwNiReSqtkUVg2.i(), this.b() + iReSqtkUVgVwNiReSqtkUVg2.j(), this.c() + iReSqtkUVgVwNiReSqtkUVg2.k());
    }

    public iReSqtkUVgcGbiReSqtkUVg a(int n, int n2, int n3) {
        return new iReSqtkUVgcGbiReSqtkUVg(this.a() + n, this.b() + n2, this.c() + n3);
    }
}

