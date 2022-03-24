/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cv;
import manthe.dx;
import manthe.e7;
import manthe.ex;
import manthe.l9;
import manthe.on;
import manthe.y5;

public class lz
extends l9 {
    private final e7 g;
    private final ex f;
    private final dx j;
    private final double h;
    private float i;

    public lz(cv cv2, e7 e72, ex ex2, dx dx2, double d10, float f10) {
        super(cv2);
        this.g = e72;
        this.f = ex2;
        this.j = dx2;
        this.h = d10;
        this.i = f10;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        return this.d();
    }

    public e7 getRenderer() {
        return this.g;
    }

    public ex getEntity() {
        return this.f;
    }

    public dx getBlock() {
        return this.j;
    }

    public double getPartial() {
        return this.h;
    }

    public float getDensity() {
        return this.i;
    }

    public void setDensity(float f10) {
        this.i = f10;
    }
}

