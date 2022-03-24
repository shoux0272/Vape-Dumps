/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;
import javassist.util.proxy.DefinePackageHelper;
import javassist.util.proxy.DefinePackageHelper$1;
import javassist.util.proxy.DefinePackageHelper$Helper;
import javassist.util.proxy.SecurityActions;

class DefinePackageHelper$JavaOther
extends DefinePackageHelper$Helper {
    private final SecurityActions stack = SecurityActions.stack;
    private final Method definePackage = this.getDefinePackageMethod();

    private DefinePackageHelper$JavaOther() {
        super(null);
    }

    private Method getDefinePackageMethod() {
        if (this.stack.getCallerClass() != this.getClass()) {
            throw new IllegalAccessError("Access denied for caller.");
        }
        try {
            return SecurityActions.getDeclaredMethod(ClassLoader.class, "definePackage", new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, String.class, URL.class});
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
            this.definePackage.setAccessible(true);
            return (Package)this.definePackage.invoke(classLoader, string, string2, string3, string4, string5, string6, string7, uRL);
        }
        catch (Throwable throwable) {
            Throwable throwable2;
            if (throwable instanceof InvocationTargetException && (throwable2 = ((InvocationTargetException)throwable).getTargetException()) instanceof IllegalArgumentException) {
                throw (IllegalArgumentException)throwable2;
            }
            if (throwable instanceof RuntimeException) {
                throw (RuntimeException)throwable;
            }
            return null;
        }
    }

    DefinePackageHelper$JavaOther(DefinePackageHelper$1 definePackageHelper$1) {
        this();
    }
}

