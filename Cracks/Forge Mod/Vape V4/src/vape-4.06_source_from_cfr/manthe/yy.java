/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.Y;
import manthe.cy;
import manthe.ds;
import manthe.eC;
import manthe.eJ;
import manthe.ei;
import manthe.em;
import manthe.en;
import manthe.ex;
import manthe.f2;
import manthe.fG;
import manthe.fJ;
import manthe.fR;
import manthe.kF;
import manthe.km;
import manthe.kn;
import manthe.kt;
import manthe.y5;

public class yy
extends y5 {
    private final DB C = DB.a((Object)this, "Recast Ground", false, "Automatically recasts if the hook hits the ground.");
    private final DB x = DB.a((Object)this, "Recast Caught", false, "Automatically recasts if the hook catches onto an Entity.");
    private final DB y = DB.a((Object)this, "Anti AFK", false, "Strafes and moves your view slightly\nto prevent you from being kicked.");
    private final AO A = new AO();
    private boolean z;
    private Object v;
    private float w;
    private float u;
    private static boolean B;

    public yy() {
        super("AutoFish", 12452021, CQ.a, "Automatically fishes for you.");
        this.a(this.C, this.x, this.y);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void s() {
        eJ eJ2 = ds.k();
        if (eJ2.e()) {
            return;
        }
        this.w = eJ2.U();
        this.u = eJ2.K();
    }

    @Override
    public void J() {
        if (this.y.u().booleanValue()) {
            en en2 = ds.s();
            ei.a(en2.g().i(), false);
            ei.a(en2.g().i());
            ei.a(en2.n().i(), false);
            ei.a(en2.n().i());
        }
    }

    @Override
    public void a(kF kF2) {
        em em2;
        fG fG2;
        cy cy2;
        cy cy3;
        if (kF2.getPacket().a(A5.cQ) && ((eC)(cy3 = ds.k())).a_().d() && ((eC)cy3).a_().k().a(A5.cX) && ((eC)cy3).aW().d() && ((f2)(cy2 = new f2(kF2.getPacketInstance()))).h() == ((eC)cy3).aW().q()) {
            int n6 = ((f2)cy2).j();
            int n10 = ((f2)cy2).g();
            int n11 = ((f2)cy2).i();
            if (n6 == 0 && n10 < 0 && n11 == 0 && this.z) {
                fG2 = ((eC)cy3).a_();
                if (fG2.d()) {
                    ds.K().a((eC)cy3, ((ex)cy3).i(), fG2);
                }
                this.z = false;
                this.A.d();
            }
        }
        if (kF2.getPacket().a(A5.R) && !kF2.getPacket().a(A5.bk)) {
            double d10;
            cy3 = ds.k();
            cy2 = new fJ(kF2.getPacketInstance());
            ex ex2 = ((fJ)cy2).a(ds.t());
            if (ex2.d() && ex2.equals(((eC)cy3).aW()) && (d10 = (double)ex2.G() / 32.0) < ex2.l() - 0.141 && this.z) {
                fG2 = ((eC)cy3).a_();
                if (fG2.d()) {
                    ds.K().a((eC)cy3, ((ex)cy3).i(), fG2);
                }
                this.z = false;
                this.A.d();
            }
        }
        if (kF2.getPacket().a(A5.ct) && ((fR)(cy3 = new fR(kF2.getPacketInstance()))).g().equals("wake") && ((eC)(cy2 = ds.k())).aW().d() && !this.z && (em2 = ((eC)cy2).aW()).a(((fR)cy3).i(), ((fR)cy3).j(), ((fR)cy3).h()) < 1.0) {
            this.z = true;
        }
    }

    @Override
    public void a(kn kn2) {
        if (this.y.u().booleanValue() && kn2.getEntity().a(A5.u)) {
            en en2 = ds.s();
            eJ eJ2 = new eJ(kn2.getEntity().a());
            if (eJ2.aW() != null && eJ2.a_().d() && eJ2.a_().k().a(A5.cX)) {
                int n6 = eJ2.ad() % 20;
                if (n6 <= 9) {
                    ei.a(en2.g().i(), true);
                    ei.a(en2.g().i());
                    ei.a(en2.n().i(), false);
                    ei.a(en2.n().i());
                } else {
                    ei.a(en2.n().i(), true);
                    ei.a(en2.n().i());
                    ei.a(en2.g().i(), false);
                    ei.a(en2.g().i());
                }
            }
        }
    }

    @Override
    public void a(km km2) {
        if (this.y.u().booleanValue()) {
            if (this.v == null || ds.t().a() != this.v) {
                this.v = ds.t().a();
                if (ds.t().a() != this.v) {
                    this.z();
                    return;
                }
            }
            eJ eJ2 = ds.k();
            if (km2.c() && eJ2.aW().d() && eJ2.ad() % 3 == 0) {
                float f10 = ds.s().r();
                boolean bl = eJ2.ad() % 2 == 0;
                float f11 = (float)(3.0 * Math.random() * (double)(bl ? -1 : 1));
                float f12 = (float)(3.0 * Math.random() * (double)(bl ? -1 : 1));
                float f13 = f10 * 0.6f + 0.2f;
                float f14 = f13 * f13 * f13 * 8.0f;
                float f15 = f11 * f14;
                float f16 = f12 * f14;
                km.setRotationYaw((float)((double)this.w + (double)f15 * 0.15));
                km.setRotationPitch(Y.a((float)((double)this.u - (double)f16 * 0.15), -90.0f, 90.0f));
            }
        }
    }

    @Override
    public void b(kt kt2) {
        cy cy2;
        eJ eJ2 = ds.k();
        if (this.A.a(1000L) && eJ2.aW().e() && eJ2.a_().d() && eJ2.a_().k().a(A5.cX)) {
            cy2 = eJ2.a_();
            if (cy2.d()) {
                ds.K().a(eJ2, eJ2.i(), (fG)cy2);
            }
            this.z = false;
            this.A.d();
        }
        if (eJ2.aW().d()) {
            boolean bl;
            cy2 = eJ2.aW();
            boolean bl2 = bl = ((ex)cy2).k() == 0.0 && ((ex)cy2).D() == 0.0 && ((ex)cy2).u() == 0.0;
            if (((em)cy2).au().d() && this.x.u().booleanValue() || bl && this.C.u().booleanValue()) {
                fG fG2 = eJ2.a_();
                if (fG2.d()) {
                    ds.K().a(eJ2, eJ2.i(), fG2);
                }
                this.z = false;
                this.A.d();
            }
        }
    }

    public static void e(boolean bl) {
        B = bl;
    }

    public static boolean S() {
        return B;
    }

    public static boolean T() {
        boolean bl = yy.S();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (!yy.S()) {
            yy.e(true);
        }
    }
}

