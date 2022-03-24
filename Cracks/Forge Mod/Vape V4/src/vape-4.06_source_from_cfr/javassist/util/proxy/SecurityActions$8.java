/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Field;
import java.security.PrivilegedExceptionAction;
import java.util.Objects;
import javassist.util.proxy.SecurityActions;
import javassist.util.proxy.SecurityActions$TheUnsafe;

class SecurityActions$8
implements PrivilegedExceptionAction<SecurityActions$TheUnsafe> {
    SecurityActions$8() {
    }

    @Override
    public SecurityActions$TheUnsafe run() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
        Class<?> class_ = Class.forName("sun.misc.Unsafe");
        Field field = class_.getDeclaredField("theUnsafe");
        field.setAccessible(true);
        SecurityActions securityActions = SecurityActions.stack;
        Objects.requireNonNull(securityActions);
        SecurityActions$TheUnsafe securityActions$TheUnsafe = new SecurityActions$TheUnsafe(securityActions, class_, field.get(null));
        field.setAccessible(false);
        SecurityActions.disableWarning(securityActions$TheUnsafe);
        return securityActions$TheUnsafe;
    }
}

