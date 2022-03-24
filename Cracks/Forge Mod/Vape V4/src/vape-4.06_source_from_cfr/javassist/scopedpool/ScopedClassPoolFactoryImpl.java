/*
 * Decompiled with CFR 0.150.
 */
package javassist.scopedpool;

import javassist.ClassPool;
import javassist.scopedpool.ScopedClassPool;
import javassist.scopedpool.ScopedClassPoolFactory;
import javassist.scopedpool.ScopedClassPoolRepository;

public class ScopedClassPoolFactoryImpl
implements ScopedClassPoolFactory {
    @Override
    public ScopedClassPool create(ClassLoader classLoader, ClassPool classPool, ScopedClassPoolRepository scopedClassPoolRepository) {
        return new ScopedClassPool(classLoader, classPool, scopedClassPoolRepository, false);
    }

    @Override
    public ScopedClassPool create(ClassPool classPool, ScopedClassPoolRepository scopedClassPoolRepository) {
        return new ScopedClassPool(null, classPool, scopedClassPoolRepository, true);
    }
}

