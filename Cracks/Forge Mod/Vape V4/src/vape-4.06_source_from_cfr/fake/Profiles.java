/*
 * Decompiled with CFR 0.150.
 */
package fake;

import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;
import ripygore.Util;

public class Profiles {
    public static String readSettings() throws Exception {
        URL resource = Util.getResource("default.json");
        try (Scanner scanner = new Scanner(resource.openStream(), StandardCharsets.UTF_8.toString());){
            scanner.useDelimiter("\\A");
            String s = scanner.hasNext() ? scanner.next() : "";
            String string = Base64.getEncoder().encodeToString(s.getBytes());
            return string;
        }
    }
}

