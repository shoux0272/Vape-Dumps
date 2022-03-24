/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ao;
import manthe.dx;
import manthe.g7;
import manthe.kl;
import manthe.on;

public class lo
extends kl {
    private final dx d;
    private boolean e;
    private static String[] f;

    public lo(Object object) {
        this.d = new dx(object);
    }

    public Object getBlockLayer() {
        return this.e ? g7.f().a() : g7.g().a();
    }

    public dx getBlock() {
        return this.d;
    }

    public void setShouldRender(boolean bl) {
        this.e = bl;
    }

    @Override
    public boolean fire() {
        if (!on.p.H().a(Ao.class)) {
            return super.fire();
        }
        on.p.H().b(Ao.class).a(this);
        return super.fire();
    }

    public static void b(String[] arrstring) {
        f = arrstring;
    }

    public static String[] e() {
        return f;
    }

    static {
        if (lo.e() == null) {
            lo.b(new String[5]);
        }
    }
}

