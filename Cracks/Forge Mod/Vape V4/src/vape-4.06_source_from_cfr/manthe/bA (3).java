/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.net.MalformedURLException;
import java.net.URL;
import java.security.SecureRandom;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import manthe.ni;
import manthe.on;
import manthe.pL;
import manthe.t;
import manthe.vS;

public class bA {
    private boolean d = false;
    private SSLSocketFactory a;
    private HostnameVerifier f;
    private final Object c;
    private final Object g;
    private final Object e;
    private final Object h;
    private final t b = on.p.M();

    public bA() {
        this.c = this.b.bt.f.f(null);
        this.g = this.b.bt.d.f(null);
        this.e = this.b.bt.e.f(null);
        this.h = this.b.bt.g.f(null);
    }

    private URL a(String string) {
        try {
            return new URL(string);
        }
        catch (MalformedURLException malformedURLException) {
            throw new Error("Couldn't create constant for " + string, malformedURLException);
        }
    }

    public void d() {
        if (!this.d && on.p.e().d() == pL.d) {
            if (this.a == null) {
                this.a = HttpsURLConnection.getDefaultSSLSocketFactory();
                this.f = HttpsURLConnection.getDefaultHostnameVerifier();
            }
            this.b.bt.f.a(null, "https://sessionserver.thealtening.com/session/minecraft/");
            this.b.bt.d.a(null, this.a("https://sessionserver.thealtening.com/session/minecraft/join"));
            this.b.bt.e.a(null, this.a("https://sessionserver.thealtening.com/session/minecraft/hasJoined"));
            this.b.bt.g.a(null, (Object)new String[]{".minecraft.net", ".mojang.com", ".thealtening.com"});
            this.a();
            this.b();
            this.d = true;
        }
    }

    public void c() {
        if (this.d) {
            this.b.bt.f.a(null, this.c);
            this.b.bt.d.a(null, this.g);
            this.b.bt.e.a(null, this.e);
            this.b.bt.g.a(null, this.h);
            HttpsURLConnection.setDefaultSSLSocketFactory(this.a);
            HttpsURLConnection.setDefaultHostnameVerifier(this.f);
            this.a = null;
            this.f = null;
            this.d = false;
        }
    }

    private void a() {
        TrustManager[] arrtrustManager = new TrustManager[]{new ni(this)};
        try {
            SSLContext sSLContext = SSLContext.getInstance("SSL");
            sSLContext.init(null, arrtrustManager, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sSLContext.getSocketFactory());
        }
        catch (Exception exception) {
            // empty catch block
        }
    }

    private void b() {
        HttpsURLConnection.setDefaultHostnameVerifier(new vS(this));
    }
}

