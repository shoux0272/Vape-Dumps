/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Set;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class jO
extends gJ {
    private final BG g;
    private final BG d;
    private final BG h;
    private final BG e;
    private final BG f;
    private bP a;

    public jO() {
        super(A5.U);
        if (V.c() > 13) {
            this.g = this.b("x", true, Double.TYPE);
            this.d = this.b("y", true, Double.TYPE);
            this.h = this.b("z", true, Double.TYPE);
        } else {
            this.g = this.b("field_148940_a", false, Double.TYPE);
            this.d = this.b("field_148938_b", false, Double.TYPE);
            this.h = this.b("field_148939_c", false, Double.TYPE);
        }
        if (V.c() > 13) {
            this.a = this.a("func_179834_f", cy.c, Set.class, new Class[0]);
        }
        this.e = this.b("field_148936_d", cy.c, Float.TYPE);
        this.f = this.b("field_148937_e", cy.c, Float.TYPE);
    }

    public float f(Object object) {
        return this.e.b(object);
    }

    public float e(Object object) {
        return this.f.b(object);
    }

    public void a(Object object, float f10) {
        this.e.a(object, f10);
    }

    public void b(Object object, float f10) {
        this.f.a(object, f10);
    }

    public double d(Object object) {
        return this.g.b(object);
    }

    public double b(Object object) {
        return this.d.b(object);
    }

    public double a(Object object) {
        return this.h.b(object);
    }

    public Object c(Object object) {
        return this.a.e(object, new Object[0]);
    }
}

