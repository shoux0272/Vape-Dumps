/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.on;
import manthe.qE;
import manthe.si;

public class qy
extends qE {
    private boolean c = false;

    public qy(si si2) {
        super(si2);
    }

    @Override
    public void a(Object object) {
        if (!this.c) {
            on.p.g();
            on.p.O().a(true);
            this.c = true;
        }
    }
}

