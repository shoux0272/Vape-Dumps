/*
 * Decompiled with CFR 0.150.
 */
import a.a;

class iReSqtkUVgpZXiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgilmiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgilmiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgKLIiReSqtkUVg c;

    iReSqtkUVgpZXiReSqtkUVg(iReSqtkUVgKLIiReSqtkUVg iReSqtkUVgKLIiReSqtkUVg2, iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2, iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg3) {
        this.c = iReSqtkUVgKLIiReSqtkUVg2;
        this.a = iReSqtkUVgilmiReSqtkUVg2;
        this.b = iReSqtkUVgilmiReSqtkUVg3;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (n3 != 0) {
            return;
        }
        int n4 = iReSqtkUVgKLIiReSqtkUVg.a(this.c).r() ? 0 : 1;
        String string = new String(a.a.sp("/config/pub/like.php", "profile_id=" + iReSqtkUVgKLIiReSqtkUVg.a(this.c).f().toString() + "&type=" + n4));
        if (string.length() == 0) {
            return;
        }
        if (string.contains("success")) {
            iReSqtkUVgKLIiReSqtkUVg.a(this.c).v();
            this.a.a(String.valueOf(iReSqtkUVgKLIiReSqtkUVg.a(this.c).n()));
            this.b.a(String.valueOf(iReSqtkUVgKLIiReSqtkUVg.a(this.c).q()));
        }
    }
}

