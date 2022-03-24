/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.pc;
import manthe.wf;
import manthe.zu;

class As
implements pc {
    final Class b;
    final wf a;

    As(wf wf2, Class class_) {
        this.a = wf2;
        this.b = class_;
    }

    @Override
    public void b() {
        zu.a(this.b);
    }
}

