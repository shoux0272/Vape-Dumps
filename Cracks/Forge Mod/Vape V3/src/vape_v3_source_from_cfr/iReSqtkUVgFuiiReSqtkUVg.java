/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 *  iReSqtkUVgtuyiReSqtkUVg
 */
import a.a;
import a.d;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.PrintWriter;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class iReSqtkUVgFuiiReSqtkUVg {
    public static final boolean a = false;
    public static final boolean b = false;
    public static final String c = "3.25";
    public static boolean d = false;
    public static iReSqtkUVgFuiiReSqtkUVg e;
    public iReSqtkUVgEGXiReSqtkUVg f;
    public boolean g;
    private iReSqtkUVgfneiReSqtkUVg h;
    private iReSqtkUVgCFniReSqtkUVg i;
    private iReSqtkUVgpxViReSqtkUVg j;
    private iReSqtkUVgeIViReSqtkUVg k;
    private iReSqtkUVgQBHiReSqtkUVg l;
    private iReSqtkUVgchQiReSqtkUVg m;
    private iReSqtkUVgBvTiReSqtkUVg n;
    private iReSqtkUVgFCaiReSqtkUVg o;
    private iReSqtkUVgLnYiReSqtkUVg p;
    private iReSqtkUVgipYiReSqtkUVg q;
    private iReSqtkUVgVUTiReSqtkUVg r;
    private iReSqtkUVgKeriReSqtkUVg s;
    private iReSqtkUVgkXGiReSqtkUVg t;
    private iReSqtkUVgKUuiReSqtkUVg u;
    private boolean v;
    private boolean w;
    private static int[] x;
    private iReSqtkUVgCRDiReSqtkUVg y;
    private iReSqtkUVgCRDiReSqtkUVg z;
    private ConcurrentMap<Integer, iReSqtkUVgCRDiReSqtkUVg> A = new ConcurrentHashMap<Integer, iReSqtkUVgCRDiReSqtkUVg>();
    private iReSqtkUVghmKiReSqtkUVg B;

    public iReSqtkUVgFuiiReSqtkUVg() {
        e = this;
        this.f = new iReSqtkUVgEGXiReSqtkUVg();
        try {
            this.f.a();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public static void a(String string) {
        a.a.p(String.format("[%02d] %s", System.currentTimeMillis(), string));
    }

    public static void a(Exception exception) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        exception.printStackTrace(printWriter);
        String string = "\n" + stringWriter.toString();
        iReSqtkUVgFuiiReSqtkUVg.a(string);
    }

    public void a() {
        this.h = new iReSqtkUVgfneiReSqtkUVg();
        this.h.a();
        a.a.fs();
        iReSqtkUVgfneiReSqtkUVg.a.clear();
        this.h = new iReSqtkUVgfneiReSqtkUVg();
        this.h.a();
        a.a.dc();
    }

    public void b() {
        this.l = new iReSqtkUVgQBHiReSqtkUVg();
        this.l.a(24, 1);
        this.k = new iReSqtkUVgeIViReSqtkUVg();
        this.k.a();
        while (!this.k.c()) {
            try {
                Thread.sleep(10L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        this.i = new iReSqtkUVgCFniReSqtkUVg();
        this.t = new iReSqtkUVgkXGiReSqtkUVg();
        this.m = new iReSqtkUVgchQiReSqtkUVg();
        this.p = new iReSqtkUVgLnYiReSqtkUVg();
        this.q = new iReSqtkUVgipYiReSqtkUVg();
        this.r = new iReSqtkUVgVUTiReSqtkUVg();
        this.s = new iReSqtkUVgKeriReSqtkUVg();
        this.j = new iReSqtkUVgpxViReSqtkUVg();
        this.j.a();
        this.r.k = this.j.a(iReSqtkUVgNEciReSqtkUVg.class);
        this.o = new iReSqtkUVgFCaiReSqtkUVg();
        this.o.b();
        this.n = new iReSqtkUVgBvTiReSqtkUVg();
        this.n.a((JsonArray)null);
        this.j.b();
        this.p();
        this.j.c();
        this.k.b();
        if (this.r.l.i().booleanValue() && iReSqtkUVgFuiiReSqtkUVg.y()) {
            ((iReSqtkUVgRNziReSqtkUVg)this.r.j.c()).b(true);
            a.a.sb();
            this.p();
            ((iReSqtkUVgRNziReSqtkUVg)this.r.j.c()).b(true);
        }
        this.u = new iReSqtkUVgKUuiReSqtkUVg();
    }

    public iReSqtkUVgfneiReSqtkUVg c() {
        return this.h;
    }

    public void a(boolean bl) {
        new iReSqtkUVgtuyiReSqtkUVg(this, bl).start();
    }

    public iReSqtkUVgpxViReSqtkUVg d() {
        return this.j;
    }

    public iReSqtkUVgCFniReSqtkUVg e() {
        return this.i;
    }

    public iReSqtkUVgeIViReSqtkUVg f() {
        return this.k;
    }

    public boolean g() {
        return this.g;
    }

    public iReSqtkUVgQBHiReSqtkUVg h() {
        return this.l;
    }

    public iReSqtkUVghmKiReSqtkUVg i() {
        return this.B;
    }

    public iReSqtkUVgchQiReSqtkUVg j() {
        return this.m;
    }

    public iReSqtkUVgBvTiReSqtkUVg k() {
        return this.n;
    }

    public iReSqtkUVgLnYiReSqtkUVg l() {
        return this.p;
    }

    public iReSqtkUVgFCaiReSqtkUVg m() {
        return this.o;
    }

    public void a(JsonObject jsonObject) {
        JsonArray jsonArray;
        if (jsonObject.get("independentSettings") != null && !jsonObject.get("independentSettings").isJsonNull()) {
            jsonArray = jsonObject.get("independentSettings").getAsJsonArray();
            this.t.a(jsonArray);
        }
        if (jsonObject.get("friends") != null && !jsonObject.get("friends").isJsonNull()) {
            jsonArray = jsonObject.get("friends").getAsJsonArray();
            this.m.a(jsonArray);
        }
        if (jsonObject.get("profiles") != null && !jsonObject.get("profiles").isJsonNull()) {
            jsonArray = jsonObject.get("profiles").getAsJsonArray();
            this.n.a(jsonArray);
        }
        if (jsonObject.get("frames") != null && !jsonObject.get("frames").isJsonNull()) {
            jsonArray = jsonObject.get("frames").getAsJsonArray();
            this.o.a(jsonArray);
        }
    }

    public JsonObject n() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("modules", (JsonElement)this.j.f());
        jsonObject.add("values", (JsonElement)this.i.b());
        jsonObject.add("macros", (JsonElement)this.p.a());
        jsonObject.add("search", (JsonElement)this.q.b());
        jsonObject.add("frames", (JsonElement)this.o.e());
        return jsonObject;
    }

    public JsonObject o() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.add("independentSettings", (JsonElement)this.t.a());
        jsonObject.add("friends", (JsonElement)this.m.d());
        jsonObject.add("profiles", (JsonElement)this.n.d());
        return jsonObject;
    }

    public void p() {
        try {
            String string = new String(iReSqtkUVgLMUiReSqtkUVg.a(a.a.gs()));
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
            if (jsonObject != null) {
                e.a(jsonObject);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void q() {
        try {
            if (e.k().b() != null) {
                e.k().b().d();
            }
            JsonObject jsonObject = e.o();
            a.a.ss(iReSqtkUVgLMUiReSqtkUVg.a(jsonObject.toString().getBytes()));
            for (iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2 : this.n.a()) {
                iReSqtkUVgnWNiReSqtkUVg2.a(true);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public iReSqtkUVgVUTiReSqtkUVg r() {
        return this.r;
    }

    public iReSqtkUVgipYiReSqtkUVg s() {
        return this.q;
    }

    public boolean t() {
        return this.v;
    }

    public void b(boolean bl) {
        this.v = bl;
    }

    public boolean u() {
        return this.w;
    }

    public void c(boolean bl) {
        this.w = bl;
    }

    public iReSqtkUVgKeriReSqtkUVg v() {
        return this.s;
    }

    public iReSqtkUVgkXGiReSqtkUVg w() {
        return this.t;
    }

    public iReSqtkUVgKUuiReSqtkUVg x() {
        return this.u;
    }

    public static boolean y() {
        for (int n : x) {
            if (n != iReSqtkUVgauSiReSqtkUVg.d()) continue;
            return true;
        }
        return false;
    }

    public void z() {
        d = true;
        this.B = new iReSqtkUVghmKiReSqtkUVg();
        this.B.a();
    }

    public void A() {
        this.B.b();
    }

    public void B() {
        this.y = new iReSqtkUVgCRDiReSqtkUVg(18);
        this.A.put(18, this.y);
        this.z = new iReSqtkUVgCRDiReSqtkUVg(10);
        this.A.put(10, this.z);
    }

    public iReSqtkUVgCRDiReSqtkUVg C() {
        return this.y;
    }

    public iReSqtkUVgCRDiReSqtkUVg D() {
        return this.z;
    }

    public iReSqtkUVgCRDiReSqtkUVg a(double d2) {
        int n = (int)(18.0 * d2);
        if (!this.A.containsKey(n)) {
            iReSqtkUVgCRDiReSqtkUVg iReSqtkUVgCRDiReSqtkUVg2 = new iReSqtkUVgCRDiReSqtkUVg(n);
            this.A.put(n, iReSqtkUVgCRDiReSqtkUVg2);
            return iReSqtkUVgCRDiReSqtkUVg2;
        }
        return (iReSqtkUVgCRDiReSqtkUVg)this.A.get(n);
    }

    public void E() {
        a.d.onGuiClosed(a.d.getGuiObject());
        iReSqtkUVgeLLiReSqtkUVg.a(null);
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = this.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        iReSqtkUVgypOiReSqtkUVg2.a();
        this.m().b();
        iReSqtkUVgypOiReSqtkUVg2.i();
        this.p();
    }

    static {
        x = new int[]{13, 15, 23};
    }
}

