/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.util.ArrayList;
import java.util.concurrent.ArrayBlockingQueue;
import manthe.Al;
import manthe.Y;
import manthe.d0;
import manthe.ds;
import manthe.oq;
import manthe.pJ;
import manthe.qY;
import manthe.zu;
import org.lwjgl.opengl.GL11;

public class yZ {
    private final ArrayBlockingQueue<oq> d = new ArrayBlockingQueue(20);
    private long c;
    private static String[] b;

    public void a(String string, String string2, long l) {
        this.a(new Al(pJ.INFO, string, new qY(string2), 0.0, 0.0, l));
    }

    public void a(String string, String string2, pJ pJ2, long l) {
        this.a(new Al(pJ2, string, new qY(string2, pJ2), 0.0, 0.0, l));
    }

    public void a(oq oq2) {
        if (!zu.T.F.u().booleanValue()) {
            return;
        }
        double d10 = oq2.e() + 16.0;
        for (oq oq3 : this.d) {
            d10 += oq3.e() + 2.0;
        }
        oq2.c(-d10);
        oq2.d(0.0);
        oq2.a(-oq2.b());
        if (this.d.remainingCapacity() == 0) {
            this.d.remove();
        }
        this.d.add(oq2);
    }

    public void c() {
        int n6 = GL11.glGetInteger((int)3009);
        float f10 = GL11.glGetFloat((int)3010);
        GL11.glAlphaFunc((int)516, (float)0.0f);
        d0 d02 = d0.a(new ds(), ds.F(), ds.H());
        double d10 = -14.0;
        long l = System.currentTimeMillis() - this.c;
        this.c = System.currentTimeMillis();
        ArrayList<oq> arrayList = new ArrayList<oq>();
        float f11 = zu.ac();
        if (!zu.T.aa.u().booleanValue()) {
            f11 = 1.0f;
        }
        for (oq oq2 : this.d) {
            oq2.b(d10 -= oq2.e() + 2.0);
            int n10 = (int)(Math.abs(oq2.d() - oq2.a()) * 0.3);
            int n11 = (int)(Math.abs(oq2.f() - oq2.h()) * 0.3);
            double d11 = yZ.a(oq2.d(), oq2.a(), l, n10);
            double d12 = yZ.a(oq2.f(), oq2.h(), l, n11);
            oq2.d(d11);
            oq2.c(d12);
            oq2.a((float)d02.g() / f11, (float)d02.h() / f11);
            if (!oq2.g()) continue;
            arrayList.add(oq2);
        }
        for (oq oq2 : arrayList) {
            this.d.remove(oq2);
        }
        GL11.glAlphaFunc((int)n6, (float)f10);
    }

    public static double a(double d10, double d11, long l, double d12) {
        if (d10 == d11) {
            return d10;
        }
        double d13 = Math.max(d12 * (double)Math.max(1L, l) / 16.666666666666668, 0.1);
        return d11 + Y.a(d10 - d11, -d13, d13);
    }

    public static void b(String[] arrstring) {
        b = arrstring;
    }

    public static String[] b() {
        return b;
    }

    static {
        if (yZ.b() == null) {
            yZ.b(new String[2]);
        }
    }
}

