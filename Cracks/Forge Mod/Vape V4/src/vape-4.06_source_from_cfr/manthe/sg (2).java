/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.Ak;
import manthe.C3;
import manthe.D3;
import manthe.DS;
import manthe.bG;
import manthe.my;
import manthe.ob;
import manthe.ol;
import manthe.pd;
import manthe.rQ;
import manthe.rf;
import manthe.rl;

public class sg
extends rf {
    private final Ak J;
    private static int I;

    public sg(Ak ak, double d10) {
        super(true);
        this.J = ak;
        this.c(d10);
        this.b(75.0);
        rf rf2 = new rf(false);
        rf2.a(new D3(0.0, 0.0, 5000, 2, new pd(0, 0, 0, 1)));
        rf2.b(c);
        rf2.j(false);
        rf2.c(this.q());
        rf2.b(20.0);
        rl rl2 = new rl(ak.r(), my.i, 1.0);
        rl2.b(10.0);
        rl2.j(false);
        rf2.b(rl2);
        this.b(rf2);
        if (ak.k()) {
            rl2.c(rf2.q());
            this.a(new D3(2.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
            rf rf3 = new rf(false);
            rf3.a(new D3(2.0, 0.0, 5000, 3, new pd(0, 0, 0, 0)));
            rf3.b(c);
            rf3.c(this.q());
            rf3.b(20.0);
            rQ rQ2 = new rQ("upload", 0.5f, 6.0f, -1.0f, true);
            rQ2.b("Update your profile");
            rQ2.d(Color.BLACK);
            rQ2.a(Color.WHITE);
            rQ2.c(this.q() * 0.33);
            rQ2.b(15.0);
            rQ2.a(new ob(this));
            rf3.b(rQ2);
            rQ rQ3 = new rQ("copy", 0.33f, 8.5f, 2.0f, true);
            rQ3.b("Copy profile UUID");
            rQ3.d(Color.BLACK);
            rQ3.a(Color.WHITE);
            rQ3.c(this.q() * 0.33);
            rQ3.b(15.0);
            rQ3.a(new ol(this, ak));
            rf3.b(rQ3);
            rQ rQ4 = new rQ("delete", 0.5f, 6.0f, -1.0f, true);
            rQ4.b("Make profile private");
            rQ4.d(Color.BLACK);
            rQ4.a(Color.WHITE);
            rQ4.c(this.q() * 0.33);
            rQ4.b(15.0);
            rQ4.a(new bG(this, ak));
            rf3.b(rQ4);
            this.b(rf3);
        } else {
            rl2.c(rf2.q() * 0.82);
            this.a(new D3(2.0, 2.0, 1, 2, new pd(2, 2, 2, 2)));
            rf rf4 = new rf(false);
            rf4.a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
            rf4.b(c);
            rf4.c(this.q());
            rf4.b(20.0);
            rQ rQ5 = new rQ("world", 0.28f, 1.6f, 3.5f, true);
            rQ5.b("Make profile public");
            rQ5.d(Color.BLACK);
            rQ5.a(Color.WHITE);
            rQ5.c(13.0);
            rQ5.b(17.0);
            rQ5.a(new DS(this, ak, rl2));
            rQ5.a(new C3(this, ak, rl2));
            rf4.b(rQ5);
            this.b(rf4);
        }
    }

    @Override
    public Color f() {
        return c;
    }

    public Ak a() {
        return this.J;
    }

    public static void b(int n6) {
        I = n6;
    }

    public static int y() {
        return I;
    }

    public static int x() {
        int n6 = sg.y();
        if (n6 == 0) {
            return 106;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (sg.x() != 0) {
            sg.b(22);
        }
    }
}

