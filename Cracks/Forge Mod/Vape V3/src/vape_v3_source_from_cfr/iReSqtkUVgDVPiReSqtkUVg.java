/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgDVPiReSqtkUVg
extends iReSqtkUVgmupiReSqtkUVg {
    private float b;

    public iReSqtkUVgDVPiReSqtkUVg(float f) {
        this.b = f;
    }

    @Override
    public boolean fire() {
        for (iReSqtkUVgJZmiReSqtkUVg object : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!object.b()) continue;
            object.a(this);
        }
        boolean bl = iReSqtkUVgeLLiReSqtkUVg.i().n();
        iReSqtkUVgeLLiReSqtkUVg.i().a(false);
        iReSqtkUVgeLLiReSqtkUVg.n().a(this.b, 0);
        for (iReSqtkUVgJZmiReSqtkUVg iReSqtkUVgJZmiReSqtkUVg2 : iReSqtkUVgFuiiReSqtkUVg.e.d().d()) {
            if (!iReSqtkUVgJZmiReSqtkUVg2.b()) continue;
            iReSqtkUVgJZmiReSqtkUVg2.b(this);
        }
        iReSqtkUVgeLLiReSqtkUVg.i().a(bl);
        if (iReSqtkUVgeLLiReSqtkUVg.i().u() > 0) {
            iReSqtkUVgeLLiReSqtkUVg.n().a(1.0);
        }
        GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
        return this.isCanceled();
    }

    public float a() {
        return this.b;
    }
}

