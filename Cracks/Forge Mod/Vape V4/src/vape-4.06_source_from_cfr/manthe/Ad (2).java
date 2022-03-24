/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wT;
import manthe.zu;

public class Ad
implements pc {
    private Class b;
    final wT a;

    public Ad(wT wT2, Class class_) {
        this.a = wT2;
        this.b = class_;
    }

    @Override
    public void b() {
        zu.a(this.b);
    }

    public Class c() {
        return this.b;
    }
}

