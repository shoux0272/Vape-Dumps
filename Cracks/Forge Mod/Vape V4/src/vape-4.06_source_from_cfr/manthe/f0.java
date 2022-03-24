/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.V;
import manthe.cy;
import manthe.ex;
import manthe.jc;

public class f0
extends cy {
    public f0(Object object) {
        super(object);
    }

    public String f() {
        if (V.c() >= 23) {
            ex ex2 = new ex(jc.b(f0.a.M().v, this.b));
            if (ex2.d()) {
                return ex2.S();
            }
            return "";
        }
        return jc.a(f0.a.M().v, this.b);
    }
}

