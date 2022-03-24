/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class j_
extends gJ {
    private bP g;
    private bP d;
    private BG a;
    private BG e;
    private BG f;

    public j_() {
        super(A5.bI);
        if (V.c() > 13) {
            this.d = this.a("getBlockState", true, A5.aA, new Class[0]);
            this.g = this.a("getBlockPosition", true, A5.ao, new Class[0]);
        } else {
            this.a = this.b("field_148887_a", false, Integer.TYPE);
            this.e = this.b("field_148885_b", false, Integer.TYPE);
            this.f = this.b("field_148886_c", false, Integer.TYPE);
        }
    }

    public int c(Object object) {
        return this.a.c(object);
    }

    public int e(Object object) {
        return this.e.c(object);
    }

    public int d(Object object) {
        return this.f.c(object);
    }

    public Object a(Object object) {
        return this.d.e(object, new Object[0]);
    }

    public Object b(Object object) {
        return this.g.e(object, new Object[0]);
    }
}

