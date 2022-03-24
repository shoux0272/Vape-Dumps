/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.HashMap;
import manthe.A5;
import manthe.P;
import manthe.bO;
import manthe.kl;
import manthe.lr;
import manthe.t5;
import manthe.tA;
import manthe.tC;
import manthe.tU;
import manthe.t_;
import manthe.ta;
import manthe.tc;
import manthe.td;
import manthe.te;
import manthe.th;
import manthe.tj;
import manthe.tt;
import manthe.tu;
import manthe.tx;
import manthe.uJ;
import manthe.ur;
import manthe.ve;

public class bN
extends bO {
    private final HashMap<Class<? extends kl>, P> d = new HashMap();
    private boolean c;
    private static int[] b;

    public bN() {
        th.b(A5.ba);
        th.b(A5.bT);
        th.b(A5.cC);
        th.b(A5.cF);
    }

    public void e() {
        tC tC2 = new tC();
        this.a.add(tC2);
    }

    public void c() {
        this.a.clear();
        this.a.add(new tu());
        this.a.add(new uJ());
        this.a.add(new t5());
        this.a.add(new tt());
        this.a.add(new t_());
        this.a.add(new tU());
        this.a.add(new ur());
        this.a.add(new tj());
        this.a.add(new ta());
        this.a.add(new tc());
        this.a.add(new tA());
        this.a.add(new te());
        this.a.add(new tx());
        this.a.add(new td());
        this.a(lr.class, new ve());
    }

    public boolean f() {
        return this.c;
    }

    public void a(boolean bl) {
        this.c = bl;
    }

    public P a(Class<? extends kl> class_) {
        return this.d.get(class_);
    }

    public void a(Class<? extends kl> class_, P p3) {
        this.d.put(class_, p3);
    }

    public static void b(int[] arrn) {
        b = arrn;
    }

    public static int[] d() {
        return b;
    }

    static {
        if (bN.d() == null) {
            bN.b(new int[3]);
        }
    }
}

