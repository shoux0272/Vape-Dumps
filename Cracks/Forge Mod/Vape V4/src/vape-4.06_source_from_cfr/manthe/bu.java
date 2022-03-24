/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
package manthe;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.util.HashSet;
import java.util.Set;
import manthe.ng;
import manthe.on;
import manthe.qw;
import manthe.zE;

public class bu {
    private final Set<qw> a = new HashSet<qw>();

    public void a(qw qw2) {
        this.a.add(qw2);
        zE zE2 = on.p.H().b(zE.class);
        zE2.a(qw2);
    }

    public void b(qw qw2) {
        if (qw2 != null) {
            zE zE2 = on.p.H().b(zE.class);
            this.a.remove(qw2);
            zE2.b(qw2);
            if (qw2.j() != null) {
                ng.e.a(qw2.j());
            }
        }
    }

    public void b() {
        for (qw qw2 : new HashSet<qw>(this.a)) {
            this.b(qw2);
        }
    }

    public boolean a(int n6) {
        for (qw qw2 : this.a) {
            if (qw2.g() != n6) continue;
            return true;
        }
        return false;
    }

    public JsonArray a() {
        JsonArray jsonArray = new JsonArray();
        for (qw qw2 : this.a) {
            jsonArray.add((JsonElement)qw2.d());
        }
        return jsonArray;
    }

    public void a(JsonArray jsonArray) {
        this.b();
        for (int k = 0; k < jsonArray.size(); ++k) {
            JsonElement jsonElement = jsonArray.get(k);
            if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
            qw qw2 = new qw(jsonElement.getAsJsonObject());
            this.a(qw2);
        }
    }

    public Set<qw> c() {
        return this.a;
    }
}

