/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.BG;
import manthe.gJ;

public class h3
extends gJ {
    private final BG d = this.b("partialTicks", false, Float.TYPE);
    private static int a;

    public h3() {
        super("net/minecraftforge/client/event/RenderWorldLastEvent");
    }

    private float a(Object object) {
        return this.d.b(object);
    }

    static float a(h3 h32, Object object) {
        return h32.a(object);
    }

    public static void a(int n6) {
        a = n6;
    }

    public static int d() {
        return a;
    }

    public static int e() {
        int n6 = h3.d();
        if (n6 == 0) {
            return 41;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (h3.d() == 0) {
            h3.a(83);
        }
    }
}

