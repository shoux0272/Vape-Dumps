/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public abstract class f<T> {
    private long c = Long.MAX_VALUE;
    private boolean a;
    private long b;
    private static String[] d;

    public f(double d10) {
        this.b = (long)(d10 * 1000.0);
    }

    public abstract T f();

    public void g() {
        this.c = System.currentTimeMillis();
        this.a = false;
    }

    public void b() {
        this.c = System.currentTimeMillis();
        this.a = true;
    }

    public void c() {
        double d10 = this.l();
        if (d10 == 0.0) {
            this.g();
            return;
        }
        if (d10 == 100.0) {
            this.b();
            return;
        }
        if (this.a) {
            this.a = false;
            return;
        }
        this.a = true;
    }

    public void m() {
        this.c = 0L;
        this.a = false;
    }

    public void e() {
        this.c = 0L;
        this.a = true;
    }

    public double l() {
        long l = System.currentTimeMillis() - this.c;
        double d10 = Math.min((double)l / (double)this.b * 100.0, 100.0);
        if (d10 < 0.0) {
            d10 = 0.0;
        }
        if (this.a) {
            return 100.0 - d10;
        }
        return d10;
    }

    public boolean d() {
        double d10 = this.l();
        return d10 != 0.0 && d10 != 100.0;
    }

    public boolean j() {
        return this.l() == 100.0;
    }

    public boolean k() {
        return !this.a && this.l() != 0.0;
    }

    public boolean a() {
        return this.a;
    }

    public long h() {
        return this.b;
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    public static String[] i() {
        return d;
    }

    static {
        if (f.i() == null) {
            f.b(new String[3]);
        }
    }
}

