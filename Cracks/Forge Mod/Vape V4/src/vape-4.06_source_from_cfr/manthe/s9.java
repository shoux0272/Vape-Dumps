/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.r5;
import manthe.sb;

class s9
extends sb {
    final r5 S;

    s9(r5 r52, int n6) {
        this.S = r52;
        super(n6);
    }

    @Override
    public boolean a(char c3, int n6) {
        if (this.y() && n6 == 28) {
            r5.b(this.S).a().a(0, 0, 0);
            return true;
        }
        return super.a(c3, n6);
    }
}

