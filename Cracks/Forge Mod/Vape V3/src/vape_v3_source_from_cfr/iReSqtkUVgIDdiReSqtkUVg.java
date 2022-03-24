/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgIDdiReSqtkUVg
extends iReSqtkUVgFWjiReSqtkUVg
implements iReSqtkUVgnPQiReSqtkUVg {
    private boolean h = false;

    public iReSqtkUVgIDdiReSqtkUVg(String string, boolean bl) {
        super(string, bl);
        this.a(new iReSqtkUVguyniReSqtkUVg(this));
        this.a(new iReSqtkUVgZCZiReSqtkUVg(this));
        this.c(false);
        this.D().c(false);
    }

    @Override
    public void a(Color color) {
        super.a(color);
        this.D().a(color);
    }

    @Override
    public void a(boolean bl) {
        if (this.h()) {
            GL11.glEnable((int)3042);
            GL11.glDisable((int)3553);
            GL11.glBlendFunc((int)770, (int)771);
            GL11.glEnable((int)3553);
            GL11.glDisable((int)3042);
        }
        super.a(bl);
    }

    @Override
    public void b_() {
        this.b(!this.b());
    }

    @Override
    public boolean b() {
        return this.h;
    }

    @Override
    public void b(boolean bl) {
        this.h = bl;
        this.c(this.b());
        this.D().c(this.b());
    }
}

