/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgfqXiReSqtkUVg {
    public int a = 3553;
    public int b;
    public int c;
    public int d;
    public int e = 9729;
    public int f = 9728;
    public int g = 10496;
    public int h = 33071;
    public final int i = 10497;

    public iReSqtkUVgfqXiReSqtkUVg(InputStream inputStream) {
        this(inputStream, 9729);
    }

    public iReSqtkUVgfqXiReSqtkUVg(InputStream inputStream, int n) {
        this(inputStream, n, 33071);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public iReSqtkUVgfqXiReSqtkUVg(InputStream inputStream, int n, int n2) {
        try {
            iReSqtkUVgnBviReSqtkUVg iReSqtkUVgnBviReSqtkUVg2 = new iReSqtkUVgnBviReSqtkUVg(inputStream);
            this.c = iReSqtkUVgnBviReSqtkUVg2.b();
            this.d = iReSqtkUVgnBviReSqtkUVg2.a();
            int n3 = 4;
            ByteBuffer byteBuffer = BufferUtils.createByteBuffer((int)(4 * this.c * this.d));
            iReSqtkUVgnBviReSqtkUVg2.a(byteBuffer, this.c * 4, iReSqtkUVgwJYiReSqtkUVg.e);
            byteBuffer.flip();
            GL11.glEnable((int)this.a);
            this.b = GL11.glGenTextures();
            this.a();
            GL11.glPixelStorei((int)3317, (int)1);
            GL11.glTexParameteri((int)this.a, (int)10241, (int)n);
            GL11.glTexParameteri((int)this.a, (int)10240, (int)n);
            GL11.glTexParameteri((int)this.a, (int)10242, (int)n2);
            GL11.glTexParameteri((int)this.a, (int)10243, (int)n2);
            GL11.glTexImage2D((int)this.a, (int)0, (int)6408, (int)this.c, (int)this.d, (int)0, (int)6408, (int)5121, (ByteBuffer)byteBuffer);
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

    public void a() {
        iReSqtkUVgoOBiReSqtkUVg.a(this.b);
    }

    public static void a(iReSqtkUVgfqXiReSqtkUVg iReSqtkUVgfqXiReSqtkUVg2, float f, float f2, float f3, float f4) {
        float f5 = (float)iReSqtkUVgfqXiReSqtkUVg2.c / (float)iReSqtkUVgfqXiReSqtkUVg2.d;
        iReSqtkUVgfqXiReSqtkUVg2.a();
        float f6 = 0.0f;
        float f7 = 0.0f;
        float f8 = 1.0f;
        float f9 = 1.0f;
        GL11.glBegin((int)7);
        GL11.glTexCoord2f((float)f6, (float)f7);
        GL11.glVertex2f((float)f, (float)f2);
        GL11.glTexCoord2f((float)f6, (float)f9);
        GL11.glVertex2f((float)f, (float)(f2 + f4));
        GL11.glTexCoord2f((float)f8, (float)f9);
        GL11.glVertex2f((float)(f + (f3 *= f5)), (float)(f2 + f4));
        GL11.glTexCoord2f((float)f8, (float)f7);
        GL11.glVertex2f((float)(f + f3), (float)f2);
        GL11.glEnd();
    }
}

