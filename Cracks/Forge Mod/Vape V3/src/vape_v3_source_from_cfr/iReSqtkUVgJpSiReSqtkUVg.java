/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgJpSiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    public iReSqtkUVgJpSiReSqtkUVg() {
        super("Friends", 0, 0, iReSqtkUVgqTOiReSqtkUVg.b, null);
    }

    @Override
    public void i() {
        this.a();
    }

    @Override
    public void a(iReSqtkUVgeoIiReSqtkUVg iReSqtkUVgeoIiReSqtkUVg2) {
        if (!iReSqtkUVgFuiiReSqtkUVg.e.j().c.i().booleanValue()) {
            return;
        }
        iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.j().a(iReSqtkUVgeoIiReSqtkUVg2.a(), false);
        if (iReSqtkUVgFuiiReSqtkUVg.e.j().c.i().booleanValue()) {
            if (iReSqtkUVgMWviReSqtkUVg2 != null && iReSqtkUVgMWviReSqtkUVg2.d()) {
                iReSqtkUVgeoIiReSqtkUVg2.a(iReSqtkUVgMWviReSqtkUVg2.c());
            }
        } else {
            iReSqtkUVgeoIiReSqtkUVg2.a(iReSqtkUVgeoIiReSqtkUVg2.b());
        }
    }

    @Override
    public void a(iReSqtkUVgFltiReSqtkUVg iReSqtkUVgFltiReSqtkUVg2) {
        if (!iReSqtkUVgFuiiReSqtkUVg.e.j().c.i().booleanValue()) {
            return;
        }
        for (iReSqtkUVgMWviReSqtkUVg iReSqtkUVgMWviReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.j().a()) {
            if (!iReSqtkUVgMWviReSqtkUVg2.d() || !iReSqtkUVgFltiReSqtkUVg2.a().f().toLowerCase().contains(iReSqtkUVgMWviReSqtkUVg2.a().toLowerCase())) continue;
            String string = iReSqtkUVgFltiReSqtkUVg2.a().e();
            int n = string.toLowerCase().indexOf(iReSqtkUVgMWviReSqtkUVg2.a().toLowerCase());
            while (n >= 0) {
                String string2 = string.substring(n, n + iReSqtkUVgMWviReSqtkUVg2.a().toLowerCase().length());
                string = string.replaceAll(string2, iReSqtkUVgMWviReSqtkUVg2.b());
                n = string.toLowerCase().indexOf(iReSqtkUVgMWviReSqtkUVg2.a());
            }
            iReSqtkUVgFltiReSqtkUVg2.a(iReSqtkUVgxrtiReSqtkUVg.a(string));
        }
    }
}

