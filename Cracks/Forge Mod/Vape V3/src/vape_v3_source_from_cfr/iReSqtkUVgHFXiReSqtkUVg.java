/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgHFXiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private double b;
    private double c;
    private iReSqtkUVgVQSiReSqtkUVg d;
    private iReSqtkUVguxviReSqtkUVg e;

    public iReSqtkUVgHFXiReSqtkUVg() {
        super("KeepSprint", 14828276, iReSqtkUVgqTOiReSqtkUVg.f, "Prevents you from losing sprint when attacking.");
    }

    @Override
    public void a(iReSqtkUVgHbMiReSqtkUVg iReSqtkUVgHbMiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (this.d == null) {
            this.d = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgVQSiReSqtkUVg.class);
        }
        if (this.d.x()) {
            return;
        }
        if (iReSqtkUVgHbMiReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            this.b = iReSqtkUVgtlXiReSqtkUVg2.C();
            this.c = iReSqtkUVgtlXiReSqtkUVg2.E();
        }
        if (iReSqtkUVgHbMiReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.b && iReSqtkUVgtlXiReSqtkUVg2.C() == (this.b *= 0.6) && iReSqtkUVgtlXiReSqtkUVg2.E() == (this.c *= 0.6) && !iReSqtkUVgtlXiReSqtkUVg2.al()) {
            iReSqtkUVgtlXiReSqtkUVg2.h(iReSqtkUVgtlXiReSqtkUVg2.C() / 0.6);
            iReSqtkUVgtlXiReSqtkUVg2.j(iReSqtkUVgtlXiReSqtkUVg2.E() / 0.6);
            iReSqtkUVgtlXiReSqtkUVg2.f(true);
        }
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.d == null) {
            this.d = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgVQSiReSqtkUVg.class);
        }
        if (this.d.x()) {
            return;
        }
        iReSqtkUVgPZdiReSqtkUVg iReSqtkUVgPZdiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().a(iReSqtkUVgezAiReSqtkUVg.d());
        if (iReSqtkUVgeLLiReSqtkUVg.e().N() && iReSqtkUVgPZdiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg.aE().d()).b()) {
            iReSqtkUVgPZdiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg.aE());
        }
    }

    @Override
    public void a(iReSqtkUVgQgQiReSqtkUVg iReSqtkUVgQgQiReSqtkUVg2) {
        if (this.d == null) {
            this.d = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgVQSiReSqtkUVg.class);
        }
        if (this.d.x()) {
            return;
        }
        if (!iReSqtkUVgQgQiReSqtkUVg2.getEntity().equals(iReSqtkUVgeLLiReSqtkUVg.e())) {
            return;
        }
        if (iReSqtkUVgQgQiReSqtkUVg2.isNewStateSprinting()) {
            return;
        }
        if (this.a(iReSqtkUVgeLLiReSqtkUVg.e())) {
            iReSqtkUVgQgQiReSqtkUVg2.setCanceled(true);
        }
    }

    @Override
    public boolean f() {
        return true;
    }

    private boolean a(iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2) {
        return !this.d.x() && iReSqtkUVgtlXiReSqtkUVg2.o() > 0.0f && !iReSqtkUVgtlXiReSqtkUVg2.M() && iReSqtkUVgtlXiReSqtkUVg2.bc().d() > 6 && !iReSqtkUVgtlXiReSqtkUVg2.al();
    }
}

