/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cM;
import manthe.cy;
import manthe.gJ;

public class in
extends gJ {
    private final bP d;
    private final bP g;
    private final bP a;
    private final bP e;
    private bP h;
    private final BG f;

    public in() {
        super(A5.a1);
        if (V.c() >= 23) {
            this.d = this.b("getEnchantmentLevel", true, Integer.TYPE, A5.dh, A5.bT);
            this.a = this.b("getEnchantmentModifierDamage", true, Integer.TYPE, Iterable.class, A5.bQ);
            this.h = this.b("getDepthStriderModifier", true, Integer.TYPE, A5.cF);
            this.e = this.b("applyEnchantmentModifierArray", true, Void.TYPE, A5.bW, Iterable.class);
            this.g = this.b("getModifierForCreature", true, Float.TYPE, A5.bT, A5.cK);
        } else {
            if (V.c() > 13) {
                this.h = this.b("getDepthStriderModifier", true, Integer.TYPE, A5.ba);
            }
            this.d = this.b("getEnchantmentLevel", true, Integer.TYPE, Integer.TYPE, A5.bT);
            this.a = this.b("getEnchantmentModifierDamage", true, Integer.TYPE, cM.b(A5.bT), A5.bQ);
            this.e = this.b("applyEnchantmentModifierArray", true, Void.TYPE, A5.bW, cM.b(A5.bT));
            this.g = this.b("func_152377_a", cy.c, Float.TYPE, A5.bT, A5.cK);
        }
        this.f = this.a(V.c() >= 23 ? "ENCHANTMENT_MODIFIER_DAMAGE" : "enchantmentModifierDamage", true, A5.aQ);
    }

    private void a(Object object, Iterable iterable) {
        try {
            this.e.p(null, object, iterable);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(Object object, Object[] arrobject) {
        try {
            this.e.p(null, object, arrobject);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private float b(Object object, Object object2) {
        return this.g.f(null, object, object2);
    }

    private Object d() {
        return this.f.f(null);
    }

    private int a(Object object) {
        if (this.h == null) {
            return 0;
        }
        return this.h.o(null, object);
    }

    private int a(int n6, Object object) {
        return this.d.o(null, n6, object);
    }

    private int a(Object object, Object object2) {
        return this.d.o(null, object, object2);
    }

    private int a(Object[] arrobject, Object object) {
        return this.a.o(null, arrobject, object);
    }

    private int a(Iterable iterable, Object object) {
        return this.a.o(null, iterable, object);
    }

    static int b(in in2, Object object, Object object2) {
        return in2.a(object, object2);
    }

    static int a(in in2, int n6, Object object) {
        return in2.a(n6, object);
    }

    static int a(in in2, Object object) {
        return in2.a(object);
    }

    static float a(in in2, Object object, Object object2) {
        return in2.b(object, object2);
    }

    static int a(in in2, Iterable iterable, Object object) {
        return in2.a(iterable, object);
    }

    static int a(in in2, Object[] arrobject, Object object) {
        return in2.a(arrobject, object);
    }

    static Object a(in in2) {
        return in2.d();
    }

    static void a(in in2, Object object, Iterable iterable) {
        in2.a(object, iterable);
    }

    static void a(in in2, Object object, Object[] arrobject) {
        in2.a(object, arrobject);
    }
}

