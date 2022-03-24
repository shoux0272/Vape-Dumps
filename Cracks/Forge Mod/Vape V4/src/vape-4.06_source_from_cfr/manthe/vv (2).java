/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Iterator;
import manthe.AV;
import manthe.rm;
import manthe.sb;
import manthe.vK;

class vv
implements vK {
    final sb b;
    final rm a;

    vv(rm rm2, sb sb2) {
        this.a = rm2;
        this.b = sb2;
    }

    @Override
    public void a(int n6, int n10, int n11) {
        if (this.b.C().E().length() > 0) {
            ArrayList arrayList = new ArrayList(rm.d(this.a));
            Iterator iterator = arrayList.iterator();
            while (iterator.hasNext()) {
                AV aV = (AV)iterator.next();
                String string = this.b.C().E().toLowerCase();
                if (aV.r().toLowerCase().contains(string) || aV.l().toString().toLowerCase().contains(string)) continue;
                iterator.remove();
            }
            if (arrayList.isEmpty()) {
                rm.e(this.a).a(false);
                rm.b(this.a).a(false);
                rm.c(this.a).a(false);
                rm.a(this.a).a(false);
            } else {
                rm.a(this.a, arrayList, rm.c(this.a), rm.a(this.a));
                rm.e(this.a).a(false);
                rm.b(this.a).a(false);
                rm.c(this.a).a(true);
                rm.a(this.a).a(true);
            }
        } else {
            rm.e(this.a).a(true);
            rm.b(this.a).a(true);
            rm.c(this.a).a(false);
            rm.a(this.a).a(false);
        }
    }
}

