/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;

public class iReSqtkUVgLYOiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgYewiReSqtkUVg b = iReSqtkUVgauSiReSqtkUVg.d() >= 23 ? this.a("sendPacket", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ab) : this.a("addToSendQueue", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ab);
    private iReSqtkUVgYewiReSqtkUVg c;

    public iReSqtkUVgLYOiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.aa);
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.c = this.a("getPlayerInfoMap", true, Collection.class, new Class[0]);
        }
    }

    private void a(Object object, Object object2) {
        this.b.a(object, new Object[]{object2});
    }

    private Collection a(Object object) {
        return (Collection)this.c.j(object, new Object[0]);
    }

    static /* synthetic */ void a(iReSqtkUVgLYOiReSqtkUVg iReSqtkUVgLYOiReSqtkUVg2, Object object, Object object2) {
        iReSqtkUVgLYOiReSqtkUVg2.a(object, object2);
    }

    static /* synthetic */ Collection a(iReSqtkUVgLYOiReSqtkUVg iReSqtkUVgLYOiReSqtkUVg2, Object object) {
        return iReSqtkUVgLYOiReSqtkUVg2.a(object);
    }
}

