/*
 * Decompiled with CFR 0.150.
 */
import a.a;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;

public class iReSqtkUVgXMNiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private final iReSqtkUVgfXGiReSqtkUVg s = iReSqtkUVgfXGiReSqtkUVg.a(this, "Attacks per Second", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    public final iReSqtkUVgkzHiReSqtkUVg b = iReSqtkUVgkzHiReSqtkUVg.a(this, "Swing range", "#.#", "", 0.0, 4.0, 6.0);
    public final iReSqtkUVgkzHiReSqtkUVg c = iReSqtkUVgkzHiReSqtkUVg.a(this, "Attack range", "#.#", "", 0.0, 3.5, 6.0);
    private final iReSqtkUVgkzHiReSqtkUVg t = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Max angle", "#", "", 1.0, 90.0, 360.0, 5.0);
    private final iReSqtkUVgkzHiReSqtkUVg u = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Max targets", "#", "", 1.0, 1.0, 6.0, 1.0);
    public final iReSqtkUVgkzHiReSqtkUVg d = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Switch Delay", "#", "", 50.0, 400.0, 1000.0, 50.0);
    public final iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a(this, "Require mouse down", false);
    public final iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a(this, "Attack invisibles", false);
    public final iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a(this, "Attack through walls", false);
    public final iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a(this, "Show target", false);
    public final iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Limit to items", false, "Killaura functions only while holding selected items");
    public final iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "AutoBlock", false, "Automatically blocks").b(true);
    public final iReSqtkUVgoRmiReSqtkUVg k = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "GUI Check", true, "Does not attack when inside of a GUI.");
    public final iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Legit Aura", false, "Use Legit Aura instead of Blatant Aura when blatant is enabled.").b(true);
    public final iReSqtkUVgoRmiReSqtkUVg m = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "No Swing", false, "Prevents you from swinging server side.").b(true);
    public final iReSqtkUVgoRmiReSqtkUVg n = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Perfect Swing", false, "Attacks perfectly on 1.9+ combat servers.\n(1.12.2 Only)");
    private iReSqtkUVgncyiReSqtkUVg v = new iReSqtkUVgncyiReSqtkUVg("Switch", new iReSqtkUVgEQPiReSqtkUVg(this, "Switch"));
    private iReSqtkUVgZyLiReSqtkUVg w = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Blatant Mode", this.v, this.v);
    private iReSqtkUVgeMGiReSqtkUVg x = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "killaura-alloweditems", "Allowed Items", iReSqtkUVgeMGiReSqtkUVg.a, Collections.emptyList());
    public iReSqtkUVgPzKiReSqtkUVg o = new iReSqtkUVgPzKiReSqtkUVg();
    public iReSqtkUVgPzKiReSqtkUVg p = new iReSqtkUVgPzKiReSqtkUVg();
    public List<iReSqtkUVgVnKiReSqtkUVg> q = new CopyOnWriteArrayList<iReSqtkUVgVnKiReSqtkUVg>();
    public int r;
    private Random y = new Random();
    private Random z = new Random();
    private Random A = new Random();
    private Random B = new Random();
    private Color C = new Color(255, 0, 0, 100);
    private Color D = new Color(255, 112, 112, 100);
    private long E;
    private int F;
    private boolean G;
    private int H;

    public iReSqtkUVgXMNiReSqtkUVg() {
        super("Killaura", -2420426, iReSqtkUVgqTOiReSqtkUVg.f, "Attack players around you\nwithout aiming at them.");
        ((iReSqtkUVgJCoiReSqtkUVg)this.w.c()).a(new iReSqtkUVgbiriReSqtkUVg(this));
        this.a(this.s, this.d, this.b, this.c, this.t, this.u, this.w);
        if (iReSqtkUVgauSiReSqtkUVg.d() <= 15) {
            this.a(this.j);
        } else {
            this.a(this.n);
        }
        this.a(this.f, this.g, this.e, this.k, this.h, this.l, this.m, this.i.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.x}), this.x);
        ((iReSqtkUVgbqSiReSqtkUVg)this.b.c()).a(new iReSqtkUVgrBuiReSqtkUVg(this));
    }

    @Override
    public void g() {
        super.g();
        this.q.clear();
    }

    @Override
    public void h() {
        super.h();
        this.q.clear();
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (!this.l.j().booleanValue() && a.a.ib()) {
            return;
        }
        if (this.k.i().booleanValue() && iReSqtkUVgeLLiReSqtkUVg.f().c()) {
            return;
        }
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        if (!this.p.a(this.x())) {
            return;
        }
        if (this.e.i().booleanValue() && !iReSqtkUVgVUTiReSqtkUVg.a()) {
            this.q.clear();
            return;
        }
        this.y();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 : this.q) {
            double d2;
            if (!this.a(iReSqtkUVgVnKiReSqtkUVg2) || !((d2 = (double)iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2)) <= this.b.i())) continue;
            iReSqtkUVgtlXiReSqtkUVg2.aK();
            if (!(d2 <= this.c.i())) continue;
            iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2);
        }
        this.p.b();
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        this.a(this.w.i().N());
        if (this.h.i().booleanValue() && !this.q.isEmpty()) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            for (iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 : this.q) {
                if ((double)iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2) <= this.c.i() && (!a.a.ib() || this.q.get(this.r).equals(iReSqtkUVgVnKiReSqtkUVg2))) {
                    iReSqtkUVgoCkiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2, 0.0, null, this.C, iReSqtkUVgDVPiReSqtkUVg2.a());
                    continue;
                }
                iReSqtkUVgoCkiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2, 0.0, null, this.D, iReSqtkUVgDVPiReSqtkUVg2.a());
            }
        }
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        ((iReSqtkUVgJZmiReSqtkUVg)((iReSqtkUVgncyiReSqtkUVg)this.w.i()).a()).a(iReSqtkUVgTXviReSqtkUVg2);
    }

    @Override
    public void a(iReSqtkUVgmTziReSqtkUVg iReSqtkUVgmTziReSqtkUVg2) {
        ((iReSqtkUVgJZmiReSqtkUVg)((iReSqtkUVgncyiReSqtkUVg)this.w.i()).a()).a(iReSqtkUVgmTziReSqtkUVg2);
    }

    public long x() {
        int n;
        int n2;
        int n3 = this.s.i()[0].intValue();
        int n4 = n3 - (n2 = this.s.i()[1].intValue());
        int n5 = n = n4 <= 0 ? n2 : this.y.nextInt(n4) + n2 + 1;
        if (n == 0) {
            n = 1;
        }
        if (!this.G) {
            this.E = 1000 / n;
            if (this.B.nextInt(4) == 1) {
                this.G = true;
                this.H = 1 + this.B.nextInt(5);
            } else if (this.B.nextInt(10) != 1 && this.B.nextInt(10) == 1) {
                this.G = true;
                this.H = 5 + this.B.nextInt(10);
            }
        }
        if (this.G) {
            ++this.F;
            if (this.F >= this.H) {
                this.F = 0;
                this.G = false;
            }
        }
        boolean bl = true;
        if (this.z.nextInt(48) % (!bl ? 4 : 10) == 0 && !this.G) {
            n2 = !bl ? 50 : 25;
            n3 = !bl ? 120 : 70;
            n4 = n3 - n2;
            this.E += (long)(this.A.nextInt(n4) + n2);
        }
        return this.E;
    }

    public void y() {
        this.q.clear();
        ArrayList arrayList = new ArrayList(iReSqtkUVgeLLiReSqtkUVg.g().e());
        for (Object e : arrayList) {
            iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2;
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2 = new iReSqtkUVgjSjiReSqtkUVg(e);
            if (iReSqtkUVgVUTiReSqtkUVg.a && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bZ) || !iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.n) || !this.a(iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(e))) continue;
            this.q.add(iReSqtkUVgVnKiReSqtkUVg2);
        }
        this.q.sort(new iReSqtkUVgnIRiReSqtkUVg(this, null));
        this.q.sort(new iReSqtkUVgQQxiReSqtkUVg(this, null));
        ArrayList<iReSqtkUVgVnKiReSqtkUVg> arrayList2 = new ArrayList<iReSqtkUVgVnKiReSqtkUVg>(this.q);
        this.q.clear();
        for (int i = 0; i < this.u.i().intValue() && i < arrayList2.size(); ++i) {
            this.q.add((iReSqtkUVgVnKiReSqtkUVg)arrayList2.get(i));
        }
    }

    private boolean c(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        if (this.i.i().booleanValue()) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().bd();
            if (iReSqtkUVgyetiReSqtkUVg2.b()) {
                return false;
            }
            iReSqtkUVgLUhiReSqtkUVg iReSqtkUVgLUhiReSqtkUVg2 = iReSqtkUVgyetiReSqtkUVg2.e();
            if (iReSqtkUVgLUhiReSqtkUVg2.b()) {
                return false;
            }
            return this.x.a(iReSqtkUVgyetiReSqtkUVg2, true) && iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgVnKiReSqtkUVg2, this.f.i() == false);
        }
        return iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgVnKiReSqtkUVg2, this.f.i() == false);
    }

    public boolean a(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        if (iReSqtkUVgVnKiReSqtkUVg2.b()) {
            return false;
        }
        if (iReSqtkUVgVnKiReSqtkUVg2.equals(iReSqtkUVgeLLiReSqtkUVg.e())) {
            return false;
        }
        if (!this.c(iReSqtkUVgVnKiReSqtkUVg2)) {
            return false;
        }
        if (iReSqtkUVgVnKiReSqtkUVg2.aF() <= 0.0f || iReSqtkUVgVnKiReSqtkUVg2.K()) {
            return false;
        }
        if ((double)iReSqtkUVgeLLiReSqtkUVg.e().a(iReSqtkUVgVnKiReSqtkUVg2) >= this.b.i()) {
            return false;
        }
        if (iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgeLLiReSqtkUVg.e(), iReSqtkUVgVnKiReSqtkUVg2) > this.t.i().intValue() / 2) {
            return false;
        }
        iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.j().c(iReSqtkUVgVnKiReSqtkUVg2.x());
        if (iReSqtkUVgMWviReSqtkUVg2 != null && !iReSqtkUVgMWviReSqtkUVg2.d()) {
            return false;
        }
        return this.g.i() != false || iReSqtkUVgeLLiReSqtkUVg.e().b(iReSqtkUVgVnKiReSqtkUVg2);
    }

    private float[] a(double d2, double d3, double d4) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d5 = d2 - iReSqtkUVgtlXiReSqtkUVg2.z();
        double d6 = d3 - iReSqtkUVgtlXiReSqtkUVg2.B();
        double d7 = d4 - iReSqtkUVgtlXiReSqtkUVg2.A() - 1.2;
        double d8 = iReSqtkUVgKexiReSqtkUVg.a(d5 * d5 + d6 * d6);
        float f = (float)(Math.atan2(d6, d5) * 180.0 / Math.PI) - 90.0f;
        float f2 = (float)(-(Math.atan2(d7, d8) * 180.0 / Math.PI));
        return new float[]{f, f2};
    }

    public float[] b(iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2) {
        double d2 = iReSqtkUVgVnKiReSqtkUVg2.z();
        double d3 = iReSqtkUVgVnKiReSqtkUVg2.B();
        double d4 = iReSqtkUVgVnKiReSqtkUVg2.A() + (double)(iReSqtkUVgVnKiReSqtkUVg2.aa() / 2.0f);
        return this.a(d2, d3, d4);
    }

    public float a(double d2, double d3, float f) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d4 = d2 - iReSqtkUVgtlXiReSqtkUVg2.z();
        double d5 = d3 - iReSqtkUVgtlXiReSqtkUVg2.B();
        double d6 = d5 < 0.0 && d4 < 0.0 ? 90.0 + Math.toDegrees(Math.atan(d5 / d4)) : (d5 < 0.0 && d4 > 0.0 ? -90.0 + Math.toDegrees(Math.atan(d5 / d4)) : Math.toDegrees(-Math.atan(d4 / d5)));
        return iReSqtkUVgKexiReSqtkUVg.g(-(f - (float)d6));
    }

    static /* synthetic */ iReSqtkUVgZyLiReSqtkUVg a(iReSqtkUVgXMNiReSqtkUVg iReSqtkUVgXMNiReSqtkUVg2) {
        return iReSqtkUVgXMNiReSqtkUVg2.w;
    }
}

