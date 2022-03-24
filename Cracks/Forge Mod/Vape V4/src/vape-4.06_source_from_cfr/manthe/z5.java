/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.aA;
import manthe.cY;
import manthe.cq;
import manthe.de;
import manthe.dk;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.em;
import manthe.ex;
import manthe.fG;
import manthe.fk;
import manthe.kZ;
import manthe.kt;
import manthe.on;
import manthe.y5;
import manthe.yU;
import manthe.ya;
import manthe.yu;

public class z5
extends y5 {
    public static Queue<dk> u = new ConcurrentLinkedQueue<dk>();
    private final AO A = new AO();
    private ya z;
    private boolean x = false;
    private boolean w = true;
    private boolean v = false;
    private int y = 0;
    private int B = 0;

    public z5() {
        super("Macros", 0, 0, CQ.b, null);
        this.z();
    }

    @Override
    public void z() {
        this.d(true);
        if (!this.v) {
            this.v = true;
            new cq(this).start();
        }
    }

    @Override
    public void a(kZ kZ2) {
        if (this.z != null) {
            return;
        }
        if (kZ2.isDown()) {
            return;
        }
        List<ya> list = on.p.f().a(kZ2.getKey());
        if (list.isEmpty()) {
            return;
        }
        for (ya ya2 : list) {
            if (this.z != null) continue;
            this.a(ya2);
        }
    }

    public void a(ya ya2) {
        if (ya2 instanceof yU) {
            ds.k().a(ya2.l());
            return;
        }
        this.z = ya2;
        if (this.T() == -1) {
            this.z = null;
            return;
        }
        this.B = ds.k().aU().i();
        this.y = aA.a(this.z.m());
        this.w = true;
        this.V();
    }

    public void W() throws Exception {
        if (this.z == null) {
            return;
        }
        if (!this.x) {
            this.x = true;
            this.U();
            this.A.d();
        }
        if (this.w) {
            if (this.A.a(this.y)) {
                if (this.z.q().u().booleanValue()) {
                    this.y = aA.a(this.z.k());
                    this.A.d();
                    this.w = false;
                } else {
                    this.S();
                }
            }
        } else if (this.z instanceof yu && !this.A.a(this.y)) {
            ex ex2;
            eJ eJ2 = ds.k();
            em em2 = eJ2.aW();
            if (eJ2.d() && em2.d() && ((ex2 = eJ2.aW().au()).d() && ex2.a(A5.L) || em2.at())) {
                this.U();
                Thread.sleep(aA.a(30, 60));
                this.S();
            }
        } else if (this.A.a(this.y)) {
            this.U();
            Thread.sleep(aA.a(30, 60));
            this.S();
        }
    }

    private int T() {
        try {
            for (int k = 0; k < 9; ++k) {
                fG fG2 = ds.k().aU().b(k);
                if (fG2.a() == null || fG2.k().a() == null) continue;
                if (String.valueOf(fk.a(fG2.k())).equals(this.z.l())) {
                    return k;
                }
                if (!fG2.j().equalsIgnoreCase(this.z.l()) && !fG2.k().a(fG2).equalsIgnoreCase(this.z.l())) continue;
                return k;
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
        return -1;
    }

    private void V() {
        ds.k().aU().a(this.T());
    }

    private void U() throws Exception {
        dk dk2;
        ei ei2 = ds.s().s();
        ei.a(ei2.i(), true);
        ei.a(ei2.i(), false);
        ei.a(ei2.i());
        if (!on.p.h()) {
            de.g().put(1, (byte)1);
            dk2 = dk.h();
            dk2.a(1);
            dk2.c(true);
            u.add(dk2);
        }
        Thread.sleep(aA.a(10, 100));
        if (!on.p.h()) {
            de.g().put(1, (byte)0);
            dk2 = dk.h();
            dk2.a(1);
            dk2.c(false);
            u.add(dk2);
        }
    }

    private void S() {
        this.z = null;
        this.w = true;
        this.x = false;
        ds.k().aU().a(this.B);
    }

    @Override
    public void b(kt kt2) {
        try {
            if (on.p.h()) {
                return;
            }
            while (u.peek() != null) {
                cY.f().a(u.poll());
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

