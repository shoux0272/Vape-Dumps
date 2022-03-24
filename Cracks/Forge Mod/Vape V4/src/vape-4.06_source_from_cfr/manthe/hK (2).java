/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class hK
extends gJ {
    public bP d = this.b("reverse", false, List.class, List.class);
    public bP a = this.b("newArrayList", false, ArrayList.class, Iterable.class);

    public hK() {
        super(A5.cR);
    }

    public List a(List list) {
        return (List)this.d.e(null, list);
    }

    public ArrayList a(Iterable iterable) {
        return (ArrayList)this.a.e(null, iterable);
    }
}

