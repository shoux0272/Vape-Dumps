/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import manthe.AO;
import manthe.k9;
import manthe.r4;
import manthe.yI;
import org.lwjgl.opengl.GL11;

public class r9
extends r4 {
    private static final double O = 1.0;
    private final AO N = new AO();
    private int P = 15;
    private int L = 55;
    private int M = 15;

    public r9() {
        super("", false);
        this.e(0.4);
        this.b(f);
        this.a(new Color(55, 55, 55, 70));
    }

    @Override
    public void c(boolean bl) {
        if (this.e()) {
            int n6;
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            double d10 = this.t();
            int n10 = n6 = this.G() ? this.L : this.P;
            if (this.N.a(50L)) {
                if (this.N.c() > 1000L) {
                    this.M = n6;
                }
                this.N.d();
                int n11 = 20;
                if (this.M < n6) {
                    this.M += n11;
                    if (this.M > n6) {
                        this.M = n6;
                    }
                } else if (this.M > n6) {
                    this.M -= n11;
                    if (this.M < n6) {
                        this.M = n6;
                    }
                }
            }
            Color color = this.G() ? this.f() : Color.gray.darker();
            k9.a(color, (float)(d10 - 1.0), (float)(this.k() - 2.1), "toggleback2", 14.0f, 15.0f, false);
            this.P = 20;
            this.L = 48;
            k9.a(yI.a(this.f(), 45, 240), (float)(d10 + (double)((float)this.M / 10.0f)) - 0.5f, (float)(this.k() + 2.0), "circle2", 6.65f, 6.65f, false);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
    }
}

