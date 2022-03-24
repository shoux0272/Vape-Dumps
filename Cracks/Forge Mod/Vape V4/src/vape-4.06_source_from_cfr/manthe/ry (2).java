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
import java.util.HashMap;
import java.util.List;
import manthe.D7;
import manthe.U;
import manthe.ch;
import manthe.on;
import manthe.pd;
import manthe.qJ;
import manthe.r3;
import manthe.rF;
import manthe.rM;
import manthe.rf;
import manthe.rg;

public class ry
extends rf {
    private final List<U> J;
    private final HashMap<U, rM> K = new HashMap();
    private boolean I;

    public ry(rF rF2, List<U> list) {
        super(false);
        this.j(false);
        this.J = list;
        this.b(on.p.t().r.K());
        this.a(new D7(0.0, 0.0, 1, 2, new pd(0, 0, 1, 0)));
        rg rg2 = new rg("x", false);
        rg2.b(10.0);
        rg2.c(8.0);
        rg2.j(false);
        rg2.a(new ch(this, rF2));
        r3 r32 = new r3(this, true, list);
        r32.b(10.0);
        r32.c(65.0);
        r32.a(new qJ(this, rF2));
        this.b(r32);
        this.b(rg2);
    }

    public List<U> a() {
        return this.J;
    }

    public void a(List<U> list) {
        this.J.clear();
        for (int k = 0; k < 9; ++k) {
            U u6 = list.get(k);
            this.J.add(u6);
            this.K.put(u6, new rM(0, false).a(u6));
        }
    }

    public void d(boolean bl) {
        this.I = bl;
    }

    private JsonObject x() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (U u6 : this.J) {
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
            this.a().get(k).a(jsonObject2);
        }
    }

    static JsonObject a(ry ry2) {
        return ry2.x();
    }

    static boolean b(ry ry2) {
        return ry2.I;
    }
}

