/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public abstract class iReSqtkUVgWaoiReSqtkUVg<K, C extends iReSqtkUVgnCWiReSqtkUVg>
implements iReSqtkUVgqXEiReSqtkUVg {
    private final Object a;
    private String b;
    private C c;
    private K d;
    private iReSqtkUVgWaoiReSqtkUVg e;
    private boolean f = true;

    public iReSqtkUVgWaoiReSqtkUVg(Object object, String string, C c2) {
        this.a = object;
        this.b = string;
        this.c = c2;
        if (object != null) {
            if (object instanceof iReSqtkUVgKeriReSqtkUVg) {
                iReSqtkUVgFuiiReSqtkUVg.e.w().a(this);
            } else if (!(object instanceof iReSqtkUVgJZmiReSqtkUVg)) {
                iReSqtkUVgFuiiReSqtkUVg.e.e().a(this);
            }
        }
    }

    @Override
    public String N() {
        return this.b;
    }

    public abstract K a();

    public abstract void a(K var1);

    public abstract void a(String var1);

    public K b() {
        return this.d;
    }

    public void b(K k) {
        this.d = k;
    }

    public C c() {
        return this.c;
    }

    protected void a(C c2) {
        this.c = c2;
    }

    public iReSqtkUVgWaoiReSqtkUVg d() {
        return this.e;
    }

    public void a(iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2) {
        this.e = iReSqtkUVgWaoiReSqtkUVg2;
    }

    public String e() {
        return this.e != null ? this.e.b + "-" + this.b : this.b;
    }

    public Object f() {
        return this.a;
    }

    public JsonObject g() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("id", this.e());
        if (this.a() != null) {
            jsonObject.addProperty("value", this.a().toString());
        }
        return jsonObject;
    }

    public boolean a(JsonObject jsonObject) {
        if (jsonObject.get("id").getAsString().equalsIgnoreCase(this.e())) {
            this.a(jsonObject.get("value").getAsString());
            return true;
        }
        return false;
    }

    public boolean h() {
        return this.f;
    }

    public void a(boolean bl) {
        this.f = bl;
    }
}

