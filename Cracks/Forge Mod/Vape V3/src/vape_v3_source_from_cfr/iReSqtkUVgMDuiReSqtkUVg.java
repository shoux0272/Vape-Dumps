/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgMDuiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private final int b;
    private final boolean c;

    public iReSqtkUVgMDuiReSqtkUVg(int n, boolean bl) {
        this.b = n;
        this.c = bl;
    }

    public boolean a() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    @Override
    public boolean fire() {
        iReSqtkUVgrseiReSqtkUVg.a();
        if (this.b > 0 && this.c && iReSqtkUVgeLLiReSqtkUVg.f().a() == null) {
            for (iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgewJiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.k().a()) {
                if (!iReSqtkUVgewJiReSqtkUVg2.d(this.b)) continue;
                return this.isCanceled();
            }
        }
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }
}

