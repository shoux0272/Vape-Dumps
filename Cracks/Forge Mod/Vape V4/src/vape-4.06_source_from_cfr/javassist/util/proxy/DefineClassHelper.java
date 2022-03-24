/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.invoke.MethodHandles;
import java.security.ProtectionDomain;
import javassist.CannotCompileException;
import javassist.bytecode.ClassFile;
import javassist.util.proxy.DefineClassHelper$Helper;
import javassist.util.proxy.DefineClassHelper$Java11;
import javassist.util.proxy.DefineClassHelper$Java7;
import javassist.util.proxy.DefineClassHelper$Java9;
import javassist.util.proxy.DefineClassHelper$JavaOther;

public class DefineClassHelper {
    private static final DefineClassHelper$Helper privileged = ClassFile.MAJOR_VERSION > 54 ? new DefineClassHelper$Java11(null) : (ClassFile.MAJOR_VERSION >= 53 ? new DefineClassHelper$Java9() : (ClassFile.MAJOR_VERSION >= 51 ? new DefineClassHelper$Java7(null) : new DefineClassHelper$JavaOther(null)));

    public static Class<?> toClass(String string, Class<?> class_, ClassLoader classLoader, ProtectionDomain protectionDomain, byte[] arrby) throws CannotCompileException {
        try {
            return privileged.defineClass(string, arrby, 0, arrby.length, class_, classLoader, protectionDomain);
        }
        catch (RuntimeException runtimeException) {
            throw runtimeException;
        }
        catch (CannotCompileException cannotCompileException) {
            throw cannotCompileException;
        }
        catch (ClassFormatError classFormatError) {
            Throwable throwable = classFormatError.getCause();
            throw new CannotCompileException(throwable == null ? classFormatError : throwable);
        }
        catch (Exception exception) {
            throw new CannotCompileException(exception);
        }
    }

    public static Class<?> toClass(Class<?> class_, byte[] arrby) throws CannotCompileException {
        try {
            DefineClassHelper.class.getModule().addReads(class_.getModule());
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            MethodHandles.Lookup lookup2 = MethodHandles.privateLookupIn(class_, lookup);
            return lookup2.defineClass(arrby);
        }
        catch (IllegalAccessException | IllegalArgumentException exception) {
            throw new CannotCompileException(exception.getMessage() + ": " + class_.getName() + " has no permission to define the class");
        }
    }

    public static Class<?> toClass(MethodHandles.Lookup lookup, byte[] arrby) throws CannotCompileException {
        try {
            return lookup.defineClass(arrby);
        }
        catch (IllegalAccessException | IllegalArgumentException exception) {
            throw new CannotCompileException(exception.getMessage());
        }
    }

    static Class<?> toPublicClass(String string, byte[] arrby) throws CannotCompileException {
        try {
            MethodHandles.Lookup lookup = MethodHandles.lookup();
            lookup = lookup.dropLookupMode(2);
            return lookup.defineClass(arrby);
        }
        catch (Throwable throwable) {
            throw new CannotCompileException(throwable);
        }
    }

    private DefineClassHelper() {
    }

    static DefineClassHelper$Helper access$400() {
        return privileged;
    }
}

