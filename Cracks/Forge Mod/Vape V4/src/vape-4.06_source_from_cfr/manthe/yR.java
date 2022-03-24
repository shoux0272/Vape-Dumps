/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.DB;
import manthe.on;
import manthe.y5;
import manthe.y8;

public class yR
extends y8 {
    private final DB u = DB.a((Object)this, "Re-enable", false, "Re-enables all previously enabled modules upon pressing bind a second time");
    private final List<y5> w = new ArrayList<y5>();
    private boolean v = false;

    public yR() {
        super("Panic", "Disables all currently enabled modules");
        this.a(this.u);
    }

    @Override
    public void s() {
        this.d(false);
        if (this.u.u().booleanValue()) {
            boolean bl = this.v = !this.v;
            if (!this.v) {
                for (y5 y52 : this.w) {
                    y52.d(true);
                }
                this.w.clear();
                return;
            }
        } else {
            this.v = false;
        }
        for (y5 y53 : on.p.H().e()) {
            if (!y53.N() || y53 == this) continue;
            y53.d(false);
            if (!this.u.u().booleanValue()) continue;
            this.w.add(y53);
        }
    }

    @Override
    public void a(y5 y52) {
        if (y52 != this) {
            this.v = false;
            this.w.clear();
        }
    }
}

