/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;

public class iReSqtkUVgcEyiReSqtkUVg
extends iReSqtkUVgNeViReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Re-enable", false, "Re-enables all previously enabled modules upon pressing bind a second time");
    private List<iReSqtkUVgJZmiReSqtkUVg> c = new ArrayList<iReSqtkUVgJZmiReSqtkUVg>();
    private boolean d = false;

    public iReSqtkUVgcEyiReSqtkUVg() {
        super("Panic", "Disables all currently enabled modules");
        this.a(this.b);
    }

    @Override
    public void g() {
        this.a(false);
        if (this.b.i().booleanValue()) {
            boolean bl = this.d = !this.d;
            if (!this.d) {
                for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : this.c) {
                    iReSqtkUVgJZmiReSqtkUVg2.a(true);
                }
                this.c.clear();
                return;
            }
        } else {
            this.d = false;
        }
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg3 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg3.b() || iReSqtkUVgJZmiReSqtkUVg3 == this) continue;
            iReSqtkUVgJZmiReSqtkUVg3.a(false);
            if (!this.b.i().booleanValue()) continue;
            this.c.add(iReSqtkUVgJZmiReSqtkUVg3);
        }
    }

    @Override
    public void a(iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2) {
        if (iReSqtkUVgJZmiReSqtkUVg2 != this) {
            this.d = false;
            this.c.clear();
        }
    }
}

