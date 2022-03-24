/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import manthe.cy;
import manthe.oC;

public class gK
extends cy {
    public gK(Object object) {
        super(object);
    }

    public static gK b(double d10, double d11, double d12) {
        return new gK(gK.a.M().a_.a(d10, d11, d12));
    }

    public gK a(double d10) {
        return gK.b(this.g() * d10, this.h() * d10, this.f() * d10);
    }

    public gK c(gK gK2) {
        return this.a(gK2.g(), gK2.h(), gK2.f());
    }

    public gK a(double d10, double d11, double d12) {
        return new gK(gK.a.M().a_.a(this.b, d10, d11, d12));
    }

    public double g() {
        return gK.a.M().a_.c(this.b);
    }

    public double h() {
        return gK.a.M().a_.a(this.b);
    }

    public double f() {
        return gK.a.M().a_.b(this.b);
    }

    public double a(gK gK2) {
        return gK.a.M().a_.a(this.b, gK2.a());
    }

    public double b(gK gK2) {
        return gK.a.M().a_.b(this.b, gK2.a());
    }

    @Override
    public String toString() {
        return "[" + this.g() + "," + this.h() + "," + this.f() + "]";
    }

    public oC i() {
        return new oC(this.g(), this.h(), this.f());
    }
}

