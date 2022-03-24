/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class iReSqtkUVgvzCiReSqtkUVg
implements Comparator<iReSqtkUVgntKiReSqtkUVg> {
    final /* synthetic */ iReSqtkUVgczkiReSqtkUVg a;

    iReSqtkUVgvzCiReSqtkUVg(iReSqtkUVgczkiReSqtkUVg iReSqtkUVgczkiReSqtkUVg2) {
        this.a = iReSqtkUVgczkiReSqtkUVg2;
    }

    public int a(iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2, iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg3) {
        if (iReSqtkUVgntKiReSqtkUVg2.l() == iReSqtkUVgntKiReSqtkUVg3.l()) {
            return 0;
        }
        return iReSqtkUVgntKiReSqtkUVg2.l() > iReSqtkUVgntKiReSqtkUVg3.l() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((iReSqtkUVgntKiReSqtkUVg)object, (iReSqtkUVgntKiReSqtkUVg)object2);
    }
}

