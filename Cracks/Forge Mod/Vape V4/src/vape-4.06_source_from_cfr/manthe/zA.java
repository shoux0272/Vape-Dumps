/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.CQ;
import manthe.DB;
import manthe.ds;
import manthe.eJ;
import manthe.fE;
import manthe.fX;
import manthe.kt;
import manthe.lG;
import manthe.lz;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zA
extends y5 {
    private final DB z = DB.a(this, "Remove Nausea", true);
    private final DB u = DB.a(this, "Remove Blindness", true);
    private final DB w = DB.a(this, "Remove Slowness", true);
    private final DB v = DB.a((Object)this, "Remove Effects", false, "Removes non-visual effects from slowness\nCan be detected by anti-cheat");
    private float y;
    private float A;
    private float x;

    public zA() {
        super("AntiDebuff", -256, CQ.d, "Removes negative visual potion effects");
        this.a(this.z, this.u, this.w, this.v);
    }

    @Override
    public void b(kt kt2) {
        eJ eJ2;
        if (this.z.u().booleanValue()) {
            ds.k().f(9);
        }
        if (this.u.u().booleanValue() && this.v.u().booleanValue()) {
            ds.k().f(15);
        }
        if (this.w.u().booleanValue() && (eJ2 = ds.k()).a(fX.h())) {
            if (this.v.u().booleanValue()) {
                fE fE2 = ds.k().b(fX.h());
                fX[] arrfX = fX.i();
                arrfX[2].a(eJ2, eJ2.aw(), fE2.h());
            }
            eJ2.f(2);
        }
    }

    @Override
    public void a(lz lz2) {
        eJ eJ2 = ds.k();
        if (this.u.u().booleanValue() && eJ2.a(fX.s()) && eJ2.b(fX.s()).f() > 1) {
            lz2.getForgeEvent().a(true);
            lz2.setDensity(0.1f);
        }
    }

    @Override
    public void a(lG lG2) {
        eJ eJ2 = ds.k();
        if (this.u.u().booleanValue() && eJ2.a(fX.s()) && eJ2.b(fX.s()).f() > 1) {
            GL11.glFogf((int)2915, (float)990.0f);
            GL11.glFogf((int)2916, (float)1000.0f);
            lG2.getRenderer().a(true);
            if (lG2.getRed() == 0.0f) {
                lG2.setRed(this.y);
            }
            if (lG2.getGreen() == 0.0f) {
                lG2.setGreen(this.A);
            }
            if (lG2.getBlue() == 0.0f) {
                lG2.setBlue(this.x);
            }
        } else {
            this.y = lG2.getRed();
            this.A = lG2.getGreen();
            this.x = lG2.getBlue();
        }
    }
}

