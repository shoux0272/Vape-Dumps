/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgIHoiReSqtkUVg
extends iReSqtkUVgNwsiReSqtkUVg {
    private iReSqtkUVgypOiReSqtkUVg a = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
    private int b = 0;

    public iReSqtkUVgIHoiReSqtkUVg(iReSqtkUVgxmOiReSqtkUVg iReSqtkUVgxmOiReSqtkUVg2) {
        super(iReSqtkUVgxmOiReSqtkUVg2);
    }

    private void b() {
        iReSqtkUVgypOiReSqtkUVg iReSqtkUVgypOiReSqtkUVg2 = iReSqtkUVgFuiiReSqtkUVg.e.d().a(iReSqtkUVgypOiReSqtkUVg.class);
        if (!iReSqtkUVgypOiReSqtkUVg2.i.i().booleanValue()) {
            return;
        }
        Color color = new Color(-16720972);
        if (this.b > 200) {
            int n = 300 - this.b;
            int n2 = (int)((double)n / 100.0 * 255.0);
            if (n2 <= 10) {
                n2 = 10;
            }
            color = new Color(color.getRed(), color.getGreen(), color.getBlue(), n2);
        }
        iReSqtkUVgeLLiReSqtkUVg.h().a("Press " + iReSqtkUVgypOiReSqtkUVg2.J() + " to open GUI", 2.0, 65.0, color);
    }

    @Override
    public void a(Object object) {
        iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2 = new iReSqtkUVgrbbiReSqtkUVg(object);
        if (iReSqtkUVgrbbiReSqtkUVg2.k() || !iReSqtkUVgrbbiReSqtkUVg2.d()) {
            if (iReSqtkUVgrbbiReSqtkUVg2.k()) {
                iReSqtkUVgrbbiReSqtkUVg2.d(true);
            }
            return;
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.t() && this.b < 300) {
            this.b();
            ++this.b;
        }
        this.a.b(iReSqtkUVgrbbiReSqtkUVg2);
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().e()) {
            iReSqtkUVgJZmiReSqtkUVg2.a(iReSqtkUVgrbbiReSqtkUVg2);
        }
        if (this.b >= 300) {
            this.a().a(new iReSqtkUVgGgXiReSqtkUVg(this.a()));
        }
    }
}

