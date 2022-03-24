/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgTXviReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    public iReSqtkUVgjSjiReSqtkUVg b;
    private float e;
    private float f;
    private boolean g;
    double c;
    boolean d;

    public iReSqtkUVgTXviReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, int n) {
        this.b = iReSqtkUVgjSjiReSqtkUVg2;
        this.e = this.b.F();
        this.f = this.b.G();
        this.g = this.b.J();
        this.a = n;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public void setRotationYaw(float f) {
        this.e = f;
    }

    public float getRotationYaw() {
        return this.e;
    }

    public float getRotationPitch() {
        return this.f;
    }

    public void setRotationPitch(float f) {
        this.f = f;
    }

    public boolean isOnGround() {
        return this.g;
    }

    public void setOnGround(boolean bl) {
        this.g = bl;
    }

    public void setY(double d2) {
        this.c = d2;
    }

    public double getY() {
        return this.c;
    }

    public void setShouldAlwaysSend(boolean bl) {
        this.d = bl;
    }
}

