/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

public class iReSqtkUVgzVLiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgCmliReSqtkUVg b;
    private boolean c;
    private iReSqtkUVgkzHiReSqtkUVg d = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Distance", "#.#", "", 0.1, 3.3, 6.0, 1.0);
    private iReSqtkUVgkzHiReSqtkUVg e = iReSqtkUVgkzHiReSqtkUVg.a(this, "Speed", "#.#", "", 0.1, 0.5, 1.0);
    private iReSqtkUVgkzHiReSqtkUVg f = iReSqtkUVgkzHiReSqtkUVg.a(this, "Target minimum angle", "#", "", 1.0, 120.0, 360.0);
    private iReSqtkUVgkzHiReSqtkUVg g = iReSqtkUVgkzHiReSqtkUVg.a(this, "Your minimum angle", "#", "", 1.0, 90.0, 360.0);

    public iReSqtkUVgzVLiReSqtkUVg() {
        super("Strafe", -256, iReSqtkUVgqTOiReSqtkUVg.f);
        this.a(this.d, this.e, this.f, this.g);
        this.a(10L, true);
    }

    @Override
    public void i() {
        this.b = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgCmliReSqtkUVg.class);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (this.c) {
            iReSqtkUVgtlXiReSqtkUVg2.f(false);
            this.c = false;
        }
    }

    @Override
    public void q() {
        double d2;
        if (iReSqtkUVgeLLiReSqtkUVg.f().c()) {
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        int n = iReSqtkUVgeLLiReSqtkUVg.i().h().d();
        boolean bl = Keyboard.isKeyDown((int)n);
        iReSqtkUVgqzriReSqtkUVg.a(n, bl);
        double d3 = this.d.i();
        double d4 = this.e.i() / 5.0;
        d4 *= 0.1;
        boolean bl2 = this.b.b() && this.b.y() != null;
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(this.b.y());
        if (iReSqtkUVgVnKiReSqtkUVg2.b()) {
            return;
        }
        boolean bl3 = iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2, this.f.i() / 2.0);
        boolean bl4 = iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2, this.g.i() / 2.0);
        if (bl2 && bl3 && bl4 && (d2 = (double)iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2)) < d3 && !iReSqtkUVgtlXiReSqtkUVg2.as() && !iReSqtkUVgtlXiReSqtkUVg2.al() && !iReSqtkUVgtlXiReSqtkUVg2.aQ() && iReSqtkUVgtlXiReSqtkUVg2.J() && !iReSqtkUVgtlXiReSqtkUVg2.bj()) {
            double d5 = iReSqtkUVgVnKiReSqtkUVg2.z();
            double d6 = iReSqtkUVgVnKiReSqtkUVg2.B();
            if (iReSqtkUVgtlXiReSqtkUVg2.z() - d5 > 0.5) {
                iReSqtkUVgtlXiReSqtkUVg2.h(iReSqtkUVgtlXiReSqtkUVg2.C() + d4);
            }
            if (iReSqtkUVgtlXiReSqtkUVg2.z() - d5 < 0.5) {
                iReSqtkUVgtlXiReSqtkUVg2.h(iReSqtkUVgtlXiReSqtkUVg2.C() - d4);
            }
            if (iReSqtkUVgtlXiReSqtkUVg2.B() - d6 > 0.5) {
                iReSqtkUVgtlXiReSqtkUVg2.j(iReSqtkUVgtlXiReSqtkUVg2.E() + d4);
            }
            if (iReSqtkUVgtlXiReSqtkUVg2.B() - d6 < 0.5) {
                iReSqtkUVgtlXiReSqtkUVg2.j(iReSqtkUVgtlXiReSqtkUVg2.E() - d4);
            }
            this.c = true;
        }
    }
}

