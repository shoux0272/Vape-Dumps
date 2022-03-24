/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cv;
import manthe.eC;
import manthe.l9;
import manthe.on;
import manthe.y5;

public class lK
extends l9 {
    private final eC f;
    private final float g;

    public lK(cv cv2, eC eC2, float f10) {
        super(cv2);
        this.f = eC2;
        this.g = f10;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public eC getClientPlayer() {
        return this.f;
    }

    public float getPartial() {
        return this.g;
    }
}

