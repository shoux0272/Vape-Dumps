/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Bo;
import manthe.f;

public class j
extends f<Bo> {
    private Bo g;
    private Bo h;
    private int e;
    private int f;

    public j(double d10, Bo bo2, Bo bo3) {
        super(d10);
        this.g = bo2;
        this.h = bo3;
        this.e = bo3.a - bo2.a;
        this.f = bo3.b - bo2.b;
    }

    public Bo o() {
        double d10 = this.l();
        if (d10 == 0.0) {
            return this.g;
        }
        if (d10 == 100.0) {
            return this.h;
        }
        int n6 = this.g.a + (int)(this.l() * (double)this.e / 100.0);
        int n10 = this.g.b + (int)(this.l() * (double)this.f / 100.0);
        return new Bo(n6, n10);
    }

    public void b(Bo bo2) {
        this.g = bo2;
        this.e = this.h.a - bo2.a;
        this.f = this.h.b - bo2.b;
    }

    public void a(Bo bo2) {
        this.h = bo2;
        this.e = bo2.a - this.g.a;
        this.f = bo2.b - this.g.b;
    }

    public Bo n() {
        return this.g;
    }

    public Bo p() {
        return this.h;
    }
}

