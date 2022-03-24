/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.BG;
import manthe.gJ;

public class hI
extends gJ {
    private final BG e = this.b("renderHelmet", true, Boolean.TYPE);
    private final BG a = this.b("renderCape", true, Boolean.TYPE);
    private final BG d = this.b("renderItem", true, Boolean.TYPE);

    public hI() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$Specials$Pre");
    }

    private void b(Object object, boolean bl) {
        this.e.a(object, bl);
    }

    private void c(Object object, boolean bl) {
        this.a.a(object, bl);
    }

    private void a(Object object, boolean bl) {
        this.d.a(object, bl);
    }

    static void b(hI hI2, Object object, boolean bl) {
        hI2.b(object, bl);
    }

    static void c(hI hI2, Object object, boolean bl) {
        hI2.c(object, bl);
    }

    static void a(hI hI2, Object object, boolean bl) {
        hI2.a(object, bl);
    }
}

