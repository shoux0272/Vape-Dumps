/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVghUmiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private List<iReSqtkUVgowliReSqtkUVg> b = new ArrayList<iReSqtkUVgowliReSqtkUVg>();
    private iReSqtkUVgvwXiReSqtkUVg c;
    private CopyOnWriteArrayList<iReSqtkUVgWjniReSqtkUVg> d = new CopyOnWriteArrayList();
    private iReSqtkUVgsPliReSqtkUVg e;
    private iReSqtkUVgsPliReSqtkUVg f;
    private iReSqtkUVgkzHiReSqtkUVg g = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "Range", "#", "", 1.0, 50.0, 100.0, 1.0);
    private iReSqtkUVgkzHiReSqtkUVg h = iReSqtkUVgkzHiReSqtkUVg.a((Object)this, "-", "-", "-", 5.0, 5.0, 5.0, 1.0);
    private iReSqtkUVgoRmiReSqtkUVg i = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Only caves", false, "Only looks for ores exposed to air");

    public iReSqtkUVghUmiReSqtkUVg() {
        super("Search", -16737793, iReSqtkUVgqTOiReSqtkUVg.b, "Draws outline around selected blocks\nAdd blocks in Search frame");
        this.c = iReSqtkUVgeLLiReSqtkUVg.s();
        this.a(this.g, this.i);
        ((iReSqtkUVgRNziReSqtkUVg)this.i.c()).a(new iReSqtkUVgSIPiReSqtkUVg(this));
    }

    public void a(iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2) {
        this.b.add(iReSqtkUVgowliReSqtkUVg2);
    }

    public void b(iReSqtkUVgowliReSqtkUVg iReSqtkUVgowliReSqtkUVg2) {
        this.b.remove(iReSqtkUVgowliReSqtkUVg2);
        for (iReSqtkUVgWjniReSqtkUVg iReSqtkUVgWjniReSqtkUVg2 : this.d) {
            if (iReSqtkUVgowliReSqtkUVg2.a() != iReSqtkUVgWjniReSqtkUVg2.d) continue;
            this.d.remove(iReSqtkUVgWjniReSqtkUVg2);
        }
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
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        double d2 = this.c.e();
        double d3 = this.c.f();
        double d4 = this.c.g();
        for (iReSqtkUVgWjniReSqtkUVg iReSqtkUVgWjniReSqtkUVg2 : this.d) {
            double d5 = iReSqtkUVgrseiReSqtkUVg.a((iReSqtkUVgjSjiReSqtkUVg)iReSqtkUVgtlXiReSqtkUVg2, (double)iReSqtkUVgWjniReSqtkUVg2.a, (double)iReSqtkUVgWjniReSqtkUVg2.b, (double)iReSqtkUVgWjniReSqtkUVg2.c);
            if (d5 <= this.g.i()) {
                iReSqtkUVgoCkiReSqtkUVg.a(iReSqtkUVgWjniReSqtkUVg2, d2, d3, d4);
                continue;
            }
            if (!(d5 > this.g.i() + 10.0)) continue;
            this.d.remove(iReSqtkUVgWjniReSqtkUVg2);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        iReSqtkUVgeLLiReSqtkUVg.n().b(1.0);
    }

    @Override
    public void g() {
        this.e = new iReSqtkUVgsPliReSqtkUVg(this.d, this.b, this.g);
        this.e.a();
        this.f = new iReSqtkUVgsPliReSqtkUVg(this.d, this.b, this.h);
        this.f.a();
    }

    @Override
    public void h() {
        this.e.b();
        this.f.b();
        this.d.clear();
    }

    static /* synthetic */ iReSqtkUVgsPliReSqtkUVg a(iReSqtkUVghUmiReSqtkUVg iReSqtkUVghUmiReSqtkUVg2) {
        return iReSqtkUVghUmiReSqtkUVg2.e;
    }

    static /* synthetic */ iReSqtkUVgoRmiReSqtkUVg b(iReSqtkUVghUmiReSqtkUVg iReSqtkUVghUmiReSqtkUVg2) {
        return iReSqtkUVghUmiReSqtkUVg2.i;
    }

    static /* synthetic */ iReSqtkUVgsPliReSqtkUVg c(iReSqtkUVghUmiReSqtkUVg iReSqtkUVghUmiReSqtkUVg2) {
        return iReSqtkUVghUmiReSqtkUVg2.f;
    }
}

