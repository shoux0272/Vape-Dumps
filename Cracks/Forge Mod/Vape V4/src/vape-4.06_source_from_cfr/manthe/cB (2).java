/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
package manthe;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.B0;
import manthe.B3;
import manthe.DB;
import manthe.DE;
import manthe.DX;
import manthe.Ds;
import manthe.L;
import manthe.V;
import manthe.d5;
import manthe.ds;
import manthe.e2;
import manthe.e5;
import manthe.e6;
import manthe.eC;
import manthe.eJ;
import manthe.ei;
import manthe.ej;
import manthe.eq;
import manthe.ex;
import manthe.ey;
import manthe.fG;
import manthe.oj;
import manthe.on;
import manthe.p1;
import manthe.pb;
import manthe.pf;
import manthe.qD;
import manthe.rg;
import manthe.u5;
import manthe.uz;
import manthe.xp;
import manthe.y0;
import manthe.y5;
import manthe.zG;
import manthe.zM;
import manthe.zQ;
import manthe.zz;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class cB {
    private static final HashMap<Character, Color> L = new HashMap();
    public static boolean h;
    public static boolean C;
    public static String v;
    public final rg s = new rg("Sync Settings", false);
    public final DB u = DB.a((Object)this, "Teams by server", false, "Ignore players on your team designated by the server\n\u00a7cThis is not guaranteed to be accurate, as server teams are assigned by the server");
    public final DB t = DB.a((Object)this, "Teams by color", false, "Ignore players with the selected name color");
    public final DB K = DB.a((Object)this, "Recolor visuals", false, "Changes colors of visuals(Tracers, ESP) to their according team color");
    private final HashMap<pb, Character> j = new HashMap();
    private final pb p;
    private final pb l;
    private final pb I;
    private final pb o;
    private final pb G;
    private final pb c;
    private final pb F;
    private final pb D;
    private final pb m;
    private final pb b;
    private final pb B;
    private final pb M;
    private final pb g;
    private final pb H;
    private final pb w;
    private final pb q;
    public final DB O = DB.a((Object)this, "Auto-Detect color", true, "Automatically detects your team color\n\u00a7cThis is not guaranteed to be accurate, this relies on the server giving you the same name color as your teammates");
    private final List<Ds> J;
    public DE r = DE.a((Object)this, "Gui Color", new Color(5, 134, 105));
    public DB y = DB.a((Object)this, "MiddleClick friends", true, "Click middle mouse button to add the player you are hovering over as a friend");
    public DB x = DB.a((Object)this, "Blatant mode", false, "Required for certain features.\nThis may make your client detectable(via screenshare) until you restart Minecraft.\nThis cannot be disabled once enabled.");
    public y0 E;
    public DB f = DB.a((Object)this, "Show NBT Tags", false, "Shows NBT tags set by the server.\nUseful for servers with custom items.");
    public DB n = DB.a((Object)this, "Enable on load", false, "Enable blatant mode upon injecting vape");
    public DB N = DB.a((Object)this, "Speed Check", false, "Disables any active movement modules\nwhen enabling another.");
    public DB z = DB.a((Object)this, "Lobby Check", false, "Temporarily disables certain features in server lobbies.");
    public DB a = DB.a((Object)this, "Sanity Check", false, "Disables all modules when you connect/disconnect from a server.");
    public DB k = DB.a((Object)this, "Health prediction", false, "Estimates player health on pvp servers\nBy default attacks and health pots will be estimated\nNOTE: This feature may not always be accurate!");
    public DB i = DB.a((Object)this, "Estimate Food", true, "Automatically estimates food + healing from food.");
    public DB A = DB.a((Object)this, "Estimate Fall", true, "Automatically estimates damage from falling.");
    public DX d;
    private static int e;

    public cB() {
        this.p = new pb("\u00a7aGreen", 0.8);
        this.j.put(this.p, Character.valueOf('a'));
        this.l = new pb("\u00a72Dark Green", 0.8);
        this.j.put(this.l, Character.valueOf('2'));
        this.I = new pb("\u00a7cRed", 0.8);
        this.j.put(this.I, Character.valueOf('c'));
        this.o = new pb("\u00a74Dark Red", 0.8);
        this.j.put(this.o, Character.valueOf('4'));
        this.G = new pb("\u00a7eYellow", 0.8);
        this.j.put(this.G, Character.valueOf('e'));
        this.c = new pb("\u00a76Gold", 0.8);
        this.j.put(this.c, Character.valueOf('6'));
        this.F = new pb("\u00a79Blue", 0.8);
        this.j.put(this.F, Character.valueOf('9'));
        this.D = new pb("\u00a71Dark Blue", 0.8);
        this.j.put(this.D, Character.valueOf('1'));
        this.m = new pb("\u00a7bAqua", 0.8);
        this.j.put(this.m, Character.valueOf('b'));
        this.b = new pb("\u00a73Dark Aqua", 0.8);
        this.j.put(this.b, Character.valueOf('3'));
        this.B = new pb("\u00a7dPurple", 0.8);
        this.j.put(this.B, Character.valueOf('d'));
        this.M = new pb("\u00a75Dark Purple", 0.8);
        this.j.put(this.M, Character.valueOf('5'));
        this.g = new pb("\u00a77Gray", 0.8);
        this.j.put(this.g, Character.valueOf('7'));
        this.H = new pb("\u00a78Dark Gray", 0.8);
        this.j.put(this.H, Character.valueOf('8'));
        this.w = new pb("\u00a7fWhite", 0.8);
        this.j.put(this.w, Character.valueOf('f'));
        this.q = new pb("\u00a70Black", 0.8);
        this.j.put(this.q, Character.valueOf('0'));
        this.d = DX.a((Object)this, "Your team color", "Uses this color to determine your team", this.p, 2, this.o, this.I, this.c, this.G, this.l, this.p, this.m, this.b, this.D, this.F, this.B, this.M, this.w, this.g, this.H, this.q);
        this.t.a(this.K, this.O, this.d);
        this.r.e(true);
        this.J = new ArrayList<Ds>(Arrays.asList(this.r, this.u, this.t, this.K, this.O, this.d, this.y, this.z, this.a, this.f, this.x, this.n, this.N, this.k, this.i, this.A));
        this.k.a(this.i, this.A);
        if (on.C()) {
            ((qD)this.x.c()).a().a(new oj(this));
            ((qD)this.x.c()).a().a(new uz(this));
        } else {
            ((qD)this.x.c()).a().b(true);
            ((qD)this.x.c()).b(true);
            ((qD)this.x.c()).b("Blatant mode not yet available for this Minecraft version");
        }
        ((qD)this.n.c()).a().a(new B0(this));
        ((qD)this.N.c()).a().a(new B3(this));
        this.x.a(false);
        this.x.a(new Ds[]{this.n});
        this.x.a(new Ds[]{this.N});
    }

    public static boolean f() {
        int n6 = ds.s().m().i();
        int n10 = 100 + n6;
        if (n10 == 0) {
            return u5.e();
        }
        return u5.f();
    }

    public static boolean d() {
        int n6 = ds.s().s().i();
        int n10 = 100 + n6;
        if (n10 == 1) {
            return u5.f();
        }
        return u5.e();
    }

    public static boolean a(ei ei2) {
        int n6 = ei2.i();
        return n6 > 0 ? Keyboard.isKeyDown((int)n6) : Mouse.isButtonDown((int)(100 + n6));
    }

    public static double c(fG fG2) {
        double d10 = 0.0;
        d5 d52 = fG2.f();
        if (d52.f() > 0) {
            e6 e62 = new e6(d52.g().toArray()[0]);
            d10 = e62.g();
        }
        d10 += (double)eq.a(fG2, ey.f());
        return d10 += (double)((float)eq.a(e5.g().l(), fG2) * 0.01f);
    }

    public static double a(fG fG2) {
        double d10 = 0.0;
        d5 d52 = fG2.f();
        if (d52.f() > 0) {
            e6 e62 = new e6(d52.g().toArray()[0]);
            d10 = e62.g();
        }
        return d10 += (double)eq.a(fG2, ey.f());
    }

    public static double b(fG fG2) {
        double d10 = 0.0;
        d5 d52 = fG2.f();
        if (d52.f() > 0) {
            e6 e62 = new e6(d52.g().toArray()[0]);
            d10 = e62.g();
        }
        return d10 += (double)eq.a(fG2, ey.f());
    }

    public static boolean a(int n6) {
        if (n6 < 0) {
            return Mouse.isButtonDown((int)(100 + n6));
        }
        return Keyboard.isKeyDown((int)n6);
    }

    private static Color a(char c3) {
        if (L.containsKey(Character.valueOf(c3))) {
            return L.get(Character.valueOf(c3));
        }
        double[] arrd = new double[4];
        if (c3 == '4') {
            arrd[0] = 1.0;
            arrd[1] = 0.0;
            arrd[2] = 0.0;
        }
        if (c3 == 'c') {
            arrd[0] = 1.0;
            arrd[1] = 0.33;
            arrd[2] = 0.33;
        }
        if (c3 == '6') {
            arrd[0] = 1.0;
            arrd[1] = 0.66;
            arrd[2] = 0.0;
        }
        if (c3 == 'e') {
            arrd[0] = 1.0;
            arrd[1] = 1.0;
            arrd[2] = 0.33;
        }
        if (c3 == '2') {
            arrd[0] = 0.0;
            arrd[1] = 0.66;
            arrd[2] = 0.0;
        }
        if (c3 == 'a') {
            arrd[0] = 0.33;
            arrd[1] = 1.0;
            arrd[2] = 0.33;
        }
        if (c3 == 'b') {
            arrd[0] = 0.33;
            arrd[1] = 1.0;
            arrd[2] = 1.0;
        }
        if (c3 == '3') {
            arrd[0] = 0.0;
            arrd[1] = 0.66;
            arrd[2] = 0.66;
        }
        if (c3 == '1') {
            arrd[0] = 0.0;
            arrd[1] = 0.0;
            arrd[2] = 0.66;
        }
        if (c3 == '9') {
            arrd[0] = 0.33;
            arrd[1] = 0.33;
            arrd[2] = 1.0;
        }
        if (c3 == 'd') {
            arrd[0] = 1.0;
            arrd[1] = 0.33;
            arrd[2] = 1.0;
        }
        if (c3 == '5') {
            arrd[0] = 0.66;
            arrd[1] = 0.0;
            arrd[2] = 0.66;
        }
        if (c3 == 'f') {
            arrd[0] = 1.0;
            arrd[1] = 1.0;
            arrd[2] = 1.0;
        }
        if (c3 == '7') {
            arrd[0] = 0.66;
            arrd[1] = 0.66;
            arrd[2] = 0.66;
        }
        if (c3 == '8') {
            arrd[0] = 0.33;
            arrd[1] = 0.33;
            arrd[2] = 0.33;
        }
        if (c3 == '0') {
            arrd[0] = 0.0;
            arrd[1] = 0.0;
            arrd[2] = 0.0;
        }
        Color color = new Color((int)(arrd[0] * 255.0), (int)(arrd[1] * 255.0), (int)(arrd[2] * 255.0));
        L.put(Character.valueOf(c3), color);
        return color;
    }

    public p1[] e() {
        p1[] arrp1 = new p1[this.J.size()];
        for (int k = 0; k < arrp1.length; ++k) {
            arrp1[k] = this.J.get(k).c();
        }
        return arrp1;
    }

    public void g() {
        if (this.t.u().booleanValue() && this.O.u().booleanValue()) {
            eJ eJ2 = ds.k();
            if (eJ2.e()) {
                return;
            }
            String string = xp.a(eJ2);
            if (string.startsWith(v) && string.length() > 3) {
                int n6 = string.charAt(1) == 'r' ? 3 : 1;
                char c3 = string.charAt(n6);
                for (pb pb2 : this.j.keySet()) {
                    char c4 = this.j.get(pb2).charValue();
                    if (c3 != c4) continue;
                    this.d.b(true);
                    this.d.a(pb2);
                    this.d.b(false);
                }
            }
        }
    }

    public boolean a(ex ex2) {
        if (!ex2.a(A5.L)) {
            return false;
        }
        e2 e22 = new e2(ex2);
        if (this.t.u().booleanValue()) {
            String string = xp.a(e22);
            char c3 = this.j.get(this.d.v()).charValue();
            if (string.startsWith(v) && string.length() > 3) {
                int n6;
                int n10 = n6 = string.charAt(1) == 'r' ? 3 : 1;
                if (c3 == string.charAt(n6)) {
                    return true;
                }
            }
        }
        if (this.u.u().booleanValue()) {
            if (e22.a9().e() || ds.k().a9().e()) {
                return false;
            }
            return ds.k().a9().a(e22.a9());
        }
        return false;
    }

    public boolean b(ex ex2) {
        if (V.c() == 13) {
            return false;
        }
        if (this.E.N()) {
            if (ds.k().e()) {
                return false;
            }
            return this.E.a(ex2);
        }
        return false;
    }

    public boolean a(ex ex2, boolean bl) {
        eJ eJ2 = ds.k();
        if (ex2.e()) {
            return false;
        }
        if (ex2.a(A5.dj)) {
            return false;
        }
        if (ex2.equals(eJ2)) {
            return false;
        }
        if (!ex2.a(A5.cF)) {
            return false;
        }
        if (V.c() > 13 && ex2.a(A5.a8)) {
            return false;
        }
        ej ej2 = new ej(ex2.a());
        if (ej2.aD() <= 0.0f) {
            return false;
        }
        if (bl && pf.b(ej2)) {
            return false;
        }
        if (on.p.N().a(ej2)) {
            return false;
        }
        if (this.a(ej2)) {
            return false;
        }
        return !this.b(ej2);
    }

    public boolean c() {
        return this.z.u() != false && !ds.k().a8().m();
    }

    public void a(y5 y52) {
        if (this.N.u().booleanValue()) {
            zG zG2 = on.p.H().b(zG.class);
            zM zM2 = on.p.H().b(zM.class);
            zz zz2 = on.p.H().b(zz.class);
            zQ zQ2 = on.p.H().b(zQ.class);
            List<y5> list = Arrays.asList(zG2, zM2, zz2, zQ2);
            for (y5 y53 : list) {
                if (y53 == null || y53.equals(y52) || !y53.N()) continue;
                y53.z();
            }
        }
    }

    public L a(eC eC2, boolean bl) {
        if (!(bl || this.t.u().booleanValue() && this.K.u().booleanValue())) {
            return null;
        }
        String string = xp.a(eC2);
        if (string.startsWith(v) && string.length() > 3) {
            int n6 = string.charAt(1) == 'r' ? 3 : 1;
            char c3 = string.charAt(n6);
            return new L(cB.a(c3));
        }
        return null;
    }

    public L b(eC eC2) {
        return this.a(eC2, false);
    }

    public L a(eC eC2) {
        if (on.p.N().c(eC2.S()) && on.p.N().c.u().booleanValue()) {
            return on.p.N().e.K();
        }
        if (on.p.b().a(eC2.S()) && on.p.b().c.u().booleanValue()) {
            return on.p.b().e.K();
        }
        return this.b(eC2);
    }

    static {
        cB.b(0);
        h = V.c() > 13;
        C = false;
        v = new String(new char[]{'\u00a7'});
    }

    public static void b(int n6) {
        e = n6;
    }

    public static int b() {
        return e;
    }

    public static int a() {
        int n6 = cB.b();
        if (n6 == 0) {
            return 29;
        }
        return 0;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }
}

