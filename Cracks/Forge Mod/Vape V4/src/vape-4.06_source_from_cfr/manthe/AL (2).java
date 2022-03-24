/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.JsonPrimitive
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.util.ArrayList;
import java.util.List;
import manthe.cr;
import manthe.on;
import manthe.w0;
import manthe.y5;
import manthe.z1;
import manthe.zZ;
import manthe.zf;
import manthe.zi;

public class AL {
    private final List<y5> a = new ArrayList<y5>();

    public AL() {
        cr cr2 = on.p.H();
        this.a(cr2.b(z1.class));
        this.a(cr2.b(zf.class));
        this.a(cr2.b(zZ.class));
        this.a(cr2.b(zi.class));
    }

    public List<y5> b() {
        return this.a;
    }

    private void a(y5 y52) {
        if (this.a.contains(y52)) {
            return;
        }
        this.a.add(y52);
        y52.b(true);
    }

    public void b(y5 y52) {
        if (this.a.contains(y52)) {
            return;
        }
        this.a.add(y52);
        y52.b(true);
        w0.ar();
    }

    public void c(y5 y52) {
        this.a.remove(y52);
        y52.b(false);
        w0.ar();
    }

    public JsonObject a() {
        JsonObject jsonObject = new JsonObject();
        JsonArray jsonArray = new JsonArray();
        for (y5 y52 : this.a) {
            jsonArray.add((JsonElement)new JsonPrimitive(y52.H()));
        }
        jsonObject.add("modules", (JsonElement)jsonArray);
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.has("modules")) {
            this.a.clear();
            JsonArray jsonArray = jsonObject.get("modules").getAsJsonArray();
            for (JsonElement jsonElement : jsonArray) {
                y5 y52 = on.p.H().a(jsonElement.getAsString());
                this.a(y52);
            }
        }
    }
}

