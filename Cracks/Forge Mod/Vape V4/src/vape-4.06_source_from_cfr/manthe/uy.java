/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DB;
import manthe.qD;
import manthe.vK;

class uy
implements vK {
    final qD a;

    uy(qD qD2) {
        this.a = qD2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 != 0) {
            return;
        }
        DB dB2 = (DB)this.a.p();
        if (dB2 != null) {
            dB2.e(!dB2.y());
        }
    }
}

