/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 */
package manthe;

import com.google.common.collect.ImmutableMap;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class hU
extends gJ {
    private final bP e = this.a("getBlock", true, A5.F, new Class[0]);
    private final bP a = this.a("getProperties", true, ImmutableMap.class, new Class[0]);
    private static int[] d;

    public hU() {
        super(A5.aA);
    }

    public Object b(Object object) {
        return this.e.e(object, new Object[0]);
    }

    public ImmutableMap a(Object object) {
        return (ImmutableMap)this.a.e(object, new Object[0]);
    }

    public static void b(int[] arrn) {
        d = arrn;
    }

    public static int[] d() {
        return d;
    }

    static {
        if (hU.d() != null) {
            hU.b(new int[1]);
        }
    }
}

