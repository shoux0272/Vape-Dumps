/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgaOOiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgvwXiReSqtkUVg b;
    private Color c = new Color(20, 20, 20, 128);
    private iReSqtkUVgkzHiReSqtkUVg d = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Scale", "#.#", "", 0.1, 1.0, 1.5, 0.1);
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a(this, "Show distance", true);
    private iReSqtkUVgwDGiReSqtkUVg f = iReSqtkUVgwDGiReSqtkUVg.a((Object)this, "Spawner names-whitelist", "Spawners", iReSqtkUVgeMGiReSqtkUVg.a, "Zombie", "Skeleton", "Creeper", "Spider");

    public iReSqtkUVgaOOiReSqtkUVg() {
        super("SpawnerFinder", 9976573, iReSqtkUVgqTOiReSqtkUVg.e);
        this.b = iReSqtkUVgeLLiReSqtkUVg.s();
        this.a(this.d, this.e, this.f);
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        boolean bl = GL11.glIsEnabled((int)3042);
        iReSqtkUVgeLLiReSqtkUVg.n().a(1.0);
        GL11.glPushMatrix();
        if (!bl) {
            GL11.glEnable((int)3042);
        }
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d2 = this.b.e();
        double d3 = this.b.f();
        double d4 = this.b.g();
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().g()) {
            iReSqtkUVgfjEiReSqtkUVg iReSqtkUVgfjEiReSqtkUVg2;
            String string;
            if (!iReSqtkUVgSzRiReSqtkUVg.aE.isInstance(e) || !this.f.c(string = (iReSqtkUVgfjEiReSqtkUVg2 = new iReSqtkUVgfjEiReSqtkUVg(e)).h().d())) continue;
            String string2 = "";
            if (this.e.i().booleanValue()) {
                String string3 = iReSqtkUVgVUTiReSqtkUVg.b + "a[" + iReSqtkUVgVUTiReSqtkUVg.b + "f" + (int)iReSqtkUVgtlXiReSqtkUVg2.a(iReSqtkUVgfjEiReSqtkUVg2.d(), (double)iReSqtkUVgfjEiReSqtkUVg2.e(), (double)iReSqtkUVgfjEiReSqtkUVg2.f()) + iReSqtkUVgVUTiReSqtkUVg.b + "a]" + iReSqtkUVgVUTiReSqtkUVg.b + "r";
                string2 = string2 + string3 + " ";
            }
            string2 = string2 + string + " spawner";
            iReSqtkUVgoCkiReSqtkUVg.a(string2, (double)iReSqtkUVgfjEiReSqtkUVg2.d() - d2 + 0.5, (double)iReSqtkUVgfjEiReSqtkUVg2.e() - d3 - 1.0, (double)iReSqtkUVgfjEiReSqtkUVg2.f() - d4 + 0.5, this.d.i(), iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgtlXiReSqtkUVg2, (double)iReSqtkUVgfjEiReSqtkUVg2.d(), (double)iReSqtkUVgfjEiReSqtkUVg2.e(), (double)iReSqtkUVgfjEiReSqtkUVg2.f()), -1, this.c, 1.4);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        if (!bl) {
            GL11.glDisable((int)3042);
        }
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
    }
}

