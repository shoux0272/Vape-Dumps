/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Method;
import java.security.ProtectionDomain;
import javassist.CannotCompileException;
import javassist.util.proxy.DefineClassHelper;
import javassist.util.proxy.DefineClassHelper$1;
import javassist.util.proxy.DefineClassHelper$Helper;
import javassist.util.proxy.SecurityActions;

class DefineClassHelper$JavaOther
extends DefineClassHelper$Helper {
    private final Method defineClass = this.getDefineClassMethod();
    private final SecurityActions stack = SecurityActions.stack;

    private DefineClassHelper$JavaOther() {
        super(null);
    }

    private final Method getDefineClassMethod() {
        if (DefineClassHelper.access$400() != null && this.stack.getCallerClass() != this.getClass()) {
            throw new IllegalAccessError("Access denied for caller.");
        }
        try {
            return SecurityActions.getDeclaredMethod(ClassLoader.class, "defineClass", new Class[]{String.class, byte[].class, Integer.TYPE, Integer.TYPE, ProtectionDomain.class});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("cannot initialize", noSuchMethodException);
        }
    }

    @Override
    Class<?> defineClass(String string, byte[] arrby, int n6, int n10, Class<?> class_, ClassLoader classLoader, ProtectionDomain protectionDomain) throws ClassFormatError, CannotCompileException {
        Class<?> class_2 = this.stack.getCallerClass();
        if (class_2 != DefineClassHelper.class && class_2 != this.getClass()) {
            throw new IllegalAccessError("Access denied for caller.");
        }
        try {
            SecurityActions.setAccessible(this.defineClass, true);
            return (Class)this.defineClass.invoke(classLoader, string, arrby, n6, n10, protectionDomain);
        }
        catch (Throwable throwable) {
            if (throwable instanceof ClassFormatError) {
                throw (ClassFormatError)throwable;
            }
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            throw new CannotCompileException(throwable);
        }
    }

    DefineClassHelper$JavaOther(DefineClassHelper$1 defineClassHelper$1) {
        this();
    }
}

