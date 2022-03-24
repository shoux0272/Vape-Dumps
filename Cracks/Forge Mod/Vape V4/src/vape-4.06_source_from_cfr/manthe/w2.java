/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.pb;
import manthe.rj;
import manthe.w5;
import manthe.wK;
import manthe.wM;
import manthe.wY;
import manthe.wj;
import manthe.xA;
import manthe.xh;
import manthe.xs;
import manthe.xx;
import manthe.zu;

public class w2
extends wj {
    private w5<pb> ah;
    private w5<pb> Z;
    private xA ad;
    private xA aa;
    private xA ab;
    private w5<pb> ac;
    private w5<pb> ak;
    private xx al;
    private xx af;
    private xx Y;
    private wK ag;
    private xx X;
    private xx ai;
    private wK ae;
    private wK aj;

    public w2() {
        this.ah = new w5(rj.al().aj);
        this.Z = new w5(rj.al().aB);
        this.ad = new xA(rj.al().az);
        this.aa = new xA(rj.al().ar);
        this.ab = new xA(rj.al().ap);
        this.ac = new w5(rj.al().an);
        this.ak = new w5(rj.al().au);
        this.al = new xx(rj.al().aw);
        this.af = new xx(rj.al().at);
        this.Y = new xx(rj.al().av);
        this.ag = new wK(rj.al().al);
        this.X = new xx(rj.al().aA);
        this.ai = new xx(rj.al().ai);
        this.ae = new wK(rj.al().af);
        this.aj = new wK(rj.al().aq);
        this.a(new xh(this, "newradar", "Radar"));
        this.b(this.ah, this.Z, this.ad, this.aa, this.ab, this.ac, this.ak, this.al, this.af, this.Y, this.ag, this.X, this.ai, this.ae, this.aj);
        this.a((wM)new xs(this), new Object[0]);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "Radar";
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        zu.b(wY.class).n().f(this.b());
    }
}

