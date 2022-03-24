/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgUiziReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgVQSiReSqtkUVg b;

    public iReSqtkUVgUiziReSqtkUVg() {
        super("Sprint", -16711796, iReSqtkUVgqTOiReSqtkUVg.c, "Sets your sprinting to true.");
    }

    @Override
    public void a(iReSqtkUVgXsFiReSqtkUVg iReSqtkUVgXsFiReSqtkUVg2) {
        if (this.b == null) {
            this.b = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgVQSiReSqtkUVg.class);
        }
        if (!iReSqtkUVgeLLiReSqtkUVg.f().b()) {
            return;
        }
        if (!(this.b.x() || iReSqtkUVgeLLiReSqtkUVg.i().r().e() || iReSqtkUVgeLLiReSqtkUVg.e().N() || iReSqtkUVgeLLiReSqtkUVg.e().al())) {
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().r().d(), true);
        } else {
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().r().d(), false);
        }
    }

    @Override
    public void h() {
        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgeLLiReSqtkUVg.i().r().d(), false);
    }
}

