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
import java.util.Collections;
import java.util.List;
import manthe.DB;
import manthe.Dy;
import manthe.cB;
import manthe.rf;
import manthe.yt;

public class ya
extends yt {
    private String g;
    private int j = 0;
    private Dy i = Dy.a(this, "Delay", "#", "", 1.0, 100.0, 200.0, 1000.0, 1.0);
    private DB d = DB.a(this, "Double Click", false);
    private Dy e = Dy.a(this, "Double Click\nDelay", "#", "", 1.0, 100.0, 200.0, 1000.0);
    private rf h;
    private static int[] f;

    public ya(String string) {
        this.g = string;
        this.d.t().add(this.e);
    }

    public String l() {
        return this.g;
    }

    public int n() {
        return this.j;
    }

    public void d(int n6) {
        this.j = n6;
    }

    public Dy m() {
        return this.i;
    }

    public void a(Dy dy2) {
        this.i = dy2;
    }

    public Dy k() {
        return this.e;
    }

    public void b(Dy dy2) {
        this.e = dy2;
    }

    public DB q() {
        return this.d;
    }

    public void a(DB dB2) {
        this.d = dB2;
    }

    public JsonObject r() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("name", this.g);
        jsonObject.addProperty("key", (Number)this.j);
        jsonObject.add("delay", (JsonElement)this.i.m());
        jsonObject.add("double_click_enabled", (JsonElement)this.d.m());
        jsonObject.add("double_click", (JsonElement)this.e.m());
        return jsonObject;
    }

    public ya a(JsonObject jsonObject) {
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.g = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("key") != null && !jsonObject.get("key").isJsonNull()) {
            this.a(Collections.singletonList(jsonObject.get("key").getAsInt()));
        }
        if (jsonObject.get("double_click_enabled") != null && !jsonObject.get("double_click_enabled").isJsonNull()) {
            this.d.a(jsonObject.get("double_click_enabled").getAsJsonObject());
        }
        if (jsonObject.get("double_click") != null && !jsonObject.get("delay").isJsonNull()) {
            this.i.a(jsonObject.get("delay").getAsJsonObject());
        }
        if (jsonObject.get("double_click") != null && !jsonObject.get("double_click").isJsonNull()) {
            this.e.a(jsonObject.get("double_click").getAsJsonObject());
        }
        return this;
    }

    public rf p() {
        return this.h;
    }

    public void a(rf rf2) {
        this.h = rf2;
    }

    @Override
    public void h() {
    }

    @Override
    public String g() {
        return String.format(" %s7[%sr%s%s7]%sr %s", cB.v, cB.v, this.b(this.j), cB.v, cB.v, this.l());
    }

    @Override
    public void a(List<Integer> list) {
        if (list.isEmpty()) {
            this.j = 0;
            return;
        }
        this.j = list.get(0);
        super.a(Collections.singletonList(this.j));
    }

    @Override
    public boolean j() {
        return false;
    }

    public static void b(int[] arrn) {
        f = arrn;
    }

    public static int[] o() {
        return f;
    }

    static {
        if (ya.o() != null) {
            ya.b(new int[2]);
        }
    }
}

