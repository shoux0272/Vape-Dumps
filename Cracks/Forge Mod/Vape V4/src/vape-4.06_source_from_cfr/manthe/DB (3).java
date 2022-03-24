/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.DR;
import manthe.Ds;
import manthe.qD;
import manthe.zu;

public class DB
extends DR<Boolean, qD> {
    private boolean o;
    private static String[] n;

    public DB(Object object, String string, qD qD2) {
        super(object, string, qD2);
    }

    public DB(Object object, String string, boolean bl) {
        super(object, string, new qD(string, 10.0));
        ((qD)this.c()).b(10.0);
        ((qD)this.c()).g(bl);
        this.a(Boolean.valueOf(bl));
        ((qD)this.c()).a(this);
    }

    public DB(Object object, String string, String string2, boolean bl) {
        super(object, string, new qD(string2, 10.0));
        ((qD)this.c()).b(10.0);
        ((qD)this.c()).g(bl);
        this.a(Boolean.valueOf(bl));
        ((qD)this.c()).a(this);
    }

    public static DB a(Object object, String string, String string2, boolean bl) {
        qD qD2 = new qD(string2, 10.0);
        qD2.b(10.0);
        qD2.g(bl);
        DB dB2 = new DB(object, string, qD2);
        dB2.a(Boolean.valueOf(bl));
        qD2.a(dB2);
        return dB2;
    }

    public static DB a(Object object, String string, boolean bl, String string2) {
        DB dB2 = DB.a(object, string, string, bl);
        ((qD)dB2.c()).b(string2);
        return dB2;
    }

    public static DB a(Object object, String string, boolean bl) {
        return DB.a(object, string, string, bl);
    }

    public Boolean u() {
        return ((qD)this.c()).G();
    }

    @Override
    public void a(Boolean bl) {
        if (this.b() == null) {
            this.a(bl);
        }
        ((qD)this.c()).g(bl);
    }

    public Boolean x() {
        if (((qD)this.c()).N()) {
            if (a.ib()) {
                return this.u();
            }
            return false;
        }
        return this.u();
    }

    public boolean w() {
        return ((qD)this.c()).N() && !a.ib();
    }

    public DB d(boolean bl) {
        ((qD)this.c()).h(bl);
        return this;
    }

    @Override
    public void a(String string) {
        this.a((Boolean)Boolean.parseBoolean(string));
    }

    @Override
    public boolean s() {
        return ((qD)this.c()).G();
    }

    @Override
    public boolean b(Ds ds2) {
        return this.y();
    }

    public void e(boolean bl) {
        this.o = bl;
    }

    public boolean y() {
        if (zu.T.ab()) {
            return this.u();
        }
        return this.o;
    }

    public static void b(String[] arrstring) {
        n = arrstring;
    }

    public static String[] v() {
        return n;
    }

    static {
        if (DB.v() == null) {
            DB.b(new String[2]);
        }
    }
}

