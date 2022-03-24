/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.AccessibleObject;
import java.security.PrivilegedAction;

class SecurityActions$6
implements PrivilegedAction<Void> {
    final AccessibleObject val$ao;
    final boolean val$accessible;

    SecurityActions$6(AccessibleObject accessibleObject, boolean bl) {
        this.val$ao = accessibleObject;
        this.val$accessible = bl;
    }

    @Override
    public Void run() {
        this.val$ao.setAccessible(this.val$accessible);
        return null;
    }
}

