/*
 * Decompiled with CFR 0.150.
 */
package javassist.scopedpool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import javassist.ClassPool;
import javassist.LoaderClassPath;
import javassist.scopedpool.ScopedClassPool;
import javassist.scopedpool.ScopedClassPoolFactory;
import javassist.scopedpool.ScopedClassPoolFactoryImpl;
import javassist.scopedpool.ScopedClassPoolRepository;

public class ScopedClassPoolRepositoryImpl
implements ScopedClassPoolRepository {
    private static final ScopedClassPoolRepositoryImpl instance = new ScopedClassPoolRepositoryImpl();
    private boolean prune = true;
    boolean pruneWhenCached;
    protected Map<ClassLoader, ScopedClassPool> registeredCLs = Collections.synchronizedMap(new WeakHashMap());
    protected ClassPool classpool;
    protected ScopedClassPoolFactory factory = new ScopedClassPoolFactoryImpl();

    public static ScopedClassPoolRepository getInstance() {
        return instance;
    }

    private ScopedClassPoolRepositoryImpl() {
        this.classpool = ClassPool.getDefault();
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        this.classpool.insertClassPath(new LoaderClassPath(classLoader));
    }

    @Override
    public boolean isPrune() {
        return this.prune;
    }

    @Override
    public void setPrune(boolean bl) {
        this.prune = bl;
    }

    @Override
    public ScopedClassPool createScopedClassPool(ClassLoader classLoader, ClassPool classPool) {
        return this.factory.create(classLoader, classPool, this);
    }

    @Override
    public ClassPool findClassPool(ClassLoader classLoader) {
        if (classLoader == null) {
            return this.registerClassLoader(ClassLoader.getSystemClassLoader());
        }
        return this.registerClassLoader(classLoader);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public ClassPool registerClassLoader(ClassLoader classLoader) {
        Map<ClassLoader, ScopedClassPool> map = this.registeredCLs;
        synchronized (map) {
            if (this.registeredCLs.containsKey(classLoader)) {
                return this.registeredCLs.get(classLoader);
            }
            ScopedClassPool scopedClassPool = this.createScopedClassPool(classLoader, this.classpool);
            this.registeredCLs.put(classLoader, scopedClassPool);
            return scopedClassPool;
        }
    }

    @Override
    public Map<ClassLoader, ScopedClassPool> getRegisteredCLs() {
        this.clearUnregisteredClassLoaders();
        return this.registeredCLs;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void clearUnregisteredClassLoaders() {
        ArrayList<ClassLoader> arrayList = null;
        Map<ClassLoader, ScopedClassPool> map = this.registeredCLs;
        synchronized (map) {
            for (Map.Entry<ClassLoader, ScopedClassPool> entry : this.registeredCLs.entrySet()) {
                if (!entry.getValue().isUnloadedClassLoader()) continue;
                ClassLoader classLoader = entry.getValue().getClassLoader();
                if (classLoader != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<ClassLoader>();
                    }
                    arrayList.add(classLoader);
                }
                this.registeredCLs.remove(entry.getKey());
            }
            if (arrayList != null) {
                for (ClassLoader classLoader : arrayList) {
                    this.unregisterClassLoader(classLoader);
                }
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public void unregisterClassLoader(ClassLoader classLoader) {
        Map<ClassLoader, ScopedClassPool> map = this.registeredCLs;
        synchronized (map) {
            ScopedClassPool scopedClassPool = this.registeredCLs.remove(classLoader);
            if (scopedClassPool != null) {
                scopedClassPool.close();
            }
        }
    }

    public void insertDelegate(ScopedClassPoolRepository scopedClassPoolRepository) {
    }

    @Override
    public void setClassPoolFactory(ScopedClassPoolFactory scopedClassPoolFactory) {
        this.factory = scopedClassPoolFactory;
    }

    @Override
    public ScopedClassPoolFactory getClassPoolFactory() {
        return this.factory;
    }
}

