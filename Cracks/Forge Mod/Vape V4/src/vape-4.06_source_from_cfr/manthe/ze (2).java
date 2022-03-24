/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Random;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DF;
import manthe.ds;
import manthe.ei;
import manthe.en;
import manthe.kt;
import manthe.y5;

public class ze
extends y5 {
    private final AO y = new AO();
    private final AO x = new AO();
    private final ei[] w;
    private final Random u = new Random();
    private final DF z = DF.a((Object)this, "Frequency", "##", "", 1.0, 30.0, 200.0, "How often you will move");
    private ei v;

    public ze() {
        super("Anti-AFK", 9782004, CQ.e);
        en en2 = ds.s();
        this.w = new ei[]{en2.j(), en2.A(), en2.g(), en2.n()};
        this.a(this.z);
    }

    @Override
    public void b(kt kt2) {
        if (ds.x().a(A5.ag)) {
            return;
        }
        if (this.v == null) {
            if (ds.k().aF() != 0.0f || ds.k().ay() != 0.0f) {
                this.y.b(3000L);
                return;
            }
            if (this.y.a(this.z.a().longValue() * 1000L + (long)this.u.nextInt(4000))) {
                this.v = this.w[this.u.nextInt(this.w.length)];
                ei.a(this.v.i(), true);
                ei.a(this.v.i());
                this.x.d();
            }
        } else if (this.x.a(this.u.nextInt(50))) {
            ei.a(this.v.i(), false);
            this.v = null;
            this.y.d();
        }
    }
}

