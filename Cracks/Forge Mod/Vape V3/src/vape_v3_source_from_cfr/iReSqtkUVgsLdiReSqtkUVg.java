/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class iReSqtkUVgsLdiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private final iReSqtkUVgfXGiReSqtkUVg b = iReSqtkUVgfXGiReSqtkUVg.a(this, "CPS", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    private int c;
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Inventory Fill", false, "AutoClicker functions while in inventory for refilling items");
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a(this, "Blockhit", false);
    private iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a(this, "Right Click Mode", false);
    private iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Break Blocks", false, "Allows you to break blocks");
    private iReSqtkUVgeMGiReSqtkUVg h = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "autoclicker-alloweditems", "Allowed Items", iReSqtkUVgeMGiReSqtkUVg.a, new iReSqtkUVgDyziReSqtkUVg("swords"));
    private iReSqtkUVgfXGiReSqtkUVg i = iReSqtkUVgfXGiReSqtkUVg.a(this, "Right CPS", "#.#", "", 1.0, 6.0, 13.0, 20.0);
    private iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Limit to items", false, "AutoClicker functions only while holding selected items");
    private iReSqtkUVgoRmiReSqtkUVg k = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Limit to items", false, "AutoClicker functions only while holding selected items");
    private iReSqtkUVgeMGiReSqtkUVg l = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "autoclicker-alloweditems-right", "Allowed Items", iReSqtkUVgeMGiReSqtkUVg.a, new iReSqtkUVgDyziReSqtkUVg("blocks"));
    private boolean m;
    private iReSqtkUVgsGViReSqtkUVg n = new iReSqtkUVgsGViReSqtkUVg(this, 0, true, true);
    private iReSqtkUVgsGViReSqtkUVg o = new iReSqtkUVgsGViReSqtkUVg(this, 1, false, false);
    private boolean p = false;
    private Queue<iReSqtkUVgQrEiReSqtkUVg> q = new ConcurrentLinkedQueue<iReSqtkUVgQrEiReSqtkUVg>();

    public iReSqtkUVgsLdiReSqtkUVg() {
        super("AutoClicker", -62703, iReSqtkUVgqTOiReSqtkUVg.c, "Hold attack button to automatically click");
        this.j.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.l});
        this.k.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.h});
        this.f.a(this.i, this.j);
        this.a(this.d, this.e, this.g, this.b, this.f, this.i, this.j, this.l, this.k, this.h);
    }

    private List<Integer> y() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Object[] arrobject = iReSqtkUVgeLLiReSqtkUVg.e().aZ().e();
        for (int i = 0; i < 9; ++i) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = new iReSqtkUVgyetiReSqtkUVg(arrobject[i]);
            if (!iReSqtkUVgyetiReSqtkUVg2.b()) continue;
            arrayList.add(i);
        }
        return arrayList;
    }

    private boolean z() {
        if (this.g.i().booleanValue() && iReSqtkUVgeLLiReSqtkUVg.l().c() && iReSqtkUVgeLLiReSqtkUVg.l().f().equals(iReSqtkUVgYCPiReSqtkUVg.e())) {
            if (iReSqtkUVgVUTiReSqtkUVg.a()) {
                iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i().d();
                iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), true);
            }
            return true;
        }
        return false;
    }

    @Override
    public void g() {
        if (!this.m) {
            this.m = true;
            new iReSqtkUVgTZqiReSqtkUVg(this).start();
            new iReSqtkUVgIraiReSqtkUVg(this).start();
        }
    }

    private boolean A() {
        if (iReSqtkUVgeLLiReSqtkUVg.f().c()) {
            return true;
        }
        if (!this.B()) {
            return true;
        }
        iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().bd();
        return this.h.a(iReSqtkUVgyetiReSqtkUVg2, true);
    }

    private boolean B() {
        return this.k.i();
    }

    public boolean x() {
        if (iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            return false;
        }
        return this.A();
    }

    private boolean C() {
        if (iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            return false;
        }
        if (!this.j.i().booleanValue()) {
            return true;
        }
        iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().bd();
        return this.l.a(iReSqtkUVgyetiReSqtkUVg2, true);
    }

    private void a(iReSqtkUVgqvViReSqtkUVg iReSqtkUVgqvViReSqtkUVg2) {
        int n = Mouse.getEventX() * iReSqtkUVgqvViReSqtkUVg2.d() / iReSqtkUVgeLLiReSqtkUVg.p();
        int n2 = iReSqtkUVgqvViReSqtkUVg2.e() - Mouse.getEventY() * iReSqtkUVgqvViReSqtkUVg2.e() / iReSqtkUVgeLLiReSqtkUVg.q() - 1;
        this.q.add(new iReSqtkUVgQrEiReSqtkUVg(n, n2, null));
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVgMiPiReSqtkUVg iReSqtkUVgMiPiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.f();
        if (!iReSqtkUVgMiPiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.y)) {
            return;
        }
        if (!this.q.isEmpty()) {
            iReSqtkUVgQrEiReSqtkUVg iReSqtkUVgQrEiReSqtkUVg2 = this.q.poll();
            iReSqtkUVgqvViReSqtkUVg iReSqtkUVgqvViReSqtkUVg2 = new iReSqtkUVgqvViReSqtkUVg(iReSqtkUVgMiPiReSqtkUVg2);
            this.a(iReSqtkUVgqvViReSqtkUVg2, iReSqtkUVgQrEiReSqtkUVg2.a(), iReSqtkUVgQrEiReSqtkUVg2.b());
        }
    }

    private void a(iReSqtkUVgqvViReSqtkUVg iReSqtkUVgqvViReSqtkUVg2, int n, int n2) {
        iReSqtkUVgIHfiReSqtkUVg iReSqtkUVgIHfiReSqtkUVg2 = iReSqtkUVgqvViReSqtkUVg2.a(n, n2);
        long l = iReSqtkUVgeLLiReSqtkUVg.A();
        iReSqtkUVgqvViReSqtkUVg2.a(false);
        iReSqtkUVgqvViReSqtkUVg2.b(false);
        int n3 = 0;
        int n4 = iReSqtkUVgqvViReSqtkUVg2.h();
        int n5 = iReSqtkUVgqvViReSqtkUVg2.i();
        boolean bl = n < n4 || n2 < n5 || n >= n4 + iReSqtkUVgqvViReSqtkUVg2.j() || n2 >= n5 + iReSqtkUVgqvViReSqtkUVg2.k();
        int n6 = -1;
        if (!iReSqtkUVgIHfiReSqtkUVg2.b()) {
            n6 = iReSqtkUVgIHfiReSqtkUVg2.e();
        }
        if (bl) {
            n6 = -999;
        }
        if (n6 != -1) {
            if (iReSqtkUVgeLLiReSqtkUVg.e().aZ().g().b()) {
                boolean bl2 = n6 != -999 && Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54);
                int n7 = 0;
                if (bl2) {
                    iReSqtkUVgqvViReSqtkUVg2.a(!iReSqtkUVgIHfiReSqtkUVg2.b() && iReSqtkUVgIHfiReSqtkUVg2.f() ? iReSqtkUVgIHfiReSqtkUVg2.d() : new iReSqtkUVgyetiReSqtkUVg(null));
                    n7 = 1;
                } else if (n6 == -999) {
                    n7 = 4;
                }
                if (!iReSqtkUVgIHfiReSqtkUVg2.b()) {
                    if (this.c != iReSqtkUVgIHfiReSqtkUVg2.e()) {
                        if (iReSqtkUVgauSiReSqtkUVg.d() >= 17) {
                            iReSqtkUVgzMiiReSqtkUVg iReSqtkUVgzMiiReSqtkUVg2 = n7 == 0 ? iReSqtkUVgzMiiReSqtkUVg.d() : (n7 == 1 ? iReSqtkUVgzMiiReSqtkUVg.e() : iReSqtkUVgzMiiReSqtkUVg.h());
                            iReSqtkUVgqvViReSqtkUVg2.a(iReSqtkUVgIHfiReSqtkUVg2, n6, n3, iReSqtkUVgzMiiReSqtkUVg2);
                        } else {
                            iReSqtkUVgqvViReSqtkUVg2.a(iReSqtkUVgIHfiReSqtkUVg2, n6, n3, n7);
                        }
                    }
                    this.c = iReSqtkUVgIHfiReSqtkUVg2.e();
                }
                iReSqtkUVgqvViReSqtkUVg2.b(true);
            } else {
                iReSqtkUVgqvViReSqtkUVg2.c(true);
                iReSqtkUVgqvViReSqtkUVg2.b(n3);
                iReSqtkUVgqvViReSqtkUVg2.m().clear();
                iReSqtkUVgqvViReSqtkUVg2.c(n3);
                if (this.c != iReSqtkUVgIHfiReSqtkUVg2.e()) {
                    if (iReSqtkUVgIHfiReSqtkUVg2.d().b()) {
                        try {
                            Thread.sleep(50L);
                        }
                        catch (InterruptedException interruptedException) {
                            interruptedException.printStackTrace();
                        }
                        if (Keyboard.isKeyDown((int)42) || Keyboard.isKeyDown((int)54)) {
                            if (iReSqtkUVgauSiReSqtkUVg.d() >= 17) {
                                iReSqtkUVgqvViReSqtkUVg2.a(iReSqtkUVgIHfiReSqtkUVg2, n6, n3, iReSqtkUVgzMiiReSqtkUVg.e());
                            } else {
                                iReSqtkUVgqvViReSqtkUVg2.a(iReSqtkUVgIHfiReSqtkUVg2, n6, n3, 0);
                            }
                        }
                    }
                    this.c = iReSqtkUVgIHfiReSqtkUVg2.e();
                }
            }
        }
        iReSqtkUVgqvViReSqtkUVg2.a(iReSqtkUVgIHfiReSqtkUVg2);
        iReSqtkUVgqvViReSqtkUVg2.a(l);
        iReSqtkUVgqvViReSqtkUVg2.a(n3);
    }

    static /* synthetic */ boolean a(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.B();
    }

    static /* synthetic */ boolean b(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.A();
    }

    static /* synthetic */ boolean c(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.z();
    }

    static /* synthetic */ boolean d(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.p;
    }

    static /* synthetic */ boolean a(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2, boolean bl) {
        iReSqtkUVgsLdiReSqtkUVg2.p = bl;
        return iReSqtkUVgsLdiReSqtkUVg2.p;
    }

    static /* synthetic */ iReSqtkUVgoRmiReSqtkUVg e(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.d;
    }

    static /* synthetic */ iReSqtkUVgsGViReSqtkUVg f(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.n;
    }

    static /* synthetic */ iReSqtkUVgoRmiReSqtkUVg g(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.f;
    }

    static /* synthetic */ iReSqtkUVgsGViReSqtkUVg h(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.o;
    }

    static /* synthetic */ boolean i(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.C();
    }

    static /* synthetic */ List j(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.y();
    }

    static /* synthetic */ void a(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2, iReSqtkUVgqvViReSqtkUVg iReSqtkUVgqvViReSqtkUVg2) {
        iReSqtkUVgsLdiReSqtkUVg2.a(iReSqtkUVgqvViReSqtkUVg2);
    }

    static /* synthetic */ iReSqtkUVgoRmiReSqtkUVg k(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.e;
    }

    static /* synthetic */ iReSqtkUVgfXGiReSqtkUVg l(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.b;
    }

    static /* synthetic */ iReSqtkUVgfXGiReSqtkUVg m(iReSqtkUVgsLdiReSqtkUVg iReSqtkUVgsLdiReSqtkUVg2) {
        return iReSqtkUVgsLdiReSqtkUVg2.i;
    }
}

