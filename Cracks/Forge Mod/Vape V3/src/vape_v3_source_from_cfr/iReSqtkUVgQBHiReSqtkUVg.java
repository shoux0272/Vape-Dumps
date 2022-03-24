/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.BufferUtils
 *  org.lwjgl.opengl.GL11
 */
import java.nio.FloatBuffer;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgQBHiReSqtkUVg {
    private FloatBuffer a;
    private int b;
    private int c = 2;
    private int d = 7;
    private int e = -1;
    private float[] f;

    public void a(int n, int n2) {
        this.b = n;
        this.d = n2;
        this.c = 3;
        this.f = new float[n * this.c];
        this.a = BufferUtils.createFloatBuffer((int)(n * this.c));
    }

    public void a(int n) {
        this.a(n, 7);
    }

    public void a() {
        GL11.glEnableClientState((int)32884);
        GL11.glVertexPointer((int)this.c, (int)0, (FloatBuffer)this.a);
        GL11.glDrawArrays((int)this.d, (int)0, (int)this.b);
        GL11.glDisableClientState((int)32884);
        this.e = 0;
    }

    public void b() {
        this.e = 0;
        this.f = new float[this.b * this.c];
        this.a.clear();
    }

    public void c() {
        this.a.put(this.f);
        this.a.flip();
        this.a();
    }

    public void a(float f, float f2) {
        this.f[this.e++] = f;
        this.f[this.e++] = f2;
    }

    public void a(double d2, double d3, double d4) {
        this.f[this.e++] = (float)d2;
        this.f[this.e++] = (float)d3;
        this.f[this.e++] = (float)d4;
    }
}

