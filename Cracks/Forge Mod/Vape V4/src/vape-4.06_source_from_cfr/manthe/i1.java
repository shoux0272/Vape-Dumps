/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class i1
extends gJ {
    private final bP e;
    private final bP a;
    private final bP d;
    private final BG f = this.b("listShaders", true, List.class);

    public i1() {
        super(A5.aD);
        this.e = this.a("<init>", false, Void.TYPE, A5.ai, A5.dX, A5.g, A5.ca);
        this.a = this.a("createBindFramebuffers", true, Void.TYPE, Integer.TYPE, Integer.TYPE);
        this.d = this.a("deleteShaderGroup", true, Void.TYPE, new Class[0]);
    }

    public Object a(Object object, Object object2, Object object3, Object object4) {
        return this.e.a(new Object[]{object, object2, object3, object4});
    }

    public void a(Object object, int n6, int n10) {
        this.a.p(object, n6, n10);
    }

    public void a(Object object) {
        this.d.p(object, new Object[0]);
    }

    public List b(Object object) {
        return (List)this.f.f(object);
    }
}

