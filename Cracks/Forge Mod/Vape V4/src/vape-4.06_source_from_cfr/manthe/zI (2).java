/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.input.Keyboard
 */
package manthe;

import a.d;
import java.awt.Color;
import manthe.A5;
import manthe.CQ;
import manthe.DB;
import manthe.Y;
import manthe.ds;
import manthe.eJ;
import manthe.ei;
import manthe.en;
import manthe.km;
import manthe.kn;
import manthe.on;
import manthe.y5;
import manthe.zu;
import org.lwjgl.input.Keyboard;

public class zI
extends y5 {
    private final DB x = DB.a((Object)this, "Inventory Only", false, "Only moves you when in inventory/pause screen.\nIgnores any chests/containers.");
    private final DB w = DB.a((Object)this, "Sneak", false, "Takes sneaking input");
    private final DB u = DB.a((Object)this, "Rotate", false, "Rotates your head with the arrow keys.");
    private boolean v;

    public zI() {
        super("InvWalk", new Color(193, 113, 0).getRGB(), CQ.f, "Walk and look around in UI's\nUse arrow keys to look around\nDoes not bypass some anti-cheats!");
        this.u.d(true);
        this.a(this.x);
        this.a(this.w);
        this.a(this.u);
    }

    @Override
    public boolean n() {
        return false;
    }

    private boolean S() {
        return ds.x().d() && (!Keyboard.areRepeatEventsEnabled() && (this.x.u() == false || !ds.x().a(A5.bt) || ds.x().a(A5.ag)) || ds.x().a().equals(d.getGuiObject())) && !on.p.H().b(zu.class).ah();
    }

    @Override
    public void J() {
        if (ds.x().d()) {
            en en2 = ds.s();
            this.a(en2.j(), false);
            this.a(en2.A(), false);
            this.a(en2.g(), false);
            this.a(en2.n(), false);
            this.a(en2.l(), false);
            this.a(en2.u(), false);
        } else {
            this.T();
        }
    }

    @Override
    public void a(km km2) {
        if (km2.c() && this.u.u().booleanValue()) {
            eJ eJ2 = ds.k();
            if (this.S()) {
                if (Keyboard.isKeyDown((int)200) && eJ2.K() - 3.0f > -90.0f) {
                    eJ2.d(Y.a(eJ2.K() - 3.0f, -89.5f, 89.5f));
                }
                if (Keyboard.isKeyDown((int)208) && eJ2.K() + 3.0f < 90.0f) {
                    eJ2.d(Y.a(eJ2.K() + 3.0f, -89.5f, 89.5f));
                }
                if (Keyboard.isKeyDown((int)203)) {
                    eJ2.i(eJ2.U() - 5.0f);
                }
                if (Keyboard.isKeyDown((int)205)) {
                    eJ2.i(eJ2.U() + 5.0f);
                }
            }
        }
    }

    private void a(ei ei2, boolean bl) {
        ei.a(ei2.i(), bl);
        ei.a(ei2.i());
    }

    private void a(ei ei2) {
        if (Keyboard.isKeyDown((int)ei2.i())) {
            this.a(ei2, true);
        } else if (ei2.h()) {
            this.a(ei2, false);
        }
    }

    private void T() {
        en en2 = ds.s();
        this.a(en2.j());
        this.a(en2.A());
        this.a(en2.g());
        this.a(en2.n());
        this.a(en2.l());
        this.a(en2.u());
    }

    @Override
    public void a(kn kn2) {
        if (kn2.getEntity().a(A5.u)) {
            if (this.S()) {
                this.v = true;
                en en2 = ds.s();
                this.a(en2.j());
                this.a(en2.A());
                this.a(en2.g());
                this.a(en2.n());
                this.a(en2.l());
                if (this.w.u().booleanValue()) {
                    this.a(en2.u());
                }
            } else {
                if (this.v) {
                    this.T();
                }
                this.v = false;
            }
        }
    }
}

