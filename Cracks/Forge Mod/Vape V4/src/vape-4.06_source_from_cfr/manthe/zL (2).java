/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.A5;
import manthe.CQ;
import manthe.Y;
import manthe.d0;
import manthe.dR;
import manthe.dX;
import manthe.ds;
import manthe.eJ;
import manthe.o7;
import manthe.qN;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zL
extends y5 {
    private final qN u = new qN("#.#");

    public zL() {
        super("Health", -21075, CQ.d, "Displays your health in the center of your screen.");
    }

    @Override
    public void t() {
        eJ eJ2 = ds.k();
        if (eJ2.e()) {
            return;
        }
        dX dX2 = ds.x();
        int n6 = dX2.a(A5.ag) ? 70 : (dX2.a(A5.bt) ? 95 : -10);
        boolean bl = GL11.glIsEnabled((int)2896);
        if (bl) {
            GL11.glDisable((int)2896);
        }
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        int n10 = d02.g() / 2;
        int n11 = d02.h() / 2 + n6;
        String string = this.u.b(eJ2.aD() / 2.0f).replace(".0", "") + "\u00a7c\u2764";
        if (eJ2.aR() > 0.0f) {
            string = string + " \u00a7e" + this.u.b(eJ2.aR() / 2.0f).replace(".0", "") + "\u00a76\u2764";
        }
        dR dR2 = ds.m();
        int n12 = dR2.c(string);
        float f10 = eJ2.aD();
        Color color = Color.RED;
        if (f10 > 0.0f) {
            try {
                float f11 = f10 / eJ2.at();
                color = o7.a(Y.a(f11, 0.0f, 1.0f)).brighter();
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
        dR2.d(string, (double)(-n12) / 2.0 + (double)n10, (double)(n11 + 25), color.getRGB());
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (bl) {
            GL11.glEnable((int)2896);
        }
    }
}

