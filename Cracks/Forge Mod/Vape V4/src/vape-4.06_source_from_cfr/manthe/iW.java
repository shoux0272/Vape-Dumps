/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.gJ;

public class iW
extends gJ {
    public bP a;
    private BG f;
    private bP e;
    private static cy[] d;

    public iW() {
        super(A5.p);
        if (V.c() > 13) {
            this.e = this.a("getMainModel", true, A5.b_, new Class[0]);
        } else {
            this.f = this.b("modelBipedMain", true, A5.bz);
        }
        this.a = this.a("doRender", true, Void.TYPE, A5.cC, Double.TYPE, Double.TYPE, Double.TYPE, Float.TYPE, Float.TYPE);
    }

    private Object a(Object object) {
        if (V.c() > 13) {
            return this.e.e(object, new Object[0]);
        }
        return this.f.f(object);
    }

    static Object a(iW iW2, Object object) {
        return iW2.a(object);
    }

    public static void b(cy[] arrcy) {
        d = arrcy;
    }

    public static cy[] d() {
        return d;
    }

    static {
        if (iW.d() == null) {
            iW.b(new cy[1]);
        }
    }
}

