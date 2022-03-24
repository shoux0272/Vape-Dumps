/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Set;
import manthe.fl;
import manthe.jg;

public class fK
extends fl {
    public fK(Object object) {
        super(object);
    }

    public short a(String string) {
        return jg.a(fK.a.M().H, this.b, string);
    }

    public Set<String> f() {
        return jg.a(fK.a.M().H, this.b).keySet();
    }

    public fl b(String string) {
        return new fK(jg.b(fK.a.M().H, this.b, string));
    }
}

