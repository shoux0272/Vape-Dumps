/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.d2;
import manthe.fT;

public class f6
extends fT {
    public f6(Object object) {
        super(object);
    }

    public float j() {
        return f6.a.M().ci.a(this.a());
    }

    public float k() {
        return f6.a.M().ci.c(this.a());
    }

    public int l() {
        if (V.c() >= 23) {
            d2 d22 = new d2(f6.a.M().ci.d(this.a()));
            if (d22.e()) {
                return 0;
            }
            return f6.a.M().ci.d(this.a()).equals(d2.f().a()) ? 0 : 1;
        }
        return f6.a.M().ci.b(this.a());
    }
}

