/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Da;
import manthe.kd;

public class kj
extends kd {
    private final float f;

    public kj(Object object, double d10) {
        super(Da.a, object);
        this.f = (float)(1.0 + d10);
    }

    @Override
    public double getRealHeight() {
        return this.f;
    }
}

