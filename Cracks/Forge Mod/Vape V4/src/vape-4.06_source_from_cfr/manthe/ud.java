/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import manthe.Ak;
import manthe.Dy;
import manthe.ng;
import manthe.on;
import manthe.p1;
import manthe.qp;
import manthe.r1;
import manthe.sV;
import manthe.sk;
import manthe.wv;
import manthe.zu;

public class ud {
    private final List<Ak> b = new ArrayList<Ak>();
    private Ak a;

    public List<Ak> d() {
        return this.b;
    }

    public Ak a(String string) {
        for (Ak ak : this.b) {
            if (!ak.r().equalsIgnoreCase(string)) continue;
            return ak;
        }
        return null;
    }

    public Ak a(UUID uUID) {
        for (Ak ak : this.b) {
            if (!ak.l().toString().equalsIgnoreCase(uUID.toString())) continue;
            return ak;
        }
        return null;
    }

    public Ak a() {
        if (this.a == null || !this.d().contains(this.a)) {
            if (this.d().size() > 0) {
                this.c(this.d().get(0));
            } else {
                Ak ak = new Ak("default", "4.06");
                ak.B();
                this.b(ak);
                this.c(ak);
            }
        }
        return this.a;
    }

    public Ak c() {
        return this.a;
    }

    public void c(Ak ak) {
        this.a = ak;
        this.a.s();
        on.p.D().c.b(ak.r());
    }

    public void b(Ak ak) {
        this.b.add(ak);
        ng.k.a(ak);
        ng.p.b(ak);
        zu.b(wv.class).a(ak);
    }

    public void a(Ak ak) {
        this.b.remove(ak);
        ng.k.b(ak);
        ng.p.a(ak);
        zu.b(wv.class).b(ak);
    }

    public void f() {
        this.b.clear();
        ng.k.ae.A().v().clear();
        ng.p.ao().A().v().clear();
        ng.p.am().A().v().clear();
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject == null) {
            return;
        }
        if (jsonObject.entrySet().size() == 0) {
            Ak ak = new Ak("default", "4.06");
            ak.B();
            this.b(ak);
            return;
        }
        for (Map.Entry entry : jsonObject.entrySet()) {
            JsonObject jsonObject2 = ((JsonElement)entry.getValue()).getAsJsonObject();
            Ak ak = new Ak("", "", true).a(jsonObject2);
            this.b(ak);
        }
    }

    public JsonObject e() {
        JsonObject jsonObject = new JsonObject();
        for (Ak ak : this.d()) {
            jsonObject.add(ak.l().toString(), (JsonElement)ak.y());
        }
        return jsonObject;
    }

    public int b() {
        int n6 = 0;
        for (Ak ak : this.b) {
            if (!ak.k()) continue;
            ++n6;
        }
        return n6;
    }

    public void d(Ak ak) {
        if (this.a() != null) {
            this.a().B();
        }
        this.c(ak);
        for (r1 r12 : on.p.F().d()) {
            for (p1 p12 : r12.aj().v()) {
                if (!(p12 instanceof qp)) continue;
                this.a((qp)p12);
            }
        }
        this.c(ak);
    }

    private void a(qp qp2) {
        for (p1 p12 : qp2.v()) {
            qp qp3;
            if (p12 instanceof sV && (qp3 = (sV)p12).p() != null) {
                ((sV)qp3).f((Double)qp3.p().n());
                ((sV)qp3).c();
            }
            if (p12 instanceof sk && (qp3 = (sk)p12).p() != null) {
                Dy dy2 = (Dy)qp3.p();
                ((sk)qp3).h(dy2.s());
                ((sk)qp3).f(dy2.w());
                ((sk)qp3).c();
            }
            if (!(p12 instanceof qp)) continue;
            this.a((qp)p12);
        }
    }
}

