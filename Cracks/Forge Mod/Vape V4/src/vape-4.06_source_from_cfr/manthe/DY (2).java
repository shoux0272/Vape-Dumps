/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ds;
import manthe.aj;
import manthe.ex;
import manthe.rT;
import manthe.rh;
import manthe.y5;

public class DY
extends Ds<aj, rh> {
    private aj l = new aj(this, true, false, false, false, false, false, false);

    public DY(Object object, String string, rh rh2) {
        super(object, string, rh2);
    }

    public static DY a(y5 y52) {
        rh rh2 = new rh("Targets");
        rh2.b(10.0);
        DY dY2 = new DY((Object)y52, "Target Settings " + y52.H(), rh2);
        rh2.a(dY2);
        rT rT2 = new rT(dY2);
        rh2.a(rT2);
        return dY2;
    }

    public boolean a(ex ex2) {
        return this.r().a(ex2);
    }

    public aj r() {
        return this.l;
    }

    @Override
    public void a(aj aj2) {
        this.l = aj2;
    }

    @Override
    public void a(String string) {
        this.r().a(string);
    }
}

