/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.cy;
import manthe.ds;
import manthe.ef;
import manthe.kl;
import manthe.on;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class kx
extends kl {
    private final float d;
    private static float e = -1.0f;
    private static cy[] f;

    public kx(float f10) {
        this.d = f10;
    }

    @Override
    public boolean fire() {
        if (this.d == e) {
            return false;
        }
        ef.l();
        for (y5 object : on.p.H().e()) {
            if (!object.N()) continue;
            object.a(this);
        }
        boolean bl = ds.s().q();
        ds.s().c(false);
        ds.M().a(this.d, 0);
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.b(this);
        }
        ds.s().c(bl);
        if (ds.s().i() > 0) {
            ds.M().a(1.0);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        e = this.d;
        return this.d();
    }

    public float getTicks() {
        return this.d;
    }

    static {
        kx.a(null);
    }

    public static void a(cy[] arrcy) {
        f = arrcy;
    }

    public static cy[] e() {
        return f;
    }
}

