/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class iReSqtkUVgqMeiReSqtkUVg
extends iReSqtkUVgNeViReSqtkUVg {
    private CopyOnWriteArrayList<iReSqtkUVgpnviReSqtkUVg> b = new CopyOnWriteArrayList();
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("All");
    private iReSqtkUVgzAciReSqtkUVg d = new iReSqtkUVgzAciReSqtkUVg("One of each");
    private iReSqtkUVgzAciReSqtkUVg e = new iReSqtkUVgzAciReSqtkUVg("First");
    private iReSqtkUVgZyLiReSqtkUVg f = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", "All - Throws all debuffs on hotbar\nOne of each - Throws one of each debuff\nFirst - Throws only first debuff on hotbar", this.d, this.c, this.d, this.e);
    private iReSqtkUVgoRmiReSqtkUVg[] g = new iReSqtkUVgoRmiReSqtkUVg[]{iReSqtkUVgoRmiReSqtkUVg.a(this, "Harming", true), iReSqtkUVgoRmiReSqtkUVg.a(this, "Weakness", true), iReSqtkUVgoRmiReSqtkUVg.a(this, "Poison", true), iReSqtkUVgoRmiReSqtkUVg.a(this, "Slowness", true)};
    private iReSqtkUVgfXGiReSqtkUVg h = iReSqtkUVgfXGiReSqtkUVg.a(this, "Delay", "#.#", "", 0.0, 70.0, 120.0, 200.0);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a(this, "Scroll", false);
    private iReSqtkUVgkzHiReSqtkUVg j = iReSqtkUVgkzHiReSqtkUVg.a(this, "Scroll delay", "#", "ms", 0.0, 100.0, 200.0);
    private boolean k;

    public iReSqtkUVgqMeiReSqtkUVg() {
        super("ThrowDebuff");
        this.a(this.f);
        for (iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2 : this.g) {
            this.a(iReSqtkUVgoRmiReSqtkUVg2);
        }
        this.a(this.h);
        this.i.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.j});
        this.a(this.i);
        this.a(this.j);
    }

    private void a(int n) {
        if (!this.i.i().booleanValue()) {
            iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(n);
            return;
        }
        int n2 = iReSqtkUVgeLLiReSqtkUVg.e().aZ().d();
        while (true) {
            iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(n2);
            try {
                Thread.sleep(this.j.i().longValue());
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

    private boolean x() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int i = 0; i < 9; ++i) {
            arrayList.add(i);
        }
        Object[] arrobject = iReSqtkUVgeLLiReSqtkUVg.e().aZ().e();
        ArrayList<iReSqtkUVgoRmiReSqtkUVg> arrayList2 = new ArrayList<iReSqtkUVgoRmiReSqtkUVg>();
        block1: for (Integer n : arrayList) {
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = new iReSqtkUVgyetiReSqtkUVg(arrobject[n]);
            if (iReSqtkUVgyetiReSqtkUVg2.b() || (iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e()).b() || !iReSqtkUVgSzRiReSqtkUVg.x.isInstance(iReSqtkUVgLUhiReSqtkUVg2.a())) continue;
            iReSqtkUVgSijiReSqtkUVg iReSqtkUVgSijiReSqtkUVg2 = new iReSqtkUVgSijiReSqtkUVg(iReSqtkUVgLUhiReSqtkUVg2.a());
            for (iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2 : this.g) {
                if (this.f.i().equals(this.d) && arrayList2.contains(iReSqtkUVgoRmiReSqtkUVg2)) continue;
                String string = iReSqtkUVgSijiReSqtkUVg2.d(iReSqtkUVgyetiReSqtkUVg2).toLowerCase();
                String string2 = iReSqtkUVgoRmiReSqtkUVg2.N().toLowerCase();
                if (!iReSqtkUVgoRmiReSqtkUVg2.i().booleanValue() || !string.contains(string2)) continue;
                this.b.add(new iReSqtkUVgpnviReSqtkUVg(n, iReSqtkUVgyetiReSqtkUVg2));
                arrayList2.add(iReSqtkUVgoRmiReSqtkUVg2);
                if (!this.f.i().equals(this.e)) continue block1;
                break block1;
            }
        }
        return !this.b.isEmpty();
    }

    @Override
    public void q() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgbiGiReSqtkUVg iReSqtkUVgbiGiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.aZ();
        int n = iReSqtkUVgbiGiReSqtkUVg2.d();
        for (iReSqtkUVgpnviReSqtkUVg iReSqtkUVgpnviReSqtkUVg2 : this.b) {
            try {
                this.a(iReSqtkUVgpnviReSqtkUVg2.a());
                int n2 = iReSqtkUVgeLLiReSqtkUVg.i().e().d();
                iReSqtkUVgqzriReSqtkUVg.a(n2, true);
                iReSqtkUVgqzriReSqtkUVg.a(n2);
                Thread.sleep(51L);
                iReSqtkUVgqzriReSqtkUVg.a(n2, false);
                Thread.sleep((long)this.h.l());
            }
            catch (Exception exception) {}
        }
        this.a(n);
        this.k = false;
    }

    @Override
    public void a(iReSqtkUVgYAGiReSqtkUVg iReSqtkUVgYAGiReSqtkUVg2) {
        if (!this.k && this.b()) {
            this.a(false);
        }
    }

    @Override
    public void g() {
        if (this.x()) {
            this.k = true;
            this.a(0L, false);
        } else {
            this.a(false);
        }
    }

    @Override
    public void h() {
        this.b.clear();
    }
}

