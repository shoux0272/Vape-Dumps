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
import java.util.List;
import manthe.U;
import manthe.fG;
import manthe.pc;
import manthe.pe;
import manthe.uW;
import manthe.wE;
import manthe.wM;
import manthe.wh;
import manthe.xy;
import manthe.zu;

public class xi
extends wM {
    private wh A = new wh("newclose");
    private List<U> C;
    private xy z;
    private static String[] B;

    public xi(xy xy2, List<U> list) {
        this.C = list;
        this.z = xy2;
        this.a(this.A);
    }

    @Override
    public void a() {
        boolean bl = this.z.N() != null && this.n().equals(this.z.N().n());
        pe.a(this.d() + 5.0, this.c() + 1.0, this.e() - 10.0, this.f() - 2.0, bl ? xi.b.t : xi.b.m);
        double d10 = this.d() + 10.0;
        for (U u6 : this.C) {
            double d11 = 9.0;
            pe.c(d10, this.c() + this.f() / 2.0 - d11 / 2.0, 8.5, d11, xi.b.u);
            fG fG2 = u6.a();
            if (fG2 != null && fG2.d()) {
                pe.a(fG2, 0.5, d10, this.c() + this.f() / 2.0 - 4.0);
            }
            d10 += 9.0;
        }
        this.A.c(this.d() + this.e() - 10.0 - 8.0);
        this.A.a(this.c());
        this.A.d(this.f());
    }

    public xi a(pc pc2) {
        this.A.c(pc2);
        return this;
    }

    public JsonObject l() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (U u6 : this.C) {
            jsonArray.add((JsonElement)u6.b());
        }
        jsonObject.add("hotbars", (JsonElement)jsonArray);
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        JsonArray jsonArray = jsonObject.getAsJsonArray("hotbars");
        int n6 = jsonArray.size();
        for (int k = 0; k < n6; ++k) {
            JsonObject jsonObject2 = jsonArray.get(k).getAsJsonObject();
            this.n().get(k).a(jsonObject2);
        }
    }

    @Override
    public void k() {
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
        zu.b(wE.class).a(this);
        if (this.z.N().equals(this)) {
            zu.a(wE.class);
        }
        this.z.a(this);
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
        return 15.0;
    }

    public List<U> n() {
        return this.C;
    }

    public void a(List<U> list) {
        this.C = list;
    }

    public static void b(String[] arrstring) {
        B = arrstring;
    }

    public static String[] m() {
        return B;
    }

    static {
        if (xi.m() != null) {
            xi.b(new String[5]);
        }
    }
}

