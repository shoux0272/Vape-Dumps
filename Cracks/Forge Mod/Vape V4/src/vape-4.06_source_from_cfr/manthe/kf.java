/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import a.d;
import manthe.Da;
import manthe.dX;
import manthe.ds;
import manthe.kl;
import manthe.on;
import manthe.r1;
import manthe.y5;
import manthe.zu;
import manthe.zx;
import org.lwjgl.input.Keyboard;

public class kf
extends kl {
    public kf(int n6) {
        this.a = n6;
    }

    @Override
    public boolean fire() {
        try {
            if (on.p.m()) {
                ds.a(new dX(d.getGuiObject()));
                on.p.c(false);
            }
            for (y5 bI2 : on.p.H().e()) {
                if (bI2 instanceof zu) {
                    ((zu)bI2).b(this);
                }
                if (!bI2.N()) continue;
                bI2.a(this);
            }
            if (Keyboard.isKeyDown((int)29) && Keyboard.isKeyDown((int)199) && this.a == 1) {
                if (ds.x().d() && ds.x().a().equals(d.getGuiObject()) && ds.t().e()) {
                    ds.a(new dX(null));
                }
                try {
                    Thread.sleep(1000L);
                }
                catch (InterruptedException interruptedException) {
                    interruptedException.printStackTrace();
                }
                on.p.H().b(zx.class).d(true);
            }
            if (Keyboard.isKeyDown((int)157) && Keyboard.isKeyDown((int)199) && this.a == 1 && ds.x().e()) {
                on.p.H().b(zu.class).z();
            }
            if (this.a == Da.b && !zu.T.ab()) {
                for (r1 r12 : on.p.F().d()) {
                    r12.W();
                }
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
        return this.d();
    }
}

