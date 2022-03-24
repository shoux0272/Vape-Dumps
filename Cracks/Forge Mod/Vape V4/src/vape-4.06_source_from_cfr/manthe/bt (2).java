/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package manthe;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import manthe.Cr;
import manthe.e3;
import manthe.eh;
import manthe.fG;
import manthe.pe;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

class bt {
    Cr a;

    bt() {
    }

    void a(float f10, float f11, int n6, int n10, float f12) {
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
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)f12);
        GL11.glPushMatrix();
        float f13 = 0.0f;
        float f14 = 1.0f;
        float f15 = 1.0f;
        float f16 = 0.0f;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f15, (float)f14);
        GL11.glVertex2f((float)(f10 + (float)n6), (float)f11);
        GL11.glTexCoord2f((float)f13, (float)f14);
        GL11.glVertex2f((float)f10, (float)f11);
        GL11.glTexCoord2f((float)f13, (float)f16);
        GL11.glVertex2f((float)f10, (float)(f11 + (float)n10));
        GL11.glTexCoord2f((float)f15, (float)f16);
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

    private void a(fG fG2) {
        int n6 = 32;
        int n10 = 32;
        int n11 = GL11.glGetInteger((int)36006);
        int n12 = GL11.glGetInteger((int)32873);
        boolean bl = GL11.glIsEnabled((int)3089);
        if (bl) {
            GL11.glDisable((int)3089);
        }
        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(64);
        byteBuffer.order(ByteOrder.nativeOrder());
        IntBuffer intBuffer = byteBuffer.asIntBuffer();
        GL11.glGetInteger((int)2978, (IntBuffer)intBuffer);
        GL11.glPushMatrix();
        this.a = new Cr(n6, n10, true);
        this.a.a(n6, n10);
        this.a.a(true);
        e3.g();
        e3.r();
        GL11.glEnable((int)2929);
        e3.r();
        GL11.glClearColor((float)0.0f, (float)0.0f, (float)0.0f, (float)0.0f);
        GL11.glClear((int)16384);
        GL11.glClear((int)256);
        GL11.glMatrixMode((int)5889);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glOrtho((double)0.0, (double)16.0, (double)16.0, (double)0.0, (double)-1000.0, (double)3000.0);
        GL11.glMatrixMode((int)5888);
        GL11.glPushMatrix();
        GL11.glLoadIdentity();
        GL11.glTranslatef((float)0.0f, (float)0.0f, (float)-2000.0f);
        eh.f();
        GL11.glEnable((int)32826);
        GL11.glPushMatrix();
        e3.f();
        pe.a(fG2, 1.0, 0.0, 0.0, true);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        GL11.glPopMatrix();
        this.a.b();
        GL11.glMatrixMode((int)5889);
        GL11.glPopMatrix();
        GL11.glMatrixMode((int)5888);
        eh.h();
        GL11.glDisable((int)32826);
        this.a.b();
        this.a.c();
        GL11.glPopMatrix();
        GL11.glViewport((int)intBuffer.get(0), (int)intBuffer.get(1), (int)intBuffer.get(2), (int)intBuffer.get(3));
        GL30.glBindFramebuffer((int)36160, (int)n11);
        e3.b(n12);
        if (bl) {
            GL11.glEnable((int)3089);
        }
    }

    static void a(bt bt2, fG fG2) {
        bt2.a(fG2);
    }
}

