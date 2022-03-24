/*
 * Decompiled with CFR 0.150.
 */
import a.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class iReSqtkUVgoRmiReSqtkUVg
extends iReSqtkUVgWaoiReSqtkUVg<Boolean, iReSqtkUVgRNziReSqtkUVg> {
    private List<iReSqtkUVgWaoiReSqtkUVg> a = new ArrayList<iReSqtkUVgWaoiReSqtkUVg>();
    private iReSqtkUVgRNziReSqtkUVg b;

    public iReSqtkUVgoRmiReSqtkUVg(Object object, String string, iReSqtkUVgRNziReSqtkUVg iReSqtkUVgRNziReSqtkUVg2) {
        super(object, string, iReSqtkUVgRNziReSqtkUVg2);
    }

    public static iReSqtkUVgoRmiReSqtkUVg a(Object object, String string, String string2, boolean bl) {
        iReSqtkUVgRNziReSqtkUVg iReSqtkUVgRNziReSqtkUVg2 = new iReSqtkUVgRNziReSqtkUVg(string2, 10.0);
        iReSqtkUVgRNziReSqtkUVg2.d(10.0);
        iReSqtkUVgRNziReSqtkUVg2.b(bl);
        iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2 = new iReSqtkUVgoRmiReSqtkUVg(object, string, iReSqtkUVgRNziReSqtkUVg2);
        iReSqtkUVgoRmiReSqtkUVg2.b(Boolean.valueOf(bl));
        iReSqtkUVgRNziReSqtkUVg2.b(iReSqtkUVgoRmiReSqtkUVg2);
        iReSqtkUVgRNziReSqtkUVg2.w().add(new iReSqtkUVgXAgiReSqtkUVg());
        return iReSqtkUVgoRmiReSqtkUVg2;
    }

    public static iReSqtkUVgoRmiReSqtkUVg a(Object object, String string, boolean bl, String string2) {
        iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2 = iReSqtkUVgoRmiReSqtkUVg.a(object, string, string, bl);
        ((iReSqtkUVgRNziReSqtkUVg)iReSqtkUVgoRmiReSqtkUVg2.c()).a_(string2);
        return iReSqtkUVgoRmiReSqtkUVg2;
    }

    public static iReSqtkUVgoRmiReSqtkUVg a(Object object, String string, boolean bl) {
        return iReSqtkUVgoRmiReSqtkUVg.a(object, string, string, bl);
    }

    public Boolean i() {
        return ((iReSqtkUVgRNziReSqtkUVg)this.c()).b();
    }

    @Override
    public void a(Boolean bl) {
        if (this.b() == null) {
            this.b(bl);
        }
        ((iReSqtkUVgRNziReSqtkUVg)this.c()).b(bl);
    }

    public Boolean j() {
        if (((iReSqtkUVgRNziReSqtkUVg)this.c()).B()) {
            if (a.a.ib()) {
                return this.i();
            }
            return false;
        }
        return this.i();
    }

    public iReSqtkUVgoRmiReSqtkUVg b(boolean bl) {
        ((iReSqtkUVgRNziReSqtkUVg)this.c()).e(bl);
        return this;
    }

    @Override
    public void a(String string) {
        this.a((Boolean)Boolean.parseBoolean(string));
    }

    public List<iReSqtkUVgWaoiReSqtkUVg> k() {
        return this.a;
    }

    public iReSqtkUVgWaoiReSqtkUVg l() {
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : this.k()) {
            if (!iReSqtkUVgWaoiReSqtkUVg2.equals(this.k().get(this.k().size() - 1))) continue;
            if (iReSqtkUVgWaoiReSqtkUVg2 instanceof iReSqtkUVgoRmiReSqtkUVg) {
                iReSqtkUVgoRmiReSqtkUVg iReSqtkUVgoRmiReSqtkUVg2 = (iReSqtkUVgoRmiReSqtkUVg)iReSqtkUVgWaoiReSqtkUVg2;
                if (!iReSqtkUVgoRmiReSqtkUVg2.k().isEmpty()) {
                    iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg3 = iReSqtkUVgoRmiReSqtkUVg2.k().get(iReSqtkUVgoRmiReSqtkUVg2.k().size() - 1);
                    if (!iReSqtkUVgoRmiReSqtkUVg2.k().isEmpty()) {
                        return iReSqtkUVgoRmiReSqtkUVg2.l();
                    }
                    return iReSqtkUVgWaoiReSqtkUVg3;
                }
                return iReSqtkUVgWaoiReSqtkUVg2;
            }
            return iReSqtkUVgWaoiReSqtkUVg2;
        }
        return null;
    }

    public iReSqtkUVgoRmiReSqtkUVg a(iReSqtkUVgWaoiReSqtkUVg ... arriReSqtkUVgWaoiReSqtkUVg) {
        for (iReSqtkUVgWaoiReSqtkUVg iReSqtkUVgWaoiReSqtkUVg2 : arriReSqtkUVgWaoiReSqtkUVg) {
            iReSqtkUVgWaoiReSqtkUVg2.a(this);
        }
        this.a.addAll(Arrays.asList(arriReSqtkUVgWaoiReSqtkUVg));
        return this;
    }

    @Override
    public /* synthetic */ Object a() {
        return this.i();
    }
}

