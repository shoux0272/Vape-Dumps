/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.CA;
import manthe.DB;
import manthe.DE;
import manthe.DF;
import manthe.L;
import manthe.Y;
import manthe.ds;
import manthe.ei;
import manthe.en;
import manthe.mq;
import manthe.o7;
import manthe.p1;
import manthe.rH;
import manthe.zu;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

public class rn
extends rH {
    private final CA am;
    private final CA as;
    private final CA aq;
    private final CA ai;
    private final CA al;
    private final CA ah;
    private final CA ap;
    private final DB aj = DB.a(this, "Custom Colors", false);
    private final DE at = DE.a((Object)this, "Text Color", new Color(0xDCDCDC));
    private final DE an = DE.a((Object)this, "Background Color", new Color(0xDCDCDC));
    private final DF ak = DF.a((Object)this, "Fade Time", "#", "ms", 1.0, 45.0, 250.0, 1.0);
    private final DF ao = DF.a((Object)this, "Background Opacity", "#", "", 0.0, 110.0, 255.0, 1.0);
    private static String[] ar;

    public rn() {
        super("Key Strokes", 62.0, 79.0);
        en en2 = ds.s();
        this.am = new CA(this, en2.j());
        this.as = new CA(this, en2.A());
        this.aq = new CA(this, en2.g());
        this.ai = new CA(this, en2.n());
        this.al = new CA(this, en2.m());
        this.ah = new CA(this, en2.s());
        this.ap = new CA(this, en2.l());
        this.aj.a(this.at, this.an);
        this.ah().add((p1)this.ao.c());
        this.ah().add((p1)this.ak.c());
        this.ah().add((p1)this.aj.c());
        this.ah().add((p1)this.at.c());
        this.ah().add((p1)this.an.c());
    }

    public Color ap() {
        return this.aj.u() != false ? this.at.K() : new Color(0xDCDCDC);
    }

    public int aq() {
        return this.ao.a().intValue();
    }

    @Override
    public void c(boolean bl) {
        this.b(79.0);
        int n6 = 20;
        this.a(this.am, this.t() + 31.0, this.k(), 20.0, 20.0, 0.0, bl);
        this.a(this.as, this.t() + 31.0, this.k() + 21.0, 20.0, 20.0, 0.0, bl);
        this.a(this.aq, this.t() + 10.0, this.k() + 21.0, 20.0, 20.0, 0.0, bl);
        this.a(this.ai, this.t() + 52.0, this.k() + 21.0, 20.0, 20.0, 0.0, bl);
        this.a(this.al, this.t() + 10.0, this.k() + 42.0, 20.0, 20.0, 11.5, bl);
        this.a(this.ah, this.t() + 42.5, this.k() + 42.0, 20.0, 20.0, 9.5, bl);
        this.a(this.ap, this.t() + 10.0, this.k() + 63.0, 20.0, 16.0, 42.0, bl);
        super.c(bl);
    }

    private void a(CA cA, double d10, double d11, double d12, double d13, double d14, boolean bl) {
        Color color;
        String string;
        ei ei2 = cA.d;
        mq mq2 = this.r();
        double d15 = zu.ag() ? 0.0 : 0.5;
        double d16 = zu.ag() ? 0.0 : -1.0;
        GL11.glPushMatrix();
        if (!bl) {
            if (System.currentTimeMillis() % 1000L > 500L != cA.c) {
                cA.c = !cA.c;
                cA.a = System.currentTimeMillis();
            }
        } else {
            if (cA.c != ei2.h()) {
                cA.a = System.currentTimeMillis();
            }
            cA.c = ei2.h();
        }
        double d17 = !cA.c ? 1.0 - Math.min(1.0, (double)(System.currentTimeMillis() - cA.a) / this.ak.a()) : Math.min(1.0, (double)(System.currentTimeMillis() - cA.a) / this.ak.a());
        d17 = Y.a(d17, 0.0, 1.0);
        L l = this.an.K();
        Color color2 = this.aj.u() != false ? new Color((int)((double)((Color)l).getRed() * d17), (int)((double)((Color)l).getGreen() * d17), (int)((double)((Color)l).getBlue() * d17), this.ao.a().intValue()) : new Color((int)(255.0 * d17), (int)(255.0 * d17), (int)(255.0 * d17), this.ao.a().intValue());
        GL11.glTranslated((double)d10, (double)d11, (double)0.0);
        o7.a(-d12 / 2.0, 0.0, d12 / 2.0 + d14, d13, color2);
        String string2 = cA == this.al ? "LMB" : (cA == this.ah ? "RMB" : (string = cA == this.ap ? "" : Keyboard.getKeyName((int)ei2.i())));
        Color color3 = this.aj.u().booleanValue() ? (this.at.J() ? this.at.K() : new Color((int)((double)this.at.K().getRed() * (1.0 - d17)), (int)((double)this.at.K().getGreen() * (1.0 - d17)), (int)((double)this.at.K().getBlue() * (1.0 - d17)), 255)) : (color = new Color((int)(220.0 * (1.0 - d17)), (int)(220.0 * (1.0 - d17)), (int)(220.0 * (1.0 - d17)), 255));
        if (cA == this.ap) {
            o7.a(0.0, d13 / 2.0 - 0.5, d14, d13 / 2.0 + 0.5, color);
        } else {
            GL11.glTranslated((double)(d15 + (double)(cA == this.al ? 6 : (cA == this.ah ? 5 : (cA == this.ap ? 10 : 0)))), (double)(d16 + d13 / 2.0 - mq2.a(string) / 2.0), (double)0.0);
            if (!zu.ag()) {
                o7.a(0.0, 0.0, 0.0, 0.0, new Color(255, 255, 255, 255));
            }
            mq2.b(string, 0.0, 0.0, color);
            if (!zu.ag()) {
                mq2.a("", 0.0, 0.0, -1);
            }
        }
        GL11.glPopMatrix();
    }

    public static void b(String[] arrstring) {
        ar = arrstring;
    }

    public static String[] ar() {
        return ar;
    }

    static {
        if (rn.ar() == null) {
            rn.b(new String[2]);
        }
    }
}

