/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.List;
import manthe.Ds;
import manthe.U;
import manthe.rF;
import manthe.xy;

public class Dv
extends Ds<List<U>, rF> {
    private final rF m;
    private xy l;

    public Dv(Object object, String string, rF rF2) {
        super(object, string, rF2);
        this.m = rF2;
    }

    public static Dv a(Object object, String string) {
        return new Dv(object, string, new rF());
    }

    public List<U> r() {
        return this.l.N().n();
    }

    @Override
    public void a(List<U> list) {
    }

    @Override
    public void a(String string) {
    }

    @Override
    public void a(xy xy2) {
        this.l = xy2;
    }

    @Override
    public JsonObject m() {
        JsonObject jsonObject = this.l.K();
        jsonObject.addProperty("id", this.e());
        return jsonObject;
    }

    @Override
    public boolean a(JsonObject jsonObject) {
        this.l.a(jsonObject);
        return true;
    }
}

