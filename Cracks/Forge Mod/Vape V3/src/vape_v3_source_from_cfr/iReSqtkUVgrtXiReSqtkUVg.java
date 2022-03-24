/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgrtXiReSqtkUVg {
    private static List a = new ArrayList();

    public static synchronized int a(int n) {
        int n2 = GL11.glGenLists((int)n);
        if (n2 == 0) {
            int n3 = GL11.glGetError();
            String string = "No error code reported";
            if (n3 != 0) {
                // empty if block
            }
            throw new IllegalStateException("glGenLists returned an ID of 0 for a count of " + n + ", GL error (" + n3 + "): " + string);
        }
        return n2;
    }

    public static synchronized void a(IntBuffer intBuffer) {
        GL11.glGenTextures((IntBuffer)intBuffer);
        for (int i = intBuffer.position(); i < intBuffer.limit(); ++i) {
            a.add(intBuffer.get(i));
        }
    }

    public static synchronized void a(int n, int n2) {
        GL11.glDeleteLists((int)n, (int)n2);
    }

    public static synchronized void b(int n) {
        iReSqtkUVgrtXiReSqtkUVg.a(n, 1);
    }

    public static synchronized ByteBuffer c(int n) {
        return ByteBuffer.allocateDirect(n).order(ByteOrder.nativeOrder());
    }

    public static IntBuffer d(int n) {
        return iReSqtkUVgrtXiReSqtkUVg.c(n << 2).asIntBuffer();
    }

    public static FloatBuffer e(int n) {
        return iReSqtkUVgrtXiReSqtkUVg.c(n << 2).asFloatBuffer();
    }
}

