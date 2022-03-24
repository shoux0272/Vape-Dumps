/*
 * Decompiled with CFR 0.150.
 */
import a.a;

class iReSqtkUVgEUpiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgnWNiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgilmiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgQsfiReSqtkUVg c;

    iReSqtkUVgEUpiReSqtkUVg(iReSqtkUVgQsfiReSqtkUVg iReSqtkUVgQsfiReSqtkUVg2, iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2, iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2) {
        this.c = iReSqtkUVgQsfiReSqtkUVg2;
        this.a = iReSqtkUVgnWNiReSqtkUVg2;
        this.b = iReSqtkUVgilmiReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (iReSqtkUVgFuiiReSqtkUVg.e.k().e() >= 10) {
            return;
        }
        if (!this.a.k()) {
            iReSqtkUVgFuiiReSqtkUVg.e.r().c.d_().a(0, 0, 0);
            try {
                Thread.sleep(200L);
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
        if (!this.a.k()) {
            this.b.a("Must sync");
            return;
        }
        String string = a.a.sp("/config/pub/store.php", "profile_id=" + this.a.f().toString());
        if (string.isEmpty()) {
            return;
        }
        if (string.contains("success")) {
            iReSqtkUVgntKiReSqtkUVg iReSqtkUVgntKiReSqtkUVg2 = new iReSqtkUVgntKiReSqtkUVg(this.a.g(), this.a.h());
            iReSqtkUVgntKiReSqtkUVg2.a(true);
            iReSqtkUVgntKiReSqtkUVg2.b(true);
            iReSqtkUVgntKiReSqtkUVg2.a(this.a.e());
            iReSqtkUVgntKiReSqtkUVg2.a(this.a.f());
            iReSqtkUVgypOiReSqtkUVg.a(null);
            iReSqtkUVgFuiiReSqtkUVg.e.k().c(this.a);
            iReSqtkUVgFuiiReSqtkUVg.e.k().b(iReSqtkUVgntKiReSqtkUVg2);
            iReSqtkUVgFCaiReSqtkUVg.f.T().add(iReSqtkUVgntKiReSqtkUVg2);
            iReSqtkUVgFCaiReSqtkUVg.f.R();
        }
    }
}

