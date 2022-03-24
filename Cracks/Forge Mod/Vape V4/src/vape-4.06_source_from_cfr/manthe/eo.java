/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import manthe.cy;
import org.lwjgl.opengl.GL11;

public class eo
extends cy {
    public eo(Object object) {
        super(object);
    }

    public void f() {
        this.a(false);
    }

    public void g() {
        this.a(true);
    }

    public void a(boolean bl) {
        boolean bl2 = eo.a.M().al.a(this.b);
        if (bl != bl2) {
            eo.a.M().al.a(this.b, bl);
            if (bl) {
                GL11.glEnable((int)eo.a.M().al.b(this.b));
            } else {
                GL11.glDisable((int)eo.a.M().al.b(this.b));
            }
        }
    }
}

