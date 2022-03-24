/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.pe;
import manthe.wV;
import manthe.xL;

class wb
extends wV {
    final xL I;

    wb(xL xL2, String string, double d10) {
        this.I = xL2;
        super(string, d10);
    }

    @Override
    public void a() {
        if (this.x()) {
            pe.b(this.d() + 1.5, this.c() + 4.5, 11.0, 1.0, new Color(255, 255, 255, 15));
        }
        super.a();
    }
}

