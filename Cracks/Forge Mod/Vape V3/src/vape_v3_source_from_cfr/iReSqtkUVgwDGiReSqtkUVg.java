/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class iReSqtkUVgwDGiReSqtkUVg
extends iReSqtkUVgWaoiReSqtkUVg<List<iReSqtkUVgCSpiReSqtkUVg>, iReSqtkUVgkFTiReSqtkUVg> {
    public static final Color a = new Color(0, 170, 0);
    public static final Color b = new Color(170, 170, 170);
    public static final Color c = new Color(170, 0, 0);
    private final Color e;
    protected iReSqtkUVguOciReSqtkUVg d;
    private List<iReSqtkUVgCSpiReSqtkUVg> f = new ArrayList<iReSqtkUVgCSpiReSqtkUVg>();
    private HashMap<iReSqtkUVgCSpiReSqtkUVg, iReSqtkUVgwgUiReSqtkUVg> g = new HashMap();

    private iReSqtkUVgwDGiReSqtkUVg(Object object, String string, Color color, iReSqtkUVgkFTiReSqtkUVg iReSqtkUVgkFTiReSqtkUVg2) {
        super(object, string, iReSqtkUVgkFTiReSqtkUVg2);
        this.e = color;
    }

    public static iReSqtkUVgwDGiReSqtkUVg a(Object object, String string, String string2, Color color, String ... arrstring) {
        return iReSqtkUVgwDGiReSqtkUVg.a(object, string, string2, color, Arrays.asList(arrstring));
    }

    public static iReSqtkUVgwDGiReSqtkUVg a(Object object, String string, String string2, Color color, List<String> list) {
        iReSqtkUVgkFTiReSqtkUVg iReSqtkUVgkFTiReSqtkUVg2 = new iReSqtkUVgkFTiReSqtkUVg(string2, null);
        iReSqtkUVgkFTiReSqtkUVg2.d(10.0);
        iReSqtkUVgwDGiReSqtkUVg iReSqtkUVgwDGiReSqtkUVg2 = new iReSqtkUVgwDGiReSqtkUVg(object, string, color, iReSqtkUVgkFTiReSqtkUVg2);
        iReSqtkUVgkFTiReSqtkUVg2.b(iReSqtkUVgwDGiReSqtkUVg2);
        iReSqtkUVgwDGiReSqtkUVg.a(iReSqtkUVgkFTiReSqtkUVg2, iReSqtkUVgwDGiReSqtkUVg2);
        for (String string3 : list) {
            iReSqtkUVgwDGiReSqtkUVg2.b(string3);
        }
        iReSqtkUVgwDGiReSqtkUVg2.b(new ArrayList<iReSqtkUVgCSpiReSqtkUVg>(iReSqtkUVgwDGiReSqtkUVg2.j()));
        return iReSqtkUVgwDGiReSqtkUVg2;
    }

    private static void a(iReSqtkUVgkFTiReSqtkUVg iReSqtkUVgkFTiReSqtkUVg2, iReSqtkUVgwDGiReSqtkUVg iReSqtkUVgwDGiReSqtkUVg2) {
        iReSqtkUVguOciReSqtkUVg iReSqtkUVguOciReSqtkUVg2;
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(true);
        iReSqtkUVgwgUiReSqtkUVg2.c(false);
        iReSqtkUVgwgUiReSqtkUVg2.a(iReSqtkUVgcvhiReSqtkUVg.k);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 1.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 2, 2, 2)));
        iReSqtkUVgwgUiReSqtkUVg2.c(118.0);
        iReSqtkUVgwgUiReSqtkUVg2.a_(true);
        iReSqtkUVgkFTiReSqtkUVg2.a(iReSqtkUVgwgUiReSqtkUVg2);
        iReSqtkUVgwgUiReSqtkUVg2.a(iReSqtkUVgkFTiReSqtkUVg2);
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg(iReSqtkUVgkFTiReSqtkUVg2.D().D(), iReSqtkUVgIqLiReSqtkUVg.b, 1.0);
        iReSqtkUVgilmiReSqtkUVg2.c(iReSqtkUVgwgUiReSqtkUVg2.k());
        iReSqtkUVgilmiReSqtkUVg2.d(10.0);
        iReSqtkUVgilmiReSqtkUVg2.a_(true);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
        iReSqtkUVgMkniReSqtkUVg iReSqtkUVgMkniReSqtkUVg2 = new iReSqtkUVgMkniReSqtkUVg(64, iReSqtkUVgwDGiReSqtkUVg2);
        iReSqtkUVgMkniReSqtkUVg2.b("<name>");
        iReSqtkUVgMkniReSqtkUVg2.c(iReSqtkUVgwgUiReSqtkUVg2.k());
        iReSqtkUVgMkniReSqtkUVg2.d(12.0);
        iReSqtkUVgMkniReSqtkUVg2.a_(true);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgMkniReSqtkUVg2);
        iReSqtkUVgwDGiReSqtkUVg2.d = iReSqtkUVguOciReSqtkUVg2 = new iReSqtkUVguOciReSqtkUVg(true);
        iReSqtkUVguOciReSqtkUVg2.a(iReSqtkUVgcvhiReSqtkUVg.l);
        iReSqtkUVguOciReSqtkUVg2.c(iReSqtkUVgwgUiReSqtkUVg2.k());
        iReSqtkUVguOciReSqtkUVg2.d(60.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVguOciReSqtkUVg2);
        iReSqtkUVgwgUiReSqtkUVg2.a(iReSqtkUVgwgUiReSqtkUVg2.e(), null);
    }

    public Color i() {
        return this.e;
    }

    public List<iReSqtkUVgCSpiReSqtkUVg> j() {
        return this.f;
    }

    @Override
    public void a(List<iReSqtkUVgCSpiReSqtkUVg> list) {
        ArrayList<iReSqtkUVgCSpiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgCSpiReSqtkUVg>(this.f);
        this.f.clear();
        for (iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2 : arrayList) {
            this.a(iReSqtkUVgCSpiReSqtkUVg2);
        }
        for (iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2 : list) {
            this.b(iReSqtkUVgCSpiReSqtkUVg2.F());
        }
    }

    @Override
    public void a(String string) {
    }

    public iReSqtkUVgCSpiReSqtkUVg b(String string) {
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.c(95.0);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(1.0, 1.0, 2, 2, new iReSqtkUVgbXziReSqtkUVg(0, 5, 0, 0)));
        iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2 = new iReSqtkUVgCSpiReSqtkUVg(iReSqtkUVgwgUiReSqtkUVg2, string, this);
        this.j().add(iReSqtkUVgCSpiReSqtkUVg2);
        this.d.c(iReSqtkUVgwgUiReSqtkUVg2);
        this.g.put(iReSqtkUVgCSpiReSqtkUVg2, iReSqtkUVgwgUiReSqtkUVg2);
        return iReSqtkUVgCSpiReSqtkUVg2;
    }

    @Override
    public void a(iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2) {
        try {
            this.j().remove(iReSqtkUVgCSpiReSqtkUVg2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        if (this.g.containsKey(iReSqtkUVgCSpiReSqtkUVg2)) {
            this.d.D().b(this.g.get(iReSqtkUVgCSpiReSqtkUVg2));
        }
    }

    @Override
    public boolean a(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.e())) {
            if (jsonObject.get("value").isJsonArray()) {
                JsonArray jsonArray = jsonObject.get("value").getAsJsonArray();
                ArrayList<iReSqtkUVgCSpiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgCSpiReSqtkUVg>(this.j());
                for (iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2 : arrayList) {
                    this.a(iReSqtkUVgCSpiReSqtkUVg2);
                }
                for (iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2 : jsonArray) {
                    try {
                        iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg3 = this.b("");
                        iReSqtkUVgCSpiReSqtkUVg3.a(iReSqtkUVgCSpiReSqtkUVg2.getAsJsonObject());
                    }
                    catch (Exception exception) {}
                }
            }
            return true;
        }
        return super.a(jsonObject);
    }

    @Override
    public JsonObject g() {
        JsonObject jsonObject = super.g();
        JsonArray jsonArray = new JsonArray();
        for (iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2 : this.j()) {
            jsonArray.add((JsonElement)iReSqtkUVgCSpiReSqtkUVg2.G());
        }
        jsonObject.add("value", (JsonElement)jsonArray);
        return jsonObject;
    }

    public boolean c(String string) {
        for (iReSqtkUVgCSpiReSqtkUVg iReSqtkUVgCSpiReSqtkUVg2 : this.j()) {
            if (!iReSqtkUVgCSpiReSqtkUVg2.b() || !iReSqtkUVgCSpiReSqtkUVg2.F().equalsIgnoreCase(string)) continue;
            return true;
        }
        return this.j().isEmpty();
    }

    @Override
    public /* synthetic */ Object a() {
        return this.j();
    }
}

