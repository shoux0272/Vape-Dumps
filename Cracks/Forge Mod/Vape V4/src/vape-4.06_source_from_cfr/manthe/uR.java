/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Comparator;
import manthe.wz;

class uR
implements Comparator<wz> {
    final wz a;

    uR(wz wz2) {
        this.a = wz2;
    }

    public int a(wz wz2, wz wz3) {
        return (int)wz2.c() - (int)wz3.c();
    }
}

