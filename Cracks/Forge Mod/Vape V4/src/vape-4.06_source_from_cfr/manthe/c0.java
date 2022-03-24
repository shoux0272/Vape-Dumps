/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.UUID;
import manthe.cy;
import manthe.gr;

public class c0
extends cy {
    public c0(Object object) {
        super(object);
    }

    public static c0 a(UUID uUID, String string) {
        return new c0(gr.a(c0.a.M().cw, uUID, string));
    }

    public UUID g() {
        return gr.a(c0.a.M().cw, this.b);
    }

    public String f() {
        return gr.b(c0.a.M().cw, this.b);
    }
}

