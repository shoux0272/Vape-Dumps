/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Constructor;
import java.security.PrivilegedExceptionAction;

class SecurityActions$5
implements PrivilegedExceptionAction<Constructor<?>> {
    final Class val$clazz;
    final Class[] val$types;

    SecurityActions$5(Class class_, Class[] arrclass) {
        this.val$clazz = class_;
        this.val$types = arrclass;
    }

    @Override
    public Constructor<?> run() throws Exception {
        return this.val$clazz.getDeclaredConstructor(this.val$types);
    }
}

