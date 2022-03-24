/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.kl;
import manthe.on;
import manthe.y5;

public class kN
extends kl {
    private final String d;
    private String e;

    public kN(String string, String string2) {
        this.d = string;
        this.e = string2;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public String getUserName() {
        return this.d;
    }

    public String getDisplayName() {
        return this.e;
    }

    public void setDisplayName(String string) {
        this.e = string;
    }
}

