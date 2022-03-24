/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.CopyOnWriteArrayList;

public class iReSqtkUVgelQiReSqtkUVg
extends iReSqtkUVgNeViReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Both");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Pots");
    private iReSqtkUVgzAciReSqtkUVg d = new iReSqtkUVgzAciReSqtkUVg("Soup");
    private iReSqtkUVgZyLiReSqtkUVg e = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Type", this.b, this.b, this.c, this.d);
    private iReSqtkUVgzAciReSqtkUVg f = new iReSqtkUVgzAciReSqtkUVg("Dynamic");
    private iReSqtkUVgzAciReSqtkUVg g = new iReSqtkUVgzAciReSqtkUVg("Single");
    private iReSqtkUVgZyLiReSqtkUVg h = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", "Dynamic - uses only as many items as needed to heal as much as possible without over-healing\nSingle - Always uses one item, regardless of health", this.f, this.f, this.g);
    private iReSqtkUVgkzHiReSqtkUVg i = iReSqtkUVgkzHiReSqtkUVg.a(this, "Scroll delay", "#", "ms", 0.0, 100.0, 200.0);
    private iReSqtkUVgfXGiReSqtkUVg j = iReSqtkUVgfXGiReSqtkUVg.a(this, "Delay", "#", "ms", 0.0, 80.0, 115.0, 200.0);
    private iReSqtkUVgoRmiReSqtkUVg k = iReSqtkUVgoRmiReSqtkUVg.a(this, "Scroll", false);
    private iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a(this, "Random", false);
    private iReSqtkUVgoRmiReSqtkUVg m = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Throw bowls", true, "Throws soup bowls after consuming");
    private int n;
    private CopyOnWriteArrayList<iReSqtkUVgpnviReSqtkUVg> o = new CopyOnWriteArrayList();
    private boolean p;

    public iReSqtkUVgelQiReSqtkUVg() {
        super("Throwpot", "Throws or consumes healing items upon pressing keybind");
        this.k.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.i});
        this.a(this.e, this.h, this.j, this.k, this.i, this.l, this.m);
    }

    @Override
    public void g() {
        if (this.p) {
            this.a(false);
            return;
        }
        iReSqtkUVgbiGiReSqtkUVg iReSqtkUVgbiGiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().aZ();
        this.n = iReSqtkUVgbiGiReSqtkUVg2.d();
        if (this.x()) {
            this.p = true;
            this.a(0L, false);
        } else {
            this.a(false);
        }
    }

    @Override
    public void h() {
        this.o.clear();
    }

    private void a(int n) {
        if (!this.k.i().booleanValue()) {
            iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(n);
            return;
        }
        int n2 = iReSqtkUVgeLLiReSqtkUVg.e().aZ().d();
        while (true) {
            iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(n2);
            try {
                Thread.sleep(this.i.i().longValue());
            }
            catch (InterruptedException interruptedException) {
                // empty catch block
            }
            if (n > n2) {
                ++n2;
                continue;
            }
            if (n >= n2) break;
            --n2;
        }
    }

    @Override
    public void q() {
        if (!this.p) {
            return;
        }
        int n = iReSqtkUVgeLLiReSqtkUVg.i().e().d();
        int n2 = iReSqtkUVgeLLiReSqtkUVg.i().s().d();
        try {
            this.o.sort(new iReSqtkUVgnUViReSqtkUVg(this.n));
            for (iReSqtkUVgpnviReSqtkUVg iReSqtkUVgpnviReSqtkUVg2 : this.o) {
                this.a(iReSqtkUVgpnviReSqtkUVg2.a());
                Thread.sleep(10L);
                iReSqtkUVgqzriReSqtkUVg.a(n, true);
                iReSqtkUVgqzriReSqtkUVg.a(n);
                Thread.sleep((long)this.j.l());
                iReSqtkUVgqzriReSqtkUVg.a(n, false);
                if (!this.m.i().booleanValue() || !iReSqtkUVgpnviReSqtkUVg2.b().e().a(iReSqtkUVgSzRiReSqtkUVg.aM)) continue;
                iReSqtkUVgqzriReSqtkUVg.a(n2, true);
                iReSqtkUVgqzriReSqtkUVg.a(n2);
                Thread.sleep((long)this.j.l());
                iReSqtkUVgqzriReSqtkUVg.a(n2, false);
            }
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
        this.a(this.n);
        this.p = false;
    }

    @Override
    public void a(iReSqtkUVgYAGiReSqtkUVg iReSqtkUVgYAGiReSqtkUVg2) {
        if (!this.p && this.b()) {
            this.a(false);
        }
    }

    private boolean x() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 9; ++i) {
            arrayList.add(i);
        }
        if (this.l.i().booleanValue()) {
            Collections.shuffle(arrayList);
        }
        Object[] arrobject = iReSqtkUVgeLLiReSqtkUVg.e().aZ().e();
        int n = 0;
        for (Integer n2 : arrayList) {
            boolean bl;
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = new iReSqtkUVgyetiReSqtkUVg(arrobject[n2]);
            if (iReSqtkUVgyetiReSqtkUVg2.b() || (iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e()).b()) continue;
            boolean bl2 = this.e.i().equals(this.d) || this.e.i().equals(this.b);
            boolean bl3 = bl = this.e.i().equals(this.c) || this.e.i().equals(this.b);
            if (iReSqtkUVgSzRiReSqtkUVg.aM.isInstance(iReSqtkUVgLUhiReSqtkUVg2.a()) && bl2) {
                if (this.h.i().equals(this.g)) {
                    this.o.add(new iReSqtkUVgpnviReSqtkUVg(n2, iReSqtkUVgyetiReSqtkUVg2));
                    break;
                }
                int n3 = 8;
                if ((double)(n + n3) + Math.floor(iReSqtkUVgeLLiReSqtkUVg.e().aF()) > (double)iReSqtkUVgeLLiReSqtkUVg.e().aR()) continue;
                n += n3;
                this.o.add(new iReSqtkUVgpnviReSqtkUVg(n2, iReSqtkUVgyetiReSqtkUVg2));
            }
            if (!iReSqtkUVgSzRiReSqtkUVg.x.isInstance(iReSqtkUVgLUhiReSqtkUVg2.a()) || !bl) continue;
            if (this.h.i().equals(this.g)) {
                this.o.add(new iReSqtkUVgpnviReSqtkUVg(n2, iReSqtkUVgyetiReSqtkUVg2));
                break;
            }
            iReSqtkUVgSijiReSqtkUVg iReSqtkUVgSijiReSqtkUVg2 = new iReSqtkUVgSijiReSqtkUVg(iReSqtkUVgLUhiReSqtkUVg2.a());
            if (!iReSqtkUVgpjfiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2)) continue;
            int n4 = 0;
            n4 = iReSqtkUVgSijiReSqtkUVg2.b(iReSqtkUVgyetiReSqtkUVg2).get(0).toString().contains(" x ") ? (n4 += 4 * Integer.parseInt(iReSqtkUVgSijiReSqtkUVg2.b(iReSqtkUVgyetiReSqtkUVg2).get(0).toString().split(" x ")[1].split(",")[0])) : (n4 += 4);
            if ((double)(n + n4) + Math.floor(iReSqtkUVgeLLiReSqtkUVg.e().aF()) > (double)iReSqtkUVgeLLiReSqtkUVg.e().aR()) continue;
            n += n4;
            this.o.add(new iReSqtkUVgpnviReSqtkUVg(n2, iReSqtkUVgyetiReSqtkUVg2));
        }
        return !this.o.isEmpty();
    }
}

