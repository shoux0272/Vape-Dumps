/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AO;

public class AZ
extends AO {
    @Override
    public long c() {
        return System.nanoTime() - this.c;
    }

    @Override
    public boolean a(long l) {
        return this.c() >= l;
    }

    @Override
    public void d() {
        this.c = System.nanoTime();
    }
}

