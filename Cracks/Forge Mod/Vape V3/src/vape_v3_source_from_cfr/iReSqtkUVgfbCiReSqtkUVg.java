/*
 * Decompiled with CFR 0.150.
 */
import a.a;

public class iReSqtkUVgfbCiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private Class b = a.a.gc("net/minecraftforge/client/event/RenderGameOverlayEvent$ElementType");
    private iReSqtkUVgkgTiReSqtkUVg c = new iReSqtkUVgkgTiReSqtkUVg(this.b, "ALL", false, true, this.b);
    private iReSqtkUVgkgTiReSqtkUVg d = this.a("type", false, this.b);
    private iReSqtkUVgkgTiReSqtkUVg e = this.a("partialTicks", false, Float.TYPE);

    public iReSqtkUVgfbCiReSqtkUVg() {
        super("net/minecraftforge/client/event/RenderGameOverlayEvent");
    }

    public Object a() {
        return this.c.h(null);
    }

    public Object a(Object object) {
        return this.d.h(object);
    }

    public float b(Object object) {
        return this.e.f(object);
    }
}

