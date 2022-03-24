/*
 * Decompiled with CFR 0.150.
 */
package javassist.compiler;

import java.util.HashMap;

public final class KeywordTable
extends HashMap<String, Integer> {
    private static final long serialVersionUID = 1L;

    public int lookup(String string) {
        return this.containsKey(string) ? (Integer)this.get(string) : -1;
    }

    public void append(String string, int n6) {
        this.put(string, n6);
    }
}

