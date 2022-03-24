/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import a.a;
import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.ds;
import manthe.e3;
import manthe.pe;
import manthe.zu;
import org.lwjgl.opengl.GL11;

public class mq {
    private static int e = 0;
    private final int f;
    private final int c;
    private final int d;
    private static boolean b;

    public mq(String string, int n6) {
        this.f = n6;
        this.d = e++;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.c = string != null ? a.mf(this.d, n6, string) : 0;
    }

    public void a(String string, double d10, double d11, int n6, boolean bl) {
        if (zu.ag()) {
            double d12;
            double d13 = d12 = zu.T.aa.u() != false ? 1.0 : (double)ds.s().x();
            if (d12 == 0.0) {
                d12 = 3.0;
            }
            if (!bl) {
                d12 = 1.0;
            }
            int n10 = GL11.glGetInteger((int)32873);
            boolean bl2 = GL11.glIsEnabled((int)3042);
            boolean bl3 = GL11.glIsEnabled((int)3553);
            boolean bl4 = GL11.glIsEnabled((int)2896);
            boolean bl5 = GL11.glIsEnabled((int)3008);
            if (!bl2) {
                e3.r();
            }
            if (!bl3) {
                e3.p();
            }
            if (bl4) {
                e3.l();
            }
            if (!bl5) {
                e3.k();
            }
            if (n10 != this.c) {
                e3.b(this.c);
            }
            double d14 = 0.5 / d12;
            double d15 = 1.0 / d14;
            GL11.glScaled((double)d14, (double)d14, (double)d14);
            a.ds(this.d, string, d10 * d15, d11 * d15, n6);
            GL11.glScaled((double)d15, (double)d15, (double)d15);
            if (n10 != this.c) {
                e3.b(n10);
            }
            if (!bl5) {
                e3.i();
            }
            if (bl4) {
                e3.n();
            }
            if (!bl2) {
                e3.f();
            }
            if (!bl3) {
                e3.j();
            }
        } else {
            double d16;
            double d17 = d16 = zu.T.aa.u() != false ? 1.0 : (double)ds.s().x();
            if (d16 == 0.0) {
                d16 = 3.0;
            }
            pe.a(new Color(n6));
            if ((double)this.f >= 15.0 * d16) {
                ds.m().c(string, d10, d11, n6);
            } else {
                ds.m().a(string, d10, d11, n6, 0.5);
            }
        }
    }

    public void c(String string, double d10, double d11, int n6, boolean bl) {
        String string2 = "";
        char[] arrc = string.toCharArray();
        for (int k = 0; k < arrc.length; ++k) {
            char c3 = arrc[k];
            if (c3 == '\u00a7') {
                ++k;
                continue;
            }
            string2 = string2 + c3;
        }
        this.a(string2, d10, d11, n6, bl);
    }

    public void a(String string, double d10, double d11, Color color) {
        this.a(string, d10, d11, color.getRGB(), true);
    }

    public void c(String string, double d10, double d11, int n6) {
        this.a(string, d10, d11, n6, true);
    }

    public void a(String string, double d10, double d11, int n6) {
        if (zu.ag()) {
            this.c(string, d10 + 0.5, d11 + 0.5, Integer.MIN_VALUE, true);
            this.a(string, d10, d11, n6, true);
        } else {
            ds.m().d(string, d10, d11, n6);
        }
    }

    public void b(String string, double d10, double d11, int n6, boolean bl) {
        if (zu.ag()) {
            this.c(string, d10 + 0.5, d11 + 0.5, Integer.MIN_VALUE, bl);
            this.a(string, d10, d11, n6, bl);
        } else {
            ds.m().d(string, d10, d11, n6);
        }
    }

    public void c(String string, double d10, double d11, Color color) {
        if (zu.ag()) {
            this.c(string, d10 + 0.5, d11 + 0.5, Integer.MIN_VALUE, true);
            this.a(string, d10, d11, color);
        } else {
            ds.m().d(string, d10, d11, color);
        }
    }

    public double a(String string) {
        return this.a(string, true);
    }

    public double a(String string, boolean bl) {
        if (zu.ag()) {
            int n6;
            int n10 = n6 = zu.T.aa.u() != false ? 1 : ds.s().x();
            if (n6 == 0) {
                n6 = 3;
            }
            if (!bl) {
                n6 = 1;
            }
            if (string.equals("")) {
                return 0.0;
            }
            return a.gsh(this.d, string) / (double)(2 * n6);
        }
        return ds.m().b(string) / 2;
    }

    public double b(String string, boolean bl) {
        int n6;
        int n10 = n6 = zu.T.aa.u() != false ? 1 : ds.s().x();
        if (n6 == 0) {
            n6 = 3;
        }
        if (!bl) {
            n6 = 1;
        }
        if (zu.ag()) {
            return a.gsw(this.d, string) / (double)(2 * n6);
        }
        int n11 = ds.m().c(string);
        if (this.f < 16 * n6) {
            n11 = (int)((double)n11 * 0.5);
        }
        return n11;
    }

    public double b(String string) {
        return this.b(string, true);
    }

    public void b(String string, double d10, double d11, int n6) {
        this.a(string, d10 - this.b(string) / 2.0, d11, n6, true);
    }

    public void b(String string, double d10, double d11, Color color) {
        this.b(string, d10, d11, color.getRGB());
    }

    public void d(String string, double d10, double d11, Color color) {
        if (zu.ag()) {
            this.b(string, d10 + 0.5, d11 + 0.5, Integer.MIN_VALUE);
            this.b(string, d10, d11, color);
        } else {
            this.c(string, d10 - this.b(string) / 2.0, d11, color);
        }
    }

    public int b() {
        return this.d;
    }

    public int a() {
        return this.f;
    }

    static {
        mq.b(true);
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean c() {
        return b;
    }

    public static boolean d() {
        boolean bl = mq.c();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

