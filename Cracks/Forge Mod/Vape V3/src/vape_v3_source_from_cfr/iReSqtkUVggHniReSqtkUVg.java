/*
 * Decompiled with CFR 0.150.
 */
public class iReSqtkUVggHniReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private final iReSqtkUVgkzHiReSqtkUVg b = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Expand amount", "#.##", "", 0.0, 0.35, 1.0, 0.01);

    public iReSqtkUVggHniReSqtkUVg() {
        super("HitBoxes", -16711707, iReSqtkUVgqTOiReSqtkUVg.f, "Expands entities hitboxes");
        this.a(this.b);
    }

    public float x() {
        if (!this.b()) {
            return 0.0f;
        }
        return this.b.i().floatValue();
    }

    public float y() {
        return this.b.i().floatValue();
    }
}

