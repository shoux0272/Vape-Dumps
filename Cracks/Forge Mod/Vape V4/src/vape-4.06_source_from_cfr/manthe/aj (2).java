/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.DB;
import manthe.DY;
import manthe.V;
import manthe.ds;
import manthe.ej;
import manthe.ex;
import manthe.on;
import manthe.pf;

public class aj {
    private DY g;
    private DB i;
    private DB c;
    private DB d;
    private DB f;
    private DB e;
    private DB j;
    private DB h;
    private static boolean b;

    public aj(DY dY2, boolean bl, boolean bl2, boolean bl3, boolean bl4, boolean bl5, boolean bl6, boolean bl7) {
        this.g = dY2;
        this.i = DB.a((Object)dY2, "Players" + dY2.e(), "Players", bl);
        this.c = DB.a((Object)dY2, "Mobs" + dY2.e(), "Mobs", bl2);
        this.d = DB.a((Object)dY2, "Peaceful" + dY2.e(), "Peaceful", bl3);
        this.f = DB.a((Object)dY2, "Neutral" + dY2.e(), "Neutral", bl4);
        this.e = DB.a((Object)dY2, "Ignore Naked" + dY2.e(), "Ignore naked", bl5);
        this.j = DB.a((Object)dY2, "Ignore invisible" + dY2.e(), "Ignore invisible", bl6);
        this.h = DB.a((Object)dY2, "Ignore behind walls" + dY2.e(), "Ignore behind walls", bl7);
    }

    public DB a() {
        return this.h;
    }

    public DB d() {
        return this.j;
    }

    public DB g() {
        return this.e;
    }

    public DB i() {
        return this.c;
    }

    public DB h() {
        return this.f;
    }

    public DB b() {
        return this.d;
    }

    public DB e() {
        return this.i;
    }

    public boolean a(ex ex2) {
        if (ex2.e()) {
            return false;
        }
        if (ex2.a(A5.dj)) {
            return false;
        }
        if (ex2.equals(ds.k())) {
            return false;
        }
        if (!ex2.a(A5.cF)) {
            return false;
        }
        if (V.c() > 13 && ex2.a(A5.a8)) {
            return false;
        }
        ej ej2 = new ej(ex2.a());
        if (ej2.aD() <= 0.0f) {
            return false;
        }
        if (this.j.u().booleanValue() && pf.b(ej2)) {
            return false;
        }
        if (this.h.u().booleanValue() && !ds.k().c(ex2)) {
            return false;
        }
        if (on.p.N().a(ej2)) {
            return false;
        }
        String string = ex2.a().getClass().getName();
        boolean bl = ex2.a(A5.L);
        boolean bl2 = ex2.a(A5.P) || ex2.a(A5.dK) || ex2.a(A5.dI) || ex2.a(A5.aV);
        boolean bl3 = ex2.a(A5.ah) || string.contains(".passive.");
        boolean bl4 = ex2.a(A5.cs);
        if (bl) {
            if (!this.i.u().booleanValue()) {
                return false;
            }
            if (on.p.b().a(ex2.S())) {
                return true;
            }
        }
        if (bl2 && !this.c.u().booleanValue()) {
            return false;
        }
        if (bl3 && !this.d.u().booleanValue()) {
            return false;
        }
        if (bl4 && !this.f.u().booleanValue()) {
            return false;
        }
        if (this.e.u().booleanValue() && pf.a(ej2)) {
            return false;
        }
        if (on.p.t().a(ej2)) {
            return false;
        }
        return !on.p.t().b(ej2);
    }

    public void a(String string) {
        DB[] arrdB = new DB[]{this.i, this.c, this.d, this.f, this.e, this.j, this.h};
        for (int k = 0; k < string.toCharArray().length; ++k) {
            if (arrdB.length <= k) {
                on.a("something went horribly wrong when deserializing target value");
                break;
            }
            arrdB[k].a((Boolean)(string.charAt(k) == '1' ? 1 : 0));
        }
    }

    public String toString() {
        boolean[] arrbl = new boolean[]{this.i.u(), this.c.u(), this.d.u(), this.f.u(), this.e.u(), this.j.u(), this.h.u()};
        StringBuilder stringBuilder = new StringBuilder();
        for (boolean bl : arrbl) {
            stringBuilder.append(bl ? "1" : "0");
        }
        return stringBuilder.toString();
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean f() {
        return b;
    }

    public static boolean c() {
        boolean bl = aj.f();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!aj.f()) {
            aj.b(true);
        }
    }
}

