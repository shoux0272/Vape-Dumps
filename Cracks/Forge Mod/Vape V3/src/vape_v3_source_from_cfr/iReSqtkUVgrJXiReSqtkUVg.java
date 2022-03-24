/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.awt.Color;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.lwjgl.opengl.GL11;

public class iReSqtkUVgrJXiReSqtkUVg
extends iReSqtkUVgJZmiReSqtkUVg {
    private List<iReSqtkUVghnHiReSqtkUVg> c = new CopyOnWriteArrayList<iReSqtkUVghnHiReSqtkUVg>();
    private List<iReSqtkUVgeAuiReSqtkUVg> d = new CopyOnWriteArrayList<iReSqtkUVgeAuiReSqtkUVg>();
    public iReSqtkUVgvwXiReSqtkUVg b;
    private iReSqtkUVgoRmiReSqtkUVg e = iReSqtkUVgoRmiReSqtkUVg.a((Object)this, "Breadcrumbs", false, "Drops breadcrumbs in case you forgot where you came from.");
    private int f;

    public iReSqtkUVgrJXiReSqtkUVg() {
        super("Blink", 8919359, iReSqtkUVgqTOiReSqtkUVg.f, "Chokes packets until disabled.");
        this.b = iReSqtkUVgeLLiReSqtkUVg.s();
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public void a(iReSqtkUVgDVPiReSqtkUVg iReSqtkUVgDVPiReSqtkUVg2) {
        if (this.d.isEmpty()) {
            return;
        }
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
        for (iReSqtkUVgeAuiReSqtkUVg iReSqtkUVgeAuiReSqtkUVg2 : this.d) {
            Color color = Color.WHITE;
            if (iReSqtkUVgeAuiReSqtkUVg2 == this.d.get(0)) {
                color = Color.GREEN;
            }
            iReSqtkUVgoCkiReSqtkUVg.a(iReSqtkUVgeAuiReSqtkUVg2.a - 0.025, iReSqtkUVgeAuiReSqtkUVg2.b - 0.025, iReSqtkUVgeAuiReSqtkUVg2.c - 0.025, 0.05, 0.05, 0.05, 0.0, Color.WHITE, color, d2, d3, d4);
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
    public void a(iReSqtkUVgmTziReSqtkUVg iReSqtkUVgmTziReSqtkUVg2) {
        iReSqtkUVghnHiReSqtkUVg iReSqtkUVghnHiReSqtkUVg2 = iReSqtkUVgmTziReSqtkUVg2.getPacket();
        if (iReSqtkUVghnHiReSqtkUVg2.a().getClass().toString().contains("play.server") || iReSqtkUVghnHiReSqtkUVg2.a().toString().contains("SPacket")) {
            return;
        }
        if (!iReSqtkUVghnHiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.ci)) {
            if (iReSqtkUVghnHiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.cn) && !this.x()) {
                iReSqtkUVgmTziReSqtkUVg2.setCanceled(true);
            } else {
                if (iReSqtkUVghnHiReSqtkUVg2.a(iReSqtkUVgSzRiReSqtkUVg.cn)) {
                    ++this.f;
                    if (this.f >= 5) {
                        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
                        this.d.add(new iReSqtkUVgeAuiReSqtkUVg(iReSqtkUVgtlXiReSqtkUVg2.z(), iReSqtkUVgtlXiReSqtkUVg2.A(), iReSqtkUVgtlXiReSqtkUVg2.B()));
                        this.f = 0;
                    }
                }
                this.c.add(iReSqtkUVghnHiReSqtkUVg2);
                iReSqtkUVgmTziReSqtkUVg2.setCanceled(true);
            }
            this.a(String.valueOf(this.c.size()));
        }
    }

    private boolean x() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        return iReSqtkUVgtlXiReSqtkUVg2.C() != 0.0 || iReSqtkUVgtlXiReSqtkUVg2.E() != 0.0;
    }

    @Override
    public void g() {
        this.f = 0;
        this.c.clear();
        this.d.clear();
    }

    @Override
    public void h() {
        iReSqtkUVgtlXiReSqtkUVg iReSqtkUVgtlXiReSqtkUVg2 = iReSqtkUVgeLLiReSqtkUVg.e();
        for (iReSqtkUVghnHiReSqtkUVg iReSqtkUVghnHiReSqtkUVg2 : this.c) {
            iReSqtkUVgtlXiReSqtkUVg2.d().a(iReSqtkUVghnHiReSqtkUVg2);
            this.c.remove(iReSqtkUVghnHiReSqtkUVg2);
        }
        this.f = 0;
        this.c.clear();
        this.d.clear();
    }
}

