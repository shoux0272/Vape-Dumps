/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import java.util.Map;
import manthe.V;
import manthe.cy;
import manthe.eu;
import manthe.fG;
import manthe.gG;
import manthe.iE;

public class fk
extends cy {
    public fk(Object object) {
        super(object);
    }

    public static fk a(String string) {
        Object object = iE.a(fk.a.M().bO, string);
        return object == null ? null : new fk(object);
    }

    public static int a(fk fk2) {
        return iE.c(fk.a.M().bO, fk2.a());
    }

    public static fk a(int n6) {
        return new fk(iE.a(fk.a.M().bO, n6));
    }

    public static gG j() {
        return new gG(iE.b(fk.a.M().bO));
    }

    public String g() {
        return iE.b(fk.a.M().bO, this.a());
    }

    public String b(fG fG2) {
        return iE.a(fk.a.M().bO, this.a(), fG2.a());
    }

    public String a(fG fG2) {
        return iE.b(fk.a.M().bO, this.a(), fG2.a());
    }

    public int h() {
        return fk.a(this);
    }

    public void a(fk fk2, List list) {
        iE.a(fk.a.M().bO, this.b, fk2.a(), eu.f().a(), list);
    }

    public static Map i() {
        if (V.c() >= 15) {
            return iE.a(fk.a.M().bO);
        }
        return null;
    }

    public int f() {
        return iE.a(fk.a.M().bO, this.b);
    }
}

