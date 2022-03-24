/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.net.URL;
import javassist.util.proxy.DefinePackageHelper;
import javassist.util.proxy.DefinePackageHelper$1;
import javassist.util.proxy.DefinePackageHelper$Helper;
import javassist.util.proxy.SecurityActions;

class DefinePackageHelper$Java7
extends DefinePackageHelper$Helper {
    private final SecurityActions stack = SecurityActions.stack;
    private final MethodHandle definePackage = this.getDefinePackageMethodHandle();

    private DefinePackageHelper$Java7() {
        super(null);
    }

    private MethodHandle getDefinePackageMethodHandle() {
        if (this.stack.getCallerClass() != this.getClass()) {
            throw new IllegalAccessError("Access denied for caller.");
        }
        try {
            return SecurityActions.getMethodHandle(ClassLoader.class, "definePackage", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class});
        }
        catch (NoSuchMethodException noSuchMethodException) {
            throw new RuntimeException("cannot initialize", noSuchMethodException);
        }
    }

    @Override
    Package definePackage(ClassLoader classLoader, String string, String string2, String string3, String string4, String string5, String string6, String string7, URL uRL) throws IllegalArgumentException {
        if (this.stack.getCallerClass() != DefinePackageHelper.class) {
            throw new IllegalAccessError("Access denied for caller.");
        }
        try {
            return (Package)this.definePackage.invokeWithArguments(classLoader, string, string2, string3, string4, string5, string6, string7, uRL);
        }
        catch (Throwable throwable) {
            if (throwable instanceof IllegalArgumentException) {
                throw (IllegalArgumentException)throwable;
            }
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            return null;
        }
    }

    DefinePackageHelper$Java7(DefinePackageHelper$1 definePackageHelper$1) {
        this();
    }
}

