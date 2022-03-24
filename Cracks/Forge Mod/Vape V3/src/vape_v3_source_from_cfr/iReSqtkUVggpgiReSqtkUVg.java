/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVggpgiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private Object b;

    public iReSqtkUVggpgiReSqtkUVg(Object object) {
        this.b = object;
    }

    @Override
    public boolean fire() {
        iReSqtkUVgADCiReSqtkUVg iReSqtkUVgADCiReSqtkUVg2 = new iReSqtkUVgADCiReSqtkUVg(this.b);
        int n = -100 + iReSqtkUVgADCiReSqtkUVg2.e();
        iReSqtkUVgrseiReSqtkUVg.a();
        if (!iReSqtkUVgADCiReSqtkUVg2.f()) {
            return this.isCanceled();
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().i.i().booleanValue() && iReSqtkUVgADCiReSqtkUVg2.e() == 2) {
            iReSqtkUVgFuiiReSqtkUVg.e.j().b();
        }
        for (iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgewJiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.k().a()) {
            if (!iReSqtkUVgewJiReSqtkUVg2.d(n)) continue;
            return this.isCanceled();
        }
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.I().isEmpty()) {
                iReSqtkUVgJZmiReSqtkUVg2.d(n);
            }
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        if (iReSqtkUVgADCiReSqtkUVg2.f()) {
            iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.l().a(n);
            if (iReSqtkUVgZsZiReSqtkUVg2 == null) {
                return this.isCanceled();
            }
            iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgPEJiReSqtkUVg.class).a(iReSqtkUVgZsZiReSqtkUVg2);
        }
        return this.isCanceled();
    }
}

