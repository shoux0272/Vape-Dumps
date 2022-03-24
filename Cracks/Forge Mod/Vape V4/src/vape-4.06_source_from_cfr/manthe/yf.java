/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.D0;
import manthe.D6;
import manthe.DB;
import manthe.DT;
import manthe.vG;

public class yf {
    public DB e = DB.a((Object)this, "Save to Cloud", false, "Logs into an account in offline mode.");
    public D0 d = new DT(this, this, "alteningKey");
    public DB a = DB.a((Object)this, "Auto-load module states", false, "Automatically enable saved module states upon loading profiles.\n(You can save module states by shift+right clicking a profile button)");
    public D0 b = new D6(this, this, "alts");
    public D0 c = new D0(this, "selectedprofile");

    public yf() {
        this.e.a(new vG(this));
    }
}

