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
import java.util.List;

public class iReSqtkUVgeMGiReSqtkUVg
extends iReSqtkUVgWaoiReSqtkUVg<List<iReSqtkUVgDyziReSqtkUVg>, iReSqtkUVgkFTiReSqtkUVg> {
    public static final Color a = new Color(0, 170, 0);
    public static final Color b = new Color(170, 170, 170);
    public static final Color c = new Color(170, 0, 0);
    private final Color e;
    protected iReSqtkUVguOciReSqtkUVg d;
    private List<iReSqtkUVgDyziReSqtkUVg> f = new ArrayList<iReSqtkUVgDyziReSqtkUVg>();
    private int g;

    private iReSqtkUVgeMGiReSqtkUVg(Object object, String string, Color color, int n, iReSqtkUVgkFTiReSqtkUVg iReSqtkUVgkFTiReSqtkUVg2) {
        super(object, string, iReSqtkUVgkFTiReSqtkUVg2);
        this.e = color;
        this.g = n;
    }

    public static iReSqtkUVgeMGiReSqtkUVg a(Object object, String string, String string2, Color color, List<iReSqtkUVgDyziReSqtkUVg> list) {
        return iReSqtkUVgeMGiReSqtkUVg.a(object, string, string2, color, -1, list);
    }

    public static iReSqtkUVgeMGiReSqtkUVg a(Object object, String string, String string2, Color color, iReSqtkUVgDyziReSqtkUVg ... arriReSqtkUVgDyziReSqtkUVg) {
        return iReSqtkUVgeMGiReSqtkUVg.a(object, string, string2, color, -1, Arrays.asList(arriReSqtkUVgDyziReSqtkUVg));
    }

    public static iReSqtkUVgeMGiReSqtkUVg a(Object object, String string, String string2, Color color, int n, List<iReSqtkUVgDyziReSqtkUVg> list) {
        iReSqtkUVgkFTiReSqtkUVg iReSqtkUVgkFTiReSqtkUVg2 = new iReSqtkUVgkFTiReSqtkUVg(string2, null);
        iReSqtkUVgkFTiReSqtkUVg2.d(10.0);
        iReSqtkUVgeMGiReSqtkUVg iReSqtkUVgeMGiReSqtkUVg2 = new iReSqtkUVgeMGiReSqtkUVg(object, string, color, n, iReSqtkUVgkFTiReSqtkUVg2);
        iReSqtkUVgeMGiReSqtkUVg2.b(list);
        iReSqtkUVgkFTiReSqtkUVg2.b(iReSqtkUVgeMGiReSqtkUVg2);
        iReSqtkUVgeMGiReSqtkUVg.a(iReSqtkUVgkFTiReSqtkUVg2, iReSqtkUVgeMGiReSqtkUVg2, n != -1);
        iReSqtkUVgeMGiReSqtkUVg2.f.addAll(list);
        return iReSqtkUVgeMGiReSqtkUVg2;
    }

    private static void a(iReSqtkUVgkFTiReSqtkUVg iReSqtkUVgkFTiReSqtkUVg2, iReSqtkUVgeMGiReSqtkUVg iReSqtkUVgeMGiReSqtkUVg2, boolean bl) {
        iReSqtkUVguOciReSqtkUVg iReSqtkUVguOciReSqtkUVg2;
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(true);
        iReSqtkUVgwgUiReSqtkUVg2.a_("Common item names: hand, swords, shovels, axes, pickaxes, blocks, slot[1-9]");
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
        iReSqtkUVgbqSiReSqtkUVg iReSqtkUVgbqSiReSqtkUVg2 = new iReSqtkUVgbqSiReSqtkUVg(10.0, 1.0, "", " stacks", "Allowed Stacks");
        iReSqtkUVgbqSiReSqtkUVg2.e(iReSqtkUVgeMGiReSqtkUVg2.k());
        iReSqtkUVgbqSiReSqtkUVg2.c(iReSqtkUVgwgUiReSqtkUVg2.k());
        iReSqtkUVgbqSiReSqtkUVg2.d(8.0);
        if (bl) {
            iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgbqSiReSqtkUVg2);
        }
        iReSqtkUVgbEriReSqtkUVg iReSqtkUVgbEriReSqtkUVg2 = new iReSqtkUVgbEriReSqtkUVg(64, bl, iReSqtkUVgeMGiReSqtkUVg2, iReSqtkUVgbqSiReSqtkUVg2);
        iReSqtkUVgbEriReSqtkUVg2.b("<item name / id>");
        iReSqtkUVgbEriReSqtkUVg2.c(iReSqtkUVgwgUiReSqtkUVg2.k());
        iReSqtkUVgbEriReSqtkUVg2.d(12.0);
        iReSqtkUVgbEriReSqtkUVg2.a_(true);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgbEriReSqtkUVg2);
        iReSqtkUVgeMGiReSqtkUVg2.d = iReSqtkUVguOciReSqtkUVg2 = new iReSqtkUVguOciReSqtkUVg(true);
        iReSqtkUVguOciReSqtkUVg2.a(iReSqtkUVgcvhiReSqtkUVg.l);
        iReSqtkUVguOciReSqtkUVg2.c(iReSqtkUVgwgUiReSqtkUVg2.k());
        iReSqtkUVguOciReSqtkUVg2.d(60.0);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVguOciReSqtkUVg2);
        iReSqtkUVgwgUiReSqtkUVg2.a(iReSqtkUVgwgUiReSqtkUVg2.e(), null);
    }

    public Color i() {
        return this.e;
    }

    public List<iReSqtkUVgDyziReSqtkUVg> j() {
        return this.f;
    }

    @Override
    public void a(List<iReSqtkUVgDyziReSqtkUVg> list) {
        this.f = list;
    }

    @Override
    public void a(String string) {
    }

    public iReSqtkUVgDyziReSqtkUVg a(String string, int n) {
        return this.a(new iReSqtkUVgDyziReSqtkUVg(string, n));
    }

    public iReSqtkUVgDyziReSqtkUVg a(iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2) {
        this.j().add(iReSqtkUVgDyziReSqtkUVg2);
        if (this.g == -1) {
            iReSqtkUVgDyziReSqtkUVg2.a(-1);
        }
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.c(95.0);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgLWWiReSqtkUVg(1.0, 1.0, 2, 2, new iReSqtkUVgbXziReSqtkUVg(0, 5, 0, 0)));
        new iReSqtkUVgGmLiReSqtkUVg(iReSqtkUVgwgUiReSqtkUVg2, iReSqtkUVgDyziReSqtkUVg2, this);
        this.d.c(iReSqtkUVgwgUiReSqtkUVg2);
        return iReSqtkUVgDyziReSqtkUVg2;
    }

    @Override
    public void b(iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2) {
        try {
            this.j().remove(iReSqtkUVgDyziReSqtkUVg2);
        }
        catch (Exception exception) {
            // empty catch block
        }
        iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 = null;
        block2: for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 : this.d.D().o()) {
            if (!(iReSqtkUVgnCWiReSqtkUVg3 instanceof iReSqtkUVgwgUiReSqtkUVg)) continue;
            iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = (iReSqtkUVgwgUiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg3;
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg4 : iReSqtkUVgwgUiReSqtkUVg2.o()) {
                iReSqtkUVgGmLiReSqtkUVg iReSqtkUVgGmLiReSqtkUVg2;
                if (!(iReSqtkUVgnCWiReSqtkUVg4 instanceof iReSqtkUVgGmLiReSqtkUVg) || !(iReSqtkUVgGmLiReSqtkUVg2 = (iReSqtkUVgGmLiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg4).F().equals(iReSqtkUVgDyziReSqtkUVg2) && !iReSqtkUVgGmLiReSqtkUVg2.F().a().equalsIgnoreCase(iReSqtkUVgDyziReSqtkUVg2.a())) continue;
                iReSqtkUVgnCWiReSqtkUVg2 = iReSqtkUVgnCWiReSqtkUVg3;
                continue block2;
            }
        }
        if (iReSqtkUVgnCWiReSqtkUVg2 != null) {
            this.d.D().b(iReSqtkUVgnCWiReSqtkUVg2);
        }
    }

    @Override
    public boolean a(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.e())) {
            if (jsonObject.get("value").isJsonArray()) {
                JsonArray jsonArray = jsonObject.get("value").getAsJsonArray();
                ArrayList<iReSqtkUVgDyziReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgDyziReSqtkUVg>(this.j());
                for (iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2 : arrayList) {
                    this.b(iReSqtkUVgDyziReSqtkUVg2);
                }
                for (iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2 : jsonArray) {
                    try {
                        iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg3 = new iReSqtkUVgDyziReSqtkUVg("", -1);
                        iReSqtkUVgDyziReSqtkUVg3.a(iReSqtkUVgDyziReSqtkUVg2.getAsJsonObject());
                        this.a(iReSqtkUVgDyziReSqtkUVg3);
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
        for (iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2 : this.j()) {
            jsonArray.add((JsonElement)iReSqtkUVgDyziReSqtkUVg2.f());
        }
        jsonObject.add("value", (JsonElement)jsonArray);
        return jsonObject;
    }

    public boolean a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2, boolean bl) {
        if (bl && this.f.isEmpty()) {
            return false;
        }
        for (iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2 : this.j()) {
            if (!iReSqtkUVgDyziReSqtkUVg2.a(iReSqtkUVgyetiReSqtkUVg2)) continue;
            return true;
        }
        return false;
    }

    public boolean a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        return this.a(iReSqtkUVgyetiReSqtkUVg2, false);
    }

    public boolean b(String string) {
        boolean bl = true;
        for (iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2 : this.f) {
            if (!iReSqtkUVgDyziReSqtkUVg2.c()) continue;
            if (iReSqtkUVgDyziReSqtkUVg2.a().toLowerCase().equals(string.toLowerCase())) {
                return true;
            }
            bl = false;
        }
        return bl;
    }

    public iReSqtkUVgDyziReSqtkUVg c(String string) {
        for (iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2 : this.f) {
            if (!iReSqtkUVgDyziReSqtkUVg2.a().toLowerCase().equals(string.toLowerCase())) continue;
            return iReSqtkUVgDyziReSqtkUVg2;
        }
        return null;
    }

    public int k() {
        return this.g;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.j();
    }
}

