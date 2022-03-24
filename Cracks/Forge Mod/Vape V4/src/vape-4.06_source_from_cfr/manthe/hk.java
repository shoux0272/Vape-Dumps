/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.A5;
import manthe.BG;
import manthe.gJ;

public class hk
extends gJ {
    private final Class e = a.a.gc("net/minecraftforge/client/event/RenderGameOverlayEvent$ElementType");
    private final BG f = new BG(this.e, "ALL", false, true, this.e);
    private final BG a = this.b("type", false, this.e);
    private final BG d = this.b("partialTicks", false, Float.TYPE);

    public hk() {
        super(A5.by);
    }

    public Object d() {
        return this.f.f(null);
    }

    public Object a(Object object) {
        return this.a.f(object);
    }

    public float b(Object object) {
        return this.d.b(object);
    }
}

