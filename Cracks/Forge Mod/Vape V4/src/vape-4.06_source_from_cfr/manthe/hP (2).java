/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.A5;
import manthe.BG;
import manthe.bP;
import manthe.cM;
import manthe.cy;
import manthe.gJ;

public class hP
extends gJ {
    private final BG n = this.a("textureState", true, cM.b(A5.Z));
    private final BG i = this.a("activeTextureUnit", true, Integer.TYPE);
    private final BG h = this.a("blendState", true, A5.aM);
    public bP p = this.b("bindTexture", true, Void.TYPE, Integer.TYPE);
    private final bP s = this.b("disableAlpha", true, Void.TYPE, new Class[0]);
    private final bP t = this.b("enableLighting", true, Void.TYPE, new Class[0]);
    private final bP f = this.b("disableLighting", true, Void.TYPE, new Class[0]);
    private final bP j = this.b("depthMask", true, Void.TYPE, Boolean.TYPE);
    private final bP m = this.b("disableDepth", true, Void.TYPE, new Class[0]);
    private final bP q = this.b("enableBlend", true, Void.TYPE, new Class[0]);
    private final bP k = this.b("tryBlendFuncSeparate", true, Void.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE);
    private final bP g = this.b("enableTexture2D", true, Void.TYPE, new Class[0]);
    private final bP l;
    private final bP u;
    private final bP o;
    private final bP e = this.b("disableTexture2D", true, Void.TYPE, new Class[0]);
    private final bP a;
    private final bP r;
    private final bP v;
    private final bP d;

    public hP() {
        super(A5.dd);
        this.l = this.b("enableDepth", true, Void.TYPE, new Class[0]);
        this.u = this.b("disableBlend", true, Void.TYPE, new Class[0]);
        this.o = this.b("func_179131_c", cy.c, Void.TYPE, Float.TYPE, Float.TYPE, Float.TYPE, Float.TYPE);
        this.a = this.b("enableAlpha", true, Void.TYPE, new Class[0]);
        this.r = this.b("setActiveTexture", true, Void.TYPE, Integer.TYPE);
        this.v = this.b("enableCull", true, Void.TYPE, new Class[0]);
        this.d = this.b("disableCull", true, Void.TYPE, new Class[0]);
    }

    private void c(int n6) {
        this.r.p(null, n6);
    }

    private void d() {
        this.a.p(null, new Object[0]);
    }

    private void a(int n6) {
        this.p.p(null, n6);
    }

    private void r() {
        this.s.p(null, new Object[0]);
    }

    private void l() {
        this.t.p(null, new Object[0]);
    }

    private void g() {
        this.f.p(null, new Object[0]);
    }

    private void a(boolean bl) {
        this.j.p(null, bl);
    }

    private void f() {
        this.m.p(null, new Object[0]);
    }

    private void k() {
        this.q.p(null, new Object[0]);
    }

    private void a(int n6, int n10, int n11, int n12) {
        this.k.p(null, n6, n10, n11, n12);
    }

    private void j() {
        this.g.p(null, new Object[0]);
    }

    private void h() {
        this.e.p(null, new Object[0]);
    }

    private void n() {
        this.l.p(null, new Object[0]);
    }

    private void i() {
        this.u.p(null, new Object[0]);
    }

    private void a(float f10, float f11, float f12, float f13) {
        this.o.p(null, Float.valueOf(f10), Float.valueOf(f11), Float.valueOf(f12), Float.valueOf(f13));
    }

    private void q() {
        this.v.p(null, new Object[0]);
    }

    private void o() {
        this.d.p(null, new Object[0]);
    }

    private Object[] m() {
        return this.n.e(null);
    }

    private int e() {
        return this.i.c(null);
    }

    private Object p() {
        return this.h.f(null);
    }

    static int c(hP hP2) {
        return hP2.e();
    }

    static void m(hP hP2) {
        hP2.r();
    }

    static void b(hP hP2) {
        hP2.l();
    }

    static void j(hP hP2) {
        hP2.g();
    }

    static void a(hP hP2, boolean bl) {
        hP2.a(bl);
    }

    static void e(hP hP2) {
        hP2.n();
    }

    static void f(hP hP2) {
        hP2.f();
    }

    static void a(hP hP2, int n6, int n10, int n11, int n12) {
        hP2.a(n6, n10, n11, n12);
    }

    static void h(hP hP2) {
        hP2.j();
    }

    static void g(hP hP2) {
        hP2.h();
    }

    static void a(hP hP2, float f10, float f11, float f12, float f13) {
        hP2.a(f10, f11, f12, f13);
    }

    static void a(hP hP2) {
        hP2.d();
    }

    static void a(hP hP2, int n6) {
        hP2.c(n6);
    }

    static void l(hP hP2) {
        hP2.q();
    }

    static void i(hP hP2) {
        hP2.o();
    }

    static Object[] k(hP hP2) {
        return hP2.m();
    }

    static Object d(hP hP2) {
        return hP2.p();
    }
}

