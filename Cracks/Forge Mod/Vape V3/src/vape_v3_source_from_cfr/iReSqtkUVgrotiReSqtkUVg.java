/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ConcurrentLinkedQueue;

public class iReSqtkUVgrotiReSqtkUVg
extends iReSqtkUVgNeViReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Both");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Pots");
    private iReSqtkUVgzAciReSqtkUVg d = new iReSqtkUVgzAciReSqtkUVg("Soup");
    private iReSqtkUVgZyLiReSqtkUVg e = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Type", this.b, this.b, this.c, this.d);
    private iReSqtkUVgqvViReSqtkUVg f;
    private iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a(this, "Vertical", false);
    private iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a(this, "Scatter", false);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Hotbar clear", false, "Clears junk from your hotbar to refill.");
    private iReSqtkUVgfXGiReSqtkUVg j = iReSqtkUVgfXGiReSqtkUVg.a(this, "Delay", "#", "ms", 0.0, 75.0, 125.0, 200.0);
    private Queue<iReSqtkUVgsvdiReSqtkUVg> k = new ConcurrentLinkedQueue<iReSqtkUVgsvdiReSqtkUVg>();
    private boolean l;
    private Random m = new Random();

    public iReSqtkUVgrotiReSqtkUVg() {
        super("Refill");
        this.a(this.g, this.h, this.i, this.j, this.e);
    }

    @Override
    public void g() {
        if (this.y().size() == 0) {
            this.a(false);
            return;
        }
        if (!this.x()) {
            this.a(false);
            return;
        }
        int n = iReSqtkUVgeLLiReSqtkUVg.i().f().d();
        iReSqtkUVgqzriReSqtkUVg.a(n, true);
        iReSqtkUVgqzriReSqtkUVg.a(n);
        iReSqtkUVgqzriReSqtkUVg.a(n, false);
        this.a(0L, false);
    }

    private void a(int n, int n2, int n3, int n4) {
        this.k.add(new iReSqtkUVgsvdiReSqtkUVg(n, n2, n3, n4, null));
    }

    @Override
    public void q() {
        try {
            block17: {
                int n = 0;
                do {
                    Thread.sleep(10L);
                    if (++n > 5) break block17;
                } while (!iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.y));
                this.f = new iReSqtkUVgqvViReSqtkUVg(iReSqtkUVgeLLiReSqtkUVg.f().a());
            }
            if (!iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.y)) {
                this.l = true;
                return;
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            ArrayList arrayList2 = new ArrayList();
            int n = 0;
            List<Integer> list = this.y();
            int n2 = 9;
            while (n2 < 36) {
                iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
                iReSqtkUVgIHfiReSqtkUVg iReSqtkUVgIHfiReSqtkUVg2 = this.f.g().d().get(n2);
                Object object = iReSqtkUVgIHfiReSqtkUVg2.d();
                if (!((iReSqtkUVgbBTiReSqtkUVg)object).b() && !(iReSqtkUVgLUhiReSqtkUVg2 = ((iReSqtkUVgyetiReSqtkUVg)object).e()).b() && iReSqtkUVgpjfiReSqtkUVg.a((iReSqtkUVgyetiReSqtkUVg)object, this.e.i().equals(this.d) || this.e.i().equals(this.b))) {
                    arrayList.add(n2);
                }
                if (this.g.i().booleanValue()) {
                    n2 += 9;
                    if (++n != 3) continue;
                    ++n2;
                    n2 -= 27;
                    n = 0;
                    continue;
                }
                ++n2;
            }
            if (arrayList.isEmpty()) {
                this.l = true;
                return;
            }
            if (this.h.i().booleanValue()) {
                Collections.shuffle(arrayList);
            }
            for (n2 = 0; n2 < list.size() && n2 < arrayList.size(); ++n2) {
                arrayList2.add(arrayList.get(n2));
            }
            n2 = 0;
            for (Object object : arrayList2) {
                if (this.f.b() || !iReSqtkUVgeLLiReSqtkUVg.f().equals(this.f)) {
                    this.l = true;
                    return;
                }
                boolean bl = false;
                int n3 = 0;
                if (this.i.i().booleanValue()) {
                    iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg3;
                    n3 = list.get(n2);
                    iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().aZ().b(n3);
                    if (iReSqtkUVgyetiReSqtkUVg2.c() && (iReSqtkUVgLUhiReSqtkUVg3 = iReSqtkUVgyetiReSqtkUVg2.e()).c()) {
                        bl = true;
                    }
                }
                if (bl) {
                    this.a(this.f.g().e(), (Integer)object, 0, 0);
                    Thread.sleep((long)this.j.l());
                    this.a(this.f.g().e(), 36 + n3, 0, 0);
                    Thread.sleep((long)this.j.l());
                    this.a(this.f.g().e(), (Integer)object, 0, 0);
                    Thread.sleep((long)this.j.l());
                } else {
                    Thread.sleep((long)this.j.l() + (long)this.m.nextInt(10));
                    this.a(this.f.g().e(), (Integer)object, 0, 1);
                }
                ++n2;
            }
            while (!this.k.isEmpty()) {
                Thread.sleep(5L);
            }
            this.l = true;
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.l) {
            if (!iReSqtkUVgeLLiReSqtkUVg.f().b()) {
                iReSqtkUVgeLLiReSqtkUVg.e().aX();
            }
            this.l = false;
            this.a(false);
        } else {
            while (!this.k.isEmpty()) {
                iReSqtkUVgsvdiReSqtkUVg iReSqtkUVgsvdiReSqtkUVg2 = this.k.poll();
                iReSqtkUVgsvdiReSqtkUVg2.a();
            }
        }
    }

    private boolean x() {
        boolean bl = false;
        for (int i = 9; i < 36; ++i) {
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().aZ().b(i);
            if (iReSqtkUVgyetiReSqtkUVg2.b() || (iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e()).b() || !iReSqtkUVgpjfiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2, this.e.i().equals(this.d) || this.e.i().equals(this.b))) continue;
            bl = true;
        }
        return bl;
    }

    private List<Integer> y() {
        ArrayList<iReSqtkUVgyetiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgyetiReSqtkUVg>();
        ArrayList<Integer> arrayList2 = new ArrayList<Integer>();
        Object[] arrobject = iReSqtkUVgeLLiReSqtkUVg.e().aZ().e();
        for (int i = 0; i < 9; ++i) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = new iReSqtkUVgyetiReSqtkUVg(arrobject[i]);
            if (iReSqtkUVgyetiReSqtkUVg2.b()) {
                arrayList2.add(i);
                continue;
            }
            if (this.i.i().booleanValue()) {
                if (!this.a(iReSqtkUVgyetiReSqtkUVg2.e(), iReSqtkUVgyetiReSqtkUVg2, arrayList)) continue;
                arrayList2.add(i);
                continue;
            }
            if (!iReSqtkUVgyetiReSqtkUVg2.toString().contains("tile.air")) continue;
            arrayList2.add(i);
        }
        return arrayList2;
    }

    private boolean a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2, List<iReSqtkUVgyetiReSqtkUVg> list) {
        for (iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg3 : list) {
            if (iReSqtkUVgyetiReSqtkUVg2.equals(iReSqtkUVgyetiReSqtkUVg3) || !iReSqtkUVgyetiReSqtkUVg2.e().a().getClass().isInstance(iReSqtkUVgyetiReSqtkUVg3.e().a())) continue;
            return true;
        }
        return false;
    }

    private boolean a(iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2, iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2, List<iReSqtkUVgyetiReSqtkUVg> list) {
        if (iReSqtkUVgpjfiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2, this.e.i().equals(this.d) || this.e.i().equals(this.b))) {
            return false;
        }
        if (iReSqtkUVgSzRiReSqtkUVg.H.isInstance(iReSqtkUVgLUhiReSqtkUVg2.a())) {
            if (!this.a(iReSqtkUVgyetiReSqtkUVg2, list)) {
                list.add(iReSqtkUVgyetiReSqtkUVg2);
                return false;
            }
            return true;
        }
        if (iReSqtkUVgSzRiReSqtkUVg.I.isInstance(iReSqtkUVgLUhiReSqtkUVg2.a())) {
            if (!this.a(iReSqtkUVgyetiReSqtkUVg2, list)) {
                list.add(iReSqtkUVgyetiReSqtkUVg2);
                return false;
            }
            return true;
        }
        if (iReSqtkUVgSzRiReSqtkUVg.J.isInstance(iReSqtkUVgLUhiReSqtkUVg2.a())) {
            if (!this.a(iReSqtkUVgyetiReSqtkUVg2, list)) {
                list.add(iReSqtkUVgyetiReSqtkUVg2);
                return false;
            }
            return true;
        }
        return true;
    }
}

