/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVguTgiReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    private iReSqtkUVgkAWiReSqtkUVg b = (iReSqtkUVgkAWiReSqtkUVg)this.x();
    private double c = this.a(1334.0, -1332.0) / 250000.0;

    public iReSqtkUVguTgiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
        super(iReSqtkUVgJZmiReSqtkUVg2, string);
    }

    @Override
    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
        if (!iReSqtkUVgXWziReSqtkUVg2.isPre()) {
            return;
        }
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (iReSqtkUVgtlXiReSqtkUVg2.as()) {
            return;
        }
        if (this.b.d == 2 && (iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f) && iReSqtkUVgtlXiReSqtkUVg2.am()) {
            double d2 = 0.405412 + this.c;
            iReSqtkUVgXWziReSqtkUVg2.setY(d2);
            iReSqtkUVgtlXiReSqtkUVg2.i(d2);
            this.b.b *= 2.053859;
        } else if (this.b.d == 3) {
            double d3 = 0.71 * (this.b.c - this.b.x());
            this.b.b = this.b.c - d3;
        } else {
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = null;
            iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgauSiReSqtkUVg.d() == 13 ? iReSqtkUVgtlXiReSqtkUVg2.V().j().c(0.0, iReSqtkUVgtlXiReSqtkUVg2.D(), 0.0) : iReSqtkUVgtlXiReSqtkUVg2.V().c(0.0, iReSqtkUVgtlXiReSqtkUVg2.D(), 0.0);
            List list = iReSqtkUVgeLLiReSqtkUVg.g().b(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg2);
            if ((list.size() > 0 || iReSqtkUVgtlXiReSqtkUVg2.am()) && this.b.d > 0) {
                this.b.d = iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f ? 1 : 0;
            }
            this.b.b = this.b.c - this.b.c / 156.0;
        }
        if (this.b.d > 0) {
            this.b.b = Math.max(this.b.b, this.b.x());
            this.b.b = Math.max(this.b.b, this.b.x());
            double d4 = iReSqtkUVgtlXiReSqtkUVg2.n().i();
            double d5 = iReSqtkUVgtlXiReSqtkUVg2.n().h();
            float f = iReSqtkUVgtlXiReSqtkUVg2.F();
            if (d4 == 0.0 && d5 == 0.0) {
                iReSqtkUVgXWziReSqtkUVg2.setX(0.0);
                iReSqtkUVgXWziReSqtkUVg2.setZ(0.0);
            } else if (d4 != 0.0) {
                if (d5 > 0.0) {
                    f += d4 > 0.0 ? -45.0f : 45.0f;
                    d5 = 0.0;
                } else if (d5 < 0.0) {
                    f += d4 > 0.0 ? 45.0f : -45.0f;
                    d5 = 0.0;
                }
                d4 = d4 > 0.0 ? 1.0 : -1.0;
            }
            double d6 = Math.cos(Math.toRadians(f + 90.0f));
            double d7 = Math.sin(Math.toRadians(f + 90.0f));
            iReSqtkUVgXWziReSqtkUVg2.setX((d4 * this.b.b * d6 + d5 * this.b.b * d7) * 0.99);
            iReSqtkUVgXWziReSqtkUVg2.setZ((d4 * this.b.b * d7 - d5 * this.b.b * d6) * 0.99);
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f) {
            ++this.b.d;
        }
    }

    private double a(double d2, double d3) {
        return Math.random() * (d2 - d3) + d3;
    }
}

