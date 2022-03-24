/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgMEriReSqtkUVg
extends iReSqtkUVgYJSiReSqtkUVg {
    private iReSqtkUVgYewiReSqtkUVg b;
    private iReSqtkUVgYewiReSqtkUVg c;
    private iReSqtkUVgYewiReSqtkUVg d;
    private iReSqtkUVgYewiReSqtkUVg e;
    private iReSqtkUVgkgTiReSqtkUVg f;

    public iReSqtkUVgMEriReSqtkUVg() {
        super("net/minecraft/client/gui/FontRenderer");
        if (iReSqtkUVgauSiReSqtkUVg.d() == 13) {
            this.b = this.a("drawStringWithShadow", true, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.d = this.a("drawString", true, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        } else {
            this.c = this.a("drawStringWithShadow", true, Integer.TYPE, String.class, Float.TYPE, Float.TYPE, Integer.TYPE);
            this.d = this.a("func_78276_b", false, Integer.TYPE, String.class, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        }
        this.f = this.a("locationFontTexture", true, iReSqtkUVgSzRiReSqtkUVg.S);
        this.e = this.a("getStringWidth", true, Integer.TYPE, String.class);
    }

    public int a(Object object, String string, int n, int n2, int n3) {
        return this.b.e(object, string, n, n2, n3);
    }

    public int a(Object object, String string, float f, float f2, int n) {
        return this.c.e(object, string, Float.valueOf(f), Float.valueOf(f2), n);
    }

    public int b(Object object, String string, int n, int n2, int n3) {
        return this.d.e(object, string, n, n2, n3);
    }

    public int a(Object object, String string) {
        return this.e.e(object, string);
    }

    public int a(Object object) {
        return 10;
    }

    public Object b(Object object) {
        return this.f.h(object);
    }
}

