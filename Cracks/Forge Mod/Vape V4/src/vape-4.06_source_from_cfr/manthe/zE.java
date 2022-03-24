/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.AK;
import manthe.CQ;
import manthe.DB;
import manthe.DF;
import manthe.ac;
import manthe.ds;
import manthe.eJ;
import manthe.ef;
import manthe.ex;
import manthe.kx;
import manthe.pf;
import manthe.qD;
import manthe.qw;
import manthe.sT;
import manthe.tV;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class zE
extends y5 {
    private final List<qw> x = new ArrayList<qw>();
    private final ef u;
    private final CopyOnWriteArrayList<tV> z = new CopyOnWriteArrayList();
    private final DF C = DF.a((Object)this, "Range", "#", "", 1.0, 50.0, 100.0, 1.0);
    private final DF A = DF.a((Object)this, "-", "-", "-", 5.0, 5.0, 5.0, 1.0);
    private final DB v = DB.a((Object)this, "Only caves", false, "Only looks for ores exposed to air");
    private sT B;
    private sT w;
    private static boolean y;

    public zE() {
        super("Search", -16737793, CQ.d, "Draws outline around selected blocks\nAdd blocks in Search frame");
        this.u = ds.r();
        this.a(this.C, this.v);
        ((qD)this.v.c()).a(new AK(this));
    }

    public void a(qw qw2) {
        this.x.add(qw2);
    }

    public void b(qw qw2) {
        this.x.remove(qw2);
        for (tV tV2 : this.z) {
            if (qw2.g() != tV2.g) continue;
            this.z.remove(tV2);
        }
    }

    @Override
    public void a(kx kx2) {
        ds.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        eJ eJ2 = ds.k();
        double d10 = this.u.m();
        double d11 = this.u.n();
        double d12 = this.u.j();
        for (tV tV2 : this.z) {
            if (!tV2.a() || tV2.g == 0) continue;
            double d13 = pf.b((ex)eJ2, (double)tV2.a, (double)tV2.b, tV2.f);
            if (d13 <= this.C.a()) {
                ac.a(tV2, d10, d11, d12);
                continue;
            }
            if (!(d13 > this.C.a() + 10.0)) continue;
            this.z.remove(tV2);
        }
        GL11.glDepthMask((boolean)true);
        GL11.glEnable((int)2929);
        GL11.glEnable((int)3553);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glPopMatrix();
        ds.M().b(1.0);
    }

    @Override
    public void s() {
        this.B = new sT(this.z, this.x, this.C);
        this.w = new sT(this.z, this.x, this.A);
        this.B.a(this.v.u());
        this.w.a(this.v.u());
        this.B.e();
        this.w.e();
    }

    @Override
    public void J() {
        this.B.f();
        this.w.f();
        this.z.clear();
    }

    static sT a(zE zE2) {
        return zE2.B;
    }

    static DB b(zE zE2) {
        return zE2.v;
    }

    static sT c(zE zE2) {
        return zE2.w;
    }

    public static void e(boolean bl) {
        y = bl;
    }

    public static boolean S() {
        return y;
    }

    public static boolean T() {
        boolean bl = zE.S();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (zE.T()) {
            zE.e(true);
        }
    }
}

