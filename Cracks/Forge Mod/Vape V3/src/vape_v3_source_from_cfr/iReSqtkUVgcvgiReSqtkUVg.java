/*
 * Decompiled with CFR 0.150.
 */
import java.awt.Color;

public class iReSqtkUVgcvgiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgncyiReSqtkUVg b = new iReSqtkUVgncyiReSqtkUVg("Hypixel", new iReSqtkUVgOWCiReSqtkUVg(this, "Hypixel"));
    private iReSqtkUVgZyLiReSqtkUVg c = iReSqtkUVgZyLiReSqtkUVg.a((Object)this, "Phase Mode", this.b, this.b);

    public iReSqtkUVgcvgiReSqtkUVg() {
        super("Phase", new Color(73, 208, 176).getRGB(), iReSqtkUVgqTOiReSqtkUVg.f, "Phase/Clip through walls.");
        this.a(this.c);
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgrbbiReSqtkUVg iReSqtkUVgrbbiReSqtkUVg2) {
    }

    @Override
    public void a(iReSqtkUVgTXviReSqtkUVg iReSqtkUVgTXviReSqtkUVg2) {
        this.a(this.c.i().N());
        ((iReSqtkUVgJZmiReSqtkUVg)this.b.a()).a(iReSqtkUVgTXviReSqtkUVg2);
    }

    @Override
    public void a(iReSqtkUVglTuiReSqtkUVg iReSqtkUVglTuiReSqtkUVg2) {
        if (iReSqtkUVglTuiReSqtkUVg2.a().toString().toUpperCase().equals("BLOCK")) {
            iReSqtkUVglTuiReSqtkUVg2.b().d(true);
        }
    }
}

