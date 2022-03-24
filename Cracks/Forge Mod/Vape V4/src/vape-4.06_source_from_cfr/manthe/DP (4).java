/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.Ds;
import manthe.r6;
import manthe.rh;

public abstract class DP<C>
extends Ds<List<C>, rh> {
    private static String l;

    public DP(Object object, String string, rh rh2) {
        super(object, string, rh2);
    }

    public abstract C a(String var1, int var2);

    @Override
    public abstract void a(r6 var1);

    public static void b(String string) {
        l = string;
    }

    public static String a() {
        return l;
    }

    static {
        if (DP.a() != null) {
            DP.b("fjCwNc");
        }
    }
}

