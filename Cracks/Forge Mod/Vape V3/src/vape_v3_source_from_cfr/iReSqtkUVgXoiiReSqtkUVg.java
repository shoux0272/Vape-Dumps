/*
 * Decompiled with CFR 0.150.
 */
import a.d;

public class iReSqtkUVgXoiiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgoRmiReSqtkUVg b = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Temp Disable", false, "Temporarily disable account from authentication");

    public iReSqtkUVgXoiiReSqtkUVg() {
        super("SelfDestruct", 1, iReSqtkUVgqTOiReSqtkUVg.a, "You can press LEFT CONTROL + HOME on your keyboard to self destruct at any time, including while in a portal, GUI, or menu");
        this.l().add(this.b);
    }

    @Override
    public void a(iReSqtkUVgYAGiReSqtkUVg iReSqtkUVgYAGiReSqtkUVg2) {
    }

    @Override
    public void g() {
        iReSqtkUVgFuiiReSqtkUVg.e.g = true;
        if (!iReSqtkUVgeLLiReSqtkUVg.e().b()) {
            iReSqtkUVgeLLiReSqtkUVg.a(null);
            iReSqtkUVgeLLiReSqtkUVg.r();
            d.onGuiClosed(d.getGuiObject());
        }
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b() || iReSqtkUVgJZmiReSqtkUVg2.getClass().equals(iReSqtkUVgypOiReSqtkUVg.class)) continue;
            iReSqtkUVgJZmiReSqtkUVg2.a(false);
        }
        try {
            Thread.sleep(500L);
        }
        catch (InterruptedException interruptedException) {
            // empty catch block
        }
        iReSqtkUVgFuiiReSqtkUVg.e.a(this.b.i());
    }
}

