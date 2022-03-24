/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.fG;
import manthe.ka;
import manthe.kl;

public class lm
extends kl {
    private final Object d;

    public lm(Object object) {
        this.d = object;
    }

    @Override
    public boolean fire() {
        return new ka(new fG(this.d)).fire();
    }
}

