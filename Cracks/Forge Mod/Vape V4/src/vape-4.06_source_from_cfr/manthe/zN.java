/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import java.util.Queue;
import java.util.Random;
import java.util.concurrent.LinkedBlockingDeque;
import manthe.A5;
import manthe.CQ;
import manthe.DF;
import manthe.Dy;
import manthe.Y;
import manthe.ds;
import manthe.e2;
import manthe.eJ;
import manthe.ei;
import manthe.ej;
import manthe.ex;
import manthe.kn;
import manthe.on;
import manthe.pf;
import manthe.y5;
import org.lwjgl.input.Keyboard;

public class zN
extends y5 {
    private final Dy u = Dy.a((Object)this, "Active distance", "#.#", "", 0.0, 1.0, 3.5, 6.0, 0.1, "WTap will function only if targets distance is between these values");
    private final DF A = DF.a((Object)this, "Delay", "#", "", 0.0, 50.0, 1000.0, 1.0);
    private final DF w = DF.a((Object)this, "Post delay", "#", "", 0.0, 200.0, 1000.0, 1.0);
    private Queue<Boolean> v = new LinkedBlockingDeque<Boolean>();
    private boolean z = false;
    private boolean x;
    private Random y = new Random();

    public zN() {
        super("WTap", -5632000, CQ.c);
        this.a(this.u, this.A, this.w);
        this.a(50L, true);
    }

    @Override
    public void a(kn kn2) {
        if (!this.v.isEmpty()) {
            if (ds.x().d()) {
                while (!this.v.isEmpty()) {
                    this.v.poll();
                }
                return;
            }
            ei ei2 = ds.s().j();
            boolean bl = this.v.poll();
            ei.a(ei2.i(), bl);
            ei.a(ei2.i());
        }
    }

    boolean a(eJ eJ2, ex ex2) {
        double d10 = eJ2.a(ex2);
        return d10 < this.u.w() && d10 > this.u.s();
    }

    @Override
    public void q() {
        ei ei2 = ds.s().j();
        eJ eJ2 = ds.k();
        if (ds.x().d()) {
            return;
        }
        if (!eJ2.v()) {
            return;
        }
        ej ej2 = pf.a(this.u.w(), 0.0f);
        if (ej2 == null || ej2.e()) {
            return;
        }
        if (!ej2.a(A5.L)) {
            return;
        }
        e2 e22 = new e2(ej2);
        if (on.p.N().a(e22)) {
            return;
        }
        if (!pf.a(eJ2, e22, 60.0)) {
            return;
        }
        if (this.a(eJ2, e22)) {
            if (this.z) {
                if (Keyboard.isKeyDown((int)17)) {
                    this.v.add(false);
                }
                try {
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    this.v.add(true);
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    this.v.add(false);
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    this.v.add(true);
                    Thread.sleep((long)(this.A.a() + (double)Y.a(this.y, 10, 20)));
                    if (!Keyboard.isKeyDown((int)17)) {
                        this.v.add(false);
                    }
                    Thread.sleep(this.w.a().longValue());
                }
                catch (Exception exception) {
                    // empty catch block
                }
                this.z = false;
            } else if (eJ2.aM()) {
                this.z = true;
            }
        }
    }
}

