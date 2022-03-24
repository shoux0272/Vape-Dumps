/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVgFSZiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = this.a("inventorySlots", true, List.class);
    private final iReSqtkUVgkgTiReSqtkUVg c = this.a("windowId", true, Integer.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg d = this.a("getSlot", true, iReSqtkUVgSzRiReSqtkUVg.z, Integer.TYPE);

    public iReSqtkUVgFSZiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.A);
    }

    public List a(Object object) {
        return (List)this.b.h(object);
    }

    public int b(Object object) {
        return this.c.d(object);
    }

    private Object a(Object object, int n) {
        return this.d.j(object, n);
    }

    static /* synthetic */ Object a(iReSqtkUVgFSZiReSqtkUVg iReSqtkUVgFSZiReSqtkUVg2, Object object, int n) {
        return iReSqtkUVgFSZiReSqtkUVg2.a(object, n);
    }
}

