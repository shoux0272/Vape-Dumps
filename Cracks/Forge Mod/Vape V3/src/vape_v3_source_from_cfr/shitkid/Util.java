/*
 * Decompiled with CFR 0.150.
 */
package shitkid;

import java.net.URL;

public class Util {
    private Util() {
    }

    public static URL getResource(String s) {
        return Util.class.getClassLoader().getResource(s);
    }
}

