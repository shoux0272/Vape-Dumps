/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVghSiiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Direction Check", true, "Checks if you're walking forwards and it'll allow you to walk off the edge");
    private boolean c;

    public iReSqtkUVghSiiReSqtkUVg() {
        super("SafeWalk", -9176515, iReSqtkUVgqTOiReSqtkUVg.f, "Helps you from falling off the edge.");
        this.l().add(this.b);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgXWziReSqtkUVg2.isPre()) {
            this.c = iReSqtkUVgtlXiReSqtkUVg2.n().k();
            boolean bl = true;
            if (this.b.i().booleanValue() && !iReSqtkUVgtlXiReSqtkUVg2.M() && iReSqtkUVgtlXiReSqtkUVg2.o() > 0.0f && iReSqtkUVgtlXiReSqtkUVg2.aI() == 0.0f) {
                bl = false;
            }
            if (bl) {
                iReSqtkUVgtlXiReSqtkUVg2.n().f(true);
            }
        } else {
            iReSqtkUVgtlXiReSqtkUVg2.n().f(this.c);
        }
    }
}

