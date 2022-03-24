/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javassist.ClassPath;

final class DirClassPath
implements ClassPath {
    String directory;

    DirClassPath(String string) {
        this.directory = string;
    }

    @Override
    public InputStream openClassfile(String string) {
        try {
            char c3 = File.separatorChar;
            String string2 = this.directory + c3 + string.replace('.', c3) + ".class";
            return new FileInputStream(string2.toString());
        }
        catch (FileNotFoundException fileNotFoundException) {
        }
        catch (SecurityException securityException) {
            // empty catch block
        }
        return null;
    }

    @Override
    public URL find(String string) {
        char c3 = File.separatorChar;
        String string2 = this.directory + c3 + string.replace('.', c3) + ".class";
        File file = new File(string2);
        if (file.exists()) {
            try {
                return file.getCanonicalFile().toURI().toURL();
            }
            catch (MalformedURLException malformedURLException) {
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        return null;
    }

    public String toString() {
        return this.directory;
    }
}

