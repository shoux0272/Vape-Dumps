/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgjuiiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private float b;

    public iReSqtkUVgjuiiReSqtkUVg(int n, float f) {
        this.a = n;
        this.b = f;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            if (this.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
                iReSqtkUVgJZmiReSqtkUVg2.a(this);
                continue;
            }
            iReSqtkUVgJZmiReSqtkUVg2.b(this);
        }
        return this.isCanceled();
    }

    public float a() {
        return this.b;
    }
}

