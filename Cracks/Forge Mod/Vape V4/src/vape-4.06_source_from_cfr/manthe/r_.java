/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import manthe.D7;
import manthe.Dk;
import manthe.Ds;
import manthe.kh;
import manthe.my;
import manthe.on;
import manthe.p1;
import manthe.pH;
import manthe.pS;
import manthe.pd;
import manthe.rg;
import manthe.ri;
import manthe.s7;
import manthe.vt;
import manthe.zu;

public class r_
extends ri {
    public r_() {
        super("Settings", 16, 16);
        this.f(true);
        zu zu2 = on.p.H().b(zu.class);
        D7 d72 = new D7(0.0, 1.0, 5000, 1, new pd(0, 2, 2, 2));
        this.aj().a(d72);
        this.aj().b((p1)on.p.D().a.c());
        for (Ds object2 : zu2.r()) {
            if (object2.c() == null) continue;
            this.aj().b((p1)object2.c());
        }
        rg rg2 = this.a("Reset current profile");
        rg2.b("This will set your current profile to\nthe default settings of Vape");
        rg2.a(new pS(this));
        rg rg3 = this.a("Reset GUI positions");
        rg3.b("This will reset your GUI back to the default");
        rg3.a(new vt(this));
        rg rg4 = this.a("Sort GUI");
        rg4.b("Sorts GUI by size");
        rg4.a(new pH(this, zu2));
        rg rg5 = this.a("Edit GUI");
        rg5.b("Allows you to hide or show certain components of the GUI");
        rg5.a(new Dk(this, zu2));
        zu zu3 = on.p.H().b(zu.class);
        s7 s72 = new s7(zu3);
        s72.a("Rebind GUI");
        s72.W().e(0.5);
        s72.b(10.0);
        s72.c(96.0);
        s72.ab().J();
        s72.W().a(new kh(this, s72));
        this.aj().b(rg2);
        this.aj().b(rg3);
        this.aj().b(rg4);
        this.aj().b(rg5);
        this.aj().b(s72);
        this.k(true);
        this.aj().b(new Color(45, 45, 45, 255));
    }

    private rg a(String string) {
        int n6 = 80;
        rg rg2 = new rg(string, true);
        rg2.z().b(my.c);
        rg2.e(0.5);
        rg2.c(e);
        rg2.z().e(0.75);
        ((D7)rg2.u()).f().c = 2;
        rg2.b(10.0);
        rg2.c(n6);
        rg2.a(new Color(128, 128, 128, 32));
        return rg2;
    }
}

