/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pz;
import manthe.r8;
import manthe.vK;

class n8
implements vK {
    final r8 a;

    n8(r8 r82) {
        this.a = r82;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        r8.b(this.a).b(true);
        String string = r8.b(this.a).z().E();
        new pz(this, string).start();
    }
}

