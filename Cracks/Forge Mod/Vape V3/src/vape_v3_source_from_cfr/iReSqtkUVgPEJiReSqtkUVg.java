/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class iReSqtkUVgPEJiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    public static Queue<iReSqtkUVgADCiReSqtkUVg> b = new ConcurrentLinkedQueue<iReSqtkUVgADCiReSqtkUVg>();
    private iReSqtkUVgZsZiReSqtkUVg c;
    private boolean d = false;
    private iReSqtkUVgPzKiReSqtkUVg e = new iReSqtkUVgPzKiReSqtkUVg();
    private boolean f = true;
    private boolean g = false;
    private int h = 0;
    private int i = 0;

    public iReSqtkUVgPEJiReSqtkUVg() {
        super("Macros", 0, 0, iReSqtkUVgqTOiReSqtkUVg.b, null);
        this.a();
    }

    @Override
    public void a() {
        this.a(true);
        if (!this.g) {
            this.g = true;
            new iReSqtkUVggAziReSqtkUVg(this).start();
        }
    }

    @Override
    public void a(iReSqtkUVgMDuiReSqtkUVg iReSqtkUVgMDuiReSqtkUVg2) {
        if (this.c != null) {
            return;
        }
        if (iReSqtkUVgMDuiReSqtkUVg2.a()) {
            return;
        }
        List<iReSqtkUVgZsZiReSqtkUVg> list = iReSqtkUVgFuiiReSqtkUVg.e.l().b(iReSqtkUVgMDuiReSqtkUVg2.b());
        if (list.isEmpty()) {
            return;
        }
        for (iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2 : list) {
            if (this.c != null) continue;
            this.a(iReSqtkUVgZsZiReSqtkUVg2);
        }
    }

    public void a(iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2) {
        if (iReSqtkUVgZsZiReSqtkUVg2 instanceof iReSqtkUVghnYiReSqtkUVg) {
            iReSqtkUVgeLLiReSqtkUVg.e().a(iReSqtkUVgZsZiReSqtkUVg2.a());
            return;
        }
        this.c = iReSqtkUVgZsZiReSqtkUVg2;
        if (this.y() == -1) {
            this.c = null;
            return;
        }
        this.i = iReSqtkUVgeLLiReSqtkUVg.e().aZ().d();
        this.h = iReSqtkUVgXsIiReSqtkUVg.a(this.c.c());
        this.f = true;
        this.z();
    }

    public void x() {
        if (this.c == null) {
            return;
        }
        if (!this.d) {
            this.d = true;
            this.A();
            this.e.b();
        }
        if (this.f) {
            if (this.e.a(this.h)) {
                if (this.c.e().i().booleanValue()) {
                    this.h = iReSqtkUVgXsIiReSqtkUVg.a(this.c.d());
                    this.e.b();
                    this.f = false;
                } else {
                    this.B();
                }
            }
        } else if (this.c instanceof iReSqtkUVglLjiReSqtkUVg && !this.e.a(this.h)) {
            iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2;
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            iReSqtkUVgasEiReSqtkUVg iReSqtkUVgasEiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.bb();
            if (iReSqtkUVgtlXiReSqtkUVg2.c() && iReSqtkUVgasEiReSqtkUVg2.c() && ((iReSqtkUVgjSjiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.bb().d()).c() && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B) || iReSqtkUVgasEiReSqtkUVg2.e())) {
                this.A();
                Thread.sleep(iReSqtkUVgXsIiReSqtkUVg.a(30, 60));
                this.B();
            }
        } else if (this.e.a(this.h)) {
            this.A();
            Thread.sleep(iReSqtkUVgXsIiReSqtkUVg.a(30, 60));
            this.B();
        }
    }

    private int y() {
        try {
            for (int i = 0; i < 9; ++i) {
                iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().aZ().b(i);
                if (iReSqtkUVgyetiReSqtkUVg2.a() == null || iReSqtkUVgyetiReSqtkUVg2.e().a() == null) continue;
                if (String.valueOf(iReSqtkUVgLUhiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2.e())).equals(this.c.a())) {
                    return i;
                }
                if (!iReSqtkUVgyetiReSqtkUVg2.f().equalsIgnoreCase(this.c.a()) && !iReSqtkUVgyetiReSqtkUVg2.e().b(iReSqtkUVgyetiReSqtkUVg2).equalsIgnoreCase(this.c.a())) continue;
                return i;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1;
    }

    private void z() {
        iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(this.y());
    }

    private void A() {
        iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i().e();
        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), true);
        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), false);
        iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d());
        iReSqtkUVgoIbiReSqtkUVg.d().put(1, (byte)1);
        iReSqtkUVgADCiReSqtkUVg iReSqtkUVgADCiReSqtkUVg2 = iReSqtkUVgADCiReSqtkUVg.d();
        iReSqtkUVgADCiReSqtkUVg2.a(1);
        iReSqtkUVgADCiReSqtkUVg2.a(true);
        b.add(iReSqtkUVgADCiReSqtkUVg2);
        Thread.sleep(iReSqtkUVgXsIiReSqtkUVg.a(10, 100));
        iReSqtkUVgoIbiReSqtkUVg.d().put(1, (byte)0);
        iReSqtkUVgADCiReSqtkUVg2 = iReSqtkUVgADCiReSqtkUVg.d();
        iReSqtkUVgADCiReSqtkUVg2.a(1);
        iReSqtkUVgADCiReSqtkUVg2.a(false);
        b.add(iReSqtkUVgADCiReSqtkUVg2);
    }

    private void B() {
        this.c = null;
        this.f = true;
        this.d = false;
        iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(this.i);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        try {
            while (b.peek() != null) {
                iReSqtkUVgpKbiReSqtkUVg.d().a(b.poll());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

