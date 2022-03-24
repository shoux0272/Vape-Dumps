/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.rR;
import manthe.sb;

class s1
extends sb {
    final rR S;

    s1(rR rR2) {
        this.S = rR2;
    }

    @Override
    public boolean a(char c3, int n6) {
        boolean bl = super.a(c3, n6);
        rR.a(this.S, rR.c(this.S).z().E());
        return bl;
    }
}

