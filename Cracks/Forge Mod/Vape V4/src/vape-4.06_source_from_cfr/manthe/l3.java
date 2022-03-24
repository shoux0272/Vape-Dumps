/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ao;
import manthe.kl;
import manthe.on;

public class l3
extends kl {
    private Object d;
    private Object e;
    private int i;
    private int f;
    private int g;
    private boolean h;

    public l3(Object object, Object object2, int n6, int n10, int n11) {
        this.d = object;
        this.e = object2;
        this.i = n6;
        this.f = n10;
        this.g = n11;
    }

    public boolean isResult() {
        return this.h;
    }

    @Override
    public boolean fire() {
        on.p.H().b(Ao.class).a(this);
        if (this.d()) {
            this.h = on.p.M().y.f.h(this.d, this.e, this.i, this.f, this.g, Float.valueOf(1.0f), Float.valueOf(1.0f), Float.valueOf(1.0f));
        }
        return super.fire();
    }
}

