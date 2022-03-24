/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgbBTiReSqtkUVg {
    public static iReSqtkUVgFuiiReSqtkUVg a = iReSqtkUVgFuiiReSqtkUVg.e;
    protected final Object b;

    public iReSqtkUVgbBTiReSqtkUVg(Object object) {
        if (object instanceof iReSqtkUVgbBTiReSqtkUVg) {
            iReSqtkUVgbBTiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg2 = (iReSqtkUVgbBTiReSqtkUVg)object;
            this.b = iReSqtkUVgbBTiReSqtkUVg2.a();
            return;
        }
        this.b = object;
    }

    public Object a() {
        return this.b;
    }

    public boolean equals(Object object) {
        if (object == null || this.b == null) {
            return false;
        }
        if (object instanceof iReSqtkUVgbBTiReSqtkUVg) {
            iReSqtkUVgbBTiReSqtkUVg iReSqtkUVgbBTiReSqtkUVg2 = (iReSqtkUVgbBTiReSqtkUVg)object;
            return this.b.equals(iReSqtkUVgbBTiReSqtkUVg2.b);
        }
        return super.equals(object);
    }

    public boolean b() {
        return this.b == null;
    }

    public boolean c() {
        return this.b != null;
    }

    public boolean a(Class class_) {
        return class_ != null && class_.isInstance(this.b);
    }

    public String toString() {
        return this.b.toString();
    }
}

