/*
 * Decompiled with CFR 0.150.
 */
import a.a;
import a.c;

public abstract class iReSqtkUVgbRmiReSqtkUVg
implements iReSqtkUVgOLIiReSqtkUVg {
    private Class a;
    private iReSqtkUVgNwsiReSqtkUVg b;

    public iReSqtkUVgbRmiReSqtkUVg(String string, int n) {
        this.a = a.a.gc(string);
        c.reg(this.a, n);
    }

    public iReSqtkUVgbRmiReSqtkUVg(Class class_, int n) {
        this.a = class_;
        c.reg(this.a, n);
    }

    @Override
    public abstract void a(Object var1);

    @Override
    public Class a() {
        return this.a;
    }

    public void a(iReSqtkUVgNwsiReSqtkUVg iReSqtkUVgNwsiReSqtkUVg2) {
        this.b = iReSqtkUVgNwsiReSqtkUVg2;
    }

    public iReSqtkUVgNwsiReSqtkUVg b() {
        return this.b;
    }
}

