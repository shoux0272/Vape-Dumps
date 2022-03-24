/*
 * Decompiled with CFR 0.150.
 */
package manthe;

public final class pJ
extends Enum<pJ> {
    public static final /* enum */ pJ INFO = new pJ("Info", -1);
    public static final /* enum */ pJ WARNING = new pJ("Warning", -1277652);
    public static final /* enum */ pJ ALERT = new pJ("Alert", -380360);
    private String e;
    private String c;
    private int a;
    private static final /* synthetic */ pJ[] b;
    private static String[] d;

    public static pJ[] values() {
        return (pJ[])b.clone();
    }

    public static pJ valueOf(String string) {
        return Enum.valueOf(pJ.class, string);
    }

    private pJ(String string2, int n10) {
        this.e = string2;
        this.a = n10;
        this.c = "noti_" + string2.toLowerCase();
    }

    public String d() {
        return this.e;
    }

    public int a() {
        return this.a;
    }

    public String c() {
        return this.c;
    }

    static {
        pJ.b(null);
        b = new pJ[]{INFO, WARNING, ALERT};
    }

    public static void b(String[] arrstring) {
        d = arrstring;
    }

    public static String[] b() {
        return d;
    }
}

