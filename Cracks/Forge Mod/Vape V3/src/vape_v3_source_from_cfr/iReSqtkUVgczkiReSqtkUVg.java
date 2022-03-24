/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.stream.JsonReader
 */
import a.a;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.stream.JsonReader;
import java.awt.Color;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

public class iReSqtkUVgczkiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private iReSqtkUVgwgUiReSqtkUVg p;
    private iReSqtkUVgwgUiReSqtkUVg q;
    private iReSqtkUVgwgUiReSqtkUVg r;
    private iReSqtkUVgwgUiReSqtkUVg s;
    private List<iReSqtkUVgntKiReSqtkUVg> t = new ArrayList<iReSqtkUVgntKiReSqtkUVg>();
    private AtomicInteger u = new AtomicInteger(0);
    private AtomicInteger v = new AtomicInteger(0);

    public iReSqtkUVgczkiReSqtkUVg() {
        super("Public Profiles", false);
        this.J().a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 5.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 5, 0, 5)));
        this.J().d(210.0);
        ((iReSqtkUVgXVAiReSqtkUVg)this.J().r()).g();
        this.c(400.0);
        this.d(20.0);
        double d2 = this.k() * 0.3 + 5.0;
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg2.c(this.k());
        iReSqtkUVgwgUiReSqtkUVg2.d(20.0);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgXVAiReSqtkUVg(2.0, 0.0, 5000, 3, new iReSqtkUVgbXziReSqtkUVg(2, 0, 0, 0)));
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("Public Profiles", iReSqtkUVgIqLiReSqtkUVg.a, 1.5);
        iReSqtkUVgilmiReSqtkUVg2.c(128.0);
        iReSqtkUVgilmiReSqtkUVg2.d(20.0);
        iReSqtkUVgilmiReSqtkUVg2.c(false);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
        iReSqtkUVgCABiReSqtkUVg iReSqtkUVgCABiReSqtkUVg2 = new iReSqtkUVgCABiReSqtkUVg("magnify", 0.35f, 6.0f, 0.0f, true);
        iReSqtkUVgSkUiReSqtkUVg iReSqtkUVgSkUiReSqtkUVg2 = new iReSqtkUVgSkUiReSqtkUVg(this, 32, iReSqtkUVgCABiReSqtkUVg2);
        iReSqtkUVgSkUiReSqtkUVg2.b("Profile Name/UUID");
        iReSqtkUVgSkUiReSqtkUVg2.c(232.0);
        iReSqtkUVgSkUiReSqtkUVg2.d(12.0);
        iReSqtkUVgSkUiReSqtkUVg2.c(false);
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgSkUiReSqtkUVg2);
        ((iReSqtkUVgFWjiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2).c(25.0);
        ((iReSqtkUVgFWjiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2).d(12.0);
        iReSqtkUVgCABiReSqtkUVg2.D().c(false);
        iReSqtkUVgCABiReSqtkUVg2.a(new iReSqtkUVgPepiReSqtkUVg(this, iReSqtkUVgSkUiReSqtkUVg2));
        iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgCABiReSqtkUVg2);
        this.J().a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg2);
        this.p = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.p.c(this.k());
        this.p.c(false);
        this.p.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 5.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(5, 0, 0, 0)));
        this.J().a((iReSqtkUVgnCWiReSqtkUVg)this.p);
        this.q = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.q.c(this.k());
        this.q.c(false);
        this.q.a_(false);
        this.q.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 5.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(5, 0, 0, 0)));
        this.J().a((iReSqtkUVgnCWiReSqtkUVg)this.q);
        this.s = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.s.a_(true);
        this.r = new iReSqtkUVgwgUiReSqtkUVg(false);
        this.r.a_(false);
        iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg3 = new iReSqtkUVgwgUiReSqtkUVg(false);
        iReSqtkUVgwgUiReSqtkUVg3.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, (int)this.k() / 3, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg3.c(this.k());
        iReSqtkUVgwgUiReSqtkUVg3.d(20.0);
        iReSqtkUVgwgUiReSqtkUVg3.a((iReSqtkUVgnCWiReSqtkUVg)this.s);
        iReSqtkUVgwgUiReSqtkUVg3.a((iReSqtkUVgnCWiReSqtkUVg)this.r);
        this.J().a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgwgUiReSqtkUVg3);
    }

    public void R() {
        this.a(this.t, this.p, this.s);
        this.a(this.t, this.q, this.r);
    }

    private void a(List<iReSqtkUVgntKiReSqtkUVg> list, iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2, iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg3) {
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2;
        iReSqtkUVgwgUiReSqtkUVg2.c(this.k());
        iReSqtkUVgwgUiReSqtkUVg2.d(185.0);
        iReSqtkUVgwgUiReSqtkUVg2.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 5.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(5, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg3.a(new iReSqtkUVgXVAiReSqtkUVg(0.0, 0.0, 5000, 7, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        iReSqtkUVgwgUiReSqtkUVg3.c(this.k() / 3.0);
        iReSqtkUVgwgUiReSqtkUVg3.d(20.0);
        iReSqtkUVgwgUiReSqtkUVg2.o().clear();
        iReSqtkUVgwgUiReSqtkUVg2.c_();
        iReSqtkUVgwgUiReSqtkUVg3.o().clear();
        iReSqtkUVgwgUiReSqtkUVg3.c_();
        double d2 = this.k() * 0.3;
        if (list == null || list.isEmpty()) {
            return;
        }
        iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2 = null;
        for (iReSqtkUVgntKiReSqtkUVg object2 : list) {
            if (iReSqtkUVgcvhiReSqtkUVg2 == null || iReSqtkUVgcvhiReSqtkUVg2.o().size() >= 9) {
                iReSqtkUVgcvhiReSqtkUVg2 = new iReSqtkUVgwgUiReSqtkUVg(false);
                iReSqtkUVgcvhiReSqtkUVg2.c(iReSqtkUVgwgUiReSqtkUVg2.k());
                iReSqtkUVgcvhiReSqtkUVg2.d(160.0);
                iReSqtkUVgcvhiReSqtkUVg2.a(new iReSqtkUVgXVAiReSqtkUVg(5.0, 5.0, 5000, 3, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
                ((iReSqtkUVgXVAiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg2.r()).g();
                iReSqtkUVgcvhiReSqtkUVg2.a_(false);
                iReSqtkUVgwgUiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgcvhiReSqtkUVg2);
            }
            iReSqtkUVgKLIiReSqtkUVg i = new iReSqtkUVgKLIiReSqtkUVg(object2, d2);
            iReSqtkUVgcvhiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)i);
            iReSqtkUVgcvhiReSqtkUVg2.c_();
            iReSqtkUVgcvhiReSqtkUVg2.r().h();
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList<iReSqtkUVgFWjiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgFWjiReSqtkUVg>();
        for (int atomicInteger2 = 0; atomicInteger2 < iReSqtkUVgwgUiReSqtkUVg2.o().size(); ++atomicInteger2) {
            iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg(atomicInteger2 + 1 + "", false);
            arrayList.add(iReSqtkUVgFWjiReSqtkUVg2);
            int iReSqtkUVgFWjiReSqtkUVg3 = atomicInteger2;
            iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgJOaiReSqtkUVg(this, arrayList, iReSqtkUVgFWjiReSqtkUVg2, iReSqtkUVgwgUiReSqtkUVg2, atomicInteger, iReSqtkUVgFWjiReSqtkUVg3));
            iReSqtkUVgFWjiReSqtkUVg2.c(20.0);
            iReSqtkUVgFWjiReSqtkUVg2.d(20.0);
            iReSqtkUVgwgUiReSqtkUVg3.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
            if (atomicInteger2 < 5) continue;
            iReSqtkUVgFWjiReSqtkUVg2.a_(false);
        }
        AtomicInteger atomicInteger2 = iReSqtkUVgwgUiReSqtkUVg3 == this.q ? this.v : this.u;
        atomicInteger2.set(0);
        if (arrayList.size() >= 5) {
            iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("<", false);
            iReSqtkUVgFWjiReSqtkUVg2.c(20.0);
            iReSqtkUVgFWjiReSqtkUVg2.d(20.0);
            iReSqtkUVgFWjiReSqtkUVg2.a(iReSqtkUVgwgUiReSqtkUVg3);
            iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgPDniReSqtkUVg(this, iReSqtkUVgFWjiReSqtkUVg2, arrayList));
            iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVggMmiReSqtkUVg(this, arrayList, atomicInteger2));
            iReSqtkUVgwgUiReSqtkUVg3.o().add(0, iReSqtkUVgFWjiReSqtkUVg2);
            iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg3 = new iReSqtkUVgFWjiReSqtkUVg(">", false);
            iReSqtkUVgFWjiReSqtkUVg3.c(20.0);
            iReSqtkUVgFWjiReSqtkUVg3.d(20.0);
            iReSqtkUVgFWjiReSqtkUVg3.a(new iReSqtkUVgVFbiReSqtkUVg(this, iReSqtkUVgFWjiReSqtkUVg3, atomicInteger2, arrayList));
            iReSqtkUVgFWjiReSqtkUVg3.a(new iReSqtkUVgsvkiReSqtkUVg(this, atomicInteger2, arrayList));
            iReSqtkUVgwgUiReSqtkUVg3.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg3);
            iReSqtkUVgwgUiReSqtkUVg3.a(new iReSqtkUVgLeuiReSqtkUVg(this, arrayList, iReSqtkUVgFWjiReSqtkUVg2, iReSqtkUVgFWjiReSqtkUVg3));
        }
        if (!arrayList.isEmpty()) {
            ((iReSqtkUVgFWjiReSqtkUVg)arrayList.get(0)).d_().a(0, 0, 0);
        }
    }

    @Override
    public void c_() {
        this.b_(false);
        this.c_(false);
        this.L().a_(false);
        iReSqtkUVgdAbiReSqtkUVg iReSqtkUVgdAbiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.o();
        this.a_((double)(iReSqtkUVgdAbiReSqtkUVg2.e() / 2) - this.k() / 2.0 - iReSqtkUVgFCaiReSqtkUVg.g.k() / 2.0);
        this.b((double)(iReSqtkUVgdAbiReSqtkUVg2.f() / 2) - this.l() / 2.0);
        super.c_();
    }

    @Override
    public void a(boolean bl) {
        super.a(false);
    }

    public void S() {
        String string = a.a.sp("/config/pub/get.all.php", "");
        if (string.length() == 0) {
            this.t.clear();
            this.p.o().clear();
            iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("Failed to load profiles", iReSqtkUVgIqLiReSqtkUVg.a, 1.0);
            iReSqtkUVgilmiReSqtkUVg2.a(Color.RED);
            this.p.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
            return;
        }
        try {
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonElement jsonElement = (JsonElement)new Gson().fromJson(jsonReader, JsonElement.class);
            if (jsonElement == null || jsonElement.isJsonNull() || !jsonElement.isJsonArray()) {
                this.a_(false);
                return;
            }
            this.t.clear();
            JsonArray jsonArray = jsonElement.getAsJsonArray();
            ArrayList<iReSqtkUVgntKiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgntKiReSqtkUVg>();
            for (JsonElement object : jsonArray) {
                if (!object.isJsonObject()) continue;
                try {
                    iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = new iReSqtkUVgntKiReSqtkUVg("", "");
                    iReSqtkUVgntKiReSqtkUVg2.b(object.getAsJsonObject());
                    arrayList.add(iReSqtkUVgntKiReSqtkUVg2);
                }
                catch (Exception exception) {}
            }
            arrayList.sort(new iReSqtkUVgvzCiReSqtkUVg(this));
            for (iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg3 : arrayList) {
                this.t.add(iReSqtkUVgntKiReSqtkUVg3);
            }
            this.a(this.t, this.p, this.s);
        }
        catch (Exception exception) {
            exception.printStackTrace();
            System.out.println(string);
        }
    }

    public List<iReSqtkUVgntKiReSqtkUVg> T() {
        return this.t;
    }

    public void a(UUID uUID) {
        Iterator<iReSqtkUVgntKiReSqtkUVg> iterator = this.t.iterator();
        while (iterator.hasNext()) {
            iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = iterator.next();
            if (!iReSqtkUVgntKiReSqtkUVg2.f().toString().equalsIgnoreCase(uUID.toString())) continue;
            iterator.remove();
        }
    }

    static /* synthetic */ List a(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2) {
        return iReSqtkUVgczkiReSqtkUVg2.t;
    }

    static /* synthetic */ iReSqtkUVgwgUiReSqtkUVg b(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2) {
        return iReSqtkUVgczkiReSqtkUVg2.p;
    }

    static /* synthetic */ iReSqtkUVgwgUiReSqtkUVg c(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2) {
        return iReSqtkUVgczkiReSqtkUVg2.s;
    }

    static /* synthetic */ iReSqtkUVgwgUiReSqtkUVg d(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2) {
        return iReSqtkUVgczkiReSqtkUVg2.q;
    }

    static /* synthetic */ iReSqtkUVgwgUiReSqtkUVg e(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2) {
        return iReSqtkUVgczkiReSqtkUVg2.r;
    }

    static /* synthetic */ void a(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2, List list, iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg2, iReSqtkUVgwgUiReSqtkUVg iReSqtkUVgwgUiReSqtkUVg3) {
        iReSqtkUVgczkiReSqtkUVg2.a(list, iReSqtkUVgwgUiReSqtkUVg2, iReSqtkUVgwgUiReSqtkUVg3);
    }
}

