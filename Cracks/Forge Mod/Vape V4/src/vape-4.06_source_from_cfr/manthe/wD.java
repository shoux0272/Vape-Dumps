/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ak;
import manthe.pe;
import manthe.wM;
import manthe.wa;
import manthe.we;
import manthe.xZ;

public class wD
extends we {
    public static wD V;

    public wD() {
        this.P = false;
        this.W().e(false);
        this.W().b("wrap");
        this.a(new wM[]{new xZ("YOUR PROFILES")});
        V = this;
    }

    @Override
    public void V() {
    }

    @Override
    public void C() {
        super.C();
        pe.c(this.d(), this.c(), this.e() - 0.5, 0.5, wD.b.y);
    }

    @Override
    public void K() {
    }

    public void b(Ak ak) {
        this.a(new wM[]{new wa(ak)});
    }

    public void a(Ak ak) {
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wa) || !((wa)wM2).N().l().equals(ak.l())) continue;
            this.a(wM2);
        }
    }

    @Override
    public String ad() {
        return "privateprofiles";
    }
}

