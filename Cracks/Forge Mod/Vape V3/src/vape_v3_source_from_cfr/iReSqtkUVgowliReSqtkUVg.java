/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;
import java.awt.Color;

public class iReSqtkUVgowliReSqtkUVg {
    private String a;
    private int b;
    private int c = -1;
    private int d;
    private iReSqtkUVgDgxiReSqtkUVg e;
    private Color f;

    public iReSqtkUVgowliReSqtkUVg(String string, int n) {
        this.a = string;
        this.d = n;
        this.f = new Color(this.d);
        iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVgGrkiReSqtkUVg.a(this.a.replace(" ", "_"));
        if (iReSqtkUVgGrkiReSqtkUVg2 != null) {
            this.b = iReSqtkUVgGrkiReSqtkUVg.a(iReSqtkUVgGrkiReSqtkUVg2);
        }
        this.h();
    }

    private void h() {
        if (this.a.contains(":")) {
            String[] arrstring = this.a.split(":");
            try {
                this.c = Integer.parseInt(arrstring[1]);
                this.b = Integer.parseInt(arrstring[0]);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public int a() {
        return this.b;
    }

    public Color b() {
        return new Color(this.d);
    }

    public JsonObject c() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("blockname", this.a);
        jsonObject.addProperty("blockid", (Number)this.b);
        jsonObject.addProperty("color", (Number)this.d);
        return jsonObject;
    }

    public iReSqtkUVgowliReSqtkUVg a(JsonObject jsonObject) {
        if (jsonObject.get("blockname") != null && !jsonObject.get("blockname").isJsonNull()) {
            this.a = jsonObject.get("blockname").getAsString();
            this.h();
        }
        if (jsonObject.get("blockid") != null && !jsonObject.get("blockid").isJsonNull()) {
            this.b = jsonObject.get("blockid").getAsInt();
        }
        if (jsonObject.get("color") != null && !jsonObject.get("color").isJsonNull()) {
            this.d = jsonObject.get("color").getAsInt();
        }
        iReSqtkUVgFCaiReSqtkUVg.e.a(this);
        return this;
    }

    public String d() {
        return this.a;
    }

    public iReSqtkUVgDgxiReSqtkUVg e() {
        return this.e;
    }

    public void a(iReSqtkUVgDgxiReSqtkUVg iReSqtkUVgDgxiReSqtkUVg2) {
        this.e = iReSqtkUVgDgxiReSqtkUVg2;
    }

    public int f() {
        return this.c;
    }

    public Color g() {
        return this.f;
    }

    public boolean a(int n, int n2) {
        return this.b == n && (this.c == -1 || this.c == n2);
    }
}

