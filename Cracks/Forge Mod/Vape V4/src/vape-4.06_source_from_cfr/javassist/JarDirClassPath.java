/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.File;
import java.io.InputStream;
import java.net.URL;
import javassist.ClassPath;
import javassist.JarClassPath;
import javassist.JarDirClassPath$1;
import javassist.NotFoundException;

final class JarDirClassPath
implements ClassPath {
    JarClassPath[] jars;

    JarDirClassPath(String string) throws NotFoundException {
        File[] arrfile = new File(string).listFiles(new JarDirClassPath$1(this));
        if (arrfile != null) {
            this.jars = new JarClassPath[arrfile.length];
            for (int k = 0; k < arrfile.length; ++k) {
                this.jars[k] = new JarClassPath(arrfile[k].getPath());
            }
        }
    }

    @Override
    public InputStream openClassfile(String string) throws NotFoundException {
        if (this.jars != null) {
            for (int k = 0; k < this.jars.length; ++k) {
                InputStream inputStream = this.jars[k].openClassfile(string);
                if (inputStream == null) continue;
                return inputStream;
            }
        }
        return null;
    }

    @Override
    public URL find(String string) {
        if (this.jars != null) {
            for (int k = 0; k < this.jars.length; ++k) {
                URL uRL = this.jars[k].find(string);
                if (uRL == null) continue;
                return uRL;
            }
        }
        return null;
    }
}

