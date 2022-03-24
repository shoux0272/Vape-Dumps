/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DO;
import manthe.wT;
import manthe.xV;

class pT
implements DO {
    final wT a;
    final xV b;

    pT(xV xV2, wT wT2) {
        this.b = xV2;
        this.a = wT2;
    }

    @Override
    public void a(char c3, int n6) {
        if (xV.b(this.b) != xV.a(this.b).N().length()) {
            this.a.ar();
        }
        xV.a(this.b, xV.a(this.b).N().length());
    }
}

