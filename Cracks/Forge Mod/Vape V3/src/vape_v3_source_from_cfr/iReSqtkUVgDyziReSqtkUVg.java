/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
import com.google.gson.JsonObject;

public class iReSqtkUVgDyziReSqtkUVg {
    private String a;
    private int b;
    private boolean c = true;
    private int d = -1;

    public iReSqtkUVgDyziReSqtkUVg(String string, int n) {
        this.a = string;
        this.b = n;
        this.g();
    }

    private void g() {
        if (this.a.contains(":")) {
            String[] arrstring = this.a.split(":");
            this.a = arrstring[0];
            try {
                this.d = Integer.parseInt(arrstring[1]);
            }
            catch (Exception exception) {
                // empty catch block
            }
        }
    }

    public iReSqtkUVgDyziReSqtkUVg(String string) {
        this(string, 1);
    }

    public String a() {
        return this.a;
    }

    public void a(String string) {
        this.a = string;
    }

    public int b() {
        return this.b;
    }

    public void a(int n) {
        this.b = n;
    }

    public boolean c() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public iReSqtkUVgLUhiReSqtkUVg d() {
        return iReSqtkUVgLUhiReSqtkUVg.a(this.a());
    }

    public boolean a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        int n;
        int n2;
        if (!this.c()) {
            return false;
        }
        if (this.a().toLowerCase().startsWith("slot")) {
            n2 = 0;
            try {
                n2 = Integer.parseInt(this.a().substring(4));
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (n2 >= 1 && iReSqtkUVgeLLiReSqtkUVg.e().aZ().d() + 1 == n2) {
                return true;
            }
        }
        if (this.b(iReSqtkUVgyetiReSqtkUVg2)) {
            return true;
        }
        if (iReSqtkUVgyetiReSqtkUVg2.b() || iReSqtkUVgyetiReSqtkUVg2.e().b()) {
            return false;
        }
        n2 = this.c(iReSqtkUVgyetiReSqtkUVg2) ? 1 : 0;
        if (n2 && this.d != -1 && this.d != (n = iReSqtkUVgyetiReSqtkUVg2.g())) {
            n2 = 0;
        }
        return n2;
    }

    private boolean b(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        return iReSqtkUVgFuiiReSqtkUVg.e.x().a(this.a().toLowerCase(), iReSqtkUVgyetiReSqtkUVg2);
    }

    private boolean c(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
        String string = this.a().toLowerCase();
        if (string.equals(String.valueOf((iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e()).e()))) {
            return true;
        }
        return string.equals(iReSqtkUVgLUhiReSqtkUVg2.b(iReSqtkUVgyetiReSqtkUVg2).toLowerCase());
    }

    public int e() {
        return this.d;
    }

    public JsonObject f() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("item-id", this.a);
        jsonObject.addProperty("total-stacks", (Number)this.b);
        jsonObject.addProperty("enabled", Boolean.valueOf(this.c));
        return jsonObject;
    }

    public void a(JsonObject jsonObject) {
        if (jsonObject.get("item-id") != null) {
            this.a = jsonObject.get("item-id").getAsString();
            this.g();
        }
        if (jsonObject.get("total-stacks") != null) {
            this.b = jsonObject.get("total-stacks").getAsInt();
        }
        if (jsonObject.get("enabled") != null) {
            this.c = jsonObject.get("enabled").getAsBoolean();
        }
    }
}

