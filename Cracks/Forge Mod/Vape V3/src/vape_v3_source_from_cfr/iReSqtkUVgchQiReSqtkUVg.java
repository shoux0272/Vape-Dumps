/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import java.awt.Color;
import java.util.HashSet;
import java.util.Set;

public class iReSqtkUVgchQiReSqtkUVg {
    public iReSqtkUVgoRmiReSqtkUVg a = iReSqtkUVgoRmiReSqtkUVg.a(this, "Use Friends", true);
    public iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a(this, "Use Alias", true);
    public iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Force Alias", false, "This will make the names appear in chat\nAnd on their regular Nametags as well\nThis will act similar to the NameSpoof mod");
    public iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Use color", true, "Re-colors certain render modules to use \"Friends Color\" on friends");
    public iReSqtkUVgZfciReSqtkUVg e = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Friends Color", new Color(66, 244, 137));
    private Set<iReSqtkUVgMWviReSqtkUVg> f = new HashSet<iReSqtkUVgMWviReSqtkUVg>();

    public iReSqtkUVgchQiReSqtkUVg() {
        iReSqtkUVgycViReSqtkUVg iReSqtkUVgycViReSqtkUVg2 = ((iReSqtkUVgRNziReSqtkUVg)this.c.c()).D().d_();
        ((iReSqtkUVgRNziReSqtkUVg)this.c.c()).D().a(new iReSqtkUVghPPiReSqtkUVg(this, iReSqtkUVgycViReSqtkUVg2));
    }

    public Set<iReSqtkUVgMWviReSqtkUVg> a() {
        return this.f;
    }

    public void a(iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2) {
        iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg3 = this.a(iReSqtkUVgMWviReSqtkUVg2.a());
        if (iReSqtkUVgMWviReSqtkUVg3 != null) {
            this.f.remove(iReSqtkUVgMWviReSqtkUVg3);
        }
        this.f.add(iReSqtkUVgMWviReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.b.a(iReSqtkUVgMWviReSqtkUVg2);
        this.e();
    }

    public void b() {
        iReSqtkUVgVjsiReSqtkUVg iReSqtkUVgVjsiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.l();
        if (iReSqtkUVgVjsiReSqtkUVg2.b()) {
            return;
        }
        iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgVjsiReSqtkUVg2.d();
        if (iReSqtkUVgjSjiReSqtkUVg2.b()) {
            return;
        }
        if (iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) {
            iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2);
            String string = iReSqtkUVgtBCiReSqtkUVg2.x();
            iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = this.a(string);
            if (iReSqtkUVgMWviReSqtkUVg2 != null) {
                this.b(iReSqtkUVgMWviReSqtkUVg2);
            } else {
                this.a(new iReSqtkUVgMWviReSqtkUVg(string, string));
            }
        }
    }

    public void b(iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2) {
        this.f.remove(iReSqtkUVgMWviReSqtkUVg2);
        iReSqtkUVgFCaiReSqtkUVg.b.b(iReSqtkUVgMWviReSqtkUVg2.a());
        this.e();
    }

    public iReSqtkUVgMWviReSqtkUVg a(String string) {
        for (iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 : this.f) {
            if (!iReSqtkUVgMWviReSqtkUVg2.a().equals(string)) continue;
            return iReSqtkUVgMWviReSqtkUVg2;
        }
        return null;
    }

    public boolean b(String string) {
        iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = this.a(string);
        return this.a.i() != false && iReSqtkUVgMWviReSqtkUVg2 != null && iReSqtkUVgMWviReSqtkUVg2.d();
    }

    public boolean a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        return this.b(iReSqtkUVgVnKiReSqtkUVg2.x());
    }

    public iReSqtkUVgMWviReSqtkUVg a(String string, boolean bl) {
        if (this.a.i().booleanValue() || !bl) {
            iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = this.a(string);
            if (iReSqtkUVgMWviReSqtkUVg2 != null && !iReSqtkUVgMWviReSqtkUVg2.d()) {
                return null;
            }
            return iReSqtkUVgMWviReSqtkUVg2;
        }
        return null;
    }

    public iReSqtkUVgMWviReSqtkUVg c(String string) {
        return this.a(string, true);
    }

    public void c() {
        this.a().clear();
        iReSqtkUVgFCaiReSqtkUVg.b.p.D().o().clear();
    }

    public void a(JsonArray jsonArray) {
        if (jsonArray.size() == 0) {
            return;
        }
        jsonArray = jsonArray.get(0).getAsJsonArray();
        this.c();
        for (int i = 0; i < jsonArray.size(); ++i) {
            try {
                JsonElement jsonElement = jsonArray.get(i);
                if (!jsonElement.isJsonObject() || jsonElement.isJsonNull()) continue;
                iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = new iReSqtkUVgMWviReSqtkUVg("", "").a(jsonElement.getAsJsonObject());
                this.a(iReSqtkUVgMWviReSqtkUVg2);
                continue;
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public JsonArray d() {
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 : this.a()) {
            jsonArray.add((JsonElement)iReSqtkUVgMWviReSqtkUVg2.e());
        }
        return jsonArray;
    }

    public void e() {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().f()) {
            new iReSqtkUVgDfKiReSqtkUVg(e).bl();
        }
    }
}

