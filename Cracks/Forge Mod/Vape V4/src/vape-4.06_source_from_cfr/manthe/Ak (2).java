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
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import manthe.cB;
import manthe.on;
import manthe.y5;
import manthe.yt;

public class Ak
extends yt {
    private UUID l = UUID.randomUUID();
    private String f;
    private String h;
    private JsonObject e;
    private long i;
    private boolean n;
    private JsonObject g = new JsonObject();
    private boolean k;
    private int j;
    private String d;
    private static String[] m;

    public Ak(String string, String string2) {
        this(string, string2, false);
    }

    public Ak(String string, String string2, boolean bl) {
        this.f = string;
        this.h = string2;
        this.n = bl;
        this.z();
    }

    public void s() {
        JsonArray jsonArray;
        if (this.e.get("modules") != null && !this.e.get("modules").isJsonNull()) {
            on.p.H().a(this.e.get("modules").getAsJsonArray());
        }
        if (this.e.get("favorites") != null && !this.e.get("favorites").isJsonNull()) {
            on.p.A().a(this.e.get("favorites").getAsJsonObject());
        }
        if (this.e.get("values") != null && !this.e.get("values").isJsonNull()) {
            on.p.o().a(this.e.get("values").getAsJsonArray());
        }
        if (this.e.get("macros") != null && !this.e.get("macros").isJsonNull()) {
            on.p.f().a(this.e.get("macros").getAsJsonArray());
        }
        if (this.e.get("search") != null && !this.e.get("search").isJsonNull()) {
            jsonArray = this.e.get("search").getAsJsonArray();
            on.p.d().a(jsonArray);
        }
        if (on.p.D().a.u().booleanValue()) {
            this.x();
        }
        on.p.H().c();
        if (this.e.get("frames") != null && !this.e.get("frames").isJsonNull()) {
            jsonArray = this.e.get("frames").getAsJsonArray();
            JsonArray jsonArray2 = new JsonArray();
            jsonArray2.add((JsonElement)jsonArray);
            on.p.F().a(jsonArray2);
        }
        if (this.e.get("original_uuid") != null && !this.e.get("original_uuid").isJsonNull()) {
            this.d = this.e.get("original_uuid").getAsString();
        }
    }

    public JsonObject n() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("modules", (JsonElement)on.p.H().h());
        jsonObject.add("favorites", (JsonElement)on.p.A().a());
        jsonObject.add("values", (JsonElement)on.p.o().b());
        jsonObject.add("macros", (JsonElement)on.p.f().b());
        jsonObject.add("search", (JsonElement)on.p.d().a());
        jsonObject.add("frames", (JsonElement)on.p.F().e());
        return jsonObject;
    }

    public void x() {
        on.p.H().a(this.g);
    }

    public List<y5> A() {
        return on.p.H().b(this.g);
    }

    public void q() {
        this.g = on.p.H().b();
    }

    private void z() {
        this.i = System.currentTimeMillis();
    }

    public void B() {
        this.h = "4.06";
        this.z();
        this.e = this.n();
        this.e.add("enabled", (JsonElement)this.g);
    }

    public JsonObject v() {
        return this.e;
    }

    public void b(JsonObject jsonObject) {
        this.e = jsonObject;
    }

    public UUID l() {
        return this.l;
    }

    public void a(UUID uUID) {
        this.l = uUID;
    }

    public String r() {
        return this.f;
    }

    public String w() {
        return this.h;
    }

    public Ak a(JsonObject jsonObject) {
        if (jsonObject.get("uuid") != null && !jsonObject.get("uuid").isJsonNull()) {
            this.l = UUID.fromString(jsonObject.get("uuid").getAsString());
        }
        if (jsonObject.get("name") != null && !jsonObject.get("name").isJsonNull()) {
            this.f = jsonObject.get("name").getAsString();
        }
        if (jsonObject.get("version") != null && !jsonObject.get("version").isJsonNull()) {
            this.h = jsonObject.get("version").getAsString();
        }
        if (jsonObject.get("is_public") != null && !jsonObject.get("is_public").isJsonNull()) {
            this.k = jsonObject.get("is_public").getAsBoolean();
        }
        if (jsonObject.get("data") != null && !jsonObject.get("data").isJsonNull() && jsonObject.get("data").isJsonObject()) {
            this.e = jsonObject.get("data").getAsJsonObject();
            if (this.e.get("keybinds") != null && !this.e.get("keybinds").isJsonNull()) {
                this.a(this.e.get("keybinds").getAsJsonArray());
            }
            if (this.e.has("enabled")) {
                this.g = this.e.getAsJsonObject("enabled");
            }
        }
        if (jsonObject.get("updated") != null) {
            this.a(jsonObject.get("updated").getAsLong());
        }
        if (jsonObject.get("original_uuid") != null && !jsonObject.get("original_uuid").isJsonNull()) {
            this.d = jsonObject.get("original_uuid").getAsString();
        }
        return this;
    }

    public JsonObject y() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("uuid", this.l.toString());
        jsonObject.addProperty("name", this.f);
        jsonObject.addProperty("version", this.h);
        this.e.add("keybinds", (JsonElement)this.b());
        jsonObject.add("data", (JsonElement)this.e);
        jsonObject.addProperty("is_public", Boolean.valueOf(this.k));
        jsonObject.addProperty("updated", (Number)this.i);
        if (this.d != null) {
            jsonObject.addProperty("original_uuid", this.d);
        }
        return jsonObject;
    }

    public long t() {
        return this.i;
    }

    public void a(long l) {
        this.i = l;
    }

    public String p() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("MM/dd/yy");
        LocalDateTime localDateTime = LocalDateTime.ofInstant(Instant.ofEpochMilli(this.i), ZoneId.systemDefault());
        return dateTimeFormatter.format(localDateTime);
    }

    public boolean o() {
        return this.n;
    }

    public void a(boolean bl) {
        this.n = bl;
    }

    @Override
    public void h() {
        on.p.l().d(this);
    }

    @Override
    public String g() {
        return String.format(" %s7[%sr%s%s7]%sr %s", cB.v, cB.v, this.a(), cB.v, cB.v, this.r());
    }

    @Override
    public void a(List<Integer> list) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (Integer n6 : list) {
            int n10;
            if (n6 < 0 && (n10 = n6 + 100) <= 1) continue;
            arrayList.add(n6);
        }
        super.a(arrayList);
    }

    @Override
    public void c(int n6) {
        super.c(n6);
    }

    public boolean k() {
        return this.k;
    }

    public void b(boolean bl) {
        this.k = bl;
    }

    public int m() {
        return this.j;
    }

    public void d(int n6) {
        this.j = n6;
    }

    @Override
    public boolean j() {
        return on.p.l().a().equals(this);
    }

    public static void b(String[] arrstring) {
        m = arrstring;
    }

    public static String[] u() {
        return m;
    }

    static {
        if (Ak.u() != null) {
            Ak.b(new String[1]);
        }
    }
}

