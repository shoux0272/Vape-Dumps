/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.concurrent.CopyOnWriteArrayList;
import manthe.CQ;
import manthe.on;
import manthe.wM;
import manthe.wy;
import manthe.wz;
import manthe.xW;
import manthe.y5;

public class w0
extends wy {
    private static w0 ab;

    public w0() {
        super(CQ.g);
        ab = this;
    }

    @Override
    public void ap() {
        this.Y = new xW(this, "newfavorites", "Favorites");
        this.a(this.Y);
    }

    @Override
    public void V() {
    }

    @Override
    public void K() {
    }

    public static void ar() {
        ab.J();
        CopyOnWriteArrayList<y5> copyOnWriteArrayList = new CopyOnWriteArrayList<y5>(on.p.A().b());
        for (y5 y52 : copyOnWriteArrayList) {
            wz wz2 = new wz(ab, y52);
            ab.a((wM)wz2, new Object[0]);
            wz2.R();
        }
    }

    public static wz c(y5 y52) {
        for (wM wM2 : ab.w()) {
            if (!(wM2 instanceof wz) || !((wz)wM2).S().equals(y52)) continue;
            return (wz)wM2;
        }
        return null;
    }

    public static w0 aq() {
        return ab;
    }
}

