/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import a.a;
import a.d;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executors;
import manthe.A5;
import manthe.AE;
import manthe.AL;
import manthe.Ak;
import manthe.Bx;
import manthe.D_;
import manthe.Dl;
import manthe.V;
import manthe.bN;
import manthe.bZ;
import manthe.bi;
import manthe.bu;
import manthe.c8;
import manthe.cB;
import manthe.c_;
import manthe.cr;
import manthe.cy;
import manthe.ds;
import manthe.gt;
import manthe.k9;
import manthe.mA;
import manthe.mL;
import manthe.mq;
import manthe.ng;
import manthe.pJ;
import manthe.pV;
import manthe.qD;
import manthe.sD;
import manthe.t;
import manthe.t8;
import manthe.u;
import manthe.ud;
import manthe.v;
import manthe.va;
import manthe.w0;
import manthe.y0;
import manthe.yN;
import manthe.yZ;
import manthe.yf;
import manthe.zu;

public class on {
    public static final boolean A = false;
    public static final boolean f = false;
    public static final String n = "4.06";
    private static final int[] H = new int[]{13, 15, 23};
    public static boolean C = false;
    public static boolean D;
    public static on p;
    private final ConcurrentMap<Integer, mq> N = new ConcurrentHashMap<Integer, mq>();
    private final ConcurrentMap<Integer, mq> F = new ConcurrentHashMap<Integer, mq>();
    private final ConcurrentMap<Integer, mq> m = new ConcurrentHashMap<Integer, mq>();
    private final ConcurrentMap<Integer, mq> l = new ConcurrentHashMap<Integer, mq>();
    private final boolean r;
    private final Dl W;
    private final yZ o;
    public gt j;
    public boolean s;
    private t R;
    private pV c;
    private cr L;
    private AL w;
    private t8 g;
    private mA T;
    private va v;
    private c_ K;
    private ud S;
    private ng O;
    private v V;
    private bu z;
    private cB J;
    private yf u;
    private c8 E;
    private sD x;
    private boolean e;
    private boolean d;
    private mq h;
    private mq G;
    private mq B;
    private mq Q;
    private mq y;
    private mq M;
    private bZ X;
    private yN Y;
    private String P;
    private boolean q;
    private bN k;
    private bi U;
    private AE t;
    private D_ I;
    private final String i = "proxima";
    private final String Z = "arial";
    private static String[] b;

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public on() {
        super();
        var1_1 = on.P();
        this.W = new Dl();
        this.o = new yZ();
        this.i = "proxima";
        this.Z = "arial";
        on.p = this;
        this.r = a.iv();
        v0 = this;
        if (var1_1 == null) ** GOTO lbl19
        if (v0.r != false) return;
        this.j = new gt();
        try {
            v0 = this;
lbl19:
            // 2 sources

            v0.j.a();
            return;
        }
        catch (Exception var2_2) {
            // empty catch block
        }
    }

    public static void a(String string) {
        a.p(String.format("[%02d] %s", System.currentTimeMillis(), string));
    }

    public static void a(Exception exception) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exception.printStackTrace(printWriter);
        String string = "\nException " + exception.getClass().getCanonicalName() + " " + stringWriter.toString();
        on.a(string);
    }

    public static boolean C() {
        for (int n6 : H) {
            if (n6 != manthe.V.c()) continue;
            return true;
        }
        return false;
    }

    public void i() {
        block2: {
            String[] arrstring = on.P();
            A5.a();
            String[] arrstring2 = arrstring;
            on on2 = this;
            if (arrstring2 != null) {
                if (on2.r) {
                    a.fs();
                    A5.a();
                    a.rsc();
                }
                this.R = new t();
                this.R.c();
                a.fs();
                manthe.t.b_.clear();
                this.R = new t();
                on2 = this;
            }
            on2.R.c();
            a.su(ds.E().f());
            Executors.newSingleThreadExecutor().execute(new u(this));
            if (!cy.b()) break block2;
            on.b(new String[4]);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public void B() {
        String[] arrstring = on.P();
        on on2 = this;
        if (arrstring != null) {
            block9: {
                if (!on2.r) {
                    this.g = new t8();
                    this.g.a();
                    while (!this.g.b()) {
                        try {
                            Thread.sleep(10L);
                        }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                            if (arrstring != null) {
                                continue;
                            }
                            break block9;
                        }
                    }
                    return;
                }
            }
            this.k = new bN();
            this.k.e();
            on2 = this;
        }
        on2.k.a();
        while (!this.k.f()) {
            try {
                Thread.sleep(10L);
                if (arrstring == null) return;
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
                if (arrstring != null) continue;
            }
        }
        this.k.b();
    }

    public void v() {
        block6: {
            on on2;
            block4: {
                block5: {
                    String[] arrstring = on.P();
                    on2 = this;
                    if (arrstring == null) break block4;
                    if (on2.r) break block5;
                    this.g.c();
                    if (arrstring != null) break block6;
                }
                this.k.c();
                on2 = this;
            }
            on2.k.a();
        }
        if (manthe.V.c() == 15) {
            // empty if block
        }
    }

    public void Q() {
        on on2;
        String[] arrstring;
        block9: {
            block10: {
                String[] arrstring2 = on.P();
                this.T = new mA();
                this.T.a(24, 1);
                this.B();
                this.c = new pV();
                this.E = new c8();
                this.v = new va();
                this.K = new c_();
                this.V = new v();
                this.z = new bu();
                this.J = new cB();
                this.u = new yf();
                this.L = new cr();
                this.L.g();
                this.J.E = this.L.b(y0.class);
                this.w = new AL();
                this.O = new ng();
                arrstring = arrstring2;
                this.O.c();
                this.S = new ud();
                this.S.a((JsonObject)null);
                this.L.d();
                this.z();
                this.L.a();
                this.v();
                on2 = this;
                if (arrstring != null) {
                    if (on2.J.n.u().booleanValue() && on.C()) {
                        ((qD)this.J.x.c()).g(true);
                        a.sb();
                        ((qD)this.J.x.c()).g(true);
                    }
                    on2 = this;
                }
                if (arrstring == null) break block9;
                if (on2.S.a() == null) break block10;
                on2 = p;
                if (arrstring == null) break block9;
                if (on2.D().a.u().booleanValue()) {
                    this.S.a().x();
                }
            }
            this.x = new sD();
            zu.an();
            w0.ar();
            on2 = p;
        }
        zu zu2 = on2.H().b(zu.class);
        if (arrstring != null) {
            if (zu2.w.u().booleanValue()) {
                this.o.a("Finished Loading", "Press " + zu2.a() + " to open GUI", 5000L);
            }
            this.q = false;
        }
        if (arrstring == null) {
            cy.b(!cy.c());
        }
    }

    public t M() {
        return this.R;
    }

    public void b(boolean bl) {
        new mL(this, bl).start();
    }

    public cr H() {
        return this.L;
    }

    public pV o() {
        return this.c;
    }

    public t8 O() {
        return this.g;
    }

    public boolean x() {
        return this.s;
    }

    public mA y() {
        return this.T;
    }

    public bZ s() {
        return this.X;
    }

    public va N() {
        return this.v;
    }

    public c_ b() {
        return this.K;
    }

    public ud l() {
        return this.S;
    }

    public v f() {
        return this.V;
    }

    public ng F() {
        return this.O;
    }

    public void a(JsonObject jsonObject) {
        JsonArray jsonArray;
        if (jsonObject.get("friends") != null && !jsonObject.get("friends").isJsonNull()) {
            jsonArray = jsonObject.get("friends").getAsJsonArray();
            this.v.a(jsonArray);
        }
        if (jsonObject.get("profiles") != null && !jsonObject.get("profiles").isJsonNull()) {
            jsonArray = jsonObject.get("profiles").getAsJsonObject();
            this.S.a((JsonObject)jsonArray);
        }
        if (jsonObject.get("otherdata") != null && !jsonObject.get("otherdata").isJsonNull() && (jsonArray = jsonObject.get("otherdata").getAsJsonArray()).size() > 0) {
            this.E.a(jsonArray);
            if (this.S.a(this.u.c.a()) != null) {
                Ak ak = this.S.a(this.u.c.a());
                this.S.c(ak);
            }
        }
    }

    public JsonObject c() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("friends", (JsonElement)this.v.c());
        jsonObject.add("profiles", (JsonElement)this.S.e());
        jsonObject.add("otherdata", (JsonElement)this.E.a());
        return jsonObject;
    }

    public void z() {
        try {
            String string = new String(Bx.a(a.gs()));
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
            if (jsonObject != null) {
                p.a(jsonObject);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void K() {
        try {
            try {
                if (p.l().a() != null) {
                    p.l().a().B();
                }
            }
            catch (Exception exception) {
                on.a(exception);
                a.mb(1);
            }
            JsonObject jsonObject = p.c();
            a.ss(Bx.a(jsonObject.toString().getBytes()));
            for (Ak ak : this.S.d()) {
                ak.a(true);
            }
            this.r().a("Saved Settings", "Your settings have been successfully saved.", 2000L);
        }
        catch (Exception exception) {
            // empty catch block
        }
        this.q = false;
    }

    public void p() {
        if (this.Y == null || this.Y.a()) {
            this.Y = new yN();
            new Thread(this.Y).start();
        } else {
            this.Y.a(true);
        }
    }

    public cB t() {
        return this.J;
    }

    public bu d() {
        return this.z;
    }

    public boolean L() {
        return this.e;
    }

    public void d(boolean bl) {
        this.e = bl;
    }

    public boolean m() {
        return this.d;
    }

    public void c(boolean bl) {
        this.d = bl;
    }

    public yf D() {
        return this.u;
    }

    public c8 T() {
        return this.E;
    }

    public sD R() {
        return this.x;
    }

    public AE e() {
        if (this.t == null) {
            this.t = new AE();
            this.I = new D_();
        }
        return this.t;
    }

    public D_ w() {
        return this.I;
    }

    public void S() {
        C = true;
        this.X = new bZ();
        this.X.a();
        this.o.a("Blatant Enabled", "Vape is now in Blatant Mode.", pJ.WARNING, 5000L);
    }

    public void k() {
        this.X.b();
    }

    private void a() {
        this.h = new mq("arial", 16);
        this.N.put(16, this.h);
        this.y = new mq("arial", 12);
        this.N.put(12, this.y);
        this.G = new mq("proxima", 16);
        this.F.put(16, this.G);
        this.M = new mq("proxima", 12);
        this.F.put(12, this.M);
        this.B = new mq("arialbd", 16);
        this.m.put(16, this.B);
        this.Q = new mq("proximabd", 16);
        this.l.put(16, this.Q);
    }

    public mq a(boolean bl) {
        if (bl) {
            return zu.T != null && zu.T.ab() ? this.Q : this.B;
        }
        return zu.T != null && zu.T.ab() ? this.G : this.h;
    }

    public mq j() {
        return this.a(false);
    }

    public mq E() {
        return zu.T != null && zu.T.ab() ? this.M : this.y;
    }

    public mq a(double d10) {
        return this.b(d10, true);
    }

    public mq b(double d10, boolean bl) {
        int n6;
        int n10 = (int)(16.0 * d10);
        int n11 = n6 = zu.T.aa.u() != false ? 1 : ds.s().x();
        if (n6 == 0) {
            n6 = 3;
        }
        if (!bl) {
            n6 = 1;
        }
        n10 *= n6;
        if (zu.T.ab()) {
            if (!this.F.containsKey(n10)) {
                mq mq2 = new mq("proxima", n10);
                this.F.put(n10, mq2);
                return mq2;
            }
            return (mq)this.F.get(n10);
        }
        if (!this.N.containsKey(n10)) {
            mq mq3 = new mq("arial", n10);
            this.N.put(n10, mq3);
            return mq3;
        }
        return (mq)this.N.get(n10);
    }

    public mq a(double d10, boolean bl) {
        int n6;
        int n10 = (int)(16.0 * d10);
        int n11 = n6 = zu.T.aa.u() != false ? 1 : ds.s().x();
        if (n6 == 0) {
            n6 = 3;
        }
        if (!bl) {
            n6 = 1;
        }
        n10 *= n6;
        if (zu.T.ab()) {
            if (!this.l.containsKey(n10)) {
                mq mq2 = new mq("proximabd", n10);
                this.l.put(n10, mq2);
                return mq2;
            }
            return (mq)this.l.get(n10);
        }
        if (!this.m.containsKey(n10)) {
            mq mq3 = new mq("arialbd", n10);
            this.m.put(n10, mq3);
            return mq3;
        }
        return (mq)this.m.get(n10);
    }

    public void G() {
        a.d.onGuiClosed(a.d.getGuiObject());
        ds.a(null);
        zu zu2 = this.H().b(zu.class);
        zu2.z();
        this.F().c();
        zu2.k();
        this.z();
    }

    public synchronized String J() {
        if (this.P == null) {
            String string = a.gp("all");
            byte[] arrby = Bx.a(string);
            this.P = new String(arrby);
        }
        return this.P;
    }

    public void n() {
        this.q = true;
    }

    public boolean q() {
        return this.q;
    }

    public boolean h() {
        return this.r;
    }

    public bN u() {
        return this.k;
    }

    public AL A() {
        return this.w;
    }

    public Dl I() {
        return this.W;
    }

    public void g() {
        this.a();
        k9.b();
    }

    public yZ r() {
        return this.o;
    }

    static bi a(on on2) {
        return on2.U;
    }

    static boolean c(on on2) {
        return on2.r;
    }

    static bN d(on on2) {
        return on2.k;
    }

    static AE b(on on2) {
        return on2.t;
    }

    static {
        on.b(new String[5]);
        D = false;
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static String[] P() {
        return b;
    }

    private static Exception b(Exception exception) {
        return exception;
    }
}

