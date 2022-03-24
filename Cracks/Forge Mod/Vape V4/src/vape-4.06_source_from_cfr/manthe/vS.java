/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import manthe.bA;

class vS
implements HostnameVerifier {
    final bA a;

    vS(bA bA2) {
        this.a = bA2;
    }

    @Override
    public boolean verify(String string, SSLSession sSLSession) {
        return string.equals("authserver.thealtening.com") || string.equals("sessionserver.thealtening.com");
    }
}

