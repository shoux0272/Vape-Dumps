/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import manthe.A5;
import manthe.D7;
import manthe.V;
import manthe.f4;
import manthe.fE;
import manthe.fG;
import manthe.fb;
import manthe.fh;
import manthe.fk;
import manthe.fz;
import manthe.g9;
import manthe.gC;
import manthe.my;
import manthe.pG;
import manthe.pd;
import manthe.qD;
import manthe.rM;
import manthe.rf;
import manthe.rl;
import manthe.yH;

public class U {
    private int i;
    private int f = 0;
    private boolean b;
    private boolean g;
    private boolean e;
    private rf a;
    private rM d;
    private qD c;
    private qD h;

    public U(int n6) {
        this.i = n6;
        this.f();
    }

    private void f() {
        this.a = new rf(false);
        this.a.a(new D7(0.0, 0.0, 3, 1, new pd(0, 0, 2, 0)));
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 0.0, 2, 1, new pd(2, 22, 2, 0)));
        this.d = new rM(0, false);
        this.d.i(false);
        this.d.b(22.0);
        this.d.c(22.0);
        rf2.b(this.d);
        this.a.b(rf2);
        rl rl2 = new rl("", my.i, 0.75);
        rl2.c(65.0);
        rl2.b(20.0);
        rl2.d(true);
        this.a.b(rl2);
        rl2.a(new pG(this, rl2));
        rf rf3 = new rf(false);
        rf3.a(new D7(0.0, 0.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.a.b(rf3);
        this.c = new qD("Prioritize strongest", 10.0);
        this.c.b(10.0);
        this.c.a().a(new yH(this));
        this.c.g(this.g);
        this.h = new qD("Allow any of type", 10.0);
        this.h.b(10.0);
        this.h.a().a(new gC(this));
        this.h.g(this.e);
        fk fk2 = this.g();
        if (fk2.d()) {
            List list = new ArrayList();
            if (V.c() >= 23) {
                list = (List)g9.f().a();
            }
            fk2.a(fk2, list);
            if (list.size() <= 1) {
                this.b = true;
            }
            if (fk2.a(A5.aP) || fk2.a(A5.bO) || fk2.a(A5.cZ) || fk2.a(A5.c0)) {
                rf3.b(this.c);
            }
            if (fk2.a(A5.aP) || fk2.a(A5.bO) || fk2.a(A5.c0) || fk2.a(A5.av)) {
                rf3.b(this.h);
            }
            if (fk2.a(A5.dx)) {
                this.g = true;
            }
        }
    }

    public rf d() {
        return this.a;
    }

    public int c() {
        return this.i;
    }

    public fk g() {
        return fk.a(this.c());
    }

    public int h() {
        return this.f;
    }

    public U a(int n6) {
        this.f = n6;
        return this;
    }

    private fz a(fk fk2) {
        fz fz2 = null;
        if (fk2.a(A5.aP)) {
            fz2 = new f4(fk2.a()).m();
        }
        if (fk2.a(A5.bO)) {
            fz2 = new fb(fk2.a()).k();
        }
        return fz2;
    }

    public boolean b(fG fG2) {
        if (fG2.d()) {
            fk fk2 = fG2.k();
            if (fk2.h() == this.c()) {
                if (this.b || fG2.m() == this.f) {
                    return true;
                }
                if (fk2.a(A5.dx)) {
                    fh fh2 = new fh(this.g());
                    fh fh3 = new fh(fG2.k());
                    fG fG3 = fG.a(fh2);
                    fG3.a(this.f);
                    List<fE> list = fh2.f(fG3);
                    List<fE> list2 = fh3.f(fG2);
                    if (Boolean.compare(fh.d(fG3), fh.d(fG2)) == 0 && list.size() > 0) {
                        fE fE2 = list.get(0);
                        for (fE fE3 : list2) {
                            if (fE3.g() != fE2.g()) continue;
                            return true;
                        }
                    }
                }
            }
            if (this.e) {
                return fk2.a().getClass().equals(this.g().a().getClass());
            }
        }
        return false;
    }

    public boolean e() {
        return this.g;
    }

    public JsonObject b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item-id", (Number)this.i);
        jsonObject.addProperty("meta", (Number)this.f);
        jsonObject.addProperty("anyMeta", Boolean.valueOf(this.b));
        jsonObject.addProperty("anyMaterial", Boolean.valueOf(this.e));
        jsonObject.addProperty("onlyBest", Boolean.valueOf(this.g));
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("item-id") != null) {
            this.i = jsonObject.get("item-id").getAsInt();
        }
        if (jsonObject.get("meta") != null) {
            this.f = jsonObject.get("meta").getAsInt();
        }
        if (jsonObject.get("anyMeta") != null) {
            this.b = jsonObject.get("anyMeta").getAsBoolean();
        }
        if (jsonObject.get("anyMaterial") != null) {
            this.e = jsonObject.get("anyMaterial").getAsBoolean();
        }
        if (jsonObject.get("onlyBest") != null) {
            this.g = jsonObject.get("onlyBest").getAsBoolean();
        }
        this.f();
    }

    public fG a() {
        fk fk2 = fk.a(this.i);
        if (fk2.e()) {
            return null;
        }
        fG fG2 = fG.a(fk2);
        if (fG2.d()) {
            fG2.a(this.h());
        }
        return fG2;
    }

    public static U a(fG fG2) {
        if (fG2.e()) {
            return new U(0);
        }
        U u6 = new U(fG2.k().h());
        u6.a(fG2.m());
        return u6;
    }

    static rM c(U u6) {
        return u6.d;
    }

    static int d(U u6) {
        return u6.f;
    }

    static qD a(U u6) {
        return u6.c;
    }

    static boolean a(U u6, boolean bl) {
        u6.g = bl;
        return u6.g;
    }

    static qD b(U u6) {
        return u6.h;
    }

    static boolean b(U u6, boolean bl) {
        u6.e = bl;
        return u6.e;
    }
}

