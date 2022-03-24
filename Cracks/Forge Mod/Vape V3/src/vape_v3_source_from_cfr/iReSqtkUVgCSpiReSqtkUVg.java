/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.opengl.GL11
 */
import com.google.gson.JsonObject;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgCSpiReSqtkUVg
extends iReSqtkUVgFWjiReSqtkUVg
implements iReSqtkUVgnPQiReSqtkUVg {
    private String h;
    private iReSqtkUVgwDGiReSqtkUVg p;
    private boolean q = true;

    public iReSqtkUVgCSpiReSqtkUVg(iReSqtkUVgmasiReSqtkUVg iReSqtkUVgmasiReSqtkUVg2, String string, iReSqtkUVgwDGiReSqtkUVg iReSqtkUVgwDGiReSqtkUVg2) {
        super("", false);
        this.p = iReSqtkUVgwDGiReSqtkUVg2;
        this.h = string;
        this.a(new iReSqtkUVgLWWiReSqtkUVg(2.0, 10.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.d(12.0);
        this.c(iReSqtkUVgmasiReSqtkUVg2.k());
        this.a(new iReSqtkUVgJIriReSqtkUVg(this));
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("x", true);
        iReSqtkUVgFWjiReSqtkUVg2.d(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.c(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgjpeiReSqtkUVg(this, iReSqtkUVgwDGiReSqtkUVg2));
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.a, 1.0);
        iReSqtkUVgilmiReSqtkUVg2.d(2.0);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        String string = this.h;
        iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.c() + this.k(), this.e_() + this.l(), this.t() ? this.p.i().darker() : this.p.i());
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        iReSqtkUVgpeziReSqtkUVg2.a(string, this.c() + 15.0, this.e_() + 4.0, -1, 0.5);
        iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.c() + 12.0, this.e_() + 12.0, -16777216);
        if (this.b()) {
            iReSqtkUVgMSwiReSqtkUVg.a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k(), (float)this.c() + 1.0f, (float)this.e_() - 1.0f, "check", 0.38f);
        }
    }

    @Override
    public void b_() {
        this.q = !this.q;
    }

    @Override
    public boolean b() {
        return this.q;
    }

    @Override
    public void b(boolean bl) {
        this.q = bl;
    }

    public String F() {
        return this.h;
    }

    public JsonObject G() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item-id", this.h);
        jsonObject.addProperty("enabled", Boolean.valueOf(this.q));
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("item-id") != null) {
            this.h = jsonObject.get("item-id").getAsString();
        }
        if (jsonObject.get("enabled") != null) {
            this.q = jsonObject.get("enabled").getAsBoolean();
        }
    }
}

