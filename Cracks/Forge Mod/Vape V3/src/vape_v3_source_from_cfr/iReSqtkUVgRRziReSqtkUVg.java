/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgRRziReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;

    public iReSqtkUVgRRziReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.ab);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.c = this.a("hasPriority", true, Boolean.TYPE, new Class[0]);
        }
        this.b = this.a("processPacket", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ah);
    }

    private boolean a(Object object) {
        return this.c.b(object, new Object[0]);
    }

    private void a(Object object, Object object2) {
        this.b.a(object, new Object[]{object2});
    }

    static /* synthetic */ boolean a(iReSqtkUVgRRziReSqtkUVg iReSqtkUVgRRziReSqtkUVg2, Object object) {
        return iReSqtkUVgRRziReSqtkUVg2.a(object);
    }

    static /* synthetic */ void a(iReSqtkUVgRRziReSqtkUVg iReSqtkUVgRRziReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgRRziReSqtkUVg2.a(object, object2);
    }
}

