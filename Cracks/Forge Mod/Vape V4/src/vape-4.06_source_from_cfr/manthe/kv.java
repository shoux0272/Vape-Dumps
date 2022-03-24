/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ao;
import manthe.dx;
import manthe.eV;
import manthe.kl;
import manthe.on;

public class kv
extends kl {
    private eV d;
    private dx e;

    public kv(Object object, Object object2) {
        this.d = new eV(object);
        this.e = new dx(object2);
    }

    @Override
    public boolean fire() {
        on.p.H().b(Ao.class).a(this);
        return super.fire();
    }

    public eV getRenderBlocks() {
        return this.d;
    }

    public dx getBlock() {
        return this.e;
    }
}

