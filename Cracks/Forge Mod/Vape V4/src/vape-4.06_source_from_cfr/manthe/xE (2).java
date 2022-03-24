/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.ds;
import manthe.k9;
import manthe.mq;
import manthe.nm;
import manthe.on;
import manthe.pe;
import manthe.rL;
import manthe.uW;
import manthe.vc;
import manthe.wL;
import manthe.wM;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class xE
extends wM {
    private wL z;

    public xE(wL wL2) {
        this.z = wL2;
    }

    @Override
    public void a() {
        this.f(false);
    }

    @Override
    public void k() {
        this.f(true);
    }

    private void f(boolean bl) {
        double d10;
        mq mq2 = this.e(1.0);
        double d11 = mq2.a("e");
        float f10 = (float)(this.d() + 5.0);
        float f11 = (float)((double)((float)this.c()) - (bl ? this.z.Y().f() : -5.0));
        boolean bl2 = this.d() + this.e() / 2.0 >= (double)((float)ds.p().g() / 2.0f);
        boolean bl3 = on.p.t().r.J();
        if (bl2) {
            f10 += 30.0f;
        }
        double d12 = 10.0;
        rL rL2 = rL.am();
        CopyOnWriteArrayList<y5> copyOnWriteArrayList = new CopyOnWriteArrayList<y5>(on.p.H().e());
        this.a(copyOnWriteArrayList);
        ArrayList<y5> arrayList = new ArrayList<y5>();
        for (y5 y52 : copyOnWriteArrayList) {
            if (!y52.N() || y52.y() == 0 || rL2.al.u().booleanValue() && rL2.an.d(y52.H())) continue;
            arrayList.add(y52);
            d10 = mq2.b(y52.H() + y52.w()) + 6.0;
            d12 = Math.max(d12, d10);
        }
        if (rL2.aq.u().booleanValue()) {
            d12 = Math.max(d12, 75.0);
        }
        double d13 = bl2 ? this.d() + this.e() - d12 : this.d();
        d10 = (double)arrayList.size() * (d11 + 4.0);
        if (rL2.ae.u().booleanValue()) {
            if (rL2.aq.u().booleanValue()) {
                d10 += 17.0;
            }
            pe.c(d13, f11 - 2.0f, d12, d10, new Color(0, 0, 0, 100));
        }
        if (rL2.aq.u().booleanValue()) {
            k9.a(b.e(), (float)d13, f11, "vapelogo", 15.0f, 15.0f, (boolean)rL2.ao.u());
            k9.a(Color.WHITE, (float)(d13 + 50.0), f11, "v4", 15.0f, 15.0f, (boolean)rL2.ao.u());
            f11 += 17.0f;
        }
        Color color = b.e();
        float[] arrf = new float[3];
        arrf = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), arrf);
        float f12 = arrf[0];
        for (y5 y53 : arrayList) {
            String string = y53.H() + y53.w();
            Color color2 = new Color(rL2.am.u() != false ? y53.Q().c() : y53.y());
            if (bl3) {
                if ((f12 -= 0.025f) <= 0.0f) {
                    f12 = 1.0f;
                }
                arrf[0] = f12;
                color2 = new Color(Color.HSBtoRGB(f12, arrf[1], arrf[2]));
            }
            double d14 = mq2.b(string);
            float f13 = f10 = bl2 ? (float)(this.d() + this.e() - 3.0 - d14) : (float)(this.d() + 3.0);
            if (rL2.ao.u().booleanValue()) {
                mq2.c(string, (double)f10, (double)f11, color2);
            } else {
                mq2.a(string, (double)f10, (double)f11, color2);
            }
            if (rL2.ae.u().booleanValue()) {
                pe.b(d13, (double)f11 + d11 + 2.0, d12, 1.0f, new Color(30, 30, 30, 50));
            }
            f11 = (float)((double)f11 + (d11 + 4.0));
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
    }

    private void a(List<y5> list) {
        mq mq2 = this.e(1.0);
        switch (rL.am().ag.v().H()) {
            case "Alphabetical": {
                list.sort(new nm());
                break;
            }
            case "Length": {
                list.sort(new vc(this, mq2));
            }
        }
    }

    @Override
    public void j() {
    }

    @Override
    public void a(uW uW2) {
    }

    @Override
    public void i() {
    }

    @Override
    public double g() {
        return 110.0;
    }

    @Override
    public double h() {
        return 0.0;
    }
}

