/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 *  org.lwjgl.opengl.GL20
 */
package manthe;

import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL20;

public class lY {
    int b = GL20.glCreateProgram();
    int d = GL20.glCreateShader((int)35633);
    int a = GL20.glCreateShader((int)35632);
    int c;
    private static String e;

    public lY(String string, String string2) {
        GL20.glShaderSource((int)this.d, (CharSequence)string);
        GL20.glShaderSource((int)this.a, (CharSequence)string2);
        GL20.glCompileShader((int)this.d);
        GL20.glCompileShader((int)this.a);
        GL20.glAttachShader((int)this.b, (int)this.d);
        GL20.glAttachShader((int)this.b, (int)this.a);
        GL20.glLinkProgram((int)this.b);
    }

    public int a() {
        return this.b;
    }

    public void c() {
        this.c = GL11.glGetInteger((int)35725);
        GL20.glUseProgram((int)this.a());
    }

    public void d() {
        GL20.glUseProgram((int)this.c);
    }

    public static void b(String string) {
        e = string;
    }

    public static String b() {
        return e;
    }

    static {
        if (lY.b() == null) {
            lY.b("WBE7gb");
        }
    }
}

