/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.Map;
import java.util.UUID;
import manthe.AV;
import manthe.bV;
import manthe.on;
import manthe.ua;

final class uX
implements Runnable {
    uX() {
    }

    @Override
    public void run() {
        ua.a(true);
        on.a("downloading profiles");
        String string = on.p.J();
        try {
            if (string.length() == 0) {
                on.a("failed to dl profiles");
                ua.a(null);
                ua.a(false);
                return;
            }
            on.a("parsing profiles");
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
            if (jsonObject.has("profiles")) {
                JsonObject jsonObject2 = jsonObject.get("profiles").getAsJsonObject();
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    if (!((JsonElement)entry.getValue()).isJsonObject()) continue;
                    JsonObject jsonObject3 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    AV aV = new AV("", "");
                    aV.a(jsonObject3);
                    aV.a(UUID.fromString((String)entry.getKey()));
                    ua.a().add(aV);
                }
                ua.a().sort(new bV(this));
            }
            ua.a(false);
            on.a("done!!");
        }
        catch (Exception exception) {
            on.a(exception);
            System.out.println(string);
            ua.a(false);
        }
    }
}

