/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.d6;
import manthe.ej;
import manthe.ez;
import manthe.ih;

public class ew<T extends ej>
extends ez<T> {
    public ew(Object object) {
        super(object);
    }

    public d6 g() {
        return new d6(ih.b(ew.a.M().Q, this.b));
    }

    public List<Object> f() {
        return (List)ih.a(ew.a.M().Q, this.b);
    }

    public void a(List list) {
        ih.a(ew.a.M().Q, this.b, list);
    }

    public void h() {
        ih.c(ew.a.M().Q, this.b);
    }

    public boolean a(ej ej2, float f10, boolean bl) {
        return ew.a.M().Q.a(this.b, ej2.a(), f10, bl);
    }
}

