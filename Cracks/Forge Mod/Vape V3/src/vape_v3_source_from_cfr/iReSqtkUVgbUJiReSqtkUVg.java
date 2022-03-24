/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgbUJiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private float b;

    public iReSqtkUVgbUJiReSqtkUVg(float f) {
        this.b = f;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public float a() {
        return this.b;
    }
}

