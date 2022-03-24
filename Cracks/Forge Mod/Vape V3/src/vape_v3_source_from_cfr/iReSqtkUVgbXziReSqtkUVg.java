/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgbXziReSqtkUVg {
    public int a;
    public int b;
    public int c;
    public int d;

    public iReSqtkUVgbXziReSqtkUVg(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public void a(int n, int n2, int n3, int n4) {
        this.a = n;
        this.b = n2;
        this.c = n3;
        this.d = n4;
    }

    public boolean equals(Object object) {
        if (object instanceof iReSqtkUVgbXziReSqtkUVg) {
            iReSqtkUVgbXziReSqtkUVg iReSqtkUVgbXziReSqtkUVg2 = (iReSqtkUVgbXziReSqtkUVg)object;
            return this.a == iReSqtkUVgbXziReSqtkUVg2.a && this.b == iReSqtkUVgbXziReSqtkUVg2.b && this.c == iReSqtkUVgbXziReSqtkUVg2.c && this.d == iReSqtkUVgbXziReSqtkUVg2.d;
        }
        return false;
    }

    public int hashCode() {
        int n = this.b + this.c;
        int n2 = this.d + this.a;
        int n3 = n * (n + 1) / 2 + this.b;
        int n4 = n2 * (n2 + 1) / 2 + this.a;
        int n5 = n3 + n4;
        return n5 * (n5 + 1) / 2 + n4;
    }
}

