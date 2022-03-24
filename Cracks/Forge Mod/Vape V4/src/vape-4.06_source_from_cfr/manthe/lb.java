/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ao;
import manthe.V;
import manthe.Y;
import manthe.dL;
import manthe.g1;
import manthe.kl;
import manthe.on;

public class lb
extends kl {
    private Object j;
    private Object d;
    private Object e;
    private Object k;
    private Object i;
    private Object g;
    private boolean f;
    private boolean h;

    public lb(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, boolean bl) {
        this.j = object;
        this.d = object2;
        this.e = object3;
        this.k = object4;
        this.i = object5;
        this.g = object6;
        this.f = bl;
    }

    public boolean getResult() {
        return this.h;
    }

    @Override
    public boolean fire() {
        if (!on.p.H().a(Ao.class)) {
            return super.fire();
        }
        on.p.H().b(Ao.class).a(this);
        if (this.d()) {
            try {
                long l = V.c() >= 23 ? Y.a(new g1(this.i)) : 0L;
                this.h = on.p.M().by.a(this.j, this.d, this.e, new dL(this.k).f().a(), this.k, this.i, this.g, this.f, l);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        return super.fire();
    }
}

