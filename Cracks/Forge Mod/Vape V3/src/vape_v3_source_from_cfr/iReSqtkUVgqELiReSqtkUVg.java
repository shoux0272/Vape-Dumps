/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVgqELiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgkgTiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgYewiReSqtkUVg f;

    public iReSqtkUVgqELiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.cD);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.b = this.a("mainModel", true, iReSqtkUVgSzRiReSqtkUVg.bo);
        } else {
            this.d = this.a("getMainModel", true, iReSqtkUVgSzRiReSqtkUVg.bo, new Class[0]);
            this.c = this.a("field_177097_h", false, List.class);
            this.e = this.a("unsetBrightness", true, Void.TYPE, new Class[0]);
            this.f = this.a("setBrightness", true, Boolean.TYPE, iReSqtkUVgSzRiReSqtkUVg.n, Float.TYPE, Boolean.TYPE);
        }
    }

    boolean a(Object object, Object object2, float f, boolean bl) {
        return this.f.b(object, object2, Float.valueOf(f), bl);
    }

    private Object a(Object object) {
        return this.c.h(object);
    }

    private Object b(Object object) {
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            return this.b.h(object);
        }
        return this.d.j(object, new Object[0]);
    }

    private void a(Object object, Object object2) {
        this.c.a(object, object2);
    }

    private void c(Object object) {
        this.e.a(object, new Object[0]);
    }

    static /* synthetic */ Object a(iReSqtkUVgqELiReSqtkUVg iReSqtkUVgqELiReSqtkUVg2, Object object) {
        return iReSqtkUVgqELiReSqtkUVg2.b(object);
    }

    static /* synthetic */ Object b(iReSqtkUVgqELiReSqtkUVg iReSqtkUVgqELiReSqtkUVg2, Object object) {
        return iReSqtkUVgqELiReSqtkUVg2.a(object);
    }

    static /* synthetic */ void a(iReSqtkUVgqELiReSqtkUVg iReSqtkUVgqELiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgqELiReSqtkUVg2.a(object, object2);
    }

    static /* synthetic */ void c(iReSqtkUVgqELiReSqtkUVg iReSqtkUVgqELiReSqtkUVg2, Object object) {
        iReSqtkUVgqELiReSqtkUVg2.c(object);
    }
}

