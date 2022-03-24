/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DF;
import manthe.ds;
import manthe.kt;
import manthe.y5;

public class zK
extends y5 {
    private final DF v = DF.a((Object)this, "Speed", "#.##", "", 0.1, 1.07, 2.0, 0.01);
    private boolean u;

    public zK() {
        super("Timer", 0xFF1010, CQ.f, "Modifies game timer");
        this.a(this.v);
    }

    @Override
    public void b(kt kt2) {
        this.u = !this.u;
        ds.O().a(this.u ? 1.0f : this.v.a().floatValue());
    }

    @Override
    public void J() {
        ds.O().a(1.0f);
    }
}

