/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cy;
import manthe.jm;

public class g7
extends cy {
    private static g7 e;
    private static g7 f;

    public g7(Object object) {
        super(object);
    }

    public static g7 g() {
        if (e == null) {
            e = new g7(jm.b(g7.a.M().bl));
        }
        return e;
    }

    public static g7 f() {
        if (f == null) {
            f = new g7(jm.a(g7.a.M().bl));
        }
        return f;
    }
}

