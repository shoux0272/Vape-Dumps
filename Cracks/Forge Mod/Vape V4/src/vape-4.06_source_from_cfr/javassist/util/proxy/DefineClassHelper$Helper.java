/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.security.ProtectionDomain;
import javassist.CannotCompileException;
import javassist.util.proxy.DefineClassHelper$1;

abstract class DefineClassHelper$Helper {
    private DefineClassHelper$Helper() {
    }

    abstract Class<?> defineClass(String var1, byte[] var2, int var3, int var4, Class<?> var5, ClassLoader var6, ProtectionDomain var7) throws ClassFormatError, CannotCompileException;

    DefineClassHelper$Helper(DefineClassHelper$1 defineClassHelper$1) {
        this();
    }
}

