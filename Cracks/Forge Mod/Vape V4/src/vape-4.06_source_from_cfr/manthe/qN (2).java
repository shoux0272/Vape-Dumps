/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public class qN {
    private final int a;

    public qN(int n6) {
        this.a = n6;
    }

    public qN(String string) {
        this.a = string.length() - (string.indexOf(".") + 1);
    }

    public double a(double d10) {
        return Double.valueOf(this.b(d10));
    }

    public double a(Double d10) {
        return this.a((double)d10);
    }

    public String b(double d10) {
        String string = String.valueOf(d10).replaceAll(",", ".");
        if (string.contains("E")) {
            return string;
        }
        if (string.contains(".")) {
            int n6 = Math.min(string.indexOf(46) + this.a + 1, string.length());
            return string.substring(0, n6);
        }
        return string;
    }

    public String b(Double d10) {
        return this.b((double)d10);
    }

    public int a() {
        return this.a;
    }
}

