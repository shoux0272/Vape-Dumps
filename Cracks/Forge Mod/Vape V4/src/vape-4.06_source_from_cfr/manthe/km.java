/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Da;
import manthe.cy;
import manthe.ex;
import manthe.kl;
import manthe.on;
import manthe.y5;

public class km
extends kl {
    public static ex f;
    static double g;
    static boolean h;
    private static ex j;
    private static float k;
    private static float d;
    private static boolean e;
    private static cy[] i;

    public km(ex ex2, int n6) {
        f = ex2;
        if (n6 == Da.b) {
            h = false;
            k = f.U();
            d = f.K();
            e = f.v();
            g = f.Y().l();
        }
        this.a = n6;
    }

    public static float getRotationYaw() {
        return k;
    }

    public static void setRotationYaw(float f10) {
        k = f10;
    }

    public static float getRotationPitch() {
        return d;
    }

    public static void setRotationPitch(float f10) {
        d = f10;
    }

    public static boolean isOnGround() {
        return e;
    }

    public static void setOnGround(boolean bl) {
        e = bl;
    }

    public static double getY() {
        return g;
    }

    public static void setY(double d10) {
        g = d10;
    }

    public static void setShouldAlwaysSend(boolean bl) {
    }

    public static boolean shouldAlwaysSend() {
        return h;
    }

    @Override
    public boolean fire() {
        for (y5 y52 : on.p.H().e()) {
            if (!y52.N()) continue;
            y52.a(this);
        }
        if (this.a == Da.b) {
            j = f.m();
            if (km.shouldAlwaysSend()) {
                f.b(new ex(null));
            }
        } else {
            f.b(j);
        }
        return this.d();
    }

    public static void a(cy[] arrcy) {
        i = arrcy;
    }

    public static cy[] e() {
        return i;
    }

    static {
        if (km.e() != null) {
            km.a(new cy[4]);
        }
    }
}

