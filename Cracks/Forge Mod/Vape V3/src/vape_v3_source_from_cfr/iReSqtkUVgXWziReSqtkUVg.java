/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgXWziReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private double b;
    private double c;
    private double d;

    public iReSqtkUVgXWziReSqtkUVg(int n, double d2, double d3, double d4) {
        this.a = n;
        this.b = d2;
        this.c = d3;
        this.d = d4;
    }

    public double getX() {
        return this.b;
    }

    public iReSqtkUVgXWziReSqtkUVg setX(double d2) {
        this.b = d2;
        return this;
    }

    public double getY() {
        return this.c;
    }

    public iReSqtkUVgXWziReSqtkUVg setY(double d2) {
        this.c = d2;
        return this;
    }

    public double getZ() {
        return this.d;
    }

    public iReSqtkUVgXWziReSqtkUVg setZ(double d2) {
        this.d = d2;
        return this;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return super.fire();
    }
}

