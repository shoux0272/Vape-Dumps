/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.Aw;
import manthe.k9;
import manthe.on;
import manthe.pJ;
import manthe.pe;
import manthe.u9;
import manthe.uV;
import manthe.zu;
import org.lwjgl.opengl.GL11;

public class Al
extends Aw {
    private final long l;
    private final long k;
    private uV j = new uV();

    public Al(pJ pJ2, String string, u9 u92, double d10, double d11, long l) {
        super(pJ2, string, u92, d10, d11);
        this.l = l;
        this.k = System.currentTimeMillis() + l;
    }

    @Override
    public void a(double d10, double d11) {
        float f10 = zu.ac();
        if (!zu.T.aa.u().booleanValue()) {
            f10 = 1.0f;
        }
        boolean bl = GL11.glIsEnabled((int)3042);
        float f11 = 1.0f / f10;
        GL11.glScalef((float)f10, (float)f10, (float)f10);
        double d12 = this.a() + d10 + 3.0;
        double d13 = this.h() + d11;
        double d14 = this.b();
        Color color = this.k();
        pe.a(d12, d13, d14, this.e(), new Color(-1879048192, true), true, 3.0f, 1.0f);
        k9.a(color, (float)d12 - 4.0f, (float)d13 - 6.0f, this.m(), 1.0f, true);
        if (this.j().equals((Object)pJ.ALERT)) {
            k9.a(color, (float)d12 - 2.0f, (float)d13, "noti_alert_large", 0.65f, false);
        }
        on.p.a(0.9, true).a(this.i(), d12 + 23.0, d13 + 8.0, this.j().equals((Object)pJ.ALERT) ? new Color(this.j().a()) : this.j.c);
        this.l().a(d12 + 23.0, d13 + 21.0);
        double d15 = Math.max(Math.min((double)(this.k - System.currentTimeMillis()) / (double)this.l, 1.0), 0.0);
        pe.a(d12 + 1.0, d13 + this.e() - 1.0, d14 * d15 - 1.0, 0.5, new Color(this.j().a()), false, 1.0f, 1.0f);
        if (d15 <= 0.0) {
            this.c();
        }
        GL11.glScalef((float)f11, (float)f11, (float)f11);
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        if (bl) {
            GL11.glEnable((int)3042);
        }
    }

    @Override
    public void b(double d10, double d11) {
        this.c();
    }

    @Override
    public double b() {
        return Math.max(100.0, super.b()) + 16.0 + 18.0;
    }

    @Override
    public double e() {
        return super.e();
    }

    @Override
    public void c() {
        this.a(5.0);
    }

    @Override
    public boolean g() {
        return this.a() >= 1.0;
    }
}

