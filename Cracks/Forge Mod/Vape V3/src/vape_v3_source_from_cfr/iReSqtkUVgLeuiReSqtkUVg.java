/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

class iReSqtkUVgLeuiReSqtkUVg
implements iReSqtkUVgFeuiReSqtkUVg {
    final /* synthetic */ List a;
    final /* synthetic */ iReSqtkUVgFWjiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgFWjiReSqtkUVg c;
    final /* synthetic */ iReSqtkUVgczkiReSqtkUVg d;

    iReSqtkUVgLeuiReSqtkUVg(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2, List list, iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2, iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg3) {
        this.d = iReSqtkUVgczkiReSqtkUVg2;
        this.a = list;
        this.b = iReSqtkUVgFWjiReSqtkUVg2;
        this.c = iReSqtkUVgFWjiReSqtkUVg3;
    }

    public void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg2 = null;
        for (iReSqtkUVgFWjiReSqtkUVg iReSqtkUVgFWjiReSqtkUVg3 : this.a) {
            if (!iReSqtkUVgFWjiReSqtkUVg3.D().y()) continue;
            iReSqtkUVgFWjiReSqtkUVg2 = iReSqtkUVgFWjiReSqtkUVg3;
            break;
        }
        if (iReSqtkUVgFWjiReSqtkUVg2 == null) {
            return;
        }
        String string = iReSqtkUVgFWjiReSqtkUVg2.D().D();
        int n = this.a.size();
        String string2 = (String)string + "/" + n;
        this.b.a_(string2);
        this.b.D().a_(string2);
        this.c.a_(string2);
        this.c.D().a_(string2);
    }
}

