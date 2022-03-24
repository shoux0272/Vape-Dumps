/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgwgUiReSqtkUVg
extends iReSqtkUVgcvhiReSqtkUVg
implements iReSqtkUVgmasiReSqtkUVg {
    private boolean h;
    private double p = 0.0;

    public iReSqtkUVgwgUiReSqtkUVg(boolean bl) {
        this.h = bl;
    }

    @Override
    public void a(boolean bl) {
        if (this.h() && this.h) {
            GL11.glPushMatrix();
            boolean bl2 = GL11.glIsEnabled((int)3042);
            if (!bl2) {
                GL11.glEnable((int)3042);
            }
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            iReSqtkUVguKSiReSqtkUVg.a(this.m(), this);
            if (this.p > 0.0) {
                iReSqtkUVguKSiReSqtkUVg.a(this.n(), this.p, this, 4);
            }
            GL11.glEnable((int)3553);
            if (!bl2) {
                GL11.glDisable((int)3042);
            }
            GL11.glPopMatrix();
        }
        super.a(bl);
    }

    public void k(boolean bl) {
        this.h = bl;
    }

    public void e(double d2) {
        this.p = d2;
    }
}

