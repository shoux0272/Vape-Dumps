/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;
import java.util.Map;

public class iReSqtkUVgeIViReSqtkUVg {
    private Map<Class, iReSqtkUVgOLIiReSqtkUVg> a = new HashMap<Class, iReSqtkUVgOLIiReSqtkUVg>();
    private Map<Class, Integer> b = new HashMap<Class, Integer>();
    private int c = 0;
    private boolean d;
    private iReSqtkUVgKcHiReSqtkUVg e;

    public void a() {
        this.e = new iReSqtkUVgKcHiReSqtkUVg();
        this.a(this.e);
    }

    public void b() {
        this.e.a(new iReSqtkUVghtMiReSqtkUVg(this.e));
        this.a(new iReSqtkUVggzOiReSqtkUVg());
        this.a(new iReSqtkUVgxmOiReSqtkUVg());
        this.a(new iReSqtkUVgggniReSqtkUVg());
        this.a(new iReSqtkUVgelRiReSqtkUVg());
        this.a(new iReSqtkUVgDrmiReSqtkUVg());
        this.a(new iReSqtkUVgJmqiReSqtkUVg());
        this.a(new iReSqtkUVgVxEiReSqtkUVg());
        this.a(new iReSqtkUVgGrliReSqtkUVg());
        this.a(new iReSqtkUVgUYqiReSqtkUVg());
        this.a(new iReSqtkUVgpRziReSqtkUVg());
        this.a(new iReSqtkUVgxLmiReSqtkUVg());
        this.a(new iReSqtkUVgzYsiReSqtkUVg());
        this.a(new iReSqtkUVgDrAiReSqtkUVg());
        this.a(new iReSqtkUVgHmQiReSqtkUVg());
        this.a(new iReSqtkUVgHexiReSqtkUVg());
        this.a(new iReSqtkUVgZEViReSqtkUVg());
        this.a(new iReSqtkUVgcdUiReSqtkUVg());
        this.a(new iReSqtkUVgZSciReSqtkUVg());
        this.a(new iReSqtkUVglfriReSqtkUVg());
        this.a(new iReSqtkUVgNhPiReSqtkUVg());
        this.a(new iReSqtkUVguQbiReSqtkUVg());
        if (iReSqtkUVgauSiReSqtkUVg.d() > 13) {
            this.a(new iReSqtkUVgUvXiReSqtkUVg());
            this.a(new iReSqtkUVgtFZiReSqtkUVg());
            this.a(new iReSqtkUVgCIviReSqtkUVg());
        }
    }

    private void a(iReSqtkUVgOLIiReSqtkUVg iReSqtkUVgOLIiReSqtkUVg2) {
        this.a.put(iReSqtkUVgOLIiReSqtkUVg2.a(), iReSqtkUVgOLIiReSqtkUVg2);
        this.b.put(iReSqtkUVgOLIiReSqtkUVg2.a(), this.c++);
    }

    public void a(Object object) {
        Class<?> class_ = object.getClass();
        if (this.a.containsKey(class_)) {
            iReSqtkUVgOLIiReSqtkUVg iReSqtkUVgOLIiReSqtkUVg2 = this.a.get(class_);
            iReSqtkUVgOLIiReSqtkUVg2.a(object);
        }
    }

    public void a(boolean bl) {
        this.d = bl;
    }

    public boolean c() {
        return this.d;
    }
}

