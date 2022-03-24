/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import a.a;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Executors;
import manthe.AV;
import manthe.Ak;
import manthe.Bx;
import manthe.cy;
import manthe.nn;
import manthe.on;
import manthe.ox;
import manthe.uX;
import manthe.uh;
import manthe.wd;
import manthe.yS;
import manthe.zu;

public class ua {
    private static List<AV> d;
    private static boolean c;
    private static cy[] b;

    public static List<AV> c() {
        if (c) {
            on.a("loading public profiles...");
            return new ArrayList<AV>();
        }
        if (d == null) {
            ua.b();
        }
        return d;
    }

    public static void b() {
        d = new ArrayList<AV>();
        Executors.newSingleThreadExecutor().execute(new uX());
    }

    public static void a(String string) {
        Ak ak = on.p.l().a(UUID.fromString(string));
        String string2 = new String(Bx.a(a.gp(string)));
        if (string2.length() == 0) {
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string2));
            jsonReader.setLenient(true);
            JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
            JsonObject jsonObject2 = jsonObject.get("profiles").getAsJsonObject();
            Map.Entry entry = (Map.Entry)jsonObject2.entrySet().iterator().next();
            String string3 = (String)entry.getKey();
            JsonObject jsonObject3 = jsonObject2.get(string3).getAsJsonObject();
            jsonObject3.addProperty("is_public", Boolean.valueOf(false));
            jsonObject3.addProperty("uuid", UUID.randomUUID().toString());
            jsonObject3.addProperty("original_uuid", string3);
            if (ak != null) {
                ak.a(jsonObject3);
            } else {
                Ak ak2 = new Ak("", "");
                ak2.a(jsonObject3);
                on.p.l().b(ak2);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    public static void a(uh uh2) {
        switch (nn.a[uh2.ordinal()]) {
            case 1: {
                d.sort(new yS());
                break;
            }
            case 2: {
                d.sort(new ox());
            }
        }
        zu.b(wd.class).h(0.0);
        zu.b(wd.class).n();
        zu.b(wd.class).m();
    }

    public static boolean d() {
        return c;
    }

    static boolean a(boolean bl) {
        c = bl;
        return c;
    }

    static List a(List list) {
        d = list;
        return d;
    }

    static List a() {
        return d;
    }

    public static void b(cy[] arrcy) {
        b = arrcy;
    }

    public static cy[] e() {
        return b;
    }

    static {
        if (ua.e() != null) {
            ua.b(new cy[4]);
        }
    }
}

