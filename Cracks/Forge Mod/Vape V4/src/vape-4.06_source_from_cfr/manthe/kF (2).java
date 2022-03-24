/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.fO;
import manthe.fn;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kF
extends kl {
    private fO d;
    private fn e;

    public kF(Object object, Object object2) {
        this.d = new fO(object);
        this.e = new fn(object2);
    }

    public Object getPacketInstance() {
        return this.e.a();
    }

    public fn getPacket() {
        return this.e;
    }

    public void setPacket(fn fn2) {
        this.e = fn2;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public fO getNetworkManager() {
        return this.d;
    }
}

