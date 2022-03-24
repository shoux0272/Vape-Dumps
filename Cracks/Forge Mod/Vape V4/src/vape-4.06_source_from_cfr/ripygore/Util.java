/*
 * Decompiled with CFR 0.150.
 */
package ripygore;

import java.net.URL;

public class Util {
    public static URL getResource(String s) {
        return Util.class.getClassLoader().getResource(s);
    }
}

