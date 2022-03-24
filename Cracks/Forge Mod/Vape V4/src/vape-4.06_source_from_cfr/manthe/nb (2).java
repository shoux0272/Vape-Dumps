/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.awt.Color;
import java.io.FileInputStream;
import java.io.IOException;
import manthe.k9;
import manthe.m0;
import manthe.on;

public class nb {
    static final String a = "C:\\Users\\Moham\\Desktop\\pngs\\Group 5709.png";

    public static m0 a() {
        m0 m02 = null;
        try {
            m02 = new m0(new FileInputStream(a));
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
        }
        return m02;
    }

    public static void b() {
        try {
            m0 m02 = nb.a();
            if (m02 != null) {
                on.a("drawing");
                k9.a(Color.BLACK, 10.0f, 10.0f, m02, 20.0f, 20.0f, true);
            }
        }
        catch (Exception exception) {
            on.a(exception);
        }
    }
}

