/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL30
 */
package manthe;

import java.nio.ByteBuffer;
import manthe.e3;
import manthe.on;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL30;

public class Cr {
    public int k;
    public int h;
    public int e;
    public int g;
    public boolean d;
    public int c;
    public int a;
    public int i;
    public float[] b;
    public int j;
    final boolean f = true;

    public Cr(int n6, int n10, boolean bl) {
        this.d = bl;
        this.c = -1;
        this.a = -1;
        this.i = -1;
        this.b = new float[4];
        this.b[0] = 1.0f;
        this.b[1] = 1.0f;
        this.b[2] = 1.0f;
        this.b[3] = 0.0f;
        this.b(n6, n10);
    }

    public void b(int n6, int n10) {
        e3.g();
        if (this.c >= 0) {
            // empty if block
        }
        this.a(n6, n10);
        this.e();
        GL30.glBindFramebuffer((int)36160, (int)0);
    }

    public void e() {
        int n6 = GL30.glCheckFramebufferStatus((int)36160);
        if (n6 != 36053) {
            on.a("Error creating fbo " + n6);
        }
    }

    public void a(int n6, int n10) {
        this.e = n6;
        this.g = n10;
        this.k = n6;
        this.h = n10;
        this.c = GL30.glGenFramebuffers();
        this.a = GL11.glGenTextures();
        if (this.d) {
            this.i = GL30.glGenRenderbuffers();
        }
        this.a(9728);
        e3.b(this.a);
        GL11.glTexImage2D((int)3553, (int)0, (int)32856, (int)this.k, (int)this.h, (int)0, (int)6408, (int)5121, (ByteBuffer)null);
        GL30.glBindFramebuffer((int)36160, (int)this.c);
        GL30.glFramebufferTexture2D((int)36160, (int)36064, (int)3553, (int)this.a, (int)0);
        if (this.d) {
            GL30.glBindRenderbuffer((int)36161, (int)this.i);
            GL30.glRenderbufferStorage((int)36161, (int)33190, (int)this.k, (int)this.h);
            GL30.glFramebufferRenderbuffer((int)36160, (int)36096, (int)36161, (int)this.i);
        }
        this.f();
        this.a();
    }

    public void d() {
    }

    public void a(boolean bl) {
        GL30.glBindFramebuffer((int)36160, (int)this.c);
        if (bl) {
            GL11.glViewport((int)0, (int)0, (int)this.e, (int)this.g);
        }
    }

    public void b() {
        e3.b(this.a);
    }

    public void c() {
        GL30.glBindFramebuffer((int)36160, (int)0);
    }

    public void a() {
        e3.b(0);
    }

    public void a(int n6) {
        this.j = n6;
        e3.b(this.a);
        GL11.glTexParameterf((int)3553, (int)10241, (float)n6);
        GL11.glTexParameterf((int)3553, (int)10240, (float)n6);
        GL11.glTexParameterf((int)3553, (int)10242, (float)10496.0f);
        GL11.glTexParameterf((int)3553, (int)10243, (float)10496.0f);
        e3.b(0);
    }

    public void f() {
        this.a(true);
        GL11.glClearColor((float)this.b[0], (float)this.b[1], (float)this.b[2], (float)this.b[3]);
        int n6 = 16384;
        if (this.d) {
            GL11.glClearDepth((double)1.0);
            n6 |= 0x100;
        }
        GL11.glClear((int)n6);
        this.c();
    }
}

