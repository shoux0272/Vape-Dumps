/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.CQ;
import manthe.DF;
import manthe.DX;
import manthe.Da;
import manthe.ds;
import manthe.fG;
import manthe.kf;
import manthe.nH;
import manthe.pb;
import manthe.y5;

public class AI
extends y5 {
    private final DF v = DF.a((Object)this, "Delay", "#", "", 0.0, 1.0, 4.0, 1.0);
    private final pb u = new pb("All");
    private final pb x = new pb("Blocks");
    private final pb w = new pb("Projectiles");
    private final DX y = DX.a((Object)this, "Held Item", "What kind of items should FastPlace function with?\nAll - All items/blocks\nBlocks - All blocks\nProjectiles - Snowballs & Eggs", this.u, this.u, this.x, this.w);

    public AI() {
        super("FastPlace", -16384224, CQ.e, "Changes the block place delay.");
        this.a(this.y, this.v);
    }

    @Override
    public void a(kf kf2) {
        if (kf2.a() != Da.b) {
            return;
        }
        if (ds.k().e()) {
            return;
        }
        fG fG2 = ds.k().a_();
        if (this.y.v() == this.x && fG2.d() && fG2.k().d() && !fG2.k().a(A5.av)) {
            return;
        }
        if (this.y.v() == this.w && fG2.d() && fG2.k().d() && !nH.a(fG2.k())) {
            return;
        }
        if ((double)ds.f() > this.v.a()) {
            ds.a(this.v.a().intValue());
        }
    }
}

