/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package manthe;

import a.a;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Al;
import manthe.BI;
import manthe.CQ;
import manthe.Ds;
import manthe.cB;
import manthe.ds;
import manthe.k5;
import manthe.kA;
import manthe.kF;
import manthe.kJ;
import manthe.kK;
import manthe.kN;
import manthe.kO;
import manthe.kS;
import manthe.kT;
import manthe.kU;
import manthe.kZ;
import manthe.k_;
import manthe.ka;
import manthe.kc;
import manthe.kd;
import manthe.ke;
import manthe.kf;
import manthe.ki;
import manthe.km;
import manthe.kn;
import manthe.kq;
import manthe.ks;
import manthe.kt;
import manthe.ku;
import manthe.kx;
import manthe.ky;
import manthe.l1;
import manthe.lG;
import manthe.lK;
import manthe.lf;
import manthe.ll;
import manthe.lz;
import manthe.ng;
import manthe.on;
import manthe.p1;
import manthe.pJ;
import manthe.pK;
import manthe.qY;
import manthe.s7;
import manthe.yc;
import manthe.yt;
import manthe.zu;

public class y5
extends yt
implements BI {
    private final String h;
    private final int s;
    private final int j;
    private final List<Ds> f = new ArrayList<Ds>();
    private final List<p1> n = new ArrayList<p1>();
    private final List<yc> d = new ArrayList<yc>();
    protected CQ e;
    private String o;
    private boolean p;
    private boolean q;
    private boolean k = false;
    private String l;
    private pK r;
    private s7 g;
    private boolean i = true;
    private boolean m;
    private static int t;

    public y5(String string, int n6, int n10, CQ cQ, String string2) {
        this.h = string;
        this.s = n6;
        this.j = n10;
        this.e = cQ;
        this.l = string2;
        if (n6 != 0) {
            this.c().add(n6);
        }
    }

    public y5(String string, int n6, CQ cQ) {
        this(string, 0, n6, cQ, null);
    }

    public y5(String string, int n6, CQ cQ, String string2) {
        this(string, 0, n6, cQ, string2);
    }

    private y5(String string, int n6) {
        this(string, n6, 0, CQ.b, null);
    }

    public y5(String string) {
        this(string, 0, CQ.b);
    }

    public void z() {
        if (this.n() && !a.ib()) {
            return;
        }
        if (this.p() && this.c().isEmpty()) {
            return;
        }
        boolean bl = this.p;
        this.d(!this.p);
        if (ng.b != null) {
            ng.b.an();
        }
        if (zu.T.M.u().booleanValue() && bl != this.p && this.Q() != CQ.b) {
            on.p.r().a(new Al(pJ.INFO, "Module Toggled", new qY(this.H() + " \u00a7fhas been " + (this.N() ? "\u00a7aEnabled" : "\u00a7cDisabled") + "\u00a7f!", pJ.INFO, true), 0.0, 0.0, 750L));
        }
    }

    public boolean N() {
        return this.p;
    }

    public void a(boolean bl, boolean bl2) {
        if (this.n() && !a.ib()) {
            return;
        }
        if (!bl2 && this.l() != null && !this.x() && bl) {
            on.p.r().a("Hidden Module", "Attempted to toggle " + this.H() + "!", pJ.WARNING, 2500L);
            return;
        }
        this.p = bl;
        if (this.p) {
            this.s();
        } else {
            this.J();
        }
        on.p.H().a(this);
        if (this.l() != null) {
            this.l().n(this.p);
        }
    }

    public void d(boolean bl) {
        this.a(bl, false);
    }

    @Override
    public String H() {
        return this.h;
    }

    public String w() {
        return this.o != null && !this.o.equals("") ? cB.v + "7 " + this.o : "";
    }

    public void a(String string) {
        this.o = string;
    }

    public int y() {
        return this.j;
    }

    public CQ Q() {
        return this.e;
    }

    public boolean n() {
        return false;
    }

    public void a(kZ kZ2) {
        if (kZ2.getKey() <= 0) {
            return;
        }
        if (this.c().isEmpty()) {
            return;
        }
        if (kZ2.isDown() && ds.x().a() == null) {
            this.a(kZ2.getKey());
        }
    }

    public void a(ki ki2) {
    }

    public void s() {
        this.d.forEach(y5::s);
    }

    public void J() {
        this.d.forEach(y5::J);
    }

    public void b(kt kt2) {
    }

    public void a(kt kt2) {
    }

    public void a(kn kn2) {
    }

    public void a(kx kx2) {
    }

    public void b(kx kx2) {
    }

    public void a(kA kA2) {
    }

    public void a(lK lK2) {
    }

    public void a(ll ll2) {
    }

    public void a(k5 k52) {
    }

    public void a(l1 l12) {
    }

    public void a(kc kc2) {
    }

    public void a(kq kq2) {
    }

    public void a(lG lG2) {
    }

    public void a(lf lf2) {
    }

    public void a(lz lz2) {
    }

    public void a(ks ks2) {
    }

    public void a(km km2) {
    }

    public void a(kd kd2) {
    }

    public void a(ku ku2) {
    }

    public void t() {
    }

    public void a(kf kf2) {
    }

    public void a(kT kT2) {
    }

    public void a(kJ kJ2) {
    }

    public void b(ke ke2) {
    }

    public void a(ke ke2) {
    }

    public void a(kU kU2) {
    }

    public void a(ky ky2) {
    }

    public void a(kF kF2) {
    }

    public void a(kN kN2) {
    }

    public void a(kK kK2) {
    }

    public void a(kS kS2) {
    }

    public void a(k_ k_2) {
    }

    public void a(ka ka2) {
    }

    public void a(kO kO2) {
    }

    public void k() {
    }

    public void m() {
    }

    public void a(y5 y52) {
    }

    public List<yc> O() {
        return this.d;
    }

    public List<Ds> r() {
        return this.f;
    }

    public yc b(String string) {
        for (yc yc2 : this.O()) {
            if (!yc2.H().equalsIgnoreCase(string)) continue;
            return yc2;
        }
        return null;
    }

    public Ds c(String string) {
        for (Ds ds2 : this.r()) {
            if (!ds2.e().equalsIgnoreCase(string) && !ds2.H().equalsIgnoreCase(string)) continue;
            return ds2;
        }
        return null;
    }

    public void a(yc ... arryc) {
        this.O().addAll(Arrays.asList(arryc));
    }

    public void a(Ds ... arrds) {
        this.r().addAll(Arrays.asList(arrds));
    }

    public List<p1> K() {
        if (!this.k) {
            this.I();
        }
        return this.n;
    }

    private void I() {
        for (Ds ds2 : this.r()) {
            if (ds2.c() == null) continue;
            this.n.add((p1)ds2.c());
        }
        this.k = true;
    }

    public JsonObject R() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.H());
        jsonObject.add("keybinds", (JsonElement)this.b());
        JsonArray jsonArray = new JsonArray();
        for (Ds ds2 : this.f) {
            if (!ds2.f()) continue;
            jsonArray.add((JsonElement)ds2.m());
        }
        jsonObject.add("values", (JsonElement)jsonArray);
        if (this.g != null) {
            jsonObject.addProperty("visible", Boolean.valueOf(this.g.Y().G()));
        }
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        this.c().clear();
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull() && jsonObject.get("name").getAsString().equalsIgnoreCase(this.H())) {
            if (jsonObject.get("keybind") != null && !jsonObject.get("keybind").isJsonNull()) {
                this.c(jsonObject.get("keybind").getAsInt());
                this.c().add(this.P());
            } else if (jsonObject.get("keybinds") != null && jsonObject.get("keybinds").isJsonArray()) {
                try {
                    this.a(jsonObject.getAsJsonArray("keybinds"));
                }
                catch (Exception exception) {}
            } else {
                this.c().clear();
                this.c().add(this.s);
            }
            JsonArray jsonArray = jsonObject.getAsJsonArray("values");
            Iterator iterator = jsonArray.iterator();
            while (iterator.hasNext()) {
                JsonObject jsonObject2 = ((JsonElement)iterator.next()).getAsJsonObject();
                for (Ds ds2 : this.f) {
                    if (!ds2.e().equalsIgnoreCase(jsonObject2.get("id").getAsString())) continue;
                    ds2.a(jsonObject2);
                }
            }
            if (jsonObject.get("visible") != null && !jsonObject.get("visible").isJsonNull() && this.g != null) {
                boolean bl = jsonObject.get("visible").getAsBoolean();
                this.g.Y().g(bl);
            }
        }
    }

    public String M() {
        return this.l;
    }

    public void d(String string) {
        this.l = string;
    }

    public int P() {
        return this.s;
    }

    public void q() {
    }

    public void a(long l, boolean bl) {
        if (this.r != null) {
            this.r.a(false);
        }
        this.r = new pK(this, l, bl);
        new Thread(this.r).start();
    }

    public boolean p() {
        return this.q;
    }

    @Override
    public String g() {
        return String.format(" %s7[%sr%s%s7]%sr %s", cB.v, cB.v, this.a(), cB.v, cB.v, this.H());
    }

    public String toString() {
        return "Module{name='" + this.h + '\'' + ", defaultKeybind=" + this.s + ", guiColor=" + this.j + ", values=" + this.f + ", components=" + this.n + ", subModules=" + this.d + ", guiCategory=" + this.e + ", suffix='" + this.o + '\'' + ", enabled=" + this.p + ", requiresBind=" + this.q + ", registeredComponents=" + this.k + ", tooltip='" + this.l + '\'' + ", moduleRunnable=" + this.r + ", guiButton=" + this.g + ", defaultVisible=" + this.i + ", favorited=" + this.m + '}';
    }

    @Override
    public void h() {
        this.z();
    }

    public boolean v() {
        return this.i;
    }

    public void c(boolean bl) {
        this.i = bl;
    }

    public s7 l() {
        return this.g;
    }

    public void a(s7 s72) {
        this.g = s72;
    }

    public boolean x() {
        if (this.g == null || this.g.Y() == null) {
            return false;
        }
        return this.g.Y().G();
    }

    public boolean L() {
        return this.m;
    }

    public void a(boolean bl) {
        if (bl) {
            on.p.A().b(this);
        } else {
            on.p.A().c(this);
        }
    }

    public void b(boolean bl) {
        this.m = bl;
    }

    @Override
    public boolean j() {
        return this.p;
    }

    public static void d(int n6) {
        t = n6;
    }

    public static int u() {
        return t;
    }

    public static int o() {
        int n6 = y5.u();
        if (n6 == 0) {
            return 24;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException b(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (y5.o() == 0) {
            y5.d(61);
        }
    }
}

