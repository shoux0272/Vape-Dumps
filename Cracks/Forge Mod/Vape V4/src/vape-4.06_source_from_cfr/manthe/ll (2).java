/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cv;
import manthe.ex;
import manthe.l9;
import manthe.on;
import manthe.y5;

public class ll
extends l9 {
    private ex f;

    public ll(cv cv2, ex ex2) {
        super(cv2);
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public ex getEntity() {
        return this.f;
    }
}

