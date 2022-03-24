/*
 * Decompiled with CFR 0.150.
 */
package javassist.runtime;

import javassist.runtime.Cflow$Depth;

public class Cflow
extends ThreadLocal<Cflow$Depth> {
    @Override
    protected synchronized Cflow$Depth initialValue() {
        return new Cflow$Depth();
    }

    public void enter() {
        ((Cflow$Depth)this.get()).inc();
    }

    public void exit() {
        ((Cflow$Depth)this.get()).dec();
    }

    public int value() {
        return ((Cflow$Depth)this.get()).value();
    }
}

