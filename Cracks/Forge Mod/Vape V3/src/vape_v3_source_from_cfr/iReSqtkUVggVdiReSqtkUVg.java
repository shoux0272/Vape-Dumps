/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVggVdiReSqtkUVg
extends iReSqtkUVgIDdiReSqtkUVg {
    private static final double h = 1.0;

    public iReSqtkUVggVdiReSqtkUVg() {
        super("", false);
        this.a(0.4);
        this.a(i);
        this.b(new Color(55, 55, 55, 70));
    }

    @Override
    public void a(boolean bl) {
        super.a(bl);
        if (this.h()) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            if (this.f() != null && this.f().x() != null && this.f() instanceof iReSqtkUVgRNziReSqtkUVg) {
                Object object;
                iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2;
                iReSqtkUVgRNziReSqtkUVg iReSqtkUVgRNziReSqtkUVg2 = (iReSqtkUVgRNziReSqtkUVg)this.f();
                iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2 = (iReSqtkUVgoRmiReSqtkUVg)this.f().x();
                if (iReSqtkUVgoRmiReSqtkUVg2 != null && !iReSqtkUVgoRmiReSqtkUVg2.k().isEmpty() && (iReSqtkUVgWaoiReSqtkUVg2 = iReSqtkUVgoRmiReSqtkUVg2.l()) != null && (object = iReSqtkUVgoRmiReSqtkUVg2.l().c()) != null) {
                    if (!iReSqtkUVgoRmiReSqtkUVg2.i().booleanValue()) {
                        object = iReSqtkUVgRNziReSqtkUVg2;
                    }
                    GL11.glColor4d((double)0.25, (double)0.25, (double)0.25, (double)0.3);
                    GL11.glBegin((int)7);
                    GL11.glVertex2d((double)iReSqtkUVgRNziReSqtkUVg2.c(), (double)(object.e_() + object.l()));
                    GL11.glVertex2d((double)(iReSqtkUVgRNziReSqtkUVg2.c() + iReSqtkUVgRNziReSqtkUVg2.k()), (double)(object.e_() + object.l()));
                    GL11.glVertex2d((double)(iReSqtkUVgRNziReSqtkUVg2.c() + iReSqtkUVgRNziReSqtkUVg2.k()), (double)iReSqtkUVgRNziReSqtkUVg2.e_());
                    GL11.glVertex2d((double)iReSqtkUVgRNziReSqtkUVg2.c(), (double)iReSqtkUVgRNziReSqtkUVg2.e_());
                    GL11.glEnd();
                    GL11.glLineWidth((float)1.0f);
                    GL11.glColor4d((double)0.0, (double)0.0, (double)0.0, (double)0.25);
                    GL11.glBegin((int)2);
                    GL11.glVertex2d((double)iReSqtkUVgRNziReSqtkUVg2.c(), (double)(object.e_() + object.l()));
                    GL11.glVertex2d((double)(iReSqtkUVgRNziReSqtkUVg2.c() + iReSqtkUVgRNziReSqtkUVg2.k()), (double)(object.e_() + object.l()));
                    GL11.glVertex2d((double)(iReSqtkUVgRNziReSqtkUVg2.c() + iReSqtkUVgRNziReSqtkUVg2.k()), (double)iReSqtkUVgRNziReSqtkUVg2.e_());
                    GL11.glVertex2d((double)iReSqtkUVgRNziReSqtkUVg2.c(), (double)iReSqtkUVgRNziReSqtkUVg2.e_());
                    GL11.glEnd();
                }
            }
            iReSqtkUVguKSiReSqtkUVg.a(k, this.c() + 1.0, this.e_() + this.l() - 1.0, this.c() + this.k() - 1.0, this.e_() + this.l() - 1.0, this.c() + this.k() - 1.0, this.e_() + 1.0, this.c() + 1.0, this.e_() + 1.0);
            if (this.b()) {
                float f = 0.3f;
                if (this.k() > 18.0) {
                    f = 0.62f;
                } else if (this.k() > 16.0) {
                    f = 0.56f;
                }
                iReSqtkUVgMSwiReSqtkUVg.a(this.m(), (float)(this.c() + 1.0), (float)(this.e_() - 1.0), "check", f);
            }
        }
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }
}

