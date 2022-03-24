/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.AO;
import manthe.AZ;

class BM {
    private final Class b;
    AO a = new AZ();
    private long c;

    public BM(Class class_) {
        this.b = class_;
    }

    public void e() {
        this.a.d();
    }

    public void b() {
        this.c += this.a.c();
    }

    public long d() {
        return this.c;
    }

    public void a() {
        this.c = 0L;
    }

    public Class c() {
        return this.b;
    }
}

