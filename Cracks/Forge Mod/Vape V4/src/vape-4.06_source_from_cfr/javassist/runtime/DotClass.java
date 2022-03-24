/*
 * Decompiled with CFR 0.150.
 */
package javassist.runtime;

public class DotClass {
    public static NoClassDefFoundError fail(ClassNotFoundException classNotFoundException) {
        return new NoClassDefFoundError(classNotFoundException.getMessage());
    }
}

