/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.pb;
import manthe.rz;
import manthe.vK;

class mX
implements vK {
    final pb a;
    final rz b;

    mX(rz rz2, pb pb2) {
        this.b = rz2;
        this.a = pb2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (n11 == 0 && (a.a.ib() || !this.a.c())) {
            this.b.f(true);
            this.b.a(this.a);
        }
    }
}

