/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.on;
import manthe.oq;
import manthe.pJ;
import manthe.u9;
import manthe.uV;
import manthe.zu;

public abstract class Aw
implements oq {
    private double e;
    private double c;
    private double h;
    private double d;
    private final String g;
    private final u9 f;
    private final pJ i;
    private final Color b;
    private uV a = new uV();

    public Aw(pJ pJ2, String string, u9 u92, double d10, double d11) {
        this.e = this.h = d10;
        this.c = this.d = d11;
        this.g = string;
        this.f = u92;
        this.i = pJ2;
        this.b = new Color(pJ2.a());
    }

    public String i() {
        return this.g;
    }

    public u9 l() {
        return this.f;
    }

    public pJ j() {
        return this.i;
    }

    @Override
    public double b() {
        double d10 = on.p.j().b(this.g) + 2.0;
        return Math.max(d10, this.f.b());
    }

    @Override
    public double e() {
        return 25.0 + this.f.a();
    }

    @Override
    public double a() {
        return this.e;
    }

    @Override
    public void d(double d10) {
        this.e = d10;
    }

    @Override
    public double h() {
        return this.c;
    }

    @Override
    public void c(double d10) {
        this.c = d10;
    }

    @Override
    public double d() {
        return this.h;
    }

    @Override
    public void a(double d10) {
        this.h = d10;
    }

    @Override
    public double f() {
        return this.d;
    }

    @Override
    public void b(double d10) {
        this.d = d10;
    }

    public Color k() {
        if (!zu.T.ab()) {
            return this.b;
        }
        return Color.WHITE;
    }

    public String m() {
        if (!zu.T.ab()) {
            return "noti_info";
        }
        return this.i.c();
    }
}

