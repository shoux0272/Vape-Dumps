/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.security.ProtectionDomain;
import javassist.util.proxy.DefineClassHelper$Java9;
import javassist.util.proxy.SecurityActions$TheUnsafe;

final class DefineClassHelper$Java9$ReferencedUnsafe {
    private final SecurityActions$TheUnsafe sunMiscUnsafeTheUnsafe;
    private final MethodHandle defineClass;
    final DefineClassHelper$Java9 this$0;

    DefineClassHelper$Java9$ReferencedUnsafe(DefineClassHelper$Java9 java9, SecurityActions$TheUnsafe theUnsafe, MethodHandle methodHandle) {
        this.this$0 = java9;
        this.sunMiscUnsafeTheUnsafe = theUnsafe;
        this.defineClass = methodHandle;
    }

    Class<?> defineClass(String string, byte[] arrby, int n6, int n10, ClassLoader classLoader, ProtectionDomain protectionDomain) throws ClassFormatError {
        try {
            if (DefineClassHelper$Java9.a(this.this$0).invoke(DefineClassHelper$Java9.b(this.this$0), new Object[0]) != DefineClassHelper$Java9.class) {
                throw new IllegalAccessError("Access denied for caller.");
            }
        }
        catch (Exception exception) {
            throw new RuntimeException("cannot initialize", exception);
        }
        try {
            return (Class)this.defineClass.invokeWithArguments(this.sunMiscUnsafeTheUnsafe.theUnsafe, string, arrby, n6, n10, classLoader, protectionDomain);
        }
        catch (Throwable throwable) {
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            if (throwable instanceof ClassFormatError) {
                throw (ClassFormatError)throwable;
            }
            throw new ClassFormatError(throwable.getMessage());
        }
    }
}

