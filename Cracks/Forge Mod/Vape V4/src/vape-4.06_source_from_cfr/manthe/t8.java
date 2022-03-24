/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import manthe.BM;
import manthe.V;
import manthe.oz;
import manthe.q0;
import manthe.s0;
import manthe.s2;
import manthe.s5;
import manthe.s8;
import manthe.sA;
import manthe.sB;
import manthe.sC;
import manthe.sE;
import manthe.sF;
import manthe.sJ;
import manthe.sL;
import manthe.sN;
import manthe.sR;
import manthe.sU;
import manthe.sX;
import manthe.s_;
import manthe.sd;
import manthe.se;
import manthe.sj;
import manthe.sm;
import manthe.sq;
import manthe.sr;
import manthe.ss;
import manthe.st;
import manthe.su;
import manthe.sx;
import manthe.sy;

public class t8 {
    private final Map<Class, oz> d = new HashMap<Class, oz>();
    private final Map<Class, Integer> e = new HashMap<Class, Integer>();
    private final Map<Class, BM> h = new HashMap<Class, BM>();
    private final List<BM> a = new ArrayList<BM>();
    private final int f = 0;
    private int g = 0;
    private boolean b;
    private sy c;

    public void a() {
        this.c = new sy();
        this.a(this.c);
    }

    public void c() {
        this.c.a(new q0(this.c));
        this.a(new sx());
        this.a(new s5());
        this.a(new sJ());
        this.a(new sA());
        this.a(new sd());
        this.a(new s0());
        this.a(new s8());
        this.a(new s_());
        this.a(new st());
        this.a(new sC());
        this.a(new s2());
        this.a(new sR());
        this.a(new ss());
        this.a(new sX());
        this.a(new sm());
        this.a(new sB());
        this.a(new sF());
        this.a(new sE());
        this.a(new sr());
        this.a(new sj());
        this.a(new sN());
        this.a(new sq());
        this.a(new se());
        if (V.c() > 13) {
            this.a(new sU());
            this.a(new su());
            this.a(new sL());
        }
    }

    private void a(oz oz2) {
        this.d.put(oz2.a(), oz2);
        this.e.put(oz2.a(), this.g++);
        BM bM2 = new BM(oz2.a());
        this.h.put(oz2.a(), bM2);
        this.a.add(bM2);
    }

    public void a(Object object) {
        try {
            Class<?> class_ = object.getClass();
            if (this.d.containsKey(class_)) {
                oz oz2 = this.d.get(class_);
                oz2.a(object);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void a(boolean bl) {
        this.b = bl;
    }

    public boolean b() {
        return this.b;
    }
}

