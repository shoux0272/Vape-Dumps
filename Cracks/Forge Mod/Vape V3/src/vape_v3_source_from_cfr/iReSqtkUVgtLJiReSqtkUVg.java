/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  io.netty.util.concurrent.GenericFutureListener
 */
import io.netty.util.concurrent.GenericFutureListener;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class iReSqtkUVgtLJiReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private final iReSqtkUVgkgTiReSqtkUVg d = this.a("channel", true, iReSqtkUVgSzRiReSqtkUVg.ag);
    private final iReSqtkUVgkgTiReSqtkUVg e = this.a("outboundPacketsQueue", true, Queue.class);
    private iReSqtkUVgkgTiReSqtkUVg f;
    private iReSqtkUVgkgTiReSqtkUVg g;
    public iReSqtkUVgYewiReSqtkUVg b;
    public iReSqtkUVgYewiReSqtkUVg c;
    private final iReSqtkUVgYewiReSqtkUVg h;
    private final iReSqtkUVgYewiReSqtkUVg i;
    private final iReSqtkUVgYewiReSqtkUVg j;

    public iReSqtkUVgtLJiReSqtkUVg() {
        super(iReSqtkUVgSzRiReSqtkUVg.af);
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.f = this.a("receivedPacketsQueue", true, Queue.class);
            this.c = this.a("func_150725_a", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ab, GenericFutureListener[].class);
        } else {
            this.g = this.a("field_181680_j", false, ReentrantReadWriteLock.class);
            this.c = this.a("func_179290_a", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ab);
        }
        this.h = this.a("getNetHandler", true, iReSqtkUVgSzRiReSqtkUVg.ah, new Class[0]);
        this.i = this.a("flushOutboundQueue", true, Void.TYPE, new Class[0]);
        this.j = this.a("dispatchPacket", true, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.ab, GenericFutureListener[].class);
        this.b = this.a("channelRead0", false, Void.TYPE, iReSqtkUVgSzRiReSqtkUVg.bG, iReSqtkUVgSzRiReSqtkUVg.ab);
    }

    private Object a(Object object) {
        return this.d.h(object);
    }

    private Object b(Object object) {
        return this.h.j(object, new Object[0]);
    }

    private Queue c(Object object) {
        return (Queue)this.f.h(object);
    }

    private Queue d(Object object) {
        return (Queue)this.e.h(object);
    }

    private void e(Object object) {
        this.i.a(object, new Object[0]);
    }

    private void a(Object object, Object object2, Object[] arrobject) {
        this.j.a(object, new Object[]{object2, arrobject});
    }

    private ReentrantReadWriteLock f(Object object) {
        return (ReentrantReadWriteLock)this.g.h(object);
    }

    static /* synthetic */ Object a(iReSqtkUVgtLJiReSqtkUVg iReSqtkUVgtLJiReSqtkUVg2, Object object) {
        return iReSqtkUVgtLJiReSqtkUVg2.a(object);
    }

    static /* synthetic */ Object b(iReSqtkUVgtLJiReSqtkUVg iReSqtkUVgtLJiReSqtkUVg2, Object object) {
        return iReSqtkUVgtLJiReSqtkUVg2.b(object);
    }

    static /* synthetic */ Queue c(iReSqtkUVgtLJiReSqtkUVg iReSqtkUVgtLJiReSqtkUVg2, Object object) {
        return iReSqtkUVgtLJiReSqtkUVg2.c(object);
    }

    static /* synthetic */ Queue d(iReSqtkUVgtLJiReSqtkUVg iReSqtkUVgtLJiReSqtkUVg2, Object object) {
        return iReSqtkUVgtLJiReSqtkUVg2.d(object);
    }

    static /* synthetic */ void e(iReSqtkUVgtLJiReSqtkUVg iReSqtkUVgtLJiReSqtkUVg2, Object object) {
        iReSqtkUVgtLJiReSqtkUVg2.e(object);
    }

    static /* synthetic */ void a(iReSqtkUVgtLJiReSqtkUVg iReSqtkUVgtLJiReSqtkUVg2, Object object, Object object2, Object[] arrobject) {
        iReSqtkUVgtLJiReSqtkUVg2.a(object, object2, arrobject);
    }

    static /* synthetic */ ReentrantReadWriteLock f(iReSqtkUVgtLJiReSqtkUVg iReSqtkUVgtLJiReSqtkUVg2, Object object) {
        return iReSqtkUVgtLJiReSqtkUVg2.f(object);
    }
}

