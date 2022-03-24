/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Iterator;

class iReSqtkUVgPepiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgOkOiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgczkiReSqtkUVg b;

    iReSqtkUVgPepiReSqtkUVg(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2, iReSqtkUVgOkOiReSqtkUVg iReSqtkUVgOkOiReSqtkUVg2) {
        this.b = iReSqtkUVgczkiReSqtkUVg2;
        this.a = iReSqtkUVgOkOiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (this.a.E().D().length() > 0) {
            ArrayList arrayList = new ArrayList(iReSqtkUVgczkiReSqtkUVg.a(this.b));
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = (iReSqtkUVgntKiReSqtkUVg)iterator.next();
                String string = this.a.E().D().toLowerCase();
                if (iReSqtkUVgntKiReSqtkUVg2.g().toLowerCase().contains(string) || iReSqtkUVgntKiReSqtkUVg2.f().toString().toLowerCase().contains(string)) continue;
                iterator.remove();
            }
            if (arrayList.isEmpty()) {
                iReSqtkUVgczkiReSqtkUVg.b(this.b).a_(false);
                iReSqtkUVgczkiReSqtkUVg.c(this.b).a_(false);
                iReSqtkUVgczkiReSqtkUVg.d(this.b).a_(false);
                iReSqtkUVgczkiReSqtkUVg.e(this.b).a_(false);
            } else {
                iReSqtkUVgczkiReSqtkUVg.a(this.b, arrayList, iReSqtkUVgczkiReSqtkUVg.d(this.b), iReSqtkUVgczkiReSqtkUVg.e(this.b));
                iReSqtkUVgczkiReSqtkUVg.b(this.b).a_(false);
                iReSqtkUVgczkiReSqtkUVg.c(this.b).a_(false);
                iReSqtkUVgczkiReSqtkUVg.d(this.b).a_(true);
                iReSqtkUVgczkiReSqtkUVg.e(this.b).a_(true);
            }
        } else {
            iReSqtkUVgczkiReSqtkUVg.b(this.b).a_(true);
            iReSqtkUVgczkiReSqtkUVg.c(this.b).a_(true);
            iReSqtkUVgczkiReSqtkUVg.d(this.b).a_(false);
            iReSqtkUVgczkiReSqtkUVg.e(this.b).a_(false);
        }
    }
}

