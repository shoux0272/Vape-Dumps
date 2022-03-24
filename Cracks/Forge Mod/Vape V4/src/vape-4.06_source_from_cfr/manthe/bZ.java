/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bO;
import manthe.t1;
import manthe.t4;
import manthe.t9;
import manthe.tG;
import manthe.tH;
import manthe.tK;
import manthe.tO;
import manthe.tS;
import manthe.tb;
import manthe.tf;
import manthe.th;
import manthe.tl;
import manthe.tw;

public class bZ
extends bO {
    private boolean c;
    private static String b;

    public bZ() {
        th.b(A5.u);
        th.b(A5.ba);
        th.b(A5.aH);
        th.b(A5.b4);
        th.b(A5.bS);
        th.b(A5.bd);
        th.b(A5.bC);
        th.b(A5.b6);
        th.b(A5.F);
        if (V.c() > 13) {
            th.b(A5.dP);
            th.b(A5.b8);
            th.b(A5.ao);
            th.b(A5.aY);
            th.b(A5.b1);
            th.b(A5.dg);
            th.b(A5.bv);
            th.b(A5.aA);
            th.b(A5.cu);
            th.b(A5.bV);
        } else {
            th.b(A5.c_);
            th.b(A5.dz);
        }
        this.a.add(new tb());
        this.a.add(new t9());
        this.a.add(new tG());
        if (V.c() == 13) {
            this.a.add(new t4(A5.cv));
        } else {
            this.a.add(new t4(A5.u));
        }
    }

    public void e() {
        if (V.c() == 13) {
            this.a.add(new tw());
            this.a.add(new tl());
        } else {
            this.a.add(new tS());
            this.a.add(new tO());
            this.a.add(new t1());
            this.a.add(new tH());
            this.a.add(new tK());
            this.a.add(new tf());
        }
        this.a();
        this.c = true;
    }

    public boolean d() {
        return this.c;
    }

    public static void b(String string) {
        b = string;
    }

    public static String c() {
        return b;
    }

    static {
        if (bZ.c() == null) {
            bZ.b("kQHkt");
        }
    }
}

