/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Ds;
import manthe.ds;
import manthe.fA;
import manthe.fn;
import manthe.ky;
import manthe.uI;
import manthe.y5;

public class yp
extends y5 {
    private final DF v = DF.a((Object)this, "Delay", "#", "ms", 1.0, 100.0, 1000.0, 10.0);
    private final DB x = DB.a((Object)this, "Spoof Ping", false, "Makes it so only your ping is spoofed");
    private final DB w = DB.a((Object)this, "Advanced Spoof", false, "Delays extra packets used to calculate ping.\nSome servers may require this to Spoof ping.");
    private final List<Object> u = new CopyOnWriteArrayList<Object>();
    private final Queue<uI> y = new ConcurrentLinkedQueue<uI>();

    public yp() {
        super("BeanerNet", 8919359, CQ.f, "Delays packets sent, simulates lag and causes high ping");
        this.x.a(new Ds[]{this.w});
        this.a(this.v, this.x, this.w);
    }

    @Override
    public void s() {
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(ky ky2) {
        Object object;
        if (ds.n()) {
            return;
        }
        if (ds.k().a() == null || ds.k().j()) {
            return;
        }
        Object object2 = ky2.getPacket().a();
        if (this.u.contains(object2)) {
            this.u.remove(object2);
            return;
        }
        while (this.y.peek() != null && (object = this.y.peek()) != null && ((uI)object).a(this.v.a().longValue())) {
            object = this.y.poll();
            this.u.add(((uI)object).a());
            ds.k().bp().a(new fn(((uI)object).a()));
        }
        if (!(!this.x.u().booleanValue() || A5.W.isInstance(object2) || this.w.u().booleanValue() && A5.j.isInstance(object2))) {
            return;
        }
        if (A5.j.isInstance(object2) && ((fA)(object = new fA(object2))).g() >= 0) {
            return;
        }
        this.y.add(new uI(object2, null));
        ky2.a(true);
    }
}

