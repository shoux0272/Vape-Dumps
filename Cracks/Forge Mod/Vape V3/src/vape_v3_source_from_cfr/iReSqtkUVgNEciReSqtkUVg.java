/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class iReSqtkUVgNEciReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgzAciReSqtkUVg b = new iReSqtkUVgzAciReSqtkUVg("Hypixel");
    private iReSqtkUVgzAciReSqtkUVg c = new iReSqtkUVgzAciReSqtkUVg("Mineplex");
    private iReSqtkUVgZyLiReSqtkUVg d = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Mode", this.b, this.b, this.c);
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Remove Bots", true, "Removes guaranteed bots.");
    private Map<Integer, Integer> f = new HashMap<Integer, Integer>();
    private Object g;

    public iReSqtkUVgNEciReSqtkUVg() {
        super("AntiBot", -16711707, iReSqtkUVgqTOiReSqtkUVg.f, "Removes anti-cheat bots");
        this.a(this.d, this.e);
    }

    public boolean a(iReSqtkUVgjSjiReSqtkUVg iReSqtkUVgjSjiReSqtkUVg2) {
        iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2;
        if (this.d.i() == this.b) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2;
            iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg3;
            if (!iReSqtkUVgVUTiReSqtkUVg.a) {
                return false;
            }
            if (iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d) && !(iReSqtkUVgDfKiReSqtkUVg3 = new iReSqtkUVgDfKiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2)).equals(iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e()) && iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgDfKiReSqtkUVg3) < 10.0f) {
                String string = iReSqtkUVgDfKiReSqtkUVg3.aB().e();
                if (this.f.getOrDefault(iReSqtkUVgDfKiReSqtkUVg3.y(), -1) < 20 || string.equalsIgnoreCase(iReSqtkUVgVUTiReSqtkUVg.b + "r" + iReSqtkUVgDfKiReSqtkUVg3.x() + iReSqtkUVgVUTiReSqtkUVg.b + "r") || string.contains("NPC") || this.f.getOrDefault(iReSqtkUVgDfKiReSqtkUVg3.y(), -1) < 20 && !this.x().contains(iReSqtkUVgDfKiReSqtkUVg3.aC())) {
                    return true;
                }
            }
        } else if (this.d.i() == this.c && iReSqtkUVgjSjiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.d) && (iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(iReSqtkUVgjSjiReSqtkUVg2)).aF() >= 0.0f) {
            return true;
        }
        return false;
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        iReSqtkUVguqNiReSqtkUVg iReSqtkUVguqNiReSqtkUVg2;
        this.a(this.d.i().N());
        if (this.d.i() == this.c) {
            if (!this.e.i().booleanValue()) {
                return;
            }
            if (this.g == null || iReSqtkUVgeLLiReSqtkUVg.g().a() != this.g) {
                this.f.clear();
                this.g = iReSqtkUVgeLLiReSqtkUVg.g().a();
            }
            iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            for (Object object : iReSqtkUVguqNiReSqtkUVg2.f()) {
                iReSqtkUVgDfKiReSqtkUVg iReSqtkUVgDfKiReSqtkUVg2 = new iReSqtkUVgDfKiReSqtkUVg(object);
                if (iReSqtkUVgDfKiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.e) || Float.isNaN(iReSqtkUVgDfKiReSqtkUVg2.aF()) || !(iReSqtkUVgDfKiReSqtkUVg2.A() > iReSqtkUVgtlXiReSqtkUVg2.A()) || !(iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgDfKiReSqtkUVg2) < 10.0f)) continue;
                iReSqtkUVguqNiReSqtkUVg2.a(iReSqtkUVgDfKiReSqtkUVg2);
                break;
            }
        }
        if (this.d.i() == this.b) {
            if (this.g == null || iReSqtkUVgeLLiReSqtkUVg.g().a() != this.g) {
                this.f.clear();
                this.g = iReSqtkUVgeLLiReSqtkUVg.g().a();
            }
            iReSqtkUVguqNiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.g();
            for (Iterator iterator : iReSqtkUVguqNiReSqtkUVg2.f()) {
                boolean bl;
                Object object;
                if (iReSqtkUVgSzRiReSqtkUVg.e.isAssignableFrom(iterator.getClass())) continue;
                object = new iReSqtkUVgDfKiReSqtkUVg(iterator);
                boolean bl2 = ((iReSqtkUVgjSjiReSqtkUVg)object).J();
                if (!(bl2 && ((iReSqtkUVgjSjiReSqtkUVg)object).am() || !(((iReSqtkUVgjSjiReSqtkUVg)object).A() - iReSqtkUVgeLLiReSqtkUVg.e().A() > 7.0))) {
                    this.f.put(((iReSqtkUVgjSjiReSqtkUVg)object).y(), 0);
                } else if (iReSqtkUVgeLLiReSqtkUVg.g().a((int)((iReSqtkUVgjSjiReSqtkUVg)object).z(), (int)((iReSqtkUVgjSjiReSqtkUVg)object).A(), (int)((iReSqtkUVgjSjiReSqtkUVg)object).B()).e() != iReSqtkUVgSxxiReSqtkUVg.d()) {
                    this.f.put(((iReSqtkUVgjSjiReSqtkUVg)object).y(), this.f.getOrDefault(((iReSqtkUVgjSjiReSqtkUVg)object).y(), -1) + 1);
                }
                String string = ((iReSqtkUVgjSjiReSqtkUVg)object).aB().e();
                boolean bl3 = bl = string.equalsIgnoreCase(((iReSqtkUVgjSjiReSqtkUVg)object).x() + iReSqtkUVgVUTiReSqtkUVg.b + "r") || string.equalsIgnoreCase(iReSqtkUVgVUTiReSqtkUVg.b + "r" + ((iReSqtkUVgjSjiReSqtkUVg)object).x() + iReSqtkUVgVUTiReSqtkUVg.b + "r");
                if (!this.e.i().booleanValue() || !((iReSqtkUVgjSjiReSqtkUVg)object).O() || this.f.get(((iReSqtkUVgjSjiReSqtkUVg)object).y()) >= 5 || !bl) continue;
                iReSqtkUVgeLLiReSqtkUVg.g().a((iReSqtkUVgjSjiReSqtkUVg)object);
                break;
            }
        }
    }

    @Override
    public void h() {
        this.f.clear();
    }

    private List<UUID> x() {
        ArrayList<UUID> arrayList = new ArrayList<UUID>();
        iReSqtkUVgMnMiReSqtkUVg iReSqtkUVgMnMiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e().d();
        Collection collection = iReSqtkUVgMnMiReSqtkUVg2.d();
        for (Object e : collection) {
            iReSqtkUVgOoCiReSqtkUVg iReSqtkUVgOoCiReSqtkUVg2 = new iReSqtkUVgOoCiReSqtkUVg(e);
            arrayList.add(iReSqtkUVgOoCiReSqtkUVg2.d().d());
        }
        return arrayList;
    }
}

