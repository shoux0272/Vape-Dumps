/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import manthe.D;
import manthe.D7;
import manthe.DU;
import manthe.bW;
import manthe.ds;
import manthe.o7;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.qp;
import manthe.r1;
import manthe.r6;
import manthe.rG;
import manthe.rN;
import manthe.rQ;
import manthe.r_;
import manthe.rf;
import manthe.ri;
import manthe.s7;
import manthe.sb;
import manthe.vy;
import manthe.y5;
import manthe.yG;
import manthe.zu;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class rE
extends r1 {
    private final sb ah;
    private final r6 ai;
    private final Map<qp, D> an = new HashMap<qp, D>();
    private final Map<yG, List<p1>> am = new HashMap<yG, List<p1>>();
    private final rf ae;
    private final rf ag;
    private final List<r1> af = new ArrayList<r1>();
    private final r1 aj;
    private String al = "";
    private boolean ak;

    public rE() {
        super("Filter", false);
        zu zu2 = on.p.H().b(zu.class);
        D7 d72 = new D7(0.0, 0.0, 5000, 3, new pd(0, 0, 0, 0));
        d72.h();
        this.aj().a(d72);
        rf rf2 = new rf(false);
        rf2.a(new D7(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 0)));
        rQ rQ2 = new rQ("vapelogo", 0.45f, 4.0f, 3.0f, false);
        rQ2.b(20.0);
        rQ2.c(52.0);
        rQ2.j(false);
        rQ2.i(false);
        rf2.b(rQ2);
        rf2.j(false);
        rf2.j(true);
        this.d(rf2);
        this.ae = new rf(false);
        this.ae.a(new D7(2.0, 0.0, 5000, 1, new pd(0, 0, 0, 2)));
        rf rf3 = new rf(false);
        rf3.a(new D7(0.0, 0.0, 1, 2, new pd(2, 0, 0, 0)));
        rG rG2 = new rG("magnify", 16.0f, 16.0f, 0.8f, true);
        rG2.z().j(false);
        rf3.b(rG2);
        this.ah = new sb(33);
        this.c(100.0);
        this.b(20.0);
        this.ah.b(16.0);
        this.ah.c(100.0);
        this.ah.a(new vy(this, zu2));
        rf3.b(this.ah);
        this.ae.b(rf3);
        this.ai = new r6(true);
        this.ai.b(new Color(45, 45, 45, 240));
        this.ai.j(false);
        this.ai.c(100.0);
        this.ai.b(130.0);
        rG2.c(16.0);
        rG2.b(16.0);
        this.k(true);
        this.aj().g(false);
        rG2.a(new bW(this));
        this.a(true);
        this.ag = new rf(false);
        this.ag.a(new D7(0.0, 0.0, 1, 2, new pd(2, 2, 0, 2)));
        this.d(this.ag);
        this.d(this.ae);
        this.a(new r_());
        this.a(new rN());
        this.aj = new r1("search-results", false);
        this.aj.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.aj.b(0.0);
        this.aj.f(false);
        this.aj.c(0.0);
        this.aj.k(true);
        this.aj.n(true);
        this.aj.d(this.ai);
        this.af.add(this.aj);
        this.aj.v().remove(this.aj.Z());
    }

    private void a(ri ri2) {
        this.af.add(ri2);
        this.ag.b(ri2.al());
    }

    public List<r1> am() {
        return this.af;
    }

    private void al() {
        Iterator<Map.Entry<qp, D>> iterator = this.an.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<qp, D> entry = iterator.next();
            this.ai.A().a((p1)entry.getKey());
            qp qp2 = entry.getKey();
            D d10 = entry.getValue();
            d10.b().b(qp2);
            List<p1> list = d10.b().v();
            list.clear();
            list.addAll((Collection<p1>)this.am.get(d10.b()));
            qp2.a(d10.a());
            qp2.c(manthe.D.a(d10));
            iterator.remove();
        }
        this.an.clear();
        this.am.clear();
        this.ai.A().J();
        if (!this.ah.y()) {
            this.ah.z().a("");
        }
    }

    private void a(s7 s72) {
        if (this.an.containsKey(s72)) {
            return;
        }
        yG yG2 = s72.s();
        if (yG2 == null) {
            return;
        }
        if (!this.am.containsKey(yG2)) {
            this.am.put(yG2, new ArrayList<p1>(yG2.v()));
        }
        this.an.put(s72, new D(s72));
        yG2.a((p1)s72);
        s72.a((DU)null);
        this.ai.d(s72);
    }

    @Override
    public void c(double d10) {
        super.c(d10);
    }

    @Override
    public void c(boolean bl) {
        String string;
        this.f(false);
        this.aj().c(ds.p().g());
        int n6 = 0;
        for (p1 p12 : this.aj().v()) {
            n6 = (int)((double)n6 + p12.q());
        }
        int n10 = ds.p().g() / 2 - n6 / 2 - (int)(this.ae.q() / 3.0);
        this.a(n10);
        this.d(0.0);
        boolean bl2 = GL11.glIsEnabled((int)3042);
        if (!bl2) {
            GL11.glEnable((int)3042);
        }
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        o7.a(new Color(30, 30, 30, 240), (double)n10, this.k() + 20.0, (double)(n10 + n6), this.k() + 20.0, (double)(n10 + n6), this.k(), (double)n10, this.k());
        GL11.glEnable((int)3553);
        if (!bl2) {
            GL11.glDisable((int)3042);
        }
        super.c(true);
        if (Keyboard.isKeyDown((int)29) && Keyboard.isKeyDown((int)33) || this.ak) {
            this.ah.e(true);
            this.ak = false;
        }
        if (!(string = this.ah.z().E().toLowerCase()).equals(this.al)) {
            this.al();
        }
        this.al = string;
        if (this.ah.y()) {
            this.ai.a(true);
            this.ah.c(100.0);
        } else {
            this.ai.a(false);
            this.ah.c(0.0);
            this.al();
        }
        if (!(string.equals("") && !this.ah.y() || string.equals(""))) {
            for (y5 y52 : on.p.H().e()) {
                String string2 = y52.H().toLowerCase();
                if (!string2.toLowerCase().contains(string) || y52.l() == null) continue;
                s7 s72 = y52.l();
                this.a(s72);
                s72.c(100.0);
            }
        }
        this.aj().a(new D7(0.0, 0.0, 1, 4, new pd(0, 0, 0, 0)));
        this.aj.a(this.ae.t());
        this.aj.d(this.ae.k() + this.ae.b());
        this.aj.a(this.ai.e());
        this.aj.aj().b(this.ai.b());
        this.aj.aj().c(this.ai.q());
        this.ai.a(this.aj.t());
        this.ai.d(this.aj.k());
    }

    @Override
    public boolean e() {
        return true;
    }

    static sb a(rE rE2) {
        return rE2.ah;
    }

    static r1 b(rE rE2) {
        return rE2.aj;
    }

    static boolean a(rE rE2, boolean bl) {
        rE2.ak = bl;
        return rE2.ak;
    }
}

