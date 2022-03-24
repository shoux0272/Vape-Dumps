/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVgJISiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private boolean b;
    private iReSqtkUVgkzHiReSqtkUVg c = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Speed", "#.##", "", 0.1, 1.07, 2.0, 0.01);

    public iReSqtkUVgJISiReSqtkUVg() {
        super("Timer", 0xFF1010, iReSqtkUVgqTOiReSqtkUVg.f, "Modifies game timer");
        this.a(this.c);
    }

    @Override
    public void a(iReSqtkUVglBNiReSqtkUVg iReSqtkUVglBNiReSqtkUVg2) {
        this.b = !this.b;
        iReSqtkUVgeLLiReSqtkUVg.z().a(this.b ? 1.0f : this.c.i().floatValue());
    }

    @Override
    public void h() {
        iReSqtkUVgeLLiReSqtkUVg.z().a(1.0f);
    }
}

