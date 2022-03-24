/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Map;
import java.util.Set;
import manthe.A5;
import manthe.BG;
import manthe.cy;
import manthe.gJ;

public class ip
extends gJ {
    private final BG d = this.a(A5.dU, "classLoader", false, A5.aG);
    private final BG a = this.b("cachedClasses", false, Map.class);
    private final BG f = this.b("invalidClasses", false, Set.class);
    private static cy[] e;

    public ip() {
        super(A5.aG);
    }

    public Object e() {
        return this.d.f(null);
    }

    public Map a(Object object) {
        return (Map)this.a.f(object);
    }

    private Set b(Object object) {
        return (Set)this.f.f(object);
    }

    static Set a(ip ip2, Object object) {
        return ip2.b(object);
    }

    public static void b(cy[] arrcy) {
        e = arrcy;
    }

    public static cy[] d() {
        return e;
    }

    static {
        if (ip.d() != null) {
            ip.b(new cy[3]);
        }
    }
}

