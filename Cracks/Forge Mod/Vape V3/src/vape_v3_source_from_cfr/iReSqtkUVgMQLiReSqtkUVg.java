/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.util.Random;
import org.lwjgl.input.Keyboard;

public class iReSqtkUVgMQLiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private boolean b;
    private iReSqtkUVgkzHiReSqtkUVg c = iReSqtkUVgkzHiReSqtkUVg.a(this, "Range", "#.#", "", 0.0, 3.5, 6.0);
    private iReSqtkUVgfXGiReSqtkUVg d = iReSqtkUVgfXGiReSqtkUVg.a(this, "Delay", "#.#", "", 0.0, 90.0, 120.0, 1000.0);
    private Random e = new Random();

    public iReSqtkUVgMQLiReSqtkUVg() {
        super("WTap", -5632000, iReSqtkUVgqTOiReSqtkUVg.c);
        this.a(this.c, this.d);
    }

    private void x() {
        if (iReSqtkUVgeLLiReSqtkUVg.g().b()) {
            return;
        }
        int n = iReSqtkUVgeLLiReSqtkUVg.i().g().d();
        boolean bl = Keyboard.isKeyDown((int)n);
        iReSqtkUVgVnKiReSqtkUVg iReSqtkUVgVnKiReSqtkUVg2 = iReSqtkUVgrseiReSqtkUVg.a(this.c.i(), 0.0f);
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        if (!iReSqtkUVgeLLiReSqtkUVg.f().b()) {
            return;
        }
        if (!iReSqtkUVgtlXiReSqtkUVg2.aP()) {
            return;
        }
        if (iReSqtkUVgVnKiReSqtkUVg2 == null || iReSqtkUVgVnKiReSqtkUVg2.b()) {
            return;
        }
        if (!iReSqtkUVgVnKiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.B)) {
            return;
        }
        if (!iReSqtkUVgFuiiReSqtkUVg.e.r().a(iReSqtkUVgVnKiReSqtkUVg2, false)) {
            return;
        }
        if (!iReSqtkUVgrseiReSqtkUVg.a(iReSqtkUVgtlXiReSqtkUVg2, iReSqtkUVgVnKiReSqtkUVg2, 120.0)) {
            return;
        }
        if (!bl) {
            return;
        }
        if ((double)iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgVnKiReSqtkUVg2) < this.c.i()) {
            boolean bl2 = iReSqtkUVgtlXiReSqtkUVg2.n().i() > 0.0f;
            try {
                if (bl2) {
                    iReSqtkUVgqzriReSqtkUVg.a(n, false);
                    iReSqtkUVgqzriReSqtkUVg.a(n);
                    Thread.sleep(iReSqtkUVgKexiReSqtkUVg.b(this.e, 51, 75));
                    iReSqtkUVgqzriReSqtkUVg.a(n, true);
                    iReSqtkUVgqzriReSqtkUVg.a(n);
                    Thread.sleep(iReSqtkUVgKexiReSqtkUVg.b(this.e, 51, 75));
                    iReSqtkUVgqzriReSqtkUVg.a(n, false);
                    iReSqtkUVgqzriReSqtkUVg.a(n);
                    Thread.sleep(iReSqtkUVgKexiReSqtkUVg.b(this.e, 51, 75));
                    iReSqtkUVgqzriReSqtkUVg.a(n, Keyboard.isKeyDown((int)iReSqtkUVgeLLiReSqtkUVg.i().g().d()));
                    iReSqtkUVgqzriReSqtkUVg.a(n);
                    Thread.sleep((long)this.d.l());
                }
            }
            catch (InterruptedException interruptedException) {
                interruptedException.printStackTrace();
            }
        }
    }

    @Override
    public void g() {
        if (!this.b) {
            this.b = true;
            new iReSqtkUVgnFxiReSqtkUVg(this).start();
        }
    }

    static /* synthetic */ void a(iReSqtkUVgMQLiReSqtkUVg iReSqtkUVgMQLiReSqtkUVg2) {
        iReSqtkUVgMQLiReSqtkUVg2.x();
    }
}

