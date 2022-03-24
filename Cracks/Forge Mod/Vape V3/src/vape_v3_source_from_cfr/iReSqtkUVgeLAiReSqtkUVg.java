/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgeLAiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a(this, "Remove Nausea", true);
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a(this, "Remove Blindness", true);
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a(this, "Remove Slowness", true);
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Remove Effects", false, "Removes non-visual effects from slowness\nCan be detected by anti-cheat");
    private float f;
    private float g;
    private float h;

    public iReSqtkUVgeLAiReSqtkUVg() {
        super("AntiDebuff", -256, iReSqtkUVgqTOiReSqtkUVg.e, "Removes negative visual potion effects");
        this.a(this.b, this.c, this.d, this.e);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2;
        if (this.b.i().booleanValue()) {
            iReSqtkUVgeLLiReSqtkUVg.e().h(9);
        }
        if (this.c.i().booleanValue() && this.e.i().booleanValue()) {
            iReSqtkUVgeLLiReSqtkUVg.e().h(15);
        }
        if (this.d.i().booleanValue() && (iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e()).a(iReSqtkUVgnNhiReSqtkUVg.e())) {
            if (this.e.i().booleanValue()) {
                iReSqtkUVgQoLiReSqtkUVg iReSqtkUVgQoLiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().b(iReSqtkUVgnNhiReSqtkUVg.e());
                iReSqtkUVgnNhiReSqtkUVg[] arriReSqtkUVgnNhiReSqtkUVg = iReSqtkUVgnNhiReSqtkUVg.i();
                arriReSqtkUVgnNhiReSqtkUVg[2].a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2.aL(), iReSqtkUVgQoLiReSqtkUVg2.d());
            }
            iReSqtkUVgtlXiReSqtkUVg2.h(2);
        }
    }

    @Override
    public void a(iReSqtkUVgIXsiReSqtkUVg iReSqtkUVgIXsiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (this.c.i().booleanValue() && iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgnNhiReSqtkUVg.h()) && iReSqtkUVgtlXiReSqtkUVg2.b(iReSqtkUVgnNhiReSqtkUVg.h()).f() > 1) {
            iReSqtkUVgIXsiReSqtkUVg2.h().d(true);
            iReSqtkUVgIXsiReSqtkUVg2.a(0.1f);
        }
    }

    @Override
    public void a(iReSqtkUVgbmEiReSqtkUVg iReSqtkUVgbmEiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (this.c.i().booleanValue() && iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgnNhiReSqtkUVg.h()) && iReSqtkUVgtlXiReSqtkUVg2.b(iReSqtkUVgnNhiReSqtkUVg.h()).f() > 1) {
            GL11.glFogf((int)2915, (float)990.0f);
            GL11.glFogf((int)2916, (float)1000.0f);
            iReSqtkUVgbmEiReSqtkUVg2.a().b(true);
            if (iReSqtkUVgbmEiReSqtkUVg2.e() == 0.0f) {
                iReSqtkUVgbmEiReSqtkUVg2.a(this.f);
            }
            if (iReSqtkUVgbmEiReSqtkUVg2.f() == 0.0f) {
                iReSqtkUVgbmEiReSqtkUVg2.b(this.g);
            }
            if (iReSqtkUVgbmEiReSqtkUVg2.g() == 0.0f) {
                iReSqtkUVgbmEiReSqtkUVg2.c(this.h);
            }
        } else {
            this.f = iReSqtkUVgbmEiReSqtkUVg2.e();
            this.g = iReSqtkUVgbmEiReSqtkUVg2.f();
            this.h = iReSqtkUVgbmEiReSqtkUVg2.g();
        }
    }
}

