/*
 * Decompiled with CFR 0.150.
 */
import java.util.AbstractList;

public class iReSqtkUVgbiGiReSqtkUVg
extends iReSqtkUVgbBTiReSqtkUVg {
    public iReSqtkUVgbiGiReSqtkUVg(Object object) {
        super(object);
    }

    public int d() {
        return iReSqtkUVgbiGiReSqtkUVg.a.c().C.a(this.b);
    }

    public Object[] e() {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            AbstractList abstractList = iReSqtkUVgbiGiReSqtkUVg.a.c().C.c(this.b);
            return abstractList.toArray();
        }
        return iReSqtkUVgbiGiReSqtkUVg.a.c().C.b(this.b);
    }

    public Object[] f() {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            AbstractList abstractList = iReSqtkUVgCrOiReSqtkUVg.a(iReSqtkUVgbiGiReSqtkUVg.a.c().C, this.b);
            return abstractList.toArray();
        }
        return iReSqtkUVgCrOiReSqtkUVg.b(iReSqtkUVgbiGiReSqtkUVg.a.c().C, this.b);
    }

    public void a(int n) {
        iReSqtkUVgbiGiReSqtkUVg.a.c().C.a(this.b, n);
    }

    public iReSqtkUVgyetiReSqtkUVg b(int n) {
        return new iReSqtkUVgyetiReSqtkUVg(iReSqtkUVgbiGiReSqtkUVg.a.c().C.b(this.b, n));
    }

    public iReSqtkUVgyetiReSqtkUVg g() {
        return new iReSqtkUVgyetiReSqtkUVg(iReSqtkUVgCrOiReSqtkUVg.c(iReSqtkUVgbiGiReSqtkUVg.a.c().C, this.b));
    }
}

