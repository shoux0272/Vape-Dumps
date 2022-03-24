/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.cP;
import manthe.kK;
import manthe.si;

public class sN
extends si {
    public sN() {
        super(A5.w, 0);
    }

    @Override
    public void a(Object object) {
        cP cP2 = new cP(object);
        kK kK2 = new kK(cP2.g());
        kK2.fire();
        cP2.a(kK2.getMessage());
    }
}

