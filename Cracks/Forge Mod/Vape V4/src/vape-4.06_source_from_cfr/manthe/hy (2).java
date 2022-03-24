/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.gJ;

public class hy
extends gJ {
    private final BG d;
    private BG a;

    public hy() {
        super(A5.K);
        if (V.c() > 13) {
            this.a = this.b("particleEmitters", true, List.class);
            this.d = this.a("fxLayers", true, "[[Ljava/util/List;");
        } else {
            this.d = this.a("fxLayers", true, "[Ljava/util/List;");
        }
    }

    public List c(Object object) {
        return (List)this.a.f(object);
    }

    private List[][] a(Object object) {
        if (object == null || this.d == null || this.d.d()) {
            return new List[0][];
        }
        return (List[][])this.d.e(object);
    }

    private List[] b(Object object) {
        return (List[])this.d.e(object);
    }

    static List[][] a(hy hy2, Object object) {
        return hy2.a(object);
    }

    static List[] b(hy hy2, Object object) {
        return hy2.b(object);
    }
}

