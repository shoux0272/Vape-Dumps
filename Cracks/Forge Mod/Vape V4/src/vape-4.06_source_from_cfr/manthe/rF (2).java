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
import manthe.D7;
import manthe.U;
import manthe.p1;
import manthe.pd;
import manthe.qr;
import manthe.rf;
import manthe.rg;
import manthe.ry;

public class rF
extends rf {
    private final rf J;
    private final List<ry> I = new ArrayList<ry>();
    private ry K;

    public rF() {
        super(false);
        this.a(new D7(0.0, 0.0, 2, 1, new pd(0, -1, 0, 0)));
        this.J = new rf(false);
        this.J.a(new D7(1.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.J.b(50.0);
        this.J.c(72.0);
        rg rg2 = new rg("+", true);
        rg2.j(false);
        rg2.b(c);
        rg2.b(8.0);
        rg2.c(72.0);
        rg2.a(new qr(this));
        this.b(this.J);
        this.b(rg2);
        this.x();
    }

    private List<U> z() {
        ArrayList<U> arrayList = new ArrayList<U>();
        for (int k = 0; k < 9; ++k) {
            U u6 = new U(0);
            arrayList.add(u6);
        }
        return arrayList;
    }

    public ry a(List<U> list) {
        ry ry2 = new ry(this, list);
        this.I.add(ry2);
        this.J.b(ry2);
        if (this.K == null) {
            this.b(ry2);
        }
        return ry2;
    }

    private void a(ry ry2) {
        this.I.remove(ry2);
        this.J.a((p1)ry2);
    }

    public ry y() {
        return this.K;
    }

    public void b(ry ry2) {
        this.K = ry2;
        for (ry ry3 : this.I) {
            if (ry3.equals(ry2)) continue;
            ry3.d(false);
        }
        ry2.d(true);
    }

    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (ry ry2 : this.I) {
            jsonArray.add((JsonElement)ry.a(ry2));
        }
        if (this.K == null) {
            jsonObject.addProperty("selected", (Number)0);
        } else {
            jsonObject.addProperty("selected", (Number)this.I.indexOf(this.K));
        }
        jsonObject.add("panels", (JsonElement)jsonArray);
        return jsonObject;
    }

    private void x() {
        this.a(this.z());
        this.b(this.I.get(0));
    }

    public void a(JsonObject jsonObject) {
        ArrayList<ry> arrayList = new ArrayList<ry>();
        arrayList.addAll(this.I);
        for (ry ry2 : arrayList) {
            this.a(ry2);
        }
        if (!jsonObject.has("panels")) {
            this.x();
            return;
        }
        JsonArray jsonArray = jsonObject.get("panels").getAsJsonArray();
        int n6 = jsonObject.get("selected").getAsInt();
        int n10 = jsonArray.size();
        for (int k = 0; k < n10; ++k) {
            ry ry3 = new ry(this, this.z());
            ry3.a(jsonArray.get(k).getAsJsonObject());
            this.I.add(ry3);
            this.J.b(ry3);
        }
        if (this.I.isEmpty()) {
            this.x();
        } else {
            this.b(this.I.get(n6));
        }
    }

    static List a(rF rF2) {
        return rF2.z();
    }

    static void a(rF rF2, ry ry2) {
        rF2.a(ry2);
    }
}

