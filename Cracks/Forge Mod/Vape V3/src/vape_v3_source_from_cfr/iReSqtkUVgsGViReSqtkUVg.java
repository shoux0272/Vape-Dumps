/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.util.Random;
import org.lwjgl.input.Keyboard;

class iReSqtkUVgsGViReSqtkUVg {
    private int b;
    private boolean c;
    private boolean d;
    private boolean e;
    private Random f = new Random();
    private Random g = new Random();
    private Random h = new Random();
    private Random i = new Random();
    private long j;
    private int k;
    private boolean l;
    private int m;
    private boolean n = true;
    private int o;
    private int p;
    private int q;
    private int r;
    private Random s = new Random();
    private iReSqtkUVgjSjiReSqtkUVg t;
    private int u;
    final /* synthetic */ iReSqtkUVgsLdiReSqtkUVg a;

    public iReSqtkUVgsGViReSqtkUVg(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2, int n, boolean bl, boolean bl2) {
        this.a = iReSqtkUVgsLdiReSqtkUVg2;
        this.b = n;
        this.c = bl;
        this.d = bl2;
    }

    public void a() {
        long l;
        boolean bl;
        iReSqtkUVgMiPiReSqtkUVg iReSqtkUVgMiPiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.f();
        boolean bl2 = bl = this.c && iReSqtkUVgsLdiReSqtkUVg.e(this.a).i() != false && iReSqtkUVgMiPiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.y);
        if (iReSqtkUVgeLLiReSqtkUVg.f().a() != null && !bl) {
            this.e = true;
            return;
        }
        iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i().d();
        iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg3 = iReSqtkUVgeLLiReSqtkUVg.i().e();
        if (this.b == 0 && !this.a.x() && !bl) {
            return;
        }
        if (this.b == 1 && !iReSqtkUVgsLdiReSqtkUVg.i(this.a)) {
            return;
        }
        if (this.b == 1) {
            iReSqtkUVgqzriReSqtkUVg2 = iReSqtkUVgqzriReSqtkUVg3;
            if (!iReSqtkUVgVUTiReSqtkUVg.b()) {
                this.e = true;
                Thread.sleep(50L);
                return;
            }
        } else if (!iReSqtkUVgVUTiReSqtkUVg.a()) {
            if (!iReSqtkUVgsLdiReSqtkUVg.g(this.a).i().booleanValue()) {
                iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg3.d(), iReSqtkUVgVUTiReSqtkUVg.b());
            }
            this.e = true;
            return;
        }
        if ((l = this.b()) - 50L <= 0L) {
            l = 51L;
        }
        Thread.sleep(l -= 30L);
        if (this.b == 1 ? !iReSqtkUVgVUTiReSqtkUVg.b() : !iReSqtkUVgVUTiReSqtkUVg.a()) {
            return;
        }
        if (this.e) {
            this.e = false;
            Thread.sleep(50L);
            return;
        }
        if (bl && (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54) && iReSqtkUVgsLdiReSqtkUVg.j(this.a).size() > 0)) {
            iReSqtkUVgsLdiReSqtkUVg.a(this.a, new iReSqtkUVgqvViReSqtkUVg(iReSqtkUVgMiPiReSqtkUVg2.a()));
            return;
        }
        if (iReSqtkUVgMiPiReSqtkUVg2.b()) {
            iReSqtkUVgADCiReSqtkUVg iReSqtkUVgADCiReSqtkUVg2 = iReSqtkUVgADCiReSqtkUVg.d();
            iReSqtkUVgADCiReSqtkUVg2.a(this.b);
            iReSqtkUVgADCiReSqtkUVg2.a(true);
            iReSqtkUVgPEJiReSqtkUVg.b.add(iReSqtkUVgADCiReSqtkUVg2);
            iReSqtkUVgoIbiReSqtkUVg.d().put(this.b, (byte)1);
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), true);
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d());
            if (this.d && iReSqtkUVgsLdiReSqtkUVg.k(this.a).i().booleanValue() && iReSqtkUVgVUTiReSqtkUVg.b()) {
                iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg3.d(), true);
                iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg3.d());
            }
            int n = this.s.nextInt(20) + 8;
            ++this.u;
            if (this.u >= this.s.nextInt(8)) {
                this.u -= this.s.nextInt(8) + 8;
                n = 51;
            }
            Thread.sleep(n);
            if (this.d && iReSqtkUVgeLLiReSqtkUVg.e().bj() && iReSqtkUVgsLdiReSqtkUVg.k(this.a).i().booleanValue()) {
                iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg3.d(), false);
            }
            iReSqtkUVgoIbiReSqtkUVg.d().put(this.b, (byte)0);
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), false);
            iReSqtkUVgADCiReSqtkUVg2 = iReSqtkUVgADCiReSqtkUVg.d();
            iReSqtkUVgADCiReSqtkUVg2.a(this.b);
            iReSqtkUVgADCiReSqtkUVg2.a(false);
            iReSqtkUVgPEJiReSqtkUVg.b.add(iReSqtkUVgADCiReSqtkUVg2);
        }
    }

    long b() {
        int n;
        iReSqtkUVgfXGiReSqtkUVg iReSqtkUVgfXGiReSqtkUVg2 = iReSqtkUVgsLdiReSqtkUVg.l(this.a);
        if (this.b == 1) {
            iReSqtkUVgfXGiReSqtkUVg2 = iReSqtkUVgsLdiReSqtkUVg.m(this.a);
        }
        int n2 = iReSqtkUVgfXGiReSqtkUVg2.i()[0].intValue();
        int n3 = iReSqtkUVgfXGiReSqtkUVg2.i()[1].intValue();
        int n4 = n3 - n2;
        int n5 = n = n4 <= 0 ? n2 : this.f.nextInt(n4) + n2 + 1;
        if (n == 0) {
            n = 1;
        }
        if (!this.l) {
            this.j = 1000 / n;
            if (this.i.nextInt(4) == 1) {
                this.l = true;
                this.m = 1 + this.i.nextInt(5);
            } else if (this.i.nextInt(10) != 1 && this.i.nextInt(10) == 1) {
                this.l = true;
                this.m = 5 + this.i.nextInt(10);
            }
        }
        if (this.l) {
            ++this.k;
            if (this.k >= this.m) {
                this.k = 0;
                this.l = false;
            }
        }
        boolean bl = this.t != null;
        if (this.g.nextInt(48) % (!bl ? 4 : (this.n ? 6 : 10)) == 0 && !this.l) {
            n2 = !bl ? 50 : 25;
            n3 = !bl ? 120 : 70;
            n4 = n3 - n2;
            this.j += (long)(this.h.nextInt(n4) + n2);
        }
        if (this.n) {
            ++this.p;
            if (this.p >= this.q) {
                this.r = 75 + this.f.nextInt(125);
                this.n = false;
                this.p = 0;
            }
            int n6 = this.g.nextInt(5) == 3 ? 50 : 25;
            return this.j + (long)n6;
        }
        ++this.o;
        if (this.o >= this.r) {
            this.n = true;
            this.q = 7 + this.f.nextInt(8);
            this.o = 0;
        }
        this.t = !iReSqtkUVgeLLiReSqtkUVg.l().b() ? iReSqtkUVgeLLiReSqtkUVg.l().d() : null;
        return this.j;
    }
}

