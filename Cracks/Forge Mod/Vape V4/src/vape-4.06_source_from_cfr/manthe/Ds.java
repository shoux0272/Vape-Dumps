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
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.BI;
import manthe.C4;
import manthe.on;
import manthe.p1;
import manthe.vA;
import manthe.wM;
import manthe.y5;
import manthe.yf;

public abstract class Ds<K, C extends p1>
implements BI {
    private final Object g;
    private final String e;
    private C f;
    private K k;
    private Ds j;
    private boolean b = true;
    private C4 d;
    private boolean a;
    private wM h;
    private List<vA> i = new ArrayList<vA>();
    private static boolean c;

    public Ds(Object object, String string, C c3) {
        this.g = object;
        this.e = string;
        this.f = c3;
        if (object != null) {
            if (object instanceof yf) {
                on.p.T().a(this);
            } else if (!(object instanceof y5)) {
                on.p.o().a(this);
            }
        }
    }

    @Override
    public String H() {
        return this.e;
    }

    public abstract K n();

    public abstract void b(K var1);

    public abstract void a(String var1);

    public void b(boolean bl) {
        this.a = bl;
    }

    public boolean g() {
        return this.a;
    }

    public void d() {
        if (!this.a) {
            on.p.n();
        }
        for (vA vA2 : this.i) {
            vA2.a();
        }
        if (this.d != null) {
            this.d.a(this);
        }
    }

    public K b() {
        return this.k;
    }

    public void a(K k) {
        this.k = k;
    }

    public C c() {
        return this.f;
    }

    protected void a(C c3) {
        this.f = c3;
    }

    public Ds o() {
        return this.j;
    }

    public void a(Ds ds2) {
        this.j = ds2;
    }

    public String e() {
        return this.j != null ? this.j.e + "-" + this.e : this.e;
    }

    public Object i() {
        return this.g;
    }

    public JsonObject m() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.e());
        if (this.n() != null) {
            jsonObject.addProperty("value", this.n().toString());
        }
        return jsonObject;
    }

    public boolean a(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.e()) && jsonObject.has("value")) {
            this.a(jsonObject.get("value").getAsString());
            this.l();
            return true;
        }
        return false;
    }

    public boolean f() {
        return this.b;
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public void l() {
        for (vA vA2 : this.i) {
            vA2.a();
        }
    }

    public void a(vA vA2) {
        this.i.add(vA2);
    }

    public void q() {
        this.b(this.b());
    }

    public wM k() {
        return this.h;
    }

    public void a(wM wM2) {
        this.h = wM2;
    }

    public void a(C4 c4) {
        this.d = c4;
    }

    public C4 j() {
        return this.d;
    }

    public static void c(boolean bl) {
        c = bl;
    }

    public static boolean h() {
        return c;
    }

    public static boolean p() {
        boolean bl = Ds.h();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (Ds.h()) {
            Ds.c(true);
        }
    }
}

