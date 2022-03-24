/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.g;
import manthe.wI;
import manthe.wM;

public abstract class w7
extends wI {
    private g D;
    private boolean F;
    private boolean E;

    public w7() {
        this.D = new g(0.15, w7.b.y, w7.b.o);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.F && !this.x()) {
            this.D.c();
            this.F = false;
        }
    }

    @Override
    public void i() {
        if (!this.F) {
            this.D.c();
        }
        this.F = true;
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 25.0;
    }

    public g N() {
        return this.D;
    }

    public boolean P() {
        return this.F;
    }

    public boolean O() {
        return this.E;
    }

    public void f(boolean bl) {
        if (bl) {
            for (wM wM2 : this.F().w()) {
                if (!(wM2 instanceof w7)) continue;
                ((w7)wM2).f(false);
            }
        }
        this.E = bl;
    }
}

