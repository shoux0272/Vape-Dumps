/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.ra;
import manthe.wK;
import manthe.wM;
import manthe.wY;
import manthe.wj;
import manthe.xJ;
import manthe.xR;
import manthe.xh;
import manthe.xx;
import manthe.zu;

public class wJ
extends wj {
    private xx Y;
    private xx aa;
    private xx X;
    private wK Z;

    public wJ() {
        this.Y = new xx(ra.al().ae);
        this.aa = new xx(ra.al().ah);
        this.X = new xx(ra.al().af);
        this.Z = new wK(ra.al().ai);
        this.a(new xh(this, "newrearview", "Rearview"));
        this.Y.a(wJ.b.u);
        this.aa.a(wJ.b.u);
        this.X.a(wJ.b.u);
        this.Z.a(wJ.b.u);
        this.b(this.Y, this.aa, this.X, this.Z, new xJ(this, wJ.b.y));
        this.a((wM)new xR(this), new Object[0]);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "Rearview";
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        zu.b(wY.class).am().f(this.b());
    }
}

