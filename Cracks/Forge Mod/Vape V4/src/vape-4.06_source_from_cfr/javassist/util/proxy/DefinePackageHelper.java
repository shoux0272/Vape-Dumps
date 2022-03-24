/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import javassist.CannotCompileException;
import javassist.bytecode.ClassFile;
import javassist.util.proxy.DefinePackageHelper$Helper;
import javassist.util.proxy.DefinePackageHelper$Java7;
import javassist.util.proxy.DefinePackageHelper$Java9;
import javassist.util.proxy.DefinePackageHelper$JavaOther;

public class DefinePackageHelper {
    private static final DefinePackageHelper$Helper privileged = ClassFile.MAJOR_VERSION >= 53 ? new DefinePackageHelper$Java9(null) : (ClassFile.MAJOR_VERSION >= 51 ? new DefinePackageHelper$Java7(null) : new DefinePackageHelper$JavaOther(null));

    public static void definePackage(String string, ClassLoader classLoader) throws CannotCompileException {
        try {
            privileged.definePackage(classLoader, string, null, null, null, null, null, null, null);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            return;
        }
        catch (Exception exception) {
            throw new CannotCompileException(exception);
        }
    }

    private DefinePackageHelper() {
    }
}

