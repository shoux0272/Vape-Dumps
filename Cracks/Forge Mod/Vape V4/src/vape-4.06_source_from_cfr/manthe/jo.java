/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.V;
import manthe.bP;
import manthe.gJ;

public class jo
extends gJ {
    private final bP a;
    private bP d;

    public jo() {
        super(A5.aH);
        if (V.c() == 13) {
            this.d = this.a("hasPriority", true, Boolean.TYPE, new Class[0]);
        }
        this.a = this.a("processPacket", true, Void.TYPE, A5.aC);
    }

    private boolean a(Object object) {
        return this.d.h(object, new Object[0]);
    }

    private void a(Object object, Object object2) {
        this.a.p(object, object2);
    }

    static boolean a(jo jo2, Object object) {
        return jo2.a(object);
    }

    static void a(jo jo2, Object object, Object object2) {
        jo2.a(object, object2);
    }
}

