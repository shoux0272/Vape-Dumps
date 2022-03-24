/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class BT {
    private static final List a = new ArrayList();

    public static synchronized int c(int n6) {
        int n10 = GL11.glGenLists((int)n6);
        if (n10 == 0) {
            int n11 = GL11.glGetError();
            String string = "No error code reported";
            if (n11 != 0) {
                // empty if block
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n6 + ", GL error (" + n11 + "): " + string);
        }
        return n10;
    }

    public static synchronized void a(IntBuffer intBuffer) {
        GL11.glGenTextures((IntBuffer)intBuffer);
        for (int k = intBuffer.position(); k < intBuffer.limit(); ++k) {
            a.add(intBuffer.get(k));
        }
    }

    public static synchronized void a(int n6, int n10) {
        GL11.glDeleteLists((int)n6, (int)n10);
    }

    public static synchronized void d(int n6) {
        BT.a(n6, 1);
    }

    public static synchronized ByteBuffer e(int n6) {
        return ByteBuffer.allocateDirect(n6).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer b(int n6) {
        return BT.e(n6 << 2).asIntBuffer();
    }

    public static FloatBuffer a(int n6) {
        return BT.e(n6 << 2).asFloatBuffer();
    }
}

