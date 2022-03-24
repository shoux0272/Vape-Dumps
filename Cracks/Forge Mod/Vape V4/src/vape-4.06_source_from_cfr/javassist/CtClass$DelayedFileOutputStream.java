/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

class CtClass$DelayedFileOutputStream
extends OutputStream {
    private FileOutputStream file = null;
    private String filename;

    CtClass$DelayedFileOutputStream(String string) {
        this.filename = string;
    }

    private void init() throws IOException {
        if (this.file == null) {
            this.file = new FileOutputStream(this.filename);
        }
    }

    @Override
    public void write(int n6) throws IOException {
        this.init();
        this.file.write(n6);
    }

    @Override
    public void write(byte[] arrby) throws IOException {
        this.init();
        this.file.write(arrby);
    }

    @Override
    public void write(byte[] arrby, int n6, int n10) throws IOException {
        this.init();
        this.file.write(arrby, n6, n10);
    }

    @Override
    public void flush() throws IOException {
        this.init();
        this.file.flush();
    }

    @Override
    public void close() throws IOException {
        this.init();
        this.file.close();
    }
}

