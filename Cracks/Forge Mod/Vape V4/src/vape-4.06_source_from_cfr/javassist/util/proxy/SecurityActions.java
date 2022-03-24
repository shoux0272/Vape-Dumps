/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import javassist.bytecode.ClassFile;
import javassist.util.proxy.SecurityActions$1;
import javassist.util.proxy.SecurityActions$2;
import javassist.util.proxy.SecurityActions$3;
import javassist.util.proxy.SecurityActions$4;
import javassist.util.proxy.SecurityActions$5;
import javassist.util.proxy.SecurityActions$6;
import javassist.util.proxy.SecurityActions$7;
import javassist.util.proxy.SecurityActions$8;
import javassist.util.proxy.SecurityActions$TheUnsafe;

class SecurityActions
extends SecurityManager {
    public static final SecurityActions stack = new SecurityActions();

    SecurityActions() {
    }

    public Class<?> getCallerClass() {
        return this.getClassContext()[2];
    }

    static Method[] getDeclaredMethods(Class<?> class_) {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredMethods();
        }
        return AccessController.doPrivileged(new SecurityActions$1(class_));
    }

    static Constructor<?>[] getDeclaredConstructors(Class<?> class_) {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredConstructors();
        }
        return AccessController.doPrivileged(new SecurityActions$2(class_));
    }

    static MethodHandle getMethodHandle(Class<?> class_, String string, Class<?>[] arrclass) throws NoSuchMethodException {
        try {
            return AccessController.doPrivileged(new SecurityActions$3(class_, string, arrclass));
        }
        catch (PrivilegedActionException privilegedActionException) {
            if (privilegedActionException.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)privilegedActionException.getCause();
            }
            throw new RuntimeException(privilegedActionException.getCause());
        }
    }

    static Method getDeclaredMethod(Class<?> class_, String string, Class<?>[] arrclass) throws NoSuchMethodException {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredMethod(string, arrclass);
        }
        try {
            return AccessController.doPrivileged(new SecurityActions$4(class_, string, arrclass));
        }
        catch (PrivilegedActionException privilegedActionException) {
            if (privilegedActionException.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)privilegedActionException.getCause();
            }
            throw new RuntimeException(privilegedActionException.getCause());
        }
    }

    static Constructor<?> getDeclaredConstructor(Class<?> class_, Class<?>[] arrclass) throws NoSuchMethodException {
        if (System.getSecurityManager() == null) {
            return class_.getDeclaredConstructor(arrclass);
        }
        try {
            return (Constructor)AccessController.doPrivileged(new SecurityActions$5(class_, arrclass));
        }
        catch (PrivilegedActionException privilegedActionException) {
            if (privilegedActionException.getCause() instanceof NoSuchMethodException) {
                throw (NoSuchMethodException)privilegedActionException.getCause();
            }
            throw new RuntimeException(privilegedActionException.getCause());
        }
    }

    static void setAccessible(AccessibleObject accessibleObject, boolean bl) {
        if (System.getSecurityManager() == null) {
            accessibleObject.setAccessible(bl);
        } else {
            AccessController.doPrivileged(new SecurityActions$6(accessibleObject, bl));
        }
    }

    static void set(Field field, Object object, Object object2) throws IllegalAccessException {
        if (System.getSecurityManager() == null) {
            field.set(object, object2);
        } else {
            try {
                AccessController.doPrivileged(new SecurityActions$7(field, object, object2));
            }
            catch (PrivilegedActionException privilegedActionException) {
                if (privilegedActionException.getCause() instanceof NoSuchMethodException) {
                    throw (IllegalAccessException)privilegedActionException.getCause();
                }
                throw new RuntimeException(privilegedActionException.getCause());
            }
        }
    }

    static SecurityActions$TheUnsafe getSunMiscUnsafeAnonymously() throws ClassNotFoundException {
        try {
            return AccessController.doPrivileged(new SecurityActions$8());
        }
        catch (PrivilegedActionException privilegedActionException) {
            if (privilegedActionException.getCause() instanceof ClassNotFoundException) {
                throw (ClassNotFoundException)privilegedActionException.getCause();
            }
            if (privilegedActionException.getCause() instanceof NoSuchFieldException) {
                throw new ClassNotFoundException("No such instance.", privilegedActionException.getCause());
            }
            if (privilegedActionException.getCause() instanceof IllegalAccessException || privilegedActionException.getCause() instanceof IllegalAccessException || privilegedActionException.getCause() instanceof SecurityException) {
                throw new ClassNotFoundException("Security denied access.", privilegedActionException.getCause());
            }
            throw new RuntimeException(privilegedActionException.getCause());
        }
    }

    static void disableWarning(SecurityActions$TheUnsafe securityActions$TheUnsafe) {
        try {
            if (ClassFile.MAJOR_VERSION < 53) {
                return;
            }
            Class<?> class_ = Class.forName("jdk.internal.module.IllegalAccessLogger");
            Field field = class_.getDeclaredField("logger");
            securityActions$TheUnsafe.call("putObjectVolatile", class_, securityActions$TheUnsafe.call("staticFieldOffset", field), null);
        }
        catch (Exception exception) {
            // empty catch block
        }
    }
}

