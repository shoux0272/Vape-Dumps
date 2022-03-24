/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  iReSqtkUVgHIRiReSqtkUVg
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
import a.a;
import a.d;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgypOiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private static final int m = 2;
    public static Color b = Color.WHITE;
    public static iReSqtkUVgWxfiReSqtkUVg c;
    private static iReSqtkUVgilmiReSqtkUVg n;
    private static iReSqtkUVgcvhiReSqtkUVg o;
    private static int p;
    private static boolean q;
    public int d = 0;
    public iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Blur Background", true, "Blur the background of the GUI");
    public iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Rescale", true, "Rescales the GUI");
    public iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Enable Multi-Keybinding", false, "Allows you to set multiple keys to be held together\nto toggle modules");
    public iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Edit GUI", false, "Check this to enable or disable the visibility of modules included in the GUI");
    public iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "GUI bind indicator", true, "Displays a message indicating your GUI keybind upon injecting.\nI.E. \"Press RSHIFT to open GUI\"");
    public iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a(this, "Smooth font", false);
    public boolean k = true;
    private boolean r = false;
    private int s = -1;
    private static List<iReSqtkUVgHIRiReSqtkUVg> t;
    private boolean u;
    public static boolean l;
    private iReSqtkUVgJOBiReSqtkUVg v;
    private iReSqtkUVgJOBiReSqtkUVg w;
    private iReSqtkUVgJOBiReSqtkUVg x;

    public iReSqtkUVgypOiReSqtkUVg() {
        super("GUI", 54, 0, iReSqtkUVgqTOiReSqtkUVg.b, "Shift click any module button to bind it to a key.\n(You can shift click this to bind the GUI)\nHold TAB to view modules binds.");
        ((iReSqtkUVgRNziReSqtkUVg)this.h.c()).D().a(new iReSqtkUVgsUOiReSqtkUVg(this));
        ((iReSqtkUVgRNziReSqtkUVg)this.h.c()).D().a(new iReSqtkUVgEwaiReSqtkUVg(this));
        this.s = iReSqtkUVgeLLiReSqtkUVg.i().m();
        ((iReSqtkUVgRNziReSqtkUVg)this.j.c()).a(new iReSqtkUVgNFtiReSqtkUVg(this));
        this.a(this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public void a(iReSqtkUVgJOBiReSqtkUVg iReSqtkUVgJOBiReSqtkUVg2) {
        this.x = iReSqtkUVgJOBiReSqtkUVg2;
    }

    public void x() {
        this.a(this.v);
    }

    public void y() {
        iReSqtkUVgFCaiReSqtkUVg.f.S();
        this.a(this.w);
    }

    public static void z() {
        if (iReSqtkUVgeLLiReSqtkUVg.i().w() > 0 || !iReSqtkUVgeLLiReSqtkUVg.i().x()) {
            return;
        }
        q = iReSqtkUVgeLLiReSqtkUVg.i().o();
        if (q) {
            iReSqtkUVgeLLiReSqtkUVg.i().b(false);
            iReSqtkUVgeLLiReSqtkUVg.u().a(iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
            if (!iReSqtkUVgeLLiReSqtkUVg.n().b()) {
                iReSqtkUVgeLLiReSqtkUVg.n().a(iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
            }
            iReSqtkUVgeLLiReSqtkUVg.w().d();
        }
        c = iReSqtkUVgWxfiReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.t(), iReSqtkUVgeLLiReSqtkUVg.n().e(), iReSqtkUVgeLLiReSqtkUVg.u(), new iReSqtkUVgsXgiReSqtkUVg(iReSqtkUVgAUziReSqtkUVg.f()[p]));
        iReSqtkUVgeLLiReSqtkUVg.n().a(c);
        c.a(iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
        iReSqtkUVgeLLiReSqtkUVg.n().a(true);
    }

    public static void A() {
        if (iReSqtkUVgeLLiReSqtkUVg.i().w() > 0 || !iReSqtkUVgeLLiReSqtkUVg.i().x()) {
            return;
        }
        if (q) {
            iReSqtkUVgeLLiReSqtkUVg.u().a(iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
            if (!iReSqtkUVgeLLiReSqtkUVg.n().b()) {
                iReSqtkUVgeLLiReSqtkUVg.n().a(iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
            }
            iReSqtkUVgeLLiReSqtkUVg.w().d();
            iReSqtkUVgeLLiReSqtkUVg.i().b(true);
        }
        if (c != null) {
            iReSqtkUVgeLLiReSqtkUVg.n().a(false);
            iReSqtkUVgeLLiReSqtkUVg.n().a(new iReSqtkUVgWxfiReSqtkUVg(null));
            c.d();
            c = null;
        }
    }

    public static void a(iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2) {
        n = iReSqtkUVgilmiReSqtkUVg2;
    }

    public static void b(iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2) {
        if (n != null && n.equals(iReSqtkUVgilmiReSqtkUVg2)) {
            n.a_(false);
            n = null;
        }
    }

    public static void B() {
        if (n != null && iReSqtkUVgFuiiReSqtkUVg.e.r().e.i().booleanValue() && n.h()) {
            iReSqtkUVguKSiReSqtkUVg.a(n.c() - 1.0, n.e_() - 2.0, n.c() + n.k() + 2.0, n.e_() + n.l() + 1.0, 0.0, 0.0, 0.0, 0.9);
            n.a(true);
        }
    }

    public static void C() {
        if (o != null) {
            o.a_(o.f().c() + o.f().k() + 6.0);
            o.b(o.f().e_());
            o.c_();
            o.a(true);
        }
    }

    public static iReSqtkUVgcvhiReSqtkUVg D() {
        return o;
    }

    public static void a(iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2) {
        o = iReSqtkUVgcvhiReSqtkUVg2;
    }

    @Override
    public void a() {
        super.a();
        if (this.b()) {
            if (this.f.i().booleanValue() && this.k) {
                this.s = iReSqtkUVgeLLiReSqtkUVg.i().m();
                iReSqtkUVgeLLiReSqtkUVg.i().b(2);
            }
            iReSqtkUVgeLLiReSqtkUVg.a(new iReSqtkUVgMiPiReSqtkUVg(a.d.getGuiObject()));
            this.k = false;
        } else {
            this.k = true;
        }
    }

    public void b(iReSqtkUVgYAGiReSqtkUVg iReSqtkUVgYAGiReSqtkUVg2) {
        if (this.f.i().booleanValue()) {
            if (this.s == -1) {
                this.s = iReSqtkUVgeLLiReSqtkUVg.i().m();
                iReSqtkUVgeLLiReSqtkUVg.i().b(2);
            }
        } else if (this.s != -1) {
            iReSqtkUVgeLLiReSqtkUVg.i().b(this.s);
            this.s = -1;
        }
        if (this.d++ > 20) {
            this.d = 0;
        }
        if (iReSqtkUVgYAGiReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            if (a.a.ib()) {
                if (this.r) {
                    if (b.getBlue() < 190) {
                        this.r = false;
                    } else {
                        b = new Color(b.getRed(), b.getGreen() - 2, b.getBlue() - 2);
                    }
                } else if (b.getBlue() >= 230) {
                    this.r = true;
                } else {
                    b = new Color(b.getRed(), b.getGreen() + 2, b.getBlue() + 2);
                }
            }
            for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.e().a()) {
                iReSqtkUVgZfciReSqtkUVg iReSqtkUVgZfciReSqtkUVg2;
                if (!(iReSqtkUVgWaoiReSqtkUVg2 instanceof iReSqtkUVgZfciReSqtkUVg) || !(iReSqtkUVgZfciReSqtkUVg2 = (iReSqtkUVgZfciReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg2).m()) continue;
                iReSqtkUVgZfciReSqtkUVg2.n();
            }
        }
    }

    public static void a(iReSqtkUVgHIRiReSqtkUVg iReSqtkUVgHIRiReSqtkUVg2) {
        t.add(iReSqtkUVgHIRiReSqtkUVg2);
    }

    public void b(iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.f().b() || !iReSqtkUVgeLLiReSqtkUVg.f().a().getClass().isInstance(a.d.getGuiObject())) {
            boolean bl = this.f.i() != false && iReSqtkUVgFCaiReSqtkUVg.k.p.i() != false;
            float f = 0.0f;
            if (bl) {
                iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2 = iReSqtkUVgdAbiReSqtkUVg.a(new iReSqtkUVgeLLiReSqtkUVg(), iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
                int n = iReSqtkUVgdAbiReSqtkUVg2.d();
                float f2 = (float)(n == 5 ? 0.4 : (n == 4 ? 0.5 : (n == 3 ? 0.66666 : (n == 2 ? 1.0 : (n == 1 ? 2.0 : (n == 0 ? 0.5 : 1.0))))));
                f = 1.0f / f2;
                GL11.glScalef((float)f2, (float)f2, (float)f2);
            }
            this.O();
            if (bl) {
                GL11.glScalef((float)f, (float)f, (float)f);
            }
        }
    }

    public Color a(Object object) {
        if (!iReSqtkUVgSzRiReSqtkUVg.n.isInstance(object)) {
            return null;
        }
        if (object.equals(iReSqtkUVgeLLiReSqtkUVg.e())) {
            return null;
        }
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(object);
        float f = iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgeLLiReSqtkUVg.e());
        if (iReSqtkUVgSzRiReSqtkUVg.B.isInstance(object)) {
            if (iReSqtkUVgFuiiReSqtkUVg.e.j().b(iReSqtkUVgVnKiReSqtkUVg2.x()) && iReSqtkUVgFuiiReSqtkUVg.e.j().d.i().booleanValue()) {
                return iReSqtkUVgFuiiReSqtkUVg.e.j().e.k();
            }
            return Color.WHITE;
        }
        return null;
    }

    private void O() {
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.m().d()) {
            if (iReSqtkUVgCMeiReSqtkUVg2.G()) {
                iReSqtkUVgCMeiReSqtkUVg2.c_();
                iReSqtkUVgCMeiReSqtkUVg2.a(true);
                continue;
            }
            if (!(iReSqtkUVgCMeiReSqtkUVg2 instanceof iReSqtkUVgYAniReSqtkUVg)) continue;
            ((iReSqtkUVgYAniReSqtkUVg)iReSqtkUVgCMeiReSqtkUVg2).l(true);
        }
    }

    public List<iReSqtkUVgCMeiReSqtkUVg> E() {
        return new CopyOnWriteArrayList<iReSqtkUVgCMeiReSqtkUVg>(this.x.a());
    }

    public void a(iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2) {
        List<iReSqtkUVgCMeiReSqtkUVg> list = this.E();
        Collections.reverse(list);
        ArrayList<iReSqtkUVgFWjiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgFWjiReSqtkUVg>();
        for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2 : list) {
            if (!iReSqtkUVgcvhiReSqtkUVg2.h()) {
                if (!iReSqtkUVgcvhiReSqtkUVg2.Q()) continue;
                iReSqtkUVgcvhiReSqtkUVg2.c_();
                continue;
            }
            iReSqtkUVgcvhiReSqtkUVg2.c_();
            iReSqtkUVgcvhiReSqtkUVg2.a(false);
            if (Keyboard.isKeyDown((int)62)) {
                iReSqtkUVgcvhiReSqtkUVg2.e(iReSqtkUVgdAbiReSqtkUVg2);
                iReSqtkUVgcvhiReSqtkUVg2.j(iReSqtkUVgdAbiReSqtkUVg2);
            }
            boolean bl = iReSqtkUVgcvhiReSqtkUVg2.c(iReSqtkUVgdAbiReSqtkUVg2);
            boolean bl2 = iReSqtkUVgcvhiReSqtkUVg2.h(iReSqtkUVgdAbiReSqtkUVg2);
            if (!bl && !bl2) continue;
            String string = iReSqtkUVgcvhiReSqtkUVg2.N();
            double d2 = iReSqtkUVgeLLiReSqtkUVg.h().a(string);
            double d3 = iReSqtkUVgeLLiReSqtkUVg.h().b(string);
            double d4 = bl ? (double)iReSqtkUVgdAbiReSqtkUVg2.e() - d2 : iReSqtkUVgcvhiReSqtkUVg2.c();
            double d5 = bl2 ? (double)iReSqtkUVgdAbiReSqtkUVg2.f() - d3 : iReSqtkUVgcvhiReSqtkUVg2.e_();
            iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = iReSqtkUVgcvhiReSqtkUVg2.P();
            iReSqtkUVgFWjiReSqtkUVg2.a_(d4 - 4.0);
            iReSqtkUVgFWjiReSqtkUVg2.b(d5);
            iReSqtkUVgFWjiReSqtkUVg2.c(iReSqtkUVgFWjiReSqtkUVg2.D().E() + 4.0);
            iReSqtkUVgFWjiReSqtkUVg2.d(10.0);
            iReSqtkUVgFWjiReSqtkUVg2.a_(true);
            arrayList.add(iReSqtkUVgFWjiReSqtkUVg2);
        }
        for (iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg3 : arrayList) {
            iReSqtkUVgFWjiReSqtkUVg3.c_();
            iReSqtkUVgFWjiReSqtkUVg3.a(true);
        }
    }

    public void b(Object object) {
        iReSqtkUVgFuiiReSqtkUVg.e.c().d.b(object);
        iReSqtkUVgypOiReSqtkUVg.b(n);
        if (this.x.equals(this.w)) {
            this.x();
            iReSqtkUVgFuiiReSqtkUVg.e.c(true);
            return;
        }
        if (this.f.i().booleanValue() && this.s != -1) {
            iReSqtkUVgeLLiReSqtkUVg.i().b(this.s);
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class).e.i().booleanValue()) {
            iReSqtkUVgypOiReSqtkUVg.A();
        }
        if (!iReSqtkUVgFuiiReSqtkUVg.e.g) {
            this.a();
        }
    }

    public boolean F() {
        return this.k;
    }

    public void c(boolean bl) {
        this.u = bl;
        ((iReSqtkUVgRNziReSqtkUVg)this.h.c()).D().b(this.u);
    }

    public boolean G() {
        return this.u;
    }

    @Override
    public void i() {
        l = this.j.i();
        this.x = this.v = new iReSqtkUVgJOBiReSqtkUVg(iReSqtkUVgFuiiReSqtkUVg.e.m().d());
        this.w = new iReSqtkUVgJOBiReSqtkUVg(iReSqtkUVgFCaiReSqtkUVg.f, iReSqtkUVgFCaiReSqtkUVg.g, iReSqtkUVgFCaiReSqtkUVg.h);
    }

    public void H() {
        if (this.e.i().booleanValue()) {
            if (c == null) {
                iReSqtkUVgypOiReSqtkUVg.z();
            }
        } else if (c != null) {
            iReSqtkUVgypOiReSqtkUVg.A();
        }
        iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2 = iReSqtkUVgdAbiReSqtkUVg.a(new iReSqtkUVgeLLiReSqtkUVg(), iReSqtkUVgeLLiReSqtkUVg.p(), iReSqtkUVgeLLiReSqtkUVg.q());
        int n = iReSqtkUVgeLLiReSqtkUVg.p();
        int n2 = iReSqtkUVgeLLiReSqtkUVg.q();
        int n3 = iReSqtkUVgdAbiReSqtkUVg2.d();
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        String string = "v3.25";
        iReSqtkUVgpeziReSqtkUVg2.a(string, (double)(iReSqtkUVgdAbiReSqtkUVg2.e() - iReSqtkUVgpeziReSqtkUVg2.a(string) - 10), (double)(iReSqtkUVgdAbiReSqtkUVg2.f() - 10), b);
        iReSqtkUVgMSwiReSqtkUVg.a(b, n / n3 - 100, n2 / n3 - 80, "rape", 2.8f, false);
        this.a(iReSqtkUVgdAbiReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.l.l(false);
        iReSqtkUVgypOiReSqtkUVg.C();
        iReSqtkUVgypOiReSqtkUVg.B();
    }

    static /* synthetic */ boolean a(iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2, boolean bl) {
        iReSqtkUVgypOiReSqtkUVg2.u = bl;
        return iReSqtkUVgypOiReSqtkUVg2.u;
    }

    static {
        p = 18;
        t = new ArrayList<iReSqtkUVgHIRiReSqtkUVg>();
    }
}

