/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import com.google.gson.JsonObject;
import java.awt.Color;
import manthe.D7;
import manthe.Dp;
import manthe.bq;
import manthe.c7;
import manthe.dR;
import manthe.ds;
import manthe.k9;
import manthe.my;
import manthe.o1;
import manthe.o7;
import manthe.oe;
import manthe.pd;
import manthe.rg;
import manthe.rl;
import org.lwjgl.opengl.GL11;

public class rb
extends rg
implements o1 {
    private final Dp K;
    private String L;
    private boolean J = true;

    public rb(c7 c72, String string, Dp dp2) {
        super("", false);
        this.K = dp2;
        this.L = string;
        this.a(new D7(2.0, 10.0, 1, 1, new pd(0, 0, 0, 0)));
        this.b(12.0);
        this.c(c72.q());
        this.a(new oe(this));
        rg rg2 = new rg("x", true);
        rg2.b(12.0);
        rg2.c(12.0);
        rg2.a(new bq(this, dp2));
        c72.b(this);
        c72.b(rg2);
        rl rl2 = new rl("", my.c, 1.0);
        rl2.b(2.0);
        c72.b(rl2);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
        dR dR2 = ds.m();
        String string = this.L;
        o7.a(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), this.g() ? this.K.r().darker() : this.K.r());
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        if (string != null) {
            dR2.a(string, this.t() + 15.0, this.k() + 4.0, -1, 0.5);
        }
        o7.a(this.t(), this.k(), this.t() + 12.0, this.k() + 12.0, 0x50000000);
        o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, -16777216);
        if (this.G()) {
            o7.a(this.t() + 2.0, this.k() + 2.0, this.t() + 10.0, this.k() + 10.0, Color.WHITE);
            k9.a(Color.BLACK, (float)this.t() + 2.0f, (float)this.k() + 2.0f, "check", 8.0f, 8.0f, false);
        }
    }

    @Override
    public void F() {
        this.J = !this.J;
    }

    @Override
    public boolean G() {
        return this.J;
    }

    @Override
    public void g(boolean bl) {
        this.J = bl;
    }

    public String V() {
        return this.L;
    }

    public JsonObject H() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item-id", this.L);
        jsonObject.addProperty("enabled", Boolean.valueOf(this.J));
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("item-id") != null) {
            this.L = jsonObject.get("item-id").getAsString();
        }
        if (jsonObject.get("enabled") != null) {
            this.J = jsonObject.get("enabled").getAsBoolean();
        }
    }

    public String toString() {
        return this.L;
    }
}

