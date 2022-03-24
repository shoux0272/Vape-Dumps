/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class iReSqtkUVgOCGiReSqtkUVg
extends iReSqtkUVgNeViReSqtkUVg {
    private HashMap<iReSqtkUVgzAciReSqtkUVg, iReSqtkUVgZAsiReSqtkUVg> b = new HashMap();
    private iReSqtkUVgZyLiReSqtkUVg c;
    private iReSqtkUVgZyLiReSqtkUVg d;
    private iReSqtkUVgkzHiReSqtkUVg e = iReSqtkUVgkzHiReSqtkUVg.a(this, "Delay", "#", "", 0.0, 100.0, 200.0);
    private boolean f;
    private boolean g;
    private boolean h;
    private iReSqtkUVgZAsiReSqtkUVg i;
    private iReSqtkUVgPzKiReSqtkUVg j = new iReSqtkUVgPzKiReSqtkUVg();
    private int k;
    private int l;
    private Map<Integer, Integer> m = new HashMap<Integer, Integer>();

    public iReSqtkUVgOCGiReSqtkUVg() {
        super("ArmorSwitch", "Switches between armor sets");
        iReSqtkUVgzAciReSqtkUVg iReSqtkUVgzAciReSqtkUVg2 = new iReSqtkUVgzAciReSqtkUVg("Diamond");
        iReSqtkUVgzAciReSqtkUVg iReSqtkUVgzAciReSqtkUVg3 = new iReSqtkUVgzAciReSqtkUVg("Gold");
        iReSqtkUVgzAciReSqtkUVg iReSqtkUVgzAciReSqtkUVg4 = new iReSqtkUVgzAciReSqtkUVg("Iron");
        iReSqtkUVgzAciReSqtkUVg iReSqtkUVgzAciReSqtkUVg5 = new iReSqtkUVgzAciReSqtkUVg("Leather");
        iReSqtkUVgzAciReSqtkUVg iReSqtkUVgzAciReSqtkUVg6 = new iReSqtkUVgzAciReSqtkUVg("Chain");
        this.b.put(iReSqtkUVgzAciReSqtkUVg2, iReSqtkUVgZAsiReSqtkUVg.h());
        this.b.put(iReSqtkUVgzAciReSqtkUVg3, iReSqtkUVgZAsiReSqtkUVg.g());
        this.b.put(iReSqtkUVgzAciReSqtkUVg4, iReSqtkUVgZAsiReSqtkUVg.f());
        this.b.put(iReSqtkUVgzAciReSqtkUVg5, iReSqtkUVgZAsiReSqtkUVg.d());
        this.b.put(iReSqtkUVgzAciReSqtkUVg6, iReSqtkUVgZAsiReSqtkUVg.e());
        this.c = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Set 1", iReSqtkUVgzAciReSqtkUVg2, this.b.keySet().toArray(new iReSqtkUVgzAciReSqtkUVg[this.b.size()]));
        this.d = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Set 2", iReSqtkUVgzAciReSqtkUVg3, this.b.keySet().toArray(new iReSqtkUVgzAciReSqtkUVg[this.b.size()]));
        this.a(this.c, this.d, this.e);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.f) {
            this.a(false);
            return;
        }
        if (!iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.bm)) {
            int n = iReSqtkUVgeLLiReSqtkUVg.i().f().d();
            iReSqtkUVgqzriReSqtkUVg.a(n, true);
            iReSqtkUVgqzriReSqtkUVg.a(n);
            iReSqtkUVgqzriReSqtkUVg.a(n, false);
            this.g = true;
            return;
        }
        if (this.h && this.j.a(this.e.i().longValue())) {
            this.j.b();
            int n = this.m.get(this.k);
            this.a(this.k, n);
            if (this.k > 8) {
                this.f = true;
            }
            return;
        }
        boolean bl = this.x();
        if (this.g && bl && !this.h) {
            boolean bl2 = this.i.equals(this.b.get(this.c.i()));
            if (this.a(bl2 ? this.b.get(this.d.i()) : this.b.get(this.c.i()))) {
                this.h = true;
            } else {
                this.a(false);
            }
        }
        if (!bl) {
            this.a(false);
        }
    }

    private void a(int n, int n2) {
        int n3 = n2;
        if (this.l == 1) {
            n3 = n;
        }
        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgeLLiReSqtkUVg.e().ba().e(), n3, 1, 0, iReSqtkUVgeLLiReSqtkUVg.e());
        ++this.l;
        if (this.l >= 3) {
            this.l = 0;
            ++this.k;
        }
    }

    private boolean x() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgMECiReSqtkUVg iReSqtkUVgMECiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba();
        List<iReSqtkUVgIHfiReSqtkUVg> list = iReSqtkUVgMECiReSqtkUVg2.d();
        for (int i = 5; i < 9; ++i) {
            iReSqtkUVgIHfiReSqtkUVg iReSqtkUVgIHfiReSqtkUVg2 = list.get(i);
            if (!iReSqtkUVgIHfiReSqtkUVg2.f() || !iReSqtkUVgIHfiReSqtkUVg2.d().e().a(iReSqtkUVgSzRiReSqtkUVg.aO)) continue;
            iReSqtkUVgWFfiReSqtkUVg iReSqtkUVgWFfiReSqtkUVg2 = new iReSqtkUVgWFfiReSqtkUVg(iReSqtkUVgIHfiReSqtkUVg2.d().e());
            this.i = iReSqtkUVgWFfiReSqtkUVg2.f();
            return true;
        }
        return false;
    }

    private boolean a(iReSqtkUVgZAsiReSqtkUVg iReSqtkUVgZAsiReSqtkUVg2) {
        int n = 0;
        int n2 = 0;
        int n3 = 0;
        int n4 = 0;
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgMECiReSqtkUVg iReSqtkUVgMECiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba();
        List<iReSqtkUVgIHfiReSqtkUVg> list = iReSqtkUVgMECiReSqtkUVg2.d();
        block6: for (int i = 9; i < 45; ++i) {
            iReSqtkUVgWFfiReSqtkUVg iReSqtkUVgWFfiReSqtkUVg2;
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2;
            iReSqtkUVgIHfiReSqtkUVg iReSqtkUVgIHfiReSqtkUVg2 = list.get(i);
            if (!iReSqtkUVgIHfiReSqtkUVg2.f() || !(iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgIHfiReSqtkUVg2.d().e()).a(iReSqtkUVgSzRiReSqtkUVg.aO) || !(iReSqtkUVgWFfiReSqtkUVg2 = new iReSqtkUVgWFfiReSqtkUVg(iReSqtkUVgLUhiReSqtkUVg2)).f().equals(iReSqtkUVgZAsiReSqtkUVg2)) continue;
            switch (iReSqtkUVgWFfiReSqtkUVg2.e()) {
                case 0: {
                    n = i;
                    continue block6;
                }
                case 1: {
                    n2 = i;
                    continue block6;
                }
                case 2: {
                    n3 = i;
                    continue block6;
                }
                case 3: {
                    n4 = i;
                }
            }
        }
        this.m.put(5, n);
        this.m.put(6, n2);
        this.m.put(7, n3);
        this.m.put(8, n4);
        return n != 0 && n2 != 0 && n3 != 0 && n4 != 0;
    }

    @Override
    public void g() {
        this.k = 5;
        this.l = 0;
        this.h = false;
        this.f = false;
        this.g = false;
    }

    @Override
    public void h() {
        if (iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.bm)) {
            iReSqtkUVgeLLiReSqtkUVg.e().aX();
        }
    }
}

