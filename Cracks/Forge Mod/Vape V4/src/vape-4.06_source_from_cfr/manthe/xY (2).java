/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import manthe.AV;
import manthe.Df;
import manthe.g;
import manthe.i;
import manthe.mq;
import manthe.nP;
import manthe.on;
import manthe.pe;
import manthe.uW;
import manthe.wM;
import manthe.wW;
import manthe.wl;
import manthe.yI;

public class xY
extends wM {
    private AV G;
    private List<String> A;
    private String D;
    private boolean E;
    private g F;
    private i z;
    private wl C;
    private wW H;
    private double B;

    public xY(AV aV) {
        this.F = new g(0.15, xY.b.m, xY.b.y);
        this.z = new i(0.15, 0.0, 16.0);
        this.C = new wl("Download", 0.7, xY.b.i);
        this.H = new wW("newcopy", 0.8, xY.b.i);
        this.G = aV;
        long l = ChronoUnit.DAYS.between(new Date(aV.t()).toInstant(), new Date().toInstant());
        this.D = l < 1L ? "<1d" : (l > 99L ? ">99d" : l + "d");
        if (on.p.l().a(aV.l()) != null) {
            this.C.b("Update");
        }
        this.C.a(xY.b.m);
        this.H.a(xY.b.m);
        this.C.c(new nP(this, aV));
        this.C.a("Download this profile");
        this.H.c(new Df(this, aV));
        this.H.a("Copy this profiles UUID");
        this.a(this.C, this.H);
    }

    @Override
    public void a() {
        double d10;
        mq mq2 = this.e(0.8);
        mq mq3 = this.e(0.7);
        double d11 = 6.0;
        this.B = this.c() + this.f() - 15.0 - this.z.o();
        pe.a(this.d() + 1.0, this.c() + 1.0, this.e() - 2.0, this.f() - 2.0, this.F.q());
        pe.a(this.d() + 1.5, this.c() + 1.5, this.e() - 3.0, this.f() - 3.0, xY.b.m);
        if (this.z.o().doubleValue() != this.z.n()) {
            this.C.a(false);
            this.H.a(false);
            d10 = this.B + d11 / 4.0;
            double d12 = (this.e() - 3.0) / 2.0;
            String string = "" + this.G.m();
            double d13 = this.d() + 10.0 + d11 / 2.0;
            pe.a("newdownload", d13, d10, d11, d11, xY.b.s);
            mq3.a(string, d13 += d11 / 2.0, this.B, xY.b.s);
            mq3.b("|", this.d() + d12, this.B, xY.b.s);
            double d14 = this.d() + d12 + 5.0 + d11;
            pe.a("newlastupdate", d14, d10, d11, d11, xY.b.s);
            mq3.a(this.D, d14 += 6.0, this.B, xY.b.s);
        }
        if (this.z.o().doubleValue() != this.z.p()) {
            this.C.a(true);
            this.H.a(true);
            d10 = (this.e() - 20.0) / 11.0;
            this.C.c(this.d() + 7.5);
            this.C.a(this.B + 20.0 - 4.0 - 10.0);
            this.C.d(16.0);
            this.C.b(d10 * 8.0);
            this.H.c(this.d() + 12.5 + this.C.e());
            this.H.a(this.B + 20.0 - 4.0 - 10.0);
            this.H.d(16.0);
            this.H.b(d10 * 3.0);
        }
        if (this.A == null) {
            this.A = this.a(mq2, this.G.r(), new ArrayList<String>());
            StringBuilder stringBuilder = new StringBuilder();
            for (String string : this.A) {
                stringBuilder.append(string.replaceAll("\n", ""));
            }
        }
        double d15 = this.c() + 15.0;
        for (String string : this.A) {
            mq2.a(string, this.d() + 10.0, d15, this.E ? xY.b.c : xY.b.r);
            d15 += mq2.a(string) + 5.0;
        }
    }

    private List<String> a(mq mq2, String string, List<String> list) {
        if (list.size() >= 3) {
            list.set(2, list.get(2) + "...");
            return list;
        }
        if (mq2.b(string) < this.e() - 20.0) {
            list.add(string);
            return list;
        }
        StringBuilder stringBuilder = new StringBuilder();
        if (string.contains(" ")) {
            for (String string2 : string.split(" ")) {
                string2 = string2 + " ";
                StringBuilder stringBuilder2 = new StringBuilder();
                if (mq2.b(stringBuilder2.append(stringBuilder.toString()).append(string2).toString()) > this.e() - 20.0) {
                    list.add(stringBuilder.toString());
                    return this.a(mq2, string.substring(string.indexOf(stringBuilder.toString()) + stringBuilder.length()), list);
                }
                stringBuilder.append(string2);
            }
        } else {
            for (byte by : string.getBytes()) {
                String string3 = new String(new byte[]{by});
                StringBuilder stringBuilder3 = new StringBuilder();
                if (mq2.b(stringBuilder3.append(stringBuilder.toString()).append(string3).toString()) > this.e() - 20.0) {
                    list.add(stringBuilder.toString());
                    return this.a(mq2, string.substring(string.indexOf(stringBuilder.toString()) + stringBuilder.length()), list);
                }
                stringBuilder.append(string3);
            }
        }
        return list;
    }

    @Override
    public void C() {
        super.C();
        if (this.z.o().doubleValue() != this.z.n() && this.z.o().doubleValue() != this.z.p()) {
            double d10 = this.z.o() / 16.0;
            Color color = yI.a(xY.b.m, (int)(255.0 * d10));
            pe.c(this.d() + 2.0, this.B - 5.0, this.e() - 4.0, 12.0, color);
            color = yI.a(xY.b.m, (int)(255.0 * (1.0 - d10)));
            pe.c(this.d() + 2.0, this.C.c(), this.e() - 4.0, this.C.f(), color);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
        if (this.E && !this.x()) {
            this.F.c();
            this.z.c();
            this.E = false;
        }
    }

    @Override
    public void i() {
        if (!this.E) {
            this.F.c();
            this.z.c();
        }
        this.E = true;
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public double g() {
        return 68.75;
    }

    @Override
    public double h() {
        return 73.33333333333333;
    }
}

