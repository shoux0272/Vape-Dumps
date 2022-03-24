/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.cv;

public class dk
extends cv {
    public dk(Object object) {
        super(object);
    }

    public static dk h() {
        try {
            return new dk(A5.dH.newInstance());
        }
        catch (Exception exception) {
            return null;
        }
    }

    public int g() {
        return dk.a.M().a1.a(this.b);
    }

    public void a(int n6) {
        dk.a.M().a1.a(this.b, n6);
    }

    public boolean i() {
        return dk.a.M().a1.b(this.b);
    }

    public void c(boolean bl) {
        dk.a.M().a1.a(this.b, bl);
    }
}

