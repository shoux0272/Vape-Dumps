/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgDJsiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Fast Bow", false, "Makes you shoot your bow faster.");
    private iReSqtkUVgkzHiReSqtkUVg c = iReSqtkUVgkzHiReSqtkUVg.a(this, "Ticks", "#", "", 1.0, 14.0, 20.0, 1.0, "The amount of ticks you have to use an item to consume.");

    public iReSqtkUVgDJsiReSqtkUVg() {
        super("FastConsume", -256, iReSqtkUVgqTOiReSqtkUVg.f, "Use/Consume items quicker.");
        this.a(this.c, this.b);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if ((double)iReSqtkUVgtlXiReSqtkUVg2.aY() == this.c.i() && this.a(iReSqtkUVgtlXiReSqtkUVg2.bd().e())) {
            for (int i = 0; i < 30; ++i) {
                iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVgvBUiReSqtkUVg.a(true));
            }
            iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2);
        }
    }

    private boolean a(iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2) {
        return !iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.J) && (this.b.i() != false || !iReSqtkUVgLUhiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.aW));
    }
}

