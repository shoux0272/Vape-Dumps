/*
 * Decompiled with CFR 0.150.
 */
import a.a;

class iReSqtkUVgcVMiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgnWNiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgQsfiReSqtkUVg b;

    iReSqtkUVgcVMiReSqtkUVg(iReSqtkUVgQsfiReSqtkUVg iReSqtkUVgQsfiReSqtkUVg2, iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2) {
        this.b = iReSqtkUVgQsfiReSqtkUVg2;
        this.a = iReSqtkUVgnWNiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        String string = a.a.sp("/config/pub/delete.php", "profile_id=" + this.a.f().toString());
        if (string.isEmpty()) {
            return;
        }
        if (string.contains("success")) {
            iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2 = new iReSqtkUVgnWNiReSqtkUVg(this.a.g(), this.a.h(), this.a.k());
            iReSqtkUVgnWNiReSqtkUVg2.a(this.a.e());
            iReSqtkUVgnWNiReSqtkUVg2.a(this.a.f());
            iReSqtkUVgypOiReSqtkUVg.a(null);
            iReSqtkUVgFuiiReSqtkUVg.e.k().c(this.a);
            iReSqtkUVgFuiiReSqtkUVg.e.k().b(iReSqtkUVgnWNiReSqtkUVg2);
            iReSqtkUVgFCaiReSqtkUVg.f.a(this.a.f());
            iReSqtkUVgFCaiReSqtkUVg.f.R();
        }
    }
}

