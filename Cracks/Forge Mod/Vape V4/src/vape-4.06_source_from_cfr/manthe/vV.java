/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;

public final class vV
extends Enum<vV> {
    public static final /* enum */ vV LEFT_CLICK = new vV();
    public static final /* enum */ vV MIDDLE_CLICK = new vV();
    public static final /* enum */ vV RIGHT_CLICK = new vV();
    private static final vV[] c;
    private static int b;

    public static vV[] values() {
        return (vV[])c.clone();
    }

    public static vV valueOf(String string) {
        return Enum.valueOf(vV.class, string);
    }

    static {
        vV.b(0);
        c = new vV[]{LEFT_CLICK, MIDDLE_CLICK, RIGHT_CLICK};
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int b() {
        return b;
    }

    public static int a() {
        int n6 = vV.b();
        if (n6 == 0) {
            return 116;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

