/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgoEfiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgkgTiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;

    public iReSqtkUVgoEfiReSqtkUVg() {
        super("net/minecraft/entity/projectile/EntityPotion");
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            this.c = this.a("getPotion", true, iReSqtkUVgSzRiReSqtkUVg.v, new Class[0]);
        } else {
            this.b = this.a("potionDamage", true, iReSqtkUVgSzRiReSqtkUVg.v);
        }
    }

    private Object a(Object object) {
        if (iReSqtkUVgauSiReSqtkUVg.d() >= 23) {
            return this.c.j(object, new Object[0]);
        }
        return this.b.h(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgoEfiReSqtkUVg iReSqtkUVgoEfiReSqtkUVg2, Object object) {
        return iReSqtkUVgoEfiReSqtkUVg2.a(object);
    }
}

