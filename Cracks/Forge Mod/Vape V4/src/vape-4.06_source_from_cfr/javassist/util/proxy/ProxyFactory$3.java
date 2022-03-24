/*
 * Decompiled with CFR 0.150.
 */
package javassist.util.proxy;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.Map;

class ProxyFactory$3
implements Comparator<Map.Entry<String, Method>> {
    ProxyFactory$3() {
    }

    @Override
    public int compare(Map.Entry<String, Method> entry, Map.Entry<String, Method> entry2) {
        return entry.getKey().compareTo(entry2.getKey());
    }
}

