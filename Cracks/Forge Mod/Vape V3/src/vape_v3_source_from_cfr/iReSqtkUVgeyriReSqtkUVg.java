/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVgeyriReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    private iReSqtkUVgkAWiReSqtkUVg b = (iReSqtkUVgkAWiReSqtkUVg)this.x();

    public iReSqtkUVgeyriReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
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
        if (iReSqtkUVgtlXiReSqtkUVg2.o() == 0.0f && iReSqtkUVgtlXiReSqtkUVg2.aI() == 0.0f) {
            this.b.b = this.b.x();
        }
        if (this.b.d == 1 && iReSqtkUVgtlXiReSqtkUVg2.am() && (iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f)) {
            this.b.b = 0.25 + this.b.x() - 0.01;
        }
        if (this.b.d == 2 && (iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f) && iReSqtkUVgtlXiReSqtkUVg2.J()) {
            double d2 = 0.42f;
            if (iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgnNhiReSqtkUVg.g())) {
                d2 += (double)((float)(iReSqtkUVgtlXiReSqtkUVg2.b(iReSqtkUVgnNhiReSqtkUVg.g()).d() + 1) * 0.1f);
            }
            iReSqtkUVgXWziReSqtkUVg2.setY(d2);
            iReSqtkUVgtlXiReSqtkUVg2.i(d2);
            this.b.b *= 2.149;
        } else if (this.b.d == 3) {
            double d3 = 0.66 * (this.b.c - this.b.x());
            this.b.b = this.b.c - d3;
        } else {
            iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = null;
            iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgauSiReSqtkUVg.d() == 13 ? iReSqtkUVgtlXiReSqtkUVg2.V().j().c(0.0, iReSqtkUVgtlXiReSqtkUVg2.D(), 0.0) : iReSqtkUVgtlXiReSqtkUVg2.V().c(0.0, iReSqtkUVgtlXiReSqtkUVg2.D(), 0.0);
            List list = iReSqtkUVgeLLiReSqtkUVg.g().b(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg2);
            if ((list.size() > 0 || iReSqtkUVgtlXiReSqtkUVg2.am()) && this.b.d > 0) {
                this.b.d = 1.35 * this.b.x() - 0.01 > this.b.b ? 0 : (iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f ? 1 : 0);
            }
            this.b.b = this.b.c - this.b.c / 159.0;
        }
        if (this.b.d > 0) {
            this.b.b = Math.max(this.b.b, this.b.x());
            this.b.a(iReSqtkUVgXWziReSqtkUVg2, this.b.b, iReSqtkUVgtlXiReSqtkUVg2);
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f) {
            ++this.b.d;
        }
    }
}

