/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DX;
import manthe.be;
import manthe.ds;
import manthe.fE;
import manthe.kt;
import manthe.pb;
import manthe.rz;
import manthe.y5;

public class zr
extends y5 {
    private final pb x = new pb("Night Vision");
    private final pb w = new pb("Gamma");
    private final DX v = DX.a((Object)this, "Mode", this.x, this.x, this.w);
    private float u = -1.0f;

    public zr() {
        super("Fullbright", -256, CQ.d);
        this.a(this.v);
        ((rz)this.v.c()).a(new be(this));
    }

    @Override
    public void b(kt kt2) {
        if (this.v.v().equals(this.x)) {
            ds.k().a(fE.a(16, 5220, 0));
        } else {
            ds.s().b(100.0f);
        }
    }

    @Override
    public void s() {
        this.u = ds.s().p();
    }

    @Override
    public void J() {
        if (this.v.v().equals(this.x)) {
            if (ds.k().d()) {
                ds.k().f(16);
            }
        } else {
            ds.s().b(this.u);
        }
    }

    static pb a(zr zr2) {
        return zr2.w;
    }

    static DX b(zr zr2) {
        return zr2.v;
    }

    static float c(zr zr2) {
        return zr2.u;
    }
}

