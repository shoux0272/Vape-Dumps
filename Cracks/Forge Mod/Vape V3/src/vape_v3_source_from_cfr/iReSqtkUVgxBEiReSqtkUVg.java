/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class iReSqtkUVgxBEiReSqtkUVg
implements Comparator<iReSqtkUVgCMeiReSqtkUVg> {
    final /* synthetic */ iReSqtkUVgkDCiReSqtkUVg a;

    iReSqtkUVgxBEiReSqtkUVg(iReSqtkUVgkDCiReSqtkUVg iReSqtkUVgkDCiReSqtkUVg2) {
        this.a = iReSqtkUVgkDCiReSqtkUVg2;
    }

    public int a(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2, iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg3) {
        if (iReSqtkUVgCMeiReSqtkUVg2.l() == iReSqtkUVgCMeiReSqtkUVg3.l()) {
            return 0;
        }
        return iReSqtkUVgCMeiReSqtkUVg2.l() > iReSqtkUVgCMeiReSqtkUVg3.l() ? -1 : 1;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((iReSqtkUVgCMeiReSqtkUVg)object, (iReSqtkUVgCMeiReSqtkUVg)object2);
    }
}

