/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Am;
import manthe.DD;
import manthe.Dp;
import manthe.mD;
import manthe.oK;
import manthe.rb;
import manthe.w3;
import manthe.w8;
import manthe.wM;
import manthe.xG;
import manthe.xM;
import manthe.xN;
import manthe.y_;

public class ws
extends w8<w3> {
    public ws(w3 w32) {
        super(w32);
        this.a(new xM(this, w32.S() ? "blockedicon" : "allowedicon", w32.R()).a(new y_(this, w32)));
        this.ak();
    }

    public void ak() {
        block3: {
            block2: {
                this.J();
                this.a(new wM[]{new xG(this, "Add entry...")});
                if (!(((w3)this.m()).Q() instanceof Dp)) break block2;
                for (rb rb2 : ((Dp)((w3)this.m()).Q()).t()) {
                    this.a((wM)new xN(((w3)this.m()).S() ? ws.b.j : ws.b.i, rb2.V()).a(new Am(this, rb2)).a(rb2), new Object[0]);
                }
                break block3;
            }
            if (!(((w3)this.m()).Q() instanceof DD)) break block3;
            for (mD mD2 : ((DD)((w3)this.m()).Q()).s()) {
                String string = mD2.d() + (mD2.b() < 0 ? "" : ":" + mD2.b());
                this.a((wM)new xN(((w3)this.m()).S() ? ws.b.j : ws.b.i, string).a(new oK(this, mD2)).a(mD2), new Object[0]);
            }
        }
    }
}

