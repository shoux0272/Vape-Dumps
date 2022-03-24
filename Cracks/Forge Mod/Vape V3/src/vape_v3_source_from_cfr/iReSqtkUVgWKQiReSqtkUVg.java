/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgWKQiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private final int[] b = new int[]{313, 309, 317, 305, 301};
    private final int[] c = new int[]{311, 307, 315, 303, 299};
    private final int[] d = new int[]{310, 306, 314, 302, 298};
    private final int[] e = new int[]{312, 308, 316, 304, 300};
    private final iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Open Inventory", true, "Opens your inventory when you can equip armor.");
    private final iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Inventory Only", false, "Only equip armor when in inventory.");
    private final iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Check Durability", true, "Always puts on the armor with the highest durability.");
    private final iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Drop Equipped", false, "Drops worse equipped armor for better armor when active.");
    private final iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Combat check", false, "Won't equip armor while in combat");
    private final iReSqtkUVgfXGiReSqtkUVg k = iReSqtkUVgfXGiReSqtkUVg.a(this, "Delay", "#", "", 1.0, 100.0, 120.0, 200.0);
    private boolean l;
    private boolean m;
    private int n = 4;
    private iReSqtkUVgPzKiReSqtkUVg o = new iReSqtkUVgPzKiReSqtkUVg();
    private iReSqtkUVgqXViReSqtkUVg p = new iReSqtkUVgqXViReSqtkUVg(20);

    public iReSqtkUVgWKQiReSqtkUVg() {
        super("AutoArmor", -12399628, iReSqtkUVgqTOiReSqtkUVg.d, "Automatically equips armor when needed.");
        this.a(this.f, this.g, this.h, this.i, this.j, this.k);
    }

    @Override
    public void h() {
        super.h();
        this.m = false;
        this.l = false;
        this.n = 4;
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (!this.a(iReSqtkUVgtlXiReSqtkUVg2)) {
            if (this.m) {
                iReSqtkUVgtlXiReSqtkUVg2.aX();
                this.l = false;
                this.m = false;
            }
            if (this.l) {
                this.m = true;
            }
            return;
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.bg().d() || !iReSqtkUVgtlXiReSqtkUVg2.bh().b() && iReSqtkUVgtlXiReSqtkUVg2.bh().e() != 0) {
            return;
        }
        if (this.j.i().booleanValue()) {
            this.p.a(iReSqtkUVgtlXiReSqtkUVg2);
            if (this.p.a()) {
                return;
            }
        }
        if (this.o.a((long)this.k.l())) {
            int n;
            ++this.n;
            if (this.n > 8) {
                this.n = 4;
            }
            if ((n = this.a(this.n, (boolean)this.h.i())) != -1) {
                if (this.f.i().booleanValue() && !iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.bm)) {
                    int n2 = iReSqtkUVgeLLiReSqtkUVg.i().f().d();
                    iReSqtkUVgqzriReSqtkUVg.a(n2, true);
                    iReSqtkUVgqzriReSqtkUVg.a(n2);
                    iReSqtkUVgqzriReSqtkUVg.a(n2, false);
                    this.l = true;
                    return;
                }
                if (this.g.i().booleanValue() && !iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.bm)) {
                    return;
                }
                if (iReSqtkUVgtlXiReSqtkUVg2.ba().a(n).d().c()) {
                    if (this.i.i().booleanValue()) {
                        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2.ba().e(), this.n, 0, 0, iReSqtkUVgtlXiReSqtkUVg2);
                        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2.ba().e(), -999, 0, 0, iReSqtkUVgtlXiReSqtkUVg2);
                    } else {
                        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2.ba().e(), this.n, 0, 1, iReSqtkUVgtlXiReSqtkUVg2);
                    }
                }
                iReSqtkUVgeLLiReSqtkUVg.k().a(0, n, 0, 1, iReSqtkUVgtlXiReSqtkUVg2);
                this.m = true;
            }
            this.o.b();
        }
    }

    private boolean a(iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2) {
        for (int i = 5; i <= 8; ++i) {
            for (int k = 9; k < 45; ++k) {
                iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2;
                if (!iReSqtkUVgDfKiReSqtkUVg2.ba().a(k).d().c() || this.a(iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgDfKiReSqtkUVg2.ba().a(k).d()) == -1 || this.a(iReSqtkUVgyetiReSqtkUVg2) != i || this.a(i, false) == -1) continue;
                return true;
            }
        }
        return false;
    }

    private int a(int n) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        return iReSqtkUVgtlXiReSqtkUVg2.ba().a(n).d().c() ? iReSqtkUVgtlXiReSqtkUVg2.ba().a(n).d().g() : 999;
    }

    private int a(int n, boolean bl) {
        int n2 = -1;
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(n).d();
        double d2 = 0.0;
        double d3 = 999.0;
        if (iReSqtkUVgyetiReSqtkUVg2.c()) {
            d2 = this.b(iReSqtkUVgyetiReSqtkUVg2);
            d3 = this.a(n);
        }
        double d4 = d2;
        double d5 = d3;
        for (int i = 9; i < 45; ++i) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg3;
            if (!iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d().c() || this.a(iReSqtkUVgyetiReSqtkUVg3 = iReSqtkUVgtlXiReSqtkUVg2.ba().a(i).d()) == -1 || this.a(iReSqtkUVgyetiReSqtkUVg3) != n) continue;
            double d6 = this.b(iReSqtkUVgyetiReSqtkUVg3);
            double d7 = this.a(i);
            if (d6 > d4) {
                d4 = d6;
                n2 = i;
                d5 = d7;
                continue;
            }
            if (!bl || d6 != d4 || !(d7 < d5)) continue;
            d5 = d7;
            n2 = i;
        }
        return n2;
    }

    private int a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        for (int n : this.b) {
            if (iReSqtkUVgyetiReSqtkUVg2.e().e() != n) continue;
            return 8;
        }
        for (int n : this.e) {
            if (iReSqtkUVgyetiReSqtkUVg2.e().e() != n) continue;
            return 7;
        }
        for (int n : this.c) {
            if (iReSqtkUVgyetiReSqtkUVg2.e().e() != n) continue;
            return 6;
        }
        for (int n : this.d) {
            if (iReSqtkUVgyetiReSqtkUVg2.e().e() != n) continue;
            return 5;
        }
        return -1;
    }

    private double b(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        if (iReSqtkUVgyetiReSqtkUVg2.c() && iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.aO)) {
            iReSqtkUVgWFfiReSqtkUVg iReSqtkUVgWFfiReSqtkUVg2 = new iReSqtkUVgWFfiReSqtkUVg(iReSqtkUVgyetiReSqtkUVg2.e());
            int n = iReSqtkUVgWFfiReSqtkUVg2.d();
            return (double)n + (double)((100 - n * 4) * iReSqtkUVgBKdiReSqtkUVg.a(0, iReSqtkUVgyetiReSqtkUVg2) * 4) * 0.0075;
        }
        return 0.0;
    }
}

