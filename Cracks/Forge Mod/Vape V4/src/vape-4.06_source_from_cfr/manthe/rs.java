/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A6;
import manthe.Az;
import manthe.BL;
import manthe.Cj;
import manthe.D3;
import manthe.D7;
import manthe.DB;
import manthe.DM;
import manthe.d0;
import manthe.ds;
import manthe.mB;
import manthe.my;
import manthe.na;
import manthe.on;
import manthe.p1;
import manthe.pd;
import manthe.r1;
import manthe.r6;
import manthe.rD;
import manthe.rQ;
import manthe.rf;
import manthe.rg;
import manthe.rl;
import manthe.sb;
import manthe.sf;

public class rs
extends r1 {
    private final rf aj = new rf(false);
    private final int ah = 200;
    private r6 ag;
    public DB ai = DB.a((Object)this, "Login Offline Mode", false, "Logs into an account in offline mode.");
    rg af;
    private static int ae;

    public rs() {
        super("Alts", false);
        this.aj().e(1.0);
        this.aj().c(new Color(100, 100, 100, 40));
        this.aj().a(new D3(0.0, 0.0, 5000, 1, new pd(0, 0, 0, 0)));
        rf rf2 = new rf(false);
        rf2.c(this.q());
        rf2.b(20.0);
        rf2.a(new D3(2.0, 0.0, 5000, 5, new pd(2, 2, 0, 0)));
        rl rl2 = new rl("Alts", my.c, 1.25);
        rl2.c(48.0);
        rl2.b(20.0);
        rl2.j(false);
        rf2.b(rl2);
        rQ rQ2 = new rQ("import", 0.35f, 2.0f, 2.0f, true);
        rQ2.b("Import alts from a file, in a username:password format");
        rQ2.c(15.0);
        rQ2.b(15.0);
        rQ2.a(new BL(this));
        rf2.b(rQ2);
        rQ rQ3 = new rQ("export", 0.35f, 2.0f, 2.0f, true);
        rQ3.b("Export alts to a file, in a username:password format");
        rQ3.c(15.0);
        rQ3.b(15.0);
        rQ3.a(new mB(this));
        rf2.b(rQ3);
        rQ rQ4 = new rQ("altening-3", 0.35f, 2.0f, 2.0f, true);
        rQ4.b("Generate alts with your Altening subscription");
        rQ4.c(15.0);
        rQ4.b(15.0);
        rQ4.a(new Az(this));
        rf2.b(rQ4);
        sb sb2 = new sb();
        sb2.c(100.0);
        sb2.b(15.0);
        sb2.a("Filter");
        sb2.e(1.0);
        sb2.c(new Color(100, 100, 100, 40));
        sb2.a(new DM(this, sb2));
        rf2.b(sb2);
        this.aj().b(rf2);
        this.am();
    }

    public void a(String string) {
        try {
            String string2;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(new File(string)));
            while ((string2 = bufferedReader.readLine()) != null) {
                if (!string2.contains(":")) continue;
                String[] arrstring = string2.split(":");
                String string3 = arrstring[0];
                String string4 = arrstring[1];
                this.a(new Cj(string3, string4));
            }
            bufferedReader.close();
            on.p.D().b.b(string);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void d(String string) {
        try {
            PrintWriter printWriter = new PrintWriter(new File(string));
            for (p1 p12 : this.ag.A().v()) {
                if (!(p12 instanceof rD)) continue;
                rD rD2 = (rD)p12;
                printWriter.print(rD2.a().c() + ":" + rD2.a().b() + "\n");
            }
            printWriter.close();
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void a(sb sb2) {
        String string = sb2.z().E().toLowerCase();
        for (p1 p12 : this.ag.A().v()) {
            if (!(p12 instanceof rD)) continue;
            rD rD2 = (rD)p12;
            rD2.a(string.equals("") || rD2.a().c().toLowerCase().contains(string));
        }
    }

    private void am() {
        this.aj.a(new D7(2.0, 2.0, 5000, 1, new pd(2, 2, 2, 2)));
        this.ag = new r6(false);
        this.ag.c(200.0);
        this.ag.b(150.0);
        D7 d72 = new D7(0.0, 2.0, 5000, 1, new pd(0, 0, 0, 0));
        d72.g();
        this.ag.A().a(d72);
        this.aj.b(this.ag);
        rf rf2 = new rf(false);
        rf2.a(new D7(2.0, 2.0, 2, 2, new pd(0, 0, 0, 0)));
        rg rg2 = new rg("+", true);
        sf sf2 = new sf(this, rg2);
        sf2.c(184.0);
        sf2.b(15.0);
        sf2.a("username:password");
        sf2.e(1.0);
        sf2.c(new Color(100, 100, 100, 40));
        rf2.b(sf2);
        rg2.b(c);
        rg2.b(15.0);
        rg2.c(15.0);
        rg2.e(1.0);
        rg2.c(new Color(100, 100, 100, 40));
        rf2.b(rg2);
        this.aj.b(rf2);
        rf rf3 = new rf(false);
        rf3.a(new D7(2.0, 2.0, 1, 1, new pd(0, 0, 0, 0)));
        this.af = new rg("Undo Altening Auth", true);
        this.af.b("Disables TheAltening auth servers.\nNOTE: Will break your Altening session.");
        this.af.b(18.0);
        this.af.c(201.0);
        this.af.a(false);
        this.af.a(new na(this));
        rf3.b(this.af);
        this.aj.b(rf3);
        this.aj.b((p1)this.ai.c());
        rg2.a(new A6(this, sf2));
        this.aj().b(this.aj);
    }

    public void a(Cj cj2) {
        rD rD2 = new rD(this.ag, cj2, 200);
        this.ag.d(rD2);
    }

    @Override
    public void c() {
        this.d(false);
        this.f(false);
        this.Z().a(false);
        d0 d02 = ds.p();
        this.a((double)(d02.g() / 2) - this.q() / 2.0);
        this.d(d02.h() / 2 - 100);
        super.c();
    }

    @Override
    public void c(boolean bl) {
        ds.x().i();
        super.c(false);
    }

    public rg ao() {
        return this.af;
    }

    static void a(rs rs2, String string) {
        rs2.d(string);
    }

    static void a(rs rs2, sb sb2) {
        rs2.a(sb2);
    }

    public static void b(int n6) {
        ae = n6;
    }

    public static int al() {
        return ae;
    }

    public static int an() {
        int n6 = rs.al();
        if (n6 == 0) {
            return 51;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (rs.al() == 0) {
            rs.b(8);
        }
    }
}

