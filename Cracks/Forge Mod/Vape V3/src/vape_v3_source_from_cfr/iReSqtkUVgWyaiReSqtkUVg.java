/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import a.a;
import java.awt.Color;
import org.lwjgl.input.Keyboard;

class iReSqtkUVgWyaiReSqtkUVg
implements iReSqtkUVgFeuiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgJZmiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgypOiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgYTjiReSqtkUVg c;

    iReSqtkUVgWyaiReSqtkUVg(iReSqtkUVgYTjiReSqtkUVg iReSqtkUVgYTjiReSqtkUVg2, iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2) {
        this.c = iReSqtkUVgYTjiReSqtkUVg2;
        this.a = iReSqtkUVgJZmiReSqtkUVg2;
        this.b = iReSqtkUVgypOiReSqtkUVg2;
    }

    public void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        if (!iReSqtkUVgYTjiReSqtkUVg.a(this.c).b()) {
            if (Keyboard.isKeyDown((int)15)) {
                if (!iReSqtkUVgYTjiReSqtkUVg.b(this.c)) {
                    if (this.a.K()) {
                        this.c.G().D().a(this.a.s());
                        this.c.G().D().b(iReSqtkUVgIqLiReSqtkUVg.a);
                    }
                    iReSqtkUVgYTjiReSqtkUVg.a(this.c, true);
                }
            } else {
                if (iReSqtkUVgYTjiReSqtkUVg.c(this.c)) {
                    if (this.b.G()) {
                        this.c.G().D().b(iReSqtkUVgIqLiReSqtkUVg.a);
                    } else {
                        this.c.G().D().b(iReSqtkUVgIqLiReSqtkUVg.b);
                    }
                }
                if (iReSqtkUVgYTjiReSqtkUVg.b(this.c)) {
                    this.c.G().D().a(this.a.N());
                    iReSqtkUVgYTjiReSqtkUVg.a(this.c, false);
                    this.c.G().D().b(iReSqtkUVgIqLiReSqtkUVg.b);
                }
            }
        }
        if (this.a.b()) {
            this.c.G().D().a(this.c.m());
        } else if (this.a.f() && !a.a.ib() || this.a.r() && this.a.I().isEmpty()) {
            this.c.G().D().a(Color.GRAY);
        } else {
            this.c.G().D().a(Color.WHITE);
        }
        if (iReSqtkUVgYTjiReSqtkUVg.d(this.c)) {
            if (!this.b.G()) {
                this.c.a_(iReSqtkUVgYTjiReSqtkUVg.e(this.c).b());
            } else {
                this.c.a_(true);
            }
        }
    }
}

