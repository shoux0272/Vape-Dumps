/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Mouse
 */
import a.a;
import java.awt.Color;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import org.lwjgl.input.Mouse;

public abstract class iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgRjOiReSqtkUVg,
iReSqtkUVgnCWiReSqtkUVg,
Cloneable {
    private List<iReSqtkUVgnCWiReSqtkUVg> h = new ArrayList<iReSqtkUVgnCWiReSqtkUVg>();
    private final Map<iReSqtkUVgxxliReSqtkUVg, iReSqtkUVgCxSiReSqtkUVg> p = new LinkedHashMap<iReSqtkUVgxxliReSqtkUVg, iReSqtkUVgCxSiReSqtkUVg>();
    public Color a = i;
    protected iReSqtkUVgeoviReSqtkUVg b;
    protected iReSqtkUVgFXsiReSqtkUVg c;
    protected int d = 0;
    protected int e = 0;
    protected Set<iReSqtkUVgFeuiReSqtkUVg> f = new HashSet<iReSqtkUVgFeuiReSqtkUVg>();
    protected Set<iReSqtkUVgBuwiReSqtkUVg> g = new HashSet<iReSqtkUVgBuwiReSqtkUVg>();
    private iReSqtkUVgxxliReSqtkUVg q = new iReSqtkUVgxxliReSqtkUVg(-10000.0, -10000.0, 0.0, 0.0);
    private iReSqtkUVgxxliReSqtkUVg r = null;
    private Color s = j;
    private boolean t = true;
    private iReSqtkUVgRjOiReSqtkUVg u;
    private iReSqtkUVgWaoiReSqtkUVg v;
    private boolean w = true;
    private iReSqtkUVgilmiReSqtkUVg x;
    private String y = "";
    private long z;
    private boolean A;
    private boolean B;

    public iReSqtkUVgcvhiReSqtkUVg a() {
        try {
            iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg2 = (iReSqtkUVgcvhiReSqtkUVg)super.clone();
            iReSqtkUVgcvhiReSqtkUVg2.h = new ArrayList<iReSqtkUVgnCWiReSqtkUVg>();
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.h) {
                if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgcvhiReSqtkUVg)) continue;
                iReSqtkUVgcvhiReSqtkUVg iReSqtkUVgcvhiReSqtkUVg3 = (iReSqtkUVgcvhiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2;
                iReSqtkUVgcvhiReSqtkUVg2.h.add(iReSqtkUVgcvhiReSqtkUVg3.a());
            }
            return iReSqtkUVgcvhiReSqtkUVg2;
        }
        catch (Exception exception) {
            iReSqtkUVgFuiiReSqtkUVg.a(exception);
            return null;
        }
    }

    @Override
    public void a(boolean bl) {
        if (this.h()) {
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.h) {
                iReSqtkUVgnCWiReSqtkUVg2.a(bl);
            }
        }
    }

    @Override
    public void c_() {
        if (this.x == null) {
            this.x = new iReSqtkUVgwOFiReSqtkUVg(this, this.y, iReSqtkUVgIqLiReSqtkUVg.a, 0.5);
            this.x.f(true);
            this.x.d(10.0);
            this.x.c(this.k());
        }
        for (iReSqtkUVgFeuiReSqtkUVg object2 : this.f) {
            object2.a(this);
        }
        if (this.h()) {
            Object object;
            if (this.c != null) {
                object = iReSqtkUVguKSiReSqtkUVg.a();
                this.e = ((iReSqtkUVgFXsiReSqtkUVg)object).b - this.c.b;
                this.d = ((iReSqtkUVgFXsiReSqtkUVg)object).a - this.c.a;
            }
            if (!(this.b instanceof iReSqtkUVgXVAiReSqtkUVg) && this.b != null) {
                this.b.h();
            }
            if (this instanceof iReSqtkUVgmopiReSqtkUVg && !Mouse.isButtonDown((int)0)) {
                ((iReSqtkUVgmopiReSqtkUVg)((Object)this)).b_(false);
            }
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.h) {
                iReSqtkUVgnCWiReSqtkUVg2.c_();
            }
            if (this.x != null) {
                if (this.x.D() != null && !this.x.D().isEmpty()) {
                    if (this.t()) {
                        if (this.z++ >= 25L) {
                            this.x.a_(true);
                            object = iReSqtkUVguKSiReSqtkUVg.a();
                            this.x.a_(((iReSqtkUVgFXsiReSqtkUVg)object).a + 2);
                            this.x.b((double)((iReSqtkUVgFXsiReSqtkUVg)object).b - this.x.l() / 2.0 - 2.0);
                            this.x.c(this.j().b(this.x.D()) * 0.7);
                            iReSqtkUVgypOiReSqtkUVg.a(this.x);
                        }
                    } else {
                        this.z = 0L;
                        iReSqtkUVgypOiReSqtkUVg.b(this.x);
                    }
                } else {
                    iReSqtkUVgypOiReSqtkUVg.b(this.x);
                }
            }
            this.c = iReSqtkUVguKSiReSqtkUVg.a();
            if (this.b instanceof iReSqtkUVgXVAiReSqtkUVg && this.b != null) {
                this.b.h();
            }
        }
    }

    @Override
    public double c() {
        return this.q.a();
    }

    @Override
    public void a_(double d2) {
        this.q.a(d2);
    }

    @Override
    public double e_() {
        return this.q.b();
    }

    @Override
    public void b(double d2) {
        this.q.b(d2);
    }

    @Override
    public iReSqtkUVgxxliReSqtkUVg e() {
        return this.q;
    }

    @Override
    public iReSqtkUVgRjOiReSqtkUVg f() {
        return this.u;
    }

    @Override
    public void a(iReSqtkUVgRjOiReSqtkUVg iReSqtkUVgRjOiReSqtkUVg2) {
        this.u = iReSqtkUVgRjOiReSqtkUVg2;
    }

    @Override
    public boolean a(char c2, int n) {
        if (!this.h()) {
            return false;
        }
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.o()) {
            if (!iReSqtkUVgnCWiReSqtkUVg2.h() || !iReSqtkUVgnCWiReSqtkUVg2.a(c2, n)) continue;
            return true;
        }
        return false;
    }

    private void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2, iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3) {
        Object object;
        if (iReSqtkUVgnCWiReSqtkUVg3.equals(iReSqtkUVgnCWiReSqtkUVg2)) {
            return;
        }
        if (iReSqtkUVgnCWiReSqtkUVg3 instanceof iReSqtkUVgBGPiReSqtkUVg) {
            object = (iReSqtkUVgBGPiReSqtkUVg)((Object)iReSqtkUVgnCWiReSqtkUVg3);
            object.b(false);
        }
        if (iReSqtkUVgnCWiReSqtkUVg3 instanceof iReSqtkUVgRjOiReSqtkUVg) {
            object = (iReSqtkUVgRjOiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg3;
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg4 : object.o()) {
                this.a(iReSqtkUVgnCWiReSqtkUVg2, iReSqtkUVgnCWiReSqtkUVg4);
            }
        }
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (this.h()) {
            for (iReSqtkUVgnCWiReSqtkUVg object : this.h) {
                if (!object.a(n, n2, n3)) continue;
                for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.h) {
                    this.a(object, iReSqtkUVgnCWiReSqtkUVg2);
                }
                return true;
            }
            if (this.t()) {
                Iterator<iReSqtkUVgnCWiReSqtkUVg> iterator = new ArrayList<Map.Entry<iReSqtkUVgxxliReSqtkUVg, iReSqtkUVgCxSiReSqtkUVg>>(this.p.entrySet()).listIterator(this.p.size());
                while (iterator.hasPrevious()) {
                    Map.Entry entry = (Map.Entry)iterator.previous();
                    iReSqtkUVgxxliReSqtkUVg iReSqtkUVgxxliReSqtkUVg2 = (iReSqtkUVgxxliReSqtkUVg)entry.getKey();
                    iReSqtkUVgCxSiReSqtkUVg iReSqtkUVgCxSiReSqtkUVg2 = (iReSqtkUVgCxSiReSqtkUVg)entry.getValue();
                    if (iReSqtkUVgCxSiReSqtkUVg2 == null) {
                        return true;
                    }
                    if (iReSqtkUVgxxliReSqtkUVg2 == null) {
                        iReSqtkUVgCxSiReSqtkUVg2.a(this, n, n2, n3);
                        return true;
                    }
                    if (!iReSqtkUVgxxliReSqtkUVg2.b(this.c(), this.e_()).a(iReSqtkUVguKSiReSqtkUVg.a())) continue;
                    iReSqtkUVgCxSiReSqtkUVg2.a(this, n, n2, n3);
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public Set<iReSqtkUVgBuwiReSqtkUVg> g() {
        return this.g;
    }

    @Override
    public boolean a(int n, int n2) {
        return this.q.a(n, n2);
    }

    @Override
    public boolean h() {
        return this.t;
    }

    @Override
    public void a_(boolean bl) {
        this.t = bl;
    }

    @Override
    public Set<iReSqtkUVgxxliReSqtkUVg> i() {
        return this.p.keySet();
    }

    @Override
    public void a(iReSqtkUVgxxliReSqtkUVg iReSqtkUVgxxliReSqtkUVg2, iReSqtkUVgCxSiReSqtkUVg iReSqtkUVgCxSiReSqtkUVg2) {
        this.p.put(iReSqtkUVgxxliReSqtkUVg2, iReSqtkUVgCxSiReSqtkUVg2);
    }

    @Override
    public iReSqtkUVgCRDiReSqtkUVg j() {
        return iReSqtkUVgFuiiReSqtkUVg.e.C();
    }

    @Override
    public double k() {
        return this.q.c();
    }

    @Override
    public void c(double d2) {
        this.q.c(d2);
    }

    @Override
    public double l() {
        return this.q.d();
    }

    @Override
    public void d(double d2) {
        this.q.d(d2);
    }

    @Override
    public Color m() {
        return this.a;
    }

    @Override
    public void a(Color color) {
        this.a = color;
    }

    @Override
    public Color n() {
        return this.s;
    }

    @Override
    public void b(Color color) {
        this.s = color;
    }

    @Override
    public List<iReSqtkUVgnCWiReSqtkUVg> o() {
        return this.h;
    }

    @Override
    public List<iReSqtkUVgnCWiReSqtkUVg> p() {
        ArrayList<iReSqtkUVgnCWiReSqtkUVg> arrayList = new ArrayList<iReSqtkUVgnCWiReSqtkUVg>();
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.h) {
            if (!iReSqtkUVgnCWiReSqtkUVg2.h()) continue;
            arrayList.add(iReSqtkUVgnCWiReSqtkUVg2);
        }
        return arrayList;
    }

    public iReSqtkUVgnCWiReSqtkUVg a(iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2) {
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.h) {
            if (!iReSqtkUVgnCWiReSqtkUVg2.x().equals(iReSqtkUVgWaoiReSqtkUVg2)) continue;
            return iReSqtkUVgnCWiReSqtkUVg2;
        }
        return null;
    }

    @Override
    public iReSqtkUVgnCWiReSqtkUVg a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        iReSqtkUVgnCWiReSqtkUVg2.a(this);
        this.h.add(iReSqtkUVgnCWiReSqtkUVg2);
        return iReSqtkUVgnCWiReSqtkUVg2;
    }

    public iReSqtkUVgnCWiReSqtkUVg[] a(iReSqtkUVgnCWiReSqtkUVg[] arriReSqtkUVgnCWiReSqtkUVg) {
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : arriReSqtkUVgnCWiReSqtkUVg) {
            iReSqtkUVgnCWiReSqtkUVg2.a(this);
            this.h.add(iReSqtkUVgnCWiReSqtkUVg2);
        }
        return arriReSqtkUVgnCWiReSqtkUVg;
    }

    @Override
    public iReSqtkUVgnCWiReSqtkUVg a(int n, iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        this.h.add(n, iReSqtkUVgnCWiReSqtkUVg2);
        return iReSqtkUVgnCWiReSqtkUVg2;
    }

    @Override
    public void b(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        this.h.remove(iReSqtkUVgnCWiReSqtkUVg2);
    }

    public void q() {
        this.h.clear();
    }

    @Override
    public iReSqtkUVgeoviReSqtkUVg r() {
        return this.b;
    }

    @Override
    public void a(iReSqtkUVgeoviReSqtkUVg iReSqtkUVgeoviReSqtkUVg2) {
        iReSqtkUVgeoviReSqtkUVg2.a(this);
        this.b = iReSqtkUVgeoviReSqtkUVg2;
    }

    public void a(iReSqtkUVgxxliReSqtkUVg iReSqtkUVgxxliReSqtkUVg2) {
        for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2 : this.h) {
            if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgcvhiReSqtkUVg)) continue;
            ((iReSqtkUVgcvhiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).a(iReSqtkUVgxxliReSqtkUVg2);
        }
        this.r = iReSqtkUVgxxliReSqtkUVg2;
    }

    public iReSqtkUVgxxliReSqtkUVg s() {
        return this.r;
    }

    @Override
    public boolean t() {
        iReSqtkUVgFXsiReSqtkUVg iReSqtkUVgFXsiReSqtkUVg2 = iReSqtkUVguKSiReSqtkUVg.a();
        if (this.r != null) {
            int n = Mouse.getX();
            int n2 = Mouse.getY();
            if ((double)n > this.r.a() && (double)n2 > this.r.b() && (double)n < this.r.a() + this.r.c() && (double)n2 < this.r.b() + this.r.d()) {
                return this.a(iReSqtkUVgFXsiReSqtkUVg2.a, iReSqtkUVgFXsiReSqtkUVg2.b);
            }
            return false;
        }
        return this.a(iReSqtkUVgFXsiReSqtkUVg2.a, iReSqtkUVgFXsiReSqtkUVg2.b);
    }

    public int u() {
        return this.d;
    }

    public int v() {
        return this.e;
    }

    @Override
    public Set<iReSqtkUVgFeuiReSqtkUVg> w() {
        return this.f;
    }

    @Override
    public void a(iReSqtkUVgFeuiReSqtkUVg iReSqtkUVgFeuiReSqtkUVg2) {
        this.f.add(iReSqtkUVgFeuiReSqtkUVg2);
    }

    public void a(iReSqtkUVgBuwiReSqtkUVg iReSqtkUVgBuwiReSqtkUVg2) {
        this.g.add(iReSqtkUVgBuwiReSqtkUVg2);
    }

    @Override
    public iReSqtkUVgWaoiReSqtkUVg x() {
        return this.v;
    }

    @Override
    public void b(iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2) {
        this.v = iReSqtkUVgWaoiReSqtkUVg2;
    }

    @Override
    public boolean y() {
        return this.w;
    }

    public void c(boolean bl) {
        this.w = bl;
    }

    public iReSqtkUVgilmiReSqtkUVg z() {
        return this.x;
    }

    public void a_(String string) {
        if (this.x != null) {
            this.x.a(string);
        } else {
            this.y = string;
        }
    }

    @Override
    public boolean A() {
        if (this.B() && !a.a.ib()) {
            return true;
        }
        return this.A;
    }

    @Override
    public void d(boolean bl) {
        this.A = bl;
    }

    public boolean B() {
        return this.B;
    }

    public void e(boolean bl) {
        this.B = bl;
    }

    public void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2, Consumer<iReSqtkUVgnCWiReSqtkUVg> consumer) {
        block5: {
            block6: {
                block4: {
                    consumer.accept(iReSqtkUVgnCWiReSqtkUVg2);
                    if (iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgupGiReSqtkUVg || iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgRNziReSqtkUVg) {
                        return;
                    }
                    if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVguOciReSqtkUVg)) break block4;
                    for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg3 : ((iReSqtkUVguOciReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).D().o()) {
                        this.a(iReSqtkUVgnCWiReSqtkUVg3, consumer);
                    }
                    break block5;
                }
                if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgCMeiReSqtkUVg)) break block6;
                for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg4 : ((iReSqtkUVgCMeiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).J().o()) {
                    this.a(iReSqtkUVgnCWiReSqtkUVg4, consumer);
                }
                break block5;
            }
            if (!(iReSqtkUVgnCWiReSqtkUVg2 instanceof iReSqtkUVgRjOiReSqtkUVg)) break block5;
            for (iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg5 : ((iReSqtkUVgRjOiReSqtkUVg)iReSqtkUVgnCWiReSqtkUVg2).o()) {
                this.a(iReSqtkUVgnCWiReSqtkUVg5, consumer);
            }
        }
    }

    public /* synthetic */ Object clone() {
        return this.a();
    }

    @Override
    public /* synthetic */ iReSqtkUVgnCWiReSqtkUVg C() {
        return this.a();
    }
}

