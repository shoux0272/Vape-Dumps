/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.BP;
import manthe.Cw;
import manthe.ds;
import manthe.gw;
import manthe.p2;
import manthe.qA;

public class A9
implements Runnable {
    private final p2 e;
    private final BP d;
    private final boolean a;
    private final Object c;
    private gw b;

    public A9(String string, String string2, boolean bl, Object object) {
        this.e = new qA(string, string2);
        this.d = new BP();
        this.a = bl;
        this.c = object;
    }

    @Override
    public void run() {
        Cw cw = this.d.a("authenticate", this.e, Cw.class);
        if (cw == null) {
            return;
        }
        if (cw.h() != null) {
            return;
        }
        this.b = gw.a(cw.b().a(), cw.b().b(), cw.d(), cw.b().c() ? "legacy" : "mojang");
        if (this.a) {
            ds.a(this.b);
        }
    }

    public gw a() {
        return this.b;
    }
}

