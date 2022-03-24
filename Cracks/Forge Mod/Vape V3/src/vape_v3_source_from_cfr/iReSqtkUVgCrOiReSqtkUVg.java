/*
 * Decompiled with CFR 0.150.
 */
import java.util.AbstractList;

public class iReSqtkUVgCrOiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = this.a("currentItem", true, Integer.TYPE);
    private final iReSqtkUVgkgTiReSqtkUVg c;
    private final iReSqtkUVgkgTiReSqtkUVg d;
    private final iReSqtkUVgYewiReSqtkUVg e;
    private final iReSqtkUVgYewiReSqtkUVg f;

    public iReSqtkUVgCrOiReSqtkUVg() {
        super("net/minecraft/entity/player/InventoryPlayer");
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.c = this.a("field_70462_a", true, iReSqtkUVgSzRiReSqtkUVg.cO);
            this.d = this.a("armorInventory", true, iReSqtkUVgSzRiReSqtkUVg.cO);
        } else {
            this.c = this.a("mainInventory", true, iReSqtkUVgxfhiReSqtkUVg.b(iReSqtkUVgSzRiReSqtkUVg.v));
            this.d = this.a("armorInventory", true, iReSqtkUVgxfhiReSqtkUVg.b(iReSqtkUVgSzRiReSqtkUVg.v));
        }
        this.e = this.a("getStackInSlot", true, iReSqtkUVgSzRiReSqtkUVg.v, Integer.TYPE);
        this.f = this.a("getItemStack", true, iReSqtkUVgSzRiReSqtkUVg.v, new Class[0]);
    }

    public int a(Object object) {
        return this.b.d(object);
    }

    public void a(Object object, int n) {
        this.b.a(object, n);
    }

    public Object[] b(Object object) {
        return this.c.p(object);
    }

    private Object[] d(Object object) {
        return this.d.p(object);
    }

    public AbstractList c(Object object) {
        return (AbstractList)this.c.h(object);
    }

    private AbstractList e(Object object) {
        return (AbstractList)this.d.h(object);
    }

    public Object b(Object object, int n) {
        return this.e.j(object, n);
    }

    private Object f(Object object) {
        return this.f.j(object, new Object[0]);
    }

    static /* synthetic */ AbstractList a(iReSqtkUVgCrOiReSqtkUVg iReSqtkUVgCrOiReSqtkUVg2, Object object) {
        return iReSqtkUVgCrOiReSqtkUVg2.e(object);
    }

    static /* synthetic */ Object[] b(iReSqtkUVgCrOiReSqtkUVg iReSqtkUVgCrOiReSqtkUVg2, Object object) {
        return iReSqtkUVgCrOiReSqtkUVg2.d(object);
    }

    static /* synthetic */ Object c(iReSqtkUVgCrOiReSqtkUVg iReSqtkUVgCrOiReSqtkUVg2, Object object) {
        return iReSqtkUVgCrOiReSqtkUVg2.f(object);
    }
}

