/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.dZ;
import manthe.kq;
import manthe.l9;

public class lS
extends l9 {
    private final dZ f;

    public lS(dZ dZ2) {
        super(dZ2);
        this.f = dZ2;
    }

    @Override
    public boolean fire() {
        return new kq(this.f.m().a(), this.f.h().a(), this.f.k()).fire();
    }
}

