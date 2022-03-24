/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class ig
extends gJ {
    private final bP e = this.a("loadRenderers", true, Void.TYPE, new Class[0]);
    public bP a;
    public bP d;

    public ig() {
        super(A5.dp);
        if (V.c() == 13) {
            this.a = this.a("updateRenderers", true, Boolean.TYPE, A5.cF, Boolean.TYPE);
        } else {
            this.d = this.a("updateChunks", true, Void.TYPE, Long.TYPE);
        }
    }

    private void a(Object object) {
        this.e.p(object, new Object[0]);
    }

    static void a(ig ig2, Object object) {
        ig2.a(object);
    }
}

