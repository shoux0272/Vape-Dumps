/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class hT
extends gJ {
    public bP a;
    public bP d;

    public hT() {
        super(A5.bv);
        if (V.c() >= 23) {
            this.a = this.a("func_187493_a", cy.c, Boolean.TYPE, A5.b8, A5.bV, A5.aA, A5.ao, A5.cu, Boolean.TYPE, Long.TYPE);
            this.d = this.a("func_187498_b", cy.c, Boolean.TYPE, A5.b8, A5.bV, A5.aA, A5.ao, A5.cu, Boolean.TYPE, Long.TYPE);
        } else {
            this.a = this.a("func_178267_a", cy.c, Boolean.TYPE, A5.b8, A5.bV, A5.aA, A5.ao, A5.cu, Boolean.TYPE);
            this.d = cy.c ? this.a("a", false, Boolean.TYPE, A5.b8, A5.bV, A5.F, A5.ao, A5.cu, Boolean.TYPE) : this.a("renderModelAmbientOcclusion", true, Boolean.TYPE, A5.b8, A5.bV, A5.F, A5.ao, A5.cu, Boolean.TYPE);
        }
    }

    public boolean a(Object object, Object object2, Object object3, Object object4, Object object5, Object object6, Object object7, boolean bl, long l) {
        if (V.c() >= 23) {
            return this.d.h(object, object2, object3, object5, object6, object7, bl, l);
        }
        if (cy.c) {
            return this.d.h(object, object2, object3, object4, object6, object7, bl);
        }
        return this.d.h(object, object2, object3, object4, object6, object7, bl);
    }
}

