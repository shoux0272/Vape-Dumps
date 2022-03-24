/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.R;
import manthe.on;
import manthe.p1;
import manthe.rQ;
import manthe.sM;

class DN
implements R {
    final rQ a;
    final sM b;

    DN(sM sM2, rQ rQ2) {
        this.b = sM2;
        this.a = rQ2;
    }

    public void a(p1 p12) {
        if (on.p.l().a(sM.a(this.b).l()) != null) {
            this.a.b("Update this profile");
            this.a.x().a("sync");
        } else {
            this.a.b("Download this profile");
            this.a.x().a("download");
        }
    }
}

