/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import manthe.r1;
import manthe.ri;

public class Bz {
    private final List<r1> b = new ArrayList<r1>();
    private ri a;

    public Bz(r1 ... arrr1) {
        this.b.addAll(Arrays.asList(arrr1));
    }

    public Bz(List<r1> list) {
        this.b.addAll(list);
    }

    public List<r1> a() {
        return this.b;
    }

    public ri b() {
        return this.a;
    }

    public void a(ri ri2) {
        this.a = ri2;
    }
}

