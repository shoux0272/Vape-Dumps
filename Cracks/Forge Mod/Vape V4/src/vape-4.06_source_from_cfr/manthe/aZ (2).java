/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.ds;
import manthe.p1;
import manthe.rQ;
import manthe.rg;

public class aZ {
    private final String a;
    private final rg b;
    private final List<p1> c = new ArrayList<p1>();

    public aZ(String string) {
        this.a = string;
        this.b = new rQ(string, "    " + string, 0.25f, 2.0f, 3.5f, true);
        this.b.z().e(0.8);
        this.b.c(ds.m().c(string));
        this.b.b(15.0);
    }

    public String a() {
        return this.a;
    }

    public rg c() {
        return this.b;
    }

    public List<p1> b() {
        return this.c;
    }

    public void a(p1 p12) {
        this.c.add(p12);
    }
}

