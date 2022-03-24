/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ao;
import manthe.dx;
import manthe.g7;
import manthe.kl;
import manthe.on;

public class lQ
extends kl {
    private final dx d;
    private final g7 e;
    private boolean f;

    public lQ(Object object, Object object2) {
        this.d = new dx(object);
        this.e = new g7(object2);
    }

    public boolean shouldRender() {
        return this.f;
    }

    public void setShouldRender(boolean bl) {
        this.f = bl;
    }

    public dx getBlock() {
        return this.d;
    }

    public g7 getEnumWorldBlockLayer() {
        return this.e;
    }

    @Override
    public boolean fire() {
        on.p.H().b(Ao.class).a(this);
        return super.fire();
    }
}

