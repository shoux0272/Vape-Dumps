/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.ds;
import manthe.ex;
import manthe.nK;
import manthe.on;
import manthe.z9;
import manthe.zG;
import manthe.zM;

public abstract class CI
implements nK {
    protected zG b = on.p.H().b(zG.class);
    protected z9 d = on.p.H().b(z9.class);
    protected zM a = on.p.H().b(zM.class);
    private static String[] c;

    protected boolean a(ex ex2) {
        return ex2.equals(ds.k()) && (this.d.N() || this.b.N());
    }

    protected boolean a() {
        return this.b.N() && this.b.U();
    }

    public static void b(String[] arrstring) {
        c = arrstring;
    }

    public static String[] b() {
        return c;
    }

    static {
        if (CI.b() == null) {
            CI.b(new String[3]);
        }
    }
}

