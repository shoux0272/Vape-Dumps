/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import manthe.Ad;
import manthe.CQ;
import manthe.on;
import manthe.uW;
import manthe.wF;
import manthe.wG;
import manthe.wM;
import manthe.wX;
import manthe.wY;
import manthe.wp;
import manthe.wv;
import manthe.wy;
import manthe.wz;
import manthe.x2;
import manthe.xL;
import manthe.xV;
import manthe.xZ;
import manthe.y5;
import manthe.zu;

public class wT
extends wy {
    private xV ab;

    public wT() {
        super(CQ.b);
        this.a(wT.b.u);
        this.c(100.0);
        this.a(100.0);
        this.W().e(false);
        this.W().b("wrap");
        this.ab = new xV(this);
        this.a(this.ab);
        this.ar();
    }

    private void aq() {
        this.a((wM)new x2(wT.b.y), new Object[0]);
        this.a((wM)new wG("Combat", "newcombat"), new Object[0]);
        this.a((wM)new wG("Blatant", "newblatant"), new Object[0]);
        this.a((wM)new wG("Render", "newrender"), new Object[0]);
        this.a((wM)new wG("Utility", "newutility"), new Object[0]);
        this.a((wM)new wG("World", "newworld"), new Object[0]);
        this.a((wM)new wG("Minigames", "minigames"), new Object[0]);
        this.a((wM)new xZ("MISC"), new Object[0]);
        this.a((wM)new x2(wT.b.y), new Object[0]);
        this.a((wM)new wG("Friends", null, wX.class).c(new Ad(this, wX.class)), new Object[0]);
        this.a((wM)new wG("Profiles", null, wv.class).c(new Ad(this, wv.class)), new Object[0]);
        this.a((wM)new wG("Macros", null, wF.class).c(new Ad(this, wF.class)), new Object[0]);
        this.a((wM)new x2(wT.b.y), new Object[0]);
        this.a((wM)new xL(), new Object[0]);
    }

    public void ar() {
        this.J();
        if (zu.T.R.v().equals(zu.T.ad) && this.ab.n().N().length() > 0) {
            for (y5 y52 : on.p.H().e()) {
                String string;
                if (y52.Q().equals(CQ.b) || !(string = y52.H().toLowerCase()).contains(this.ab.n().N().toLowerCase())) continue;
                wz wz2 = new wz(this, y52);
                this.a((wM)wz2, new Object[0]);
                wz2.R();
            }
        } else {
            this.aq();
        }
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        this.ar();
        zu.an();
    }

    @Override
    public void b(uW uW2) {
        wY wY2 = zu.b(wY.class);
        if (wY2.m() == 3 || wY2.m() == 4) {
            return;
        }
        if (wY2.b()) {
            wY2.a(3);
            wY2.ac();
            return;
        }
        super.b(uW2);
    }

    @Override
    public void E() {
        if (zu.b(wY.class).b()) {
            return;
        }
        super.E();
    }

    @Override
    public void j() {
        wp wp2 = zu.b(wp.class);
        if (wp2.b()) {
            this.a(false);
            this.a(wp2.d(), wp2.c());
        } else if (!this.b() && !zu.aq()) {
            this.a(true);
        }
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    @Override
    public String ad() {
        return "GUI";
    }
}

