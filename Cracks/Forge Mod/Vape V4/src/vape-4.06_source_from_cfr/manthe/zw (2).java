/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.CQ;
import manthe.ds;
import manthe.eJ;
import manthe.ft;
import manthe.kd;
import manthe.ms;
import manthe.on;
import manthe.y5;
import manthe.zz;

public class zw
extends y5 {
    public zw() {
        super("Step", new Color(42, 175, 224).getRGB(), CQ.f);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kd kd2) {
        eJ eJ2 = ds.k();
        if (kd2.c() && !eJ2.bg().f() && eJ2.J()) {
            kd2.setStepHeight(1.0);
        } else if (!kd2.c() && kd2.getRealHeight() > 0.5 && kd2.getStepHeight() > 0.0 && !eJ2.bg().f() && eJ2.J()) {
            on.p.H().b(zz.class).e(-4);
            if (kd2.getRealHeight() >= 0.87) {
                double d10 = kd2.getRealHeight();
                double d11 = d10 * 0.42;
                double d12 = d10 * 0.75;
                eJ2.bp().a(ft.a(eJ2.z(), eJ2.l() + d11, eJ2.g(), eJ2.v()));
                eJ2.bp().a(ft.a(eJ2.z(), eJ2.l() + d12, eJ2.g(), eJ2.v()));
            }
            ds.O().a(0.45f);
            ms ms2 = new ms(this);
            ms2.start();
        }
    }
}

