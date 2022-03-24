/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.net.URL;
import javassist.util.proxy.DefinePackageHelper$1;

abstract class DefinePackageHelper$Helper {
    private DefinePackageHelper$Helper() {
    }

    abstract Package definePackage(ClassLoader var1, String var2, String var3, String var4, String var5, String var6, String var7, String var8, URL var9) throws IllegalArgumentException;

    DefinePackageHelper$Helper(DefinePackageHelper$1 definePackageHelper$1) {
        this();
    }
}

