/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A3;
import manthe.A7;
import manthe.AI;
import manthe.AQ;
import manthe.Ag;
import manthe.Ao;
import manthe.V;
import manthe.cy;
import manthe.on;
import manthe.pJ;
import manthe.y0;
import manthe.y5;
import manthe.yB;
import manthe.yD;
import manthe.yE;
import manthe.yF;
import manthe.yP;
import manthe.yR;
import manthe.yT;
import manthe.yX;
import manthe.yp;
import manthe.yq;
import manthe.yv;
import manthe.yy;
import manthe.z0;
import manthe.z1;
import manthe.z2;
import manthe.z3;
import manthe.z5;
import manthe.z6;
import manthe.z7;
import manthe.z8;
import manthe.z9;
import manthe.zA;
import manthe.zB;
import manthe.zC;
import manthe.zD;
import manthe.zE;
import manthe.zF;
import manthe.zG;
import manthe.zH;
import manthe.zI;
import manthe.zJ;
import manthe.zK;
import manthe.zL;
import manthe.zM;
import manthe.zN;
import manthe.zO;
import manthe.zP;
import manthe.zQ;
import manthe.zR;
import manthe.zT;
import manthe.zU;
import manthe.zV;
import manthe.zX;
import manthe.zY;
import manthe.zZ;
import manthe.z_;
import manthe.za;
import manthe.zb;
import manthe.zc;
import manthe.zd;
import manthe.ze;
import manthe.zf;
import manthe.zh;
import manthe.zi;
import manthe.zj;
import manthe.zk;
import manthe.zl;
import manthe.zm;
import manthe.zn;
import manthe.zo;
import manthe.zp;
import manthe.zr;
import manthe.zs;
import manthe.zt;
import manthe.zu;
import manthe.zv;
import manthe.zx;
import manthe.zy;
import manthe.zz;

public class cr {
    private final Map<Class, y5> a = new HashMap<Class, y5>();
    private final HashSet<y5> b = new HashSet();

    public void g() {
        int n6;
        block9: {
            int n10;
            int n11;
            block8: {
                this.b(new zx());
                this.b(new zu());
                this.b(new z1());
                this.b(new zi());
                this.b(new zZ());
                this.b(new yF());
                this.b(new yX());
                this.b(new z0());
                this.b(new zR());
                this.b(new zE());
                this.b(new z2());
                this.b(new Ag());
                this.b(new z7());
                this.b(new z5());
                this.b(new AI());
                this.b(new zO());
                int n12 = y5.o();
                this.b(new zo());
                n6 = n12;
                this.b(new zF());
                this.b(new zy());
                this.b(new A7());
                this.b(new zG());
                this.a(new yp(), false);
                this.b(new zr());
                this.b(new zn());
                this.b(new zN());
                this.b(new z6());
                this.a(new zl(), false);
                this.b(new zP());
                this.b(new yE());
                this.b(new zD());
                this.b(new zf());
                this.b(new zU());
                this.b(new zT());
                this.a(new zA(), false);
                this.b(new z9());
                this.b(new za());
                this.b(new zc());
                this.b(new zt());
                this.b(new z_());
                this.b(new zm());
                this.b(new zM());
                n11 = V.c();
                n10 = 13;
                if (n6 != 0) {
                    if (n11 > n10) {
                        this.b(new yy());
                    }
                    n11 = V.c();
                    n10 = 15;
                }
                if (n6 == 0) break block8;
                if (n11 <= n10) {
                    this.a(new zI(), false);
                    this.b(new zK());
                }
                this.b(new zz());
                this.a(new zk(), false);
                this.b(new z3());
                this.b(new zV());
                this.b(new zC());
                this.b(new yT());
                this.b(new zQ());
                this.b(new yP());
                this.b(new zd());
                this.a(new zb(), false);
                this.b(new yv());
                this.a(new yD(), false);
                this.b(new zv());
                this.b(new yR());
                this.b(new ze());
                this.b(new yB());
                this.b(new zh());
                this.b(new z8());
                this.b(new yq());
                this.b(new A3());
                this.b(new zY());
                this.b(new zH());
                this.b(new zX());
                this.b(new AQ());
                this.b(new zs());
                this.b(new zp());
                this.b(new zB());
                this.b(new Ao());
                this.b(new zJ());
                if (n6 == 0) break block9;
                n11 = V.c();
                n10 = 13;
            }
            if (n11 > n10) {
                this.b(new y0());
            }
            this.b(new zL());
            this.b(new zj());
        }
        if (n6 == 0) {
            cy.b(!cy.b());
        }
    }

    public void d() {
        for (y5 y52 : this.a.values()) {
            y52.m();
        }
    }

    public void a() {
        for (y5 y52 : this.a.values()) {
            y52.k();
        }
    }

    private void a(y5 y52, boolean bl) {
        this.a.put(y52.getClass(), y52);
        y52.c(bl);
    }

    private void b(y5 y52) {
        this.a(y52, true);
    }

    public Collection<y5> e() {
        return this.a.values();
    }

    public <T extends y5> T b(Class<T> class_) {
        return (T)this.a.get(class_);
    }

    public y5 a(String string) {
        for (Map.Entry<Class, y5> entry : this.a.entrySet()) {
            if (!entry.getValue().H().equals(string)) continue;
            return entry.getValue();
        }
        return null;
    }

    public boolean a(Class class_) {
        for (y5 y52 : this.e()) {
            if (!y52.getClass().equals(class_)) continue;
            return y52.N();
        }
        return false;
    }

    public void a(JsonArray jsonArray) {
        for (int k = 0; k < jsonArray.size(); ++k) {
            JsonObject jsonObject;
            JsonElement jsonElement = jsonArray.get(k);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull() || (jsonObject = jsonElement.getAsJsonObject()).get("name") == null || jsonObject.get("name").isJsonNull()) continue;
            String string = jsonObject.get("name").getAsString();
            for (y5 y52 : this.e()) {
                try {
                    if (!y52.H().equalsIgnoreCase(string)) continue;
                    y52.a(jsonObject);
                }
                catch (Exception exception) {
                    on.a(y52.H());
                    on.a(exception);
                }
            }
        }
    }

    public void a(y5 y52) {
        if (y52.N()) {
            this.b.add(y52);
        } else {
            this.b.remove(y52);
        }
        for (y5 y53 : this.f()) {
            y53.a(y52);
        }
    }

    public HashSet<y5> f() {
        return this.b;
    }

    public JsonArray h() {
        JsonArray jsonArray = new JsonArray();
        for (y5 y52 : this.e()) {
            jsonArray.add((JsonElement)y52.R());
        }
        return jsonArray;
    }

    public void c() {
        int n6 = 0;
        for (y5 y52 : this.e()) {
            if (y52.l() == null || y52.x() || y52 instanceof zu || y52.y() == 0 || !y52.N()) continue;
            ++n6;
            y52.z();
        }
        if (n6 > 0) {
            on.p.r().a("Hidden Disabled", n6 + " module(s) have been disabled!", pJ.WARNING, 2500L);
        }
    }

    public void a(JsonObject jsonObject) {
        for (y5 y52 : this.e()) {
            if (jsonObject.has(y52.H())) {
                if (y52.l() == null || y52.l().Y() == null || !y52.l().Y().G()) continue;
                y52.d(jsonObject.get(y52.H()).getAsBoolean());
                continue;
            }
            if (y52 instanceof zu || y52.y() == 0 || !y52.N()) continue;
            y52.z();
        }
    }

    public List<y5> b(JsonObject jsonObject) {
        ArrayList<y5> arrayList = new ArrayList<y5>();
        for (y5 y52 : this.e()) {
            if (!jsonObject.has(y52.H()) || y52.l() == null || y52.l().Y() == null || !y52.l().Y().G()) continue;
            arrayList.add(y52);
        }
        return arrayList;
    }

    public JsonObject b() {
        JsonObject jsonObject = new JsonObject();
        for (y5 y52 : this.e()) {
            if (!y52.N()) continue;
            jsonObject.addProperty(y52.H(), Boolean.valueOf(y52.N()));
        }
        return jsonObject;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

