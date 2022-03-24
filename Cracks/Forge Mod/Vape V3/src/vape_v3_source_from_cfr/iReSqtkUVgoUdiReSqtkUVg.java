/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgoUdiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private double b;
    private double c;
    private boolean d;
    private boolean e;
    private iReSqtkUVgkzHiReSqtkUVg f = iReSqtkUVgkzHiReSqtkUVg.a(this, "Boost", "#.#", "", 3.0, 4.1, 5.0);
    private iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Toggle", true, "Toggles off after touching the ground.");

    public iReSqtkUVgoUdiReSqtkUVg() {
        super("LongJump", 16028225, iReSqtkUVgqTOiReSqtkUVg.f, "Do a jump that's long.");
        this.a(this.f, this.g);
        this.b = 0.27999999999999997;
        this.e = false;
        this.c = 0.0;
    }

    @Override
    public void g() {
        iReSqtkUVgFuiiReSqtkUVg.e.r().a(this);
        this.b = 0.27999999999999997;
        this.e = false;
        this.c = 0.0;
        this.d = false;
    }

    @Override
    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
        if (!iReSqtkUVgXWziReSqtkUVg2.isPre()) {
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.o() == 0.0f && iReSqtkUVgtlXiReSqtkUVg2.aI() == 0.0f || iReSqtkUVgtlXiReSqtkUVg2.ag().b() || iReSqtkUVgtlXiReSqtkUVg2.as()) {
            this.b = 0.27999999999999997;
            return;
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.am()) {
            if (this.e || iReSqtkUVgtlXiReSqtkUVg2.D() < -0.3) {
                this.b *= 2.15 - 1.0 / Math.pow(10.0, 5.0);
                iReSqtkUVgtlXiReSqtkUVg2.i(0.4128938479875198);
                iReSqtkUVgXWziReSqtkUVg2.setY(0.4128938479875198);
                iReSqtkUVgtlXiReSqtkUVg2.g(true);
            } else {
                this.b = this.f.i() * 0.27999999999999997;
            }
        } else if (this.e) {
            if (this.c < 2.147) {
                this.c = 2.147;
            }
            this.b = this.c - 0.66 * (this.c - 0.27999999999999997);
        } else {
            this.b = this.c - this.c / 155.0;
        }
        this.e = iReSqtkUVgtlXiReSqtkUVg2.am();
        this.b = Math.max(this.b, 0.27999999999999997);
        iReSqtkUVgXWziReSqtkUVg2.setX(-(Math.sin(this.a(iReSqtkUVgtlXiReSqtkUVg2)) * this.b));
        iReSqtkUVgXWziReSqtkUVg2.setZ(Math.cos(this.a(iReSqtkUVgtlXiReSqtkUVg2)) * this.b);
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        if (iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            this.c = Math.hypot(iReSqtkUVgtlXiReSqtkUVg2.z() - iReSqtkUVgtlXiReSqtkUVg2.ay(), iReSqtkUVgtlXiReSqtkUVg2.B() - iReSqtkUVgtlXiReSqtkUVg2.aA());
            if (this.g.i().booleanValue()) {
                if (!this.e && iReSqtkUVgtlXiReSqtkUVg2.am() && this.d) {
                    this.a();
                }
                if (!this.d && this.b(iReSqtkUVgtlXiReSqtkUVg2)) {
                    this.d = true;
                }
            }
        }
    }

    private float a(iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2) {
        float f = iReSqtkUVgtlXiReSqtkUVg2.F();
        if (iReSqtkUVgtlXiReSqtkUVg2.o() < 0.0f) {
            f += 180.0f;
        }
        float f2 = iReSqtkUVgtlXiReSqtkUVg2.o() < 0.0f ? -0.5f : (iReSqtkUVgtlXiReSqtkUVg2.o() > 0.0f ? 0.5f : 1.0f);
        if (iReSqtkUVgtlXiReSqtkUVg2.aI() > 0.0f) {
            f -= 90.0f * f2;
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.aI() < 0.0f) {
            f += 90.0f * f2;
        }
        return f *= (float)Math.PI / 180;
    }

    private boolean b(iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2) {
        iReSqtkUVgmCeiReSqtkUVg iReSqtkUVgmCeiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i();
        return iReSqtkUVgmCeiReSqtkUVg2.g().f() || iReSqtkUVgmCeiReSqtkUVg2.h().f() || iReSqtkUVgmCeiReSqtkUVg2.i().f() || iReSqtkUVgmCeiReSqtkUVg2.j().f() || iReSqtkUVgtlXiReSqtkUVg2.n().i() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.n().h() != 0.0f;
    }
}

