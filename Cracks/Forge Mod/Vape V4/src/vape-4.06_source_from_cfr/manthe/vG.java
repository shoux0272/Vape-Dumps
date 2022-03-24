/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.C4;
import manthe.DB;
import manthe.Ds;
import manthe.yf;

class vG
implements C4 {
    final yf a;

    vG(yf yf2) {
        this.a = yf2;
    }

    @Override
    public void a(Ds ds2) {
        DB dB2 = (DB)ds2;
        if (dB2.u().booleanValue()) {
            this.a.d.b("");
        }
    }
}

