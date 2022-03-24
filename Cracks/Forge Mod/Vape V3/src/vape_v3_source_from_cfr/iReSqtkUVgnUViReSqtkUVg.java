/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class iReSqtkUVgnUViReSqtkUVg
implements Comparator<iReSqtkUVgpnviReSqtkUVg> {
    int a;

    public iReSqtkUVgnUViReSqtkUVg(int n) {
        this.a = n;
    }

    public int a(iReSqtkUVgpnviReSqtkUVg iReSqtkUVgpnviReSqtkUVg2, iReSqtkUVgpnviReSqtkUVg iReSqtkUVgpnviReSqtkUVg3) {
        int n = this.a;
        int n2 = iReSqtkUVgpnviReSqtkUVg2.a();
        int n3 = iReSqtkUVgpnviReSqtkUVg3.a();
        int n4 = n2 > n ? n2 - n : n - n2;
        int n5 = n3 > n ? n3 - n : n - n3;
        return n4 < n5 ? -1 : 0;
    }

    @Override
    public /* synthetic */ int compare(Object object, Object object2) {
        return this.a((iReSqtkUVgpnviReSqtkUVg)object, (iReSqtkUVgpnviReSqtkUVg)object2);
    }
}

