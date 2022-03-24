/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import manthe.e8;
import manthe.fG;
import manthe.fk;
import manthe.z8;

public class v6 {
    private final List<Object> c;
    private final List<fG> a;
    final z8 b;

    public v6(z8 z82, e8 e82) {
        this.b = z82;
        this.c = new ArrayList<Object>();
        this.a = new ArrayList<fG>();
        this.a(e82, true);
    }

    public List<fG> b() {
        return this.a;
    }

    public Object c() {
        return this.c.isEmpty() ? null : this.c.get(0);
    }

    public void e() {
        this.a.clear();
        if (this.c.isEmpty()) {
            return;
        }
        for (Object object : this.c) {
            fk fk2;
            e8 e82 = new e8(object);
            fG fG2 = e82.at();
            if (!fG2.d() || !(fk2 = fG2.k()).d()) continue;
            boolean bl = true;
            for (fG fG3 : this.a) {
                if (!fG3.a(fG2)) continue;
                bl = false;
                fG3.b(fG3.n() + fG2.n());
                break;
            }
            if (!bl) continue;
            fG fG4 = fG.a(fk2);
            fG4.a(fG2.i());
            fG4.a(fG2.m());
            fG4.b(fG2.n());
            this.a.add(fG4);
        }
    }

    public void a(List list) {
        int n6 = this.c.size();
        Iterator<Object> iterator = this.c.iterator();
        while (iterator.hasNext()) {
            e8 e82;
            e8 e83;
            Object object = iterator.next();
            if (!list.contains(object)) {
                iterator.remove();
                --n6;
                continue;
            }
            if (n6 <= 1 || !((double)(e83 = new e8(object)).a(e82 = new e8(this.c())) > 3.0)) continue;
            iterator.remove();
        }
        this.e();
    }

    public void a() {
        this.a.clear();
        this.c.clear();
    }

    public boolean d() {
        return this.c.isEmpty();
    }

    public void b(Object object) {
        this.c.remove(object);
    }

    public void b(e8 e82) {
        this.c.add(e82.a());
    }

    public boolean a(e8 e82) {
        return this.c.contains(e82.a());
    }

    public boolean a(Object object) {
        return this.c.contains(object);
    }

    private void a(e8 e82, boolean bl) {
        this.c.add(e82.a());
        if (bl) {
            this.e();
        }
    }

    static List b(v6 v62) {
        return v62.a;
    }

    static List a(v6 v62) {
        return v62.c;
    }
}

