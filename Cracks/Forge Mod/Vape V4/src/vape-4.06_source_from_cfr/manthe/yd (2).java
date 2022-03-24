/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.V;
import manthe.Y;
import manthe.ds;
import manthe.eJ;
import manthe.fP;
import manthe.fX;
import manthe.km;
import manthe.ks;
import manthe.y5;
import manthe.yc;
import manthe.zz;

public class yd
extends yc {
    private final zz x = (zz)this.S();
    private float w;
    private int v = 0;

    public yd(y5 y52, String string) {
        super(y52, string);
    }

    @Override
    public void s() {
        eJ eJ2 = ds.k();
        if (eJ2.d()) {
            this.w = eJ2.U();
            this.x.x = 1;
        }
        this.v = 0;
    }

    @Override
    public void a(ks ks2) {
        float f10;
        double d10;
        if (!ks2.c()) {
            return;
        }
        eJ eJ2 = ds.k();
        if (eJ2.H()) {
            return;
        }
        if (this.x.x < 0) {
            ++this.x.x;
            this.x.C = 0.0;
            return;
        }
        if (eJ2.aF() == 0.0f && eJ2.ay() == 0.0f) {
            this.x.z = this.x.S();
        }
        boolean bl = eJ2.aF() != 0.0f || eJ2.ay() != 0.0f;
        double d11 = this.x.z = this.x.S() * (eJ2.af() ? 0.8 : (eJ2.H() ? 0.6 : (eJ2.i().a(eJ2.z(), eJ2.l() - 0.1, eJ2.g()).f() == 0.98f ? 2.4 : 1.0)));
        if (this.x.x == 1 && bl && eJ2.J()) {
            this.x.z = this.x.S();
            this.v = 0;
        } else if (this.x.x == 2 && bl && eJ2.J() && eJ2.v()) {
            double d12;
            double d13 = d12 = this.v > 0 ? (double)0.424f + (double)1.0E-4f * Math.random() : (double)0.42f;
            if (eJ2.a(fX.k())) {
                d12 += (double)((float)(eJ2.b(fX.k()).h() + 1) * 0.1f);
            }
            ks2.setY(d12);
            eJ2.l(d12);
            this.x.z = d11 * 2.1475;
            d10 = eJ2.bg().j();
            double d14 = eJ2.bg().h();
            f10 = eJ2.U();
            if (d10 == 0.0 && d14 == 0.0) {
                eJ2.c(eJ2.z() + 1.0, eJ2.l(), eJ2.g() + 1.0);
                eJ2.c(eJ2.aq(), eJ2.an(), eJ2.ap());
                ks2.setX(0.0);
                ks2.setZ(0.0);
                if (eJ2.v()) {
                    this.w = f10;
                }
            } else if (d10 != 0.0) {
                if (d10 < 0.0) {
                    f10 -= 180.0f;
                }
                if (d14 > 0.0) {
                    f10 += d10 > 0.0 ? -43.51f : 43.51f;
                } else if (d14 < 0.0) {
                    f10 += d10 > 0.0 ? 43.51f : -43.51f;
                }
            } else if (d14 > 0.0) {
                f10 += -88.58f;
            } else if (d14 < 0.0) {
                f10 += 88.58f;
            }
            float f11 = Y.a(-(this.w - f10));
            float f12 = 180.0f;
            if (Math.abs(f11) >= f12) {
                f11 = Y.a(f11, -f12, f12);
            }
            this.w += f11;
        } else if (this.x.x == 3) {
            double d15 = 0.825;
            if (eJ2.a(fX.q())) {
                d15 = eJ2.b(fX.q()).h() == 0 ? 0.8 : 0.75;
            }
            d10 = d15 * (this.x.C - d11);
            this.x.z = this.x.C - d10;
        } else {
            fP fP2 = V.c() == 13 ? eJ2.s().k().b(0.0, eJ2.D(), 0.0) : eJ2.s().b(0.0, eJ2.D(), 0.0);
            List list = ds.t().b(eJ2, fP2);
            if ((list.size() > 0 || eJ2.J()) && this.x.x > 0) {
                this.x.x = eJ2.aF() != 0.0f || eJ2.ay() != 0.0f ? 1 : 0;
            }
            this.x.z = this.x.C - this.x.C / 159.0;
        }
        this.x.z = Math.max(this.x.z, d11);
        if (this.x.x > 0) {
            double d16 = eJ2.bg().j();
            d10 = eJ2.bg().h();
            float f13 = eJ2.U();
            if (d16 == 0.0 && d10 == 0.0) {
                ks2.setX(0.0);
                ks2.setZ(0.0);
            } else if (d16 != 0.0) {
                if (d10 > 0.0) {
                    f13 += (float)(d16 > 0.0 ? -45 : 45);
                } else if (d10 < 0.0) {
                    f13 += (float)(d16 > 0.0 ? 45 : -45);
                }
                if (d16 > 0.0) {
                    d16 = 1.0;
                } else if (d16 < 0.0) {
                    d16 = 1.0;
                    f13 -= 180.0f;
                }
            } else {
                if (d10 > 0.0) {
                    f13 += -90.0f;
                } else if (d10 < 0.0) {
                    f13 += 90.0f;
                }
                d16 = 1.0;
            }
            float f14 = Y.a(-(this.w - f13));
            f10 = this.x.w.a().floatValue();
            if (Math.abs(f14) >= f10) {
                f14 = Y.a(f14, -f10, f10);
            }
            this.w += f14;
            double d17 = Math.cos(Math.toRadians(this.w + 90.0f));
            double d18 = Math.sin(Math.toRadians(this.w + 90.0f));
            ks2.setX(d16 * this.x.z * d17);
            ks2.setZ(d16 * this.x.z * d18);
        }
        if (eJ2.aF() != 0.0f || eJ2.ay() != 0.0f) {
            ++this.x.x;
        }
    }

    @Override
    public void a(km km2) {
        eJ eJ2;
        if (km2.c() && ((eJ2 = ds.k()).bg().j() != 0.0f || eJ2.bg().h() != 0.0f) && this.x.C > 0.0 && this.x.x > 0) {
            if (km.isOnGround()) {
                if (this.v > 0) {
                    km.setY(km.getY() + (double)0.005f + (double)1.0E-4f * Math.random());
                }
                ++this.v;
            }
        }
    }
}

