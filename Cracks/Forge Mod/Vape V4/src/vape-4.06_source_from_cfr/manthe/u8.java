/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.Cq;
import manthe.ds;
import manthe.eJ;
import manthe.fQ;

class u8 {
    private final int b;
    private final int a;
    private final List<Integer> c = new ArrayList<Integer>();

    public u8(int n6, int n10) {
        this.b = n6;
        this.a = n10;
    }

    public void a(int n6) {
        this.c.add(n6);
    }

    public int b() {
        return this.a;
    }

    public List<Integer> a() {
        return this.c;
    }

    public void c() {
        eJ eJ2 = ds.k();
        List<fQ> list = eJ2.aY().f();
        Cq cq2 = new Cq(this, list);
        this.c.sort(cq2);
    }

    static int a(u8 u82) {
        return u82.a;
    }
}

