/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.b;
import java.lang.reflect.Method;
import manthe.cM;
import manthe.on;

public class bP {
    private static int f = 0;
    private final int g;
    private final Class d;
    private final boolean a;
    private String e;
    private boolean b;
    private Class[] c;

    public bP(Class class_, String string, boolean bl, boolean bl2, Class class_2, Class ... arrclass) {
        this.c = arrclass;
        this.a = bl2;
        this.g = ++f;
        this.d = class_;
        try {
            this.e = cM.a(class_2, arrclass);
            if (bl) {
                a.b.a(this.g, class_, string, this.e, bl2);
            } else {
                a.b.b(this.g, class_, string, this.e, bl2);
            }
        }
        catch (Exception exception) {
            this.b = true;
        }
    }

    public bP(Class class_, String string, boolean bl, boolean bl2, String string2) {
        this.c = new Class[0];
        this.a = bl2;
        this.g = ++f;
        this.d = class_;
        try {
            this.e = "()" + string2;
            if (bl) {
                a.b.a(this.g, class_, string, string2, bl2);
            } else {
                a.b.b(this.g, class_, string, string2, bl2);
            }
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    public void p(Object object, Object ... arrobject) {
        a.b.c(this.g, object, arrobject);
    }

    public boolean h(Object object, Object ... arrobject) {
        return a.b.d(this.g, object, arrobject);
    }

    public char s(Object object, Object ... arrobject) {
        return a.b.e(this.g, object, arrobject);
    }

    public short b(Object object, Object ... arrobject) {
        return a.b.f(this.g, object, arrobject);
    }

    public int o(Object object, Object ... arrobject) {
        return a.b.g(this.g, object, arrobject);
    }

    public long l(Object object, Object ... arrobject) {
        return a.b.h(this.g, object, arrobject);
    }

    public float f(Object object, Object ... arrobject) {
        return a.b.i(this.g, object, arrobject);
    }

    public double m(Object object, Object ... arrobject) {
        return a.b.j(this.g, object, arrobject);
    }

    public byte k(Object object, Object ... arrobject) {
        return a.b.ddd(this.g, object, arrobject);
    }

    public Object e(Object object, Object ... arrobject) {
        return a.b.k(this.g, object, arrobject);
    }

    public boolean[] q(Object object, Object ... arrobject) {
        return a.b.l(this.g, object, arrobject);
    }

    public char[] d(Object object, Object ... arrobject) {
        return a.b.m(this.g, object, arrobject);
    }

    public short[] r(Object object, Object ... arrobject) {
        return a.b.n(this.g, object, arrobject);
    }

    public int[] j(Object object, Object ... arrobject) {
        return a.b.o(this.g, object, arrobject);
    }

    public long[] c(Object object, Object ... arrobject) {
        return a.b.p(this.g, object, arrobject);
    }

    public float[] n(Object object, Object ... arrobject) {
        return a.b.q(this.g, object, arrobject);
    }

    public double[] i(Object object, Object ... arrobject) {
        return a.b.r(this.g, object, arrobject);
    }

    public Object[] g(Object object, Object ... arrobject) {
        return a.b.s(this.g, object, arrobject);
    }

    public void a(Object object, Object ... arrobject) {
        a.b.bbb(this.g, object, arrobject);
    }

    public Object a(Object ... arrobject) {
        return a.b.ccc(this.g, this.d, arrobject);
    }

    public boolean a() {
        return this.b;
    }

    public String d() {
        return a.b.gmn(this.g);
    }

    public String b() {
        return this.e;
    }

    public boolean c() {
        return this.a;
    }

    public Method e() {
        try {
            return this.d.getDeclaredMethod(this.d(), this.c);
        }
        catch (NoSuchMethodException noSuchMethodException) {
            on.a(noSuchMethodException);
            return null;
        }
    }
}

