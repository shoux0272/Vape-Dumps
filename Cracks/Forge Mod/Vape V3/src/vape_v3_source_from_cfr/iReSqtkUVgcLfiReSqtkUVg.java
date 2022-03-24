/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgcLfiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b = this.a("getName", true, String.class, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg c = this.a("hasCustomName", true, Boolean.TYPE, new Class[0]);
    private final iReSqtkUVgYewiReSqtkUVg d = this.a("getDisplayName", true, iReSqtkUVgSzRiReSqtkUVg.ct, new Class[0]);

    public iReSqtkUVgcLfiReSqtkUVg() {
        super("net/minecraft/world/IWorldNameable");
    }

    public String a(Object object) {
        return this.b.j(object, new Object[0]).toString();
    }

    public boolean b(Object object) {
        return this.c.b(object, new Object[0]);
    }

    public Object c(Object object) {
        return this.d.j(object, new Object[0]);
    }
}

