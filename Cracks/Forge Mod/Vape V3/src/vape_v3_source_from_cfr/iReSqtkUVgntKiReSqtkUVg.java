/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class iReSqtkUVgntKiReSqtkUVg
extends iReSqtkUVgnWNiReSqtkUVg {
    private int a;
    private boolean b = false;
    private boolean c;
    private boolean d;
    private int e;
    private int f;

    public iReSqtkUVgntKiReSqtkUVg(String string, String string2) {
        super(string, string2);
    }

    public int l() {
        return this.a;
    }

    public void a(int n) {
        this.a = n;
    }

    @Override
    public iReSqtkUVgnWNiReSqtkUVg b(JsonObject jsonObject) {
        super.b(jsonObject);
        if (jsonObject.get("usages") != null) {
            this.a = jsonObject.get("usages").getAsInt();
        }
        if (jsonObject.get("last_updated") != null) {
            this.a(jsonObject.get("last_updated").getAsString());
        }
        if (jsonObject.get("likes") != null) {
            this.b(jsonObject.get("likes").getAsInt());
        }
        if (jsonObject.get("dislikes") != null) {
            this.c(jsonObject.get("dislikes").getAsInt());
        }
        if (jsonObject.get("liked") != null) {
            int n = jsonObject.get("liked").getAsInt();
            if (n == 1) {
                this.c = true;
            }
            if (n == 2) {
                this.d = true;
            }
        }
        return this;
    }

    @Override
    public JsonObject i() {
        JsonObject jsonObject = super.i();
        return jsonObject;
    }

    public boolean m() {
        return this.b;
    }

    public void b(boolean bl) {
        this.b = bl;
    }

    public int n() {
        return this.e;
    }

    public double o() {
        double d2 = 1.0;
        if (this.n() > 0 && this.q() > 0) {
            d2 = (double)this.n() / ((double)this.n() + (double)this.q());
        }
        return d2;
    }

    public int p() {
        double d2 = this.o();
        int n = (int)((double)this.l() * (d2 * 1.2));
        if (this.q() > 0) {
            n = (int)((double)n / ((double)this.q() * d2 * (double)this.n()));
        }
        n = (int)((double)n + (double)this.n() * 1.5);
        return n += this.l();
    }

    public void b(int n) {
        this.e = n;
    }

    public int q() {
        return this.f;
    }

    public void c(int n) {
        this.f = n;
    }

    public boolean r() {
        return this.c;
    }

    public void c(boolean bl) {
        this.c = bl;
    }

    public boolean u() {
        return this.d;
    }

    public void d(boolean bl) {
        this.d = bl;
    }

    public void v() {
        if (this.d) {
            this.d = false;
            this.c(this.q() - 1);
        }
        if (this.c) {
            this.b(this.n() - 1);
        } else {
            this.b(this.n() + 1);
        }
        this.c = !this.c;
    }

    public void w() {
        if (this.c) {
            this.c = false;
            this.b(this.n() - 1);
        }
        if (this.d) {
            this.c(this.q() - 1);
        } else {
            this.c(this.q() + 1);
        }
        this.d = !this.d;
    }
}

