/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class qa {
    private String a = null;
    private String b = null;

    public qa(String string, String string2) {
        this.a = string;
        this.b = string2;
    }

    public qa(String string) {
        this.a = string;
    }

    public boolean a(String string, String string2) {
        return this.a.equals(string) && (this.b == null || this.b.equals(string2));
    }
}

