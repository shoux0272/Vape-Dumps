/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.HashMap;
import java.util.Map;
import manthe.AJ;
import manthe.DR;
import manthe.Ds;
import manthe.pb;
import manthe.rz;

public class DX
extends DR<pb, rz<pb>> {
    private final Map<Ds, pb> o = new HashMap<Ds, pb>();
    private pb[] p;
    private final String n;

    public DX(Object object, String string, String string2, rz<pb> rz2) {
        super(object, string, rz2);
        this.n = string2;
    }

    public static DX a(Object object, String string, String string2, String string3, pb pb2, int n6, pb[] arrpb) {
        rz rz2 = new rz(string2, n6, arrpb);
        rz2.b(10.0);
        DX dX2 = new DX(object, string, string2, rz2);
        ((rz)dX2.c()).b(string3);
        dX2.a(pb2);
        rz2.a(dX2);
        rz2.j().add(new AJ());
        for (pb pb3 : arrpb) {
            pb3.a(dX2);
        }
        dX2.p = arrpb;
        rz2.a(pb2);
        return dX2;
    }

    public static DX a(Object object, String string, String string2, String string3, pb pb2, pb ... arrpb) {
        return DX.a(object, string, string2, string3, pb2, 1, arrpb);
    }

    public static DX a(Object object, String string, String string2, pb pb2, pb ... arrpb) {
        return DX.a(object, string, string, string2, pb2, 1, arrpb);
    }

    public static DX a(Object object, String string, String string2, pb pb2, int n6, pb ... arrpb) {
        return DX.a(object, string, string, string2, pb2, n6, arrpb);
    }

    public static DX a(Object object, String string, pb pb2, pb ... arrpb) {
        return DX.a(object, string, string, pb2, arrpb);
    }

    public pb[] u() {
        return this.p;
    }

    public pb v() {
        return ((rz)this.c()).a();
    }

    @Override
    public void a(pb pb2) {
        if (this.v().equals(pb2)) {
            return;
        }
        if (this.b() == null) {
            this.a(pb2);
        }
        ((rz)this.c()).a(pb2);
    }

    @Override
    public void a(int n6) {
        this.a(this.u()[n6]);
    }

    public int w() {
        for (int k = 0; k < this.u().length; ++k) {
            if (!this.v().equals(this.u()[k])) continue;
            return k;
        }
        return 0;
    }

    @Override
    public void a(String string) {
        DX dX2 = this.v().e();
        if (dX2 == null) {
            return;
        }
        pb pb2 = pb.a(dX2, string);
        if (pb2 == null) {
            return;
        }
        this.a(pb2);
    }

    @Override
    public boolean s() {
        return true;
    }

    @Override
    public boolean b(Ds ds2) {
        return !this.o.containsKey(ds2) || this.v().equals(this.o.get(ds2));
    }

    public void a(Ds ds2, pb pb2) {
        this.o.put(ds2, pb2);
    }

    public void a(pb pb2, Ds ... arrds) {
        this.a(arrds);
        for (Ds ds2 : arrds) {
            this.o.put(ds2, pb2);
        }
    }

    @Override
    public String H() {
        return this.n;
    }
}

