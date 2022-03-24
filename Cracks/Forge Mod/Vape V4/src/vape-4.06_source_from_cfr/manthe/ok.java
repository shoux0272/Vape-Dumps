/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.oc;
import manthe.p1;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.so;
import manthe.ui;
import manthe.yt;

public abstract class ok
implements Runnable {
    private final yt c;
    private final p1 b;
    private ui d = new ui(this, null);
    private oc a = new oc(this, null);

    public ok(yt yt2, p1 p12) {
        this.c = yt2;
        this.b = p12;
    }

    @Override
    public void run() {
        if (!this.a.isAlive()) {
            this.a = new oc(this, null);
            this.a.start();
        } else {
            this.d = new ui(this, null);
            this.d.start();
        }
    }

    public boolean c() {
        return this.a.isAlive() || this.d.isAlive();
    }

    public abstract void b();

    public String a() {
        if (this.b == null) {
            return "";
        }
        if (this.b instanceof rg) {
            return ((rg)this.b).z().E();
        }
        if (this.b instanceof rl) {
            return ((rl)this.b).E();
        }
        if (this.b instanceof rf) {
            return ((rl)((rf)this.b).v().get(0)).E();
        }
        if (this.b instanceof so) {
            return ((so)this.b).a().z().E();
        }
        return "";
    }

    public void a(String string) {
        if (this.b == null) {
            return;
        }
        if (this.b instanceof rg) {
            ((rg)this.b).z().a(string);
        } else if (this.b instanceof rl) {
            ((rl)this.b).a(string);
        } else if (this.b instanceof rf) {
            ((rl)((rf)this.b).v().get(0)).a(string);
        } else if (this.b instanceof so) {
            ((so)this.b).a().z().a(string);
        }
    }

    static yt b(ok ok2) {
        return ok2.c;
    }

    static oc a(ok ok2) {
        return ok2.a;
    }

    static p1 c(ok ok2) {
        return ok2.b;
    }
}

