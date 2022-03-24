/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class jK
extends gJ {
    private bP d;
    private bP a;

    public jK() {
        super(A5.cq);
        if (V.c() > 13) {
            this.a = this.a("<init>", false, Void.TYPE, A5.ba, A5.bY);
        } else {
            this.d = this.a("<init>", false, Void.TYPE, A5.ba, Integer.TYPE);
        }
    }

    public Object a(Object object, int n6) {
        return this.d.a(new Object[]{object, n6});
    }

    public Object a(Object object, Object object2) {
        return this.a.a(new Object[]{object, object2});
    }
}

