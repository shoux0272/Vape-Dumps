/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.security.PrivilegedExceptionAction;

class SecurityActions$3
implements PrivilegedExceptionAction<MethodHandle> {
    final Class val$clazz;
    final String val$name;
    final Class[] val$params;

    SecurityActions$3(Class class_, String string, Class[] arrclass) {
        this.val$clazz = class_;
        this.val$name = string;
        this.val$params = arrclass;
    }

    @Override
    public MethodHandle run() throws IllegalAccessException, NoSuchMethodException, SecurityException {
        Method method = this.val$clazz.getDeclaredMethod(this.val$name, this.val$params);
        method.setAccessible(true);
        MethodHandle methodHandle = MethodHandles.lookup().unreflect(method);
        method.setAccessible(false);
        return methodHandle;
    }
}

