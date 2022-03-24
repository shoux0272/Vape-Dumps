/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import java.util.Map;
import manthe.nk;

class Bb
implements Comparator {
    final nk a;

    Bb(nk nk2) {
        this.a = nk2;
    }

    public int compare(Object object, Object object2) {
        return ((Integer)((Map.Entry)object).getValue()).compareTo((Integer)((Map.Entry)object2).getValue());
    }
}

