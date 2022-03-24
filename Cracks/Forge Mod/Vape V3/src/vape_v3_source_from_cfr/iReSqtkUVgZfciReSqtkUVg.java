/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;
import java.util.Random;

public class iReSqtkUVgZfciReSqtkUVg
extends iReSqtkUVgWaoiReSqtkUVg<Double, iReSqtkUVgSeRiReSqtkUVg> {
    private static final int a = 96;
    private iReSqtkUVgkzHiReSqtkUVg b;
    private iReSqtkUVgkzHiReSqtkUVg c;
    private iReSqtkUVgkzHiReSqtkUVg d;
    private iReSqtkUVgoRmiReSqtkUVg e;
    private Random f = new Random();

    public iReSqtkUVgZfciReSqtkUVg(Object object, String string, iReSqtkUVgSeRiReSqtkUVg iReSqtkUVgSeRiReSqtkUVg2) {
        super(object, string, iReSqtkUVgSeRiReSqtkUVg2);
        ((iReSqtkUVgSeRiReSqtkUVg)this.c()).a_("Double click for rainbow\nShift click to switch between hue, brightness, and saturation");
        this.b = iReSqtkUVgkzHiReSqtkUVg.a(object, string + " hue", string + " hue", iReSqtkUVgSeRiReSqtkUVg2.P(), iReSqtkUVgSeRiReSqtkUVg2.N(), 255.0, iReSqtkUVgSeRiReSqtkUVg2.M());
        this.c = iReSqtkUVgkzHiReSqtkUVg.a(object, string + " brightness", string + " brightness", iReSqtkUVgSeRiReSqtkUVg2.P(), iReSqtkUVgSeRiReSqtkUVg2.N(), 87.0, iReSqtkUVgSeRiReSqtkUVg2.M());
        this.d = iReSqtkUVgkzHiReSqtkUVg.a(object, string + " saturation", string + " saturation", iReSqtkUVgSeRiReSqtkUVg2.P(), iReSqtkUVgSeRiReSqtkUVg2.N(), 255.0, iReSqtkUVgSeRiReSqtkUVg2.M());
        this.e = iReSqtkUVgoRmiReSqtkUVg.a(object, string + " rainbow", string + " rainbow", false);
    }

    public static iReSqtkUVgZfciReSqtkUVg a(Object object, String string, double d2) {
        iReSqtkUVgSeRiReSqtkUVg iReSqtkUVgSeRiReSqtkUVg2 = new iReSqtkUVgSeRiReSqtkUVg(96.0, 0.0, "", "", string);
        iReSqtkUVgSeRiReSqtkUVg2.c(92.0);
        iReSqtkUVgSeRiReSqtkUVg2.d(7.0);
        iReSqtkUVgZfciReSqtkUVg iReSqtkUVgZfciReSqtkUVg2 = new iReSqtkUVgZfciReSqtkUVg(object, string, iReSqtkUVgSeRiReSqtkUVg2);
        iReSqtkUVgZfciReSqtkUVg2.b(d2);
        iReSqtkUVgSeRiReSqtkUVg2.b(iReSqtkUVgZfciReSqtkUVg2);
        iReSqtkUVgSeRiReSqtkUVg2.e(d2);
        double d3 = iReSqtkUVgSeRiReSqtkUVg2.G() / 96.0;
        iReSqtkUVgZfciReSqtkUVg2.r().b(d3 * 100.0);
        return iReSqtkUVgZfciReSqtkUVg2;
    }

    public static iReSqtkUVgZfciReSqtkUVg a(Object object, String string, Color color) {
        float f = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null)[0];
        return iReSqtkUVgZfciReSqtkUVg.a(object, string, f * 96.0f);
    }

    public Double i() {
        return ((iReSqtkUVgSeRiReSqtkUVg)this.c()).G();
    }

    @Override
    public void a(Color color) {
        ((iReSqtkUVgSeRiReSqtkUVg)this.c()).e(Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null)[0]);
    }

    public void j() {
        this.a(iReSqtkUVgKexiReSqtkUVg.b(this.f, ((iReSqtkUVgSeRiReSqtkUVg)this.c()).N(), ((iReSqtkUVgSeRiReSqtkUVg)this.c()).M()));
    }

    @Override
    public void a(Double d2) {
        if (this.b() == null) {
            this.b(d2);
        }
        ((iReSqtkUVgSeRiReSqtkUVg)this.c()).e(d2);
    }

    @Override
    public void a(String string) {
        this.a(Double.parseDouble(string));
    }

    public Color k() {
        return ((iReSqtkUVgSeRiReSqtkUVg)this.c()).E();
    }

    public int l() {
        return Color.HSBtoRGB(this.o(), this.p(), this.q());
    }

    public boolean m() {
        return this.e.i();
    }

    @Override
    public void b(boolean bl) {
        this.e.a((Boolean)bl);
    }

    public void n() {
        this.a(this.i() + 1.0);
        if (this.i() >= ((iReSqtkUVgSeRiReSqtkUVg)this.c()).M()) {
            this.a(((iReSqtkUVgSeRiReSqtkUVg)this.c()).N());
        }
    }

    public float o() {
        return this.b.i().floatValue() / (float)((iReSqtkUVgbqSiReSqtkUVg)this.b.c()).M();
    }

    public float p() {
        return this.d.i().floatValue() / (float)((iReSqtkUVgbqSiReSqtkUVg)this.d.c()).M();
    }

    public float q() {
        return this.c.i().floatValue() / (float)((iReSqtkUVgbqSiReSqtkUVg)this.c.c()).M();
    }

    public iReSqtkUVgkzHiReSqtkUVg r() {
        return this.b;
    }

    public iReSqtkUVgkzHiReSqtkUVg s() {
        return this.c;
    }

    public iReSqtkUVgkzHiReSqtkUVg t() {
        return this.d;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.i();
    }
}

