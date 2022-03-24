/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.p1;
import manthe.r2;
import manthe.rg;

class AS
implements R {
    final rg a;
    final r2 b;

    AS(r2 r22, rg rg2) {
        this.b = r22;
        this.a = rg2;
    }

    public void a(p1 p12) {
        long l = r2.a(this.b) - System.currentTimeMillis();
        if (l > 0L) {
            if (l >= 57000L) {
                this.a.z().a("Saved!");
            } else {
                this.a.z().a("Wait " + l / 1000L + " second" + (l >= 1000L && l < 2000L ? "" : "s"));
            }
        } else {
            this.a.z().a("Sync Settings");
        }
    }
}

