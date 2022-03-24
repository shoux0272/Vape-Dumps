/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import javassist.CannotCompileException;
import javassist.ClassClassPath;
import javassist.ClassPath;
import javassist.ClassPathList;
import javassist.DirClassPath;
import javassist.JarClassPath;
import javassist.JarDirClassPath;
import javassist.LoaderClassPath;
import javassist.NotFoundException;
import javassist.bytecode.ClassFile;

final class ClassPoolTail {
    protected ClassPathList pathList = null;

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("[class path: ");
        ClassPathList classPathList = this.pathList;
        while (classPathList != null) {
            stringBuffer.append(classPathList.path.toString());
            stringBuffer.append(File.pathSeparatorChar);
            classPathList = classPathList.next;
        }
        stringBuffer.append(']');
        return stringBuffer.toString();
    }

    public synchronized ClassPath insertClassPath(ClassPath classPath) {
        this.pathList = new ClassPathList(classPath, this.pathList);
        return classPath;
    }

    public synchronized ClassPath appendClassPath(ClassPath classPath) {
        ClassPathList classPathList = new ClassPathList(classPath, null);
        ClassPathList classPathList2 = this.pathList;
        if (classPathList2 == null) {
            this.pathList = classPathList;
        } else {
            while (classPathList2.next != null) {
                classPathList2 = classPathList2.next;
            }
            classPathList2.next = classPathList;
        }
        return classPath;
    }

    public synchronized void removeClassPath(ClassPath classPath) {
        ClassPathList classPathList = this.pathList;
        if (classPathList != null) {
            if (classPathList.path == classPath) {
                this.pathList = classPathList.next;
            } else {
                while (classPathList.next != null) {
                    if (classPathList.next.path == classPath) {
                        classPathList.next = classPathList.next.next;
                        continue;
                    }
                    classPathList = classPathList.next;
                }
            }
        }
    }

    public ClassPath appendSystemPath() {
        if (ClassFile.MAJOR_VERSION < 53) {
            return this.appendClassPath(new ClassClassPath());
        }
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
        return this.appendClassPath(new LoaderClassPath(classLoader));
    }

    public ClassPath insertClassPath(String string) throws NotFoundException {
        return this.insertClassPath(ClassPoolTail.makePathObject(string));
    }

    public ClassPath appendClassPath(String string) throws NotFoundException {
        return this.appendClassPath(ClassPoolTail.makePathObject(string));
    }

    private static ClassPath makePathObject(String string) throws NotFoundException {
        String string2 = string.toLowerCase();
        if (string2.endsWith(".jar") || string2.endsWith(".zip")) {
            return new JarClassPath(string);
        }
        int n6 = string.length();
        if (n6 > 2 && string.charAt(n6 - 1) == '*' && (string.charAt(n6 - 2) == '/' || string.charAt(n6 - 2) == File.separatorChar)) {
            String string3 = string.substring(0, n6 - 2);
            return new JarDirClassPath(string3);
        }
        return new DirClassPath(string);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    void writeClassfile(String string, OutputStream outputStream) throws NotFoundException, IOException, CannotCompileException {
        InputStream inputStream = this.openClassfile(string);
        if (inputStream == null) {
            throw new NotFoundException(string);
        }
        try {
            ClassPoolTail.copyStream(inputStream, outputStream);
        }
        finally {
            inputStream.close();
        }
    }

    InputStream openClassfile(String string) throws NotFoundException {
        ClassPathList classPathList = this.pathList;
        InputStream inputStream = null;
        NotFoundException notFoundException = null;
        while (classPathList != null) {
            block5: {
                try {
                    inputStream = classPathList.path.openClassfile(string);
                }
                catch (NotFoundException notFoundException2) {
                    if (notFoundException != null) break block5;
                    notFoundException = notFoundException2;
                }
            }
            if (inputStream == null) {
                classPathList = classPathList.next;
                continue;
            }
            return inputStream;
        }
        if (notFoundException != null) {
            throw notFoundException;
        }
        return null;
    }

    public URL find(String string) {
        ClassPathList classPathList = this.pathList;
        URL uRL = null;
        while (classPathList != null) {
            uRL = classPathList.path.find(string);
            if (uRL == null) {
                classPathList = classPathList.next;
                continue;
            }
            return uRL;
        }
        return null;
    }

    public static byte[] readStream(InputStream inputStream) throws IOException {
        byte[][] arrarrby = new byte[8][];
        int n6 = 4096;
        for (int k = 0; k < 8; ++k) {
            arrarrby[k] = new byte[n6];
            int n10 = 0;
            int n11 = 0;
            do {
                if ((n11 = inputStream.read(arrarrby[k], n10, n6 - n10)) >= 0) continue;
                byte[] arrby = new byte[n6 - 4096 + n10];
                int n12 = 0;
                for (int i10 = 0; i10 < k; ++i10) {
                    System.arraycopy(arrarrby[i10], 0, arrby, n12, n12 + 4096);
                    n12 = n12 + n12 + 4096;
                }
                System.arraycopy(arrarrby[k], 0, arrby, n12, n10);
                return arrby;
            } while ((n10 += n11) < n6);
            n6 *= 2;
        }
        throw new IOException("too much data");
    }

    public static void copyStream(InputStream inputStream, OutputStream outputStream) throws IOException {
        int n6 = 4096;
        byte[] arrby = null;
        for (int k = 0; k < 64; ++k) {
            if (k < 8) {
                arrby = new byte[n6 *= 2];
            }
            int n10 = 0;
            int n11 = 0;
            do {
                if ((n11 = inputStream.read(arrby, n10, n6 - n10)) >= 0) continue;
                outputStream.write(arrby, 0, n10);
                return;
            } while ((n10 += n11) < n6);
            outputStream.write(arrby);
        }
        throw new IOException("too much data");
    }
}

