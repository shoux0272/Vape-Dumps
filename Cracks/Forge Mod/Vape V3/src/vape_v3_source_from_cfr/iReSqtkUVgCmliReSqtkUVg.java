/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class iReSqtkUVgCmliReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private float c = 0.0f;
    private float d = 0.0f;
    private boolean e;
    private int f;
    private int g;
    private float h;
    private float i;
    private float j;
    private float k;
    private boolean l;
    private boolean m;
    private double n;
    private double o;
    private double p;
    private double q;
    private double r;
    private int s;
    private int t;
    private int u = 0;
    private iReSqtkUVgoRmiReSqtkUVg v = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Click Aim", true, "Only aim while mouse is down");
    private iReSqtkUVgoRmiReSqtkUVg w = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Aim Vertically", false, "Aims up and down as well");
    private iReSqtkUVgoRmiReSqtkUVg x = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Invisibles", false, "Aim at invisible entities");
    private iReSqtkUVgoRmiReSqtkUVg y = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Through Blocks", false, "Aim through blocks at entities");
    private iReSqtkUVgoRmiReSqtkUVg z = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Aim while on target", true, "Continue to adjust aim while hovering over target");
    private iReSqtkUVgoRmiReSqtkUVg A = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Strafe increase", false, "Increase speed whiling strafing away from target");
    private iReSqtkUVgoRmiReSqtkUVg B = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Check block break", false, "Prevents from aiming while breaking blocks");
    private iReSqtkUVgoRmiReSqtkUVg C = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Limit to items", false, "AimAssist functions only while holding selected items");
    private iReSqtkUVgeMGiReSqtkUVg D = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "aimassist-alloweditems", "Allowed Items", iReSqtkUVgeMGiReSqtkUVg.a, new iReSqtkUVgDyziReSqtkUVg("swords"));
    private iReSqtkUVgkzHiReSqtkUVg E = iReSqtkUVgkzHiReSqtkUVg.a(this, "Vertical Speed", "#.#", "", 1.0, 5.0, 10.0);
    private iReSqtkUVgkzHiReSqtkUVg F = iReSqtkUVgkzHiReSqtkUVg.a(this, "Horizontal Speed", "#.#", "", 1.0, 5.0, 10.0);
    private iReSqtkUVgkzHiReSqtkUVg G = iReSqtkUVgkzHiReSqtkUVg.a(this, "Max Angle", "#", "", 1.0, 180.0, 360.0, 1.0, "Maximum allowed angle to still aim at target");
    private iReSqtkUVgkzHiReSqtkUVg H = iReSqtkUVgkzHiReSqtkUVg.a(this, "Distance", "#.#", "", 1.0, 5.0, 8.0, 0.1, "Maximum distance allowed to still aim at target");
    private boolean I;
    private float J;
    private float K;
    private float L;
    private float M;
    private int N;
    private int O;
    private double P;
    private boolean Q;
    private iReSqtkUVgjSjiReSqtkUVg R = null;
    private Random S = new Random();
    private Random T = new Random();
    private int U;
    private int V;
    int b = 0;

    public iReSqtkUVgCmliReSqtkUVg() {
        super("AimAssist", -327674, iReSqtkUVgqTOiReSqtkUVg.c, "Smoothly aims to closest valid target");
        this.w.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.E});
        this.C.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.D});
        this.a(this.v, this.x, this.y, this.z, this.A, this.B, this.w, this.E, this.F, this.G, this.H, this.C, this.D);
    }

    private void z() {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b() || iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            return;
        }
        if (!this.D()) {
            this.x();
            return;
        }
        if (this.v.i().booleanValue() && !iReSqtkUVgVUTiReSqtkUVg.a()) {
            this.R = null;
            this.x();
            return;
        }
        if (this.R != null && (iReSqtkUVgrseiReSqtkUVg.a(this.R) || (double)iReSqtkUVgeLLiReSqtkUVg.e().a(this.R) > this.H.i())) {
            this.x();
            this.R = null;
        }
        if (this.v.i().booleanValue() && iReSqtkUVgVUTiReSqtkUVg.a() && this.R == null || !this.v.i().booleanValue()) {
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = this.E();
            if (!this.v.i().booleanValue()) {
                ++this.O;
                if (this.O > 700 || this.R == null) {
                    this.R = iReSqtkUVgVnKiReSqtkUVg2;
                    this.O = 0;
                }
            } else {
                this.R = iReSqtkUVgVnKiReSqtkUVg2;
            }
        }
        if (iReSqtkUVgeLLiReSqtkUVg.g().a() == null) {
            return;
        }
        if (this.R != null && iReSqtkUVgeLLiReSqtkUVg.f().a() == null) {
            this.c(this.Q);
            this.A();
        } else {
            this.x();
        }
    }

    void c(boolean bl) {
        ++this.N;
        if (this.N > 10) {
            this.K = this.J;
            this.M = this.L;
            this.L = 0.0f;
            this.J = 0.0f;
            this.N = 0;
        }
    }

    void x() {
        this.h = 0.0f;
        this.i = 0.0f;
        this.U = 0;
        this.V = 0;
        this.f = 0;
        this.g = 0;
        this.j = 0.0f;
    }

    void a(float f) {
        if (f != 0.0f) {
            f *= 5.0f;
            float f2 = this.E.i().floatValue();
            float f3 = iReSqtkUVgrseiReSqtkUVg.b(iReSqtkUVgeLLiReSqtkUVg.e(), this.R);
            if (f3 <= 10.0f) {
                this.d = f2;
            }
            if (this.d > 0.0f) {
                f2 -= this.d / 3.0f;
                this.d -= f3 / 200.0f;
            }
            float f4 = 1.0f * f2 * f;
            this.i += f4;
        } else {
            this.i = 0.0f;
        }
    }

    void b(float f) {
        if (f != 0.0f) {
            f *= 5.0f;
            float f2 = this.F.i().floatValue();
            float f3 = iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgeLLiReSqtkUVg.e(), this.R);
            if (f3 <= 10.0f) {
                this.c = f2;
            }
            if (this.c > 0.0f) {
                f2 -= this.c / 3.0f;
                this.c -= f3 / 200.0f;
            }
            float f4 = 1.0f * f2 * f;
            this.h += f4;
        } else {
            this.h = 0.0f;
        }
    }

    @Override
    public void a(iReSqtkUVgjuiiReSqtkUVg iReSqtkUVgjuiiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        float f = iReSqtkUVgeLLiReSqtkUVg.i().v();
        this.h += (float)this.f;
        this.i += (float)this.g;
        int n = (int)this.h;
        int n2 = (int)(-this.i);
        float f2 = f * 0.6f + 0.2f;
        float f3 = f2 * f2 * f2 * 8.0f;
        float f4 = (float)n * f3;
        float f5 = (float)n2 * f3;
        this.a(f4, f5);
        this.h = 0.0f;
        this.i = 0.0f;
        this.f = 0;
        this.g = 0;
    }

    private void A() {
        float f;
        this.B();
        this.p = this.n;
        this.q = this.o;
        this.n = this.R.Q();
        this.o = this.R.S();
        double d2 = this.R.z() - this.n;
        double d3 = this.R.B() - this.o;
        if (d2 == 0.0 || d3 == 0.0) {
            d2 = this.R.z() - this.p;
            d3 = this.R.B() - this.q;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d4 = 1.6;
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = iReSqtkUVgrseiReSqtkUVg.a(this.H.i(), -0.15f);
        this.e = false;
        double d5 = iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgtlXiReSqtkUVg2, this.R.z() + d2 * d4, this.R.B() + d3 * d4);
        int n = Math.abs(iReSqtkUVgrseiReSqtkUVg.b(iReSqtkUVgtlXiReSqtkUVg2, this.R)) - 10;
        boolean bl = iReSqtkUVgrseiReSqtkUVg.b(iReSqtkUVgtlXiReSqtkUVg2, this.R.z() + d2 * d4, this.R.B() + d3 * d4);
        float f2 = 1.0f;
        float f3 = 1.0f;
        if (this.e && !this.z.i().booleanValue()) {
            this.x();
            return;
        }
        f2 = (float)((double)f2 + iReSqtkUVgKexiReSqtkUVg.b(this.S, 0.0, 2.0));
        f2 = (float)((double)f2 + d5 / 50.0);
        if (Math.abs(d5 - this.r) > 6.0) {
            f2 = (float)((double)f2 + d5 / 35.0);
        }
        double d6 = (9.0f - iReSqtkUVgtlXiReSqtkUVg2.a(this.R)) / 2.5f - 2.0f;
        d6 = Math.max(0.0, d6);
        f2 = (float)((double)f2 + d6);
        if (this.A.i().booleanValue() && (!bl && iReSqtkUVgtlXiReSqtkUVg2.n().h() > 0.0f || bl && iReSqtkUVgtlXiReSqtkUVg2.n().h() < 0.0f)) {
            f2 = (float)((double)f2 * 1.3);
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.a(this.R) < 0.5f) {
            f2 /= 5.0f;
        }
        float f4 = bl ? -f2 : (f2 /= 90.0f);
        boolean bl2 = iReSqtkUVgrseiReSqtkUVg.c(iReSqtkUVgtlXiReSqtkUVg2, this.R);
        float f5 = f = bl2 ? f3 : -(f3 /= 90.0f);
        if (d5 < 5.0) {
            this.t = 0;
            f4 = 0.0f;
            this.M *= 0.7f;
            if (bl && iReSqtkUVgtlXiReSqtkUVg2.n().h() > 0.0f || !bl && iReSqtkUVgtlXiReSqtkUVg2.n().h() < 0.0f) {
                this.M *= 0.5f;
            }
            if (this.e) {
                f = 0.0f;
                this.K = 0.0f;
            }
        } else {
            ++this.t;
        }
        if (bl != this.l) {
            this.M = -this.M;
            this.L = -this.L;
            this.h = 0.0f;
        }
        if (bl2 != this.m) {
            this.K = -this.K;
            this.J = -this.J;
            this.i = 0.0f;
        }
        if (n < 5) {
            f = 0.0f;
            this.K *= 0.7f;
        }
        this.L += f4;
        this.J += f;
        f4 = this.M;
        f = this.K;
        if (Math.abs(f4) > 10.0f) {
            this.L = 0.0f;
            this.M = 0.0f;
            return;
        }
        float f6 = f4 * 0.15f;
        if (d5 <= 9.0) {
            f6 = (float)((double)f6 / (10.0 - d5));
        }
        boolean bl3 = this.Q = d5 > 5.0;
        if (Float.isNaN(f6)) {
            this.L = 0.0f;
            this.M = 0.0f;
            return;
        }
        this.b(f6);
        if (this.w.i().booleanValue()) {
            float f7 = (float)((double)f * 0.15);
            if (Float.isNaN(f7)) {
                this.J = 0.0f;
                this.K = 0.0f;
                return;
            }
            this.a(f7);
        }
        this.m = bl2;
        this.l = bl;
        ++this.s;
        if (this.s > 10) {
            this.r = d5;
            this.s = 0;
        }
    }

    private void a(float f, float f2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        float f3 = iReSqtkUVgtlXiReSqtkUVg2.G();
        float f4 = iReSqtkUVgtlXiReSqtkUVg2.F();
        iReSqtkUVgtlXiReSqtkUVg2.f((float)((double)iReSqtkUVgtlXiReSqtkUVg2.F() + (double)f * 0.15));
        iReSqtkUVgtlXiReSqtkUVg2.g((float)((double)iReSqtkUVgtlXiReSqtkUVg2.G() - (double)f2 * 0.15));
        if (iReSqtkUVgtlXiReSqtkUVg2.G() < -90.0f) {
            iReSqtkUVgtlXiReSqtkUVg2.g(-90.0f);
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.G() > 90.0f) {
            iReSqtkUVgtlXiReSqtkUVg2.g(90.0f);
        }
        iReSqtkUVgtlXiReSqtkUVg2.i(iReSqtkUVgtlXiReSqtkUVg2.I() + iReSqtkUVgtlXiReSqtkUVg2.G() - f3);
        iReSqtkUVgtlXiReSqtkUVg2.h(iReSqtkUVgtlXiReSqtkUVg2.H() + iReSqtkUVgtlXiReSqtkUVg2.F() - f4);
    }

    private void B() {
        this.P += 1.0;
        if (this.P >= (double)(250 + this.T.nextInt(50))) {
            this.P = iReSqtkUVgKexiReSqtkUVg.b(this.T, -100, -50);
            this.U = iReSqtkUVgKexiReSqtkUVg.b(this.T, -1, 2);
            this.V = iReSqtkUVgKexiReSqtkUVg.b(this.T, -1, 2);
        }
        int n = this.U;
        int n2 = this.V;
        if (this.T.nextInt(10) < 2) {
            // empty if block
        }
        if (this.T.nextInt(10) < 2) {
            // empty if block
        }
        if (this.T.nextInt(10) < 2) {
            n = 0;
        }
        if (this.T.nextInt(10) < 2) {
            n2 = 0;
        }
        if (this.P < 0.0) {
            n = 0;
            n2 = 0;
        }
        if (this.T.nextInt(20) == 1) {
            this.f += n;
            this.g += n2;
        }
        if (this.h > 0.0f && this.f < 0 || this.h < 0.0f && this.f > 0) {
            this.f = 0;
        }
    }

    private boolean C() {
        if (!this.C.i().booleanValue()) {
            return true;
        }
        iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().bd();
        if (iReSqtkUVgyetiReSqtkUVg2.b()) {
            return false;
        }
        iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e();
        if (iReSqtkUVgLUhiReSqtkUVg2.b()) {
            return false;
        }
        return this.D.a(iReSqtkUVgyetiReSqtkUVg2, true);
    }

    private boolean D() {
        if (iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            return false;
        }
        if (this.B.i().booleanValue()) {
            if (iReSqtkUVgeLLiReSqtkUVg.k().i()) {
                this.b = 250;
                return false;
            }
            if (this.b > 0) {
                --this.b;
            }
            if (this.b > 0) {
                return false;
            }
        }
        return this.C();
    }

    private iReSqtkUVgVnKiReSqtkUVg E() {
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = null;
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d2 = 360.0;
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().e()) {
            double d3;
            iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2;
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg3;
            if (!iReSqtkUVgFuiiReSqtkUVg.e.r().a(new iReSqtkUVgjSjiReSqtkUVg(e), this.x.i() == false) || (double)iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg3 = new iReSqtkUVgVnKiReSqtkUVg(e)) > this.H.i() || !iReSqtkUVgtlXiReSqtkUVg2.b(iReSqtkUVgVnKiReSqtkUVg3) && !this.y.i().booleanValue() || (iReSqtkUVgMWviReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.j().c(iReSqtkUVgVnKiReSqtkUVg3.x())) != null && !iReSqtkUVgMWviReSqtkUVg2.d() || !((d3 = (double)iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg3)) < d2) || !(d3 <= this.G.i() / 2.0)) continue;
            d2 = d3;
            iReSqtkUVgVnKiReSqtkUVg2 = iReSqtkUVgVnKiReSqtkUVg3;
        }
        return iReSqtkUVgVnKiReSqtkUVg2;
    }

    public iReSqtkUVgjSjiReSqtkUVg y() {
        return this.R;
    }

    @Override
    public void g() {
        if (!this.I) {
            this.I = true;
            new iReSqtkUVgIgBiReSqtkUVg(this).start();
        }
    }

    static /* synthetic */ void a(iReSqtkUVgCmliReSqtkUVg iReSqtkUVgCmliReSqtkUVg2) {
        iReSqtkUVgCmliReSqtkUVg2.z();
    }
}

