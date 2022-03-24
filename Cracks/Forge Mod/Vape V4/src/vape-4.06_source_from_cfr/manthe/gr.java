/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.UUID;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class gr
extends gJ {
    private final bP e;
    private final bP a;
    private final bP d = this.a("<init>", false, Void.TYPE, UUID.class, String.class);
    private static int[] f;

    public gr() {
        super(A5.al);
        this.e = this.a("getId", false, UUID.class, new Class[0]);
        this.a = this.a("getName", false, String.class, new Class[0]);
    }

    private Object a(UUID uUID, String string) {
        return this.d.a(new Object[]{uUID, string});
    }

    private UUID b(Object object) {
        return (UUID)this.e.e(object, new Object[0]);
    }

    private String a(Object object) {
        return (String)this.a.e(object, new Object[0]);
    }

    static Object a(gr gr2, UUID uUID, String string) {
        return gr2.a(uUID, string);
    }

    static UUID a(gr gr2, Object object) {
        return gr2.b(object);
    }

    static String b(gr gr2, Object object) {
        return gr2.a(object);
    }

    public static void b(int[] arrn) {
        f = arrn;
    }

    public static int[] d() {
        return f;
    }

    static {
        if (gr.d() == null) {
            gr.b(new int[2]);
        }
    }
}

