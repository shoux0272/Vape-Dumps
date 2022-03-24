/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import javassist.ByteArrayClassPath$BytecodeURLStreamHandler;
import javassist.ClassPath;

public class ByteArrayClassPath
implements ClassPath {
    protected String classname;
    protected byte[] classfile;

    public ByteArrayClassPath(String string, byte[] arrby) {
        this.classname = string;
        this.classfile = arrby;
    }

    public String toString() {
        return "byte[]:" + this.classname;
    }

    @Override
    public InputStream openClassfile(String string) {
        if (this.classname.equals(string)) {
            return new ByteArrayInputStream(this.classfile);
        }
        return null;
    }

    @Override
    public URL find(String string) {
        if (this.classname.equals(string)) {
            String string2 = string.replace('.', '/') + ".class";
            try {
                return new URL(null, "file:/ByteArrayClassPath/" + string2, new ByteArrayClassPath$BytecodeURLStreamHandler(this, null));
            }
            catch (MalformedURLException malformedURLException) {
                // empty catch block
            }
        }
        return null;
    }
}

