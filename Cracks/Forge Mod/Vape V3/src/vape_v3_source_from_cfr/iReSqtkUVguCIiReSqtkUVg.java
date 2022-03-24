/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVguCIiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Night Vision");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Gamma");
    private iReSqtkUVgZyLiReSqtkUVg d = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", this.b, this.b, this.c);
    private float e = -1.0f;

    public iReSqtkUVguCIiReSqtkUVg() {
        super("Fullbright", -256, iReSqtkUVgqTOiReSqtkUVg.e);
        this.a(this.d);
        ((iReSqtkUVgJCoiReSqtkUVg)this.d.c()).a(new iReSqtkUVgBoFiReSqtkUVg(this));
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.d.i().equals(this.b)) {
            iReSqtkUVgeLLiReSqtkUVg.e().a(iReSqtkUVgQoLiReSqtkUVg.a(16, 5220, 0));
        } else {
            iReSqtkUVgeLLiReSqtkUVg.i().a(10.0f);
        }
    }

    @Override
    public void g() {
        this.e = iReSqtkUVgeLLiReSqtkUVg.i().q();
    }

    @Override
    public void h() {
        iReSqtkUVgeLLiReSqtkUVg.e().h(16);
        iReSqtkUVgeLLiReSqtkUVg.i().a(this.e);
    }

    static /* synthetic */ iReSqtkUVgzAciReSqtkUVg a(iReSqtkUVguCIiReSqtkUVg iReSqtkUVguCIiReSqtkUVg2) {
        return iReSqtkUVguCIiReSqtkUVg2.c;
    }

    static /* synthetic */ iReSqtkUVgZyLiReSqtkUVg b(iReSqtkUVguCIiReSqtkUVg iReSqtkUVguCIiReSqtkUVg2) {
        return iReSqtkUVguCIiReSqtkUVg2.d;
    }

    static /* synthetic */ float c(iReSqtkUVguCIiReSqtkUVg iReSqtkUVguCIiReSqtkUVg2) {
        return iReSqtkUVguCIiReSqtkUVg2.e;
    }
}

