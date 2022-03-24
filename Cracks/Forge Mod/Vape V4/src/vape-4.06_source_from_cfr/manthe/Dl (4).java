/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import manthe.AO;
import manthe.dD;
import manthe.ds;
import manthe.ng;

public class Dl {
    private final AO a = new AO();
    private String d;
    private String b;
    private static String c;

    public void a(boolean bl) {
        String string;
        if (!this.a.a(1000L)) {
            return;
        }
        this.a.d();
        if (!bl) {
            a.a.updc(null, null);
            return;
        }
        dD dD2 = ds.g();
        String string2 = "Not in a server";
        if (dD2.d()) {
            string2 = "Playing legit on " + dD2.f();
        }
        if ((string = ng.b.al()).length() >= 128) {
            string = string.substring(0, 128);
        }
        if (!string2.equals(this.d) || !this.b.equals(string)) {
            a.a.updc(string2, string);
        }
        this.d = string2;
        this.b = string;
    }

    public static void b(String string) {
        c = string;
    }

    public static String b() {
        return c;
    }

    static {
        if (Dl.b() != null) {
            Dl.b("JQYag");
        }
    }
}

