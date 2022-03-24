/*
 * Decompiled with CFR 0.150.
 */
import a.a;

class iReSqtkUVgRsPiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgnWNiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgQsfiReSqtkUVg b;

    iReSqtkUVgRsPiReSqtkUVg(iReSqtkUVgQsfiReSqtkUVg iReSqtkUVgQsfiReSqtkUVg2, iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        this.b = iReSqtkUVgQsfiReSqtkUVg2;
        this.a = iReSqtkUVgnWNiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        String string = a.a.sp("/config/pub/store.php", "profile_id=" + this.a.f().toString());
        if (string.isEmpty()) {
            return;
        }
        if (string.contains("success")) {
            // empty if block
        }
    }
}

