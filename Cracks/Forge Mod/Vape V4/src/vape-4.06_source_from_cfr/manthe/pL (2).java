/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class pL {
    public static pL b = pL.a("mojang", "Mojang");
    public static pL d = pL.a("thealtening", "TheAltening");
    private String c;
    private String a;

    static pL a(String string, String string2) {
        return new pL(string, string2);
    }

    private pL(String string, String string2) {
        this.c = string;
        this.a = string2;
    }

    public String a() {
        return this.c;
    }

    public String b() {
        return this.a;
    }
}

