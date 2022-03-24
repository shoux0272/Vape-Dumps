/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package manthe;

import java.awt.Color;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import manthe.cX;
import manthe.e3;
import manthe.mP;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class m0 {
    public final int h = 10497;
    public int d = 3553;
    public int f;
    public int a;
    public int e;
    public int c = 9729;
    public int g = 9728;
    public int i = 10496;
    public int b = 33071;

    public m0(InputStream inputStream) throws IOException {
        this(inputStream, 9729);
    }

    public m0(InputStream inputStream, int n6) throws IOException {
        this(inputStream, n6, 33071);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public m0(InputStream inputStream, int n6, int n10) throws IOException {
        try {
            mP mP2 = new mP(inputStream);
            this.a = mP2.d();
            this.e = mP2.h();
            int n11 = 4;
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(4 * this.a * this.e));
            mP2.a(byteBuffer, this.a * 4, cX.RGBA);
            byteBuffer.flip();
            GL11.glEnable((int)this.d);
            this.f = GL11.glGenTextures();
            this.a();
            GL11.glPixelStorei((int)3317, (int)1);
            GL11.glTexParameteri((int)this.d, (int)10241, (int)n6);
            GL11.glTexParameteri((int)this.d, (int)10240, (int)n6);
            GL11.glTexParameteri((int)this.d, (int)10242, (int)n10);
            GL11.glTexParameteri((int)this.d, (int)10243, (int)n10);
            if (n6 == 9987) {
                GL11.glTexParameteri((int)this.d, (int)33084, (int)0);
                GL11.glTexParameteri((int)this.d, (int)33085, (int)1);
            }
            GL11.glTexImage2D((int)this.d, (int)0, (int)6408, (int)this.a, (int)this.e, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
            if (n6 == 9987) {
                GL30.glGenerateMipmap((int)3553);
            }
        }
        finally {
            if (inputStream != null) {
                try {
                    inputStream.close();
                }
                catch (IOException iOException) {}
            }
        }
    }

    public static void a(m0 m02, float f10, float f11, float f12, float f13) {
        float f14 = (float)m02.a / (float)m02.e;
        m02.a();
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 1.0f;
        float f18 = 1.0f;
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f17, (float)f16);
        GL11.glVertex2f((float)(f10 + (f12 *= f14)), (float)f11);
        GL11.glTexCoord2f((float)f15, (float)f16);
        GL11.glVertex2f((float)f10, (float)f11);
        GL11.glTexCoord2f((float)f15, (float)f18);
        GL11.glVertex2f((float)f10, (float)(f11 + f13));
        GL11.glTexCoord2f((float)f17, (float)f18);
        GL11.glVertex2f((float)(f10 + f12), (float)(f11 + f13));
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
    }

    public static void a(m0 m02, float f10, float f11, float f12, float f13, Color color, Color color2) {
        float f14 = (float)m02.a / (float)m02.e;
        m02.a();
        float f15 = 0.0f;
        float f16 = 0.0f;
        float f17 = 1.0f;
        float f18 = 1.0f;
        GL11.glShadeModel((int)7425);
        GL11.glBegin((int)7);
        GL11.glColor4d((double)((double)color.getRed() / 255.0), (double)((double)color.getGreen() / 255.0), (double)((double)color.getBlue() / 255.0), (double)((double)color.getAlpha() / 255.0));
        GL11.glTexCoord2f((float)f17, (float)f16);
        GL11.glVertex2f((float)(f10 + (f12 *= f14)), (float)f11);
        GL11.glTexCoord2f((float)f15, (float)f16);
        GL11.glVertex2f((float)f10, (float)f11);
        GL11.glColor4d((double)((double)color2.getRed() / 255.0), (double)((double)color2.getGreen() / 255.0), (double)((double)color2.getBlue() / 255.0), (double)((double)color2.getAlpha() / 255.0));
        GL11.glTexCoord2f((float)f15, (float)f18);
        GL11.glVertex2f((float)f10, (float)(f11 + f13));
        GL11.glTexCoord2f((float)f17, (float)f18);
        GL11.glVertex2f((float)(f10 + f12), (float)(f11 + f13));
        GL11.glEnd();
        GL11.glShadeModel((int)7424);
    }

    public void a() {
        e3.b(this.f);
    }
}

