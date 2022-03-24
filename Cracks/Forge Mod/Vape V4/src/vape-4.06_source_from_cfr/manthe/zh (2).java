/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.CQ;
import manthe.kU;
import manthe.km;
import manthe.p4;
import manthe.y5;
import manthe.yA;

public class zh
extends y5 {
    private final p4 u = new p4("AntiCheat", new yA(this, "AntiCheat"));

    public zh() {
        super("Phase", new Color(73, 208, 176).getRGB(), CQ.f, "Phase/Clip through walls.");
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void t() {
    }

    @Override
    public void a(km km2) {
        ((y5)this.u.f()).a(km2);
    }

    @Override
    public void a(kU kU2) {
        if (kU2.getOverlayType().toString().toUpperCase().equals("BLOCK")) {
            kU2.getEvent().a(true);
        }
    }
}

