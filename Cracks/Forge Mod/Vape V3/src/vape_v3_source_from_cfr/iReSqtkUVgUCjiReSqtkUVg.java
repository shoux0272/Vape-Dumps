/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 */
import com.google.common.collect.Multimap;

public class iReSqtkUVgUCjiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg b = this.a("stackSize", true, Integer.TYPE);
    private final iReSqtkUVgYewiReSqtkUVg c = this.a("getItem", true, iReSqtkUVgSzRiReSqtkUVg.w, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg d = this.a("<init>", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.w);
    private final iReSqtkUVgYewiReSqtkUVg e = this.a("getUnlocalizedName", true, String.class, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg f = this.a("getDisplayName", true, String.class, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg g = this.a("getItemDamage", true, Integer.TYPE, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg h = this.a("getEnchantmentTagList", true, iReSqtkUVgSzRiReSqtkUVg.aR, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg i;
    private final iReSqtkUVgYewiReSqtkUVg j;

    public iReSqtkUVgUCjiReSqtkUVg() {
        super("net/minecraft/item/ItemStack");
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.j = this.a("func_150997_a", false, Float.TYPE, iReSqtkUVgSzRiReSqtkUVg.bV);
            this.i = this.a("getAttributeModifiers", true, Multimap.class, iReSqtkUVgSzRiReSqtkUVg.cP);
        } else {
            this.j = this.a("func_150997_a", false, Float.TYPE, iReSqtkUVgSzRiReSqtkUVg.G);
            this.i = this.a("getAttributeModifiers", true, Multimap.class, new Class[0]);
        }
    }

    public int a(Object object) {
        return this.b.d(object);
    }

    public Object b(Object object) {
        return this.c.j(object, new Object[0]);
    }

    public Object c(Object object) {
        return this.d.a(object);
    }

    public String d(Object object) {
        return this.e.j(object, new Object[0]).toString();
    }

    private String e(Object object) {
        return (String)this.f.j(object, new Object[0]);
    }

    private int f(Object object) {
        return this.g.e(object, new Object[0]);
    }

    private Object g(Object object) {
        return this.h.j(object, new Object[0]);
    }

    private Multimap h(Object object) {
        return (Multimap)this.i.j(object, new Object[0]);
    }

    private Multimap a(Object object, Object object2) {
        return (Multimap)this.i.j(object, object2);
    }

    private float b(Object object, Object object2) {
        return this.j.g(object, object2);
    }

    static /* synthetic */ String a(iReSqtkUVgUCjiReSqtkUVg iReSqtkUVgUCjiReSqtkUVg2, Object object) {
        return iReSqtkUVgUCjiReSqtkUVg2.e(object);
    }

    static /* synthetic */ int b(iReSqtkUVgUCjiReSqtkUVg iReSqtkUVgUCjiReSqtkUVg2, Object object) {
        return iReSqtkUVgUCjiReSqtkUVg2.f(object);
    }

    static /* synthetic */ Object c(iReSqtkUVgUCjiReSqtkUVg iReSqtkUVgUCjiReSqtkUVg2, Object object) {
        return iReSqtkUVgUCjiReSqtkUVg2.g(object);
    }

    static /* synthetic */ Multimap a(iReSqtkUVgUCjiReSqtkUVg iReSqtkUVgUCjiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgUCjiReSqtkUVg2.a(object, object2);
    }

    static /* synthetic */ Multimap d(iReSqtkUVgUCjiReSqtkUVg iReSqtkUVgUCjiReSqtkUVg2, Object object) {
        return iReSqtkUVgUCjiReSqtkUVg2.h(object);
    }

    static /* synthetic */ float b(iReSqtkUVgUCjiReSqtkUVg iReSqtkUVgUCjiReSqtkUVg2, Object object, Object object2) {
        return iReSqtkUVgUCjiReSqtkUVg2.b(object, object2);
    }
}

