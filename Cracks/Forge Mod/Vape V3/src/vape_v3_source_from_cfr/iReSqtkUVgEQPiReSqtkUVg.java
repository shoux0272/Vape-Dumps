/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgEQPiReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    private iReSqtkUVgXMNiReSqtkUVg b = (iReSqtkUVgXMNiReSqtkUVg)this.x();
    private float c;
    private double d = (double)this.a(1969.0, -1969.0) / 2000000.0;
    private boolean e;
    private boolean f;
    private boolean g;

    public iReSqtkUVgEQPiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
        super(iReSqtkUVgJZmiReSqtkUVg2, string);
    }

    @Override
    public void g() {
        this.g = false;
        this.f = false;
    }

    @Override
    public void h() {
        this.g = false;
        this.f = false;
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        iReSqtkUVgpxViReSqtkUVg iReSqtkUVgpxViReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d();
        if (iReSqtkUVgpxViReSqtkUVg2.b(iReSqtkUVgVQSiReSqtkUVg.class) || this.b.l.i().booleanValue()) {
            return;
        }
        if (this.b.e.i().booleanValue() && !iReSqtkUVgVUTiReSqtkUVg.a()) {
            return;
        }
        if (this.b.k.i().booleanValue() && iReSqtkUVgeLLiReSqtkUVg.f().c()) {
            return;
        }
        boolean bl = iReSqtkUVgauSiReSqtkUVg.d() < 23;
        boolean bl2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgucxiReSqtkUVg.class).x() && !iReSqtkUVgpxViReSqtkUVg2.b(iReSqtkUVgkAWiReSqtkUVg.class) && !iReSqtkUVgpxViReSqtkUVg2.b(iReSqtkUVgHyViReSqtkUVg.class) && !iReSqtkUVgpxViReSqtkUVg2.b(iReSqtkUVgoUdiReSqtkUVg.class);
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.a) {
            if (this.b.o.a(this.b.d.i().intValue())) {
                this.b.y();
            }
            if (this.b.r >= this.b.q.size()) {
                this.b.r = 0;
            }
            if (this.b.q.size() > 0) {
                iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2;
                if (this.b.o.a(this.b.d.i().intValue())) {
                    this.y();
                    this.b.o.b();
                }
                if ((iReSqtkUVgVnKiReSqtkUVg2 = this.b.q.get(this.b.r)) != null) {
                    if (!this.b.a(iReSqtkUVgVnKiReSqtkUVg2)) {
                        this.b.y();
                        this.y();
                        return;
                    }
                    double d2 = iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2);
                    if (d2 <= this.b.b.i()) {
                        int n;
                        float[] arrf = this.b.b(iReSqtkUVgVnKiReSqtkUVg2);
                        float f = iReSqtkUVgKexiReSqtkUVg.a(this.b.a(iReSqtkUVgVnKiReSqtkUVg2.z(), iReSqtkUVgVnKiReSqtkUVg2.B(), this.c) + this.a(-5.0, 5.0), -180.0f, 180.0f);
                        if (f > (float)(n = 70)) {
                            f = n;
                        } else if (f < (float)(-n)) {
                            f = -n;
                        }
                        if (iReSqtkUVgFuiiReSqtkUVg.e.d().b(iReSqtkUVgucxiReSqtkUVg.class) && iReSqtkUVgVnKiReSqtkUVg2.ai() <= 15 && bl2 && !iReSqtkUVgtlXiReSqtkUVg2.aQ()) {
                            if (iReSqtkUVgtlXiReSqtkUVg2.L() % 2 == 0) {
                                if (iReSqtkUVgtlXiReSqtkUVg2.am()) {
                                    this.e = true;
                                    iReSqtkUVgtlXiReSqtkUVg2.g(2);
                                    iReSqtkUVgTXviReSqtkUVg2.setY(iReSqtkUVgTXviReSqtkUVg2.getY() + 0.0672268904 + this.d);
                                    iReSqtkUVgTXviReSqtkUVg2.setOnGround(false);
                                }
                            } else if (iReSqtkUVgTXviReSqtkUVg2.getY() == iReSqtkUVgtlXiReSqtkUVg2.A() && iReSqtkUVgTXviReSqtkUVg2.isOnGround()) {
                                iReSqtkUVgTXviReSqtkUVg2.setOnGround(false);
                                iReSqtkUVgTXviReSqtkUVg2.setShouldAlwaysSend(true);
                            }
                        }
                        iReSqtkUVgTXviReSqtkUVg2.setRotationYaw(this.c += f / 1.1f);
                        iReSqtkUVgTXviReSqtkUVg2.setRotationPitch(arrf[1] / 1.15f + this.a(-5.0, 5.0));
                        if (this.b.j.j().booleanValue() && bl && iReSqtkUVgtlXiReSqtkUVg2.bd().c() && iReSqtkUVgtlXiReSqtkUVg2.bd().e().c() && iReSqtkUVgtlXiReSqtkUVg2.bd().e().a(iReSqtkUVgSzRiReSqtkUVg.J)) {
                            iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.bd(), 99999);
                            this.g = false;
                        }
                    }
                }
            } else {
                this.c = iReSqtkUVgtlXiReSqtkUVg2.F();
            }
        } else if (iReSqtkUVgTXviReSqtkUVg2.getStage() == iReSqtkUVgBMviReSqtkUVg.b) {
            if (this.b.q.size() > 0 && this.b.q.get(this.b.r) != null) {
                boolean bl3;
                iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg3 = this.b.q.get(this.b.r);
                boolean bl4 = this.b.n.i().booleanValue() ? iReSqtkUVgtlXiReSqtkUVg2.w(0.0f) == 1.0f : (bl3 = this.b.p.a(this.b.x()));
                if (!(!bl3 || iReSqtkUVgtlXiReSqtkUVg2.bj() && iReSqtkUVgtlXiReSqtkUVg2.L() % 2 == 0 || bl2 && (iReSqtkUVgtlXiReSqtkUVg2.L() % 2 == 0 || iReSqtkUVgtlXiReSqtkUVg2.J() && !this.e && iReSqtkUVgVnKiReSqtkUVg3.ai() <= 15) || !(Math.abs(this.b.a(iReSqtkUVgVnKiReSqtkUVg3.z(), iReSqtkUVgVnKiReSqtkUVg3.B(), this.c)) < 10.0f))) {
                    double d3 = iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg3);
                    if (this.f && iReSqtkUVgtlXiReSqtkUVg2.bj() && bl) {
                        this.g = true;
                        this.f = false;
                        iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2);
                        this.g = false;
                        iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgtlXiReSqtkUVg2.bd(), 99999);
                    }
                    if (d3 <= this.b.b.i()) {
                        if (bl) {
                            iReSqtkUVgtlXiReSqtkUVg2.aK();
                        }
                        if (d3 <= this.b.c.i()) {
                            iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg3);
                            if (!bl) {
                                iReSqtkUVgtlXiReSqtkUVg2.aK();
                                iReSqtkUVgtlXiReSqtkUVg2.bi();
                            }
                            if (!this.f && iReSqtkUVgtlXiReSqtkUVg2.bj() && bl) {
                                iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgtlXiReSqtkUVg2.ag(), iReSqtkUVgtlXiReSqtkUVg2.bd());
                                this.f = true;
                            }
                        }
                    }
                    this.b.p.b();
                }
            } else if (this.f && this.b.p.a(200L) && bl) {
                this.g = true;
                iReSqtkUVgeLLiReSqtkUVg.k().a(iReSqtkUVgtlXiReSqtkUVg2);
                this.g = false;
                this.f = false;
            }
        }
    }

    @Override
    public void a(iReSqtkUVgmTziReSqtkUVg iReSqtkUVgmTziReSqtkUVg2) {
        if (this.b.l.j().booleanValue()) {
            return;
        }
        if (iReSqtkUVgmTziReSqtkUVg2.getPacket().a(iReSqtkUVgSzRiReSqtkUVg.co) && this.b.j.j().booleanValue() && iReSqtkUVgauSiReSqtkUVg.d() == 15 && !this.g && this.b.q.size() > 0 && this.b.q.get(this.b.r) != null) {
            iReSqtkUVgmTziReSqtkUVg2.setCanceled(true);
            return;
        }
        if (iReSqtkUVgmTziReSqtkUVg2.getPacket().a(iReSqtkUVgSzRiReSqtkUVg.cj) && this.b.m.i().booleanValue()) {
            iReSqtkUVgmTziReSqtkUVg2.setCanceled(true);
        }
    }

    private float a(double d2, double d3) {
        return (float)(Math.random() * (d2 - d3) + d3);
    }

    private void y() {
        ++this.b.r;
        if (this.b.r >= this.b.q.size()) {
            this.b.r = 0;
        }
    }
}

