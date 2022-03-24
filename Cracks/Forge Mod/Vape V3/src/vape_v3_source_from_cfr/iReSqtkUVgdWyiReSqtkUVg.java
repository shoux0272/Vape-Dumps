/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import java.util.concurrent.atomic.AtomicBoolean;
import org.lwjgl.input.Keyboard;

class iReSqtkUVgdWyiReSqtkUVg
extends iReSqtkUVgilmiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgRyMiReSqtkUVg h;
    final /* synthetic */ AtomicBoolean p;
    final /* synthetic */ iReSqtkUVgnWNiReSqtkUVg q;
    final /* synthetic */ String r;
    final /* synthetic */ iReSqtkUVgiSWiReSqtkUVg s;

    iReSqtkUVgdWyiReSqtkUVg(iReSqtkUVgiSWiReSqtkUVg iReSqtkUVgiSWiReSqtkUVg2, String string, int n, double d2, iReSqtkUVgRyMiReSqtkUVg iReSqtkUVgRyMiReSqtkUVg2, AtomicBoolean atomicBoolean, iReSqtkUVgnWNiReSqtkUVg iReSqtkUVgnWNiReSqtkUVg2, String string2) {
        this.s = iReSqtkUVgiSWiReSqtkUVg2;
        this.h = iReSqtkUVgRyMiReSqtkUVg2;
        this.p = atomicBoolean;
        this.q = iReSqtkUVgnWNiReSqtkUVg2;
        this.r = string2;
        super(string, n, d2);
    }

    @Override
    public void c_() {
        super.c_();
        if (!this.h.b()) {
            if (Keyboard.isKeyDown((int)15)) {
                if (!this.p.get() && this.q.K()) {
                    this.a(this.q.s());
                    this.b(iReSqtkUVgIqLiReSqtkUVg.a);
                    this.p.set(true);
                }
            } else if (this.p.get()) {
                this.p.set(false);
                this.a(this.q.g());
                this.b(iReSqtkUVgIqLiReSqtkUVg.a);
            }
        }
        if (iReSqtkUVgFuiiReSqtkUVg.e.k().b().equals(this.q)) {
            this.c(true);
        } else {
            this.a(Color.WHITE);
            this.c(false);
        }
    }

    @Override
    public boolean a(int n, int n2, int n3) {
        if (this.t()) {
            if (n3 == 1) {
                if (!this.h.b() && Keyboard.isKeyDown((int)42)) {
                    this.q.c();
                    iReSqtkUVgiSWiReSqtkUVg.a(this.s, this, "Saved enabled", this.r, 1000L);
                } else {
                    this.q.b();
                    iReSqtkUVgiSWiReSqtkUVg.a(this.s, this, "Loaded enabled", this.r, 1000L);
                }
                return true;
            }
            if (n3 == 0) {
                if (Keyboard.isKeyDown((int)42)) {
                    this.h.run();
                } else {
                    iReSqtkUVgFuiiReSqtkUVg.e.k().d(this.q);
                }
            }
            return true;
        }
        return super.a(n, n2, n3);
    }
}

