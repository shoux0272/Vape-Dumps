/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  iReSqtkUVgCsxiReSqtkUVg
 */
class iReSqtkUVgNmUiReSqtkUVg {
    private Object a;
    private long b;

    private iReSqtkUVgNmUiReSqtkUVg(Object object) {
        this.a = object;
        this.b = System.currentTimeMillis();
    }

    public Object a() {
        return this.a;
    }

    public boolean a(long l) {
        long l2 = System.currentTimeMillis();
        return l2 - this.b > l;
    }

    /* synthetic */ iReSqtkUVgNmUiReSqtkUVg(Object object, iReSqtkUVgCsxiReSqtkUVg iReSqtkUVgCsxiReSqtkUVg2) {
        this(object);
    }
}

