/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Collections;
import manthe.CQ;
import manthe.bz;
import manthe.nm;
import manthe.on;
import manthe.wM;
import manthe.we;
import manthe.wz;
import manthe.xW;
import manthe.xg;
import manthe.y5;
import manthe.zu;

public class wy
extends we
implements bz {
    private String aa;
    private CQ Z;
    protected xW Y;
    private boolean V;
    private y5 X;
    private static int[] W;

    public wy(CQ cQ) {
        this.aa = cQ.H();
        this.Z = cQ;
        if (cQ.equals(CQ.b)) {
            return;
        }
        this.a(wy.b.k);
        this.c(200.0);
        this.a(100.0);
        this.W().e(false);
        this.W().b("wrap");
        this.ap();
        this.a(false);
    }

    public void ap() {
        this.Y = new xW(this, "new" + this.aa.toLowerCase(), this.aa);
        this.a(this.Y);
        ArrayList<y5> arrayList = new ArrayList<y5>(on.p.H().e());
        Collections.sort(arrayList, new nm());
        for (y5 y52 : arrayList) {
            if (!y52.Q().equals(this.Z)) continue;
            wz wz2 = new wz(this, y52);
            this.a((wM)wz2, new Object[0]);
            wz2.R();
        }
    }

    public int ao() {
        int n6 = 0;
        for (wM wM2 : this.w()) {
            if (wM2 instanceof wz) {
                boolean bl = ((wz)wM2).S().x();
                ((wz)wM2).f(false);
                if (!bl) {
                    ++n6;
                }
                if (zu.E) {
                    wM2.a(true);
                    continue;
                }
                wM2.a(bl);
                continue;
            }
            if (wM2 instanceof xg) continue;
            wM2.a(false);
        }
        this.M();
        return n6;
    }

    @Override
    public void a(JsonObject jsonObject) {
        super.a(jsonObject);
        this.a((y5)null);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    public wz b(y5 y52) {
        for (wM wM2 : this.w()) {
            if (!(wM2 instanceof wz) || !((wz)wM2).S().equals(y52)) continue;
            return (wz)wM2;
        }
        return null;
    }

    public y5 ak() {
        return this.X;
    }

    public CQ an() {
        return this.Z;
    }

    public String al() {
        return this.aa;
    }

    public void a(y5 y52) {
        if (this.X != null) {
            this.b(this.X).N();
        }
        this.X = y52;
        if (this.Y == null) {
            return;
        }
        if (y52 == null) {
            this.Y.a((y5)null);
            this.Y.b((y5)null);
            return;
        }
        int n6 = -1;
        int n10 = -1;
        block0: for (wM wM2 : this.w()) {
            int n11;
            if (!(wM2 instanceof wz) || !((wz)wM2).S().equals(y52)) continue;
            for (n11 = this.w().indexOf(wM2) - 1; n11 > 0; --n11) {
                if (!(this.w().get(n11) instanceof wz) || !((wz)this.w().get(n11)).S().x()) continue;
                n10 = n11;
                break;
            }
            for (n11 = this.w().indexOf(wM2) + 1; n11 < this.w().size(); ++n11) {
                if (!(this.w().get(n11) instanceof wz) || !((wz)this.w().get(n11)).S().x()) continue;
                n6 = n11;
                break block0;
            }
        }
        this.Y.a(n6 == -1 ? null : ((wz)this.w().get(n6)).S());
        this.Y.b(n10 == -1 ? null : ((wz)this.w().get(n10)).S());
        this.M();
    }

    @Override
    public String ad() {
        return this.Z.H();
    }

    @Override
    public void n() {
        if (this.Y == null) {
            return;
        }
        this.V = !this.V;
        this.Y.J();
    }

    @Override
    public boolean m() {
        return this.V;
    }

    public static void b(int[] arrn) {
        W = arrn;
    }

    public static int[] am() {
        return W;
    }

    static {
        if (wy.am() != null) {
            wy.b(new int[3]);
        }
    }
}

