/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.CopyOnWriteArrayList;

public class iReSqtkUVgFwbiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgkzHiReSqtkUVg b = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Delay", "#", "", 1.0, 100.0, 1000.0, 10.0);
    private List<Object> c = new CopyOnWriteArrayList<Object>();
    private Queue<iReSqtkUVgNmUiReSqtkUVg> d = new ConcurrentLinkedQueue<iReSqtkUVgNmUiReSqtkUVg>();

    public iReSqtkUVgFwbiReSqtkUVg() {
        super("BeanerNet", 8919359, iReSqtkUVgqTOiReSqtkUVg.f, "Delays packets sent, simulates lag and causes high ping");
        this.a(this.b);
    }

    @Override
    public void g() {
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgmTziReSqtkUVg iReSqtkUVgmTziReSqtkUVg2) {
        iReSqtkUVgNmUiReSqtkUVg iReSqtkUVgNmUiReSqtkUVg2;
        if (iReSqtkUVgeLLiReSqtkUVg.e().a() == null || iReSqtkUVgeLLiReSqtkUVg.e().K()) {
            return;
        }
        Object object = iReSqtkUVgmTziReSqtkUVg2.getPacket().a();
        if (this.c.contains(object)) {
            this.c.remove(object);
            return;
        }
        while ((iReSqtkUVgNmUiReSqtkUVg2 = this.d.peek()) != null && iReSqtkUVgNmUiReSqtkUVg2.a(this.b.i().longValue())) {
            iReSqtkUVgNmUiReSqtkUVg2 = this.d.poll();
            this.c.add(iReSqtkUVgNmUiReSqtkUVg2.a());
            iReSqtkUVgeLLiReSqtkUVg.e().d().a(new iReSqtkUVghnHiReSqtkUVg(iReSqtkUVgNmUiReSqtkUVg2.a()));
        }
        this.d.add(new iReSqtkUVgNmUiReSqtkUVg(object, null));
        iReSqtkUVgmTziReSqtkUVg2.setCanceled(true);
    }
}

