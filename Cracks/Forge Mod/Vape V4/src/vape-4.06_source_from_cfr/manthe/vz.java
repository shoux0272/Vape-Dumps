/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import manthe.A5;
import manthe.I;
import manthe.J;
import manthe.ds;
import manthe.ei;
import manthe.en;
import manthe.gb;
import manthe.on;
import manthe.u5;
import manthe.yq;
import manthe.zp;
import org.lwjgl.input.Keyboard;

class vz
extends Thread {
    private boolean e;
    private boolean a;
    private boolean c;
    private boolean d;
    private zp b;

    public vz(zp zp2) {
        this.b = zp2;
    }

    @Override
    public void run() {
        this.b();
    }

    private void b() {
        try {
            gb gb2;
            en en2 = ds.s();
            if (this.b.u.u().booleanValue()) {
                ei.a(en2.j().i(), false);
                ei.a(en2.j().i());
                ei.a(en2.A().i(), false);
                ei.a(en2.A().i());
                ei.a(en2.g().i(), false);
                ei.a(en2.g().i());
                ei.a(en2.n().i(), false);
                ei.a(en2.n().i());
            }
            float[] arrf = this.b.a(zp.a(this.b));
            J j10 = new J(arrf[0], arrf[1]);
            j10.b(this.b.w.a().intValue());
            yq.u.a(j10);
            int n6 = 0;
            while (!j10.e()) {
                Thread.sleep(10L);
                if (++n6 <= 100) continue;
                this.a();
                return;
            }
            for (int k = 0; k < 100; ++k) {
                gb gb3 = ds.I();
                if (gb3.h().d() && gb3.h().a(A5.dG)) {
                    yq.u.a((I)null);
                    break;
                }
                Thread.sleep(1L);
            }
            if ((gb2 = ds.I()).h().d() && gb2.h().a(A5.dG)) {
                u5.a();
                Thread.sleep(51L);
                u5.d();
                Thread.sleep(10L);
            }
            if (this.b.u.u().booleanValue() && this.b.B.u().booleanValue()) {
                ei.a(en2.j().i(), Keyboard.isKeyDown((int)en2.j().i()));
                ei.a(en2.j().i());
                ei.a(en2.A().i(), Keyboard.isKeyDown((int)en2.A().i()));
                ei.a(en2.A().i());
                ei.a(en2.g().i(), Keyboard.isKeyDown((int)en2.g().i()));
                ei.a(en2.g().i());
                ei.a(en2.n().i(), Keyboard.isKeyDown((int)en2.n().i()));
                ei.a(en2.n().i());
            }
            zp.b(this.b).d();
        }
        catch (Exception exception) {
            on.a(exception);
        }
        this.a();
    }

    private void a() {
        zp.a(this.b, null);
        zp.e(false);
    }
}

