/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.File;
import java.io.FilenameFilter;
import javassist.JarDirClassPath;

class JarDirClassPath$1
implements FilenameFilter {
    final JarDirClassPath this$0;

    JarDirClassPath$1(JarDirClassPath jarDirClassPath) {
        this.this$0 = jarDirClassPath;
    }

    @Override
    public boolean accept(File file, String string) {
        return (string = string.toLowerCase()).endsWith(".jar") || string.endsWith(".zip");
    }
}

