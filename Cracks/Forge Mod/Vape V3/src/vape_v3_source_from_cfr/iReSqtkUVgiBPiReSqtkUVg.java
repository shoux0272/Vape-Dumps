/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

class iReSqtkUVgiBPiReSqtkUVg
implements iReSqtkUVgFeuiReSqtkUVg {
    final /* synthetic */ iReSqtkUVgZsZiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgilmiReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgMHdiReSqtkUVg c;

    iReSqtkUVgiBPiReSqtkUVg(iReSqtkUVgMHdiReSqtkUVg iReSqtkUVgMHdiReSqtkUVg2, iReSqtkUVgZsZiReSqtkUVg iReSqtkUVgZsZiReSqtkUVg2, iReSqtkUVgilmiReSqtkUVg iReSqtkUVgilmiReSqtkUVg2) {
        this.c = iReSqtkUVgMHdiReSqtkUVg2;
        this.a = iReSqtkUVgZsZiReSqtkUVg2;
        this.b = iReSqtkUVgilmiReSqtkUVg2;
    }

    public void a(iReSqtkUVgnCWiReSqtkUVg iReSqtkUVgnCWiReSqtkUVg2) {
        if (this.a.b() < 0) {
            this.b.a("  Bound to: " + iReSqtkUVgcuriReSqtkUVg.a(this.a.b()));
        } else {
            this.b.a("  Bound to: " + Keyboard.getKeyName((int)this.a.b()));
        }
    }
}

