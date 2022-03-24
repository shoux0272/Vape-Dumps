/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DF;
import manthe.Dy;
import manthe.kt;
import manthe.y5;

public class zW
extends y5 {
    private final Dy x = Dy.a(this, "Rate", "#.#", "", 0.0, 1.0, 3.0, 10.0);
    private final DF w = DF.a(this, "Rate Change", "#.#", "", 0.0, 1.0, 5.0);
    private float v;
    private long u;

    public zW() {
        super("OmniSprint", -256, CQ.f);
        this.a(this.x, this.w);
    }

    @Override
    public void b(kt kt2) {
    }
}

