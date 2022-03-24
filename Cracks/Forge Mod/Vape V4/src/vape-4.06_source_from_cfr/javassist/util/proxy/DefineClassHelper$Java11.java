/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.security.ProtectionDomain;
import javassist.CannotCompileException;
import javassist.util.proxy.DefineClassHelper;
import javassist.util.proxy.DefineClassHelper$1;
import javassist.util.proxy.DefineClassHelper$JavaOther;

class DefineClassHelper$Java11
extends DefineClassHelper$JavaOther {
    private DefineClassHelper$Java11() {
        super(null);
    }

    @Override
    Class<?> defineClass(String string, byte[] arrby, int n6, int n10, Class<?> class_, ClassLoader classLoader, ProtectionDomain protectionDomain) throws ClassFormatError, CannotCompileException {
        if (class_ != null) {
            return DefineClassHelper.toClass(class_, arrby);
        }
        return super.defineClass(string, arrby, n6, n10, class_, classLoader, protectionDomain);
    }

    DefineClassHelper$Java11(DefineClassHelper$1 defineClassHelper$1) {
        this();
    }
}

