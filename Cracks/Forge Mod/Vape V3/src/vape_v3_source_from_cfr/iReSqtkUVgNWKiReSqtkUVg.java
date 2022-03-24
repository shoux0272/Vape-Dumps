/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVgNWKiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgkgTiReSqtkUVg c;

    public iReSqtkUVgNWKiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.cU);
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.b = this.a("particleEmitters", true, List.class);
            this.c = this.a("fxLayers", true, "[[Ljava/util/List;");
        } else {
            this.c = this.a("fxLayers", true, "[Ljava/util/List;");
        }
    }

    public List a(Object object) {
        return (List)this.b.h(object);
    }

    private List[][] b(Object object) {
        if (object == null || this.c == null || this.c.a()) {
            return new List[0][];
        }
        return (List[][])this.c.p(object);
    }

    private List[] c(Object object) {
        return (List[])this.c.p(object);
    }

    static /* synthetic */ List[][] a(iReSqtkUVgNWKiReSqtkUVg iReSqtkUVgNWKiReSqtkUVg2, Object object) {
        return iReSqtkUVgNWKiReSqtkUVg2.b(object);
    }

    static /* synthetic */ List[] b(iReSqtkUVgNWKiReSqtkUVg iReSqtkUVgNWKiReSqtkUVg2, Object object) {
        return iReSqtkUVgNWKiReSqtkUVg2.c(object);
    }
}

