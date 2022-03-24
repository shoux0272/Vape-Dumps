/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
package manthe;

import java.awt.Color;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.CopyOnWriteArrayList;
import manthe.A5;
import manthe.CQ;
import manthe.Ck;
import manthe.DB;
import manthe.DF;
import manthe.DX;
import manthe.Ds;
import manthe.ac;
import manthe.cB;
import manthe.dX;
import manthe.ds;
import manthe.e2;
import manthe.eJ;
import manthe.ef;
import manthe.fS;
import manthe.fn;
import manthe.kF;
import manthe.kO;
import manthe.kx;
import manthe.ky;
import manthe.oC;
import manthe.on;
import manthe.pb;
import manthe.y5;
import org.lwjgl.opengl.GL11;

public class yv
extends y5 {
    private final List<oC> E = new CopyOnWriteArrayList<oC>();
    private final pb z = new pb("Outgoing only");
    private final pb C = new pb("Bi-directional");
    private final DX A = DX.a((Object)this, "Direction", "Outgoing only - only chokes packets that you're sending\nBi-directional - additionally chokes incoming packets from the server", this.z, this.z, this.C);
    private final pb G = new pb("All");
    private final pb L = new pb("Movement only");
    private final DX K = DX.a((Object)this, "Type", "All - chokes all packets of all types\nMovement only - Only chokes movement related packets", this.G, this.G, this.L);
    private final DB H = DB.a((Object)this, "Breadcrumbs", false, "Drops breadcrumbs in case you forgot where you came from.");
    private final DB y = DB.a((Object)this, "Spawn Fake", false, "Spawns a fake player where you started/are on the servers side.");
    private final DB x = DB.a((Object)this, "Auto send", false, "Automatically sends packets after a limit is reached");
    private final DF J = DF.a(this, "Send threshold", "#", "", 0.0, 50.0, 100.0, 1.0, "Allows you to choke your packets for a custom set limit.\nAfter the limit is reached, all packets will be sent.\nNOTE: 0 = No Limit");
    public ef w;
    private int I;
    private e2 v;
    private final Queue<Ck> F = new ArrayDeque<Ck>();
    private boolean D = false;
    private boolean u = false;
    private boolean B = false;

    public yv() {
        super("Blink", 8919359, CQ.f, "Chokes packets until disabled.");
        this.w = ds.r();
        this.x.a(new Ds[]{this.J});
        this.a(this.A, this.K, this.H, this.y, this.x, this.J);
    }

    @Override
    public boolean n() {
        return true;
    }

    @Override
    public void a(kO kO2) {
        dX dX2 = kO2.getGuiScreen();
        if (dX2.a(A5.O) || dX2.a(A5.cn) || dX2.a(A5.B)) {
            this.U();
            super.d(false);
        }
    }

    @Override
    public void a(kx kx2) {
        if (!this.H.u().booleanValue() || this.E.isEmpty()) {
            return;
        }
        ds.M().a(1.0);
        GL11.glPushMatrix();
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)771);
        GL11.glLineWidth((float)1.5f);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        GL11.glDisable((int)2929);
        GL11.glDepthMask((boolean)false);
        double d10 = this.w.m();
        double d11 = this.w.n();
        double d12 = this.w.j();
        boolean bl = true;
        for (oC oC2 : this.E) {
            Color color = Color.RED;
            if (bl) {
                color = Color.YELLOW;
                bl = false;
            }
            ac.a(oC2.b - 0.1, oC2.a, oC2.d - 0.1, 0.2, 0.0, 0.2, 1.0, Color.BLACK, color, d10, d11, d12);
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
    public void a(ky ky2) {
        try {
            if (this.u) {
                return;
            }
            fn fn2 = ky2.getPacket();
            if (this.a(fn2)) {
                return;
            }
            if (fn2.a(A5.bN)) {
                if (this.T() && this.I % 5 == 0) {
                    eJ eJ2 = ds.k();
                    boolean bl = this.I % 2 == 0;
                    double d10 = 0.2 * (double)(bl ? -1 : 1) * Math.cos(Math.toRadians(eJ2.U()));
                    double d11 = 0.2 * (double)(bl ? -1 : 1) * Math.sin(Math.toRadians(eJ2.U()));
                    this.E.add(new oC(eJ2.z() + d10, eJ2.l(), eJ2.g() + d11));
                }
            } else if (this.K.v().equals(this.L)) {
                return;
            }
            ++this.I;
            this.a(String.valueOf(this.I));
            if (this.x.u().booleanValue() && this.J.a() > 0.0 && (double)this.I >= this.J.a()) {
                this.D = true;
                this.V();
                this.I = 0;
                this.E.clear();
            }
            this.F.add(new Ck(fn2, true, ky2.getNetworkManager(), null));
            ky2.a(true);
            this.S();
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    @Override
    public void a(kF kF2) {
        try {
            fn fn2 = kF2.getPacket();
            if (fn2.a(A5.U)) {
                this.d(false);
            }
            if (this.A.v().equals(this.z)) {
                return;
            }
            if (this.u) {
                return;
            }
            ++this.I;
            this.a(String.valueOf(this.I));
            if (this.x.u().booleanValue() && this.J.a() > 0.0 && (double)this.I >= this.J.a()) {
                this.D = true;
                this.V();
                this.I = 0;
                this.E.clear();
            }
            this.F.add(new Ck(fn2, false, kF2.getNetworkManager(), null));
            kF2.a(true);
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }

    private void S() {
        if (this.D) {
            this.u = true;
            fS fS2 = ds.k().bp();
            while (!this.F.isEmpty()) {
                Ck ck = this.F.poll();
                ck.a(fS2);
            }
            this.u = false;
            this.D = false;
            if (this.B) {
                super.d(false);
                this.B = false;
            }
        }
    }

    @Override
    public void d(boolean bl) {
        if (bl) {
            super.d(true);
            return;
        }
        this.D = true;
        this.B = true;
    }

    private boolean T() {
        eJ eJ2 = ds.k();
        return eJ2.k() != 0.0 || eJ2.u() != 0.0;
    }

    private void V() {
        eJ eJ2 = ds.k();
        if (eJ2.d() || this.v.d() || !this.y.u().booleanValue()) {
            return;
        }
        this.v.a(eJ2.z(), cB.h ? eJ2.l() : eJ2.l() - 1.5, eJ2.g(), eJ2.U(), eJ2.K());
        this.v.r(eJ2.aP());
    }

    @Override
    public void s() {
        this.U();
        eJ eJ2 = ds.k();
        if (this.y.u().booleanValue()) {
            this.v = e2.b(ds.t(), ds.k().aV());
            this.v.a(eJ2, true);
            this.V();
            this.v.r(eJ2.aP());
            ds.t().a(-420, this.v);
        }
    }

    @Override
    public void J() {
        if (ds.k().e() || ds.t().e()) {
            this.E.clear();
            this.v = null;
            this.I = 0;
        }
        if (this.v != null && ds.t().a(-420).d()) {
            ds.t().a(this.v);
        }
        this.v = null;
    }

    private void U() {
        this.I = 0;
        this.F.clear();
        this.E.clear();
    }

    private boolean a(fn fn2) {
        return fn2.a().getClass().toString().contains("play.server") || fn2.a().toString().contains("SPacket");
    }
}

