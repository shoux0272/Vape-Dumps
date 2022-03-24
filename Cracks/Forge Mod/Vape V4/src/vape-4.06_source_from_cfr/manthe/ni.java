/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.security.cert.X509Certificate;
import javax.net.ssl.X509TrustManager;
import manthe.bA;

class ni
implements X509TrustManager {
    final bA a;

    ni(bA bA2) {
        this.a = bA2;
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        return null;
    }

    @Override
    public void checkClientTrusted(X509Certificate[] arrx509Certificate, String string) {
    }

    @Override
    public void checkServerTrusted(X509Certificate[] arrx509Certificate, String string) {
    }
}

