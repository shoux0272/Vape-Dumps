/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.BG;
import manthe.gJ;

public class hM
extends gJ {
    private final BG a = this.b("result", true, Integer.TYPE);

    public hM() {
        super("net/minecraftforge/client/event/RenderPlayerEvent$SetArmorModel");
    }

    private void a(Object object, int n6) {
        this.a.a(object, n6);
    }

    private int a(Object object) {
        return this.a.c(object);
    }

    static int a(hM hM2, Object object) {
        return hM2.a(object);
    }

    static void a(hM hM2, Object object, int n6) {
        hM2.a(object, n6);
    }
}

