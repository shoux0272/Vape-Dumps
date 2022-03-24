/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.net.URL;
import javassist.util.proxy.DefinePackageHelper$1;
import javassist.util.proxy.DefinePackageHelper$Helper;

class DefinePackageHelper$Java9
extends DefinePackageHelper$Helper {
    private DefinePackageHelper$Java9() {
        super(null);
    }

    @Override
    Package definePackage(ClassLoader classLoader, String string, String string2, String string3, String string4, String string5, String string6, String string7, URL uRL) throws IllegalArgumentException {
        throw new RuntimeException("define package has been disabled for jigsaw");
    }

    DefinePackageHelper$Java9(DefinePackageHelper$1 definePackageHelper$1) {
        this();
    }
}

