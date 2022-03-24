/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class hd
extends gJ {
    public bP a;
    public final BG d;

    public hd() {
        super(A5.ac);
        if (V.c() >= 15) {
            this.a = this.a("renderGameOverlay", true, Void.TYPE, Float.TYPE);
        }
        this.d = this.b("displayedTitle", true, String.class);
    }

    public Object a(Object object) {
        return this.d.f(object);
    }
}

