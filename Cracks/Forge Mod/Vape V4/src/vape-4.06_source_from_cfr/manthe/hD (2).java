/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.gJ;

public class hD
extends gJ {
    private final BG i = this.b("renderAllFaces", true, Boolean.TYPE);
    public final bP k = this.a("renderBlockByRenderType", true, Boolean.TYPE, A5.F, Integer.TYPE, Integer.TYPE, Integer.TYPE);
    public final bP j = this.a("renderStandardBlock", true, Boolean.TYPE, A5.F, Integer.TYPE, Integer.TYPE, Integer.TYPE);
    public final bP f = this.a("renderStandardBlockWithColorMultiplier", true, Boolean.TYPE, A5.F, Integer.TYPE, Integer.TYPE, Integer.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
    public final bP e = this.a("renderFaceXNeg", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bP l = this.a("renderFaceXPos", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bP g = this.a("renderFaceYNeg", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bP h = this.a("renderFaceYPos", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bP d = this.a("renderFaceZNeg", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);
    public final bP a = this.a("renderFaceZPos", true, Void.TYPE, A5.F, Double.TYPE, Double.TYPE, Double.TYPE, A5.dz);

    public hD() {
        super(A5.t);
    }

    public boolean a(Object object, Object object2, int n6, int n10, int n11, float f10, float f11, float f12) {
        return this.f.h(object, object2, n6, n10, n11, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12));
    }

    public void a(Object object, boolean bl) {
        this.i.a(object, bl);
    }
}

