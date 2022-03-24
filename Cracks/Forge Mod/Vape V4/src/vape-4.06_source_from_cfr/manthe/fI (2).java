/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.List;
import manthe.cy;
import manthe.fQ;
import manthe.is;

public class fI
extends cy {
    public fI(Object object) {
        super(object);
    }

    public List<fQ> f() {
        List list = fI.a.M().h.a(this.b);
        ArrayList<fQ> arrayList = new ArrayList<fQ>();
        for (Object e10 : list) {
            arrayList.add(new fQ(e10));
        }
        return arrayList;
    }

    public int g() {
        return fI.a.M().h.b(this.b);
    }

    public fQ a(int n6) {
        return new fQ(is.a(fI.a.M().h, this.b, n6));
    }
}

