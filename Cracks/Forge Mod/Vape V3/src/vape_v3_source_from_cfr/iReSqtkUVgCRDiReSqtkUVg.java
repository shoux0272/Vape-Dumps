/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import a.a;
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgCRDiReSqtkUVg {
    private int m;
    private int n;
    int a = 34160;
    int b = 34161;
    int c = 34176;
    int d = 34167;
    int e = 34192;
    int f = 34162;
    int g = 34184;
    int h = 34200;
    int i = 34177;
    int j = 34168;
    int k = 33985;
    int l = 34193;
    private int o;
    private int p;
    private int q;
    private int r;
    private int s;
    private int t;
    private int u;
    private int v;

    public iReSqtkUVgCRDiReSqtkUVg(int n) {
        this.m = n;
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        this.n = a.a.ds(n, "", 0.0, 0.0, -1);
    }

    private void a() {
        this.o = (int)GL11.glGetTexEnvf((int)8960, (int)this.b);
        this.p = (int)GL11.glGetTexEnvf((int)8960, (int)this.c);
        this.q = (int)GL11.glGetTexEnvf((int)8960, (int)this.i);
        this.r = (int)GL11.glGetTexEnvf((int)8960, (int)this.e);
        this.s = (int)GL11.glGetTexEnvf((int)8960, (int)this.l);
        this.t = (int)GL11.glGetTexEnvf((int)8960, (int)this.f);
        this.u = (int)GL11.glGetTexEnvf((int)8960, (int)this.g);
        this.v = (int)GL11.glGetTexEnvf((int)8960, (int)this.h);
        GL11.glTexEnvi((int)8960, (int)this.b, (int)8448);
        GL11.glTexEnvi((int)8960, (int)this.c, (int)this.j);
        GL11.glTexEnvi((int)8960, (int)this.i, (int)this.k);
        GL11.glTexEnvi((int)8960, (int)this.e, (int)768);
        GL11.glTexEnvi((int)8960, (int)this.l, (int)768);
        GL11.glTexEnvi((int)8960, (int)this.f, (int)7681);
        GL11.glTexEnvi((int)8960, (int)this.g, (int)this.j);
        GL11.glTexEnvi((int)8960, (int)this.h, (int)770);
    }

    private void b() {
        GL11.glTexEnvi((int)8960, (int)this.b, (int)this.o);
        GL11.glTexEnvi((int)8960, (int)this.c, (int)this.p);
        GL11.glTexEnvi((int)8960, (int)this.i, (int)this.q);
        GL11.glTexEnvi((int)8960, (int)this.e, (int)this.r);
        GL11.glTexEnvi((int)8960, (int)this.l, (int)this.s);
        GL11.glTexEnvi((int)8960, (int)this.f, (int)this.t);
        GL11.glTexEnvi((int)8960, (int)this.g, (int)this.u);
        GL11.glTexEnvi((int)8960, (int)this.h, (int)this.v);
    }

    public void a(String string, double d2, double d3, int n) {
        if (iReSqtkUVgypOiReSqtkUVg.l) {
            int n2 = GL11.glGetInteger((int)32873);
            boolean bl = GL11.glIsEnabled((int)3042);
            boolean bl2 = GL11.glIsEnabled((int)3553);
            boolean bl3 = GL11.glIsEnabled((int)2896);
            boolean bl4 = GL11.glIsEnabled((int)3008);
            if (!bl) {
                iReSqtkUVgoOBiReSqtkUVg.i();
            }
            if (!bl2) {
                iReSqtkUVgoOBiReSqtkUVg.k();
            }
            if (bl3) {
                iReSqtkUVgoOBiReSqtkUVg.f();
            }
            if (!bl4) {
                iReSqtkUVgoOBiReSqtkUVg.m();
            }
            iReSqtkUVgoOBiReSqtkUVg.a(this.n);
            a.a.ds(this.m, string, d2, d3, n);
            iReSqtkUVgoOBiReSqtkUVg.a(n2);
            if (!bl4) {
                iReSqtkUVgoOBiReSqtkUVg.d();
            }
            if (bl3) {
                iReSqtkUVgoOBiReSqtkUVg.e();
            }
            if (!bl) {
                iReSqtkUVgoOBiReSqtkUVg.j();
            }
            if (!bl2) {
                iReSqtkUVgoOBiReSqtkUVg.l();
            }
        } else if (this.m >= 18) {
            iReSqtkUVgeLLiReSqtkUVg.h().b(string, d2, d3, n);
        } else {
            iReSqtkUVgeLLiReSqtkUVg.h().a(string, d2, d3, n, 0.5);
        }
    }

    public void b(String string, double d2, double d3, int n) {
        String string2 = "";
        char[] arrc = string.toCharArray();
        for (int i = 0; i < arrc.length; ++i) {
            char c2 = arrc[i];
            if (c2 == '\u00a7') {
                ++i;
                continue;
            }
            string2 = string2 + c2;
        }
        this.a(string2, d2, d3, n);
    }

    public void a(String string, double d2, double d3, Color color) {
        this.a(string, d2, d3, color.getRGB());
    }

    public void c(String string, double d2, double d3, int n) {
        if (iReSqtkUVgypOiReSqtkUVg.l) {
            this.b(string, d2 + 0.5, d3 + 0.5, Integer.MIN_VALUE);
            this.a(string, d2, d3, n);
        } else {
            iReSqtkUVgeLLiReSqtkUVg.h().a(string, d2, d3, n);
        }
    }

    public void b(String string, double d2, double d3, Color color) {
        if (iReSqtkUVgypOiReSqtkUVg.l) {
            this.b(string, d2 + 0.5, d3 + 0.5, Integer.MIN_VALUE);
            this.a(string, d2, d3, color);
        } else {
            iReSqtkUVgeLLiReSqtkUVg.h().a(string, d2, d3, color);
        }
    }

    public double a(String string) {
        if (iReSqtkUVgypOiReSqtkUVg.l) {
            return a.a.gsh(this.m, string) / 2.0;
        }
        return iReSqtkUVgeLLiReSqtkUVg.h().b(string) / 2;
    }

    public double b(String string) {
        if (iReSqtkUVgypOiReSqtkUVg.l) {
            return a.a.gsw(this.m, string) / 2.0;
        }
        int n = iReSqtkUVgeLLiReSqtkUVg.h().a(string);
        if (this.m < 18) {
            n = (int)((double)n * 0.5);
        }
        return n;
    }

    public void d(String string, double d2, double d3, int n) {
        this.a(string, d2 - this.b(string) / 2.0, d3, n);
    }

    public void c(String string, double d2, double d3, Color color) {
        this.d(string, d2, d3, color.getRGB());
    }

    public void d(String string, double d2, double d3, Color color) {
        if (iReSqtkUVgypOiReSqtkUVg.l) {
            this.d(string, d2 + 0.5, d3 + 0.5, Integer.MIN_VALUE);
            this.c(string, d2, d3, color);
        } else {
            this.b(string, d2 - this.b(string) / 2.0, d3, color);
        }
    }
}

