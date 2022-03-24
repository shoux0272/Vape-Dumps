/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultimap
 *  com.google.common.collect.Multimap
 */
package ripygore;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.URL;
import java.util.Iterator;
import ripygore.Util;

public class Mappings {
    private static final Multimap<String, String> METHODS = HashMultimap.create();
    private static final Multimap<String, String> METHODS_REVERSED = HashMultimap.create();
    private static final Multimap<String, String> FIELDS = HashMultimap.create();
    private static final Multimap<String, String> FIELDS_REVERSED = HashMultimap.create();

    private Mappings() {
    }

    private static void parse(URL url, Multimap<String, String> map, Multimap<String, String> mapReverse) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));){
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String srg = parts[0];
                String name = parts[1];
                map.put((Object)name, (Object)srg);
                mapReverse.put((Object)srg, (Object)name);
            }
        }
    }

    public static boolean match(Method method, String name) {
        String methodName = method.getName();
        if (!methodName.equals(name)) {
            String s;
            Iterator iterator = METHODS.get((Object)name).iterator();
            do {
                if (iterator.hasNext()) continue;
                iterator = METHODS_REVERSED.get((Object)name).iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return false;
                } while (!methodName.equals(s = (String)iterator.next()));
                return true;
            } while (!methodName.equals(s = (String)iterator.next()));
        }
        return true;
    }

    public static boolean match(Field field, String name) {
        String fieldName = field.getName();
        if (!fieldName.equals(name)) {
            String s;
            Iterator iterator = FIELDS.get((Object)name).iterator();
            do {
                if (iterator.hasNext()) continue;
                iterator = FIELDS_REVERSED.get((Object)name).iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return false;
                } while (!fieldName.equals(s = (String)iterator.next()));
                return true;
            } while (!fieldName.equals(s = (String)iterator.next()));
        }
        return true;
    }

    static {
        try {
            Mappings.parse(Util.getResource("methods.csv"), METHODS, METHODS_REVERSED);
            Mappings.parse(Util.getResource("fields.csv"), FIELDS, FIELDS_REVERSED);
        }
        catch (IOException var1) {
            throw new RuntimeException();
        }
    }
}

