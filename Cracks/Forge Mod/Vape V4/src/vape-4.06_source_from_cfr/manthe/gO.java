/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Set;
import manthe.ex;
import manthe.gS;

public class gO
extends gS {
    public gO(Object object) {
        super(object);
    }

    public Set l() {
        return gO.a.M().d.a(this.b);
    }

    @Override
    public ex a(int n6) {
        return new ex(gO.a.M().d.a(this.b, n6));
    }

    public void a(int n6, ex ex2) {
        gO.a.M().d.a(this.b, n6, ex2);
    }
}

