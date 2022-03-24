/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.on;
import manthe.yI;

public class uV {
    public final Color i = new Color(5, 134, 105);
    public final Color e = new Color(6, 161, 126);
    public final Color j = new Color(250, 50, 56);
    public final Color p = new Color(255, 89, 94);
    public final Color g = new Color(47, 122, 229);
    public final Color n = new Color(80, 141, 229);
    public final Color w = new Color(236, 129, 44);
    public final Color q = new Color(236, 129, 44, 51);
    public final Color h = new Color(255, 160, 84);
    public final Color o = new Color(122, 122, 122);
    public final Color a = new Color(209, 209, 209);
    public final Color t = new Color(54, 53, 54);
    public final Color l = new Color(5, 134, 105);
    public final Color u = new Color(20, 20, 20);
    public final Color k = new Color(26, 25, 26);
    public final Color m = new Color(31, 30, 31);
    public final Color y = new Color(54, 53, 54, 128);
    public final Color f = new Color(54, 53, 54);
    public final Color c = new Color(209, 209, 209);
    public final Color r = new Color(163, 163, 163);
    public final Color s = new Color(89, 88, 89);
    public final Color d = new Color(0, 0, 0, 0);
    private Color x = Color.WHITE;
    private Color v = Color.BLACK;
    private static int b;

    public Color e() {
        return on.p.t().r.K();
    }

    public Color c() {
        if (this.e().equals(this.x)) {
            return this.v;
        }
        this.x = this.e();
        this.v = yI.a(this.x, 45, 240);
        return this.v;
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int b() {
        return b;
    }

    public static int d() {
        int n6 = uV.b();
        if (n6 == 0) {
            return 39;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (uV.d() == 0) {
            uV.b(4);
        }
    }
}

