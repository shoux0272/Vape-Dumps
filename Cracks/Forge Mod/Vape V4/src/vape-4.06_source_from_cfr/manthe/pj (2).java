/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.nio.FloatBuffer;
import manthe.Cr;
import manthe.ds;
import manthe.e3;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

class pj {
    Cr a;

    pj() {
    }

    void a(float f10, float f11, int n6, int n10) {
        GL11.glEnable((int)2903);
        boolean bl = GL11.glIsEnabled((int)3553);
        boolean bl2 = GL11.glIsEnabled((int)2896);
        boolean bl3 = GL11.glIsEnabled((int)3008);
        boolean bl4 = GL11.glIsEnabled((int)3042);
        if (!bl) {
            e3.p();
        }
        if (bl2) {
            e3.l();
        }
        if (bl2) {
            e3.l();
        }
        if (!bl3) {
            e3.k();
        }
        if (!bl4) {
            e3.r();
        }
        int n11 = GL11.glGetInteger((int)36006);
        int n12 = GL11.glGetInteger((int)32873);
        this.a.b();
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        GL11.glPushMatrix();
        float f12 = 0.0f;
        float f13 = 1.0f;
        float f14 = 1.0f;
        float f15 = 0.0f;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f14, (float)f13);
        GL11.glVertex2f((float)(f10 + (float)n6), (float)f11);
        GL11.glTexCoord2f((float)f12, (float)f13);
        GL11.glVertex2f((float)f10, (float)f11);
        GL11.glTexCoord2f((float)f12, (float)f15);
        GL11.glVertex2f((float)f10, (float)(f11 + (float)n10));
        GL11.glTexCoord2f((float)f14, (float)f15);
        GL11.glVertex2f((float)(f10 + (float)n6), (float)(f11 + (float)n10));
        GL11.glEnd();
        GL11.glPopMatrix();
        this.a.a();
        e3.b(n12);
        if (!bl) {
            e3.j();
        }
        if (bl2) {
            e3.n();
        }
        if (bl3) {
            e3.k();
        }
        if (bl4) {
            e3.r();
        }
    }

    void a(String string, int n6) {
        int n10 = ds.m().c(string);
        int n11 = ds.m().b(string);
        FloatBuffer floatBuffer = BufferUtils.createFloatBuffer((int)16);
        GL11.glPushMatrix();
        GL11.glGetFloat((int)2983, (FloatBuffer)floatBuffer);
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)n10, (double)n11, (double)0.0, (double)1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPushMatrix();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        int n12 = GL11.glGetInteger((int)32873);
        this.a = new Cr(n10, n11, true);
        this.a.a(n10, n11);
        this.a.a(true);
        ds.m().c(string, 0.0, 0.0, n6);
        this.a.b();
        this.a.c();
        e3.b(n12);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5889);
        GL11.glLoadIdentity();
        GL11.glLoadMatrix((FloatBuffer)floatBuffer);
        GL11.glMatrixMode((int)5888);
        GL11.glLoadIdentity();
        GL11.glPopMatrix();
    }
}

