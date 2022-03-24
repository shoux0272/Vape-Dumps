/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.uW;
import manthe.wM;
import manthe.wl;

public class wu
extends wM {
    private wl z;

    public wu(String string, pc pc2) {
        this.z = new wl(string, wu.b.m);
        this.z.c(pc2);
        this.a(this.z);
    }

    @Override
    public void a() {
        this.z.c(this.d() + 5.0);
        this.z.a(this.c() + 1.0);
        this.z.b(this.e() - 10.0);
        this.z.d(this.f() - 2.0);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 15.0;
    }
}

