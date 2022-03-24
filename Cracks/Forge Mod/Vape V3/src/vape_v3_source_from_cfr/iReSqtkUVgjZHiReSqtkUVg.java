/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collections;

public class iReSqtkUVgjZHiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Check in Menu", false, "This will attempt to ignore Menus such as\nServer selectors, and settings inventory menus\nThis may not work 100% on all servers");
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Keep open", false, "Keep chest open after clearing");
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Shuffle", false, "Take items in a random order");
    private iReSqtkUVgfXGiReSqtkUVg e = iReSqtkUVgfXGiReSqtkUVg.a(this, "Click Delay", "#", "", 0.0, 75.0, 125.0, 300.0);
    private iReSqtkUVgeMGiReSqtkUVg f = iReSqtkUVgeMGiReSqtkUVg.a((Object)this, "cheatsteal-blacklisted", "Blacklisted", iReSqtkUVgeMGiReSqtkUVg.c, Collections.emptyList());
    private iReSqtkUVgPzKiReSqtkUVg g = new iReSqtkUVgPzKiReSqtkUVg();

    public iReSqtkUVgjZHiReSqtkUVg() {
        super("ChestSteal", -208, iReSqtkUVgqTOiReSqtkUVg.g, "Take items upon opening a chest");
        this.a(this.b, this.c, this.d, this.e, this.f);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.ak)) {
            iReSqtkUVglsoiReSqtkUVg iReSqtkUVglsoiReSqtkUVg2 = new iReSqtkUVglsoiReSqtkUVg(iReSqtkUVgeLLiReSqtkUVg.f());
            if (this.b.i().booleanValue() && !this.a(iReSqtkUVglsoiReSqtkUVg2)) {
                return;
            }
            if (!this.c.i().booleanValue() && this.x()) {
                iReSqtkUVgeLLiReSqtkUVg.e().aX();
                return;
            }
            ArrayList<Integer> arrayList = new ArrayList<Integer>();
            iReSqtkUVgPMaiReSqtkUVg iReSqtkUVgPMaiReSqtkUVg2 = iReSqtkUVglsoiReSqtkUVg2.f();
            for (int i = 0; i < iReSqtkUVgPMaiReSqtkUVg2.e(); ++i) {
                iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgPMaiReSqtkUVg2.a(i);
                if (iReSqtkUVgyetiReSqtkUVg2.b() || iReSqtkUVgyetiReSqtkUVg2.toString().contains("tile.air") || this.f.a(iReSqtkUVgyetiReSqtkUVg2, true)) continue;
                arrayList.add(i);
            }
            if (!arrayList.isEmpty()) {
                if (this.d.i().booleanValue()) {
                    Collections.shuffle(arrayList);
                }
                if (this.g.a(iReSqtkUVgXsIiReSqtkUVg.a(this.e))) {
                    iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVglsoiReSqtkUVg2.g().e(), (Integer)arrayList.get(0), 0, 1, iReSqtkUVgeLLiReSqtkUVg.e());
                    iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVglsoiReSqtkUVg2.g().e(), (Integer)arrayList.get(0), 0, 1, iReSqtkUVgeLLiReSqtkUVg.e());
                    this.g.b();
                }
            } else if (!this.c.i().booleanValue()) {
                iReSqtkUVgeLLiReSqtkUVg.e().aX();
            }
        }
    }

    private boolean a(iReSqtkUVglsoiReSqtkUVg iReSqtkUVglsoiReSqtkUVg2) {
        iReSqtkUVgPMaiReSqtkUVg iReSqtkUVgPMaiReSqtkUVg2 = iReSqtkUVglsoiReSqtkUVg2.f();
        String string = iReSqtkUVglsoiReSqtkUVg2.f().d();
        return !iReSqtkUVgPMaiReSqtkUVg2.f() || string.equalsIgnoreCase(iReSqtkUVggDViReSqtkUVg.a("container.chest", new Object[0]).f().toLowerCase());
    }

    private boolean b(iReSqtkUVglsoiReSqtkUVg iReSqtkUVglsoiReSqtkUVg2) {
        iReSqtkUVgPMaiReSqtkUVg iReSqtkUVgPMaiReSqtkUVg2 = iReSqtkUVglsoiReSqtkUVg2.f();
        for (int i = 0; i <= iReSqtkUVgPMaiReSqtkUVg2.e(); ++i) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgPMaiReSqtkUVg2.a(i);
            if (iReSqtkUVgyetiReSqtkUVg2.b() || this.f.a(iReSqtkUVgyetiReSqtkUVg2)) continue;
            return false;
        }
        return true;
    }

    private boolean x() {
        iReSqtkUVgMECiReSqtkUVg iReSqtkUVgMECiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().ba();
        for (int i = 9; i <= 44; ++i) {
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgMECiReSqtkUVg2.a(i).d();
            if (!iReSqtkUVgyetiReSqtkUVg2.b() && !iReSqtkUVgyetiReSqtkUVg2.toString().contains("tile.air")) continue;
            return false;
        }
        return true;
    }
}

