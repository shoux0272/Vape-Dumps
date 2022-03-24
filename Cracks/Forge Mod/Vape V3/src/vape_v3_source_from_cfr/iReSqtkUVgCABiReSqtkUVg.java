/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgCABiReSqtkUVg
extends iReSqtkUVgFWjiReSqtkUVg {
    private iReSqtkUVgQBEiReSqtkUVg h;

    public iReSqtkUVgCABiReSqtkUVg(String string, float f, float f2, float f3) {
        this(string, f, f2, f3, false);
    }

    public iReSqtkUVgCABiReSqtkUVg(String string, float f, float f2, float f3, boolean bl) {
        super(bl);
        this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.h = new iReSqtkUVgQBEiReSqtkUVg(string, f, false, false);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.h);
        this.h.a(f2);
        this.h.b(f3);
    }

    public iReSqtkUVgCABiReSqtkUVg(String string, String string2, float f, float f2, float f3, boolean bl) {
        super(bl);
        this.a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 1, 2, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.h = new iReSqtkUVgQBEiReSqtkUVg(string, f, false, false);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.h);
        this.h.a(f2);
        this.h.b(f3);
        this.D().a(string2);
        this.a((iReSqtkUVgnCWiReSqtkUVg)this.D());
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        if (this.D().D().equalsIgnoreCase("")) {
            this.h.c(d2);
        }
    }

    @Override
    public void d(double d2) {
        super.d(d2);
        this.h.d(d2);
    }

    public void c(Color color) {
        this.h.c(color);
    }

    public iReSqtkUVgQBEiReSqtkUVg F() {
        return this.h;
    }
}

