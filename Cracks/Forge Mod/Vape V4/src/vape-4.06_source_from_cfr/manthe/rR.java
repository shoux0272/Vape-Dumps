/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.D7;
import manthe.U;
import manthe.V;
import manthe.cy;
import manthe.d0;
import manthe.ds;
import manthe.fG;
import manthe.fk;
import manthe.g9;
import manthe.gz;
import manthe.my;
import manthe.nj;
import manthe.pd;
import manthe.r1;
import manthe.r6;
import manthe.rM;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.ry;
import manthe.s1;
import manthe.sb;
import manthe.uA;
import manthe.vx;

public class rR
extends r1 {
    private final HashMap<rM, rf> ai = new HashMap();
    private final List<rM> as = new ArrayList<rM>();
    private final rf ar = new rf(false);
    private final HashMap<String, rM> ap = new HashMap();
    private final List<U> ag = Arrays.asList(new U(276), new U(278), new U(279), new U(261), new U(364), new U(368), new U(332), new U(344), new U(346), new U(322), new U(322).a(1), new U(326), new U(327), new U(373).a(16421), new U(373).a(16449), new U(373).a(8258), new U(373).a(8259), new U(373).a(16388), new U(282), new U(1));
    rl ak;
    private rf al;
    private rf am;
    private rf aq;
    private rf ae;
    private rf ah;
    private rM ao;
    private int aj = 0;
    private sb an;
    private ry at;
    private static int af;

    public rR() {
        super("Hotbar editor", false);
        this.aj().b(new Color(45, 45, 45, 200));
        this.aj().a(new D7(0.0, 5.0, 5000, 1, new pd(5, 5, 5, 5)));
        this.aj().b(145.0);
        this.c(300.0);
        this.b(20.0);
        this.am();
        this.as();
        this.al();
        this.at();
    }

    private void ao() {
        this.ar.J();
        for (U u6 : this.ag) {
            rM rM2 = this.c(0);
            rM2.a(u6);
            this.ar.b(rM2);
        }
    }

    public void a(ry ry2) {
        this.at = ry2;
        this.ar();
        List<U> list = ry2.a();
        if (list.size() == 9) {
            for (int k = 0; k < this.as.size(); ++k) {
                rM rM2 = this.as.get(k);
                U u6 = list.get(k);
                rM2.a(u6);
            }
        }
        this.d(0);
    }

    private void ar() {
        for (int k = 0; k < this.as.size(); ++k) {
            rM rM2 = this.as.get(k);
            rM2.B();
        }
    }

    private void at() {
        Iterator iterator = fk.j().f().iterator();
        while (iterator.hasNext()) {
            Object object;
            Object object2;
            if (V.c() == 13) {
                object2 = (String)iterator.next();
                object = fk.j().a(object2);
            } else {
                object2 = new gz(iterator.next());
                object = fk.j().a(((cy)object2).a());
            }
            if (!A5.cg.isInstance(object)) continue;
            object2 = new fk(object);
            List list = new ArrayList();
            if (V.c() >= 23) {
                list = (List)g9.f().a();
            }
            ((fk)object2).a((fk)object2, list);
            for (Object e10 : list) {
                rM rM2 = this.c(((fk)object2).h());
                fG fG2 = new fG(e10);
                rM2.a(fG2);
                String string = rM2.C().j().toLowerCase();
                this.ap.put(string, rM2);
            }
        }
    }

    private void as() {
        this.al = new rf(true);
        this.al.a(new D7(2.0, 0.0, 1, 9, new pd(2, 2, 2, 2)));
        this.al.j(false);
        this.al.b(new Color(45, 45, 45, 240));
        this.al.b(35.0);
        this.al.c(305.0);
        int n6 = 0;
        while (n6 < 9) {
            rM rM2 = new rM(0, true);
            rM2.j(false);
            rM2.b(22.0);
            rM2.c(22.0);
            rM2.b(Color.BLACK);
            rf rf2 = new rf(false);
            rf2.a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
            rf2.b(22.0);
            rf2.c(22.0);
            rf2.b(rM2);
            this.ai.put(rM2, rf2);
            this.al.b(rf2);
            this.as.add(rM2);
            int n10 = n6++;
            rM2.a(new vx(this, n10, rM2));
        }
        this.d(0);
        this.d(this.al);
    }

    private void al() {
        rf rf2 = new rf(false);
        rf2.a(new D7(2.0, 0.0, 1, 2, new pd(0, 60, 0, 0)));
        rf2.c(305.0);
        rf2.b(20.0);
        rg rg2 = new rg("Save & Exit", true);
        rg2.c(100.0);
        rg2.b(20.0);
        rg2.j(false);
        rf2.b(rg2);
        rg2.a(new nj(this));
        this.d(rf2);
    }

    private rM c(int n6) {
        rM rM2 = new rM(n6, true);
        rM2.j(false);
        rM2.b(22.0);
        rM2.c(22.0);
        rM2.b(Color.BLACK);
        rM2.a(new uA(this, rM2));
        return rM2;
    }

    private void a(String string) {
        if ((string = string.toLowerCase()).equals("")) {
            this.ao();
            return;
        }
        this.ar.J();
        for (Map.Entry<String, rM> entry : this.ap.entrySet()) {
            String string2 = entry.getKey();
            if (!string2.contains(string)) continue;
            this.ar.b(entry.getValue());
        }
    }

    private void aq() {
        this.ae = new rf(true);
        this.ae.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.ae.j(false);
        this.ae.b(new Color(45, 45, 45, 240));
        this.ae.b(100.0);
        this.ae.c(150.0);
        rf rf2 = new rf(false);
        rf2.a(new D7(2.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.an = new s1(this);
        this.an.c(100.0);
        this.an.b(12.0);
        this.an.a("Search item name");
        rf2.b(this.an);
        this.ae.b(rf2);
        r6 r62 = new r6(false);
        r62.b(88.0);
        this.ar.a(new D7(2.0, 2.0, 5000, 6, new pd(2, 2, 2, 2)));
        r62.d(this.ar);
        this.ae.b(r62);
        this.ao();
    }

    private void ap() {
        this.aq = new rf(true);
        this.aq.a(new D7(0.0, 0.0, 2, 1, new pd(0, 0, 0, 0)));
        this.aq.j(false);
        this.aq.b(new Color(45, 45, 45, 240));
        this.aq.b(100.0);
        this.aq.c(68.0);
        this.ak = new rl("", my.c, 1.0);
        this.ak.b(12.0);
        this.ak.c(68.0);
        this.aq.b(this.ak);
        this.ah = new rf(false);
        this.ah.a(new D7(0.0, 0.0, 1, 1, new pd(0, 0, 0, 0)));
        this.aq.b(this.ah);
    }

    private void e(int n6) {
        if (this.at == null) {
            return;
        }
        List<U> list = this.at.a();
        U u6 = list.get(n6);
        this.ak.a("Slot " + (n6 + 1));
        this.ah.J();
        this.ah.b(u6.d());
    }

    private void am() {
        this.am = new rf(false);
        this.am.b(150.0);
        this.am.c(300.0);
        this.am.a(new D7(5.0, 0.0, 1, 2, new pd(0, 0, 0, 0)));
        this.ap();
        this.aq();
        this.am.b(this.aq);
        this.am.b(this.ae);
        this.d(this.am);
    }

    private void d(int n6) {
        this.aj = n6;
        this.ao = this.as.get(n6);
        for (int k = 0; k < this.as.size(); ++k) {
            rM rM2 = this.as.get(k);
            if (k != n6) {
                rM2.e(0.0);
                rM2.a(a);
                continue;
            }
            rM2.a(Color.BLACK);
        }
        this.e(n6);
    }

    @Override
    public void c() {
        this.al.b(new Color(45, 45, 45, 150));
        this.d(false);
        this.f(false);
        this.Z().a(false);
        d0 d02 = ds.p();
        this.a((double)(d02.g() / 2) - this.q() / 2.0);
        this.d((double)(d02.h() / 2) - this.b() / 2.0);
        this.am.b(100.0);
        this.am.c(222.0);
        this.ak.c(68.0);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        super.c(false);
    }

    static void b(rR rR2, int n6) {
        rR2.d(n6);
    }

    static ry e(rR rR2) {
        return rR2.at;
    }

    static void b(rR rR2) {
        rR2.ar();
    }

    static rM d(rR rR2) {
        return rR2.ao;
    }

    static int a(rR rR2) {
        return rR2.aj;
    }

    static void a(rR rR2, int n6) {
        rR2.e(n6);
    }

    static sb c(rR rR2) {
        return rR2.an;
    }

    static void a(rR rR2, String string) {
        rR2.a(string);
    }

    public static void b(int n6) {
        af = n6;
    }

    public static int an() {
        return af;
    }

    public static int au() {
        int n6 = rR.an();
        if (n6 == 0) {
            return 24;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (rR.au() != 0) {
            rR.b(68);
        }
    }
}

