/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

class SecurityActions$4
implements PrivilegedExceptionAction<Method> {
    final Class val$clazz;
    final String val$name;
    final Class[] val$types;

    SecurityActions$4(Class class_, String string, Class[] arrclass) {
        this.val$clazz = class_;
        this.val$name = string;
        this.val$types = arrclass;
    }

    @Override
    public Method run() throws Exception {
        return this.val$clazz.getDeclaredMethod(this.val$name, this.val$types);
    }
}

