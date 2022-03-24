/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.LinkedList;
import java.util.Queue;
import manthe.o7;
import manthe.on;
import manthe.r1;
import manthe.rH;
import manthe.rn;
import manthe.zu;
import org.lwjgl.opengl.GL11;

public class rO
extends rH {
    private final Queue<Long> ah = new LinkedList<Long>();

    public rO() {
        super("CPS Mod", 62.0, 16.0);
    }

    @Override
    public void c(boolean bl) {
        long l = System.currentTimeMillis();
        while (!this.ah.isEmpty() && this.ah.peek() < l) {
            this.ah.remove();
        }
        rn rn2 = null;
        for (r1 object2 : on.p.F().d()) {
            if (!(object2 instanceof rn)) continue;
            rn2 = (rn)object2;
            break;
        }
        if (rn2 == null) {
            return;
        }
        Color color = rn2.ap();
        GL11.glPushMatrix();
        o7.a(this.t(), this.k(), this.t() + this.q(), this.k() + this.b(), new Color(0, 0, 0, rn2.aq()));
        String string = this.ah.size() + " CPS";
        double d10 = this.r().a(string);
        if (!zu.ag()) {
            o7.a(0.0, 0.0, 0.0, 0.0, color);
        }
        this.r().b(string, this.t() + this.q() / 2.0, this.k() + this.b() / 2.0 - d10 / 2.0, color);
        if (!zu.ag()) {
            this.r().a("", 0.0, 0.0, -1);
        }
        this.b(16.0);
        GL11.glPopMatrix();
        super.c(bl);
    }

    public void a(long l) {
        this.ah.add(l + 1000L);
    }
}

