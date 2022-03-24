/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.util.List;
import javassist.bytecode.CodeAttribute$RuntimeCopyException;
import manthe.A5;
import manthe.BG;
import manthe.V;
import manthe.bP;
import manthe.cy;
import manthe.g1;
import manthe.gJ;

public class kI
extends gJ {
    private final bP g;
    private final bP d;
    private final bP o;
    private final BG r = this.b("loadedEntityList", true, List.class);
    private final BG z = this.b("playerEntities", true, List.class);
    private final BG B = this.b("loadedTileEntityList", true, List.class);
    private final BG A = this.b("provider", true, A5.c1);
    private final BG x = this.b("isRemote", true, Boolean.TYPE);
    private final bP l;
    private final bP e;
    private final bP v;
    private final bP a;
    private final bP t;
    private final bP f;
    private final bP m;
    private final bP i;
    private bP j;
    public bP u;
    public bP q;
    public bP h;
    public bP s;
    private bP w;
    private bP k;
    private bP n;
    private bP p;
    private static boolean y;

    public kI() {
        super(A5.r);
        this.g = this.a("getEntitiesWithinAABBExcludingEntity", true, List.class, A5.ba, A5.b4);
        this.o = this.a("func_147470_e", cy.c, Boolean.TYPE, A5.b4);
        this.l = this.a("removeEntity", true, Void.TYPE, A5.ba);
        this.a = this.a("getChunkFromChunkCoords", true, A5.dF, Integer.TYPE, Integer.TYPE);
        this.f = this.a("getChunkProvider", true, A5.at, new Class[0]);
        this.u = this.a("getEntityByID", true, A5.ba, Integer.TYPE);
        this.q = this.a("onEntityAdded", true, Void.TYPE, A5.ba);
        this.h = this.a("playSoundToNearExcept", true, Void.TYPE, A5.cc, String.class, Float.TYPE, Float.TYPE);
        this.i = this.a("markBlockRangeForRenderUpdate", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        if (V.c() == 13) {
            this.t = this.a("getChunkFromBlockCoords", true, A5.dF, Integer.TYPE, Integer.TYPE);
            this.v = this.a("checkChunksExist", true, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.w = this.a("getBlock", true, A5.F, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.e = this.a("func_147447_a", false, A5.cH, A5.aW, A5.aW, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
            this.p = this.a("getBlockMetadata", true, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.m = this.a("blockExists", true, Boolean.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
            this.s = this.a("updateLightByType", true, Boolean.TYPE, A5.bC, Integer.TYPE, Integer.TYPE, Integer.TYPE);
        } else {
            this.j = this.a("isBlockLoaded", true, Boolean.TYPE, A5.ao);
            this.t = this.a("getChunkFromBlockCoords", true, A5.dF, A5.ao);
            this.v = this.a("func_175707_a", cy.c, Boolean.TYPE, A5.ao, A5.ao);
            this.k = this.a("getBlockState", true, A5.aA, A5.ao);
            this.n = this.a("isFlammableWithin", true, Boolean.TYPE, A5.b4);
            this.e = this.a("rayTraceBlocks", true, A5.cH, A5.aW, A5.aW, Boolean.TYPE, Boolean.TYPE, Boolean.TYPE);
            this.m = this.a("isValid", true, Boolean.TYPE, A5.ao);
            this.s = this.a("checkLightFor", true, Boolean.TYPE, A5.bC, A5.ao);
        }
        this.d = V.c() >= 23 ? this.a("getCollisionBoxes", true, List.class, A5.ba, A5.b4) : this.a("getCollidingBoundingBoxes", true, List.class, A5.ba, A5.b4);
    }

    public Object c(Object object, Object object2) {
        return this.t.e(object, object2);
    }

    public Object b(Object object, int n6, int n10) {
        return this.t.e(object, n6, n10);
    }

    public boolean e(Object object, Object object2) {
        return this.j.h(object, object2);
    }

    public Object e(Object object) {
        return this.f.e(object, new Object[0]);
    }

    public Object a(Object object, Object object2, Object object3, boolean bl, boolean bl2, boolean bl3) {
        return this.e.e(object, object2, object3, bl, bl2, bl3);
    }

    public List b(Object object) {
        return (List)this.r.f(object);
    }

    public List c(Object object) {
        return (List)this.z.f(object);
    }

    public List d(Object object) {
        return (List)this.B.f(object);
    }

    public List a(Object object, Object object2, Object object3) {
        return (List)this.g.e(object, object2, object3);
    }

    public Object c(Object object, int n6, int n10, int n11) {
        return this.w.e(object, n6, n10, n11);
    }

    public Object a(Object object, Object object2) {
        return this.k.e(object, object2);
    }

    public List c(Object object, Object object2, Object object3) {
        return (List)this.d.e(object, object2, object3);
    }

    private boolean b(Object object, Object object2) {
        return this.o.h(object, object2);
    }

    private boolean f(Object object, Object object2) {
        return this.n.h(object, object2);
    }

    private void d(Object object, Object object2) {
        this.l.p(object, object2);
    }

    private Object a(Object object) {
        return this.A.f(object);
    }

    private boolean b(Object object, int n6, int n10, int n11, int n12, int n13, int n14) {
        return this.v.h(object, n6, n10, n11, n12, n13, n14);
    }

    private boolean b(Object object, Object object2, Object object3) {
        return this.v.h(object, object2, object3);
    }

    private Object a(Object object, int n6, int n10) {
        return this.a.e(object, n6, n10);
    }

    private int a(Object object, int n6, int n10, int n11) {
        return this.p.o(object, n6, n10, n11);
    }

    private boolean b(Object object, int n6, int n10, int n11) {
        if (V.c() == 13) {
            return this.m.h(object, n6, n10, n11);
        }
        return this.m.h(object, g1.a(n6, n10, n11).a());
    }

    private Object a(Object object, int n6) {
        return this.u.e(object, n6);
    }

    private boolean f(Object object) {
        return this.x.d(object);
    }

    private void a(Object object, int n6, int n10, int n11, int n12, int n13, int n14) {
        this.i.p(object, n6, n10, n11, n12, n13, n14);
    }

    static boolean b(kI kI2, Object object, Object object2) {
        return kI2.b(object, object2);
    }

    static boolean a(kI kI2, Object object, Object object2) {
        return kI2.f(object, object2);
    }

    static void c(kI kI2, Object object, Object object2) {
        kI2.d(object, object2);
    }

    static Object a(kI kI2, Object object) {
        return kI2.a(object);
    }

    static boolean a(kI kI2, Object object, int n6, int n10, int n11, int n12, int n13, int n14) {
        return kI2.b(object, n6, n10, n11, n12, n13, n14);
    }

    static boolean a(kI kI2, Object object, Object object2, Object object3) {
        return kI2.b(object, object2, object3);
    }

    static Object a(kI kI2, Object object, int n6, int n10) {
        return kI2.a(object, n6, n10);
    }

    static int a(kI kI2, Object object, int n6, int n10, int n11) {
        return kI2.a(object, n6, n10, n11);
    }

    static boolean b(kI kI2, Object object, int n6, int n10, int n11) {
        return kI2.b(object, n6, n10, n11);
    }

    static Object a(kI kI2, Object object, int n6) {
        return kI2.a(object, n6);
    }

    static boolean b(kI kI2, Object object) {
        return kI2.f(object);
    }

    static void b(kI kI2, Object object, int n6, int n10, int n11, int n12, int n13, int n14) {
        kI2.a(object, n6, n10, n11, n12, n13, n14);
    }

    public static void b(boolean bl) {
        y = bl;
    }

    public static boolean d() {
        return y;
    }

    public static boolean e() {
        boolean bl = kI.d();
        return !bl;
    }

    private static CodeAttribute$RuntimeCopyException a(CodeAttribute$RuntimeCopyException codeAttribute$RuntimeCopyException) {
        return codeAttribute$RuntimeCopyException;
    }

    static {
        if (kI.e()) {
            kI.b(true);
        }
    }
}

