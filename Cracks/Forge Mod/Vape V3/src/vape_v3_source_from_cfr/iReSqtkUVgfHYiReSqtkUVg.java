/*
 * Decompiled with CFR 0.150.
 */
import a.a;
import java.util.Random;

public class iReSqtkUVgfHYiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Only when targeting", false, "Only reduce knockback while being face to face with opponent");
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Water check", false, "Won't reduce knockback if in water");
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Kite mode", false, "Increases knockback while not facing opponent");
    private iReSqtkUVgkzHiReSqtkUVg e = iReSqtkUVgkzHiReSqtkUVg.a(this, "Horizontal", "#", "%", 0.0, 90.0, 100.0);
    private iReSqtkUVgkzHiReSqtkUVg f = iReSqtkUVgkzHiReSqtkUVg.a(this, "Vertical", "#", "%", 0.0, 100.0, 100.0);
    private iReSqtkUVgkzHiReSqtkUVg g = iReSqtkUVgkzHiReSqtkUVg.a(this, "Chance", "#", "%", 0.0, 90.0, 100.0);
    private iReSqtkUVgkzHiReSqtkUVg h = iReSqtkUVgkzHiReSqtkUVg.a(this, "Kite horizontal", "#", "%", 100.0, 120.0, 300.0);
    private iReSqtkUVgkzHiReSqtkUVg i = iReSqtkUVgkzHiReSqtkUVg.a(this, "Kite vertical", "#", "%", 100.0, 120.0, 300.0);
    private float j = -999.0f;
    private iReSqtkUVggvziReSqtkUVg k;
    private iReSqtkUVgtlXiReSqtkUVg l;

    public iReSqtkUVgfHYiReSqtkUVg() {
        super("Velocity", -65404, iReSqtkUVgqTOiReSqtkUVg.c, "Reduces knockback taken");
        this.d.a(this.h, this.i);
        this.a(this.e, this.f, this.g, this.b, this.c, this.d, this.h, this.i);
    }

    private boolean x() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.b()) {
            return false;
        }
        return this.c.i() == false || !iReSqtkUVgtlXiReSqtkUVg2.as();
    }

    @Override
    public void a(iReSqtkUVgaWmiReSqtkUVg iReSqtkUVgaWmiReSqtkUVg2) {
        if (!this.x()) {
            return;
        }
        try {
            double d2;
            double d3;
            double d4;
            double d5;
            double d6;
            double d7;
            double d8;
            double d9;
            double d10;
            int n;
            double d11;
            Random random;
            boolean bl;
            boolean bl2;
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2;
            iReSqtkUVghnHiReSqtkUVg iReSqtkUVghnHiReSqtkUVg2;
            if (iReSqtkUVgaWmiReSqtkUVg2.getPacketInstance() == null) {
                return;
            }
            iReSqtkUVghnHiReSqtkUVg iReSqtkUVghnHiReSqtkUVg3 = iReSqtkUVgaWmiReSqtkUVg2.getPacket();
            if (iReSqtkUVghnHiReSqtkUVg3.a(iReSqtkUVgSzRiReSqtkUVg.cy)) {
                iReSqtkUVghnHiReSqtkUVg2 = new iReSqtkUVgfkHiReSqtkUVg(iReSqtkUVghnHiReSqtkUVg3);
                iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
                bl2 = iReSqtkUVgrseiReSqtkUVg.d(iReSqtkUVgtlXiReSqtkUVg2);
                bl = iReSqtkUVgrseiReSqtkUVg.e(iReSqtkUVgtlXiReSqtkUVg2);
                if (!bl2 && !bl && !this.d.i().booleanValue() && this.b.i().booleanValue()) {
                    return;
                }
                random = new Random();
                d11 = random.nextDouble();
                n = iReSqtkUVgKexiReSqtkUVg.b(random, 0, 100);
                if ((double)n > 100.0 - this.g.i()) {
                    d10 = ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).e();
                    d9 = ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).f();
                    d8 = ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).g();
                    if (bl2 && !bl && this.d.i().booleanValue()) {
                        double d12 = this.h.i() / 100.0;
                        double d13 = this.i.i() / 100.0;
                        double d14 = this.a(d10, d12);
                        double d15 = this.a(d9, d13);
                        double d16 = this.a(d8, d12);
                        ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).a((float)d14);
                        ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).b((float)d15);
                        ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).c((float)d16);
                        return;
                    }
                    d7 = this.e.i();
                    d6 = d7 + (d7 + 5.0 - d7) * d11;
                    if (d6 >= 100.0) {
                        d6 = 100.0;
                    }
                    if ((d5 = (d4 = this.f.i().doubleValue()) + (d4 + 5.0 - d4) * d11) >= 90.0) {
                        d5 = 100.0;
                    }
                    d3 = d6 / 100.0;
                    d2 = d5 / 100.0;
                    double d17 = this.a(d10, d3);
                    double d18 = this.a(d9, d2);
                    double d19 = this.a(d8, d3);
                    ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).a((float)d17);
                    ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).b((float)d18);
                    ((iReSqtkUVgfkHiReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).c((float)d19);
                    if (d7 == 0.0 && d4 == 0.0) {
                        iReSqtkUVgaWmiReSqtkUVg2.setCanceled(true);
                    }
                }
            }
            if (iReSqtkUVghnHiReSqtkUVg3.a(iReSqtkUVgSzRiReSqtkUVg.cz)) {
                iReSqtkUVghnHiReSqtkUVg2 = new iReSqtkUVgTfviReSqtkUVg(iReSqtkUVghnHiReSqtkUVg3);
                iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
                if (iReSqtkUVgtlXiReSqtkUVg2.b()) {
                    return;
                }
                if (((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).e() == iReSqtkUVgtlXiReSqtkUVg2.y()) {
                    bl2 = iReSqtkUVgrseiReSqtkUVg.d(iReSqtkUVgtlXiReSqtkUVg2);
                    bl = iReSqtkUVgrseiReSqtkUVg.e(iReSqtkUVgtlXiReSqtkUVg2);
                    if (!bl2 && !bl && !this.d.i().booleanValue() && this.b.i().booleanValue()) {
                        return;
                    }
                    random = new Random();
                    d11 = random.nextDouble();
                    n = iReSqtkUVgKexiReSqtkUVg.b(random, 0, 100);
                    if ((double)n > 100.0 - this.g.i()) {
                        d10 = ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).f();
                        d9 = ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).g();
                        d8 = ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).h();
                        if (bl2 && !bl && this.d.i().booleanValue()) {
                            d7 = this.h.i() / 100.0;
                            d6 = this.i.i() / 100.0;
                            int n2 = (int)(d10 * d7);
                            int n3 = (int)(d9 * d6);
                            int n4 = (int)(d8 * d7);
                            ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).a(n2);
                            ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).b(n3);
                            ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).c(n4);
                            return;
                        }
                        d7 = this.e.i();
                        d6 = d7 + (d7 + 5.0 - d7) * d11;
                        if (d6 >= 100.0) {
                            d6 = 100.0;
                        }
                        if ((d5 = (d4 = this.f.i().doubleValue()) + (d4 + 5.0 - d4) * d11) >= 90.0) {
                            d5 = 100.0;
                        }
                        d3 = d6 / 100.0;
                        d2 = d5 / 100.0;
                        int n5 = (int)(d10 * d3);
                        int n6 = (int)(d9 * d2);
                        int n7 = (int)(d8 * d3);
                        ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).a(n5);
                        ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).b(n6);
                        ((iReSqtkUVgTfviReSqtkUVg)iReSqtkUVghnHiReSqtkUVg2).c(n7);
                        if (d7 == 0.0 && d4 == 0.0) {
                            iReSqtkUVgaWmiReSqtkUVg2.setCanceled(true);
                        }
                    }
                }
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void a(iReSqtkUVgXsFiReSqtkUVg iReSqtkUVgXsFiReSqtkUVg2) {
        if (!this.x()) {
            return;
        }
        if (a.a.ib()) {
            return;
        }
        if (this.k == null || !this.k.equals(iReSqtkUVgeLLiReSqtkUVg.g())) {
            this.k = iReSqtkUVgeLLiReSqtkUVg.g();
            this.j = -999.0f;
            return;
        }
        if (this.l == null || !this.l.equals(iReSqtkUVgeLLiReSqtkUVg.e())) {
            this.l = iReSqtkUVgeLLiReSqtkUVg.e();
            this.j = -999.0f;
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgXsFiReSqtkUVg2.a().equals(iReSqtkUVgtlXiReSqtkUVg2)) {
            boolean bl = iReSqtkUVgrseiReSqtkUVg.d(iReSqtkUVgtlXiReSqtkUVg2);
            boolean bl2 = iReSqtkUVgrseiReSqtkUVg.e(iReSqtkUVgtlXiReSqtkUVg2);
            float f = iReSqtkUVgtlXiReSqtkUVg2.aF();
            if (this.j == -999.0f || f > this.j) {
                this.j = f;
            } else if (f < this.j && (iReSqtkUVgtlXiReSqtkUVg2.C() != 0.0 || iReSqtkUVgtlXiReSqtkUVg2.D() != 0.0 || iReSqtkUVgtlXiReSqtkUVg2.E() != 0.0)) {
                this.j = f;
                if (!bl && !bl2 && !this.d.i().booleanValue() && this.b.i().booleanValue()) {
                    return;
                }
                Random random = new Random();
                double d2 = random.nextDouble();
                int n = random.nextInt(100);
                if ((double)n > 100.0 - this.g.i()) {
                    double d3;
                    double d4;
                    if (bl && !bl2 && this.d.i().booleanValue()) {
                        double d5 = this.h.i() / 100.0;
                        double d6 = this.i.i() / 100.0;
                        iReSqtkUVgtlXiReSqtkUVg2.h(this.a(iReSqtkUVgtlXiReSqtkUVg2.C(), d5));
                        iReSqtkUVgtlXiReSqtkUVg2.i(this.a(iReSqtkUVgtlXiReSqtkUVg2.D(), d6));
                        iReSqtkUVgtlXiReSqtkUVg2.j(this.a(iReSqtkUVgtlXiReSqtkUVg2.E(), d5));
                        return;
                    }
                    double d7 = this.e.i();
                    double d8 = d7 + (d7 + 5.0 - d7) * d2;
                    if (d8 >= 100.0) {
                        d8 = 100.0;
                    }
                    if ((d4 = (d3 = this.f.i().doubleValue()) + (d3 + 5.0 - d3) * d2) >= 90.0) {
                        d4 = 100.0;
                    }
                    double d9 = d8 / 100.0;
                    double d10 = d4 / 100.0;
                    iReSqtkUVgtlXiReSqtkUVg2.h(this.a(iReSqtkUVgtlXiReSqtkUVg2.C(), d9));
                    iReSqtkUVgtlXiReSqtkUVg2.i(this.a(iReSqtkUVgtlXiReSqtkUVg2.D(), d10));
                    iReSqtkUVgtlXiReSqtkUVg2.j(this.a(iReSqtkUVgtlXiReSqtkUVg2.E(), d9));
                    if (d7 <= 1.0) {
                        iReSqtkUVgtlXiReSqtkUVg2.h(0.0);
                        iReSqtkUVgtlXiReSqtkUVg2.j(0.0);
                    }
                    if (d3 <= 1.0) {
                        iReSqtkUVgtlXiReSqtkUVg2.i(0.0);
                    }
                }
            }
        }
    }

    private double a(double d2, double d3) {
        String string = Double.toString(Math.abs(d2));
        String string2 = string.contains(",") ? "," : ".";
        int n = string.indexOf(string2);
        int n2 = string.length() - n - 1;
        iReSqtkUVgLcXiReSqtkUVg iReSqtkUVgLcXiReSqtkUVg2 = new iReSqtkUVgLcXiReSqtkUVg(n2);
        return iReSqtkUVgLcXiReSqtkUVg2.a(d2 * d3);
    }
}

