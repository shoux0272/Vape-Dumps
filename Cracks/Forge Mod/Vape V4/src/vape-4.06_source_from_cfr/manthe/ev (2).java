/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.UUID;
import manthe.cy;
import manthe.e6;
import manthe.ic;

public class ev
extends cy {
    public ev(Object object) {
        super(object);
    }

    public e6 a(UUID uUID) {
        return new e6(ic.a(ev.a.M().bx, this.b, uUID));
    }

    public void a(e6 e62) {
        ic.a(ev.a.M().bx, this.b, e62.a());
    }

    public double f() {
        return ic.a(ev.a.M().bx, this.b);
    }
}

