/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.e7;
import manthe.et;
import manthe.gz;

public class nx {
    private static final nx d = new nx();
    private boolean c;
    public et a;
    public boolean e;
    private static final int b = 18;

    public void f() {
        if (this.c) {
            return;
        }
        if (ds.s().w() > 0 || !ds.s().z()) {
            return;
        }
        this.e = ds.s().f();
        if (this.e) {
            ds.s().d(false);
            ds.w().a(ds.F(), ds.H());
            if (!ds.M().e()) {
                ds.M().a(ds.F(), ds.H());
            }
            ds.G().f();
        }
        this.e();
        this.c = true;
    }

    private void e() {
        this.a = et.a(ds.l(), ds.M().i(), ds.w(), new gz(e7.j()[18]));
        ds.M().a(this.a);
        this.a.a(ds.F(), ds.H());
        ds.M().c(true);
    }

    public void a() {
        if (!this.c) {
            return;
        }
        if (ds.s().w() > 0 || !ds.s().z()) {
            return;
        }
        if (this.e) {
            ds.w().a(ds.F(), ds.H());
            if (!ds.M().e()) {
                ds.M().a(ds.F(), ds.H());
            }
            ds.G().f();
            ds.s().d(true);
        }
        ds.M().c(false);
        ds.M().a(new et(null));
        this.a = null;
        this.c = false;
    }

    public void b() {
        this.a();
    }

    public void d() {
    }

    public static nx c() {
        return d;
    }
}

