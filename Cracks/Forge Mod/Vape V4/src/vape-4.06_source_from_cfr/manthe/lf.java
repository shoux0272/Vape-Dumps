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

public class lf
extends l9 {
    private final e7 i;
    private final ex f;
    private final dx j;
    private final double h;
    private final int k;
    private final float g;

    public lf(cv cv2, e7 e72, ex ex2, dx dx2, double d10, int n6, float f10) {
        super(cv2);
        this.i = e72;
        this.f = ex2;
        this.j = dx2;
        this.h = d10;
        this.k = n6;
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

    public e7 getRenderer() {
        return this.i;
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

    public int getFogMode() {
        return this.k;
    }

    public float getFarPlaneDistance() {
        return this.g;
    }
}

