/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.AO;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.Ds;
import manthe.V;
import manthe.Y;
import manthe.ds;
import manthe.eB;
import manthe.eJ;
import manthe.ex;
import manthe.km;
import manthe.kt;
import manthe.vz;
import manthe.y5;

public class zp
extends y5 {
    private DF y = DF.a((Object)this, "Angle Limit", "#", "", 1.0, 45.0, 180.0, 5.0);
    public DF w = DF.a((Object)this, "Angle Speed", "#", "", 10.0, 15.0, 50.0, 1.0);
    public DB u = DB.a((Object)this, "Stop Movement", false, "Forces you to stand when attacking fireball.");
    public DB B = DB.a((Object)this, "Move on Finish", false, "Will repress your movement keys after attacking.");
    private DB A = DB.a((Object)this, "Silent", false, "Silently attacks nearby fireballs.\nWARNING: DOES NOT USE AIM SMOOTHING");
    private AO z = new AO();
    private static boolean v;
    private eB x;

    public zp() {
        super("AntiFireball", 0xCD4C4C, CQ.a, "Aims and swings at a fireball to reflect it.\nBy default will only attack fireballs heading towards you.");
        this.A.d(true);
        this.u.a(new Ds[]{this.B});
        this.a(this.y, this.w, this.u, this.B, this.A);
    }

    @Override
    public void a(km km2) {
        if (!this.A.x().booleanValue()) {
            return;
        }
        eJ eJ2 = ds.k();
        if (eJ2.e()) {
            return;
        }
        if (km2.c()) {
            if (this.x == null && this.z.a(500L)) {
                for (Object e10 : ds.t().k()) {
                    eB eB2;
                    if (!e10.getClass().isAssignableFrom(A5.dG) || !((double)eJ2.a(eB2 = new eB(e10)) <= 4.5)) continue;
                    float[] arrf = this.a(eB2);
                    float f10 = Math.abs(Y.a(-(eJ2.U() - arrf[0])));
                    float f11 = eJ2.K() - arrf[1];
                    if (!((double)f10 <= this.y.a()) || !((double)f11 <= this.y.a() / 2.0)) continue;
                    km.setRotationYaw(eJ2.U() + Y.a(-(eJ2.U() - arrf[0])));
                    km.setRotationPitch(arrf[1]);
                    this.x = eB2;
                }
            }
        } else if (this.x != null) {
            boolean bl;
            boolean bl2 = bl = V.c() < 23;
            if (bl) {
                eJ2.aO();
            }
            ds.K().a(eJ2, this.x);
            if (!bl) {
                eJ2.aO();
                eJ2.a4();
            }
            this.z.d();
            this.x = null;
        }
    }

    public float[] a(ex ex2) {
        eJ eJ2 = ds.k();
        double d10 = ex2.z() + ex2.k() * 1.805 - eJ2.z();
        double d11 = ex2.g() + ex2.u() * 1.805 - eJ2.g();
        double d12 = ex2.s().l() + ex2.D() * 1.805 + (double)(ex2.am() / 3.0f) - eJ2.s().l() - 1.2;
        float f10 = d11 < 0.0 && d10 < 0.0 ? (float)(90.0 + Math.toDegrees(Math.atan(d11 / d10))) : (d11 < 0.0 && d10 > 0.0 ? (float)(-90.0 + Math.toDegrees(Math.atan(d11 / d10))) : (float)Math.toDegrees(-Math.atan(d10 / d11)));
        double d13 = Y.e(d10 * d10 + d11 * d11);
        float f11 = (float)(-(Math.atan2(d12, d13) * 180.0 / Math.PI));
        return new float[]{f10, f11};
    }

    @Override
    public void b(kt kt2) {
        eJ eJ2 = ds.k();
        if (eJ2.e() || this.A.x().booleanValue()) {
            return;
        }
        if (this.x == null && this.z.a(500L)) {
            for (Object e10 : ds.t().k()) {
                eB eB2;
                if (!e10.getClass().isAssignableFrom(A5.dG) || !(eJ2.a(eB2 = new eB(e10)) <= 6.0f)) continue;
                float[] arrf = this.a(eB2);
                float f10 = Math.abs(Y.a(-(eJ2.U() - arrf[0])));
                float f11 = eJ2.K() - arrf[1];
                if (!((double)f10 <= this.y.a()) || !((double)f11 <= this.y.a() / 2.0) || v) continue;
                v = true;
                this.x = eB2;
                new Thread(new vz(this)).start();
                return;
            }
        }
    }

    static eB a(zp zp2) {
        return zp2.x;
    }

    static AO b(zp zp2) {
        return zp2.z;
    }

    static eB a(zp zp2, eB eB2) {
        zp2.x = eB2;
        return zp2.x;
    }

    static boolean e(boolean bl) {
        v = bl;
        return v;
    }
}

