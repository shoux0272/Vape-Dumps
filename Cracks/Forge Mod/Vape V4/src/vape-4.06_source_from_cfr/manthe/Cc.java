/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import a.a;
import java.awt.Color;
import manthe.R;
import manthe.my;
import manthe.p1;
import manthe.s7;
import manthe.y5;
import manthe.yI;
import manthe.zu;
import org.lwjgl.input.Keyboard;

class Cc
implements R {
    final y5 b;
    final zu c;
    final s7 a;

    Cc(s7 s72, y5 y52, zu zu2) {
        this.a = s72;
        this.b = y52;
        this.c = zu2;
    }

    public void a(p1 p12) {
        if (!s7.c(this.a).c()) {
            if (Keyboard.isKeyDown((int)15)) {
                if (!s7.b(this.a)) {
                    if (this.b.f()) {
                        this.a.W().z().a(this.b.g());
                        this.a.W().z().b(my.c);
                    }
                    s7.a(this.a, true);
                }
            } else {
                if (s7.a(this.a)) {
                    if (this.c.Z()) {
                        this.a.W().z().b(my.c);
                    } else {
                        this.a.W().z().b(my.i);
                    }
                }
                if (s7.b(this.a)) {
                    this.a.W().z().a(this.b.H());
                    s7.a(this.a, false);
                    this.a.W().z().b(my.i);
                }
            }
        }
        if (this.a.G()) {
            this.a.W().z().b(yI.a(this.a.W().f(), 45, 240));
        } else if (this.b.n() && !a.a.ib() || this.b.p() && this.b.c().isEmpty()) {
            this.a.W().z().b(Color.GRAY);
        } else {
            this.a.W().z().b(Color.WHITE);
        }
        if (s7.d(this.a)) {
            if (!this.c.Z()) {
                this.a.a(s7.f(this.a).G());
            } else {
                this.a.a(true);
            }
        }
    }
}

