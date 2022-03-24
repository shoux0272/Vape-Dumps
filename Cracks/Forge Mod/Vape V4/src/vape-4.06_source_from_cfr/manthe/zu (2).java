/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.d;
import com.google.common.collect.ImmutableList;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.Ae;
import manthe.Bo;
import manthe.Bz;
import manthe.CQ;
import manthe.Cp;
import manthe.DB;
import manthe.DE;
import manthe.DF;
import manthe.DU;
import manthe.DX;
import manthe.Da;
import manthe.Dm;
import manthe.Ds;
import manthe.ax;
import manthe.c2;
import manthe.d0;
import manthe.dR;
import manthe.dX;
import manthe.ds;
import manthe.ej;
import manthe.ke;
import manthe.kf;
import manthe.ng;
import manthe.nx;
import manthe.o7;
import manthe.on;
import manthe.pb;
import manthe.qD;
import manthe.r1;
import manthe.r2;
import manthe.rE;
import manthe.rc;
import manthe.rg;
import manthe.rl;
import manthe.ry;
import manthe.rz;
import manthe.sb;
import manthe.uW;
import manthe.w0;
import manthe.w2;
import manthe.w6;
import manthe.wC;
import manthe.wE;
import manthe.wF;
import manthe.wJ;
import manthe.wL;
import manthe.wM;
import manthe.wP;
import manthe.wT;
import manthe.wX;
import manthe.wY;
import manthe.we;
import manthe.wm;
import manthe.wp;
import manthe.wr;
import manthe.wv;
import manthe.wy;
import manthe.x4;
import manthe.xW;
import manthe.xn;
import manthe.y5;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class zu
extends y5 {
    private static final int ai = 2;
    private static final List<Cp> C = new ArrayList<Cp>();
    public static zu T;
    public static Color ae;
    private static boolean N;
    private static rl I;
    private final boolean ac = false;
    public int U = 0;
    public DB G = DB.a((Object)this, "Blur Background", true, "Blur the background of the GUI");
    public DB aa = DB.a((Object)this, "Rescale", true, "Rescales the GUI");
    public DB y = DB.a((Object)this, "Enable Multi-Keybinding", false, "Allows you to set multiple keys to be held together\nto toggle modules");
    public DB w = DB.a((Object)this, "GUI bind indicator", true, "Displays a message indicating your GUI keybind upon injecting.\nI.E. \"Press RSHIFT to open GUI\"");
    public DB af = new Dm(this, this, "Smooth Font", true);
    public DB v = DB.a((Object)this, "Show Tooltips", true, "Toggles visibility of these");
    public DF X = DF.a(this, "Rainbow speed", "#.#", "", 0.1, 1.0, 10.0, 0.1, "Adjusts the speed of rainbow values");
    public DB an = DB.a(this, "Discord integration", false);
    public DB F = DB.a((Object)this, "Notifications", true, "Shows notifications");
    public DB M = DB.a((Object)this, "Toggle Alert", false, "Notifies you if a module is enabled/disabled.");
    public final pb ao;
    public final pb K;
    public DX aj;
    public final pb O;
    public final pb ad;
    public final pb am;
    public DX R;
    public boolean Q = true;
    private boolean u;
    private int A = -1;
    private boolean J;
    private Bz L;
    private Bz S;
    public Bz B;
    public Bz ab;
    private Bz Z;
    private Bz al;
    private r1 D;
    private r1 x;
    private sb H;
    public static wM W;
    public static xn ah;
    public static boolean E;
    private static List<we> V;
    private static we Y;
    private static DU ak;
    private boolean ag = false;
    private static ImmutableList<we> P;
    private static String z;

    public static void V() {
        V.clear();
        V.add(new w6());
        V.add(new wT());
        V.add(new wp());
        V.add(new wy(CQ.c));
        V.add(new wy(CQ.f));
        V.add(new wy(CQ.d));
        V.add(new wy(CQ.a));
        V.add(new wy(CQ.e));
        V.add(new wy(CQ.h));
        V.add(new w0());
        V.add(new wv());
        V.add(new wF());
        V.add(new wX());
        V.add(new wY());
        V.add(new wJ());
        V.add(new wL());
        V.add(new wC());
        V.add(new w2());
        V.add(new wr());
        V.add(new wm());
        V.add(new wE());
        V.add(new wP());
        P = ImmutableList.copyOf(V);
    }

    public zu() {
        super("GUI", 54, 0, CQ.b, "Shift click any module button to bind it to a key.\n(You can shift click this to bind the GUI)\nHold TAB to view modules binds.");
        T = this;
        this.A = ds.s().x();
        ((qD)this.af.c()).a(new ax(this));
        this.O = new pb("Floating", 0.8);
        this.ad = new pb("Integrated", 0.8);
        this.am = new pb("None", 0.8);
        this.R = DX.a((Object)this, "Search bar style", "Switch between search bar styles", this.O, this.ad, this.am, this.O);
        this.ao = new pb("Old theme", 0.8);
        this.K = new pb("New theme", 0.8);
        this.aj = DX.a((Object)this, "GUI Theme", "Switch between the old and new gui themes", this.K, this.K, this.ao);
        ((rz)this.aj.c()).a(new Ae(this));
        this.F.a(new Ds[]{this.M});
        this.a(this.aj, this.G, this.aa, this.y, this.w, this.af, this.v, this.an, this.F, this.M, this.X, this.R);
    }

    public static void a(rl rl2) {
        I = rl2;
    }

    public static void b(rl rl2) {
        if (I != null && I.equals(rl2)) {
            I.a(false);
            I = null;
        }
    }

    public static void X() {
        if (I != null && zu.T.v.u().booleanValue() && I.e()) {
            GL11.glPushMatrix();
            GL11.glTranslated((double)0.0, (double)0.0, (double)300.0);
            o7.b(I.t() - 1.0, I.k() - 2.0, I.t() + I.q() + 4.0, I.k() + I.b() + 2.0, 0.0, 0.0, 0.0, 0.8);
            I.c(true);
            GL11.glPopMatrix();
        }
    }

    public static void a(Cp cp2) {
        C.add(cp2);
    }

    public void ae() {
        this.a(this.L);
    }

    public void aj() {
        ng.d.an();
        this.a(this.S);
    }

    public void a(ry ry2) {
        this.a(this.Z);
        ng.h.a(ry2);
    }

    @Override
    public void z() {
        super.z();
        if (this.N()) {
            if (this.aa.u().booleanValue() && this.Q) {
                this.A = ds.s().x();
                ds.s().c(2);
            }
            ds.a(new dX(d.getGuiObject()));
            this.Q = false;
        } else {
            this.Q = true;
            this.g(false);
        }
    }

    public void c(ke ke2) {
        on.p.t().r.L();
    }

    public void b(kf kf2) {
        if (ds.x().d() && ds.x().a(A5.O) && this.d()) {
            this.a(this.ab);
            this.z();
        }
        on.p.I().a(this.an.u());
        on.p.t().g();
        if (W != null && !W.b()) {
            W = null;
        }
        for (we object : V) {
            object.z();
        }
        if (this.aa.u().booleanValue()) {
            if (this.A == -1) {
                this.A = ds.s().x();
                ds.s().c(2);
            }
        } else if (this.A != -1) {
            ds.s().c(this.A);
            this.A = -1;
        }
        if (this.U++ > 20) {
            this.U = 0;
        }
        if (kf2.a() == Da.b) {
            for (Ds ds2 : on.p.o().a()) {
                Object object;
                if (!(ds2 instanceof DE) || !((DE)(object = (DE)ds2)).J()) continue;
                ((DE)object).y();
            }
            for (y5 y52 : on.p.H().e()) {
                for (Ds ds3 : y52.r()) {
                    DE dE2;
                    if (!(ds3 instanceof DE) || !(dE2 = (DE)ds3).J()) continue;
                    dE2.y();
                }
            }
        }
    }

    public void W() {
        int n6 = GL11.glGetInteger((int)3009);
        float f10 = GL11.glGetFloat((int)3010);
        GL11.glAlphaFunc((int)516, (float)0.0f);
        if (ds.x().e() || !ds.x().a().getClass().isInstance(d.getGuiObject())) {
            boolean bl = this.aa.u() != false && ng.b.ar.u() != false;
            float f11 = 0.0f;
            if (bl) {
                float f12 = zu.ac();
                f11 = 1.0f / f12;
                GL11.glScalef((float)f12, (float)f12, (float)f12);
            }
            this.al();
            if (bl) {
                GL11.glScalef((float)f11, (float)f11, (float)f11);
            }
        }
        GL11.glAlphaFunc((int)n6, (float)f10);
    }

    public static float ac() {
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        int n6 = d02.f();
        return (float)(n6 == 5 ? 0.4 : (n6 == 4 ? 0.5 : (n6 == 3 ? 0.66666 : (n6 == 2 ? 1.0 : (n6 == 1 ? 2.0 : (n6 == 0 ? 0.5 : 1.0))))));
    }

    public Color a(Object object) {
        if (!A5.cF.isInstance(object)) {
            return null;
        }
        if (object.equals(ds.k())) {
            return null;
        }
        ej ej2 = new ej(object);
        float f10 = ej2.a(ds.k());
        if (A5.L.isInstance(object)) {
            if (on.p.N().c(ej2.S()) && on.p.N().c.u().booleanValue()) {
                return on.p.N().e.K();
            }
            if (on.p.b().a(ej2.S()) && on.p.b().c.u().booleanValue()) {
                return on.p.b().e.K();
            }
            return Color.WHITE;
        }
        return null;
    }

    private void al() {
        nx.c().d();
        if (this.ab()) {
            for (we we2 : V) {
                if (!we2.b() || !we2.ai()) continue;
                we2.B();
            }
        } else {
            for (r1 r12 : on.p.F().d()) {
                if (r12.ai()) {
                    r12.c(true);
                    continue;
                }
                if (!(r12 instanceof r2)) continue;
                ((r2)r12).p(true);
            }
        }
    }

    public List<r1> Y() {
        CopyOnWriteArrayList<r1> copyOnWriteArrayList = new CopyOnWriteArrayList<r1>();
        copyOnWriteArrayList.addAll(this.al.a());
        return copyOnWriteArrayList;
    }

    public void a(d0 d02) {
        if (this.ab()) {
            this.b(d02);
        } else {
            this.c(d02);
        }
    }

    public void U() {
        double d10 = 32.0;
        double d11 = 32.0;
        double d12 = 0.0;
        for (we we2 : P) {
            if (!we2.ab() || !we2.ag()) continue;
            if (d10 + we2.e() > (double)ds.p().g()) {
                d10 = 24.0;
                d11 += d12 + 8.0;
                d12 = 0.0;
            }
            if (we2.f() > d12) {
                d12 = we2.f();
            }
            we2.c(d10);
            we2.a(d11);
            we2.M();
            d10 += we2.e() + 2.0;
        }
    }

    private void b(d0 d02) {
        this.af.a((Boolean)true);
        CopyOnWriteArrayList<we> copyOnWriteArrayList = new CopyOnWriteArrayList<we>();
        copyOnWriteArrayList.addAll(V);
        CopyOnWriteArrayList<we> copyOnWriteArrayList2 = new CopyOnWriteArrayList<we>();
        copyOnWriteArrayList2.addAll(copyOnWriteArrayList);
        Collections.reverse(copyOnWriteArrayList);
        for (we we2 : copyOnWriteArrayList2) {
            if (!we2.b()) continue;
            if (we2.x()) {
                we we3;
                boolean bl = true;
                Iterator iterator = copyOnWriteArrayList.iterator();
                while (iterator.hasNext() && !(we3 = (we)iterator.next()).equals(we2)) {
                    if (!we3.b() || !we3.x()) continue;
                    bl = false;
                }
                if (bl) {
                    we2.E();
                }
            }
            we2.C();
        }
        if (ah != null) {
            ah.C();
        }
        if (W != null) {
            boolean bl = W.y();
            W.e(false);
            W.C();
            W.e(bl);
            if (W.F() != null && W.F().U()) {
                W.F().Z();
            }
        }
        for (we we2 : copyOnWriteArrayList2) {
            if (we2.b() && we2.j(d02)) {
                we2.aj().a(true);
                we2.aj().C();
                continue;
            }
            we2.aj().a(false);
        }
    }

    private void c(d0 d02) {
        List<r1> list = this.Y();
        ArrayList<rg> arrayList = new ArrayList<rg>();
        for (r1 qp2 : list) {
            if (!qp2.e()) {
                if (!qp2.ae()) continue;
                qp2.c();
                continue;
            }
            qp2.c();
            qp2.c(false);
            boolean bl = qp2.a(d02);
            if (bl && Keyboard.isKeyDown((int)62)) {
                qp2.i(d02);
                qp2.k(d02);
            }
            if (!bl) continue;
            boolean bl2 = qp2.h(d02);
            boolean bl3 = qp2.d(d02);
            String string = qp2.H();
            double d10 = ds.m().c(string);
            double d11 = ds.m().b(string);
            double d12 = bl2 ? (double)d02.g() - d10 : qp2.t();
            double d13 = bl3 ? (double)d02.h() - d11 : qp2.k();
            rg rg2 = qp2.ab();
            rg2.a(d12 - 4.0);
            rg2.d(d13);
            rg2.c(rg2.z().H() + 4.0);
            rg2.b(10.0);
            rg2.a(true);
            arrayList.add(rg2);
        }
        for (rg rg3 : arrayList) {
            rg3.c();
            rg3.c(true);
        }
    }

    public void af() {
        for (we we2 : V) {
            if (!we2.af() || !we2.b()) continue;
            d0 d02 = ds.p();
            we2.a((double)d02.g() / 2.0 - we2.e() / 2.0, (double)d02.h() / 2.0 - we2.f() / 2.0);
        }
        zu.b(w6.class).aq();
    }

    public void b(Object object) {
        on.p.M().aA.a(object);
        ng.f.al();
        zu.b(I);
        if (this.al.equals(this.ab) || this.al.equals(this.B)) {
            this.ae();
        } else if (!this.al.equals(this.L)) {
            this.ae();
            on.p.c(true);
            return;
        }
        if (this.aa.u().booleanValue() && this.A != -1) {
            ds.s().c(this.A);
        }
        if (on.p.H().b(zu.class).G.u().booleanValue()) {
            nx.c().b();
        }
        if (!on.p.s) {
            this.z();
        }
    }

    public boolean ad() {
        return this.Q;
    }

    public boolean Z() {
        return this.J;
    }

    public void g(boolean bl) {
        this.J = bl;
    }

    @Override
    public void k() {
        N = this.af.u();
        this.al = this.L = new Bz(on.p.F().d());
        this.S = new Bz(ng.d, ng.p, ng.r);
        this.B = new Bz(ng.j);
        this.ab = new Bz(ng.i);
        this.Z = new Bz(ng.h);
        this.L.a().addAll(ng.a.am());
    }

    public void am() {
        int n6 = GL11.glGetInteger((int)3009);
        float f10 = GL11.glGetFloat((int)3010);
        GL11.glAlphaFunc((int)516, (float)0.0f);
        if (this.G.u().booleanValue()) {
            nx.c().f();
        } else {
            nx.c().b();
        }
        nx.c().d();
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        dR dR2 = ds.m();
        String string = "v4.06";
        dR2.d(string, (double)(d02.g() - dR2.c(string) - 10), (double)(d02.h() - 10), -1);
        DU dU2 = new DU(0.0, 0.0, d02.g(), d02.h());
        if (ak != null && (dU2.d() != ak.d() || dU2.c() != ak.c())) {
            this.af();
        }
        ak = dU2;
        this.a(d02);
        ng.f.p(false);
        if (!this.ab()) {
            zu.X();
        }
        GL11.glAlphaFunc((int)n6, (float)f10);
    }

    public void f(boolean bl) {
        this.u = bl;
    }

    public boolean ah() {
        return this.u;
    }

    public Bz ak() {
        return this.al;
    }

    public void a(Bz bz2) {
        if (this.al != bz2) {
            zu.b(I);
        }
        this.al.a(null);
        this.al = bz2;
    }

    public void a(r1 r12) {
        if (r12 instanceof rE || this.al == null || this.al.a() == null) {
            return;
        }
        List<r1> list = this.al.a();
        if (!list.contains(r12)) {
            return;
        }
        list.remove(r12);
        list.add(r12);
    }

    public void b(r1 r12) {
        this.x = r12;
    }

    public void a(int n6, int n10, int n11) {
        if (this.ab()) {
            Bo bo2 = o7.b();
            uW uW2 = new uW(bo2.a, bo2.b, c2.a(n11));
            if (W != null) {
                boolean bl = !(W instanceof x4);
                W.b(uW2);
                if (bl) {
                    return;
                }
            }
            CopyOnWriteArrayList<we> copyOnWriteArrayList = new CopyOnWriteArrayList<we>(V);
            Collections.reverse(copyOnWriteArrayList);
            for (we we2 : copyOnWriteArrayList) {
                if (!we2.b() || !we2.aj().b() || !we2.aj().x()) continue;
                we2.aj().J();
                return;
            }
            for (we we2 : copyOnWriteArrayList) {
                if (!we2.b() || !we2.q().b(uW2.a(), uW2.b())) continue;
                we2.ac();
                we2.b(uW2);
                break;
            }
        } else {
            r1 r12 = null;
            List<r1> list = this.Y();
            Collections.reverse(list);
            for (r1 r13 : list) {
                r13.b(n6, n10, n11);
            }
            for (r1 r13 : list) {
                if (!r13.a(n6, n10, n11)) continue;
                r12 = r13;
                break;
            }
            if (r12 != null) {
                if (r12 instanceof rc && this.x != null) {
                    this.a(this.x);
                    this.x = null;
                } else {
                    this.a(r12);
                }
            }
        }
    }

    public static void a(we we2) {
        V.remove(we2);
        V.add(we2);
        Y = we2;
    }

    public void aa() {
        List<r1> list = this.Y();
        Collections.reverse(list);
        for (r1 r12 : list) {
            if (!r12.e() || !r12.g()) continue;
            this.D = r12;
            break;
        }
    }

    public static List<we> T() {
        return V;
    }

    public r1 ao() {
        return this.D;
    }

    public sb S() {
        return this.H;
    }

    public void a(sb sb2) {
        this.H = sb2;
    }

    public void a(sb sb2, boolean bl) {
        if (bl && this.H != null && !this.H.equals(sb2)) {
            this.H.e(false);
        }
        if (bl) {
            // empty if block
        }
    }

    public static we ap() {
        return Y;
    }

    public static void e(String string) {
        we we2 = null;
        for (we we3 : V) {
            if (!(we3 instanceof wy) || !((wy)we3).al().equalsIgnoreCase(string)) continue;
            we3.a(!we3.b());
            we2 = we3;
        }
        if (we2 != null) {
            we2.ac();
        }
    }

    public static void a(Class class_) {
        Object t2 = zu.b(class_);
        if (t2 != null) {
            ((we)t2).a(!((wM)t2).b());
            ((we)t2).ac();
        }
    }

    public static <T extends we> T b(Class<T> class_) {
        for (we we2 : V) {
            if (!we2.getClass().getCanonicalName().equals(class_.getCanonicalName())) continue;
            return (T)we2;
        }
        return null;
    }

    public static we f(String string) {
        for (we we2 : V) {
            if (!(we2 instanceof wy) || !((wy)we2).al().equalsIgnoreCase(string)) continue;
            return we2;
        }
        return null;
    }

    public static void an() {
        for (we we2 : V) {
            if (!(we2 instanceof wy) || we2 instanceof wT) continue;
            int n6 = ((wy)we2).ao();
            if (!(we2.Y() instanceof xW)) continue;
            ((xW)we2.Y()).a(n6);
        }
    }

    public static void a(CQ cQ) {
        for (we we2 : V) {
            if (!zu.T.R.v().equals(zu.T.ad) && we2 instanceof wT || !(we2 instanceof wy) || !((wy)we2).an().equals(cQ)) continue;
            int n6 = ((wy)we2).ao();
            if (!(we2.Y() instanceof xW)) continue;
            ((xW)we2.Y()).a(n6);
        }
    }

    public static boolean aq() {
        for (we we2 : V) {
            if (!we2.af() || !we2.b()) continue;
            return true;
        }
        return false;
    }

    public boolean ab() {
        if (this.ak() != null && (this.ak().equals(this.ab) || this.ak().equals(this.B))) {
            return false;
        }
        return this.aj == null || this.aj.v().equals(this.K);
    }

    public static boolean ag() {
        return N;
    }

    static boolean e(boolean bl) {
        N = bl;
        return N;
    }

    static boolean a(zu zu2) {
        return zu2.ag;
    }

    static boolean a(zu zu2, boolean bl) {
        zu2.ag = bl;
        return zu2.ag;
    }

    static {
        ae = Color.WHITE;
        zu.g(null);
        V = new CopyOnWriteArrayList<we>();
    }

    public static void g(String string) {
        z = string;
    }

    public static String ai() {
        return z;
    }
}

