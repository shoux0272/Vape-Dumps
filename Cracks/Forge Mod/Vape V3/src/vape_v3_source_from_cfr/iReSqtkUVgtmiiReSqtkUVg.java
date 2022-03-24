/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
import org.lwjgl.input.Keyboard;

class iReSqtkUVgtmiiReSqtkUVg
implements iReSqtkUVgycViReSqtkUVg {
    final /* synthetic */ iReSqtkUVgJZmiReSqtkUVg a;
    final /* synthetic */ iReSqtkUVgycViReSqtkUVg b;
    final /* synthetic */ iReSqtkUVgYTjiReSqtkUVg c;

    iReSqtkUVgtmiiReSqtkUVg(iReSqtkUVgYTjiReSqtkUVg iReSqtkUVgYTjiReSqtkUVg2, iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2, iReSqtkUVgycViReSqtkUVg iReSqtkUVgycViReSqtkUVg2) {
        this.c = iReSqtkUVgYTjiReSqtkUVg2;
        this.a = iReSqtkUVgJZmiReSqtkUVg2;
        this.b = iReSqtkUVgycViReSqtkUVg2;
    }

    @Override
    public void a(int n, int n2, int n3) {
        if (this.a.r() && n3 == 0) {
            if (this.a.I().isEmpty()) {
                iReSqtkUVgYTjiReSqtkUVg.a(this.c, "Must be bound", 1500L);
            } else {
                iReSqtkUVgYTjiReSqtkUVg.a(this.c, "Must use bind", 1500L);
            }
        }
        if (Keyboard.isKeyDown((int)42)) {
            iReSqtkUVgYTjiReSqtkUVg.a(this.c).run();
        } else if (this.c.J().b()) {
            this.b.a(n, n2, n3);
        }
    }
}

