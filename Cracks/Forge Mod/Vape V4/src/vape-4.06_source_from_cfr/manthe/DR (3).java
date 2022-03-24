/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import manthe.AJ;
import manthe.Ds;
import manthe.cy;
import manthe.p1;

public abstract class DR<K, C extends p1>
extends Ds<K, C> {
    private final List<Ds> m = new ArrayList<Ds>();
    private static cy[] l;

    public DR(Object object, String string, C c3) {
        super(object, string, c3);
        this.c().j().add(new AJ());
    }

    public List<Ds> t() {
        return this.m;
    }

    public Ds r() {
        for (Ds ds2 : this.t()) {
            if (!ds2.equals(this.t().get(this.t().size() - 1))) continue;
            if (ds2 instanceof DR) {
                DR dR2 = (DR)ds2;
                if (!dR2.t().isEmpty() && dR2.s()) {
                    Ds ds3 = dR2.t().get(dR2.t().size() - 1);
                    if (!dR2.t().isEmpty()) {
                        return dR2.r();
                    }
                    return ds3;
                }
                return ds2;
            }
            return ds2;
        }
        return null;
    }

    public DR a(Ds ... arrds) {
        for (Ds ds2 : arrds) {
            ds2.a(this);
        }
        this.m.addAll(Arrays.asList(arrds));
        return this;
    }

    public abstract boolean s();

    public abstract boolean b(Ds var1);

    public static void b(cy[] arrcy) {
        l = arrcy;
    }

    public static cy[] a() {
        return l;
    }

    static {
        if (DR.a() == null) {
            DR.b(new cy[5]);
        }
    }
}

