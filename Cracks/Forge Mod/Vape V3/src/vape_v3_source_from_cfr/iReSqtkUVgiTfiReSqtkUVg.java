/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgiTfiReSqtkUVg
extends iReSqtkUVgCMeiReSqtkUVg {
    private final iReSqtkUVggVdiReSqtkUVg p = new iReSqtkUVggVdiReSqtkUVg();

    public iReSqtkUVgiTfiReSqtkUVg() {
        super("GUI", false);
        this.J().a(new iReSqtkUVgLWWiReSqtkUVg(0.0, 0.0, 5000, 1, new iReSqtkUVgbXziReSqtkUVg(0, 0, 0, 0)));
        this.p.a_(true);
        this.p.b(true);
        this.p.c(10.0);
        this.p.d(10.0);
        this.c(87.0);
        this.d(20.0);
    }

    @Override
    public void c(double d2) {
        super.c(d2);
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.J().o()) {
            iReSqtkUVgnCWiReSqtkUVg2.c(d2 - 4.0);
        }
    }

    @Override
    public boolean D() {
        return false;
    }
}

