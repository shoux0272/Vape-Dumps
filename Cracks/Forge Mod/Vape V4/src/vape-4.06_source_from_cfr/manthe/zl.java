/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.CQ;
import manthe.DF;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.ej;
import manthe.kt;
import manthe.on;
import manthe.pf;
import manthe.y5;
import manthe.zf;
import org.lwjgl.input.Keyboard;

public class zl
extends y5 {
    private final DF y = DF.a((Object)this, "Distance", "#.#", "", 0.1, 3.3, 6.0, 1.0);
    private final DF v = DF.a(this, "Speed", "#.#", "", 0.1, 0.5, 1.0);
    private final DF w = DF.a(this, "Target minimum angle", "#", "", 1.0, 120.0, 360.0);
    private final DF z = DF.a(this, "Your minimum angle", "#", "", 1.0, 90.0, 360.0);
    private zf x;
    private boolean u;

    public zl() {
        super("Strafe", -256, CQ.f);
        this.a(this.y, this.v, this.w, this.z);
        this.a(10L, true);
    }

    @Override
    public void k() {
        this.x = on.p.H().b(zf.class);
    }

    @Override
    public void b(kt kt2) {
        eJ eJ2 = ds.k();
        if (this.u) {
            eJ2.l(false);
            this.u = false;
        }
    }

    @Override
    public void q() {
        double d10;
        if (ds.x().d()) {
            return;
        }
        eJ eJ2 = ds.k();
        int n6 = ds.s().A().i();
        boolean bl = Keyboard.isKeyDown((int)n6);
        ei.a(n6, bl);
        double d11 = this.y.a();
        double d12 = this.v.a() / 5.0;
        d12 *= 0.1;
        boolean bl2 = this.x.N() && this.x.S() != null;
        ej ej2 = new ej(this.x.S());
        if (ej2.e()) {
            return;
        }
        boolean bl3 = pf.a(eJ2, ej2, this.w.a() / 2.0);
        boolean bl4 = pf.a(ej2, eJ2, this.z.a() / 2.0);
        if (bl2 && bl3 && bl4 && (d10 = (double)eJ2.a(ej2)) < d11 && !eJ2.H() && !eJ2.E() && !eJ2.aQ() && eJ2.v() && !eJ2.aT()) {
            double d13 = ej2.z();
            double d14 = ej2.g();
            if (eJ2.z() - d13 > 0.5) {
                eJ2.k(eJ2.k() + d12);
            }
            if (eJ2.z() - d13 < 0.5) {
                eJ2.k(eJ2.k() - d12);
            }
            if (eJ2.g() - d14 > 0.5) {
                eJ2.d(eJ2.u() + d12);
            }
            if (eJ2.g() - d14 < 0.5) {
                eJ2.d(eJ2.u() - d12);
            }
            this.u = true;
        }
    }
}

