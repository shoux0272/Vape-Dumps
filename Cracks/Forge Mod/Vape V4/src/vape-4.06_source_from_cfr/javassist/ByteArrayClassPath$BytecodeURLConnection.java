/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import javassist.ByteArrayClassPath;

class ByteArrayClassPath$BytecodeURLConnection
extends URLConnection {
    final ByteArrayClassPath this$0;

    protected ByteArrayClassPath$BytecodeURLConnection(ByteArrayClassPath byteArrayClassPath, URL uRL) {
        this.this$0 = byteArrayClassPath;
        super(uRL);
    }

    @Override
    public void connect() throws IOException {
    }

    @Override
    public InputStream getInputStream() throws IOException {
        return new ByteArrayInputStream(this.this$0.classfile);
    }

    @Override
    public int getContentLength() {
        return this.this$0.classfile.length;
    }
}

