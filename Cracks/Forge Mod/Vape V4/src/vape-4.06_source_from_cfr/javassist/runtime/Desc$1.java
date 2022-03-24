/*
 * Decompiled with CFR 0.150.
 */
package javassist.runtime;

class Desc$1
extends ThreadLocal<Boolean> {
    Desc$1() {
    }

    @Override
    protected Boolean initialValue() {
        return false;
    }
}

