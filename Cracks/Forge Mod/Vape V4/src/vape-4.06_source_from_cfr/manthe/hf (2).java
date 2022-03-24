/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.Collection;
import manthe.A5;
import manthe.bP;
import manthe.gJ;

public class hf
extends gJ {
    public bP d = this.a("size", false, Integer.TYPE, new Class[0]);
    public bP a = this.a("values", false, Collection.class, new Class[0]);

    public hf() {
        super(A5.bA);
    }

    public int a(Object object) {
        return this.d.o(object, new Object[0]);
    }

    public Collection b(Object object) {
        return (Collection)this.a.e(object, new Object[0]);
    }
}

