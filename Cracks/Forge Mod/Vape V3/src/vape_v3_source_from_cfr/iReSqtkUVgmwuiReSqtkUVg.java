/*
 * Decompiled with CFR 0.150.
 */
import java.util.Set;

public class iReSqtkUVgmwuiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b = this.a("entityList", true, Set.class);
    private iReSqtkUVgYewiReSqtkUVg c = this.a("getEntityByID", true, iReSqtkUVgSzRiReSqtkUVg.c, Integer.TYPE);
    private iReSqtkUVgYewiReSqtkUVg d = this.a("addEntityToWorld", true, Void.TYPE, Integer.TYPE, iReSqtkUVgSzRiReSqtkUVg.c);

    public iReSqtkUVgmwuiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.m);
    }

    public Set a(Object object) {
        return (Set)this.b.h(object);
    }

    public Object a(Object object, int n) {
        return this.c.j(object, n);
    }

    public void a(Object object, int n, iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        this.d.a(object, new Object[]{n, iReSqtkUVgjSjiReSqtkUVg2.a()});
    }
}

