/*
 * Decompiled with CFR 0.150.
 */
package javassist.runtime;

public class Cflow$Depth {
    private int depth = 0;

    Cflow$Depth() {
    }

    int value() {
        return this.depth;
    }

    void inc() {
        ++this.depth;
    }

    void dec() {
        --this.depth;
    }
}

