/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import manthe.bz;
import manthe.wM;
import manthe.we;

public abstract class wj
extends we
implements bz {
    private boolean W = true;
    List<wM> V = new ArrayList<wM>();

    public wj() {
        this.a(wj.b.k);
        this.c(300.0);
        this.a(100.0);
        this.a(false);
        this.W().e(false);
        this.W().b("wrap");
    }

    @Override
    public void n() {
        this.W = !this.W;
        this.ak();
    }

    private void ak() {
        for (wM wM2 : this.al()) {
            wM2.a(!this.W);
        }
        this.M();
    }

    @Override
    public boolean m() {
        return this.W;
    }

    public void b(wM ... arrwM) {
        Collections.addAll(this.al(), arrwM);
        this.a(arrwM);
        this.ak();
    }

    public List<wM> al() {
        return this.V;
    }
}

