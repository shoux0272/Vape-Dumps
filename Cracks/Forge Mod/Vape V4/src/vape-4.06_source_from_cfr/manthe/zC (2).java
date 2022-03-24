/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import com.google.common.collect.Lists;
import java.awt.Color;
import java.util.ArrayList;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.DE;
import manthe.Ds;
import manthe.V;
import manthe.dN;
import manthe.dn;
import manthe.ds;
import manthe.e3;
import manthe.eC;
import manthe.eJ;
import manthe.ej;
import manthe.ex;
import manthe.k5;
import manthe.kA;
import manthe.kc;
import manthe.kq;
import manthe.lK;
import manthe.ll;
import manthe.o7;
import manthe.on;
import manthe.y5;
import manthe.z2;
import org.lwjgl.opengl.GL11;

public class zC
extends y5 {
    private final DB w = DB.a((Object)this, "Hide Bots", false, "Doesn't apply chams on bots.");
    private final DB v = DB.a((Object)this, "Colored", false, "Colors entities.");
    private final DE z = DE.a((Object)this, "Visible Color", new Color(255, 0, 0));
    private final DB x = DB.a((Object)this, "Color Behind Walls", true, "Renders a different color when\nplayers are behind walls.");
    private final DE B = DE.a((Object)this, "Invisible Color", new Color(255, 255, 0));
    private boolean u;
    private ej A;
    private int y;

    public zC() {
        super("Chams", -16711936, CQ.d, "Render players through walls.");
        this.a(this.w, this.v.a(this.z, this.x.a(new Ds[]{this.B})), this.z, this.x, this.B);
    }

    @Override
    public void a(kA kA2) {
        if (!this.u) {
            return;
        }
        if (ds.t().e()) {
            return;
        }
        eJ eJ2 = ds.k();
        ex ex2 = kA2.getEntity();
        if (ex2.equals(eJ2)) {
            return;
        }
        kA2.a(true);
    }

    @Override
    public void a(lK lK2) {
        if (lK2.getClientPlayer().a(A5.u)) {
            return;
        }
        dN dN2 = (dN)lK2.getForgeEvent();
        if (!this.u) {
            return;
        }
        if (ds.t().e()) {
            return;
        }
        lK2.getForgeEvent().a(true);
        dN2.c(false);
        dN2.e(false);
        dN2.d(false);
    }

    @Override
    public void a(ll ll2) {
        if (this.u) {
            if (ds.t().e()) {
                return;
            }
            dn dn2 = (dn)ll2.getForgeEvent();
            dn2.a(0);
        }
    }

    @Override
    public void a(k5 k52) {
        if (k52.getEntity().a(A5.cc) && !k52.getEntity().a(A5.u) && this.v.u().booleanValue() && this.u) {
            if (this.y == 1) {
                o7.a(this.x.u() != false ? this.B.K() : this.z.K());
            }
            if (this.y == 2) {
                o7.a(this.z.K());
            }
        }
    }

    @Override
    public void a(kc kc2) {
        if (this.w.u().booleanValue() && on.p.t().b((ex)kc2.getEntityPlayer())) {
            return;
        }
        z2 z22 = on.p.H().b(z2.class);
        if (this.u || this.y == 3 || z22.N() && z22.S()) {
            return;
        }
        if (!this.v.u().booleanValue()) {
            if (kc2.getEntityPlayer().a(A5.cc) && !kc2.getEntityPlayer().a(A5.u)) {
                GL11.glEnable((int)32823);
                GL11.glPolygonOffset((float)1.0f, (float)-2500000.0f);
            }
        } else if (kc2.getEntityPlayer().d() && kc2.getRenderer().d() && !kc2.getEntityPlayer().a(A5.u)) {
            if (V.c() == 13) {
                kc2.a(true);
            }
            eC eC2 = kc2.getEntityPlayer();
            double d10 = kc2.getX();
            double d11 = kc2.getY();
            double d12 = kc2.getZ();
            float f10 = eC2.ag() + (eC2.U() - eC2.ag()) * kc2.getPartialTicks();
            GL11.glPushMatrix();
            GL11.glDisable((int)2929);
            GL11.glDisable((int)3553);
            e3.l();
            o7.a(this.x.u() != false ? this.B.K() : this.z.K());
            ArrayList arrayList = null;
            if (V.c() > 13) {
                arrayList = Lists.newArrayList(kc2.getRenderer().f());
                kc2.getRenderer().f().clear();
            }
            try {
                this.u = true;
                this.y = 1;
                kc2.getRenderer().a(eC2, d10, d11, d12, f10, kc2.getPartialTicks());
            }
            catch (Exception exception) {
                // empty catch block
            }
            this.u = false;
            GL11.glEnable((int)2929);
            GL11.glEnable((int)3553);
            if (V.c() == 13) {
                this.y = 3;
                GL11.glPushMatrix();
                GL11.glEnable((int)2896);
                kc2.getRenderer().a(eC2, d10, d11, d12, f10, kc2.getPartialTicks());
                GL11.glDepthMask((boolean)false);
                GL11.glDisable((int)2896);
                GL11.glPopMatrix();
            }
            this.u = true;
            o7.a(this.z.K());
            GL11.glDisable((int)3553);
            try {
                this.y = 2;
                kc2.getRenderer().a(eC2, d10, d11, d12, f10, kc2.getPartialTicks());
                this.u = false;
            }
            catch (Exception exception) {
                // empty catch block
            }
            if (V.c() > 13) {
                kc2.getRenderer().a(arrayList);
            }
            GL11.glEnable((int)3553);
            GL11.glColor4f((float)1.0f, (float)1.0f, (float)1.0f, (float)1.0f);
            e3.n();
            GL11.glPopMatrix();
            this.y = -1;
            if (!eC2.ae()) {
                this.A = eC2;
                eC2.c(true);
            }
        }
    }

    @Override
    public void a(kq kq2) {
        if (on.p.t().b((ex)kq2.getEntityPlayer()) && this.w.u().booleanValue()) {
            return;
        }
        if (this.v.u().booleanValue()) {
            if (this.A != null) {
                eC eC2 = kq2.getEntityPlayer();
                eC2.c(false);
                this.A = null;
            }
            return;
        }
        if (kq2.getEntityPlayer().a(A5.cc) && !kq2.getEntityPlayer().a(A5.u)) {
            GL11.glDisable((int)32823);
            GL11.glPolygonOffset((float)1.0f, (float)2500000.0f);
        }
    }
}

