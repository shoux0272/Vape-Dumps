/*
 * Decompiled with CFR 0.150.
 */
package javassist.tools.web;

import java.io.IOException;
import java.net.Socket;
import javassist.tools.web.Webserver;

class ServiceThread
extends Thread {
    Webserver web;
    Socket sock;

    public ServiceThread(Webserver webserver, Socket socket) {
        this.web = webserver;
        this.sock = socket;
    }

    @Override
    public void run() {
        try {
            this.web.process(this.sock);
        }
        catch (IOException iOException) {
            // empty catch block
        }
    }
}

