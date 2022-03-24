/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import java.util.List;
import javassist.util.proxy.DefineClassHelper;
import javassist.util.proxy.DefineClassHelper$Helper;
import javassist.util.proxy.DefineClassHelper$Java9$ReferencedUnsafe;
import javassist.util.proxy.SecurityActions;
import javassist.util.proxy.SecurityActions$TheUnsafe;

class DefineClassHelper$Java9
extends DefineClassHelper$Helper {
    private final Object a;
    private final Method c;
    private final DefineClassHelper$Java9$ReferencedUnsafe b = this.a();

    DefineClassHelper$Java9() {
        super(null);
        Class<?> class_ = null;
        try {
            class_ = Class.forName("java.lang.StackWalker");
        }
        catch (ClassNotFoundException classNotFoundException) {
            // empty catch block
        }
        if (class_ != null) {
            try {
                Class<?> class_2 = Class.forName("java.lang.StackWalker$Option");
                this.a = class_.getMethod("getInstance", class_2).invoke(null, class_2.getEnumConstants()[0]);
                this.c = class_.getMethod("getCallerClass", new Class[0]);
            }
            catch (Throwable throwable) {
                throw new RuntimeException("cannot initialize", throwable);
            }
        } else {
            this.a = null;
            this.c = null;
        }
    }

    private final DefineClassHelper$Java9$ReferencedUnsafe a() {
        try {
            if (DefineClassHelper.access$400() != null && this.c.invoke(this.a, new Object[0]) != this.getClass()) {
                throw new IllegalAccessError("Access denied for caller.");
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("cannot initialize", exception);
        }
        try {
            SecurityActions$TheUnsafe securityActions$TheUnsafe = SecurityActions.getSunMiscUnsafeAnonymously();
            List<Method> list = securityActions$TheUnsafe.methods.get("defineClass");
            if (null == list) {
                return null;
            }
            MethodHandle methodHandle = MethodHandles.lookup().unreflect(list.get(0));
            return new DefineClassHelper$Java9$ReferencedUnsafe(this, securityActions$TheUnsafe, methodHandle);
        }
        catch (Throwable throwable) {
            throw new RuntimeException("cannot initialize", throwable);
        }
    }

    @Override
    Class<?> defineClass(String string, byte[] arrby, int n6, int n10, Class<?> class_, ClassLoader classLoader, ProtectionDomain protectionDomain) throws ClassFormatError {
        try {
            if (this.c.invoke(this.a, new Object[0]) != DefineClassHelper.class) {
                throw new IllegalAccessError("Access denied for caller.");
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("cannot initialize", exception);
        }
        return this.b.defineClass(string, arrby, n6, n10, classLoader, protectionDomain);
    }

    static Object b(DefineClassHelper$Java9 defineClassHelper$Java9) {
        return defineClassHelper$Java9.a;
    }

    static Method a(DefineClassHelper$Java9 defineClassHelper$Java9) {
        return defineClassHelper$Java9.c;
    }
}

