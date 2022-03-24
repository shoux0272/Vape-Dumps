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
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.DI;
import manthe.Dv;
import manthe.U;
import manthe.cN;
import manthe.uW;
import manthe.wM;
import manthe.wk;
import manthe.xi;

public class xy
extends wM {
    private Dv B;
    private wk C = new wk();
    private List<xi> A = new ArrayList<xi>();
    private xi D;
    private static boolean z;

    public xy(Dv dv2) {
        this.B = dv2;
        dv2.a(this);
        xy xy2 = this;
        this.C.c(new cN(this, xy2));
        this.a(this.C);
    }

    @Override
    public void a() {
        this.o();
        this.C.c(this.d());
        this.C.a(this.c());
        double d10 = this.C.c() + this.C.f();
        for (xi xi2 : this.m()) {
            xi2.c(this.d());
            xi2.a(d10);
            d10 += xi2.f();
        }
    }

    public void M() {
        this.w().clear();
        this.a(this.C);
        for (xi xi2 : this.m()) {
            xi xi3 = xi2.a(new DI(this, xi2));
            this.a(new wM[]{xi3});
        }
        this.F().M();
    }

    public JsonObject K() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (xi xi2 : this.A) {
            jsonArray.add((JsonElement)xi2.l());
        }
        if (this.D == null) {
            jsonObject.addProperty("selected", (Number)0);
        } else {
            jsonObject.addProperty("selected", (Number)this.A.indexOf(this.D));
        }
        jsonObject.add("panels", (JsonElement)jsonArray);
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        this.A.clear();
        if (!jsonObject.has("panels")) {
            return;
        }
        JsonArray jsonArray = jsonObject.get("panels").getAsJsonArray();
        int n6 = jsonObject.get("selected").getAsInt();
        int n10 = jsonArray.size();
        for (int k = 0; k < n10; ++k) {
            xi xi2 = new xi(this, this.n());
            xi2.a(jsonArray.get(k).getAsJsonObject());
            this.A.add(xi2);
        }
        if (this.A.size() > 0) {
            this.D = this.m().get(n6);
        }
        this.M();
    }

    private List<U> n() {
        ArrayList<U> arrayList = new ArrayList<U>();
        for (int k = 0; k < 9; ++k) {
            U u6 = new U(0);
            arrayList.add(u6);
        }
        return arrayList;
    }

    public void b(xi xi2) {
        this.m().remove(xi2);
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        double d10 = this.C.f();
        for (xi xi2 : this.m()) {
            d10 += xi2.f();
        }
        return d10;
    }

    public List<xi> m() {
        return this.A;
    }

    public Dv L() {
        return this.B;
    }

    public xi N() {
        return this.D;
    }

    public void a(xi xi2) {
        this.D = xi2;
    }

    static List c(xy xy2) {
        return xy2.n();
    }

    static List b(xy xy2) {
        return xy2.A;
    }

    static xi a(xy xy2) {
        return xy2.D;
    }

    static xi a(xy xy2, xi xi2) {
        xy2.D = xi2;
        return xy2.D;
    }

    public static void f(boolean bl) {
        z = bl;
    }

    public static boolean l() {
        return z;
    }

    public static boolean J() {
        boolean bl = xy.l();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (xy.J()) {
            xy.f(true);
        }
    }
}

