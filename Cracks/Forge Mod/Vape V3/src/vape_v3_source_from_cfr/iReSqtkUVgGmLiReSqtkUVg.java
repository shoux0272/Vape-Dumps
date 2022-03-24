/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgGmLiReSqtkUVg
extends iReSqtkUVgFWjiReSqtkUVg
implements iReSqtkUVgnPQiReSqtkUVg {
    private iReSqtkUVgDyziReSqtkUVg h;
    private iReSqtkUVgeMGiReSqtkUVg p;

    public iReSqtkUVgGmLiReSqtkUVg(iReSqtkUVgmasiReSqtkUVg iReSqtkUVgmasiReSqtkUVg2, iReSqtkUVgDyziReSqtkUVg iReSqtkUVgDyziReSqtkUVg2, iReSqtkUVgeMGiReSqtkUVg iReSqtkUVgeMGiReSqtkUVg2) {
        super("", false);
        this.p = iReSqtkUVgeMGiReSqtkUVg2;
        this.h = iReSqtkUVgDyziReSqtkUVg2;
        this.a(new iReSqtkUVgLWWiReSqtkUVg(2.0, 10.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.d(12.0);
        this.c(iReSqtkUVgmasiReSqtkUVg2.k());
        this.a(new iReSqtkUVgGNyiReSqtkUVg(this));
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = new iReSqtkUVgFWjiReSqtkUVg("x", true);
        iReSqtkUVgFWjiReSqtkUVg2.d(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.c(12.0);
        iReSqtkUVgFWjiReSqtkUVg2.a(new iReSqtkUVgrqEiReSqtkUVg(this, iReSqtkUVgeMGiReSqtkUVg2, iReSqtkUVgDyziReSqtkUVg2));
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)this);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgFWjiReSqtkUVg2);
        iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2 = new iReSqtkUVgilmiReSqtkUVg("", iReSqtkUVgIqLiReSqtkUVg.a, 1.0);
        iReSqtkUVgilmiReSqtkUVg2.d(2.0);
        iReSqtkUVgmasiReSqtkUVg2.a((iReSqtkUVgnCWiReSqtkUVg)iReSqtkUVgilmiReSqtkUVg2);
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        iReSqtkUVgpeziReSqtkUVg iReSqtkUVgpeziReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.h();
        iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = null;
        String string = null;
        try {
            iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgLUhiReSqtkUVg.a(Integer.parseInt(this.h.a()));
        }
        catch (Exception exception) {
            iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgfsSiReSqtkUVg.a(this.h.a());
        }
        if (iReSqtkUVgLUhiReSqtkUVg2 != null && iReSqtkUVgLUhiReSqtkUVg2.c()) {
            string = iReSqtkUVgLUhiReSqtkUVg2.b(iReSqtkUVgyetiReSqtkUVg.a(iReSqtkUVgLUhiReSqtkUVg2));
            if (this.h.e() != -1) {
                string = this.h.a() + ":" + this.h.e();
            }
        }
        iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.c() + this.k(), this.e_() + this.l(), this.t() ? this.p.i().darker() : this.p.i());
        GL11.glColor4d((double)1.0, (double)1.0, (double)1.0, (double)1.0);
        if (string != null) {
            iReSqtkUVgpeziReSqtkUVg2.a(string, this.c() + 15.0, this.e_() + 4.0, -1, 0.5);
        } else {
            iReSqtkUVgpeziReSqtkUVg2.a(this.h.a(), this.c() + 15.0, this.e_() + 4.0, -1, 0.5);
        }
        if (this.h.b() != -1) {
            iReSqtkUVgpeziReSqtkUVg2.a(this.h.b() + "", this.c() + this.k() - (double)iReSqtkUVgpeziReSqtkUVg2.a(this.h.b() + "") - 2.0, this.e_() + 2.0, -1);
        }
        iReSqtkUVguKSiReSqtkUVg.a(this.c(), this.e_(), this.c() + 12.0, this.e_() + 12.0, -16777216);
        if (this.b()) {
            iReSqtkUVgMSwiReSqtkUVg.a(iReSqtkUVgFuiiReSqtkUVg.e.r().d.k(), (float)this.c() + 1.0f, (float)this.e_() - 1.0f, "check", 0.38f);
        }
    }

    @Override
    public void b_() {
        this.h.a(!this.h.c());
    }

    @Override
    public boolean b() {
        return this.h.c();
    }

    @Override
    public void b(boolean bl) {
        this.h.a(bl);
    }

    public iReSqtkUVgDyziReSqtkUVg F() {
        return this.h;
    }
}

