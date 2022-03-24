/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Multimap
 *  org.lwjgl.input.Keyboard
 *  org.lwjgl.input.Mouse
 */
import com.google.common.collect.Multimap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class iReSqtkUVgVUTiReSqtkUVg {
    public static boolean a = iReSqtkUVgauSiReSqtkUVg.d() > 13;
    public static String b = new String(new char[]{'\u00a7'});
    public final iReSqtkUVgFWjiReSqtkUVg c = new iReSqtkUVgFWjiReSqtkUVg("Sync Settings", false);
    public iReSqtkUVgZfciReSqtkUVg d = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Gui Color", iReSqtkUVgcvhiReSqtkUVg.i);
    public iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Show Tooltips", true, "Toggles visibility of these");
    public iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Ignore naked", false, "Ignore entities without armor or a held item");
    public iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Players", true, "Attack players");
    public iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Mobs", false, "Attack mobs");
    public iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "MiddleClick friends", true, "Click middle mouse button to add the player you are hovering over as a friend");
    public iReSqtkUVgoRmiReSqtkUVg j = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Blatant mode", false, "Required for certain features.\nThis may make your client detectable(via screenshare) until you restart Minecraft.\nThis cannot be disabled once enabled.");
    public iReSqtkUVgNEciReSqtkUVg k;
    private iReSqtkUVgoRmiReSqtkUVg n = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Teams by server", false, "Ignore players on your team designated by the server");
    private iReSqtkUVgoRmiReSqtkUVg o = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Teams by color", false, "Ignore players with the same name color as you");
    public iReSqtkUVgoRmiReSqtkUVg l = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Enable on load", false, "Enable blatant mode upon injecting vape");
    public iReSqtkUVgoRmiReSqtkUVg m = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Speed Check", false, "Disables any active movement modules\nwhen enabling another.");
    private List<iReSqtkUVgWaoiReSqtkUVg> p = new ArrayList<iReSqtkUVgWaoiReSqtkUVg>(Arrays.asList(this.d, this.g, this.h, this.f, this.n, this.o, this.i, this.e, this.j, this.l, this.m));

    public iReSqtkUVgVUTiReSqtkUVg() {
        if (iReSqtkUVgFuiiReSqtkUVg.y()) {
            ((iReSqtkUVgRNziReSqtkUVg)this.j.c()).D().a(new iReSqtkUVgUIxiReSqtkUVg(this));
            ((iReSqtkUVgRNziReSqtkUVg)this.j.c()).D().a(new iReSqtkUVgjoDiReSqtkUVg(this));
        } else {
            ((iReSqtkUVgRNziReSqtkUVg)this.j.c()).D().d(true);
            ((iReSqtkUVgRNziReSqtkUVg)this.j.c()).d(true);
            ((iReSqtkUVgRNziReSqtkUVg)this.j.c()).a_("Blatant mode not yet available for this Minecraft version");
        }
        ((iReSqtkUVgRNziReSqtkUVg)this.l.c()).D().a(new iReSqtkUVgKIziReSqtkUVg(this));
        ((iReSqtkUVgRNziReSqtkUVg)this.m.c()).D().a(new iReSqtkUVgKzGiReSqtkUVg(this));
        this.j.a(false);
        this.j.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.l});
        this.j.a(new iReSqtkUVgWaoiReSqtkUVg[]{this.m});
    }

    public static boolean a() {
        int n = iReSqtkUVgeLLiReSqtkUVg.i().d().d();
        int n2 = 100 + n;
        if (n2 == 0) {
            return iReSqtkUVgVSFiReSqtkUVg.a();
        }
        return Mouse.isButtonDown((int)n2);
    }

    public static boolean b() {
        int n = iReSqtkUVgeLLiReSqtkUVg.i().e().d();
        int n2 = 100 + n;
        if (n2 == 1) {
            return iReSqtkUVgVSFiReSqtkUVg.b();
        }
        return Mouse.isButtonDown((int)n2);
    }

    public static boolean a(iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg2) {
        int n = iReSqtkUVgqzriReSqtkUVg2.d();
        return n > 0 ? Keyboard.isKeyDown((int)n) : Mouse.isButtonDown((int)(100 + n));
    }

    public static double a(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        double d2 = 0.0;
        Multimap multimap = iReSqtkUVgyetiReSqtkUVg2.i();
        if (multimap.size() > 0) {
            iReSqtkUVguxviReSqtkUVg iReSqtkUVguxviReSqtkUVg2 = new iReSqtkUVguxviReSqtkUVg(multimap.values().toArray()[0]);
            d2 = iReSqtkUVguxviReSqtkUVg2.e();
        }
        return d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2, iReSqtkUVgDSGiReSqtkUVg.d());
    }

    public static double b(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        double d2 = 0.0;
        Multimap multimap = iReSqtkUVgyetiReSqtkUVg2.i();
        if (multimap.size() > 0) {
            iReSqtkUVguxviReSqtkUVg iReSqtkUVguxviReSqtkUVg2 = new iReSqtkUVguxviReSqtkUVg(multimap.values().toArray()[0]);
            d2 = iReSqtkUVguxviReSqtkUVg2.e();
        }
        return d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2, iReSqtkUVgDSGiReSqtkUVg.d());
    }

    public static double c(iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2) {
        double d2 = 0.0;
        Multimap multimap = iReSqtkUVgyetiReSqtkUVg2.i();
        if (multimap.size() > 0) {
            iReSqtkUVguxviReSqtkUVg iReSqtkUVguxviReSqtkUVg2 = new iReSqtkUVguxviReSqtkUVg(multimap.values().toArray()[0]);
            d2 = iReSqtkUVguxviReSqtkUVg2.e();
        }
        return d2 += (double)iReSqtkUVgBKdiReSqtkUVg.a(iReSqtkUVgyetiReSqtkUVg2, iReSqtkUVgDSGiReSqtkUVg.d());
    }

    public iReSqtkUVgnCWiReSqtkUVg[] c() {
        iReSqtkUVgnCWiReSqtkUVg[] arriReSqtkUVgnCWiReSqtkUVg = new iReSqtkUVgnCWiReSqtkUVg[this.p.size()];
        for (int i = 0; i < arriReSqtkUVgnCWiReSqtkUVg.length; ++i) {
            arriReSqtkUVgnCWiReSqtkUVg[i] = this.p.get(i).c();
        }
        return arriReSqtkUVgnCWiReSqtkUVg;
    }

    public boolean a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) {
            return false;
        }
        iReSqtkUVgtBCiReSqtkUVg iReSqtkUVgtBCiReSqtkUVg2 = new iReSqtkUVgtBCiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2);
        if (this.o.i().booleanValue()) {
            String string = iReSqtkUVgeLLiReSqtkUVg.e().aB().e();
            String string2 = iReSqtkUVgtBCiReSqtkUVg2.aB().e();
            if (string.startsWith(b) && string2.startsWith(b) && string.length() > 1 && string2.length() > 1) {
                int n;
                int n2 = n = string.charAt(1) == 'r' ? 3 : 1;
                if (string.charAt(n) == string2.charAt(n)) {
                    return true;
                }
            }
        }
        if (this.n.i().booleanValue()) {
            if (iReSqtkUVgtBCiReSqtkUVg2.bf().b() || iReSqtkUVgeLLiReSqtkUVg.e().bf().b()) {
                return false;
            }
            return iReSqtkUVgeLLiReSqtkUVg.e().bf().a(iReSqtkUVgtBCiReSqtkUVg2.bf());
        }
        return false;
    }

    public boolean b(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        if (this.k.b()) {
            return this.k.a(iReSqtkUVgjSjiReSqtkUVg2);
        }
        return false;
    }

    public boolean a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2, boolean bl) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgjSjiReSqtkUVg2.b()) {
            return false;
        }
        if (iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.ae)) {
            return false;
        }
        if (iReSqtkUVgjSjiReSqtkUVg2.equals(iReSqtkUVgtlXiReSqtkUVg2)) {
            return false;
        }
        if (!iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.n)) {
            return false;
        }
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13 && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.bZ)) {
            return false;
        }
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = new iReSqtkUVgVnKiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2.a());
        if (iReSqtkUVgVnKiReSqtkUVg2.aF() <= 0.0f) {
            return false;
        }
        if (bl && iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgVnKiReSqtkUVg2)) {
            return false;
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.j().a(iReSqtkUVgVnKiReSqtkUVg2)) {
            return false;
        }
        if (!this.g.i().booleanValue() && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) {
            return false;
        }
        if (!this.h.i().booleanValue() && (iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.at) || iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.F))) {
            return false;
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.r().f.i().booleanValue() && iReSqtkUVgrseiReSqtkUVg.b(iReSqtkUVgVnKiReSqtkUVg2)) {
            return false;
        }
        if (this.a(iReSqtkUVgVnKiReSqtkUVg2)) {
            return false;
        }
        return !this.b(iReSqtkUVgVnKiReSqtkUVg2);
    }

    public void a(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2) {
        if (this.m.i().booleanValue()) {
            iReSqtkUVgVQSiReSqtkUVg iReSqtkUVgVQSiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgVQSiReSqtkUVg.class);
            iReSqtkUVgHyViReSqtkUVg iReSqtkUVgHyViReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgHyViReSqtkUVg.class);
            iReSqtkUVgkAWiReSqtkUVg iReSqtkUVgkAWiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgkAWiReSqtkUVg.class);
            iReSqtkUVgoUdiReSqtkUVg iReSqtkUVgoUdiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgoUdiReSqtkUVg.class);
            List<iReSqtkUVgJZmiReSqtkUVg> list = Arrays.asList(iReSqtkUVgVQSiReSqtkUVg2, iReSqtkUVgHyViReSqtkUVg2, iReSqtkUVgkAWiReSqtkUVg2, iReSqtkUVgoUdiReSqtkUVg2);
            for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg3 : list) {
                if (iReSqtkUVgJZmiReSqtkUVg3 == null || iReSqtkUVgJZmiReSqtkUVg3.equals(iReSqtkUVgJZmiReSqtkUVg2) || !iReSqtkUVgJZmiReSqtkUVg3.b()) continue;
                iReSqtkUVgJZmiReSqtkUVg3.a();
            }
        }
    }
}

