/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.ej;
import manthe.ex;
import manthe.me;
import manthe.zO;

class tp
implements Comparator<ex> {
    final zO a;

    private tp(zO zO2) {
        this.a = zO2;
    }

    private float a(ex ex2) {
        ej ej2 = new ej(ex2.a());
        float f10 = ej2.aD();
        if (Float.isNaN(f10)) {
            f10 = 0.0f;
        }
        if (this.a.u.u().booleanValue() && ej2.aN() > 4) {
            f10 += (float)ej2.aN();
        }
        return f10;
    }

    public int a(ex ex2, ex ex3) {
        return Float.compare(this.a(ex2), this.a(ex3));
    }

    tp(zO zO2, me me2) {
        this(zO2);
    }
}

