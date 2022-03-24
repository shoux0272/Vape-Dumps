/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.InputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.URL;
import javassist.ClassPath;
import javassist.NotFoundException;

public class LoaderClassPath
implements ClassPath {
    private Reference<ClassLoader> clref;

    public LoaderClassPath(ClassLoader classLoader) {
        this.clref = new WeakReference<ClassLoader>(classLoader);
    }

    public String toString() {
        return this.clref.get() == null ? "<null>" : this.clref.get().toString();
    }

    @Override
    public InputStream openClassfile(String string) throws NotFoundException {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = this.clref.get();
        if (classLoader == null) {
            return null;
        }
        InputStream inputStream = classLoader.getResourceAsStream(string2);
        return inputStream;
    }

    @Override
    public URL find(String string) {
        String string2 = string.replace('.', '/') + ".class";
        ClassLoader classLoader = this.clref.get();
        if (classLoader == null) {
            return null;
        }
        URL uRL = classLoader.getResource(string2);
        return uRL;
    }
}

