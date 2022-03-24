/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgzxOiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private iReSqtkUVgvwXiReSqtkUVg b;
    private iReSqtkUVgoRmiReSqtkUVg c = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Outline open", true, "Outlines open chests by contrasting color");
    private iReSqtkUVgoRmiReSqtkUVg d = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Chests", true);
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Enderchests", false);
    private iReSqtkUVgoRmiReSqtkUVg f = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Hopper", false);
    private iReSqtkUVgoRmiReSqtkUVg g = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Furnace", false);
    private iReSqtkUVgoRmiReSqtkUVg h = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Dispenser", false);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a(this, "Render Dropper", false);
    private iReSqtkUVgZfciReSqtkUVg j = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Chest Color", new Color(1, 255, 146, 100));
    private iReSqtkUVgZfciReSqtkUVg k = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Ender Chest Color", new Color(1, 255, 146, 100));
    private iReSqtkUVgZfciReSqtkUVg l = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Hopper Color", new Color(1, 255, 146, 100));
    private iReSqtkUVgZfciReSqtkUVg m = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Furnace Color", new Color(1, 255, 146, 100));
    private iReSqtkUVgZfciReSqtkUVg n = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Dispenser Color", new Color(1, 255, 146, 100));
    private iReSqtkUVgZfciReSqtkUVg o = iReSqtkUVgZfciReSqtkUVg.a((Object)this, "Dropper Color", new Color(1, 255, 146, 100));

    public iReSqtkUVgzxOiReSqtkUVg() {
        super("StorageESP", 3465010, iReSqtkUVgqTOiReSqtkUVg.e);
        this.d.k().add(this.j);
        this.e.k().add(this.k);
        this.f.k().add(this.l);
        this.g.k().add(this.m);
        this.h.k().add(this.n);
        this.i.k().add(this.o);
        this.a(this.c, this.d, this.j, this.e, this.k, this.f, this.l, this.g, this.m, this.h, this.n, this.i, this.o);
        this.b = iReSqtkUVgeLLiReSqtkUVg.s();
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        iReSqtkUVgeLLiReSqtkUVg.n().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d2 = this.b.e();
        double d3 = this.b.f();
        double d4 = this.b.g();
        for (Object e : iReSqtkUVgeLLiReSqtkUVg.g().g()) {
            iReSqtkUVgWjniReSqtkUVg iReSqtkUVgWjniReSqtkUVg2;
            iReSqtkUVgoFRiReSqtkUVg iReSqtkUVgoFRiReSqtkUVg2;
            Color color = null;
            iReSqtkUVgoFRiReSqtkUVg iReSqtkUVgoFRiReSqtkUVg3 = null;
            if (this.d.i().booleanValue() && iReSqtkUVgSzRiReSqtkUVg.aC.isInstance(e)) {
                color = this.j.k();
                iReSqtkUVgoFRiReSqtkUVg3 = new iReSqtkUVgORjiReSqtkUVg(e);
            } else if (this.e.i().booleanValue() && iReSqtkUVgSzRiReSqtkUVg.aD.isInstance(e)) {
                color = this.k.k();
                iReSqtkUVgoFRiReSqtkUVg3 = new iReSqtkUVgEdaiReSqtkUVg(e);
            } else if (this.f.i().booleanValue() && iReSqtkUVgSzRiReSqtkUVg.aF.isInstance(e)) {
                color = this.l.k();
            } else if (this.g.i().booleanValue() && iReSqtkUVgSzRiReSqtkUVg.aG.isInstance(e)) {
                color = this.m.k();
            } else if (this.i.i().booleanValue() && iReSqtkUVgSzRiReSqtkUVg.aH.isInstance(e)) {
                color = this.o.k();
            } else if (this.h.i().booleanValue() && iReSqtkUVgSzRiReSqtkUVg.aI.isInstance(e)) {
                color = this.n.k();
            }
            if (color == null) continue;
            if (iReSqtkUVgoFRiReSqtkUVg3 == null) {
                iReSqtkUVgoFRiReSqtkUVg3 = new iReSqtkUVgoFRiReSqtkUVg(e);
            }
            color = new Color(color.getRed(), color.getGreen(), color.getBlue(), 100);
            if (iReSqtkUVgoFRiReSqtkUVg3 instanceof iReSqtkUVgORjiReSqtkUVg) {
                iReSqtkUVgoFRiReSqtkUVg2 = iReSqtkUVgoFRiReSqtkUVg3;
                iReSqtkUVgWjniReSqtkUVg2 = this.c.i().booleanValue() ? new iReSqtkUVgNHCiReSqtkUVg(iReSqtkUVgoFRiReSqtkUVg3.d(), iReSqtkUVgoFRiReSqtkUVg3.e(), iReSqtkUVgoFRiReSqtkUVg3.f(), -1, color, ((iReSqtkUVgORjiReSqtkUVg)iReSqtkUVgoFRiReSqtkUVg2).h()) : new iReSqtkUVgWjniReSqtkUVg(iReSqtkUVgoFRiReSqtkUVg3.d(), iReSqtkUVgoFRiReSqtkUVg3.e(), iReSqtkUVgoFRiReSqtkUVg3.f(), -1, color);
            } else if (iReSqtkUVgoFRiReSqtkUVg3 instanceof iReSqtkUVgEdaiReSqtkUVg) {
                iReSqtkUVgoFRiReSqtkUVg2 = (iReSqtkUVgEdaiReSqtkUVg)iReSqtkUVgoFRiReSqtkUVg3;
                iReSqtkUVgWjniReSqtkUVg2 = new iReSqtkUVgNHCiReSqtkUVg(iReSqtkUVgoFRiReSqtkUVg3.d(), iReSqtkUVgoFRiReSqtkUVg3.e(), iReSqtkUVgoFRiReSqtkUVg3.f(), -1, color, ((iReSqtkUVgEdaiReSqtkUVg)iReSqtkUVgoFRiReSqtkUVg2).h());
            } else {
                iReSqtkUVgWjniReSqtkUVg2 = new iReSqtkUVgWjniReSqtkUVg(iReSqtkUVgoFRiReSqtkUVg3.d(), iReSqtkUVgoFRiReSqtkUVg3.e(), iReSqtkUVgoFRiReSqtkUVg3.f(), -1, color);
            }
            iReSqtkUVgoCkiReSqtkUVg.a(d2, d3, d4, iReSqtkUVgWjniReSqtkUVg2, color);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
    }
}

