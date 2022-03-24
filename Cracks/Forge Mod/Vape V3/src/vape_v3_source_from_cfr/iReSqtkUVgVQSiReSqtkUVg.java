/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import java.awt.Color;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class iReSqtkUVgVQSiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Legit");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Blatant");
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Tower", false, "Builds a tower upwards when you're standing still.");
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Block Count", false, "Renders your block count on\nthe center of your screen.\n(Blatant Only)");
    private iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Stop Motion", false, "Force stops your motion to tower.");
    private iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Stop Sprinting", false, "Stops you from sprinting when scaffolding\nThis is required to bypass AAC/GWEN");
    private iReSqtkUVgkzHiReSqtkUVg h = iReSqtkUVgkzHiReSqtkUVg.a(this, "Delay", "#", "ms", 0.0, 50.0, 500.0, 50.0, "Blatant scaffold place delay.");
    private iReSqtkUVgZyLiReSqtkUVg i = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", "Legit - Automatically shifts at edge of block when backwards (fastbridge)\nBlatant - Automatically place blocks under you (Designed for Hypixel)", this.b, this.b, this.c);
    private iReSqtkUVgPzKiReSqtkUVg j = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgPzKiReSqtkUVg k = new iReSqtkUVgPzKiReSqtkUVg();
    private List<Integer> l = Arrays.asList(0, 6, 8, 9, 10, 11, 23, 25, 26, 27, 28, 30, 31, 32, 37, 38, 39, 40, 46, 51, 52, 65, 66, 116, 83, 85, 84, 92, 96, 103, 120, 131, 132, 137, 145, 171, 102, 160, 101, 78, 79, 174, 145, 146, 147, 148, 149, 150, 151, 152, 154, 54, 50, 14, 15, 16, 21, 73, 74, 163, 72, 70, 71, 64, 63, 69, 75, 76, 77, 143, 138);
    private boolean m;

    public iReSqtkUVgVQSiReSqtkUVg() {
        super("Scaffold", 49630, iReSqtkUVgqTOiReSqtkUVg.f, "Helps you make bridges/scaffold walk.");
        this.d.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.f});
        this.a(this.i, this.d, this.f, this.g, this.h, this.e);
    }

    public boolean x() {
        return this.b() && this.g.i() != false;
    }

    public boolean y() {
        return this.i.i().equals(this.b);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2) {
        if (!this.e.i().booleanValue() || !this.i.i().equals(this.c)) {
            return;
        }
        iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2 = iReSqtkUVgdAbiReSqtkUVg.a(new iReSqtkUVgeLLiReSqtkUVg(), iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
        float f = iReSqtkUVgdAbiReSqtkUVg2.e();
        float f2 = iReSqtkUVgdAbiReSqtkUVg2.f();
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        String string = String.valueOf(this.A());
        int n = new Color(255, 0, 0).getRGB();
        if (this.A() >= 64 && 128 > this.A()) {
            n = new Color(255, 255, 0).getRGB();
        } else if (this.A() >= 128) {
            n = new Color(0, 255, 0).getRGB();
        }
        iReSqtkUVgpeziReSqtkUVg2.a(string, (double)(f / 2.0f - (float)(iReSqtkUVgpeziReSqtkUVg2.a(string) / 2)), (double)(f2 / 2.0f - 12.0f), n);
    }

    @Override
    public void g() {
        iReSqtkUVgFuiiReSqtkUVg.e.r().a(this);
        this.j.b();
    }

    @Override
    public void h() {
        iReSqtkUVgmCeiReSqtkUVg iReSqtkUVgmCeiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i();
        if (this.y() && iReSqtkUVgmCeiReSqtkUVg2.l().f()) {
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgmCeiReSqtkUVg2.l().d(), false);
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgmCeiReSqtkUVg2.l().d());
        }
    }

    @Override
    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (!iReSqtkUVgtlXiReSqtkUVg2.J()) {
            return;
        }
        if (!this.i.i().equals(this.b)) {
            return;
        }
        if (iReSqtkUVgXWziReSqtkUVg2.isPre()) {
            iReSqtkUVgbBTiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg2;
            this.m = iReSqtkUVgtlXiReSqtkUVg2.n().k();
            boolean bl = false;
            boolean bl2 = true;
            if (iReSqtkUVgtlXiReSqtkUVg2.o() > 0.0f && iReSqtkUVgtlXiReSqtkUVg2.aI() == 0.0f) {
                bl2 = false;
            }
            if (bl2) {
                iReSqtkUVgtlXiReSqtkUVg2.n().f(true);
                iReSqtkUVgbBTiReSqtkUVg2 = iReSqtkUVgauSiReSqtkUVg.d() >= 15 ? iReSqtkUVgtlXiReSqtkUVg2.V() : iReSqtkUVgtlXiReSqtkUVg2.V().j();
                if (iReSqtkUVgtlXiReSqtkUVg2.ag().b(iReSqtkUVgtlXiReSqtkUVg2, ((iReSqtkUVgmXTiReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg2).b(-0.2, 0.0, -0.2).d(iReSqtkUVgtlXiReSqtkUVg2.C(), -1.0, iReSqtkUVgtlXiReSqtkUVg2.E())).isEmpty()) {
                    bl = true;
                }
            }
            iReSqtkUVgbBTiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i();
            int n = ((iReSqtkUVgmCeiReSqtkUVg)iReSqtkUVgbBTiReSqtkUVg2).l().d();
            if (bl) {
                iReSqtkUVgqzriReSqtkUVg.a(n, true);
                iReSqtkUVgqzriReSqtkUVg.a(n);
            } else {
                boolean bl3;
                boolean bl4 = bl3 = n > 0 ? Keyboard.isKeyDown((int)n) : Mouse.isButtonDown((int)(100 + n));
                if (this.m && !bl3) {
                    iReSqtkUVgqzriReSqtkUVg.a(n, false);
                    iReSqtkUVgqzriReSqtkUVg.a(n);
                }
            }
        } else {
            iReSqtkUVgtlXiReSqtkUVg2.n().f(this.m);
        }
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgmCeiReSqtkUVg iReSqtkUVgmCeiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i();
        this.a(this.i.i().N());
        if (!this.i.i().equals(this.c)) {
            return;
        }
        iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg2 = new iReSqtkUVgcGbiReSqtkUVg(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() - 1.0, iReSqtkUVgtlXiReSqtkUVg2.B());
        if (iReSqtkUVgTXviReSqtkUVg2.isPre()) {
            iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2;
            if (this.x() && iReSqtkUVgtlXiReSqtkUVg2.N()) {
                iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().r().d(), false);
                iReSqtkUVgtlXiReSqtkUVg2.f(false);
            }
            if ((iReSqtkUVgUjriReSqtkUVg2 = this.e(iReSqtkUVgcGbiReSqtkUVg2)) != null) {
                float[] arrf = this.a(iReSqtkUVgUjriReSqtkUVg2);
                iReSqtkUVgTXviReSqtkUVg2.setRotationYaw(arrf[0]);
                iReSqtkUVgTXviReSqtkUVg2.setRotationPitch(arrf[1]);
            }
            if (this.z()) {
                for (int i = 9; i < 36; ++i) {
                    iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2;
                    if (!iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).f() || !(iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d()).e().a(iReSqtkUVgSzRiReSqtkUVg.ax) || this.l.contains(iReSqtkUVgyetiReSqtkUVg2.e().e()) || iReSqtkUVgVQSiReSqtkUVg.b(iReSqtkUVgyetiReSqtkUVg2)) continue;
                    this.a(i, 7);
                    break;
                }
            }
        } else {
            int n;
            boolean bl;
            boolean bl2 = bl = iReSqtkUVgtlXiReSqtkUVg2.n().i() == 0.0f && iReSqtkUVgtlXiReSqtkUVg2.n().h() == 0.0f;
            if (iReSqtkUVgmCeiReSqtkUVg2.k().f() && this.A() > 0 && this.d.i().booleanValue() && this.f.i().booleanValue()) {
                iReSqtkUVgtlXiReSqtkUVg2.n(iReSqtkUVgtlXiReSqtkUVg2.z());
                iReSqtkUVgtlXiReSqtkUVg2.p(iReSqtkUVgtlXiReSqtkUVg2.B());
                iReSqtkUVgtlXiReSqtkUVg2.k(iReSqtkUVgtlXiReSqtkUVg2.z());
                iReSqtkUVgtlXiReSqtkUVg2.m(iReSqtkUVgtlXiReSqtkUVg2.B());
                iReSqtkUVgtlXiReSqtkUVg2.h(0.0);
                iReSqtkUVgtlXiReSqtkUVg2.j(0.0);
            }
            if (!bl) {
                this.j.b();
            }
            if (!this.b(iReSqtkUVgcGbiReSqtkUVg2).f()) {
                return;
            }
            int n2 = -1;
            for (n = 0; n < 9; ++n) {
                iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg3 = iReSqtkUVgtlXiReSqtkUVg2.aZ().b(n);
                if (!iReSqtkUVgVQSiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg3) || iReSqtkUVgVQSiReSqtkUVg.b(iReSqtkUVgyetiReSqtkUVg3) || !iReSqtkUVgyetiReSqtkUVg3.e().a(iReSqtkUVgSzRiReSqtkUVg.ax) || this.l.contains(iReSqtkUVgyetiReSqtkUVg3.e().e())) continue;
                n2 = n;
            }
            if (n2 == -1) {
                return;
            }
            n = iReSqtkUVgtlXiReSqtkUVg2.aZ().d();
            iReSqtkUVgtlXiReSqtkUVg2.aZ().a(n2);
            if (iReSqtkUVgmCeiReSqtkUVg2.k().f() && this.d.j().booleanValue() && this.A() > 0) {
                if (this.f.i().booleanValue()) {
                    iReSqtkUVgtlXiReSqtkUVg2.h(0.0);
                    iReSqtkUVgtlXiReSqtkUVg2.j(0.0);
                }
                if (iReSqtkUVgtlXiReSqtkUVg2.A() != (double)(iReSqtkUVgcGbiReSqtkUVg2.b() + 1) && this.b(new iReSqtkUVgcGbiReSqtkUVg(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() - 1.0, iReSqtkUVgtlXiReSqtkUVg2.B())) != iReSqtkUVgSxxiReSqtkUVg.d() && bl) {
                    iReSqtkUVgtlXiReSqtkUVg2.i((double)0.42f);
                    iReSqtkUVgtlXiReSqtkUVg2.h(0.0);
                    iReSqtkUVgtlXiReSqtkUVg2.j(0.0);
                    if (this.j.a(1000L)) {
                        iReSqtkUVgtlXiReSqtkUVg2.i(-0.28);
                        this.j.b();
                    }
                }
            }
            if (iReSqtkUVgtlXiReSqtkUVg2.aZ().b(n2).e().a(iReSqtkUVgSzRiReSqtkUVg.ax) && !this.l.contains(iReSqtkUVgtlXiReSqtkUVg2.aZ().b(n2).e().e()) && this.k.a(this.h.i().longValue()) && !iReSqtkUVgtlXiReSqtkUVg2.ag().a(iReSqtkUVgcGbiReSqtkUVg2.a(), iReSqtkUVgcGbiReSqtkUVg2.b(), iReSqtkUVgcGbiReSqtkUVg2.c()).a(iReSqtkUVgSzRiReSqtkUVg.Z)) {
                if (!(this.c(iReSqtkUVgcGbiReSqtkUVg2) || this.c(iReSqtkUVgcGbiReSqtkUVg2.a(1, 0, 0)) || this.c(iReSqtkUVgcGbiReSqtkUVg2.a(0, 0, 1)) || this.c(iReSqtkUVgcGbiReSqtkUVg2.a(-1, 0, 0)))) {
                    this.c(iReSqtkUVgcGbiReSqtkUVg2.a(0, 0, -1));
                }
                this.k.b();
            }
            iReSqtkUVgtlXiReSqtkUVg2.aZ().a(n);
        }
    }

    private void a(int n, int n2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2.ba().e(), n, n2, 2, iReSqtkUVgtlXiReSqtkUVg2);
    }

    private boolean z() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (int i = 36; i < 45; ++i) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2;
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
            if (!iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).f() || !(iReSqtkUVgLUhiReSqtkUVg2 = (iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d()).e()).a(iReSqtkUVgSzRiReSqtkUVg.ax) || this.l.contains(iReSqtkUVgLUhiReSqtkUVg2.e()) || iReSqtkUVgVQSiReSqtkUVg.b(iReSqtkUVgyetiReSqtkUVg2)) continue;
            return false;
        }
        return true;
    }

    private boolean c(iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
        iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() + (double)iReSqtkUVgtlXiReSqtkUVg2.aa(), iReSqtkUVgtlXiReSqtkUVg2.B());
        iReSqtkUVgVwNiReSqtkUVg[] arriReSqtkUVgVwNiReSqtkUVg = iReSqtkUVgVwNiReSqtkUVg.g();
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            iReSqtkUVgSafiReSqtkUVg iReSqtkUVgSafiReSqtkUVg2 = iReSqtkUVgSafiReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg2.a(), iReSqtkUVgcGbiReSqtkUVg2.b(), iReSqtkUVgcGbiReSqtkUVg2.c());
            for (iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg2 : arriReSqtkUVgVwNiReSqtkUVg) {
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg3;
                iReSqtkUVgSafiReSqtkUVg iReSqtkUVgSafiReSqtkUVg3 = iReSqtkUVgSafiReSqtkUVg2.a(iReSqtkUVgVwNiReSqtkUVg2);
                iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg3 = iReSqtkUVgVwNiReSqtkUVg2.e();
                if (!(iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgSafiReSqtkUVg2.e(), iReSqtkUVgSafiReSqtkUVg2.f(), iReSqtkUVgSafiReSqtkUVg2.g()).b(0.5, 0.5, 0.5)) < iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgSafiReSqtkUVg3.e(), iReSqtkUVgSafiReSqtkUVg3.f(), iReSqtkUVgSafiReSqtkUVg3.g()).b(0.5, 0.5, 0.5))) || !this.a(new iReSqtkUVgcGbiReSqtkUVg(iReSqtkUVgSafiReSqtkUVg3.e(), iReSqtkUVgSafiReSqtkUVg3.f(), iReSqtkUVgSafiReSqtkUVg3.g())).a(this.a(iReSqtkUVgSafiReSqtkUVg3), false).booleanValue() || !(iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgSafiReSqtkUVg3.e(), iReSqtkUVgSafiReSqtkUVg3.f(), iReSqtkUVgSafiReSqtkUVg3.g()).b(0.5, 0.5, 0.5).a(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgVwNiReSqtkUVg3.f().e(), iReSqtkUVgVwNiReSqtkUVg3.f().f(), iReSqtkUVgVwNiReSqtkUVg3.f().g()).a(0.5))) <= 18.0)) continue;
                if (iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVguqNiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2.bd(), iReSqtkUVgcGbiReSqtkUVg.a(iReSqtkUVgSafiReSqtkUVg3), iReSqtkUVgVwNiReSqtkUVg3, iReSqtkUVgUjriReSqtkUVg3)) {
                    iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgerYiReSqtkUVg.e());
                    this.k.b();
                }
                return true;
            }
        } else {
            for (iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg4 : arriReSqtkUVgVwNiReSqtkUVg) {
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg4;
                double d2;
                iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg3 = iReSqtkUVgcGbiReSqtkUVg2.a(iReSqtkUVgVwNiReSqtkUVg4);
                iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg5 = iReSqtkUVgVwNiReSqtkUVg4.e();
                double d3 = iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg2.a(), iReSqtkUVgcGbiReSqtkUVg2.b(), iReSqtkUVgcGbiReSqtkUVg2.c()).b(0.5, 0.5, 0.5));
                if (!(d3 < (d2 = iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg3.a(), iReSqtkUVgcGbiReSqtkUVg3.b(), iReSqtkUVgcGbiReSqtkUVg3.c()).b(0.5, 0.5, 0.5)))) || !(iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg4 = iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg3.a(), iReSqtkUVgcGbiReSqtkUVg3.b(), iReSqtkUVgcGbiReSqtkUVg3.c()).b(0.5, 0.5, 0.5).a(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgVwNiReSqtkUVg5.i(), iReSqtkUVgVwNiReSqtkUVg5.j(), iReSqtkUVgVwNiReSqtkUVg5.k()).a(0.5))) <= 18.0)) continue;
                if (iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVguqNiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2.bd(), iReSqtkUVgcGbiReSqtkUVg3, iReSqtkUVgVwNiReSqtkUVg5, iReSqtkUVgUjriReSqtkUVg4)) {
                    iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgerYiReSqtkUVg.e());
                    this.k.b();
                }
                return true;
            }
        }
        return false;
    }

    private iReSqtkUVgUjriReSqtkUVg d(iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2 = iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A() + (double)iReSqtkUVgtlXiReSqtkUVg2.aa(), iReSqtkUVgtlXiReSqtkUVg2.B());
        iReSqtkUVgVwNiReSqtkUVg[] arriReSqtkUVgVwNiReSqtkUVg = iReSqtkUVgVwNiReSqtkUVg.g();
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            iReSqtkUVgSafiReSqtkUVg iReSqtkUVgSafiReSqtkUVg2 = iReSqtkUVgSafiReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg2.a(), iReSqtkUVgcGbiReSqtkUVg2.b(), iReSqtkUVgcGbiReSqtkUVg2.c());
            for (iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg2 : arriReSqtkUVgVwNiReSqtkUVg) {
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg3;
                iReSqtkUVgSafiReSqtkUVg iReSqtkUVgSafiReSqtkUVg3 = iReSqtkUVgSafiReSqtkUVg2.a(iReSqtkUVgVwNiReSqtkUVg2);
                iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg3 = iReSqtkUVgVwNiReSqtkUVg2.e();
                if (!(iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgSafiReSqtkUVg2.e(), iReSqtkUVgSafiReSqtkUVg2.f(), iReSqtkUVgSafiReSqtkUVg2.g()).b(0.5, 0.5, 0.5)) < iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgSafiReSqtkUVg3.e(), iReSqtkUVgSafiReSqtkUVg3.f(), iReSqtkUVgSafiReSqtkUVg3.g()).b(0.5, 0.5, 0.5))) || !this.a(new iReSqtkUVgcGbiReSqtkUVg(iReSqtkUVgSafiReSqtkUVg3.e(), iReSqtkUVgSafiReSqtkUVg3.f(), iReSqtkUVgSafiReSqtkUVg3.g())).a(this.a(iReSqtkUVgSafiReSqtkUVg3), false).booleanValue() || !(iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg3 = iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgSafiReSqtkUVg3.e(), iReSqtkUVgSafiReSqtkUVg3.f(), iReSqtkUVgSafiReSqtkUVg3.g()).b(0.5, 0.5, 0.5).a(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgVwNiReSqtkUVg3.f().e(), iReSqtkUVgVwNiReSqtkUVg3.f().f(), iReSqtkUVgVwNiReSqtkUVg3.f().g()).a(0.5))) <= 18.0)) continue;
                return iReSqtkUVgUjriReSqtkUVg3;
            }
        } else {
            for (iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg4 : arriReSqtkUVgVwNiReSqtkUVg) {
                iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg4;
                double d2;
                iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg3 = iReSqtkUVgcGbiReSqtkUVg2.a(iReSqtkUVgVwNiReSqtkUVg4);
                iReSqtkUVgVwNiReSqtkUVg iReSqtkUVgVwNiReSqtkUVg5 = iReSqtkUVgVwNiReSqtkUVg4.e();
                double d3 = iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg2.a(), iReSqtkUVgcGbiReSqtkUVg2.b(), iReSqtkUVgcGbiReSqtkUVg2.c()).b(0.5, 0.5, 0.5));
                if (!(d3 < (d2 = iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg3.a(), iReSqtkUVgcGbiReSqtkUVg3.b(), iReSqtkUVgcGbiReSqtkUVg3.c()).b(0.5, 0.5, 0.5)))) || !(iReSqtkUVgUjriReSqtkUVg2.c(iReSqtkUVgUjriReSqtkUVg4 = iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgcGbiReSqtkUVg3.a(), iReSqtkUVgcGbiReSqtkUVg3.b(), iReSqtkUVgcGbiReSqtkUVg3.c()).b(0.5, 0.5, 0.5).a(iReSqtkUVgUjriReSqtkUVg.a(iReSqtkUVgVwNiReSqtkUVg5.i(), iReSqtkUVgVwNiReSqtkUVg5.j(), iReSqtkUVgVwNiReSqtkUVg5.k()).a(0.5))) <= 18.0)) continue;
                return iReSqtkUVgUjriReSqtkUVg4;
            }
        }
        return null;
    }

    private iReSqtkUVgUjriReSqtkUVg e(iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg2) {
        iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2 = this.d(iReSqtkUVgcGbiReSqtkUVg2);
        if (iReSqtkUVgUjriReSqtkUVg2 == null && (iReSqtkUVgUjriReSqtkUVg2 = this.d(iReSqtkUVgcGbiReSqtkUVg2.a(1, 0, 0))) == null && (iReSqtkUVgUjriReSqtkUVg2 = this.d(iReSqtkUVgcGbiReSqtkUVg2.a(0, 0, 1))) == null && (iReSqtkUVgUjriReSqtkUVg2 = this.d(iReSqtkUVgcGbiReSqtkUVg2.a(-1, 0, 0))) == null) {
            iReSqtkUVgUjriReSqtkUVg2 = this.d(iReSqtkUVgcGbiReSqtkUVg2.a(0, 0, -1));
        }
        return iReSqtkUVgUjriReSqtkUVg2;
    }

    private float[] a(iReSqtkUVgUjriReSqtkUVg iReSqtkUVgUjriReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d2 = iReSqtkUVgUjriReSqtkUVg2.d() - iReSqtkUVgtlXiReSqtkUVg2.z();
        double d3 = iReSqtkUVgUjriReSqtkUVg2.e() - (iReSqtkUVgtlXiReSqtkUVg2.A() + (double)iReSqtkUVgtlXiReSqtkUVg2.aa());
        double d4 = iReSqtkUVgUjriReSqtkUVg2.f() - iReSqtkUVgtlXiReSqtkUVg2.B();
        double d5 = iReSqtkUVgKexiReSqtkUVg.a(d2 * d2 + d4 * d4);
        float f = (float)Math.toDegrees(Math.atan2(d4, d2)) - 90.0f;
        float f2 = (float)(-Math.toDegrees(Math.atan2(d3, d5)));
        float f3 = iReSqtkUVgtlXiReSqtkUVg2.F() + iReSqtkUVgKexiReSqtkUVg.g(f - iReSqtkUVgtlXiReSqtkUVg2.F());
        float f4 = iReSqtkUVgtlXiReSqtkUVg2.G() + iReSqtkUVgKexiReSqtkUVg.g(f2 - iReSqtkUVgtlXiReSqtkUVg2.G());
        return new float[]{f3, f4};
    }

    public static boolean a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        if (iReSqtkUVgyetiReSqtkUVg2.b() || iReSqtkUVgyetiReSqtkUVg2.e().b()) {
            return false;
        }
        if (iReSqtkUVgyetiReSqtkUVg2.d().equalsIgnoreCase("tile.cactus")) {
            return false;
        }
        return iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.ax);
    }

    private iReSqtkUVgxHxiReSqtkUVg a(iReSqtkUVgSafiReSqtkUVg iReSqtkUVgSafiReSqtkUVg2) {
        return iReSqtkUVgeLLiReSqtkUVg.g().a(iReSqtkUVgSafiReSqtkUVg2);
    }

    public iReSqtkUVgGrkiReSqtkUVg a(iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg2) {
        return iReSqtkUVgeLLiReSqtkUVg.g().a(iReSqtkUVgcGbiReSqtkUVg2.a(), iReSqtkUVgcGbiReSqtkUVg2.b(), iReSqtkUVgcGbiReSqtkUVg2.c());
    }

    public iReSqtkUVgSxxiReSqtkUVg b(iReSqtkUVgcGbiReSqtkUVg iReSqtkUVgcGbiReSqtkUVg2) {
        return this.a(iReSqtkUVgcGbiReSqtkUVg2).e();
    }

    public static boolean b(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        return iReSqtkUVgyetiReSqtkUVg2.b();
    }

    private int A() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        int n = 0;
        for (int i = 0; i < 45; ++i) {
            if (!iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).f()) continue;
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d();
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e();
            if (!iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.ax) || this.l.contains(iReSqtkUVgLUhiReSqtkUVg2.e())) continue;
            n += iReSqtkUVgyetiReSqtkUVg2.j();
        }
        return n;
    }
}

