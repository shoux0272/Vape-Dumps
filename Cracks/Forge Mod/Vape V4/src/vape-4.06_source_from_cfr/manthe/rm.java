/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.Gson
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonObject
 *  com.google.gson.stream.JsonReader
 */
package manthe;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.stream.JsonReader;
import java.awt.Color;
import java.io.Reader;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import manthe.AV;
import manthe.Ce;
import manthe.Cl;
import manthe.D3;
import manthe.bJ;
import manthe.d0;
import manthe.ds;
import manthe.kw;
import manthe.my;
import manthe.ng;
import manthe.on;
import manthe.pd;
import manthe.q7;
import manthe.qX;
import manthe.qp;
import manthe.qu;
import manthe.r1;
import manthe.rQ;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.sH;
import manthe.sM;
import manthe.vv;

public class rm
extends r1 {
    private final rf af;
    private final rf al;
    private final rf ag;
    private final rf ak;
    private final List<AV> aj = new ArrayList<AV>();
    private final AtomicInteger ae = new AtomicInteger(0);
    private final AtomicInteger ai = new AtomicInteger(0);
    private static int[] ah;

    public rm() {
        super("Public Profiles", false);
        this.aj().a(new D3(0.0, 5.0, 5000, 1, new pd(0, 5, 0, 5)));
        this.aj().b(210.0);
        ((D3)this.aj().u()).g();
        this.c(400.0);
        this.b(20.0);
        double d10 = this.q() * 0.3 + 5.0;
        rf rf2 = new rf(false);
        rf2.c(this.q());
        rf2.b(20.0);
        rf2.a(new D3(2.0, 0.0, 5000, 3, new pd(2, 0, 0, 0)));
        rl rl2 = new rl("Public Profiles", my.c, 1.5);
        rl2.c(128.0);
        rl2.b(20.0);
        rl2.j(false);
        rf2.b(rl2);
        rQ rQ2 = new rQ("magnify", 0.35f, 6.0f, 0.0f, true);
        sH sH2 = new sH(this, 32, rQ2);
        sH2.a("Profile Name/UUID");
        sH2.c(232.0);
        sH2.b(12.0);
        sH2.j(false);
        rf2.b(sH2);
        ((rg)rQ2).c(25.0);
        ((rg)rQ2).b(12.0);
        rQ2.z().j(false);
        rQ2.a(new vv(this, sH2));
        rf2.b(rQ2);
        this.aj().b(rf2);
        this.af = new rf(false);
        this.af.c(this.q());
        this.af.j(false);
        this.af.a(new D3(0.0, 5.0, 5000, 1, new pd(5, 0, 0, 0)));
        this.aj().b(this.af);
        this.al = new rf(false);
        this.al.c(this.q());
        this.al.j(false);
        this.al.a(false);
        this.al.a(new D3(0.0, 5.0, 5000, 1, new pd(5, 0, 0, 0)));
        this.aj().b(this.al);
        this.ak = new rf(false);
        this.ak.a(true);
        this.ag = new rf(false);
        this.ag.a(false);
        rf rf3 = new rf(false);
        rf3.a(new D3(0.0, 0.0, 5000, 1, new pd(0, (int)this.q() / 3, 0, 0)));
        rf3.c(this.q());
        rf3.b(20.0);
        rf3.b(this.ak);
        rf3.b(this.ag);
        this.aj().b(rf3);
    }

    public void al() {
        this.a(this.aj, this.af, this.ak);
        this.a(this.aj, this.al, this.ag);
    }

    private void a(List<AV> list, rf rf2, rf rf3) {
        rg rg2;
        rf2.c(this.q());
        rf2.b(185.0);
        rf2.a(new D3(0.0, 5.0, 5000, 1, new pd(5, 0, 0, 0)));
        rf3.a(new D3(0.0, 0.0, 5000, 7, new pd(0, 0, 0, 0)));
        rf3.c(this.q() / 3.0);
        rf3.b(20.0);
        rf2.v().clear();
        rf2.c();
        rf3.v().clear();
        rf3.c();
        double d10 = this.q() * 0.3;
        if (list == null || list.isEmpty()) {
            return;
        }
        qp qp2 = null;
        for (AV object2 : list) {
            if (qp2 == null || qp2.v().size() >= 9) {
                qp2 = new rf(false);
                qp2.c(rf2.q());
                qp2.b(160.0);
                qp2.a(new D3(5.0, 5.0, 5000, 3, new pd(0, 0, 0, 0)));
                ((D3)qp2.u()).g();
                qp2.a(false);
                rf2.b(qp2);
            }
            sM k = new sM(object2, d10);
            qp2.b(k);
            qp2.c();
            qp2.u().b();
        }
        AtomicInteger atomicInteger = new AtomicInteger(0);
        ArrayList<rg> arrayList = new ArrayList<rg>();
        for (int atomicInteger2 = 0; atomicInteger2 < rf2.v().size(); ++atomicInteger2) {
            rg2 = new rg(atomicInteger2 + 1 + "", false);
            arrayList.add(rg2);
            int rg3 = atomicInteger2;
            rg2.a(new qu(this, arrayList, rg2, rf2, atomicInteger, rg3));
            rg2.c(20.0);
            rg2.b(20.0);
            rf3.b(rg2);
            if (atomicInteger2 < 5) continue;
            rg2.a(false);
        }
        AtomicInteger atomicInteger2 = rf3 == this.al ? this.ai : this.ae;
        atomicInteger2.set(0);
        if (arrayList.size() >= 5) {
            rg2 = new rg("<", false);
            rg2.c(20.0);
            rg2.b(20.0);
            rg2.a(rf3);
            rg2.a(new qX(this, rg2, arrayList));
            rg2.a(new Ce(this, arrayList, atomicInteger2));
            rf3.v().add(0, rg2);
            rg rg3 = new rg(">", false);
            rg3.c(20.0);
            rg3.b(20.0);
            rg3.a(new Cl(this, rg3, atomicInteger2, arrayList));
            rg3.a(new bJ(this, atomicInteger2, arrayList));
            rf3.b(rg3);
            rf3.a(new kw(this, arrayList, rg2, rg3));
        }
        if (!arrayList.isEmpty()) {
            ((rg)arrayList.get(0)).a().a(0, 0, 0);
        }
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        d0 d02 = ds.p();
        this.a((double)(d02.g() / 2) - this.q() / 2.0 - ng.p.q() / 2.0);
        this.d((double)(d02.h() / 2) - this.b() / 2.0);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        super.c(false);
    }

    public void an() {
        String string = on.p.J();
        try {
            if (string.length() == 0) {
                this.aj.clear();
                this.af.v().clear();
                rl rl2 = new rl("Failed to load profiles", my.c, 1.0);
                rl2.b(Color.RED);
                this.af.b(rl2);
                return;
            }
            this.aj.clear();
            JsonReader jsonReader = new JsonReader((Reader)new StringReader(string));
            jsonReader.setLenient(true);
            JsonObject jsonObject = (JsonObject)new Gson().fromJson(jsonReader, JsonObject.class);
            if (jsonObject.has("profiles")) {
                JsonObject jsonObject2 = jsonObject.get("profiles").getAsJsonObject();
                for (Map.Entry entry : jsonObject2.entrySet()) {
                    if (!((JsonElement)entry.getValue()).isJsonObject()) continue;
                    JsonObject jsonObject3 = ((JsonElement)entry.getValue()).getAsJsonObject();
                    AV aV = new AV("", "");
                    aV.a(jsonObject3);
                    aV.a(UUID.fromString((String)entry.getKey()));
                    this.aj.add(aV);
                }
                this.aj.sort(new q7(this));
                this.a(this.aj, this.af, this.ak);
            }
        }
        catch (Exception exception) {
            on.a(exception);
            System.out.println(string);
        }
    }

    public List<AV> ao() {
        return this.aj;
    }

    public void a(UUID uUID) {
        Iterator<AV> iterator = this.aj.iterator();
        while (iterator.hasNext()) {
            AV aV = iterator.next();
            if (!aV.l().toString().equalsIgnoreCase(uUID.toString())) continue;
            iterator.remove();
        }
    }

    static List d(rm rm2) {
        return rm2.aj;
    }

    static rf e(rm rm2) {
        return rm2.af;
    }

    static rf b(rm rm2) {
        return rm2.ak;
    }

    static rf c(rm rm2) {
        return rm2.al;
    }

    static rf a(rm rm2) {
        return rm2.ag;
    }

    static void a(rm rm2, List list, rf rf2, rf rf3) {
        rm2.a(list, rf2, rf3);
    }

    public static void b(int[] arrn) {
        ah = arrn;
    }

    public static int[] am() {
        return ah;
    }

    static {
        if (rm.am() != null) {
            rm.b(new int[2]);
        }
    }
}

