/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.util.Set;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.ca;
import manthe.eX;

public class qs
implements ca {
    private final Set<Class> c;
    private final Color a;
    private static boolean b;

    public qs(Set<Class> set, Color color) {
        this.c = set;
        this.a = color;
    }

    public qs(Set<Class> set) {
        this(set, new Color(255, 255, 255));
    }

    @Override
    public boolean a(eX eX2) {
        for (Class class_ : this.c) {
            if (!eX2.a(class_)) continue;
            return true;
        }
        return false;
    }

    @Override
    public Color a(Object object) {
        return this.a;
    }

    public static void b(boolean bl) {
        b = bl;
    }

    public static boolean d() {
        return b;
    }

    public static boolean c() {
        boolean bl = qs.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (qs.d()) {
            qs.b(true);
        }
    }
}

