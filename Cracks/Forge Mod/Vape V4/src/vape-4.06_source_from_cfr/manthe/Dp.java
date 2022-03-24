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
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import manthe.D7;
import manthe.DP;
import manthe.p1;
import manthe.pd;
import manthe.r0;
import manthe.r6;
import manthe.rb;
import manthe.rf;
import manthe.rh;

public class Dp
extends DP<rb> {
    public static final Color q = new Color(0, 170, 0);
    public static final Color o = new Color(170, 170, 170);
    public static final Color r = new Color(170, 0, 0);
    private final Color n;
    private final List<rb> p = new ArrayList<rb>();
    private final HashMap<rb, rf> m = new HashMap();
    protected r6 s;

    private Dp(Object object, String string, Color color, rh rh2) {
        super(object, string, rh2);
        this.n = color;
    }

    public static Dp a(Object object, String string, String string2, Color color, String ... arrstring) {
        return Dp.a(object, string, string2, "List of Names/Strings", color, Arrays.asList(arrstring));
    }

    public static Dp a(Object object, String string, String string2, String string3, Color color, List<String> list) {
        rh rh2 = new rh(string2);
        rh2.b(10.0);
        Dp dp2 = new Dp(object, string, color, rh2);
        rh2.a(dp2);
        Dp.a(rh2, dp2, string3);
        for (String string4 : list) {
            dp2.c(string4);
        }
        dp2.a(new ArrayList<rb>(dp2.t()));
        return dp2;
    }

    private static void a(rh rh2, Dp dp2, String string) {
        r0 r02 = new r0(dp2, string, "<name / string>", 0, false);
        rh2.a(r02);
    }

    public Color r() {
        return this.n;
    }

    public List<rb> t() {
        return this.p;
    }

    @Override
    public void a(List<rb> list) {
        ArrayList<rb> arrayList = new ArrayList<rb>(this.p);
        this.p.clear();
        for (rb rb2 : arrayList) {
            this.a(rb2);
        }
        for (rb rb2 : list) {
            this.c(rb2.V());
        }
    }

    @Override
    public void a(String string) {
    }

    public rb c(String string) {
        rf rf2 = new rf(false);
        rf2.c(95.0);
        rf2.a(new D7(1.0, 1.0, 2, 2, new pd(0, 5, 0, 0)));
        rb rb2 = new rb(rf2, string, this);
        this.t().add(rb2);
        this.s.d(rf2);
        this.m.put(rb2, rf2);
        return rb2;
    }

    @Override
    public void a(rb rb2) {
        try {
            this.t().remove(rb2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.m.containsKey(rb2)) {
            this.s.A().a((p1)this.m.get(rb2));
        }
    }

    @Override
    public boolean a(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.e())) {
            if (jsonObject.get("value").isJsonArray()) {
                JsonArray jsonArray = jsonObject.get("value").getAsJsonArray();
                ArrayList<rb> arrayList = new ArrayList<rb>(this.t());
                for (rb rb2 : arrayList) {
                    this.a(rb2);
                }
                for (rb rb2 : jsonArray) {
                    try {
                        rb rb3 = this.c("");
                        rb3.a(rb2.getAsJsonObject());
                    }
                    catch (Exception exception) {}
                }
            }
            return true;
        }
        return super.a(jsonObject);
    }

    @Override
    public JsonObject m() {
        JsonObject jsonObject = super.m();
        JsonArray jsonArray = new JsonArray();
        for (rb rb2 : this.t()) {
            jsonArray.add((JsonElement)rb2.H());
        }
        jsonObject.add("value", (JsonElement)jsonArray);
        return jsonObject;
    }

    public boolean d(String string) {
        for (rb rb2 : this.t()) {
            if (!rb2.G() || !rb2.V().equalsIgnoreCase(string)) continue;
            return true;
        }
        return this.t().isEmpty();
    }

    public List<String> s() {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (rb rb2 : this.t()) {
            if (!rb2.G()) continue;
            arrayList.add(rb2.V());
        }
        return arrayList;
    }

    public rb b(String string, int n6) {
        return this.c(string);
    }

    @Override
    public void a(r6 r62) {
        this.s = r62;
    }
}

