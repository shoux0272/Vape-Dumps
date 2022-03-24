/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgLcXiReSqtkUVg {
    private int a;

    public iReSqtkUVgLcXiReSqtkUVg(int n) {
        this.a = n;
    }

    public iReSqtkUVgLcXiReSqtkUVg(String string) {
        this.a = string.length() - (string.indexOf(".") + 1);
    }

    public double a(double d2) {
        return Double.valueOf(this.b(d2));
    }

    public double a(iReSqtkUVgpFLiReSqtkUVg iReSqtkUVgpFLiReSqtkUVg2) {
        return this.a(iReSqtkUVgpFLiReSqtkUVg2.doubleValue());
    }

    public String b(double d2) {
        String string = String.valueOf(d2).replaceAll(",", ".");
        if (string.contains("E")) {
            return string;
        }
        if (string.contains(".")) {
            int n = Math.min(string.indexOf(46) + this.a + 1, string.length());
            return string.substring(0, n);
        }
        return string;
    }

    public String b(iReSqtkUVgpFLiReSqtkUVg iReSqtkUVgpFLiReSqtkUVg2) {
        return this.b(iReSqtkUVgpFLiReSqtkUVg2.doubleValue());
    }

    public int a() {
        return this.a;
    }
}

