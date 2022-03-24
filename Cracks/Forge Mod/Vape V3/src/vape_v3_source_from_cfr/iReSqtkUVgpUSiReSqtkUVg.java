/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgpUSiReSqtkUVg
extends iReSqtkUVgncDiReSqtkUVg {
    private iReSqtkUVgDfKiReSqtkUVg b;
    private float c;

    public iReSqtkUVgpUSiReSqtkUVg(iReSqtkUVgfipiReSqtkUVg iReSqtkUVgfipiReSqtkUVg2, iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2, float f) {
        super(iReSqtkUVgfipiReSqtkUVg2);
        this.b = iReSqtkUVgDfKiReSqtkUVg2;
        this.c = f;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(this);
        }
        return this.isCanceled();
    }

    public iReSqtkUVgDfKiReSqtkUVg a() {
        return this.b;
    }

    public float b() {
        return this.c;
    }
}

