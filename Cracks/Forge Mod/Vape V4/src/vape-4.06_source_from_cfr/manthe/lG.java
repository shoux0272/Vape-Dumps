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

public class lG
extends l9 {
    private final e7 k;
    private final ex g;
    private final dx h;
    private final double j;
    private float f;
    private float i;
    private float l;

    public lG(cv cv2, e7 e72, ex ex2, dx dx2, double d10, float f10, float f11, float f12) {
        super(cv2);
        this.k = e72;
        this.g = ex2;
        this.h = dx2;
        this.j = d10;
        this.f = f10;
        this.i = f11;
        this.l = f12;
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
        return this.k;
    }

    public ex getEntity() {
        return this.g;
    }

    public dx getBlock() {
        return this.h;
    }

    public double getPartial() {
        return this.j;
    }

    public float getRed() {
        return this.f;
    }

    public void setRed(float f10) {
        this.f = f10;
    }

    public float getGreen() {
        return this.i;
    }

    public void setGreen(float f10) {
        this.i = f10;
    }

    public float getBlue() {
        return this.l;
    }

    public void setBlue(float f10) {
        this.l = f10;
    }
}

