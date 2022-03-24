/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.concurrent.atomic.AtomicBoolean;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.L;
import manthe.N;
import manthe.ng;
import manthe.rW;

public class qw {
    private L d;
    private String c;
    private int a;
    private int b = -1;
    private rW f;
    private AtomicBoolean e = new AtomicBoolean(true);
    private static boolean g;

    public qw(String string, int n6) {
        this.d = new L(n6);
        this.c = string;
        int[] arrn = N.a(string);
        this.a = arrn[0];
        this.b = arrn[1];
        this.c();
    }

    public qw(JsonObject jsonObject) {
        if (jsonObject.get("blockname") != null && !jsonObject.get("blockname").isJsonNull()) {
            this.c = jsonObject.get("blockname").getAsString();
            this.c();
        }
        if (jsonObject.get("blockid") != null && !jsonObject.get("blockid").isJsonNull()) {
            this.a = jsonObject.get("blockid").getAsInt();
        }
        if (jsonObject.get("color") != null && !jsonObject.get("color").isJsonNull()) {
            this.d = new L(jsonObject.get("color").getAsInt());
        }
        if (jsonObject.get("enabled") != null && !jsonObject.get("enabled").isJsonNull()) {
            this.e.set(jsonObject.get("enabled").getAsBoolean());
        }
        ng.e.a(this);
    }

    private void c() {
        if (this.c.contains(":")) {
            String[] arrstring = this.c.split(":");
            try {
                this.b = Integer.parseInt(arrstring[1]);
                this.a = Integer.parseInt(arrstring[0]);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public int g() {
        return this.a;
    }

    public Color b() {
        return this.d;
    }

    public JsonObject d() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("blockname", this.c);
        jsonObject.addProperty("blockid", (Number)this.a);
        jsonObject.addProperty("color", (Number)this.d.getRGB());
        jsonObject.addProperty("enabled", Boolean.valueOf(this.e.get()));
        return jsonObject;
    }

    public String i() {
        return this.c;
    }

    public rW j() {
        return this.f;
    }

    public void a(rW rW2) {
        this.f = rW2;
    }

    public int h() {
        return this.b;
    }

    public boolean a(int n6, int n10) {
        if (!this.e.get()) {
            return false;
        }
        return this.a == n6 && (this.b == -1 || this.b == n10);
    }

    public void a(int n6) {
        Color color = new Color(n6);
        this.d.a(color);
    }

    public void c(boolean bl) {
        this.e.set(bl);
    }

    public boolean a() {
        return this.e.get();
    }

    public AtomicBoolean k() {
        return this.e;
    }

    public static void b(boolean bl) {
        g = bl;
    }

    public static boolean e() {
        return g;
    }

    public static boolean f() {
        boolean bl = qw.e();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!qw.f()) {
            qw.b(true);
        }
    }
}

