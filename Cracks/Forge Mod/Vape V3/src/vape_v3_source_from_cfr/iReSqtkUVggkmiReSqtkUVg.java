/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import java.awt.Color;
import org.lwjgl.input.Keyboard;

class iReSqtkUVggkmiReSqtkUVg
implements iReSqtkUVgCxSiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgCMeiReSqtkUVg a;

    iReSqtkUVggkmiReSqtkUVg(iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2) {
        this.a = iReSqtkUVgCMeiReSqtkUVg2;
    }

    public void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2, int n, int n2, int n3) {
        if (n3 == 0) {
            if (Keyboard.isKeyDown((int)42)) {
                if (this.a.G()) {
                    iReSqtkUVgCMeiReSqtkUVg.c(this.a).a(this.a.m());
                    this.a.f(false);
                } else {
                    iReSqtkUVgCMeiReSqtkUVg.c(this.a).a(new Color(255, 28, 23, 210));
                    this.a.f(true);
                }
            }
            boolean bl = false;
            for (iReSqtkUVgCMeiReSqtkUVg iReSqtkUVgCMeiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.m().d()) {
                if (!iReSqtkUVgCMeiReSqtkUVg2.f_()) continue;
                bl = true;
            }
            if (!bl) {
                this.a.b_(true);
                iReSqtkUVgFuiiReSqtkUVg.e.m().d().remove(this.a);
                iReSqtkUVgFuiiReSqtkUVg.e.m().d().add(0, this.a);
            }
        } else if (n3 == 1) {
            this.a.c_(!this.a.h_());
        }
    }
}

