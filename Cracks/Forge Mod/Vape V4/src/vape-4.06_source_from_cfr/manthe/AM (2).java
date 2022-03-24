/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.CQ;
import manthe.DD;
import manthe.kt;
import manthe.mD;
import manthe.y5;

public class AM
extends y5 {
    private static boolean v;
    public DD u = DD.a((Object)this, "clutch-whitelist", "Allowed Blocks", DD.m, new mD("blocks"));

    public AM() {
        super("Clutch", -16764673, CQ.e, "Automatically attempts to bridge under you if you fall.");
        this.a(this.u);
    }

    @Override
    public void t() {
    }

    @Override
    public void b(kt kt2) {
    }

    static boolean e(boolean bl) {
        v = bl;
        return v;
    }
}

