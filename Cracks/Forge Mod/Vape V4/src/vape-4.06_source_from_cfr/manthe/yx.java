/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.HashMap;
import java.util.Map;
import manthe.A5;
import manthe.Da;
import manthe.V;
import manthe.Y;
import manthe.cB;
import manthe.cr;
import manthe.dJ;
import manthe.dL;
import manthe.ds;
import manthe.dx;
import manthe.eJ;
import manthe.ej;
import manthe.en;
import manthe.ft;
import manthe.g1;
import manthe.kO;
import manthe.km;
import manthe.ky;
import manthe.oC;
import manthe.on;
import manthe.y5;
import manthe.yO;
import manthe.yP;
import manthe.yc;
import manthe.yq;
import manthe.z3;
import manthe.zG;
import manthe.zM;
import manthe.zQ;
import manthe.zz;

public class yx
extends yc {
    private z3 v = (z3)this.S();
    private int w;
    private float z;
    private float A;
    private double E;
    private boolean B;
    private boolean D;
    private boolean x;
    private Map<Integer, Integer> C = new HashMap<Integer, Integer>();
    private static String[] y;

    public yx(y5 y52, String string) {
        super(y52, string);
        this.E = this.a(5.0E-7, -5.0E-7);
    }

    @Override
    public void s() {
        this.x = false;
        this.D = false;
        this.w = 0;
        eJ eJ2 = ds.k();
        if (eJ2.d()) {
            this.z = eJ2.U();
            this.A = eJ2.K();
        }
        this.C.clear();
    }

    @Override
    public void J() {
        this.x = false;
        this.D = false;
        this.w = 0;
        this.C.clear();
    }

    @Override
    public void a(kO kO2) {
        try {
            if (A5.cn.isAssignableFrom(kO2.getGuiScreenObject().getClass())) {
                this.C.clear();
            }
        }
        catch (Exception exception) {
            this.C.clear();
        }
    }

    @Override
    public void a(km km2) {
        boolean bl;
        zG zG2;
        cr cr2 = on.p.H();
        if (km2.c()) {
            this.V();
        }
        if ((zG2 = cr2.b(zG.class)).N() && !zG2.U()) {
            return;
        }
        if (this.v.E.u().booleanValue() && !cB.f()) {
            return;
        }
        if (this.v.aa.u().booleanValue() && ds.x().d()) {
            return;
        }
        boolean bl2 = V.c() < 23;
        yP yP2 = on.p.H().b(yP.class);
        boolean bl3 = yP2.S() && !cr2.a(zz.class) && !cr2.a(zM.class) && !cr2.a(zQ.class);
        eJ eJ2 = ds.k();
        boolean bl4 = this.v.z.u() == false && !eJ2.aT() && !bl3;
        boolean bl5 = bl = this.v.ae.a().intValue() <= 50;
        if (km2.a() == Da.b) {
            if (this.v.K.a(this.v.ae.a().intValue()) || bl) {
                this.v.T();
            }
            if (this.v.Y >= this.v.R.size()) {
                this.v.Y = 0;
            }
            if (this.v.R.size() > 0) {
                ej ej2;
                if (this.v.K.a(this.v.ae.a().intValue()) || bl) {
                    this.U();
                    this.v.K.d();
                }
                if ((ej2 = this.v.S()) != null) {
                    if (!this.v.a(ej2)) {
                        this.v.T();
                        this.U();
                        return;
                    }
                    double d10 = eJ2.a(ej2);
                    if (d10 <= this.v.am.a()) {
                        int n6;
                        float[] arrf = this.v.c(ej2);
                        float f10 = Y.a(this.v.a(ej2.z(), ej2.g(), this.z) + this.a(-3.0, 3.0), -180.0f, 180.0f);
                        if (f10 > (float)(n6 = 70)) {
                            f10 = n6;
                        } else if (f10 < (float)(-n6)) {
                            f10 = -n6;
                        }
                        float f11 = this.z;
                        float f12 = this.A;
                        if (!yq.u.V()) {
                            if (this.v.T.v() != this.v.v) {
                                if (this.v.T.v() == this.v.I) {
                                    float f13 = ds.s().r();
                                    float f14 = f13 * 0.6f + 0.2f;
                                    float f15 = f14 * f14 * f14 * 8.0f;
                                    int n10 = Math.round(f10 / f15);
                                    int n11 = Math.round((arrf[1] - km.getRotationPitch()) / f15);
                                    float f16 = (float)n10 * f15;
                                    float f17 = (float)n11 * f15;
                                    km.setRotationYaw(this.z += f16);
                                    this.A = km.getRotationPitch() + f17;
                                    km.setRotationPitch(this.A);
                                } else {
                                    km.setRotationYaw(this.z += f10 / 1.1f);
                                    this.A = arrf[1] / 1.1f;
                                    km.setRotationPitch(this.A);
                                }
                                if (this.v.T.v() == this.v.L) {
                                    this.z = km.getRotationYaw();
                                    eJ2.i(this.z);
                                    this.A = km.getRotationPitch();
                                    eJ2.d(this.A);
                                }
                            } else {
                                this.z = eJ2.U();
                                this.A = eJ2.K();
                            }
                        }
                        if (yP2.N()) {
                            if (ej2.F() <= 15 && bl3 && !eJ2.aQ()) {
                                if (yP2.z.v() == yP2.y) {
                                    if (this.w == 2) {
                                        this.w = 0;
                                    }
                                    if (this.w == 0) {
                                        if (eJ2.J()) {
                                            this.B = true;
                                            eJ2.e(2);
                                            km.setY(km.getY() + 0.0672268904 + this.E);
                                            km.setOnGround(false);
                                            km.setShouldAlwaysSend(true);
                                        }
                                    } else if (this.w == 1) {
                                        if (km.getY() == eJ2.l()) {
                                            if (km.isOnGround()) {
                                                km.setOnGround(false);
                                                km.setShouldAlwaysSend(true);
                                            }
                                        }
                                    }
                                } else if (yP2.z.v() == yP2.u) {
                                    boolean bl6 = this.v.U.u().booleanValue() ? eJ2.s(0.5f) == 1.0f : this.v.Q.a(this.v.U());
                                    boolean bl7 = (double)eJ2.a(ej2) <= (eJ2.c(ej2) ? this.v.W.a() : 3.25) && bl6;
                                    int n12 = this.C.getOrDefault(ej2.q(), 0);
                                    if ((ej2.aN() <= 0 && n12 >= 6 || n12 <= 0 && bl7 && this.T()) && eJ2.v() && eJ2.J()) {
                                        eJ2.e(2);
                                        km.setY(km.getY() + 0.125 - this.E);
                                        km.setOnGround(false);
                                        this.B = true;
                                        this.w = 1;
                                    }
                                }
                            }
                        } else if (bl4) {
                            if (this.v.R.size() > 0 && this.v.S() != null) {
                                boolean bl8;
                                boolean bl9 = this.v.U.u().booleanValue() ? eJ2.s(0.5f) == 1.0f : (bl8 = this.v.Q.a(this.v.U()));
                                if (bl8 && (!bl3 || !eJ2.v() || this.w == 1 && this.B || ej2.F() > 15)) {
                                    oC oC2 = this.a(f11, f12);
                                    double d11 = yO.a(new oC(eJ2.z(), eJ2.l(), eJ2.g()), eJ2.am(), oC2, ej2.z(), ej2.l() + (double)ej2.n() / 2.0, ej2.g(), ej2.A(), ej2.n(), 0.85);
                                    if (this.v.T.v() == this.v.v || d11 <= 0.1) {
                                        if (d10 <= this.v.am.a()) {
                                            if (bl2) {
                                                eJ2.aO();
                                            }
                                            if (d10 <= this.v.W.a()) {
                                                this.C.put(ej2.q(), 0);
                                                ds.K().a(eJ2, ej2);
                                                if (!bl2) {
                                                    eJ2.aO();
                                                    eJ2.a4();
                                                }
                                            } else if (!bl2) {
                                                eJ2.aO();
                                                eJ2.a4();
                                            }
                                        }
                                        this.v.Q.d();
                                    }
                                }
                            }
                            return;
                        }
                        if (this.v.z.x().booleanValue() && bl2 && eJ2.a_().d() && eJ2.a_().k().d() && eJ2.a_().k().a(A5.bO)) {
                            eJ2.a(eJ2.a_(), 99999);
                            this.x = false;
                        }
                    }
                }
            } else {
                this.w = 0;
                this.z = eJ2.U();
            }
        } else if (km2.a() == Da.a) {
            if (bl4) {
                return;
            }
            if (this.v.R.size() > 0 && this.v.S() != null) {
                boolean bl10;
                ej ej3 = this.v.S();
                boolean bl11 = this.v.U.u().booleanValue() ? eJ2.s(0.5f) == 1.0f : (bl10 = this.v.Q.a(this.v.U()));
                if (bl10 && (!bl3 || !eJ2.v() || this.w == 1 && this.B || ej3.F() > 15)) {
                    oC oC3 = this.a(km.getRotationYaw(), km.getRotationPitch());
                    double d12 = 0.0;
                    yO.a(new oC(eJ2.z(), eJ2.l(), eJ2.g()), eJ2.am(), oC3, ej3.z(), ej3.l() + (double)ej3.n() / 2.0, ej3.g(), ej3.A(), ej3.n(), 0.85);
                    if (this.v.T.v() == this.v.v || d12 <= 0.1) {
                        double d13 = eJ2.a(ej3);
                        if (yP2.z.v() == yP2.u) {
                            boolean bl12;
                            int n13 = this.C.getOrDefault(ej3.q(), 0);
                            boolean bl13 = bl12 = ej3.aN() <= 0 && n13 >= 6 || n13 <= 0;
                            if (bl3 && eJ2.v() && eJ2.J() && bl12 && this.B) {
                                if (V.c() > 13) {
                                    double d14 = -0.0784000015258789;
                                    eJ2.bp().a(ft.a(eJ2.z(), km.getY() + d14, eJ2.g(), false));
                                } else {
                                    double d15 = 0.04659999847412109;
                                    eJ2.bp().a(ft.a(eJ2.z(), eJ2.s().l() + d15, eJ2.l() + d15, eJ2.g(), false));
                                }
                            }
                        }
                        if (this.D && ds.k().aT() && bl2) {
                            this.x = true;
                            this.D = false;
                            ds.K().a(eJ2);
                            this.x = false;
                            eJ2.a(eJ2.a_(), 99999);
                        }
                        if (d13 <= this.v.am.a()) {
                            if (bl2) {
                                eJ2.aO();
                            }
                            if (d13 <= this.v.W.a()) {
                                this.C.put(ej3.q(), 0);
                                ds.K().a(eJ2, ej3);
                                if (!bl2) {
                                    eJ2.aO();
                                    eJ2.a4();
                                }
                                if (!this.D && eJ2.aT() && bl2) {
                                    try {
                                        ds.K().a(eJ2, eJ2.i(), eJ2.a_());
                                    }
                                    catch (Exception exception) {
                                        // empty catch block
                                    }
                                    this.D = true;
                                }
                            } else if (!bl2) {
                                eJ2.aO();
                                eJ2.a4();
                            }
                        }
                        this.v.Q.d();
                        this.B = false;
                    }
                }
                ++this.w;
                if (this.w > 2) {
                    this.w = 0;
                }
            } else if (this.D && this.v.Q.a(200L) && bl2 && this.v.z.u().booleanValue()) {
                this.x = true;
                ds.K().a(eJ2);
                this.x = false;
                this.D = false;
            }
        }
    }

    @Override
    public void a(ky ky2) {
        if (ky2.getPacket().a(A5.aB) && this.v.z.x().booleanValue() && V.c() < 23 && !this.x && this.v.R.size() > 0 && this.v.S() != null) {
            ky2.a(true);
            return;
        }
        if (ky2.getPacket().a(A5.cp) && this.v.H.u().booleanValue()) {
            ky2.a(true);
        }
    }

    public oC a(float f10, float f11) {
        double d10 = -Math.sin(Math.toRadians(f11));
        double d11 = Math.cos(Math.toRadians(f11));
        double d12 = -d11 * Math.sin(Math.toRadians(f10));
        double d13 = d11 * Math.cos(Math.toRadians(f10));
        return new oC(d12, d10, d13);
    }

    private float a(double d10, double d11) {
        return (float)(Math.random() * (d10 - d11) + d11);
    }

    private void U() {
        ++this.v.Y;
        if (this.v.Y >= this.v.R.size()) {
            this.v.Y = 0;
        }
    }

    private void V() {
        for (Object e10 : ds.t().k()) {
            if (!A5.cF.isAssignableFrom(e10.getClass())) continue;
            ej ej2 = new ej(e10);
            this.C.put(ej2.q(), this.C.getOrDefault(ej2.q(), 0) - 1);
        }
    }

    public boolean a(double d10, double d11, double d12) {
        boolean bl = Y.a(d11 - (double)((int)d11), 1) == 0.5;
        dL dL2 = ds.t().a(g1.a(d10, d11 - (bl ? 0.0 : 0.1), d12));
        dx dx2 = dL2.f();
        boolean bl2 = bl ? dx2.h() == dJ.i() : !dx2.a(dL2) || dx2.h() == dJ.i();
        return !bl2;
    }

    public boolean T() {
        double[][] arrarrd;
        boolean bl = false;
        eJ eJ2 = ds.k();
        double d10 = eJ2.z() - eJ2.T();
        double d11 = eJ2.g() - eJ2.X();
        for (double[] arrd : arrarrd = new double[][]{{-0.35, -0.35}, {-0.35, 0.35}, {0.35, 0.35}, {0.35, -0.35}}) {
            double d12;
            double d13;
            double d14 = arrd[0];
            double d15 = arrd[1];
            double d16 = d14 + eJ2.z() + d10;
            if (!this.a(d16, d13 = -0.5 + eJ2.l(), d12 = d15 + eJ2.g() + d11)) continue;
            bl = true;
            break;
        }
        return !this.a(eJ2) || bl;
    }

    private boolean a(eJ eJ2) {
        en en2 = ds.s();
        return en2.j().h() || en2.A().h() || en2.g().h() || en2.n().h() || eJ2.bg().j() != 0.0f || eJ2.bg().h() != 0.0f;
    }

    public static void b(String[] arrstring) {
        y = arrstring;
    }

    public static String[] W() {
        return y;
    }

    static {
        if (yx.W() == null) {
            yx.b(new String[3]);
        }
    }
}

