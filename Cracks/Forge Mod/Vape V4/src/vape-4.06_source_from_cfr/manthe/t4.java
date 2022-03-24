/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import javassist.CtClass;
import javassist.CtMethod;
import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.kE;
import manthe.kX;
import manthe.km;
import manthe.on;
import manthe.th;
import manthe.yh;

public class t4
extends th {
    private String l;
    private String p;
    private String m;
    private String k;
    private String i;
    private CtClass j;
    private bP o = null;
    private bP n = null;

    public t4(Class class_) {
        super(class_);
    }

    private void i() {
        this.o = V.c() >= 15 ? on.p.M().aJ.k : on.p.M().aw.k;
        this.n = on.p.M().M.ai;
        this.l = on.p.M().bZ.e.a();
        this.i = on.p.M().bZ.e.c();
        this.p = on.p.M().M.j.a();
        this.m = on.p.M().M.ac.a();
        this.k = on.p.M().M.af.a();
        this.j = this.d(A5.b4);
        String string = km.class.getName();
        CtMethod ctMethod = this.b(this.o);
        this.a(this.o, kE.class, "$0");
        this.b(this.o, kX.class, "$0");
        boolean bl = on.p.h();
        if (bl && a.a.gc("aaa") == null) {
            bl = false;
        }
        boolean bl2 = bl;
        try {
            CtClass ctClass = this.d(A5.ba);
            ctMethod.instrument(new yh(this, bl2, ctClass, string));
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void c() {
        this.i();
    }

    static String e(t4 t42) {
        return t42.p;
    }

    static String f(t4 t42) {
        return t42.m;
    }

    static String d(t4 t42) {
        return t42.k;
    }

    static String c(t4 t42) {
        return t42.l;
    }

    static String a(t4 t42) {
        return t42.i;
    }

    static CtClass b(t4 t42) {
        return t42.j;
    }
}

