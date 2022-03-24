/*
 * Decompiled with CFR 0.150.
 */
package javassist;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import javassist.ClassPath;
import javassist.ClassPoolTail;

public class URLClassPath
implements ClassPath {
    protected String hostname;
    protected int port;
    protected String directory;
    protected String packageName;

    public URLClassPath(String string, int n6, String string2, String string3) {
        this.hostname = string;
        this.port = n6;
        this.directory = string2;
        this.packageName = string3;
    }

    public String toString() {
        return this.hostname + ":" + this.port + this.directory;
    }

    @Override
    public InputStream openClassfile(String string) {
        try {
            URLConnection uRLConnection = this.openClassfile0(string);
            if (uRLConnection != null) {
                return uRLConnection.getInputStream();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return null;
    }

    private URLConnection openClassfile0(String string) throws IOException {
        if (this.packageName == null || string.startsWith(this.packageName)) {
            String string2 = this.directory + string.replace('.', '/') + ".class";
            return URLClassPath.fetchClass0(this.hostname, this.port, string2);
        }
        return null;
    }

    @Override
    public URL find(String string) {
        try {
            URLConnection uRLConnection = this.openClassfile0(string);
            InputStream inputStream = uRLConnection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
                return uRLConnection.getURL();
            }
        }
        catch (IOException iOException) {
            // empty catch block
        }
        return null;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static byte[] fetchClass(String string, int n6, String string2, String string3) throws IOException {
        byte[] arrby;
        URLConnection uRLConnection = URLClassPath.fetchClass0(string, n6, string2 + string3.replace('.', '/') + ".class");
        int n10 = uRLConnection.getContentLength();
        try (InputStream inputStream = uRLConnection.getInputStream();){
            if (n10 <= 0) {
                arrby = ClassPoolTail.readStream(inputStream);
            } else {
                int n11;
                arrby = new byte[n10];
                int n12 = 0;
                do {
                    if ((n11 = inputStream.read(arrby, n12, n10 - n12)) >= 0) continue;
                    throw new IOException("the stream was closed: " + string3);
                } while ((n12 += n11) < n10);
            }
        }
        return arrby;
    }

    private static URLConnection fetchClass0(String string, int n6, String string2) throws IOException {
        URL uRL;
        try {
            uRL = new URL("http", string, n6, string2);
        }
        catch (MalformedURLException malformedURLException) {
            throw new IOException("invalid URL?");
        }
        URLConnection uRLConnection = uRL.openConnection();
        uRLConnection.connect();
        return uRLConnection;
    }
}

