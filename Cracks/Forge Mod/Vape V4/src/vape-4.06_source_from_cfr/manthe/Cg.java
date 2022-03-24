/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.ej;
import manthe.ex;
import manthe.gS;
import manthe.gb;
import manthe.pf;

public class Cg {
    private final int a;
    private boolean c;
    private double e;
    private gS f;
    private int d;
    private int b;

    public Cg(int n6) {
        this.a = n6;
    }

    public boolean a() {
        return this.c;
    }

    public void c() {
        this.c = false;
        this.e = -999.0;
        this.f = ds.t();
        this.b = 0;
        this.d = 0;
    }

    public void b() {
        this.c = true;
        this.d = this.a;
    }

    public void a(ej ej2) {
        boolean bl;
        boolean bl2;
        double d10 = ej2.aD();
        gS gS2 = ej2.i();
        if (gS2.e() || this.f != null && this.f.d() && !gS2.equals(this.f)) {
            this.c();
            return;
        }
        if (this.c) {
            if (this.d > 0) {
                --this.d;
            } else {
                bl2 = pf.a((ex)ej2);
                if (bl2) {
                    ++this.b;
                    if (this.b >= 5) {
                        this.c();
                        return;
                    }
                    if (!pf.e(ej2) && !pf.b((ex)ej2)) {
                        this.c();
                        return;
                    }
                    this.b();
                } else {
                    this.b = 0;
                    if (pf.a((ex)ej2, 10) == 0) {
                        this.c();
                        return;
                    }
                }
            }
        }
        bl2 = d10 < this.e || ej2.F() == 20;
        gb gb2 = ds.I();
        boolean bl3 = bl = gb2.d() && gb2.h().d() && ej2.aM();
        if (bl2 || bl) {
            this.b();
        }
        this.f = gS2;
        this.e = d10;
    }
}

