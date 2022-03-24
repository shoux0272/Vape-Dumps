/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.fT;
import manthe.gJ;

public class je
extends gJ {
    private BG f;
    private BG a;
    private BG e;
    private BG d;

    public je() {
        super(A5.am);
        fT.a(V.c() == 13);
        if (V.c() == 13) {
            this.f = this.b("xCoord", true, Integer.TYPE);
            this.a = this.b("yCoord", true, Integer.TYPE);
            this.e = this.b("zCoord", true, Integer.TYPE);
        } else {
            this.d = this.b("pos", true, A5.ao);
        }
    }

    public int c(Object object) {
        return this.f.c(object);
    }

    public int b(Object object) {
        return this.a.c(object);
    }

    public int d(Object object) {
        return this.e.c(object);
    }

    public Object a(Object object) {
        return this.d.f(object);
    }
}

