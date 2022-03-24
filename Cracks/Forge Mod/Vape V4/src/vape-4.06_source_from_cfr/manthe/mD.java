/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.ds;
import manthe.fG;
import manthe.fk;
import manthe.o1;
import manthe.on;

public class mD
implements o1 {
    public static mD e = new mD("air", 0);
    private String d;
    private int b;
    private boolean c = true;
    private int a = -1;

    public mD(String string, int n6) {
        this.d = string;
        this.b = n6;
        this.a();
    }

    public mD(String string) {
        this(string, 1);
    }

    public mD(int n6) {
        this(String.valueOf(n6));
    }

    private void a() {
        if (this.d.contains(":")) {
            String[] arrstring = this.d.split(":");
            this.d = arrstring[0];
            try {
                this.a = Integer.parseInt(arrstring[1]);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public String d() {
        return this.d;
    }

    public void a(String string) {
        this.d = string;
    }

    public int f() {
        return this.b;
    }

    public void b(int n6) {
        this.b = n6;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public fk e() {
        return fk.a(this.d());
    }

    public boolean a(fG fG2) {
        int n6;
        int n10;
        if (!this.c()) {
            return false;
        }
        if (this.d().toLowerCase().startsWith("slot")) {
            n10 = 0;
            try {
                n10 = Integer.parseInt(this.d().substring(4));
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (n10 >= 1 && ds.k().aU().i() + 1 == n10) {
                return true;
            }
        }
        if (this.b(fG2)) {
            return true;
        }
        if (fG2.e() || fG2.k().e()) {
            return false;
        }
        n10 = this.c(fG2) ? 1 : 0;
        if (n10 && this.a != -1 && this.a != (n6 = fG2.m())) {
            n10 = 0;
        }
        return n10;
    }

    private boolean b(fG fG2) {
        return on.p.R().a(this.d().toLowerCase(), fG2);
    }

    private boolean c(fG fG2) {
        fk fk2;
        String string = this.d().toLowerCase();
        if (string.equals(String.valueOf((fk2 = fG2.k()).h()))) {
            return true;
        }
        return string.equals(fk2.a(fG2).toLowerCase());
    }

    public int b() {
        return this.a;
    }

    public mD a(int n6) {
        this.a = n6;
        return this;
    }

    public JsonObject g() {
        JsonObject jsonObject = new JsonObject();
        String string = this.d + (this.a == -1 ? "" : ":" + this.a);
        jsonObject.addProperty("item-id", string);
        jsonObject.addProperty("total-stacks", (Number)this.b);
        jsonObject.addProperty("enabled", Boolean.valueOf(this.c));
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("item-id") != null) {
            this.d = jsonObject.get("item-id").getAsString();
            this.a();
        }
        if (jsonObject.get("total-stacks") != null) {
            this.b = jsonObject.get("total-stacks").getAsInt();
        }
        if (jsonObject.get("enabled") != null) {
            this.c = jsonObject.get("enabled").getAsBoolean();
        }
    }

    public String toString() {
        return this.d();
    }

    @Override
    public void F() {
        this.c = !this.c;
    }

    @Override
    public boolean G() {
        return this.c;
    }

    @Override
    public void g(boolean bl) {
        this.c = bl;
    }
}

