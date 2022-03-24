/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dZ;
import manthe.kc;
import manthe.l9;

public class lO
extends l9 {
    private final dZ f;

    public lO(dZ dZ2) {
        super(dZ2);
        this.f = dZ2;
    }

    @Override
    public boolean fire() {
        return new kc(this.f.m().a(), this.f.h().a(), this.f.l(), this.f.j(), this.f.i(), this.f.k()).fire();
    }
}

