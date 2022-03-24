/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import manthe.A5;
import manthe.AO;
import manthe.cB;
import manthe.ds;
import manthe.dx;
import manthe.eD;
import manthe.eJ;
import manthe.ei;
import manthe.fG;
import manthe.gS;
import manthe.kt;
import manthe.oA;
import manthe.y8;

public class ym
extends y8 {
    private final AO y = new AO();
    private dx v;
    private float w;
    private int u;
    private int x;
    private int z;
    private int A = 0;

    public ym() {
        super("Clutch");
    }

    @Override
    public void s() {
        try {
            List<Integer> list = this.T();
            if (list.isEmpty()) {
                this.z();
                return;
            }
            ds.k().aU().a(list.get(0));
            dx dx2 = this.S();
            if (dx2 == null) {
                this.z();
                return;
            }
            this.v = dx2;
            this.A = 1;
        }
        catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    @Override
    public void J() {
        this.v = null;
        this.u = -1;
        this.x = -1;
        this.z = -1;
        this.A = 0;
        this.w = 0.0f;
    }

    @Override
    public void b(kt kt2) {
        if (this.A == 1) {
            float f10 = ThreadLocalRandom.current().nextFloat() * 1.5f;
            if (ThreadLocalRandom.current().nextFloat() > 0.5f) {
                f10 = -f10;
            }
            float f11 = ThreadLocalRandom.current().nextFloat() * 1.5f;
            oA.a(this.w + f10, 80.0f + f11);
            this.A = 2;
            this.y.d();
        } else if (this.A == 2) {
            ei ei2 = ds.s().s();
            ei.a(ei2.i(), true);
            ei.a(ei2.i());
            if (this.y.a(50L)) {
                ei.a(ei2.i(), false);
                this.z();
            }
        }
    }

    private dx S() {
        eJ eJ2 = ds.k();
        gS gS2 = eJ2.i();
        int n6 = (int)eJ2.z();
        int n10 = (int)eJ2.l();
        int n11 = (int)eJ2.g();
        if (!cB.h) {
            --n10;
            --n11;
        }
        this.x = n10;
        this.u = n6 + 1;
        this.z = n11;
        dx dx2 = this.a(gS2, this.u, this.x, this.z);
        if (dx2 != null) {
            this.w = -90.0f;
            return dx2;
        }
        this.u = n6 - 1;
        this.z = n11;
        dx2 = this.a(gS2, this.u, this.x, this.z);
        if (dx2 != null) {
            this.w = 90.0f;
            return dx2;
        }
        this.u = n6;
        this.z = n11 + 1;
        dx2 = this.a(gS2, this.u, this.x, this.z);
        if (dx2 != null) {
            this.w = 0.0f;
            return dx2;
        }
        this.u = n6;
        this.z = n11 - 1;
        dx2 = this.a(gS2, this.u, this.x, this.z);
        if (dx2 != null) {
            this.w = 180.0f;
            return dx2;
        }
        return null;
    }

    private dx a(gS gS2, int n6, int n10, int n11) {
        dx dx2 = gS2.b(n6, n10, n11);
        if (dx2.e() || dx2.h().a(eD.h().h().a().getClass())) {
            return null;
        }
        return dx2;
    }

    private List<Integer> T() {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        eJ eJ2 = ds.k();
        for (int k = 0; k <= 8; ++k) {
            String string;
            fG fG2 = eJ2.aU().b(k);
            if (fG2.e() || fG2.k().e() || !fG2.k().a(A5.av) || (string = fG2.k().a().toString()).contains("Colored") || string.contains("Lily")) continue;
            arrayList.add(k);
        }
        return arrayList;
    }
}

