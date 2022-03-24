/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.ds;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class kZ
extends kl {
    private final int e;
    private final boolean d;

    public kZ(int n6, boolean bl) {
        this.e = n6;
        this.d = bl;
    }

    public boolean isDown() {
        return this.d;
    }

    public int getKey() {
        return this.e;
    }

    @Override
    public boolean fire() {
        if (this.e > 0 && this.d && ds.x().a() == null) {
            for (Ak yt2 : on.p.l().d()) {
                if (!yt2.a(this.e)) continue;
            }
        }
        for (y5 y52 : on.p.H().e()) {
            y52.a(this);
        }
        return this.d();
    }
}

