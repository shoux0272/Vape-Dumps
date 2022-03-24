/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgJrJiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg q = new iReSqtkUVgzAciReSqtkUVg("Alphabetical");
    private iReSqtkUVgzAciReSqtkUVg r = new iReSqtkUVgzAciReSqtkUVg("Length");
    private iReSqtkUVgZyLiReSqtkUVg s = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Sort", this.q, this.q, this.r);
    private iReSqtkUVgoRmiReSqtkUVg t = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Shadow", true, "Renders shadowed text.");
    private iReSqtkUVgoRmiReSqtkUVg u = iReSqtkUVgoRmiReSqtkUVg.a(this, "Use Category Color", false);
    private iReSqtkUVgoRmiReSqtkUVg v = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Watermark", false, "Renders a vape watermark");
    public iReSqtkUVgoRmiReSqtkUVg p = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Rescale", true, "Rescales text GUI");

    public iReSqtkUVgJrJiReSqtkUVg() {
        super("Text GUI", true);
        this.J().a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.k(false);
        this.J().k(false);
        this.c(100.0);
        this.d(20.0);
        this.c_(false);
        this.f(true);
        this.K().add((iReSqtkUVgnCWiReSqtkUVg)this.t.c());
        this.K().add((iReSqtkUVgnCWiReSqtkUVg)this.u.c());
        this.K().add((iReSqtkUVgnCWiReSqtkUVg)this.v.c());
        this.K().add((iReSqtkUVgnCWiReSqtkUVg)this.p.c());
        this.K().add((iReSqtkUVgnCWiReSqtkUVg)this.s.c());
    }

    @Override
    public void c_() {
        super.c_();
        if (this.h_() || !this.h()) {
            return;
        }
        CopyOnWriteArrayList<iReSqtkUVgJZmiReSqtkUVg> copyOnWriteArrayList = new CopyOnWriteArrayList<iReSqtkUVgJZmiReSqtkUVg>(iReSqtkUVgFuiiReSqtkUVg.e.d().d());
        if (this.s.i() == this.q) {
            copyOnWriteArrayList.sort(new iReSqtkUVggeriReSqtkUVg());
        } else if (this.s.i() == this.r) {
            copyOnWriteArrayList.sort(new iReSqtkUVgnsViReSqtkUVg(null));
        }
        double d2 = this.e_() + 11.0;
        boolean bl = false;
        if (this.c() >= (double)(iReSqtkUVgeLLiReSqtkUVg.o().e() / 2)) {
            bl = true;
        }
        float[] arrf = new float[3];
        iReSqtkUVgZfciReSqtkUVg iReSqtkUVgZfciReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.r().d;
        arrf = Color.RGBtoHSB(iReSqtkUVgZfciReSqtkUVg2.k().getRed(), iReSqtkUVgZfciReSqtkUVg2.k().getGreen(), iReSqtkUVgZfciReSqtkUVg2.k().getBlue(), arrf);
        float f = arrf[0];
        if (this.v.i().booleanValue()) {
            String string = "v3.25";
            iReSqtkUVgCRDiReSqtkUVg object = iReSqtkUVgFuiiReSqtkUVg.e.a(1.2);
            double d3 = bl ? this.c() + 100.0 - (object.b(string) + 50.0) : this.c();
            GL11.glPushMatrix();
            if (this.t.i().booleanValue()) {
                object.b(string, d3 + 50.0, 3.0 + (d2 += 11.0), Color.lightGray);
            } else {
                object.a(string, d3 + 50.0, 3.0 + (d2 += 11.0), Color.lightGray);
            }
            iReSqtkUVgMSwiReSqtkUVg.a(iReSqtkUVgZfciReSqtkUVg2.k(), (float)d3, (float)d2 - 3.0f, "logo", 0.5f, true);
            GL11.glPopMatrix();
            d2 += 5.0;
        }
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : copyOnWriteArrayList) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b() || iReSqtkUVgJZmiReSqtkUVg2.d() == 0) continue;
            String string = iReSqtkUVgJZmiReSqtkUVg2.N() + iReSqtkUVgJZmiReSqtkUVg2.c();
            double d4 = bl ? this.c() + 100.0 - this.j().b(string) : this.c() + 1.0;
            Color color = new Color(this.u.i() != false ? iReSqtkUVgJZmiReSqtkUVg2.e().c() : iReSqtkUVgJZmiReSqtkUVg2.d());
            if (iReSqtkUVgZfciReSqtkUVg2.m()) {
                if ((f -= 0.025f) <= 0.0f) {
                    f = 1.0f;
                }
                arrf[0] = f;
                color = new Color(Color.HSBtoRGB(f, 1.0f, 1.0f));
            }
            if (this.t.i().booleanValue()) {
                this.j().b(string, d4, d2 += 11.0, color);
                continue;
            }
            this.j().a(string, d4, d2 += 11.0, color);
        }
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.J().o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(d2 - 4.0);
        }
    }
}

