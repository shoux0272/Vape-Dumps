/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import org.lwjgl.input.Keyboard;

public class iReSqtkUVgePKiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Sneak", true, "Takes sneaking input");

    public iReSqtkUVgePKiReSqtkUVg() {
        super("InvWalk", new Color(193, 113, 0).getRGB(), iReSqtkUVgqTOiReSqtkUVg.f, "Walk and look around in UI's\nUse arrow keys to look around\nDoes not bypass some anti-cheats!");
        this.a(this.b);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        if (iReSqtkUVgTXviReSqtkUVg2.isPre()) {
            iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
            if (iReSqtkUVgeLLiReSqtkUVg.f().c() && !iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.g)) {
                if (Keyboard.isKeyDown((int)200) && iReSqtkUVgtlXiReSqtkUVg2.G() - 3.0f > -90.0f) {
                    iReSqtkUVgtlXiReSqtkUVg2.g(iReSqtkUVgtlXiReSqtkUVg2.G() - 3.0f);
                }
                if (Keyboard.isKeyDown((int)208) && iReSqtkUVgtlXiReSqtkUVg2.G() + 3.0f < 90.0f) {
                    iReSqtkUVgtlXiReSqtkUVg2.g(iReSqtkUVgtlXiReSqtkUVg2.G() + 3.0f);
                }
                if (Keyboard.isKeyDown((int)203)) {
                    iReSqtkUVgtlXiReSqtkUVg2.f(iReSqtkUVgtlXiReSqtkUVg2.F() - 5.0f);
                }
                if (Keyboard.isKeyDown((int)205)) {
                    iReSqtkUVgtlXiReSqtkUVg2.f(iReSqtkUVgtlXiReSqtkUVg2.F() + 5.0f);
                }
            }
        }
    }

    private void a(iReSqtkUVgqzriReSqtkUVg iReSqtkUVgqzriReSqtkUVg2) {
        if (Keyboard.isKeyDown((int)iReSqtkUVgqzriReSqtkUVg2.d())) {
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), true);
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d());
        } else if (iReSqtkUVgqzriReSqtkUVg2.f()) {
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d(), false);
            iReSqtkUVgqzriReSqtkUVg.a(iReSqtkUVgqzriReSqtkUVg2.d());
        }
    }

    @Override
    public void a(iReSqtkUVgXsFiReSqtkUVg iReSqtkUVgXsFiReSqtkUVg2) {
        if (iReSqtkUVgXsFiReSqtkUVg2.a().a(iReSqtkUVgSzRiReSqtkUVg.e) && iReSqtkUVgeLLiReSqtkUVg.f().c() && !iReSqtkUVgeLLiReSqtkUVg.f().a(iReSqtkUVgSzRiReSqtkUVg.g)) {
            iReSqtkUVgmCeiReSqtkUVg iReSqtkUVgmCeiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.i();
            this.a(iReSqtkUVgmCeiReSqtkUVg2.g());
            this.a(iReSqtkUVgmCeiReSqtkUVg2.h());
            this.a(iReSqtkUVgmCeiReSqtkUVg2.i());
            this.a(iReSqtkUVgmCeiReSqtkUVg2.j());
            this.a(iReSqtkUVgmCeiReSqtkUVg2.k());
            if (this.b.i().booleanValue()) {
                this.a(iReSqtkUVgmCeiReSqtkUVg2.l());
            }
        }
    }
}

