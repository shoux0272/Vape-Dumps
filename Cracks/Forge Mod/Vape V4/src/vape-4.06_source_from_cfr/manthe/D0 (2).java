/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.Ds;
import manthe.p1;

public class D0
extends Ds<String, p1> {
    private String l;

    public D0(Object object, String string) {
        super(object, string, null);
    }

    public String a() {
        return this.l;
    }

    @Override
    public void b(String string) {
        this.l = string;
    }

    @Override
    public void a(String string) {
        this.l = string;
    }
}

