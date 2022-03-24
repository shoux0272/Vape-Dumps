/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import manthe.cy;

public class mv {
    private static final String a = System.getProperty("user.home") + File.separator + "vapeTextures" + File.separator;
    private static cy[] b;

    public static byte[] a(String string) {
        File file = new File(a);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            return Files.readAllBytes(new File(a + string + ".png").toPath());
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return null;
        }
    }

    static {
        mv.b(null);
    }

    public static void b(cy[] arrcy) {
        b = arrcy;
    }

    public static cy[] b() {
        return b;
    }
}

