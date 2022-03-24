/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.InputStream;
import java.net.URL;
import javassist.ClassPath;
import javassist.NotFoundException;

public class ClassClassPath
implements ClassPath {
    private Class<?> thisClass;

    public ClassClassPath(Class<?> class_) {
        this.thisClass = class_;
    }

    ClassClassPath() {
        this(Object.class);
    }

    @Override
    public InputStream openClassfile(String string) throws NotFoundException {
        String string2 = '/' + string.replace('.', '/') + ".class";
        return this.thisClass.getResourceAsStream(string2);
    }

    @Override
    public URL find(String string) {
        String string2 = '/' + string.replace('.', '/') + ".class";
        return this.thisClass.getResource(string2);
    }

    public String toString() {
        return this.thisClass.getName() + ".class";
    }
}

