/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.D7;
import manthe.DK;
import manthe.p1;
import manthe.pd;
import manthe.qp;
import manthe.r1;
import manthe.r6;
import manthe.rg;
import manthe.s3;

public class rc
extends r1 {
    private final r6 af;
    private final List<p1> ag = new ArrayList<p1>();
    private final rg ae = new rg("test", true);
    private double ah;

    public rc() {
        super("GUI", false);
        this.af = new r6(false);
        this.af.b(250.0);
        this.aj().b(this.af);
        this.ae.b(5.0);
        this.ae.z().e(0.5);
        this.ae.a(new DK(this));
        this.aj().b(this.ae);
        this.aj().a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.ah = 88.0;
        this.c(88.0);
        this.b(20.0);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        double d10 = this.q();
        double d11 = 0.0;
        for (p1 object : this.ag) {
            p1 p12;
            double d12;
            if (!(object instanceof s3) || !((d12 = ((qp)(p12 = (s3)object)).q()) > d11)) continue;
            d11 = d12;
        }
        if (d11 > d10) {
            d10 = d11;
        }
        if (this.af.z()) {
            this.c(this.ah);
        } else {
            this.c(this.ah - 5.0);
        }
        int n6 = 0;
        for (p1 p12 : this.ag) {
            if (p12.e()) continue;
            ++n6;
        }
        if (n6 == 0) {
            this.ae.a(false);
        } else {
            this.ae.a(true);
            this.ae.z().a(n6 + " hidden frames");
        }
        this.ae.c(this.q() - 3.0);
    }

    public void e(p1 p12) {
        this.ag.add(p12);
    }

    public void al() {
        s3 s32;
        double d10 = 0.0;
        for (p1 p12 : this.ag) {
            if (!(p12 instanceof s3)) continue;
            s32 = (s3)p12;
            double d11 = s32.q();
            if (d11 > d10) {
                d10 = d11;
            }
            this.af.d(p12);
        }
        if (d10 > this.ah) {
            this.ah = d10;
        }
        for (p1 p12 : this.ag) {
            if (!(p12 instanceof s3)) continue;
            s32 = (s3)p12;
            s32.c(this.ah - 0.0 + 1.0);
        }
        this.c(this.ah);
    }

    @Override
    public boolean ag() {
        return false;
    }
}

