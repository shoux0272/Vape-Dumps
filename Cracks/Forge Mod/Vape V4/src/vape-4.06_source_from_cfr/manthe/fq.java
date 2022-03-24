/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.fn;
import manthe.gM;
import manthe.jw;

public class fq
extends fn {
    public fq(Object object) {
        super(object);
    }

    public static fq g() {
        if (V.c() >= 23) {
            return new fq(jw.a(fq.a.M().B, gM.f().a()));
        }
        return new fq(fq.a.M().B.d());
    }
}

