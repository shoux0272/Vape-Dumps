/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.rL;
import manthe.w3;
import manthe.w5;
import manthe.wK;
import manthe.wM;
import manthe.wY;
import manthe.wj;
import manthe.xE;
import manthe.xh;
import manthe.zu;

public class wL
extends wj {
    private w5<String> ae;
    private wK Z;
    private wK aa;
    private wK X;
    private wK Y;
    private wK ab;
    private wK ac;
    private w3 ad;

    public wL() {
        this.ae = new w5(rL.am().ag);
        this.Z = new wK(rL.am().ao);
        this.aa = new wK(rL.am().am);
        this.X = new wK(rL.am().aq);
        this.Y = new wK(rL.am().ae);
        this.ab = new wK(rL.am().ar);
        this.ac = new wK(rL.am().al);
        this.ad = new w3(rL.am().an);
        this.a(new xh(this, "newtextgui", "Text GUI"));
        this.ae.a(wL.b.u);
        this.Z.a(wL.b.u);
        this.aa.a(wL.b.u);
        this.X.a(wL.b.u);
        this.Y.a(wL.b.u);
        this.ab.a(wL.b.u);
        this.ac.a(wL.b.u);
        this.ad.a(wL.b.u);
        this.b(this.ae, this.Z, this.aa, this.X, this.Y, this.ab, this.ac, this.ad);
        this.a((wM)new xE(this), new Object[0]);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "Text GUI";
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        zu.b(wY.class).al().f(this.b());
    }
}

