/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgbZEiReSqtkUVg
extends iReSqtkUVgncDiReSqtkUVg {
    private iReSqtkUVgAUziReSqtkUVg b;
    private iReSqtkUVgjSjiReSqtkUVg c;
    private iReSqtkUVgGrkiReSqtkUVg d;
    private double e;
    private int f;
    private float g;

    public iReSqtkUVgbZEiReSqtkUVg(iReSqtkUVgfipiReSqtkUVg iReSqtkUVgfipiReSqtkUVg2, iReSqtkUVgAUziReSqtkUVg iReSqtkUVgAUziReSqtkUVg2, iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2, double d2, int n, float f) {
        super(iReSqtkUVgfipiReSqtkUVg2);
        this.b = iReSqtkUVgAUziReSqtkUVg2;
        this.c = iReSqtkUVgjSjiReSqtkUVg2;
        this.d = iReSqtkUVgGrkiReSqtkUVg2;
        this.e = d2;
        this.f = n;
        this.g = f;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public iReSqtkUVgAUziReSqtkUVg a() {
        return this.b;
    }

    public iReSqtkUVgjSjiReSqtkUVg b() {
        return this.c;
    }

    public iReSqtkUVgGrkiReSqtkUVg c() {
        return this.d;
    }

    public double d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public float f() {
        return this.g;
    }
}

