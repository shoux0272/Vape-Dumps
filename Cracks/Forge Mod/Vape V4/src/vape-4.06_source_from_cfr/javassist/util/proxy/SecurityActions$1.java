/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Method;
import java.security.PrivilegedAction;

class SecurityActions$1
implements PrivilegedAction<Method[]> {
    final Class val$clazz;

    SecurityActions$1(Class class_) {
        this.val$clazz = class_;
    }

    @Override
    public Method[] run() {
        return this.val$clazz.getDeclaredMethods();
    }
}

