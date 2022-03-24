/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class iReSqtkUVggCMiReSqtkUVg
extends iReSqtkUVgZYoiReSqtkUVg {
    private iReSqtkUVgkAWiReSqtkUVg b = (iReSqtkUVgkAWiReSqtkUVg)this.x();

    public iReSqtkUVggCMiReSqtkUVg(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, String string) {
        super(iReSqtkUVgJZmiReSqtkUVg2, string);
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        if (this.b.d == 3) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            double d2 = 0.402312;
            if (iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgnNhiReSqtkUVg.g())) {
                d2 = (float)(iReSqtkUVgtlXiReSqtkUVg2.b(iReSqtkUVgnNhiReSqtkUVg.g()).d() + 1) * 0.1f;
            }
            iReSqtkUVgTXviReSqtkUVg2.setY(iReSqtkUVgTXviReSqtkUVg2.getY() + d2);
        }
    }

    @Override
    public void a(iReSqtkUVgXWziReSqtkUVg iReSqtkUVgXWziReSqtkUVg2) {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2;
        if (!iReSqtkUVgXWziReSqtkUVg2.isPre()) {
            return;
        }
        if (this.b.d < 1) {
            ++this.b.d;
            this.b.c = 0.0;
        }
        if ((iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e()).as()) {
            return;
        }
        if (iReSqtkUVgtlXiReSqtkUVg2.J() || iReSqtkUVgtlXiReSqtkUVg2.am() || this.b.d == 3) {
            if (!iReSqtkUVgtlXiReSqtkUVg2.al() && iReSqtkUVgtlXiReSqtkUVg2.o() != 0.0f || iReSqtkUVgtlXiReSqtkUVg2.aI() != 0.0f) {
                if (this.b.d == 2) {
                    this.b.b *= 2.149;
                    this.b.d = 3;
                } else if (this.b.d == 3) {
                    this.b.d = 2;
                    double d2 = 0.66 * (this.b.c - this.b.x());
                    this.b.b = this.b.c - d2;
                } else {
                    iReSqtkUVgmXTiReSqtkUVg iReSqtkUVgmXTiReSqtkUVg2 = null;
                    iReSqtkUVgmXTiReSqtkUVg2 = iReSqtkUVgauSiReSqtkUVg.d() == 13 ? iReSqtkUVgtlXiReSqtkUVg2.V().j().c(0.0, iReSqtkUVgtlXiReSqtkUVg2.D(), 0.0) : iReSqtkUVgtlXiReSqtkUVg2.V().c(0.0, iReSqtkUVgtlXiReSqtkUVg2.D(), 0.0);
                    List list = iReSqtkUVgeLLiReSqtkUVg.g().b(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgmXTiReSqtkUVg2);
                    if ((list.size() > 0 || iReSqtkUVgtlXiReSqtkUVg2.am()) && this.b.d > 0) {
                        this.b.d = 1;
                    }
                }
            }
            this.b.b = Math.max(this.b.b, this.b.x());
            this.b.a(iReSqtkUVgXWziReSqtkUVg2, this.b.b, iReSqtkUVgtlXiReSqtkUVg2);
        }
    }
}

