/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.net.URL;
import java.net.URLConnection;
import java.net.URLStreamHandler;
import javassist.ByteArrayClassPath;
import javassist.ByteArrayClassPath$1;
import javassist.ByteArrayClassPath$BytecodeURLConnection;

class ByteArrayClassPath$BytecodeURLStreamHandler
extends URLStreamHandler {
    final ByteArrayClassPath this$0;

    private ByteArrayClassPath$BytecodeURLStreamHandler(ByteArrayClassPath byteArrayClassPath) {
        this.this$0 = byteArrayClassPath;
    }

    @Override
    protected URLConnection openConnection(URL uRL) {
        return new ByteArrayClassPath$BytecodeURLConnection(this.this$0, uRL);
    }

    ByteArrayClassPath$BytecodeURLStreamHandler(ByteArrayClassPath byteArrayClassPath, ByteArrayClassPath$1 byteArrayClassPath$1) {
        this(byteArrayClassPath);
    }
}

