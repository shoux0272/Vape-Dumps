/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.Ak;

public class AV
extends Ak {
    private int o;
    private boolean p = false;

    public AV(String string, String string2) {
        super(string, string2);
    }

    @Override
    public int m() {
        return this.o;
    }

    @Override
    public Ak a(JsonObject jsonObject) {
        super.a(jsonObject);
        if (jsonObject.get("uses") != null) {
            this.o = jsonObject.get("uses").getAsInt();
        }
        return this;
    }

    @Override
    public JsonObject y() {
        JsonObject jsonObject = super.y();
        return jsonObject;
    }

    public boolean C() {
        return this.p;
    }

    public void c(boolean bl) {
        this.p = bl;
    }
}

