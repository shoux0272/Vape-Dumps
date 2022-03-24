/*
 * Decompiled with CFR 0.150.
 */
package manthe;

import java.nio.IntBuffer;
import manthe.cy;
import manthe.eO;
import manthe.i7;

public class e4
extends cy {
    public e4(Object object) {
        super(object);
    }

    public void a(int n6, eO eO2) {
        i7.a(e4.a.M().ak, this.b, n6, eO2.a());
    }

    public e4 a(double d10, double d11, double d12) {
        i7.a(e4.a.M().ak, this.b, d10, d11, d12);
        return this;
    }

    public e4 a(float f10, float f11, float f12, float f13) {
        i7.a(e4.a.M().ak, this.b, f10, f11, f12, f13);
        return this;
    }

    public void f() {
        i7.b(e4.a.M().ak, this.b);
    }

    public int b(int n6) {
        return i7.a(e4.a.M().ak, this.b, n6);
    }

    public IntBuffer g() {
        return (IntBuffer)i7.a(e4.a.M().ak, this.b);
    }

    public void a(float f10, float f11, float f12, int n6) {
        i7.a(e4.a.M().ak, this.b, f10, f11, f12, n6);
    }

    public void a(int n6) {
        i7.b(e4.a.M().ak, this.b, n6);
    }
}

