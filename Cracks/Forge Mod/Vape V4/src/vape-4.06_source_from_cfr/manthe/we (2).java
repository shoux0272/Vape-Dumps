/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.input.Mouse
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import manthe.Bo;
import manthe.Dj;
import manthe.c2;
import manthe.d0;
import manthe.ds;
import manthe.o7;
import manthe.uW;
import manthe.vh;
import manthe.wB;
import manthe.wM;
import manthe.wR;
import manthe.wc;
import manthe.wl;
import manthe.ws;
import manthe.zu;
import org.lwjgl.input.Mouse;

public abstract class we
extends wc
implements Dj {
    private boolean Q;
    private Bo O;
    protected boolean R;
    protected boolean P = true;
    private boolean M;
    private boolean N = true;
    private List<we> S;
    private wl U = new wl("Frame", this.I());
    private static String[] T;

    public we() {
        this.U.c(new vh(this));
        this.U.d(10.0);
    }

    public abstract String ad();

    @Override
    public void a() {
        if (!this.b()) {
            return;
        }
        this.ah();
        super.a();
        if (this.Y() != null && this.U.b()) {
            this.U.b(this.ad());
            this.U.b(this.U.e() + 10.0);
            d0 d02 = ds.p();
            this.U.c(this.g(d02));
            this.U.a(this.f(d02));
        }
    }

    @Override
    public void k() {
        if (!this.ai()) {
            return;
        }
        super.k();
    }

    @Override
    public void a(uW uW2) {
        if (this.Y() == null || !this.b()) {
            return;
        }
        if (this.P && uW2.c().equals((Object)c2.LEFT_CLICK) && this.Y().q().b(uW2.a(), uW2.b())) {
            this.O = o7.b();
            this.R = true;
            this.h(false);
        }
    }

    @Override
    public void S() {
    }

    @Override
    public double g() {
        return this.W().d();
    }

    @Override
    public double h() {
        return this.W().c();
    }

    private void ah() {
        if (!this.R || this.M) {
            return;
        }
        if (!Mouse.isButtonDown((int)c2.LEFT_CLICK.ordinal())) {
            this.R = false;
            this.h(true);
            this.M();
            return;
        }
        Bo bo2 = o7.b();
        double d10 = bo2.a - this.O.a;
        double d11 = bo2.b - this.O.b;
        this.O = bo2;
        this.b(d10, d11);
    }

    private void b(double d10, double d11) {
        this.c(this.d() + d10);
        this.a(this.c() + d11);
        for (wM wM2 : this.w()) {
            wM2.c(wM2.d() + d10);
            wM2.a(wM2.c() + d11);
            if (!(wM2 instanceof we)) continue;
            ((we)wM2).b(d10, d11);
        }
    }

    public void a(double d10, double d11) {
        this.c(d10);
        this.a(d11);
        this.M();
    }

    public void ac() {
        zu.a(this);
    }

    public void aa() {
        if (this.b()) {
            zu.a(this.getClass());
        }
    }

    public double e(d0 d02) {
        return -(this.Y().f() * 0.75);
    }

    public double k(d0 d02) {
        return (double)d02.h() - this.Y().f() * 0.5;
    }

    public double i(d0 d02) {
        return (double)d02.g() - this.e() * 0.25;
    }

    public double c(d0 d02) {
        return -(this.e() * 0.75);
    }

    public double g(d0 d02) {
        double d10 = this.i(d02);
        double d11 = this.c(d02);
        if (this.d() < d11) {
            return d11;
        }
        if (this.d() > d10) {
            return d10;
        }
        return this.d();
    }

    public double f(d0 d02) {
        double d10 = this.e(d02);
        double d11 = this.k(d02);
        if (this.c() < d10) {
            return d10;
        }
        if (this.c() > d11) {
            return d11;
        }
        return this.c();
    }

    public boolean h(d0 d02) {
        double d10 = this.i(d02);
        double d11 = this.c(d02);
        return this.d() < d11 || this.d() > d10;
    }

    public boolean a(d0 d02) {
        double d10 = this.e(d02);
        double d11 = this.k(d02);
        return this.c() < d10 || this.c() > d11;
    }

    public void b(d0 d02) {
        if (this.Y() == null) {
            return;
        }
        if (this.h(d02)) {
            this.c(this.g(d02));
        }
    }

    public void d(d0 d02) {
        if (this.Y() == null) {
            return;
        }
        if (this.a(d02)) {
            this.a(this.f(d02));
        }
    }

    public boolean j(d0 d02) {
        if (this instanceof ws || this instanceof wB || this instanceof wR) {
            return false;
        }
        if (this.Y() == null) {
            return false;
        }
        return this.h(d02) || this.a(d02);
    }

    public boolean ai() {
        return this.Q;
    }

    public boolean af() {
        return this.M;
    }

    public boolean ab() {
        return this.P;
    }

    public wl aj() {
        return this.U;
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        this.R = false;
        if (!this.M) {
            return;
        }
        if (!bl && this.S != null) {
            for (we we2 : this.S) {
                we2.a(true);
            }
        }
        if (bl) {
            this.S = new ArrayList<we>();
            for (we we2 : zu.T()) {
                if (we2.equals(this) || !we2.b()) continue;
                this.S.add(we2);
                we2.a(false);
            }
        }
        Iterator<we> iterator = ds.p();
        this.a((double)((d0)((Object)iterator)).g() / 2.0 - this.e() / 2.0, (double)((d0)((Object)iterator)).h() / 2.0 - this.f() / 2.0);
    }

    public void l(boolean bl) {
        this.Q = bl;
    }

    public void m(boolean bl) {
        this.M = bl;
    }

    public void j(boolean bl) {
        this.N = bl;
    }

    public void k(boolean bl) {
        this.P = bl;
    }

    @Override
    public void c(double d10) {
        super.c(Math.floor(d10));
    }

    @Override
    public void a(double d10) {
        super.a(Math.floor(d10));
    }

    @Override
    public JsonObject l() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("title", this.ad());
        jsonObject.addProperty("x", (Number)this.d());
        jsonObject.addProperty("y", (Number)this.c());
        jsonObject.addProperty("visible", Boolean.valueOf(this.b()));
        jsonObject.addProperty("pinned", Boolean.valueOf(this.ai()));
        return jsonObject;
    }

    @Override
    public void a(JsonObject jsonObject) {
        if (jsonObject.get("x") != null && !jsonObject.get("x").isJsonNull()) {
            this.c(jsonObject.get("x").getAsDouble());
            this.M();
        }
        if (jsonObject.get("y") != null && !jsonObject.get("y").isJsonNull()) {
            this.a(jsonObject.get("y").getAsDouble());
            this.M();
        }
        if (jsonObject.get("pinned") != null && !jsonObject.get("pinned").isJsonNull()) {
            this.l(jsonObject.get("pinned").getAsBoolean());
        }
        if (!this.N) {
            this.a(false);
        } else if (jsonObject.get("visible") != null && !jsonObject.get("visible").isJsonNull()) {
            this.a(jsonObject.get("visible").getAsBoolean());
        }
    }

    public boolean ag() {
        return this.N;
    }

    public static void b(String[] arrstring) {
        T = arrstring;
    }

    public static String[] ae() {
        return T;
    }

    static {
        if (we.ae() == null) {
            we.b(new String[2]);
        }
    }
}

