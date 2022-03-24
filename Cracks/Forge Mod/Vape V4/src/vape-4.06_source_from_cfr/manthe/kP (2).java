/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ao;
import manthe.cy;
import manthe.dx;
import manthe.eb;
import manthe.kl;
import manthe.on;

public class kP
extends kl {
    private final eb e;
    private final dx f;
    private static cy[] d;

    public kP(Object object) {
        this.f = new dx(object);
        this.e = eb.f();
    }

    public eb getTessellator() {
        return this.e;
    }

    public dx getBlock() {
        return this.f;
    }

    @Override
    public boolean fire() {
        Ao ao = on.p.H().b(Ao.class);
        if (ao.N() && !ao.a(this.f) && this.e.g()) {
            this.e.a(255, 255, 255, ao.S());
        }
        return super.fire();
    }

    public static void a(cy[] arrcy) {
        d = arrcy;
    }

    public static cy[] e() {
        return d;
    }

    static {
        if (kP.e() != null) {
            kP.a(new cy[2]);
        }
    }
}

