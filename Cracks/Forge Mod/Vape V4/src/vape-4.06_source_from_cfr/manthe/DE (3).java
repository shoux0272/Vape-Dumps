/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonObject
 */
package manthe;

import com.google.gson.JsonObject;
import java.awt.Color;
import java.util.Random;
import manthe.DB;
import manthe.DF;
import manthe.Ds;
import manthe.L;
import manthe.Y;
import manthe.sV;
import manthe.sW;
import manthe.yI;
import manthe.zu;

public class DE
extends Ds<Double, sW> {
    public static final int r = 96;
    private final DF n;
    private final DF q;
    private final DF o;
    private final DB p;
    private final Random l = new Random();
    private Color m;
    private boolean s = false;

    public DE(Object object, String string, sW sW2) {
        super(object, string, sW2);
        ((sW)this.c()).b("Double click for rainbow\nShift click to switch between hue, brightness, and saturation");
        this.n = DF.a(object, string + " hue", string + " hue", sW2.E(), sW2.D(), 255.0, sW2.C());
        this.q = DF.a(object, string + " brightness", string + " brightness", sW2.E(), sW2.D(), 87.0, sW2.C());
        this.o = DF.a(object, string + " saturation", string + " saturation", sW2.E(), sW2.D(), 255.0, sW2.C());
        this.p = DB.a(object, string + " rainbow", string + " rainbow", false);
    }

    public static DE a(Object object, String string, double d10) {
        sW sW2 = new sW(96.0, 0.0, "", "", string);
        sW2.c(92.0);
        sW2.b(7.0);
        DE dE2 = new DE(object, string, sW2);
        dE2.a(d10);
        sW2.a(dE2);
        sW2.f(d10);
        double d11 = sW2.B() / 96.0;
        dE2.u().a(d11 * 100.0);
        return dE2;
    }

    public static DE a(Object object, String string, Color color) {
        float[] arrf = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        float f10 = arrf[0];
        float f11 = arrf[1];
        float f12 = arrf[2];
        DE dE2 = DE.a(object, string, f10 * 96.0f);
        dE2.I().b((double)f11 * 96.0);
        dE2.z().b((double)f12 * 96.0);
        dE2.I().a((double)(f11 * 96.0f) * 100.0);
        dE2.z().a((double)(f12 * 96.0f) * 100.0);
        dE2.m = color;
        return dE2;
    }

    @Override
    public void q() {
        super.q();
        if (this.m != null) {
            float[] arrf = Color.RGBtoHSB(this.m.getRed(), this.m.getGreen(), this.m.getBlue(), null);
            float f10 = arrf[0];
            float f11 = arrf[1];
            float f12 = arrf[2];
            this.u().b((double)f10 * 96.0);
            this.I().b((double)f11 * 96.0);
            this.z().b((double)f12 * 96.0);
            this.s = false;
        }
    }

    public Double x() {
        return ((sW)this.c()).B();
    }

    @Override
    public void b(Color color) {
        float[] arrf = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
        ((sW)this.c()).f(arrf[0] * 96.0f);
        this.o.b((double)arrf[1] * 96.0);
        this.q.b((double)arrf[2] * 96.0);
    }

    @Override
    public void b(boolean bl) {
        if (!((sW)this.c()).p().equals(this)) {
            ((sW)this.c()).p().b(bl);
        }
        super.b(bl);
        this.n.b(bl);
        this.q.b(bl);
        this.o.b(bl);
    }

    @Override
    public void a(Double d10) {
        if (this.b() == null) {
            this.a(d10);
        }
        ((sW)this.c()).f(d10);
        this.d();
    }

    public void t() {
        this.a(Y.a(this.l, ((sW)this.c()).D(), ((sW)this.c()).C()));
    }

    @Override
    public void a(String string) {
        this.a(Double.parseDouble(string));
    }

    public L K() {
        return ((sW)this.c()).X();
    }

    public int s() {
        return Color.HSBtoRGB(this.w(), this.v(), this.r());
    }

    public boolean J() {
        return this.p.u();
    }

    public void d(boolean bl) {
        this.p.a((Boolean)bl);
    }

    public void y() {
        this.a(this.x() + zu.T.X.a());
        if (this.x() >= ((sW)this.c()).C()) {
            this.a(((sW)this.c()).D());
        }
    }

    public void L() {
        if (this.s && this.J()) {
            double d10 = this.n.a();
            this.b(yI.a(this.w(), this.r(), this.v()));
            this.n.b(d10);
        }
    }

    public float w() {
        return this.n.a().floatValue() / (float)((sV)this.n.c()).C();
    }

    public float v() {
        return this.o.a().floatValue() / (float)((sV)this.o.c()).C();
    }

    public float r() {
        return this.q.a().floatValue() / (float)((sV)this.q.c()).C();
    }

    public DF u() {
        return this.n;
    }

    public DF z() {
        return this.q;
    }

    public DF I() {
        return this.o;
    }

    @Override
    public JsonObject m() {
        JsonObject jsonObject = super.m();
        jsonObject.addProperty("hue", (Number)this.n.a());
        jsonObject.addProperty("saturation", (Number)this.o.a());
        jsonObject.addProperty("brightness", (Number)this.q.a());
        jsonObject.addProperty("rainbow", this.p.u());
        return jsonObject;
    }

    @Override
    public boolean a(JsonObject jsonObject) {
        if (super.a(jsonObject)) {
            if (jsonObject.has("hue")) {
                this.n.b(jsonObject.get("hue").getAsDouble());
            }
            if (jsonObject.has("saturation")) {
                this.o.b(jsonObject.get("saturation").getAsDouble());
            }
            if (jsonObject.has("brightness")) {
                this.q.b(jsonObject.get("brightness").getAsDouble());
            }
            if (jsonObject.has("rainbow")) {
                this.p.a((Boolean)jsonObject.get("rainbow").getAsBoolean());
            }
            return true;
        }
        return false;
    }

    public boolean a(Color color) {
        return Math.abs(color.getRed() - this.K().getRed()) < 2 && Math.abs(color.getGreen() - this.K().getGreen()) < 2 && Math.abs(color.getBlue() - this.K().getBlue()) < 2;
    }

    public void e(boolean bl) {
        this.s = bl;
    }

    public boolean a() {
        return this.s;
    }
}

