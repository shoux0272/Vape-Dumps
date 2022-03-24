/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class un {
    public static String a(String string, String string2, String string3) {
        return string.replaceFirst("(?s)" + string2 + "(?!.*?" + string2 + ")", string3);
    }
}

