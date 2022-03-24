/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import a.a;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.BG;
import manthe.bP;
import manthe.t;

public class gJ {
    protected Class c;
    private static int b;

    public gJ(String string) {
        this.c = a.gc(string);
        t.b_.add(this);
    }

    public gJ(Class class_) {
        this.c = class_;
        t.b_.add(this);
    }

    protected bP a(String string, boolean bl, Class class_, Class ... arrclass) {
        return new bP(this.c, string, bl, false, class_, arrclass);
    }

    protected bP a(Class class_, String string, boolean bl, Class class_2, Class ... arrclass) {
        return new bP(class_, string, bl, false, class_2, arrclass);
    }

    protected bP c(String string, boolean bl, String string2) {
        return new bP(this.c, string, bl, false, string2);
    }

    protected bP b(String string, boolean bl, Class class_, Class ... arrclass) {
        return new bP(this.c, string, bl, true, class_, arrclass);
    }

    protected bP b(Class class_, String string, boolean bl, Class class_2, Class ... arrclass) {
        return new bP(class_, string, bl, true, class_2, arrclass);
    }

    protected BG b(String string, boolean bl, Class class_) {
        return new BG(this.c, string, bl, false, class_);
    }

    protected BG a(String string, boolean bl, String string2) {
        return new BG(this.c, string, bl, false, string2);
    }

    protected BG a(String string, boolean bl, Class class_) {
        return new BG(this.c, string, bl, true, class_);
    }

    protected BG a(Class class_, String string, boolean bl, Class class_2) {
        return new BG(class_, string, bl, true, class_2);
    }

    protected BG b(String string, boolean bl, String string2) {
        return new BG(this.c, string, bl, true, string2);
    }

    public Class c() {
        return this.c;
    }

    public static void b(int n6) {
        b = n6;
    }

    public static int b() {
        return b;
    }

    public static int a() {
        int n6 = gJ.b();
        if (n6 == 0) {
            return 68;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException b(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (gJ.b() == 0) {
            gJ.b(6);
        }
    }
}

