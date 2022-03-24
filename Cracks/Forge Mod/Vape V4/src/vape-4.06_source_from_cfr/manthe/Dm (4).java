/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.DB;
import manthe.zu;

class Dm
extends DB {
    final zu p;

    Dm(zu zu2, Object object, String string, boolean bl) {
        this.p = zu2;
        super(object, string, bl);
    }

    @Override
    public void a(Boolean bl) {
        super.a(bl);
        zu.e(this.p.af.u());
    }
}

