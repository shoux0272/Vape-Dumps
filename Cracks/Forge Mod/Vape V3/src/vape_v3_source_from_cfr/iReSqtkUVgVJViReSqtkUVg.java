/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class iReSqtkUVgVJViReSqtkUVg
extends iReSqtkUVgNeViReSqtkUVg {
    private iReSqtkUVgGrkiReSqtkUVg b;
    private float c;
    private int d;
    private int e;
    private int f;
    private iReSqtkUVgPzKiReSqtkUVg g = new iReSqtkUVgPzKiReSqtkUVg();
    private int h = 0;

    public iReSqtkUVgVJViReSqtkUVg() {
        super("Clutch");
    }

    @Override
    public void g() {
        try {
            List<Integer> list = this.y();
            if (list.isEmpty()) {
                this.a();
                return;
            }
            iReSqtkUVgeLLiReSqtkUVg.e().aZ().a(list.get(0));
            iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = this.x();
            if (iReSqtkUVgGrkiReSqtkUVg2 == null) {
                this.a();
                return;
            }
            this.b = iReSqtkUVgGrkiReSqtkUVg2;
            this.h = 1;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void h() {
        this.b = null;
        this.d = -1;
        this.e = -1;
        this.f = -1;
        this.h = 0;
        this.c = 0.0f;
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        if (this.h == 1) {
            float f = ThreadLocalRandom.current().nextFloat() * 1.5f;
            if (ThreadLocalRandom.current().nextFloat() > 0.5f) {
                f = -f;
            }
            float f2 = ThreadLocalRandom.current().nextFloat() * 1.5f;
            iReSqtkUVgIuaiReSqtkUVg.a(this.c + f, 80.0f + f2);
            this.h = 2;
            this.g.b();
        } else if (this.h == 2) {
            iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i().e();
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), true);
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d());
            if (this.g.a(50L)) {
                iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), false);
                this.a();
            }
        }
    }

    private iReSqtkUVgGrkiReSqtkUVg x() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        iReSqtkUVggvziReSqtkUVg iReSqtkUVggvziReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.ag();
        int n = (int)iReSqtkUVgtlXiReSqtkUVg2.z();
        int n2 = (int)iReSqtkUVgtlXiReSqtkUVg2.A();
        int n3 = (int)iReSqtkUVgtlXiReSqtkUVg2.B();
        if (!iReSqtkUVgVUTiReSqtkUVg.a) {
            --n2;
            --n3;
        }
        this.e = n2;
        this.d = n + 1;
        this.f = n3;
        iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = this.a(iReSqtkUVggvziReSqtkUVg2, this.d, this.e, this.f);
        if (iReSqtkUVgGrkiReSqtkUVg2 != null) {
            this.c = -90.0f;
            return iReSqtkUVgGrkiReSqtkUVg2;
        }
        this.d = n - 1;
        this.f = n3;
        iReSqtkUVgGrkiReSqtkUVg2 = this.a(iReSqtkUVggvziReSqtkUVg2, this.d, this.e, this.f);
        if (iReSqtkUVgGrkiReSqtkUVg2 != null) {
            this.c = 90.0f;
            return iReSqtkUVgGrkiReSqtkUVg2;
        }
        this.d = n;
        this.f = n3 + 1;
        iReSqtkUVgGrkiReSqtkUVg2 = this.a(iReSqtkUVggvziReSqtkUVg2, this.d, this.e, this.f);
        if (iReSqtkUVgGrkiReSqtkUVg2 != null) {
            this.c = 0.0f;
            return iReSqtkUVgGrkiReSqtkUVg2;
        }
        this.d = n;
        this.f = n3 - 1;
        iReSqtkUVgGrkiReSqtkUVg2 = this.a(iReSqtkUVggvziReSqtkUVg2, this.d, this.e, this.f);
        if (iReSqtkUVgGrkiReSqtkUVg2 != null) {
            this.c = 180.0f;
            return iReSqtkUVgGrkiReSqtkUVg2;
        }
        return null;
    }

    private iReSqtkUVgGrkiReSqtkUVg a(iReSqtkUVggvziReSqtkUVg iReSqtkUVggvziReSqtkUVg2, int n, int n2, int n3) {
        iReSqtkUVgGrkiReSqtkUVg iReSqtkUVgGrkiReSqtkUVg2 = iReSqtkUVggvziReSqtkUVg2.a(n, n2, n3);
        if (iReSqtkUVgGrkiReSqtkUVg2.b() || iReSqtkUVgGrkiReSqtkUVg2.e().a(iReSqtkUVgREtiReSqtkUVg.e().e().a().getClass())) {
            return null;
        }
        return iReSqtkUVgGrkiReSqtkUVg2;
    }

    private List<Integer> y() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (int i = 0; i <= 8; ++i) {
            String string;
            iReSqtkUVgyetiReSqtkUVg iReSqtkUVgyetiReSqtkUVg2 = iReSqtkUVgtlXiReSqtkUVg2.aZ().b(i);
            if (iReSqtkUVgyetiReSqtkUVg2.b() || iReSqtkUVgyetiReSqtkUVg2.e().b() || !iReSqtkUVgyetiReSqtkUVg2.e().a(iReSqtkUVgSzRiReSqtkUVg.ax) || (string = iReSqtkUVgyetiReSqtkUVg2.e().a().toString()).contains("Colored") || string.contains("Lily")) continue;
            arrayList.add(i);
        }
        return arrayList;
    }
}

