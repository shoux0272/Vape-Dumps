/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Constructor;
import java.security.PrivilegedAction;

class SecurityActions$2
implements PrivilegedAction<Constructor<?>[]> {
    final Class val$clazz;

    SecurityActions$2(Class class_) {
        this.val$clazz = class_;
    }

    @Override
    public Constructor<?>[] run() {
        return this.val$clazz.getDeclaredConstructors();
    }
}

