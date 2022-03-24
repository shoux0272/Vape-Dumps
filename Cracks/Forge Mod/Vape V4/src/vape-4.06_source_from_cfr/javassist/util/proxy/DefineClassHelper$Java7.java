/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.security.ProtectionDomain;
import javassist.util.proxy.DefineClassHelper;
import javassist.util.proxy.DefineClassHelper$1;
import javassist.util.proxy.DefineClassHelper$Helper;
import javassist.util.proxy.SecurityActions;

class DefineClassHelper$Java7
extends DefineClassHelper$Helper {
    private final SecurityActions stack = SecurityActions.stack;
    private final MethodHandle defineClass = this.getDefineClassMethodHandle();

    private DefineClassHelper$Java7() {
        super(null);
    }

    private final MethodHandle getDefineClassMethodHandle() {
        if (DefineClassHelper.access$400() != null && this.stack.getCallerClass() != this.getClass()) {
            throw new IllegalAccessError("Access denied for caller.");
        }
        try {
            return SecurityActions.getMethodHandle(ClassLoader.class, "defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("cannot initialize", noSuchMethodException);
        }
    }

    @Override
    Class<?> defineClass(String string, byte[] arrby, int n6, int n10, Class<?> class_, ClassLoader classLoader, ProtectionDomain protectionDomain) throws ClassFormatError {
        if (this.stack.getCallerClass() != DefineClassHelper.class) {
            throw new IllegalAccessError("Access denied for caller.");
        }
        try {
            return (Class)this.defineClass.invokeWithArguments(classLoader, string, arrby, n6, n10, protectionDomain);
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

    DefineClassHelper$Java7(DefineClassHelper$1 defineClassHelper$1) {
        this();
    }
}

