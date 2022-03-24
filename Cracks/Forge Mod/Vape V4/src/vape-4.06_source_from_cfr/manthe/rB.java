/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonArray
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import a.a;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import manthe.Ak;
import manthe.Bx;
import manthe.D3;
import manthe.DB;
import manthe.DF;
import manthe.DR;
import manthe.Ds;
import manthe.Dy;
import manthe.my;
import manthe.ng;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.qD;
import manthe.r1;
import manthe.r6;
import manthe.rf;
import manthe.rl;
import manthe.sI;
import manthe.sQ;
import manthe.sV;
import manthe.sk;
import manthe.y5;
import manthe.yF;
import manthe.yK;
import manthe.yX;
import manthe.z1;
import manthe.z3;
import manthe.zN;
import manthe.zO;
import manthe.zZ;
import manthe.zf;
import manthe.zi;

public class rB
extends r1 {
    private final rl ah = new rl("Profile preview", my.i, 0.7);
    private final y5[] ai = new y5[]{on.p.H().b(z1.class), on.p.H().b(zf.class), on.p.H().b(zZ.class), on.p.H().b(zi.class), on.p.H().b(zN.class), on.p.H().b(yF.class), on.p.H().b(yX.class), on.p.H().b(zO.class), on.p.H().b(z3.class)};
    private final boolean[] ae = new boolean[this.ai.length];
    private rf aj;
    private r6 ag;
    private Ak af;

    public rB() {
        super("viewer", false);
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.am();
        this.c(90.0);
        this.b(200.0);
        this.a(new yK(this));
    }

    private void am() {
        this.aj = new rf(false);
        this.aj.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 2, 0, 0)));
        this.d(this.aj);
        this.ah.c(65.0);
        this.ah.b(12.0);
        this.aj.b(this.ah);
        this.ag = new r6(false);
        this.ag.c(80.0);
        this.ag.b(210.0);
        this.d(this.ag);
    }

    @Override
    public void c() {
        this.a(this.af != null);
        this.d(false);
        this.f(false);
        this.Z().a(false);
        this.a(ng.d.t() - this.q());
        this.d(ng.d.k());
        this.ag.b(198.0);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        super.c(false);
    }

    public void a(Ak ak) {
        this.af = ak;
        if (ak == null) {
            return;
        }
        this.ag.A().J();
        this.ah.a(ak.r());
        String string = new String(Bx.a(a.gp(ak.l().toString())));
        if (string.length() == 0) {
            return;
        }
        JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
        jsonReader.setLenient(true);
        JsonElement jsonElement = (JsonElement)new Gson().fromJson(jsonReader, JsonElement.class);
        if (jsonElement == null || jsonElement.isJsonNull() || !jsonElement.isJsonArray()) {
            return;
        }
        JsonArray jsonArray = jsonElement.getAsJsonArray();
        if (jsonArray.size() == 0) {
            return;
        }
        JsonObject jsonObject = jsonArray.get(0).getAsJsonObject();
        this.b(jsonObject);
    }

    public void b(JsonObject jsonObject) {
        JsonObject jsonObject2 = jsonObject.get("data").getAsJsonObject();
        JsonArray jsonArray = jsonObject2.get("modules").getAsJsonArray();
        int n6 = 0;
        for (y5 y52 : this.ai) {
            try {
                Iterator iterator = jsonArray.iterator();
                while (iterator.hasNext()) {
                    try {
                        JsonElement jsonElement = (JsonElement)iterator.next();
                        JsonObject jsonObject3 = jsonElement.getAsJsonObject();
                        String string = jsonObject3.get("name").getAsString();
                        if (!string.equals(y52.H())) continue;
                        this.a(y52, jsonObject3.get("values").getAsJsonArray(), n6);
                    }
                    catch (Exception exception) {}
                }
            }
            catch (Exception exception) {
                // empty catch block
            }
            ++n6;
        }
    }

    private void a(y5 y52, JsonArray jsonArray, int n6) {
        rf rf2 = new rf(false);
        rf2.b(c);
        rf2.j(false);
        rf2.a(new D3(0.0, 4.0, 5000, 1, new pd(0, 2, 0, 2)));
        rf2.b(15.0);
        rf2.c(80.0);
        rf rf3 = new rf(false);
        rf3.a(new D3(0.0, 4.0, 5000, 1, new pd(1, 0, 1, 0)));
        rf3.c(80.0);
        rf3.b(15.0);
        ArrayList<String> arrayList = new ArrayList<String>();
        ArrayList<p1> arrayList2 = new ArrayList<p1>();
        for (JsonElement jsonElement : jsonArray) {
            JsonObject jsonObject = jsonElement.getAsJsonObject();
            String string = jsonObject.get("id").getAsString();
            if (arrayList.contains(string)) continue;
            for (Ds ds2 : y52.r()) {
                if (ds2.o() != null || !string.equals(ds2.e())) continue;
                this.a(arrayList2, ds2, jsonObject, jsonArray);
                break;
            }
            arrayList.add(string);
        }
        sQ sQ2 = new sQ(n6, y52.H(), arrayList2);
        if (this.ae[n6]) {
            ((sI)sQ2).F();
        }
        sQ2.W().e(true);
        sQ2.V().e(true);
        sQ2.c(80.0);
        sQ2.b(12.0);
        rf2.b(sQ2);
        rf3.b(rf2);
        this.ag.d(rf3);
    }

    private void a(List<p1> list, Ds ds2, JsonObject jsonObject, JsonArray jsonArray) {
        double d10;
        Ds ds3;
        if (ds2 instanceof Dy) {
            ds3 = (Dy)ds2;
            d10 = jsonObject.get("minimum").getAsDouble();
            double d11 = jsonObject.get("maximum").getAsDouble();
            sk object = new sk(((sk)ds3.c()).W(), ((sk)ds3.c()).E(), 0.1, "#.#", "", ds3.H());
            object.b(on.p.t().r.K());
            object.b(true);
            Dy dy2 = new Dy((Object)null, ds2.e(), object);
            dy2.a(new Double[]{d10, d11});
            object.a(dy2);
            object.h(d10);
            object.f(d11);
            object.c(78.0);
            object.b(7.0);
            list.add(object);
        }
        if (ds2 instanceof DF) {
            ds3 = (DF)ds2;
            d10 = jsonObject.get("value").getAsDouble();
            sV sV2 = new sV(((sV)ds3.c()).C(), ((sV)ds3.c()).D(), "#.#", "", ds3.H());
            sV2.b(on.p.t().r.K());
            sV2.b(true);
            DF dF2 = new DF((Object)null, ds2.e(), sV2);
            dF2.b(d10);
            sV2.a(dF2);
            sV2.f(d10);
            sV2.c(78.0);
            sV2.b(7.0);
            list.add(sV2);
        }
        if (ds2 instanceof DB) {
            ds3 = (DB)ds2;
            boolean bl = jsonObject.get("value").getAsBoolean();
            qD qD2 = new qD(ds2.e(), 10.0);
            qD2.b(true);
            qD2.b(on.p.t().r.K());
            DB dB2 = new DB((Object)null, ds2.e(), qD2);
            dB2.a((Boolean)bl);
            qD2.a(dB2);
            qD2.b(10.0);
            list.add(qD2);
            if (bl) {
                for (Ds ds4 : ((DR)ds3).t()) {
                    for (JsonElement jsonElement : jsonArray) {
                        JsonObject jsonObject2 = jsonElement.getAsJsonObject();
                        String string = jsonObject2.get("id").getAsString();
                        if (!string.equals(ds4.e())) continue;
                        this.a(list, ds4, jsonObject2, jsonArray);
                    }
                }
            }
        }
    }

    public Ak al() {
        return this.af;
    }

    static boolean[] a(rB rB2) {
        return rB2.ae;
    }
}

