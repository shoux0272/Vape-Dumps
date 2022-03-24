/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.D7;
import manthe.gj;
import manthe.my;
import manthe.nz;
import manthe.o1;
import manthe.pd;
import manthe.qK;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.rx;
import manthe.us;
import manthe.yU;
import manthe.ya;

public class rV
extends rg
implements o1 {
    public rV(rf rf2, rx rx2, ya ya2) {
        super("", true);
        ya2.a(rf2);
        this.a(new D7(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        this.c(rf2.q());
        rl rl2 = new rl("", my.c, 1.0);
        rl2.b(2.0);
        rf2.b(rl2);
        this.a(new gj(this, rx2, ya2));
        rl rl3 = new rl(ya2.l(), my.c, 0.8);
        double d10 = this.q() - 5.0 - 0.0;
        rl3.b(Color.WHITE);
        rl3.j(false);
        rl3.b(8.0);
        rl3.c(d10);
        this.b(rl3);
        rl rl4 = new rl("", my.c, 0.8);
        rl4.b(Color.LIGHT_GRAY);
        rl4.j(false);
        rl4.b(6.0);
        rl4.c(d10);
        rl4.a(new us(this, ya2, rl4));
        this.b(rl4);
        rl rl5 = new rl("", my.c, 0.8);
        rl5.b(Color.LIGHT_GRAY);
        rl5.j(false);
        rl5.b(6.0);
        rl5.c(d10);
        rl5.a(new qK(this, rl5, ya2));
        if (!(ya2 instanceof yU)) {
            this.b(rl5);
        }
        rl rl6 = new rl("", my.c, 0.8);
        rl6.b(Color.LIGHT_GRAY);
        rl6.j(false);
        rl6.b(6.0);
        rl6.c(d10);
        rl6.a(new nz(this, rl6, ya2));
        if (!(ya2 instanceof yU)) {
            this.b(rl6);
        }
        rf2.b(this);
    }

    @Override
    public void c(boolean bl) {
        super.c(bl);
    }

    @Override
    public void F() {
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void g(boolean bl) {
    }
}

